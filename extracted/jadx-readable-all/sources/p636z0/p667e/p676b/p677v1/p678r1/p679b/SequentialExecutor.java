package p636z0.p667e.p676b.p677v1.p678r1.p679b;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: renamed from: z0.e.b.v1.r1.b.e, reason: use source file name */
/* JADX INFO: compiled from: SequentialExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public final class SequentialExecutor implements Executor {

    /* JADX INFO: renamed from: g */
    public final Executor f36259g;

    /* JADX INFO: renamed from: f */
    public final Deque<Runnable> f36258f = new ArrayDeque();

    /* JADX INFO: renamed from: h */
    public final b f36260h = new b();

    /* JADX INFO: renamed from: i */
    public int f36261i = 1;

    /* JADX INFO: renamed from: j */
    public long f36262j = 0;

    /* JADX INFO: renamed from: z0.e.b.v1.r1.b.e$a */
    /* JADX INFO: compiled from: SequentialExecutor.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Runnable f36263f;

        public a(SequentialExecutor sequentialExecutor, Runnable runnable) {
            this.f36263f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f36263f.run();
        }
    }

    /* JADX INFO: renamed from: z0.e.b.v1.r1.b.e$b */
    /* JADX INFO: compiled from: SequentialExecutor.java */
    public final class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
        
            if (r1 == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
        
            r4.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004b, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x004c, code lost:
        
            p636z0.p667e.p676b.Logger8.m15273b("SequentialExecutor", "Exception while executing runnable " + r4, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        
            return;
         */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m15421a() {
            /*
                r10 = this;
                r0 = 0
                r1 = 0
            L2:
                z0.e.b.v1.r1.b.e r2 = p636z0.p667e.p676b.p677v1.p678r1.p679b.SequentialExecutor.this     // Catch: java.lang.Throwable -> L66
                java.util.Deque<java.lang.Runnable> r2 = r2.f36258f     // Catch: java.lang.Throwable -> L66
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L66
                r3 = 1
                if (r0 != 0) goto L26
                z0.e.b.v1.r1.b.e r0 = p636z0.p667e.p676b.p677v1.p678r1.p679b.SequentialExecutor.this     // Catch: java.lang.Throwable -> L63
                int r4 = r0.f36261i     // Catch: java.lang.Throwable -> L63
                r5 = 4
                if (r4 != r5) goto L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L63
                if (r1 == 0) goto L1b
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1b:
                return
            L1c:
                long r6 = r0.f36262j     // Catch: java.lang.Throwable -> L63
                r8 = 1
                long r6 = r6 + r8
                r0.f36262j = r6     // Catch: java.lang.Throwable -> L63
                r0.f36261i = r5     // Catch: java.lang.Throwable -> L63
                r0 = 1
            L26:
                z0.e.b.v1.r1.b.e r4 = p636z0.p667e.p676b.p677v1.p678r1.p679b.SequentialExecutor.this     // Catch: java.lang.Throwable -> L63
                java.util.Deque<java.lang.Runnable> r4 = r4.f36258f     // Catch: java.lang.Throwable -> L63
                java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L63
                java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L63
                if (r4 != 0) goto L41
                z0.e.b.v1.r1.b.e r0 = p636z0.p667e.p676b.p677v1.p678r1.p679b.SequentialExecutor.this     // Catch: java.lang.Throwable -> L63
                r0.f36261i = r3     // Catch: java.lang.Throwable -> L63
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L63
                if (r1 == 0) goto L40
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L40:
                return
            L41:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L63
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L66
                r1 = r1 | r2
                r4.run()     // Catch: java.lang.RuntimeException -> L4b java.lang.Throwable -> L66
                goto L2
            L4b:
                r2 = move-exception
                java.lang.String r3 = "SequentialExecutor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
                r5.<init>()     // Catch: java.lang.Throwable -> L66
                java.lang.String r6 = "Exception while executing runnable "
                r5.append(r6)     // Catch: java.lang.Throwable -> L66
                r5.append(r4)     // Catch: java.lang.Throwable -> L66
                java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L66
                p636z0.p667e.p676b.Logger8.m15273b(r3, r4, r2)     // Catch: java.lang.Throwable -> L66
                goto L2
            L63:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L63
                throw r0     // Catch: java.lang.Throwable -> L66
            L66:
                r0 = move-exception
                if (r1 == 0) goto L70
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L70:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p636z0.p667e.p676b.p677v1.p678r1.p679b.SequentialExecutor.b.m15421a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m15421a();
            } catch (Error e) {
                synchronized (SequentialExecutor.this.f36258f) {
                    SequentialExecutor.this.f36261i = 1;
                    throw e;
                }
            }
        }
    }

    public SequentialExecutor(Executor executor) {
        Objects.requireNonNull(executor);
        this.f36259g = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Objects.requireNonNull(runnable);
        synchronized (this.f36258f) {
            int i = this.f36261i;
            if (i != 4 && i != 3) {
                long j2 = this.f36262j;
                a aVar = new a(this, runnable);
                this.f36258f.add(aVar);
                this.f36261i = 2;
                boolean z = false;
                try {
                    this.f36259g.execute(this.f36260h);
                    if (this.f36261i != 2) {
                        return;
                    }
                    synchronized (this.f36258f) {
                        if (this.f36262j == j2 && this.f36261i == 2) {
                            this.f36261i = 3;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f36258f) {
                        int i2 = this.f36261i;
                        if ((i2 == 1 || i2 == 2) && this.f36258f.removeLastOccurrence(aVar)) {
                            z = true;
                        }
                        if (!(e instanceof RejectedExecutionException) || z) {
                            throw e;
                        }
                    }
                    return;
                }
            }
            this.f36258f.add(runnable);
        }
    }
}
