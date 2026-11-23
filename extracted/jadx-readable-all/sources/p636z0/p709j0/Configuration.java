package p636z0.p709j0;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p636z0.p709j0.p710y.DefaultRunnableScheduler;

/* JADX INFO: renamed from: z0.j0.b, reason: use source file name */
/* JADX INFO: compiled from: Configuration.java */
/* JADX INFO: loaded from: classes.dex */
public final class Configuration {

    /* JADX INFO: renamed from: a */
    public final Executor f37220a;

    /* JADX INFO: renamed from: b */
    public final Executor f37221b;

    /* JADX INFO: renamed from: c */
    public final WorkerFactory2 f37222c;

    /* JADX INFO: renamed from: d */
    public final InputMergerFactory2 f37223d;

    /* JADX INFO: renamed from: e */
    public final RunnableScheduler f37224e;

    /* JADX INFO: renamed from: f */
    public final InitializationExceptionHandler f37225f;

    /* JADX INFO: renamed from: g */
    public final String f37226g;

    /* JADX INFO: renamed from: h */
    public final int f37227h;

    /* JADX INFO: renamed from: i */
    public final int f37228i;

    /* JADX INFO: renamed from: j */
    public final int f37229j;

    /* JADX INFO: renamed from: k */
    public final int f37230k;

    /* JADX INFO: renamed from: z0.j0.b$b */
    /* JADX INFO: compiled from: Configuration.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        Configuration m15875a();
    }

    public Configuration(a aVar) {
        Executor executor = aVar.f37231a;
        if (executor == null) {
            this.f37220a = m15874a();
        } else {
            this.f37220a = executor;
        }
        Executor executor2 = aVar.f37234d;
        if (executor2 == null) {
            this.f37221b = m15874a();
        } else {
            this.f37221b = executor2;
        }
        WorkerFactory2 workerFactory2 = aVar.f37232b;
        if (workerFactory2 == null) {
            String str = WorkerFactory2.f37295a;
            this.f37222c = new WorkerFactory();
        } else {
            this.f37222c = workerFactory2;
        }
        InputMergerFactory2 inputMergerFactory2 = aVar.f37233c;
        if (inputMergerFactory2 == null) {
            this.f37223d = new InputMergerFactory();
        } else {
            this.f37223d = inputMergerFactory2;
        }
        RunnableScheduler runnableScheduler = aVar.f37235e;
        if (runnableScheduler == null) {
            this.f37224e = new DefaultRunnableScheduler();
        } else {
            this.f37224e = runnableScheduler;
        }
        this.f37227h = aVar.f37238h;
        this.f37228i = aVar.f37239i;
        this.f37229j = aVar.f37240j;
        this.f37230k = aVar.f37241k;
        this.f37225f = aVar.f37236f;
        this.f37226g = aVar.f37237g;
    }

    /* JADX INFO: renamed from: a */
    public final Executor m15874a() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }

    /* JADX INFO: renamed from: z0.j0.b$a */
    /* JADX INFO: compiled from: Configuration.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public Executor f37231a;

        /* JADX INFO: renamed from: b */
        public WorkerFactory2 f37232b;

        /* JADX INFO: renamed from: c */
        public InputMergerFactory2 f37233c;

        /* JADX INFO: renamed from: d */
        public Executor f37234d;

        /* JADX INFO: renamed from: e */
        public RunnableScheduler f37235e;

        /* JADX INFO: renamed from: f */
        public InitializationExceptionHandler f37236f;

        /* JADX INFO: renamed from: g */
        public String f37237g;

        /* JADX INFO: renamed from: h */
        public int f37238h;

        /* JADX INFO: renamed from: i */
        public int f37239i;

        /* JADX INFO: renamed from: j */
        public int f37240j;

        /* JADX INFO: renamed from: k */
        public int f37241k;

        public a() {
            this.f37238h = 4;
            this.f37239i = 0;
            this.f37240j = Integer.MAX_VALUE;
            this.f37241k = 20;
        }

        public a(Configuration configuration) {
            this.f37231a = configuration.f37220a;
            this.f37232b = configuration.f37222c;
            this.f37233c = configuration.f37223d;
            this.f37234d = configuration.f37221b;
            this.f37238h = configuration.f37227h;
            this.f37239i = configuration.f37228i;
            this.f37240j = configuration.f37229j;
            this.f37241k = configuration.f37230k;
            this.f37235e = configuration.f37224e;
            this.f37236f = configuration.f37225f;
            this.f37237g = configuration.f37226g;
        }
    }
}
