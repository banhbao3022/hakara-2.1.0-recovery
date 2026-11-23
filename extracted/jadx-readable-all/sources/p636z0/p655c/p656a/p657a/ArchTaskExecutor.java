package p636z0.p655c.p656a.p657a;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: z0.c.a.a.a, reason: use source file name */
/* JADX INFO: compiled from: ArchTaskExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class ArchTaskExecutor extends TaskExecutor {

    /* JADX INFO: renamed from: a */
    public static volatile ArchTaskExecutor f35302a;

    /* JADX INFO: renamed from: b */
    public static final Executor f35303b = new a();

    /* JADX INFO: renamed from: c */
    public TaskExecutor f35304c;

    /* JADX INFO: renamed from: d */
    public TaskExecutor f35305d;

    /* JADX INFO: renamed from: z0.c.a.a.a$a */
    /* JADX INFO: compiled from: ArchTaskExecutor.java */
    public static class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            ArchTaskExecutor.m15023d().f35304c.mo15024a(runnable);
        }
    }

    public ArchTaskExecutor() {
        DefaultTaskExecutor defaultTaskExecutor = new DefaultTaskExecutor();
        this.f35305d = defaultTaskExecutor;
        this.f35304c = defaultTaskExecutor;
    }

    /* JADX INFO: renamed from: d */
    public static ArchTaskExecutor m15023d() {
        if (f35302a != null) {
            return f35302a;
        }
        synchronized (ArchTaskExecutor.class) {
            if (f35302a == null) {
                f35302a = new ArchTaskExecutor();
            }
        }
        return f35302a;
    }

    @Override // p636z0.p655c.p656a.p657a.TaskExecutor
    /* JADX INFO: renamed from: a */
    public void mo15024a(Runnable runnable) {
        this.f35304c.mo15024a(runnable);
    }

    @Override // p636z0.p655c.p656a.p657a.TaskExecutor
    /* JADX INFO: renamed from: b */
    public boolean mo15025b() {
        return this.f35304c.mo15025b();
    }

    @Override // p636z0.p655c.p656a.p657a.TaskExecutor
    /* JADX INFO: renamed from: c */
    public void mo15026c(Runnable runnable) {
        this.f35304c.mo15026c(runnable);
    }
}
