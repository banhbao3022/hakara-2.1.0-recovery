package p636z0.p667e.p676b;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p644b.C7462a;
import p636z0.p667e.p668a.p670e.Camera2CameraFactory;
import p636z0.p667e.p676b.p677v1.AutoValue_CameraThreadConfig;
import p636z0.p667e.p676b.p677v1.CameraDeviceSurfaceManager;
import p636z0.p667e.p676b.p677v1.CameraFactory;
import p636z0.p667e.p676b.p677v1.CameraValidator;
import p636z0.p667e.p676b.p677v1.UseCaseConfigFactory;
import p636z0.p667e.p676b.p681w1.p682j.p683a.DeviceQuirks2;
import p636z0.p667e.p676b.p681w1.p682j.p683a.IncompleteCameraListQuirk;
import p636z0.p693h.p694a.CallbackToFutureAdapter;

/* JADX INFO: renamed from: z0.e.b.j */
/* JADX INFO: compiled from: lambda */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7767j implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CameraX2 f35910f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Context f35911g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Executor f35912h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ CallbackToFutureAdapter f35913i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long f35914j;

    public /* synthetic */ RunnableC7767j(CameraX2 cameraX2, Context context, Executor executor, CallbackToFutureAdapter callbackToFutureAdapter, long j2) {
        this.f35910f = cameraX2;
        this.f35911g = context;
        this.f35912h = executor;
        this.f35913i = callbackToFutureAdapter;
        this.f35914j = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final CameraX2 cameraX2 = this.f35910f;
        Context context = this.f35911g;
        final Executor executor = this.f35912h;
        final CallbackToFutureAdapter callbackToFutureAdapter = this.f35913i;
        final long j2 = this.f35914j;
        Objects.requireNonNull(cameraX2);
        try {
            Application applicationM15437a = CameraX2.m15437a(context);
            cameraX2.f36327o = applicationM15437a;
            if (applicationM15437a == null) {
                cameraX2.f36327o = context.getApplicationContext();
            }
            CameraFactory.a aVar = (CameraFactory.a) cameraX2.f36320h.f36362y.mo15105d(CameraXConfig.f36355r, null);
            if (aVar == null) {
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraFactory."));
            }
            cameraX2.f36324l = aVar.mo15070a(cameraX2.f36327o, new AutoValue_CameraThreadConfig(cameraX2.f36321i, cameraX2.f36322j), (CameraSelector) cameraX2.f36320h.f36362y.mo15105d(CameraXConfig.f36361x, null));
            CameraDeviceSurfaceManager.a aVar2 = (CameraDeviceSurfaceManager.a) cameraX2.f36320h.f36362y.mo15105d(CameraXConfig.f36356s, null);
            if (aVar2 == null) {
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing CameraDeviceSurfaceManager."));
            }
            Context context2 = cameraX2.f36327o;
            CameraFactory cameraFactory = cameraX2.f36324l;
            cameraX2.f36325m = aVar2.mo15069a(context2, ((Camera2CameraFactory) cameraFactory).f35576c, ((Camera2CameraFactory) cameraFactory).m15143a());
            UseCaseConfigFactory.b bVar = (UseCaseConfigFactory.b) cameraX2.f36320h.f36362y.mo15105d(CameraXConfig.f36357t, null);
            if (bVar == null) {
                throw new InitializationException(new IllegalArgumentException("Invalid app configuration provided. Missing UseCaseConfigFactory."));
            }
            cameraX2.f36326n = bVar.mo15068a(cameraX2.f36327o);
            if (executor instanceof CameraExecutor) {
                ((CameraExecutor) executor).m15293b(cameraX2.f36324l);
            }
            cameraX2.f36318f.m15341b(cameraX2.f36324l);
            if (DeviceQuirks2.f36352a.m15353a(IncompleteCameraListQuirk.class) != null) {
                C7462a.m14580q(cameraX2.f36327o, cameraX2.f36318f);
            }
            cameraX2.m15442e();
            callbackToFutureAdapter.m15659a(null);
        } catch (RuntimeException | InitializationException | CameraValidator e) {
            if (SystemClock.elapsedRealtime() - j2 < 2500) {
                StringBuilder sbM1560K = outline.m1560K("Retry init. Start time ", j2, " current time ");
                sbM1560K.append(SystemClock.elapsedRealtime());
                Logger8.m15276e("CameraX", sbM1560K.toString(), e);
                Handler handler = cameraX2.f36322j;
                Runnable runnable = new Runnable() { // from class: z0.e.b.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        CameraX2 cameraX3 = cameraX2;
                        Executor executor2 = executor;
                        long j3 = j2;
                        executor2.execute(new RunnableC7767j(cameraX3, cameraX3.f36327o, executor2, callbackToFutureAdapter, j3));
                    }
                };
                if (Build.VERSION.SDK_INT >= 28) {
                    handler.postDelayed(runnable, "retry_token", 500L);
                    return;
                }
                Message messageObtain = Message.obtain(handler, runnable);
                messageObtain.obj = "retry_token";
                handler.sendMessageDelayed(messageObtain, 500L);
                return;
            }
            synchronized (cameraX2.f36319g) {
                cameraX2.f36328p = 3;
            }
            if (e instanceof CameraValidator) {
                Logger8.m15273b("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.", null);
                callbackToFutureAdapter.m15659a(null);
            } else if (e instanceof InitializationException) {
                callbackToFutureAdapter.m15661c(e);
            } else {
                callbackToFutureAdapter.m15661c(new InitializationException(e));
            }
        }
    }
}
