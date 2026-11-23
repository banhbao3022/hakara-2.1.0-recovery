package p500e1.p501a.p504d2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: e1.a.d2.m, reason: use source file name */
/* JADX INFO: compiled from: WorkQueue.kt */
/* JADX INFO: loaded from: classes.dex */
public final class WorkQueue {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f29732a = AtomicReferenceFieldUpdater.newUpdater(WorkQueue.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29733b = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "producerIndex");

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29734c = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "consumerIndex");

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29735d = AtomicIntegerFieldUpdater.newUpdater(WorkQueue.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceArray<Tasks5> f29736e = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    /* JADX INFO: renamed from: a */
    public final Tasks5 m13202a(Tasks5 tasks5, boolean z) {
        if (z) {
            return m13203b(tasks5);
        }
        Tasks5 tasks6 = (Tasks5) f29732a.getAndSet(this, tasks5);
        if (tasks6 != null) {
            return m13203b(tasks6);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Tasks5 m13203b(Tasks5 tasks5) {
        if (tasks5.f29725g.mo13200R() == 1) {
            f29735d.incrementAndGet(this);
        }
        if (m13204c() == 127) {
            return tasks5;
        }
        int i = this.producerIndex & 127;
        while (this.f29736e.get(i) != null) {
            Thread.yield();
        }
        this.f29736e.lazySet(i, tasks5);
        f29733b.incrementAndGet(this);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m13204c() {
        return this.producerIndex - this.consumerIndex;
    }

    /* JADX INFO: renamed from: d */
    public final int m13205d() {
        return this.lastScheduledTask != null ? m13204c() + 1 : m13204c();
    }

    /* JADX INFO: renamed from: e */
    public final Tasks5 m13206e() {
        Tasks5 tasks5 = (Tasks5) f29732a.getAndSet(this, null);
        return tasks5 != null ? tasks5 : m13207f();
    }

    /* JADX INFO: renamed from: f */
    public final Tasks5 m13207f() {
        Tasks5 andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f29734c.compareAndSet(this, i, i + 1) && (andSet = this.f29736e.getAndSet(i2, null)) != null) {
                if (andSet.f29725g.mo13200R() == 1) {
                    f29735d.decrementAndGet(this);
                }
                return andSet;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final long m13208g(WorkQueue workQueue) {
        int i = workQueue.consumerIndex;
        int i2 = workQueue.producerIndex;
        AtomicReferenceArray<Tasks5> atomicReferenceArray = workQueue.f29736e;
        while (true) {
            if (i == i2) {
                break;
            }
            int i3 = i & 127;
            if (workQueue.blockingTasksInBuffer == 0) {
                break;
            }
            Tasks5 tasks5 = atomicReferenceArray.get(i3);
            if (tasks5 != null) {
                if ((tasks5.f29725g.mo13200R() == 1) && atomicReferenceArray.compareAndSet(i3, tasks5, null)) {
                    f29735d.decrementAndGet(workQueue);
                    m13202a(tasks5, false);
                    return -1L;
                }
            }
            i++;
        }
        return m13209h(workQueue, true);
    }

    /* JADX INFO: renamed from: h */
    public final long m13209h(WorkQueue workQueue, boolean z) {
        Tasks5 tasks5;
        do {
            tasks5 = (Tasks5) workQueue.lastScheduledTask;
            if (tasks5 == null) {
                return -2L;
            }
            if (z) {
                if (!(tasks5.f29725g.mo13200R() == 1)) {
                    return -2L;
                }
            }
            long jMo13201a = Tasks8.f29731e.mo13201a() - tasks5.f29724f;
            long j2 = Tasks8.f29727a;
            if (jMo13201a < j2) {
                return j2 - jMo13201a;
            }
        } while (!f29732a.compareAndSet(workQueue, tasks5, null));
        m13202a(tasks5, false);
        return -1L;
    }
}
