package p636z0.p655c.p656a.p657a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: z0.c.a.a.b, reason: use source file name */
/* JADX INFO: compiled from: DefaultTaskExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class DefaultTaskExecutor extends TaskExecutor {

    /* JADX INFO: renamed from: a */
    public final Object f35306a = new Object();

    /* JADX INFO: renamed from: b */
    public final ExecutorService f35307b = Executors.newFixedThreadPool(4, new a(this));

    /* JADX INFO: renamed from: c */
    public volatile Handler f35308c;

    /* JADX INFO: renamed from: z0.c.a.a.b$a */
    /* JADX INFO: compiled from: DefaultTaskExecutor.java */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f35309a = new AtomicInteger(0);

        public a(DefaultTaskExecutor defaultTaskExecutor) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f35309a.getAndIncrement())));
            return thread;
        }
    }

    /* JADX INFO: renamed from: d */
    public static Handler m15027d(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // p636z0.p655c.p656a.p657a.TaskExecutor
    /* JADX INFO: renamed from: a */
    public void mo15024a(Runnable runnable) {
        this.f35307b.execute(runnable);
    }

    @Override // p636z0.p655c.p656a.p657a.TaskExecutor
    /* JADX INFO: renamed from: b */
    public boolean mo15025b() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    @Override // p636z0.p655c.p656a.p657a.TaskExecutor
    /* JADX INFO: renamed from: c */
    public void mo15026c(Runnable runnable) {
        if (this.f35308c == null) {
            synchronized (this.f35306a) {
                if (this.f35308c == null) {
                    this.f35308c = m15027d(Looper.getMainLooper());
                }
            }
        }
        this.f35308c.post(runnable);
    }
}
