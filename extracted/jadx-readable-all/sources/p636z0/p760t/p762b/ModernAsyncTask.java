package p636z0.p760t.p762b;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.t.b.c, reason: use source file name */
/* JADX INFO: compiled from: ModernAsyncTask.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ModernAsyncTask<Params, Progress, Result> {

    /* JADX INFO: renamed from: f */
    public static final ThreadFactory f38762f;

    /* JADX INFO: renamed from: g */
    public static final BlockingQueue<Runnable> f38763g;

    /* JADX INFO: renamed from: h */
    public static final Executor f38764h;

    /* JADX INFO: renamed from: i */
    public static e f38765i;

    /* JADX INFO: renamed from: j */
    public final f<Params, Result> f38766j;

    /* JADX INFO: renamed from: k */
    public final FutureTask<Result> f38767k;

    /* JADX INFO: renamed from: l */
    public volatile int f38768l = 1;

    /* JADX INFO: renamed from: m */
    public final AtomicBoolean f38769m = new AtomicBoolean();

    /* JADX INFO: renamed from: n */
    public final AtomicBoolean f38770n = new AtomicBoolean();

    /* JADX INFO: renamed from: z0.t.b.c$a */
    /* JADX INFO: compiled from: ModernAsyncTask.java */
    public static class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f38771a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sbM1556G = outline.m1556G("ModernAsyncTask #");
            sbM1556G.append(this.f38771a.getAndIncrement());
            return new Thread(runnable, sbM1556G.toString());
        }
    }

    /* JADX INFO: renamed from: z0.t.b.c$b */
    /* JADX INFO: compiled from: ModernAsyncTask.java */
    public class b extends f<Params, Result> {
        public b() {
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // java.util.concurrent.Callable
        public Result call() throws Exception {
            ModernAsyncTask.this.f38770n.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) ModernAsyncTask.this.mo16758a(this.f38776a);
                Binder.flushPendingCommands();
                ModernAsyncTask.this.m16761d(result);
                return result;
            } catch (Throwable th) {
                try {
                    ModernAsyncTask.this.f38769m.set(true);
                    throw th;
                } catch (Throwable th2) {
                    ModernAsyncTask.this.m16761d(result);
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: z0.t.b.c$c */
    /* JADX INFO: compiled from: ModernAsyncTask.java */
    public class c extends FutureTask<Result> {
        public c(Callable callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        public void done() {
            try {
                Result result = get();
                ModernAsyncTask modernAsyncTask = ModernAsyncTask.this;
                if (modernAsyncTask.f38770n.get()) {
                    return;
                }
                modernAsyncTask.m16761d(result);
            } catch (InterruptedException e) {
                Log.w("AsyncTask", e);
            } catch (CancellationException unused) {
                ModernAsyncTask modernAsyncTask2 = ModernAsyncTask.this;
                if (modernAsyncTask2.f38770n.get()) {
                    return;
                }
                modernAsyncTask2.m16761d(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    /* JADX INFO: renamed from: z0.t.b.c$d */
    /* JADX INFO: compiled from: ModernAsyncTask.java */
    public static class d<Data> {

        /* JADX INFO: renamed from: a */
        public final ModernAsyncTask f38774a;

        /* JADX INFO: renamed from: b */
        public final Data[] f38775b;

        public d(ModernAsyncTask modernAsyncTask, Data... dataArr) {
            this.f38774a = modernAsyncTask;
            this.f38775b = dataArr;
        }
    }

    /* JADX INFO: renamed from: z0.t.b.c$e */
    /* JADX INFO: compiled from: ModernAsyncTask.java */
    public static class e extends Handler {
        public e() {
            super(Looper.getMainLooper());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            d dVar = (d) message.obj;
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                Objects.requireNonNull(dVar.f38774a);
            } else {
                ModernAsyncTask modernAsyncTask = dVar.f38774a;
                Object obj = dVar.f38775b[0];
                if (modernAsyncTask.f38769m.get()) {
                    modernAsyncTask.mo16759b(obj);
                } else {
                    modernAsyncTask.mo16760c(obj);
                }
                modernAsyncTask.f38768l = 3;
            }
        }
    }

    /* JADX INFO: renamed from: z0.t.b.c$f */
    /* JADX INFO: compiled from: ModernAsyncTask.java */
    public static abstract class f<Params, Result> implements Callable<Result> {

        /* JADX INFO: renamed from: a */
        public Params[] f38776a;
    }

    static {
        a aVar = new a();
        f38762f = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f38763g = linkedBlockingQueue;
        f38764h = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
    }

    public ModernAsyncTask() {
        b bVar = new b();
        this.f38766j = bVar;
        this.f38767k = new c(bVar);
    }

    /* JADX INFO: renamed from: a */
    public abstract Result mo16758a(Params... paramsArr);

    /* JADX INFO: renamed from: b */
    public void mo16759b(Result result) {
    }

    /* JADX INFO: renamed from: c */
    public void mo16760c(Result result) {
    }

    /* JADX INFO: renamed from: d */
    public Result m16761d(Result result) {
        e eVar;
        synchronized (ModernAsyncTask.class) {
            if (f38765i == null) {
                f38765i = new e();
            }
            eVar = f38765i;
        }
        eVar.obtainMessage(1, new d(this, result)).sendToTarget();
        return result;
    }
}
