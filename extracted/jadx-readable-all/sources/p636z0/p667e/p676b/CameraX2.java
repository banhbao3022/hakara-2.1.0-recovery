package p636z0.p667e.p676b;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.concurrent.Executor;
import mtp.media.karaoke.R;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p644b.C7462a;
import p636z0.p655c.p656a.p659c.Function3;
import p636z0.p667e.p676b.p677v1.CameraDeviceSurfaceManager;
import p636z0.p667e.p676b.p677v1.CameraFactory;
import p636z0.p667e.p676b.p677v1.CameraInternal2;
import p636z0.p667e.p676b.p677v1.CameraRepository;
import p636z0.p667e.p676b.p677v1.UseCaseConfigFactory;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.AsyncFunction;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.ChainingListenableFuture;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureChain;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.Futures;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.Futures2;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.ImmediateFuture;
import p636z0.p686f.C7944a;
import p636z0.p693h.p694a.CallbackToFutureAdapter;
import p636z0.p693h.p694a.CallbackToFutureAdapter3;
import p636z0.p725k.C8162a;
import p636z0.p725k.p735h.HandlerCompat;

/* JADX INFO: renamed from: z0.e.b.w0, reason: use source file name */
/* JADX INFO: compiled from: CameraX.java */
/* JADX INFO: loaded from: classes.dex */
public final class CameraX2 {

    /* JADX INFO: renamed from: b */
    public static CameraX2 f36314b;

    /* JADX INFO: renamed from: c */
    public static CameraXConfig.b f36315c;

    /* JADX INFO: renamed from: h */
    public final CameraXConfig f36320h;

    /* JADX INFO: renamed from: i */
    public final Executor f36321i;

    /* JADX INFO: renamed from: j */
    public final Handler f36322j;

    /* JADX INFO: renamed from: k */
    public final HandlerThread f36323k;

    /* JADX INFO: renamed from: l */
    public CameraFactory f36324l;

    /* JADX INFO: renamed from: m */
    public CameraDeviceSurfaceManager f36325m;

    /* JADX INFO: renamed from: n */
    public UseCaseConfigFactory f36326n;

    /* JADX INFO: renamed from: o */
    public Context f36327o;

    /* JADX INFO: renamed from: a */
    public static final Object f36313a = new Object();

    /* JADX INFO: renamed from: d */
    public static ListenableFuture<Void> f36316d = new ImmediateFuture.a(new IllegalStateException("CameraX is not initialized."));

    /* JADX INFO: renamed from: e */
    public static ListenableFuture<Void> f36317e = Futures2.m15428c(null);

    /* JADX INFO: renamed from: f */
    public final CameraRepository f36318f = new CameraRepository();

    /* JADX INFO: renamed from: g */
    public final Object f36319g = new Object();

    /* JADX INFO: renamed from: p */
    public int f36328p = 1;

    /* JADX INFO: renamed from: q */
    public ListenableFuture<Void> f36329q = Futures2.m15428c(null);

    public CameraX2(CameraXConfig cameraXConfig) {
        Objects.requireNonNull(cameraXConfig);
        this.f36320h = cameraXConfig;
        Executor executor = (Executor) cameraXConfig.f36362y.mo15105d(CameraXConfig.f36358u, null);
        Handler handler = (Handler) cameraXConfig.f36362y.mo15105d(CameraXConfig.f36359v, null);
        this.f36321i = executor == null ? new CameraExecutor() : executor;
        if (handler != null) {
            this.f36323k = null;
            this.f36322j = handler;
        } else {
            HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
            this.f36323k = handlerThread;
            handlerThread.start();
            this.f36322j = HandlerCompat.m16203a(handlerThread.getLooper());
        }
    }

