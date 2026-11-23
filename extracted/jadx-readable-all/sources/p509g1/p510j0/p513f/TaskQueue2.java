package p509g1.p510j0.p513f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util9;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: g1.j0.f.c, reason: use source file name */
/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TaskQueue2 {

    /* JADX INFO: renamed from: a */
    public boolean f30163a;

    /* JADX INFO: renamed from: b */
    public Task2 f30164b;

    /* JADX INFO: renamed from: c */
    public final List<Task2> f30165c;

    /* JADX INFO: renamed from: d */
    public boolean f30166d;

    /* JADX INFO: renamed from: e */
    public final TaskRunner f30167e;

    /* JADX INFO: renamed from: f */
    public final String f30168f;

    public TaskQueue2(TaskRunner taskRunner, String str) {
        Intrinsics2.m13090f(taskRunner, "taskRunner");
        Intrinsics2.m13090f(str, "name");
        this.f30167e = taskRunner;
        this.f30168f = str;
        this.f30165c = new ArrayList();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m13416d(TaskQueue2 taskQueue2, Task2 task2, long j2, int i) {
        if ((i & 2) != 0) {
            j2 = 0;
        }
        taskQueue2.m13419c(task2, j2);
    }

    /* JADX INFO: renamed from: a */
    public final void m13417a() {
        byte[] bArr = Util9.f30070a;
        synchronized (this.f30167e) {
            if (m13418b()) {
                this.f30167e.m13426e(this);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m13418b() {
        Task2 task2 = this.f30164b;
        if (task2 != null) {
            if (task2 == null) {
                Intrinsics2.m13095k();
                throw null;
            }
            if (task2.f30161d) {
                this.f30166d = true;
            }
        }
        boolean z = false;
        for (int size = this.f30165c.size() - 1; size >= 0; size--) {
            if (this.f30165c.get(size).f30161d) {
                Task2 task3 = this.f30165c.get(size);
                Objects.requireNonNull(TaskRunner.f30171c);
                if (TaskRunner.f30170b.isLoggable(Level.FINE)) {
                    SkuDao.a.m14075a(task3, this, "canceled");
                }
                this.f30165c.remove(size);
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: c */
    public final void m13419c(Task2 task2, long j2) {
        Intrinsics2.m13090f(task2, "task");
        synchronized (this.f30167e) {
            if (!this.f30163a) {
                if (m13420e(task2, j2, false)) {
                    this.f30167e.m13426e(this);
                }
            } else if (task2.f30161d) {
                Objects.requireNonNull(TaskRunner.f30171c);
                if (TaskRunner.f30170b.isLoggable(Level.FINE)) {
                    SkuDao.a.m14075a(task2, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Objects.requireNonNull(TaskRunner.f30171c);
                if (TaskRunner.f30170b.isLoggable(Level.FINE)) {
                    SkuDao.a.m14075a(task2, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m13420e(Task2 task2, long j2, boolean z) {
        String string;
        Intrinsics2.m13090f(task2, "task");
        Intrinsics2.m13090f(this, "queue");
        TaskQueue2 taskQueue2 = task2.f30158a;
        if (taskQueue2 != this) {
            if (!(taskQueue2 == null)) {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
            task2.f30158a = this;
        }
        long jMo13429b = this.f30167e.f30178j.mo13429b();
        long j3 = jMo13429b + j2;
        int iIndexOf = this.f30165c.indexOf(task2);
        if (iIndexOf != -1) {
            if (task2.f30159b <= j3) {
                Objects.requireNonNull(TaskRunner.f30171c);
                if (TaskRunner.f30170b.isLoggable(Level.FINE)) {
                    SkuDao.a.m14075a(task2, this, "already scheduled");
                }
                return false;
            }
            this.f30165c.remove(iIndexOf);
        }
        task2.f30159b = j3;
        Objects.requireNonNull(TaskRunner.f30171c);
        if (TaskRunner.f30170b.isLoggable(Level.FINE)) {
            if (z) {
                StringBuilder sbM1556G = outline.m1556G("run again after ");
                sbM1556G.append(SkuDao.a.m14102o(j3 - jMo13429b));
                string = sbM1556G.toString();
            } else {
                StringBuilder sbM1556G2 = outline.m1556G("scheduled after ");
                sbM1556G2.append(SkuDao.a.m14102o(j3 - jMo13429b));
                string = sbM1556G2.toString();
            }
            SkuDao.a.m14075a(task2, this, string);
        }
        Iterator<Task2> it = this.f30165c.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().f30159b - jMo13429b > j2) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.f30165c.size();
        }
        this.f30165c.add(size, task2);
        return size == 0;
    }

    /* JADX INFO: renamed from: f */
    public final void m13421f() {
        byte[] bArr = Util9.f30070a;
        synchronized (this.f30167e) {
            this.f30163a = true;
            if (m13418b()) {
                this.f30167e.m13426e(this);
            }
        }
    }

    public String toString() {
        return this.f30168f;
    }
}
