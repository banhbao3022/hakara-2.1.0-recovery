package p636z0.p667e.p676b;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p636z0.p667e.p668a.p670e.Camera2CameraFactory;
import p636z0.p667e.p676b.p677v1.CameraFactory;

/* JADX INFO: renamed from: z0.e.b.p0, reason: use source file name */
/* JADX INFO: compiled from: CameraExecutor.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraExecutor implements Executor {

    /* JADX INFO: renamed from: f */
    public static final ThreadFactory f35983f = new a();

    /* JADX INFO: renamed from: g */
    public final Object f35984g = new Object();

    /* JADX INFO: renamed from: h */
    public ThreadPoolExecutor f35985h = m15292a();

    /* JADX INFO: renamed from: z0.e.b.p0$a */
    /* JADX INFO: compiled from: CameraExecutor.java */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public final AtomicInteger f35986a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(Locale.US, "CameraX-core_camera_%d", Integer.valueOf(this.f35986a.getAndIncrement())));
            return thread;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ThreadPoolExecutor m15292a() {
        return new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), f35983f);
    }

    /* JADX INFO: renamed from: b */
    public void m15293b(CameraFactory cameraFactory) {
        ThreadPoolExecutor threadPoolExecutor;
        Objects.requireNonNull(cameraFactory);
        synchronized (this.f35984g) {
            if (this.f35985h.isShutdown()) {
                this.f35985h = m15292a();
            }
            threadPoolExecutor = this.f35985h;
        }
        int iMax = Math.max(1, ((Camera2CameraFactory) cameraFactory).m15143a().size());
        threadPoolExecutor.setMaximumPoolSize(iMax);
        threadPoolExecutor.setCorePoolSize(iMax);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        Objects.requireNonNull(runnable);
        synchronized (this.f35984g) {
            this.f35985h.execute(runnable);
        }
    }
}