    /* JADX INFO: renamed from: a */
    public static Application m15437a(Context context) {
        for (Context applicationContext = context.getApplicationContext(); applicationContext instanceof ContextWrapper; applicationContext = ((ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof Application) {
                return (Application) applicationContext;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static CameraXConfig.b m15438b(Context context) {
        ComponentCallbacks2 componentCallbacks2M15437a = m15437a(context);
        if (componentCallbacks2M15437a instanceof CameraXConfig.b) {
            return (CameraXConfig.b) componentCallbacks2M15437a;
        }
        try {
            return (CameraXConfig.b) Class.forName(context.getApplicationContext().getResources().getString(R.string.androidx_camera_default_config_provider)).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Resources.NotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            Logger8.m15273b("CameraX", "Failed to retrieve default CameraXConfig.Provider from resources", e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static ListenableFuture<CameraX2> m15439c() {
        final CameraX2 cameraX2 = f36314b;
        if (cameraX2 == null) {
            return new ImmediateFuture.a(new IllegalStateException("Must call CameraX.initialize() first"));
        }
        ListenableFuture<Void> listenableFuture = f36316d;
        Function3 function3 = new Function3() { // from class: z0.e.b.e
            @Override // p636z0.p655c.p656a.p659c.Function3
            public final Object apply(Object obj) {
                return this.f35890a;
            }
        };
        Executor executorM14569f = C7462a.m14569f();
        ChainingListenableFuture chainingListenableFuture = new ChainingListenableFuture(new Futures(function3), listenableFuture);
        listenableFuture.mo11664h(chainingListenableFuture, executorM14569f);
        return chainingListenableFuture;
    }

    /* JADX INFO: renamed from: d */
    public static void m15440d(final Context context) {
        C8162a.m16065j(f36314b == null, "CameraX already initialized.");
        Objects.requireNonNull(f36315c);
        final CameraX2 cameraX2 = new CameraX2(f36315c.getCameraXConfig());
        f36314b = cameraX2;
        f36316d = C7944a.m15540a(new CallbackToFutureAdapter3() { // from class: z0.e.b.f
            @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
            /* JADX INFO: renamed from: a */
            public final Object mo15078a(CallbackToFutureAdapter callbackToFutureAdapter) {
                final CameraX2 cameraX3 = this.f35893a;
                final Context context2 = context;
                synchronized (CameraX2.f36313a) {
                    FutureChain futureChainM15425c = FutureChain.m15423a(CameraX2.f36317e).m15425c(new AsyncFunction() { // from class: z0.e.b.h
                        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.AsyncFunction
                        public final ListenableFuture apply(Object obj) {
                            ListenableFuture listenableFutureM15540a;
                            final CameraX2 cameraX4 = cameraX3;
                            final Context context3 = context2;
                            synchronized (cameraX4.f36319g) {
                                boolean z = true;
                                if (cameraX4.f36328p != 1) {
                                    z = false;
                                }
                                C8162a.m16065j(z, "CameraX.initInternal() should only be called once per instance");
                                cameraX4.f36328p = 2;
                                listenableFutureM15540a = C7944a.m15540a(new CallbackToFutureAdapter3() { // from class: z0.e.b.d
                                    @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo15078a(CallbackToFutureAdapter callbackToFutureAdapter2) {
                                        CameraX2 cameraX5 = cameraX4;
                                        Context context4 = context3;
                                        Executor executor = cameraX5.f36321i;
                                        executor.execute(new RunnableC7767j(cameraX5, context4, executor, callbackToFutureAdapter2, SystemClock.elapsedRealtime()));
                                        return "CameraX initInternal";
                                    }
                                });
                            }
                            return listenableFutureM15540a;
                        }
                    }, C7462a.m14569f());
                    CameraX cameraX = new CameraX(callbackToFutureAdapter, cameraX3);
                    futureChainM15425c.mo11664h(new Futures2.d(futureChainM15425c, cameraX), C7462a.m14569f());
                }
                return "CameraX-initialize";
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static ListenableFuture<Void> m15441f() {
        final CameraX2 cameraX2 = f36314b;
        if (cameraX2 == null) {
            return f36317e;
        }
        f36314b = null;
        ListenableFuture<Void> listenableFutureM15540a = C7944a.m15540a(new CallbackToFutureAdapter3() { // from class: z0.e.b.l
            @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
            /* JADX INFO: renamed from: a */
            public final Object mo15078a(final CallbackToFutureAdapter callbackToFutureAdapter) {
                final CameraX2 cameraX3 = this.f35932a;
                synchronized (CameraX2.f36313a) {
                    CameraX2.f36316d.mo11664h(new Runnable() { // from class: z0.e.b.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            ListenableFuture<Void> listenableFutureM15428c;
                            final CameraX2 cameraX4 = cameraX3;
                            CallbackToFutureAdapter callbackToFutureAdapter2 = callbackToFutureAdapter;
                            synchronized (cameraX4.f36319g) {
                                cameraX4.f36322j.removeCallbacksAndMessages("retry_token");
                                int iM15315d = C7804v0.m15315d(cameraX4.f36328p);
                                if (iM15315d == 0) {
                                    cameraX4.f36328p = 4;
                                    listenableFutureM15428c = Futures2.m15428c(null);
                                } else {
                                    if (iM15315d == 1) {
                                        throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                                    }
                                    if (iM15315d == 2) {
                                        cameraX4.f36328p = 4;
                                        cameraX4.f36329q = C7944a.m15540a(new CallbackToFutureAdapter3() { // from class: z0.e.b.m
                                            @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
                                            /* JADX INFO: renamed from: a */
                                            public final Object mo15078a(final CallbackToFutureAdapter callbackToFutureAdapter3) {
                                                ListenableFuture<Void> listenableFutureM15428c2;
                                                final CameraX2 cameraX5 = cameraX4;
                                                final CameraRepository cameraRepository = cameraX5.f36318f;
                                                synchronized (cameraRepository.f36114a) {
                                                    if (cameraRepository.f36115b.isEmpty()) {
                                                        listenableFutureM15428c2 = cameraRepository.f36117d;
                                                        if (listenableFutureM15428c2 == null) {
                                                            listenableFutureM15428c2 = Futures2.m15428c(null);
                                                        }
                                                    } else {
                                                        ListenableFuture<Void> listenableFutureM15540a2 = cameraRepository.f36117d;
                                                        if (listenableFutureM15540a2 == null) {
                                                            listenableFutureM15540a2 = C7944a.m15540a(new CallbackToFutureAdapter3() { // from class: z0.e.b.v1.a
                                                                @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
                                                                /* JADX INFO: renamed from: a */
                                                                public final Object mo15078a(CallbackToFutureAdapter callbackToFutureAdapter4) {
                                                                    CameraRepository cameraRepository2 = cameraRepository;
                                                                    synchronized (cameraRepository2.f36114a) {
                                                                        cameraRepository2.f36118e = callbackToFutureAdapter4;
                                                                    }
                                                                    return "CameraRepository-deinit";
                                                                }
                                                            });
                                                            cameraRepository.f36117d = listenableFutureM15540a2;
                                                        }
                                                        cameraRepository.f36116c.addAll(cameraRepository.f36115b.values());
                                                        for (final CameraInternal2 cameraInternal2 : cameraRepository.f36115b.values()) {
                                                            cameraInternal2.release().mo11664h(new Runnable() { // from class: z0.e.b.v1.b
                                                                @Override // java.lang.Runnable
                                                                public final void run() {
                                                                    CameraRepository cameraRepository2 = cameraRepository;
                                                                    CameraInternal2 cameraInternal3 = cameraInternal2;
                                                                    synchronized (cameraRepository2.f36114a) {
                                                                        cameraRepository2.f36116c.remove(cameraInternal3);
                                                                        if (cameraRepository2.f36116c.isEmpty()) {
                                                                            Objects.requireNonNull(cameraRepository2.f36118e);
                                                                            cameraRepository2.f36118e.m15659a(null);
                                                                            cameraRepository2.f36118e = null;
                                                                            cameraRepository2.f36117d = null;
                                                                        }
                                                                    }
                                                                }
                                                            }, C7462a.m14569f());
                                                        }
                                                        cameraRepository.f36115b.clear();
                                                        listenableFutureM15428c2 = listenableFutureM15540a2;
                                                    }
                                                }
                                                listenableFutureM15428c2.mo11664h(new Runnable() { // from class: z0.e.b.i
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        CameraX2 cameraX6 = cameraX5;
                                                        CallbackToFutureAdapter callbackToFutureAdapter4 = callbackToFutureAdapter3;
                                                        if (cameraX6.f36323k != null) {
                                                            Executor executor = cameraX6.f36321i;
                                                            if (executor instanceof CameraExecutor) {
                                                                CameraExecutor cameraExecutor = (CameraExecutor) executor;
                                                                synchronized (cameraExecutor.f35984g) {
                                                                    if (!cameraExecutor.f35985h.isShutdown()) {
                                                                        cameraExecutor.f35985h.shutdown();
                                                                    }
                                                                }
                                                            }
                                                            cameraX6.f36323k.quit();
                                                            callbackToFutureAdapter4.m15659a(null);
                                                        }
                                                    }
                                                }, cameraX5.f36321i);
                                                return "CameraX shutdownInternal";
                                            }
                                        });
                                    }
                                    listenableFutureM15428c = cameraX4.f36329q;
                                }
                            }
                            Futures2.m15430e(listenableFutureM15428c, callbackToFutureAdapter2);
                        }
                    }, C7462a.m14569f());
                }
                return "CameraX shutdown";
            }
        });
        f36317e = listenableFutureM15540a;
        return listenableFutureM15540a;
    }

    /* JADX INFO: renamed from: e */
    public final void m15442e() {
        synchronized (this.f36319g) {
            this.f36328p = 3;
        }
    }
}
