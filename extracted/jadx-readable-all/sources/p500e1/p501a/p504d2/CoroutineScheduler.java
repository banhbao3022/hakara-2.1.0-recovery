package p500e1.p501a.p504d2;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import p007c.p071d.p078c.p079a.outline;
import p007c.p451o.p452a.C5729a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p498z.Random;
import p500e1.p501a.p503c2.Symbol;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: e1.a.d2.a, reason: use source file name */
/* JADX INFO: compiled from: CoroutineScheduler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutineScheduler implements Executor, Closeable {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f29690f;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ AtomicLongFieldUpdater f29691g;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f29692h;

    /* JADX INFO: renamed from: i */
    public static final Symbol f29693i;
    private volatile /* synthetic */ int _isTerminated;
    public volatile /* synthetic */ long controlState;

    /* JADX INFO: renamed from: j */
    public final Tasks f29694j;

    /* JADX INFO: renamed from: k */
    public final Tasks f29695k;

    /* JADX INFO: renamed from: l */
    public final AtomicReferenceArray<b> f29696l;

    /* JADX INFO: renamed from: m */
    public final int f29697m;

    /* JADX INFO: renamed from: n */
    public final int f29698n;

    /* JADX INFO: renamed from: o */
    public final long f29699o;

    /* JADX INFO: renamed from: p */
    public final String f29700p;
    private volatile /* synthetic */ long parkedWorkersStack;

    /* JADX INFO: renamed from: e1.a.d2.a$a */
    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: e1.a.d2.a$b */
    /* JADX INFO: compiled from: CoroutineScheduler.kt */
    public final class b extends Thread {

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f29701f = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl");

        /* JADX INFO: renamed from: g */
        public final WorkQueue f29702g;

        /* JADX INFO: renamed from: h */
        public int f29703h;

        /* JADX INFO: renamed from: i */
        public long f29704i;
        private volatile int indexInArray;

        /* JADX INFO: renamed from: j */
        public long f29705j;

        /* JADX INFO: renamed from: k */
        public int f29706k;

        /* JADX INFO: renamed from: l */
        public boolean f29707l;
        private volatile Object nextParkedWorker;
        public volatile /* synthetic */ int workerCtl;

        public b(int i) {
            setDaemon(true);
            this.f29702g = new WorkQueue();
            this.f29703h = 4;
            this.workerCtl = 0;
            this.nextParkedWorker = CoroutineScheduler.f29693i;
            this.f29706k = Random.f29609b.mo13104b();
            m13194f(i);
        }

        /* JADX INFO: renamed from: a */
        public final Tasks5 m13189a(boolean z) {
            boolean z2;
            Tasks5 tasks5M13153d;
            Tasks5 tasks5M13193e;
            Tasks5 tasks5M13193e2;
            boolean z3;
            if (this.f29703h == 1) {
                z2 = true;
            } else {
                CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
                while (true) {
                    long j2 = coroutineScheduler.controlState;
                    if (((int) ((9223367638808264704L & j2) >> 42)) == 0) {
                        z3 = false;
                        break;
                    }
                    if (CoroutineScheduler.f29691g.compareAndSet(coroutineScheduler, j2, j2 - 4398046511104L)) {
                        z3 = true;
                        break;
                    }
                }
                if (z3) {
                    this.f29703h = 1;
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (!z2) {
                if (!z || (tasks5M13153d = this.f29702g.m13206e()) == null) {
                    tasks5M13153d = CoroutineScheduler.this.f29695k.m13153d();
                }
                return tasks5M13153d != null ? tasks5M13153d : m13197i(true);
            }
            if (z) {
                boolean z4 = m13192d(CoroutineScheduler.this.f29697m * 2) == 0;
                if (z4 && (tasks5M13193e2 = m13193e()) != null) {
                    return tasks5M13193e2;
                }
                Tasks5 tasks5M13206e = this.f29702g.m13206e();
                if (tasks5M13206e != null) {
                    return tasks5M13206e;
                }
                if (!z4 && (tasks5M13193e = m13193e()) != null) {
                    return tasks5M13193e;
                }
            } else {
                Tasks5 tasks5M13193e3 = m13193e();
                if (tasks5M13193e3 != null) {
                    return tasks5M13193e3;
                }
            }
            return m13197i(false);
        }

        /* JADX INFO: renamed from: b */
        public final int m13190b() {
            return this.indexInArray;
        }

        /* JADX INFO: renamed from: c */
        public final Object m13191c() {
            return this.nextParkedWorker;
        }

        /* JADX INFO: renamed from: d */
        public final int m13192d(int i) {
            int i2 = this.f29706k;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f29706k = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        /* JADX INFO: renamed from: e */
        public final Tasks5 m13193e() {
            if (m13192d(2) == 0) {
                Tasks5 tasks5M13153d = CoroutineScheduler.this.f29694j.m13153d();
                return tasks5M13153d != null ? tasks5M13153d : CoroutineScheduler.this.f29695k.m13153d();
            }
            Tasks5 tasks5M13153d2 = CoroutineScheduler.this.f29695k.m13153d();
            return tasks5M13153d2 != null ? tasks5M13153d2 : CoroutineScheduler.this.f29694j.m13153d();
        }

        /* JADX INFO: renamed from: f */
        public final void m13194f(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.f29700p);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* JADX INFO: renamed from: g */
        public final void m13195g(Object obj) {
            this.nextParkedWorker = obj;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m13196h(int i) {
            int i2 = this.f29703h;
            boolean z = i2 == 1;
            if (z) {
                CoroutineScheduler.f29691g.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (i2 != i) {
                this.f29703h = i;
            }
            return z;
        }

        /* JADX INFO: renamed from: i */
        public final Tasks5 m13197i(boolean z) {
            long jM13209h;
            long jM13208g;
            int i = (int) (CoroutineScheduler.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int iM13192d = m13192d(i);
            long jMin = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                iM13192d++;
                if (iM13192d > i) {
                    iM13192d = 1;
                }
                b bVar = CoroutineScheduler.this.f29696l.get(iM13192d);
                if (bVar != null && bVar != this) {
                    if (z) {
                        jM13208g = this.f29702g.m13208g(bVar.f29702g);
                    } else {
                        WorkQueue workQueue = this.f29702g;
                        WorkQueue workQueue2 = bVar.f29702g;
                        Objects.requireNonNull(workQueue);
                        Tasks5 tasks5M13207f = workQueue2.m13207f();
                        if (tasks5M13207f != null) {
                            workQueue.m13202a(tasks5M13207f, false);
                            jM13209h = -1;
                        } else {
                            jM13209h = workQueue.m13209h(workQueue2, false);
                        }
                        jM13208g = jM13209h;
                    }
                    if (jM13208g == -1) {
                        return this.f29702g.m13206e();
                    }
                    if (jM13208g > 0) {
                        jMin = Math.min(jMin, jM13208g);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f29705j = jMin;
            return null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            loop0: while (true) {
                boolean z = false;
                while (true) {
                    if (CoroutineScheduler.this.isTerminated() || this.f29703h == 5) {
                        break loop0;
                    }
                    Tasks5 tasks5M13189a = m13189a(this.f29707l);
                    if (tasks5M13189a != null) {
                        this.f29705j = 0L;
                        int iMo13200R = tasks5M13189a.f29725g.mo13200R();
                        this.f29704i = 0L;
                        if (this.f29703h == 3) {
                            this.f29703h = 2;
                        }
                        if (iMo13200R != 0 && m13196h(2)) {
                            CoroutineScheduler.this.m13181O();
                        }
                        CoroutineScheduler.this.m13180H(tasks5M13189a);
                        if (iMo13200R != 0) {
                            CoroutineScheduler.f29691g.addAndGet(CoroutineScheduler.this, -2097152L);
                            if (this.f29703h == 5) {
                                break;
                            }
                            this.f29703h = 4;
                            break;
                        }
                        break;
                    }
                    this.f29707l = false;
                    if (this.f29705j == 0) {
                        if (this.nextParkedWorker != CoroutineScheduler.f29693i) {
                            this.workerCtl = -1;
                            while (true) {
                                if (!(this.nextParkedWorker != CoroutineScheduler.f29693i) || this.workerCtl != -1 || CoroutineScheduler.this.isTerminated() || this.f29703h == 5) {
                                    break;
                                }
                                m13196h(3);
                                Thread.interrupted();
                                if (this.f29704i == 0) {
                                    this.f29704i = System.nanoTime() + CoroutineScheduler.this.f29699o;
                                }
                                LockSupport.parkNanos(CoroutineScheduler.this.f29699o);
                                if (System.nanoTime() - this.f29704i >= 0) {
                                    this.f29704i = 0L;
                                    synchronized (CoroutineScheduler.this.f29696l) {
                                        if (!CoroutineScheduler.this.isTerminated()) {
                                            if (((int) (CoroutineScheduler.this.controlState & 2097151)) > CoroutineScheduler.this.f29697m) {
                                                if (f29701f.compareAndSet(this, -1, 1)) {
                                                    int i = this.indexInArray;
                                                    m13194f(0);
                                                    CoroutineScheduler.this.m13179D(this, i, 0);
                                                    int andDecrement = (int) (CoroutineScheduler.f29691g.getAndDecrement(CoroutineScheduler.this) & 2097151);
                                                    if (andDecrement != i) {
                                                        b bVar = CoroutineScheduler.this.f29696l.get(andDecrement);
                                                        Intrinsics2.m13087c(bVar);
                                                        b bVar2 = bVar;
                                                        CoroutineScheduler.this.f29696l.set(i, bVar2);
                                                        bVar2.m13194f(i);
                                                        CoroutineScheduler.this.m13179D(bVar2, andDecrement, i);
                                                    }
                                                    CoroutineScheduler.this.f29696l.set(andDecrement, null);
                                                    this.f29703h = 5;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            CoroutineScheduler.this.m13178B(this);
                        }
                    } else {
                        if (z) {
                            m13196h(3);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f29705j);
                            this.f29705j = 0L;
                            break;
                        }
                        z = true;
                    }
                }
            }
            m13196h(5);
        }
    }

    static {
        new a(null);
        f29693i = new Symbol("NOT_IN_STACK");
        f29690f = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "parkedWorkersStack");
        f29691g = AtomicLongFieldUpdater.newUpdater(CoroutineScheduler.class, "controlState");
        f29692h = AtomicIntegerFieldUpdater.newUpdater(CoroutineScheduler.class, "_isTerminated");
    }

    public CoroutineScheduler(int i, int i2, long j2, String str) {
        this.f29697m = i;
        this.f29698n = i2;
        this.f29699o = j2;
        this.f29700p = str;
        if (!(i >= 1)) {
            throw new IllegalArgumentException(outline.m1592n("Core pool size ", i, " should be at least 1").toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (!(i2 <= 2097150)) {
            throw new IllegalArgumentException(outline.m1592n("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(j2 > 0)) {
            throw new IllegalArgumentException(outline.m1595q("Idle worker keep alive time ", j2, " must be positive").toString());
        }
        this.f29694j = new Tasks();
        this.f29695k = new Tasks();
        this.parkedWorkersStack = 0L;
        this.f29696l = new AtomicReferenceArray<>(i2 + 1);
        this.controlState = ((long) i) << 42;
        this._isTerminated = 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m13178B(b bVar) {
        long j2;
        int iM13190b;
        if (bVar.m13191c() != f29693i) {
            return false;
        }
        do {
            j2 = this.parkedWorkersStack;
            iM13190b = bVar.m13190b();
            bVar.m13195g(this.f29696l.get((int) (2097151 & j2)));
        } while (!f29690f.compareAndSet(this, j2, ((2097152 + j2) & (-2097152)) | ((long) iM13190b)));
        return true;
    }

    /* JADX INFO: renamed from: D */
    public final void m13179D(b bVar, int i, int i2) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int iM13188u = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (iM13188u == i) {
                iM13188u = i2 == 0 ? m13188u(bVar) : i2;
            }
            if (iM13188u >= 0 && f29690f.compareAndSet(this, j2, j3 | ((long) iM13188u))) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m13180H(Tasks5 tasks5) {
        try {
            tasks5.run();
        } catch (Throwable th) {
            Thread threadCurrentThread = Thread.currentThread();
            threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m13181O() {
        if (m13184b0() || m13182R(this.controlState)) {
            return;
        }
        m13184b0();
    }

    /* JADX INFO: renamed from: R */
    public final boolean m13182R(long j2) {
        int i = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        if (i < this.f29697m) {
            int iM13183a = m13183a();
            if (iM13183a == 1 && this.f29697m > 1) {
                m13183a();
            }
            if (iM13183a > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final int m13183a() {
        synchronized (this.f29696l) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j2 = this.controlState;
            int i = (int) (j2 & 2097151);
            int i2 = i - ((int) ((j2 & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.f29697m) {
                return 0;
            }
            if (i >= this.f29698n) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (!(i3 > 0 && this.f29696l.get(i3) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            b bVar = new b(i3);
            this.f29696l.set(i3, bVar);
            if (!(i3 == ((int) (2097151 & f29691g.incrementAndGet(this))))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            bVar.start();
            return i2 + 1;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m13184b0() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            b bVar = this.f29696l.get((int) (2097151 & j2));
            if (bVar != null) {
                long j3 = (2097152 + j2) & (-2097152);
                int iM13188u = m13188u(bVar);
                if (iM13188u >= 0 && f29690f.compareAndSet(this, j2, ((long) iM13188u) | j3)) {
                    bVar.m13195g(f29693i);
                }
            } else {
                bVar = null;
            }
            if (bVar == null) {
                return false;
            }
            if (b.f29701f.compareAndSet(bVar, -1, 0)) {
                LockSupport.unpark(bVar);
                return true;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final Tasks5 m13185c(Runnable runnable, Tasks6 tasks6) {
        long jMo13201a = Tasks8.f29731e.mo13201a();
        if (!(runnable instanceof Tasks5)) {
            return new Tasks7(runnable, jMo13201a, tasks6);
        }
        Tasks5 tasks5 = (Tasks5) runnable;
        tasks5.f29724f = jMo13201a;
        tasks5.f29725g = tasks6;
        return tasks5;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        int i;
        Tasks5 tasks5M13153d;
        boolean z;
        if (f29692h.compareAndSet(this, 0, 1)) {
            b bVarM13186f = m13186f();
            synchronized (this.f29696l) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    b bVar = this.f29696l.get(i2);
                    Intrinsics2.m13087c(bVar);
                    b bVar2 = bVar;
                    if (bVar2 != bVarM13186f) {
                        while (bVar2.isAlive()) {
                            LockSupport.unpark(bVar2);
                            bVar2.join(10000L);
                        }
                        WorkQueue workQueue = bVar2.f29702g;
                        Tasks tasks = this.f29695k;
                        Objects.requireNonNull(workQueue);
                        Tasks5 tasks5 = (Tasks5) WorkQueue.f29732a.getAndSet(workQueue, null);
                        if (tasks5 != null) {
                            tasks.m13150a(tasks5);
                        }
                        do {
                            Tasks5 tasks5M13207f = workQueue.m13207f();
                            if (tasks5M13207f != null) {
                                tasks.m13150a(tasks5M13207f);
                                z = true;
                            } else {
                                z = false;
                            }
                        } while (z);
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f29695k.m13151b();
            this.f29694j.m13151b();
            while (true) {
                if (bVarM13186f == null) {
                    tasks5M13153d = this.f29694j.m13153d();
                } else {
                    tasks5M13153d = bVarM13186f.m13189a(true);
                    if (tasks5M13153d == null) {
                        tasks5M13153d = this.f29694j.m13153d();
                    }
                }
                if (tasks5M13153d == null) {
                    tasks5M13153d = this.f29695k.m13153d();
                }
                if (tasks5M13153d == null) {
                    break;
                } else {
                    m13180H(tasks5M13153d);
                }
            }
            if (bVarM13186f != null) {
                bVarM13186f.m13196h(5);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        m13187h(runnable, Tasks3.f29723f, false);
    }

    /* JADX INFO: renamed from: f */
    public final b m13186f() {
        Thread threadCurrentThread = Thread.currentThread();
        if (!(threadCurrentThread instanceof b)) {
            threadCurrentThread = null;
        }
        b bVar = (b) threadCurrentThread;
        if (bVar == null || !Intrinsics2.m13085a(CoroutineScheduler.this, this)) {
            return null;
        }
        return bVar;
    }

    /* JADX INFO: renamed from: h */
    public final void m13187h(Runnable runnable, Tasks6 tasks6, boolean z) {
        Tasks5 tasks5M13202a;
        Tasks5 tasks5M13185c = m13185c(runnable, tasks6);
        b bVarM13186f = m13186f();
        if (bVarM13186f == null || bVarM13186f.f29703h == 5 || (tasks5M13185c.f29725g.mo13200R() == 0 && bVarM13186f.f29703h == 2)) {
            tasks5M13202a = tasks5M13185c;
        } else {
            bVarM13186f.f29707l = true;
            tasks5M13202a = bVarM13186f.f29702g.m13202a(tasks5M13185c, z);
        }
        if (tasks5M13202a != null) {
            if (!(tasks5M13202a.f29725g.mo13200R() == 1 ? this.f29695k.m13150a(tasks5M13202a) : this.f29694j.m13150a(tasks5M13202a))) {
                throw new RejectedExecutionException(outline.m1550A(new StringBuilder(), this.f29700p, " was terminated"));
            }
        }
        boolean z2 = z && bVarM13186f != null;
        if (tasks5M13185c.f29725g.mo13200R() == 0) {
            if (z2) {
                return;
            }
            m13181O();
        } else {
            long jAddAndGet = f29691g.addAndGet(this, 2097152L);
            if (z2 || m13184b0() || m13182R(jAddAndGet)) {
                return;
            }
            m13184b0();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean isTerminated() {
        return this._isTerminated;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int length = this.f29696l.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            b bVar = this.f29696l.get(i6);
            if (bVar != null) {
                int iM13205d = bVar.f29702g.m13205d();
                int iM15315d = C7804v0.m15315d(bVar.f29703h);
                if (iM15315d == 0) {
                    i++;
                    arrayList.add(String.valueOf(iM13205d) + "c");
                } else if (iM15315d == 1) {
                    i2++;
                    arrayList.add(String.valueOf(iM13205d) + "b");
                } else if (iM15315d == 2) {
                    i3++;
                } else if (iM15315d == 3) {
                    i4++;
                    if (iM13205d > 0) {
                        arrayList.add(String.valueOf(iM13205d) + "d");
                    }
                } else if (iM15315d == 4) {
                    i5++;
                }
            }
        }
        long j2 = this.controlState;
        return this.f29700p + '@' + C5729a.m12463r(this) + "[Pool Size {core = " + this.f29697m + ", max = " + this.f29698n + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f29694j.m13152c() + ", global blocking queue size = " + this.f29695k.m13152c() + ", Control State {created workers= " + ((int) (2097151 & j2)) + ", blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", CPUs acquired = " + (this.f29697m - ((int) ((9223367638808264704L & j2) >> 42))) + "}]";
    }

    /* JADX INFO: renamed from: u */
    public final int m13188u(b bVar) {
        Object objM13191c = bVar.m13191c();
        while (objM13191c != f29693i) {
            if (objM13191c == null) {
                return 0;
            }
            b bVar2 = (b) objM13191c;
            int iM13190b = bVar2.m13190b();
            if (iM13190b != 0) {
                return iM13190b;
            }
            objM13191c = bVar2.m13191c();
        }
        return -1;
    }

    public /* synthetic */ CoroutineScheduler(int i, int i2, long j2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? Tasks8.f29730d : j2, (i3 & 8) != 0 ? "DefaultDispatcher" : str);
    }
}
