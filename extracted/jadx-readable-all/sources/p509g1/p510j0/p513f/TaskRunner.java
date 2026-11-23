package p509g1.p510j0.p513f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util8;
import p509g1.p510j0.Util9;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: g1.j0.f.d, reason: use source file name */
/* JADX INFO: compiled from: TaskRunner.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TaskRunner {

    /* JADX INFO: renamed from: a */
    public static final TaskRunner f30169a;

    /* JADX INFO: renamed from: b */
    public static final Logger f30170b;

    /* JADX INFO: renamed from: c */
    public static final b f30171c = new b(null);

    /* JADX INFO: renamed from: d */
    public int f30172d;

    /* JADX INFO: renamed from: e */
    public boolean f30173e;

    /* JADX INFO: renamed from: f */
    public long f30174f;

    /* JADX INFO: renamed from: g */
    public final List<TaskQueue2> f30175g;

    /* JADX INFO: renamed from: h */
    public final List<TaskQueue2> f30176h;

    /* JADX INFO: renamed from: i */
    public final Runnable f30177i;

    /* JADX INFO: renamed from: j */
    public final a f30178j;

    /* JADX INFO: renamed from: g1.j0.f.d$a */
    /* JADX INFO: compiled from: TaskRunner.kt */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo13428a(TaskRunner taskRunner);

        /* JADX INFO: renamed from: b */
        long mo13429b();

        /* JADX INFO: renamed from: c */
        void mo13430c(TaskRunner taskRunner, long j2);

        void execute(Runnable runnable);
    }

    /* JADX INFO: renamed from: g1.j0.f.d$b */
    /* JADX INFO: compiled from: TaskRunner.kt */
    public static final class b {
        public b() {
        }

        public b(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    /* JADX INFO: renamed from: g1.j0.f.d$c */
    /* JADX INFO: compiled from: TaskRunner.kt */
    public static final class c implements a {

        /* JADX INFO: renamed from: a */
        public final ThreadPoolExecutor f30179a;

        public c(ThreadFactory threadFactory) {
            Intrinsics2.m13090f(threadFactory, "threadFactory");
            this.f30179a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // p509g1.p510j0.p513f.TaskRunner.a
        /* JADX INFO: renamed from: a */
        public void mo13428a(TaskRunner taskRunner) {
            Intrinsics2.m13090f(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // p509g1.p510j0.p513f.TaskRunner.a
        /* JADX INFO: renamed from: b */
        public long mo13429b() {
            return System.nanoTime();
        }

        @Override // p509g1.p510j0.p513f.TaskRunner.a
        /* JADX INFO: renamed from: c */
        public void mo13430c(TaskRunner taskRunner, long j2) throws InterruptedException {
            Intrinsics2.m13090f(taskRunner, "taskRunner");
            long j3 = j2 / 1000000;
            long j4 = j2 - (1000000 * j3);
            if (j3 > 0 || j2 > 0) {
                taskRunner.wait(j3, (int) j4);
            }
        }

        @Override // p509g1.p510j0.p513f.TaskRunner.a
        public void execute(Runnable runnable) {
            Intrinsics2.m13090f(runnable, "runnable");
            this.f30179a.execute(runnable);
        }
    }

    /* JADX INFO: renamed from: g1.j0.f.d$d */
    /* JADX INFO: compiled from: TaskRunner.kt */
    public static final class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Task2 task2M13424c;
            while (true) {
                synchronized (TaskRunner.this) {
                    task2M13424c = TaskRunner.this.m13424c();
                }
                if (task2M13424c == null) {
                    return;
                }
                TaskQueue2 taskQueue2 = task2M13424c.f30158a;
                if (taskQueue2 == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                long jMo13429b = -1;
                Objects.requireNonNull(TaskRunner.f30171c);
                boolean zIsLoggable = TaskRunner.f30170b.isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jMo13429b = taskQueue2.f30167e.f30178j.mo13429b();
                    SkuDao.a.m14075a(task2M13424c, taskQueue2, "starting");
                }
                try {
                    TaskRunner.m13422a(TaskRunner.this, task2M13424c);
                    if (zIsLoggable) {
                        long jMo13429b2 = taskQueue2.f30167e.f30178j.mo13429b() - jMo13429b;
                        StringBuilder sbM1556G = outline.m1556G("finished run in ");
                        sbM1556G.append(SkuDao.a.m14102o(jMo13429b2));
                        SkuDao.a.m14075a(task2M13424c, taskQueue2, sbM1556G.toString());
                    }
                } catch (Throwable th) {
                    try {
                        TaskRunner.this.f30178j.execute(this);
                        throw th;
                    } catch (Throwable th2) {
                        if (zIsLoggable) {
                            long jMo13429b3 = taskQueue2.f30167e.f30178j.mo13429b() - jMo13429b;
                            StringBuilder sbM1556G2 = outline.m1556G("failed a run in ");
                            sbM1556G2.append(SkuDao.a.m14102o(jMo13429b3));
                            SkuDao.a.m14075a(task2M13424c, taskQueue2, sbM1556G2.toString());
                        }
                        throw th2;
                    }
                }
            }
        }
    }

    static {
        String str = Util9.f30076g + " TaskRunner";
        Intrinsics2.m13090f(str, "name");
        f30169a = new TaskRunner(new c(new Util8(str, true)));
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        Intrinsics2.m13086b(logger, "Logger.getLogger(TaskRunner::class.java.name)");
        f30170b = logger;
    }

    public TaskRunner(a aVar) {
        Intrinsics2.m13090f(aVar, "backend");
        this.f30178j = aVar;
        this.f30172d = 10000;
        this.f30175g = new ArrayList();
        this.f30176h = new ArrayList();
        this.f30177i = new d();
    }

    /* JADX INFO: renamed from: a */
    public static final void m13422a(TaskRunner taskRunner, Task2 task2) {
        Objects.requireNonNull(taskRunner);
        byte[] bArr = Util9.f30070a;
        Thread threadCurrentThread = Thread.currentThread();
        Intrinsics2.m13086b(threadCurrentThread, "currentThread");
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(task2.f30160c);
        try {
            long jMo13414a = task2.mo13414a();
            synchronized (taskRunner) {
                taskRunner.m13423b(task2, jMo13414a);
            }
        } finally {
            synchronized (taskRunner) {
                taskRunner.m13423b(task2, -1L);
                threadCurrentThread.setName(name);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13423b(Task2 task2, long j2) {
        byte[] bArr = Util9.f30070a;
        TaskQueue2 taskQueue2 = task2.f30158a;
        if (taskQueue2 == null) {
            Intrinsics2.m13095k();
            throw null;
        }
        if (!(taskQueue2.f30164b == task2)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean z = taskQueue2.f30166d;
        taskQueue2.f30166d = false;
        taskQueue2.f30164b = null;
        this.f30175g.remove(taskQueue2);
        if (j2 != -1 && !z && !taskQueue2.f30163a) {
            taskQueue2.m13420e(task2, j2, true);
        }
        if (!taskQueue2.f30165c.isEmpty()) {
            this.f30176h.add(taskQueue2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final Task2 m13424c() {
        boolean z;
        byte[] bArr = Util9.f30070a;
        while (!this.f30176h.isEmpty()) {
            long jMo13429b = this.f30178j.mo13429b();
            long jMin = Long.MAX_VALUE;
            Iterator<TaskQueue2> it = this.f30176h.iterator();
            Task2 task2 = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                Task2 task3 = it.next().f30165c.get(0);
                long jMax = Math.max(0L, task3.f30159b - jMo13429b);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (task2 != null) {
                        z = true;
                        break;
                    }
                    task2 = task3;
                }
            }
            if (task2 != null) {
                byte[] bArr2 = Util9.f30070a;
                task2.f30159b = -1L;
                TaskQueue2 taskQueue2 = task2.f30158a;
                if (taskQueue2 == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
                taskQueue2.f30165c.remove(task2);
                this.f30176h.remove(taskQueue2);
                taskQueue2.f30164b = task2;
                this.f30175g.add(taskQueue2);
                if (z || (!this.f30173e && (!this.f30176h.isEmpty()))) {
                    this.f30178j.execute(this.f30177i);
                }
                return task2;
            }
            if (this.f30173e) {
                if (jMin < this.f30174f - jMo13429b) {
                    this.f30178j.mo13428a(this);
                }
                return null;
            }
            this.f30173e = true;
            this.f30174f = jMo13429b + jMin;
            try {
                try {
                    this.f30178j.mo13430c(this, jMin);
                } catch (InterruptedException unused) {
                    m13425d();
                }
                this.f30173e = false;
            } catch (Throwable th) {
                this.f30173e = false;
                throw th;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final void m13425d() {
        for (int size = this.f30175g.size() - 1; size >= 0; size--) {
            this.f30175g.get(size).m13418b();
        }
        for (int size2 = this.f30176h.size() - 1; size2 >= 0; size2--) {
            TaskQueue2 taskQueue2 = this.f30176h.get(size2);
            taskQueue2.m13418b();
            if (taskQueue2.f30165c.isEmpty()) {
                this.f30176h.remove(size2);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m13426e(TaskQueue2 taskQueue2) {
        Intrinsics2.m13090f(taskQueue2, "taskQueue");
        byte[] bArr = Util9.f30070a;
        if (taskQueue2.f30164b == null) {
            if (!taskQueue2.f30165c.isEmpty()) {
                List<TaskQueue2> list = this.f30176h;
                Intrinsics2.m13090f(list, "$this$addIfAbsent");
                if (!list.contains(taskQueue2)) {
                    list.add(taskQueue2);
                }
            } else {
                this.f30176h.remove(taskQueue2);
            }
        }
        if (this.f30173e) {
            this.f30178j.mo13428a(this);
        } else {
            this.f30178j.execute(this.f30177i);
        }
    }

    /* JADX INFO: renamed from: f */
    public final TaskQueue2 m13427f() {
        int i;
        synchronized (this) {
            i = this.f30172d;
            this.f30172d = i + 1;
        }
        StringBuilder sb = new StringBuilder();
        sb.append('Q');
        sb.append(i);
        return new TaskQueue2(this, sb.toString());
    }
}
