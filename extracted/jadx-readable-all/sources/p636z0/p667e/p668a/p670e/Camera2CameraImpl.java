package p636z0.p667e.p668a.p670e;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p644b.C7462a;
import p636z0.p667e.p668a.p669d.CameraEventCallback;
import p636z0.p667e.p668a.p669d.CameraEventCallbacks;
import p636z0.p667e.p668a.p670e.Camera2CameraImpl;
import p636z0.p667e.p668a.p670e.p671w1.CameraAccessExceptionCompat;
import p636z0.p667e.p668a.p670e.p671w1.CameraManagerCompat;
import p636z0.p667e.p676b.Camera2;
import p636z0.p667e.p676b.CameraInfo;
import p636z0.p667e.p676b.CameraUnavailableException;
import p636z0.p667e.p676b.Logger8;
import p636z0.p667e.p676b.Preview;
import p636z0.p667e.p676b.UseCase;
import p636z0.p667e.p676b.p677v1.CameraCaptureCallback;
import p636z0.p667e.p676b.p677v1.CameraControlInternal;
import p636z0.p667e.p676b.p677v1.CameraInfoInternal;
import p636z0.p667e.p676b.p677v1.CameraInternal;
import p636z0.p667e.p676b.p677v1.CameraInternal2;
import p636z0.p667e.p676b.p677v1.CameraStateRegistry;
import p636z0.p667e.p676b.p677v1.CaptureConfig;
import p636z0.p667e.p676b.p677v1.DeferrableSurface;
import p636z0.p667e.p676b.p677v1.ImmediateSurface;
import p636z0.p667e.p676b.p677v1.LiveDataObservable;
import p636z0.p667e.p676b.p677v1.SessionConfig;
import p636z0.p667e.p676b.p677v1.UseCaseAttachState;
import p636z0.p667e.p676b.p677v1.p678r1.p679b.HandlerScheduledExecutorService;
import p636z0.p667e.p676b.p677v1.p678r1.p679b.SequentialExecutor;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.Futures2;
import p636z0.p686f.C7944a;
import p636z0.p693h.p694a.CallbackToFutureAdapter;
import p636z0.p693h.p694a.CallbackToFutureAdapter3;
import p636z0.p725k.C8162a;

/* JADX INFO: renamed from: z0.e.a.e.o0, reason: use source file name */
/* JADX INFO: compiled from: Camera2CameraImpl.java */
/* JADX INFO: loaded from: classes.dex */
public final class Camera2CameraImpl implements CameraInternal2 {

    /* JADX INFO: renamed from: A */
    public final SynchronizedCaptureSessionOpener.a f35580A;

    /* JADX INFO: renamed from: B */
    public final Set<String> f35581B;

    /* JADX INFO: renamed from: f */
    public final UseCaseAttachState f35582f;

    /* JADX INFO: renamed from: g */
    public final CameraManagerCompat f35583g;

    /* JADX INFO: renamed from: h */
    public final Executor f35584h;

    /* JADX INFO: renamed from: i */
    public volatile e f35585i = e.INITIALIZED;

    /* JADX INFO: renamed from: j */
    public final LiveDataObservable<CameraInternal2.a> f35586j;

    /* JADX INFO: renamed from: k */
    public final Camera2CameraControlImpl f35587k;

    /* JADX INFO: renamed from: l */
    public final f f35588l;

    /* JADX INFO: renamed from: m */
    public final Camera2CameraInfoImpl f35589m;

    /* JADX INFO: renamed from: n */
    public CameraDevice f35590n;

    /* JADX INFO: renamed from: o */
    public int f35591o;

    /* JADX INFO: renamed from: p */
    public CaptureSession f35592p;

    /* JADX INFO: renamed from: q */
    public SessionConfig f35593q;

    /* JADX INFO: renamed from: r */
    public final AtomicInteger f35594r;

    /* JADX INFO: renamed from: s */
    public ListenableFuture<Void> f35595s;

    /* JADX INFO: renamed from: t */
    public CallbackToFutureAdapter<Void> f35596t;

    /* JADX INFO: renamed from: u */
    public final Map<CaptureSession, ListenableFuture<Void>> f35597u;

    /* JADX INFO: renamed from: v */
    public final c f35598v;

    /* JADX INFO: renamed from: w */
    public final CameraStateRegistry f35599w;

    /* JADX INFO: renamed from: x */
    public final Set<CaptureSession> f35600x;

    /* JADX INFO: renamed from: y */
    public MeteringRepeatingSession f35601y;

    /* JADX INFO: renamed from: z */
    public final CaptureSessionRepository f35602z;

    /* JADX INFO: renamed from: z0.e.a.e.o0$a */
    /* JADX INFO: compiled from: Camera2CameraImpl.java */
    public class a implements FutureCallback<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CaptureSession f35603a;

        public a(CaptureSession captureSession) {
            this.f35603a = captureSession;
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
        /* JADX INFO: renamed from: a */
        public void mo15090a(Void r2) {
            CameraDevice cameraDevice;
            Camera2CameraImpl.this.f35597u.remove(this.f35603a);
            int iOrdinal = Camera2CameraImpl.this.f35585i.ordinal();
            if (iOrdinal != 4) {
                if (iOrdinal != 5) {
                    if (iOrdinal != 6) {
                        return;
                    }
                } else if (Camera2CameraImpl.this.f35591o == 0) {
                    return;
                }
            }
            if (!Camera2CameraImpl.this.m15172p() || (cameraDevice = Camera2CameraImpl.this.f35590n) == null) {
                return;
            }
            cameraDevice.close();
            Camera2CameraImpl.this.f35590n = null;
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
        /* JADX INFO: renamed from: b */
        public void mo15091b(Throwable th) {
        }
    }

    /* JADX INFO: renamed from: z0.e.a.e.o0$b */
    /* JADX INFO: compiled from: Camera2CameraImpl.java */
    public class b implements FutureCallback<Void> {
        public b() {
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
        /* JADX INFO: renamed from: a */
        public void mo15090a(Void r1) {
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
        /* JADX INFO: renamed from: b */
        public void mo15091b(Throwable th) {
            final SessionConfig sessionConfig = null;
            if (th instanceof CameraAccessException) {
                Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                StringBuilder sbM1556G = outline.m1556G("Unable to configure camera due to ");
                sbM1556G.append(th.getMessage());
                camera2CameraImpl.m15170m(sbM1556G.toString(), null);
                return;
            }
            if (th instanceof CancellationException) {
                Camera2CameraImpl.this.m15170m("Unable to configure camera cancelled", null);
                return;
            }
            if (!(th instanceof DeferrableSurface.a)) {
                if (!(th instanceof TimeoutException)) {
                    throw new RuntimeException(th);
                }
                StringBuilder sbM1556G2 = outline.m1556G("Unable to configure camera ");
                sbM1556G2.append(Camera2CameraImpl.this.f35589m.f35632a);
                sbM1556G2.append(", timeout!");
                Logger8.m15273b("Camera2CameraImpl", sbM1556G2.toString(), null);
                return;
            }
            Camera2CameraImpl camera2CameraImpl2 = Camera2CameraImpl.this;
            DeferrableSurface deferrableSurface = ((DeferrableSurface.a) th).f36206f;
            for (SessionConfig sessionConfig2 : camera2CameraImpl2.f35582f.m15399b()) {
                if (sessionConfig2.m15371b().contains(deferrableSurface)) {
                    sessionConfig = sessionConfig2;
                    break;
                }
            }
            if (sessionConfig != null) {
                Camera2CameraImpl camera2CameraImpl3 = Camera2CameraImpl.this;
                Objects.requireNonNull(camera2CameraImpl3);
                ScheduledExecutorService scheduledExecutorServiceM14576m = C7462a.m14576m();
                List<SessionConfig.c> list = sessionConfig.f36163e;
                if (list.isEmpty()) {
                    return;
                }
                final SessionConfig.c cVar = list.get(0);
                camera2CameraImpl3.m15170m("Posting surface closed", new Throwable());
                scheduledExecutorServiceM14576m.execute(new Runnable() { // from class: z0.e.a.e.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.mo15290a(sessionConfig, SessionConfig.e.SESSION_ERROR_SURFACE_NEEDS_RESET);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: z0.e.a.e.o0$c */
    /* JADX INFO: compiled from: Camera2CameraImpl.java */
    public final class c extends CameraManager.AvailabilityCallback implements CameraStateRegistry.b {

        /* JADX INFO: renamed from: a */
        public final String f35606a;

        /* JADX INFO: renamed from: b */
        public boolean f35607b = true;

        public c(String str) {
            this.f35606a = str;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (this.f35606a.equals(str)) {
                this.f35607b = true;
                if (Camera2CameraImpl.this.f35585i == e.PENDING_OPEN) {
                    Camera2CameraImpl.this.m15173q(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.f35606a.equals(str)) {
                this.f35607b = false;
            }
        }
    }

    /* JADX INFO: renamed from: z0.e.a.e.o0$d */
    /* JADX INFO: compiled from: Camera2CameraImpl.java */
    public final class d implements CameraControlInternal.a {
        public d() {
        }
    }

    /* JADX INFO: renamed from: z0.e.a.e.o0$e */
    /* JADX INFO: compiled from: Camera2CameraImpl.java */
    public enum e {
        INITIALIZED,
        PENDING_OPEN,
        OPENING,
        OPENED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    /* JADX INFO: renamed from: z0.e.a.e.o0$f */
    /* JADX INFO: compiled from: Camera2CameraImpl.java */
    public final class f extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a */
        public final Executor f35619a;

        /* JADX INFO: renamed from: b */
        public final ScheduledExecutorService f35620b;

        /* JADX INFO: renamed from: c */
        public b f35621c;

        /* JADX INFO: renamed from: d */
        public ScheduledFuture<?> f35622d;

        /* JADX INFO: renamed from: e */
        public final a f35623e = new a(this);

        /* JADX INFO: renamed from: z0.e.a.e.o0$f$a */
        /* JADX INFO: compiled from: Camera2CameraImpl.java */
        public class a {

            /* JADX INFO: renamed from: a */
            public long f35625a = -1;

            public a(f fVar) {
            }
        }

        /* JADX INFO: renamed from: z0.e.a.e.o0$f$b */
        /* JADX INFO: compiled from: Camera2CameraImpl.java */
        public class b implements Runnable {

            /* JADX INFO: renamed from: f */
            public Executor f35626f;

            /* JADX INFO: renamed from: g */
            public boolean f35627g = false;

            public b(Executor executor) {
                this.f35626f = executor;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f35626f.execute(new Runnable() { // from class: z0.e.a.e.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        Camera2CameraImpl.f.b bVar = this.f35524f;
                        if (bVar.f35627g) {
                            return;
                        }
                        C8162a.m16065j(Camera2CameraImpl.this.f35585i == Camera2CameraImpl.e.REOPENING, null);
                        Camera2CameraImpl.this.m15173q(true);
                    }
                });
            }
        }

        public f(Executor executor, ScheduledExecutorService scheduledExecutorService) {
            this.f35619a = executor;
            this.f35620b = scheduledExecutorService;
        }

        /* JADX INFO: renamed from: a */
        public boolean m15181a() {
            if (this.f35622d == null) {
                return false;
            }
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            StringBuilder sbM1556G = outline.m1556G("Cancelling scheduled re-open: ");
            sbM1556G.append(this.f35621c);
            camera2CameraImpl.m15170m(sbM1556G.toString(), null);
            this.f35621c.f35627g = true;
            this.f35621c = null;
            this.f35622d.cancel(false);
            this.f35622d = null;
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m15182b() {
            boolean z = true;
            C8162a.m16065j(this.f35621c == null, null);
            C8162a.m16065j(this.f35622d == null, null);
            a aVar = this.f35623e;
            Objects.requireNonNull(aVar);
            long jUptimeMillis = SystemClock.uptimeMillis();
            long j2 = aVar.f35625a;
            if (j2 == -1) {
                aVar.f35625a = jUptimeMillis;
            } else {
                if (jUptimeMillis - j2 >= 10000) {
                    aVar.f35625a = -1L;
                    z = false;
                }
            }
            if (!z) {
                Logger8.m15273b("Camera2CameraImpl", "Camera reopening attempted for 10000ms without success.", null);
                Camera2CameraImpl.this.m15178v(e.INITIALIZED);
                return;
            }
            this.f35621c = new b(this.f35619a);
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            StringBuilder sbM1556G = outline.m1556G("Attempting camera re-open in 700ms: ");
            sbM1556G.append(this.f35621c);
            camera2CameraImpl.m15170m(sbM1556G.toString(), null);
            this.f35622d = this.f35620b.schedule(this.f35621c, 700L, TimeUnit.MILLISECONDS);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.m15170m("CameraDevice.onClosed()", null);
            C8162a.m16065j(Camera2CameraImpl.this.f35590n == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int iOrdinal = Camera2CameraImpl.this.f35585i.ordinal();
            if (iOrdinal != 4) {
                if (iOrdinal == 5) {
                    Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                    if (camera2CameraImpl.f35591o == 0) {
                        camera2CameraImpl.m15173q(false);
                        return;
                    }
                    StringBuilder sbM1556G = outline.m1556G("Camera closed due to error: ");
                    sbM1556G.append(Camera2CameraImpl.m15157o(Camera2CameraImpl.this.f35591o));
                    camera2CameraImpl.m15170m(sbM1556G.toString(), null);
                    m15182b();
                    return;
                }
                if (iOrdinal != 6) {
                    StringBuilder sbM1556G2 = outline.m1556G("Camera closed while in state: ");
                    sbM1556G2.append(Camera2CameraImpl.this.f35585i);
                    throw new IllegalStateException(sbM1556G2.toString());
                }
            }
            C8162a.m16065j(Camera2CameraImpl.this.m15172p(), null);
            Camera2CameraImpl.this.m15171n();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.m15170m("CameraDevice.onDisconnected()", null);
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.f35590n = cameraDevice;
            camera2CameraImpl.f35591o = i;
            int iOrdinal = camera2CameraImpl.f35585i.ordinal();
            if (iOrdinal != 2 && iOrdinal != 3) {
                if (iOrdinal != 4) {
                    if (iOrdinal != 5) {
                        if (iOrdinal != 6) {
                            StringBuilder sbM1556G = outline.m1556G("onError() should not be possible from state: ");
                            sbM1556G.append(Camera2CameraImpl.this.f35585i);
                            throw new IllegalStateException(sbM1556G.toString());
                        }
                    }
                }
                Logger8.m15273b("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), Camera2CameraImpl.m15157o(i), Camera2CameraImpl.this.f35585i.name()), null);
                Camera2CameraImpl.this.m15168k(false);
                return;
            }
            Logger8.m15272a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), Camera2CameraImpl.m15157o(i), Camera2CameraImpl.this.f35585i.name()), null);
            e eVar = e.REOPENING;
            boolean z = Camera2CameraImpl.this.f35585i == e.OPENING || Camera2CameraImpl.this.f35585i == e.OPENED || Camera2CameraImpl.this.f35585i == eVar;
            StringBuilder sbM1556G2 = outline.m1556G("Attempt to handle open error from non open state: ");
            sbM1556G2.append(Camera2CameraImpl.this.f35585i);
            C8162a.m16065j(z, sbM1556G2.toString());
            if (i == 1 || i == 2 || i == 4) {
                Logger8.m15272a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), Camera2CameraImpl.m15157o(i)), null);
                C8162a.m16065j(Camera2CameraImpl.this.f35591o != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
                Camera2CameraImpl.this.m15178v(eVar);
                Camera2CameraImpl.this.m15168k(false);
                return;
            }
            StringBuilder sbM1556G3 = outline.m1556G("Error observed on open (or opening) camera device ");
            sbM1556G3.append(cameraDevice.getId());
            sbM1556G3.append(": ");
            sbM1556G3.append(Camera2CameraImpl.m15157o(i));
            sbM1556G3.append(" closing camera.");
            Logger8.m15273b("Camera2CameraImpl", sbM1556G3.toString(), null);
            Camera2CameraImpl.this.m15178v(e.CLOSING);
            Camera2CameraImpl.this.m15168k(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            Camera2CameraImpl.this.m15170m("CameraDevice.onOpened()", null);
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            camera2CameraImpl.f35590n = cameraDevice;
            Objects.requireNonNull(camera2CameraImpl);
            try {
                Objects.requireNonNull(camera2CameraImpl.f35587k);
                CaptureRequest.Builder builderCreateCaptureRequest = cameraDevice.createCaptureRequest(1);
                FocusMeteringControl focusMeteringControl = camera2CameraImpl.f35587k.f35532h;
                Objects.requireNonNull(focusMeteringControl);
                focusMeteringControl.f35508h = (MeteringRectangle[]) builderCreateCaptureRequest.get(CaptureRequest.CONTROL_AF_REGIONS);
                focusMeteringControl.f35509i = (MeteringRectangle[]) builderCreateCaptureRequest.get(CaptureRequest.CONTROL_AE_REGIONS);
                focusMeteringControl.f35510j = (MeteringRectangle[]) builderCreateCaptureRequest.get(CaptureRequest.CONTROL_AWB_REGIONS);
            } catch (CameraAccessException e) {
                Logger8.m15273b("Camera2CameraImpl", "fail to create capture request.", e);
            }
            Camera2CameraImpl camera2CameraImpl2 = Camera2CameraImpl.this;
            camera2CameraImpl2.f35591o = 0;
            int iOrdinal = camera2CameraImpl2.f35585i.ordinal();
            if (iOrdinal != 2) {
                if (iOrdinal != 4) {
                    if (iOrdinal != 5) {
                        if (iOrdinal != 6) {
                            StringBuilder sbM1556G = outline.m1556G("onOpened() should not be possible from state: ");
                            sbM1556G.append(Camera2CameraImpl.this.f35585i);
                            throw new IllegalStateException(sbM1556G.toString());
                        }
                    }
                }
                C8162a.m16065j(Camera2CameraImpl.this.m15172p(), null);
                Camera2CameraImpl.this.f35590n.close();
                Camera2CameraImpl.this.f35590n = null;
                return;
            }
            Camera2CameraImpl.this.m15178v(e.OPENED);
            Camera2CameraImpl.this.m15174r();
        }
    }

    public Camera2CameraImpl(CameraManagerCompat cameraManagerCompat, String str, Camera2CameraInfoImpl camera2CameraInfoImpl, CameraStateRegistry cameraStateRegistry, Executor executor, Handler handler) throws CameraUnavailableException {
        LiveDataObservable<CameraInternal2.a> liveDataObservable = new LiveDataObservable<>();
        this.f35586j = liveDataObservable;
        this.f35591o = 0;
        this.f35593q = SessionConfig.m15370a();
        this.f35594r = new AtomicInteger(0);
        this.f35597u = new LinkedHashMap();
        this.f35600x = new HashSet();
        this.f35581B = new HashSet();
        this.f35583g = cameraManagerCompat;
        this.f35599w = cameraStateRegistry;
        HandlerScheduledExecutorService handlerScheduledExecutorService = new HandlerScheduledExecutorService(handler);
        SequentialExecutor sequentialExecutor = new SequentialExecutor(executor);
        this.f35584h = sequentialExecutor;
        this.f35588l = new f(sequentialExecutor, handlerScheduledExecutorService);
        this.f35582f = new UseCaseAttachState(str);
        liveDataObservable.f36309a.m16742k(new LiveDataObservable.a<>(CameraInternal2.a.CLOSED, null));
        CaptureSessionRepository captureSessionRepository = new CaptureSessionRepository(sequentialExecutor);
        this.f35602z = captureSessionRepository;
        this.f35592p = new CaptureSession();
        try {
            Camera2CameraControlImpl camera2CameraControlImpl = new Camera2CameraControlImpl(cameraManagerCompat.m15214b(str), handlerScheduledExecutorService, sequentialExecutor, new d(), camera2CameraInfoImpl.f35636e);
            this.f35587k = camera2CameraControlImpl;
            this.f35589m = camera2CameraInfoImpl;
            camera2CameraInfoImpl.m15187e(camera2CameraControlImpl);
            this.f35580A = new SynchronizedCaptureSessionOpener.a(sequentialExecutor, handlerScheduledExecutorService, handler, captureSessionRepository, camera2CameraInfoImpl.m15186d());
            c cVar = new c(str);
            this.f35598v = cVar;
            synchronized (cameraStateRegistry.f36124b) {
                C8162a.m16065j(!cameraStateRegistry.f36126d.containsKey(this), "Camera is already registered: " + this);
                cameraStateRegistry.f36126d.put(this, new CameraStateRegistry.a(null, sequentialExecutor, cVar));
            }
            cameraManagerCompat.f35783a.mo15216a(sequentialExecutor, cVar);
        } catch (CameraAccessExceptionCompat e2) {
            throw C7462a.m14567d(e2);
        }
    }

    /* JADX INFO: renamed from: o */
    public static String m15157o(int i) {
        if (i == 0) {
            return "ERROR_NONE";
        }
        if (i == 1) {
            return "ERROR_CAMERA_IN_USE";
        }
        if (i == 2) {
            return "ERROR_MAX_CAMERAS_IN_USE";
        }
        if (i == 3) {
            return "ERROR_CAMERA_DISABLED";
        }
        if (i != 4) {
            return i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE";
        }
        return "ERROR_CAMERA_DEVICE";
    }

    @Override // p636z0.p667e.p676b.UseCase.b
    /* JADX INFO: renamed from: a */
    public void mo15158a(final UseCase useCase) {
        this.f35584h.execute(new Runnable() { // from class: z0.e.a.e.l
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl camera2CameraImpl = this.f35515f;
                UseCase useCase2 = useCase;
                Objects.requireNonNull(camera2CameraImpl);
                camera2CameraImpl.m15170m("Use case " + useCase2 + " ACTIVE", null);
                try {
                    camera2CameraImpl.f35582f.m15402e(useCase2.m15303e() + useCase2.hashCode(), useCase2.f36023k);
                    camera2CameraImpl.f35582f.m15405h(useCase2.m15303e() + useCase2.hashCode(), useCase2.f36023k);
                    camera2CameraImpl.m15180x();
                } catch (NullPointerException unused) {
                    camera2CameraImpl.m15170m("Failed to set already detached use case active", null);
                }
            }
        });
    }

    @Override // p636z0.p667e.p676b.UseCase.b
    /* JADX INFO: renamed from: b */
    public void mo15159b(final UseCase useCase) {
        this.f35584h.execute(new Runnable() { // from class: z0.e.a.e.u
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl camera2CameraImpl = this.f35689f;
                UseCase useCase2 = useCase;
                Objects.requireNonNull(camera2CameraImpl);
                camera2CameraImpl.m15170m("Use case " + useCase2 + " RESET", null);
                camera2CameraImpl.f35582f.m15405h(useCase2.m15303e() + useCase2.hashCode(), useCase2.f36023k);
                camera2CameraImpl.m15177u(false);
                camera2CameraImpl.m15180x();
                if (camera2CameraImpl.f35585i == Camera2CameraImpl.e.OPENED) {
                    camera2CameraImpl.m15174r();
                }
            }
        });
    }

    @Override // p636z0.p667e.p676b.UseCase.b
    /* JADX INFO: renamed from: c */
    public void mo15160c(final UseCase useCase) {
        this.f35584h.execute(new Runnable() { // from class: z0.e.a.e.p
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl camera2CameraImpl = this.f35630f;
                UseCase useCase2 = useCase;
                Objects.requireNonNull(camera2CameraImpl);
                camera2CameraImpl.m15170m("Use case " + useCase2 + " UPDATED", null);
                camera2CameraImpl.f35582f.m15405h(useCase2.m15303e() + useCase2.hashCode(), useCase2.f36023k);
                camera2CameraImpl.m15180x();
            }
        });
    }

    @Override // p636z0.p667e.p676b.UseCase.b
    /* JADX INFO: renamed from: d */
    public void mo15161d(final UseCase useCase) {
        this.f35584h.execute(new Runnable() { // from class: z0.e.a.e.t
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl camera2CameraImpl = this.f35679f;
                UseCase useCase2 = useCase;
                Objects.requireNonNull(camera2CameraImpl);
                camera2CameraImpl.m15170m("Use case " + useCase2 + " INACTIVE", null);
                camera2CameraImpl.f35582f.m15404g(useCase2.m15303e() + useCase2.hashCode());
                camera2CameraImpl.m15180x();
            }
        });
    }

    @Override // p636z0.p667e.p676b.p677v1.CameraInternal2
    /* JADX INFO: renamed from: e */
    public CameraControlInternal mo15162e() {
        return this.f35587k;
    }

    @Override // p636z0.p667e.p676b.p677v1.CameraInternal2
    /* JADX INFO: renamed from: f */
    public /* synthetic */ CameraInfo mo15163f() {
        return CameraInternal.m15338a(this);
    }

    @Override // p636z0.p667e.p676b.p677v1.CameraInternal2
    /* JADX INFO: renamed from: g */
    public void mo15164g(final Collection<UseCase> collection) {
        if (collection.isEmpty()) {
            return;
        }
        Camera2CameraControlImpl camera2CameraControlImpl = this.f35587k;
        synchronized (camera2CameraControlImpl.f35528d) {
            camera2CameraControlImpl.f35538n++;
        }
        for (UseCase useCase : new ArrayList(collection)) {
            if (!this.f35581B.contains(useCase.m15303e() + useCase.hashCode())) {
                this.f35581B.add(useCase.m15303e() + useCase.hashCode());
            }
        }
        try {
            this.f35584h.execute(new Runnable() { // from class: z0.e.a.e.r
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2CameraImpl camera2CameraImpl = this.f35664f;
                    try {
                        camera2CameraImpl.m15179w(collection);
                    } finally {
                        camera2CameraImpl.f35587k.m15122e();
                    }
                }
            });
        } catch (RejectedExecutionException e2) {
            m15170m("Unable to attach use cases.", e2);
            this.f35587k.m15122e();
        }
    }

    @Override // p636z0.p667e.p676b.p677v1.CameraInternal2
    /* JADX INFO: renamed from: h */
    public void mo15165h(final Collection<UseCase> collection) {
        if (collection.isEmpty()) {
            return;
        }
        for (UseCase useCase : new ArrayList(collection)) {
            if (this.f35581B.contains(useCase.m15303e() + useCase.hashCode())) {
                this.f35581B.remove(useCase.m15303e() + useCase.hashCode());
            }
        }
        this.f35584h.execute(new Runnable() { // from class: z0.e.a.e.i
            @Override // java.lang.Runnable
            public final void run() {
                Camera2CameraImpl camera2CameraImpl = this.f35491f;
                Collection<UseCase> collection2 = collection;
                Objects.requireNonNull(camera2CameraImpl);
                ArrayList arrayList = new ArrayList();
                for (UseCase useCase2 : collection2) {
                    if (camera2CameraImpl.f35582f.m15401d(useCase2.m15303e() + useCase2.hashCode())) {
                        camera2CameraImpl.f35582f.f36222b.remove(useCase2.m15303e() + useCase2.hashCode());
                        arrayList.add(useCase2);
                    }
                }
                if (arrayList.isEmpty()) {
                    return;
                }
                StringBuilder sbM1556G = outline.m1556G("Use cases [");
                sbM1556G.append(TextUtils.join(", ", arrayList));
                sbM1556G.append("] now DETACHED for camera");
                camera2CameraImpl.m15170m(sbM1556G.toString(), null);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((UseCase) it.next()) instanceof Preview) {
                        Objects.requireNonNull(camera2CameraImpl.f35587k);
                        break;
                    }
                }
                camera2CameraImpl.m15167j();
                if (!camera2CameraImpl.f35582f.m15399b().isEmpty()) {
                    camera2CameraImpl.m15180x();
                    camera2CameraImpl.m15177u(false);
                    if (camera2CameraImpl.f35585i == Camera2CameraImpl.e.OPENED) {
                        camera2CameraImpl.m15174r();
                        return;
                    }
                    return;
                }
                camera2CameraImpl.f35587k.m15122e();
                camera2CameraImpl.m15177u(false);
                camera2CameraImpl.f35587k.m15127j(false);
                camera2CameraImpl.f35592p = new CaptureSession();
                Camera2CameraImpl.e eVar = Camera2CameraImpl.e.CLOSING;
                camera2CameraImpl.m15170m("Closing camera.", null);
                int iOrdinal = camera2CameraImpl.f35585i.ordinal();
                if (iOrdinal == 1) {
                    C8162a.m16065j(camera2CameraImpl.f35590n == null, null);
                    camera2CameraImpl.m15178v(Camera2CameraImpl.e.INITIALIZED);
                    return;
                }
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        camera2CameraImpl.m15178v(eVar);
                        camera2CameraImpl.m15168k(false);
                        return;
                    } else if (iOrdinal != 5) {
                        StringBuilder sbM1556G2 = outline.m1556G("close() ignored due to being in state: ");
                        sbM1556G2.append(camera2CameraImpl.f35585i);
                        camera2CameraImpl.m15170m(sbM1556G2.toString(), null);
                        return;
                    }
                }
                boolean zM15181a = camera2CameraImpl.f35588l.m15181a();
                camera2CameraImpl.m15178v(eVar);
                if (zM15181a) {
                    C8162a.m16065j(camera2CameraImpl.m15172p(), null);
                    camera2CameraImpl.m15171n();
                }
            }
        });
    }

    @Override // p636z0.p667e.p676b.p677v1.CameraInternal2
    /* JADX INFO: renamed from: i */
    public CameraInfoInternal mo15166i() {
        return this.f35589m;
    }

    /* JADX INFO: renamed from: j */
    public final void m15167j() {
        SessionConfig sessionConfigM15379b = this.f35582f.m15398a().m15379b();
        CaptureConfig captureConfig = sessionConfigM15379b.f36164f;
        int size = captureConfig.m15362a().size();
        int size2 = sessionConfigM15379b.m15371b().size();
        if (sessionConfigM15379b.m15371b().isEmpty()) {
            return;
        }
        if (!captureConfig.m15362a().isEmpty()) {
            if (size2 == 1 && size == 1) {
                m15176t();
                return;
            }
            if (size >= 2) {
                m15176t();
                return;
            }
            Logger8.m15272a("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size, null);
            return;
        }
        if (this.f35601y == null) {
            this.f35601y = new MeteringRepeatingSession(this.f35589m.f35633b);
        }
        if (this.f35601y != null) {
            UseCaseAttachState useCaseAttachState = this.f35582f;
            StringBuilder sb = new StringBuilder();
            Objects.requireNonNull(this.f35601y);
            sb.append("MeteringRepeating");
            sb.append(this.f35601y.hashCode());
            useCaseAttachState.m15403f(sb.toString(), this.f35601y.f35520b);
            UseCaseAttachState useCaseAttachState2 = this.f35582f;
            StringBuilder sb2 = new StringBuilder();
            Objects.requireNonNull(this.f35601y);
            sb2.append("MeteringRepeating");
            sb2.append(this.f35601y.hashCode());
            useCaseAttachState2.m15402e(sb2.toString(), this.f35601y.f35520b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00b7  */
    /* JADX INFO: renamed from: k */
    public void m15168k(boolean z) {
        boolean z2 = this.f35585i == e.CLOSING || this.f35585i == e.RELEASING || (this.f35585i == e.REOPENING && this.f35591o != 0);
        StringBuilder sbM1556G = outline.m1556G("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: ");
        sbM1556G.append(this.f35585i);
        sbM1556G.append(" (error: ");
        sbM1556G.append(m15157o(this.f35591o));
        sbM1556G.append(")");
        C8162a.m16065j(z2, sbM1556G.toString());
        int i = Build.VERSION.SDK_INT;
        if (i <= 23 || i >= 29) {
            m15177u(z);
        } else {
            if ((this.f35589m.m15186d() == 2) && this.f35591o == 0) {
                final CaptureSession captureSession = new CaptureSession();
                this.f35600x.add(captureSession);
                m15177u(z);
                final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(640, 480);
                final Surface surface = new Surface(surfaceTexture);
                final Runnable runnable = new Runnable() { // from class: z0.e.a.e.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        Surface surface2 = surface;
                        SurfaceTexture surfaceTexture2 = surfaceTexture;
                        surface2.release();
                        surfaceTexture2.release();
                    }
                };
                SessionConfig.b bVar = new SessionConfig.b();
                bVar.f36165a.add(new ImmediateSurface(surface));
                bVar.f36166b.f36151c = 1;
                m15170m("Start configAndClose.", null);
                SessionConfig sessionConfigM15377e = bVar.m15377e();
                CameraDevice cameraDevice = this.f35590n;
                Objects.requireNonNull(cameraDevice);
                captureSession.m15087h(sessionConfigM15377e, cameraDevice, this.f35580A.m15199a()).mo11664h(new Runnable() { // from class: z0.e.a.e.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        Camera2CameraImpl camera2CameraImpl = this.f35673f;
                        CaptureSession captureSession2 = captureSession;
                        Runnable runnable2 = runnable;
                        camera2CameraImpl.f35600x.remove(captureSession2);
                        camera2CameraImpl.m15175s(captureSession2, false).mo11664h(runnable2, C7462a.m14569f());
                    }
                }, this.f35584h);
            } else {
                m15177u(z);
            }
        }
        CaptureSession captureSession2 = this.f35592p;
        if (captureSession2.f35443b.isEmpty()) {
            return;
        }
        Iterator<CaptureConfig> it = captureSession2.f35443b.iterator();
        while (it.hasNext()) {
            Iterator<CameraCaptureCallback> it2 = it.next().f36146f.iterator();
            while (it2.hasNext()) {
                it2.next().mo15130a();
            }
        }
        captureSession2.f35443b.clear();
    }

    /* JADX INFO: renamed from: l */
    public final CameraDevice.StateCallback m15169l() {
        ArrayList arrayList = new ArrayList(this.f35582f.m15398a().m15379b().f36160b);
        arrayList.add(this.f35588l);
        arrayList.add(this.f35602z.f35476g);
        if (arrayList.isEmpty()) {
            return new CameraDeviceStateCallbacks();
        }
        return arrayList.size() == 1 ? (CameraDevice.StateCallback) arrayList.get(0) : new CameraDeviceStateCallbacks2(arrayList);
    }

    /* JADX INFO: renamed from: m */
    public final void m15170m(String str, Throwable th) {
        Logger8.m15272a("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th);
    }

    /* JADX INFO: renamed from: n */
    public void m15171n() {
        e eVar = e.CLOSING;
        C8162a.m16065j(this.f35585i == e.RELEASING || this.f35585i == eVar, null);
        C8162a.m16065j(this.f35597u.isEmpty(), null);
        this.f35590n = null;
        if (this.f35585i == eVar) {
            m15178v(e.INITIALIZED);
            return;
        }
        this.f35583g.f35783a.mo15217b(this.f35598v);
        m15178v(e.RELEASED);
        CallbackToFutureAdapter<Void> callbackToFutureAdapter = this.f35596t;
        if (callbackToFutureAdapter != null) {
            callbackToFutureAdapter.m15659a(null);
            this.f35596t = null;
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m15172p() {
        return this.f35597u.isEmpty() && this.f35600x.isEmpty();
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: q */
    public void m15173q(boolean z) {
        boolean z2;
        if (!z) {
            this.f35588l.f35623e.f35625a = -1L;
        }
        this.f35588l.m15181a();
        if (this.f35598v.f35607b) {
            CameraStateRegistry cameraStateRegistry = this.f35599w;
            synchronized (cameraStateRegistry.f36124b) {
                CameraStateRegistry.a aVar = cameraStateRegistry.f36126d.get(this);
                C8162a.m16063h(aVar, "Camera must first be registered with registerCamera()");
                if (Logger8.m15274c("CameraStateRegistry")) {
                    cameraStateRegistry.f36123a.setLength(0);
                    cameraStateRegistry.f36123a.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", this, Integer.valueOf(cameraStateRegistry.f36127e), Boolean.valueOf(CameraStateRegistry.m15349a(aVar.f36128a)), aVar.f36128a));
                }
                if (cameraStateRegistry.f36127e > 0 || CameraStateRegistry.m15349a(aVar.f36128a)) {
                    aVar.f36128a = CameraInternal2.a.OPENING;
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (Logger8.m15274c("CameraStateRegistry")) {
                    StringBuilder sb = cameraStateRegistry.f36123a;
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[1];
                    objArr[0] = z2 ? "SUCCESS" : "FAIL";
                    sb.append(String.format(locale, " --> %s", objArr));
                    Logger8.m15272a("CameraStateRegistry", cameraStateRegistry.f36123a.toString(), null);
                }
                if (z2) {
                    cameraStateRegistry.m15350b();
                }
            }
            if (z2) {
                m15178v(e.OPENING);
                m15170m("Opening camera.", null);
                try {
                    this.f35583g.f35783a.mo15219d(this.f35589m.f35632a, this.f35584h, m15169l());
                    return;
                } catch (SecurityException e2) {
                    StringBuilder sbM1556G = outline.m1556G("Unable to open camera due to ");
                    sbM1556G.append(e2.getMessage());
                    m15170m(sbM1556G.toString(), null);
                    m15178v(e.REOPENING);
                    this.f35588l.m15182b();
                    return;
                } catch (CameraAccessExceptionCompat e3) {
                    StringBuilder sbM1556G2 = outline.m1556G("Unable to open camera due to ");
                    sbM1556G2.append(e3.getMessage());
                    m15170m(sbM1556G2.toString(), null);
                    if (e3.f35713g != 10001) {
                        return;
                    }
                    m15178v(e.INITIALIZED);
                    return;
                }
            }
        }
        m15170m("No cameras available. Waiting for available camera before opening camera.", null);
        m15178v(e.PENDING_OPEN);
    }

    /* JADX INFO: renamed from: r */
    public void m15174r() {
        boolean z = false;
        C8162a.m16065j(this.f35585i == e.OPENED, null);
        SessionConfig.f fVarM15398a = this.f35582f.m15398a();
        if (fVarM15398a.f36175h && fVarM15398a.f36174g) {
            z = true;
        }
        if (!z) {
            m15170m("Unable to create capture session due to conflicting configurations", null);
            return;
        }
        CaptureSession captureSession = this.f35592p;
        SessionConfig sessionConfigM15379b = fVarM15398a.m15379b();
        CameraDevice cameraDevice = this.f35590n;
        Objects.requireNonNull(cameraDevice);
        ListenableFuture<Void> listenableFutureM15087h = captureSession.m15087h(sessionConfigM15379b, cameraDevice, this.f35580A.m15199a());
        listenableFutureM15087h.mo11664h(new Futures2.d(listenableFutureM15087h, new b()), this.f35584h);
    }

    @Override // p636z0.p667e.p676b.p677v1.CameraInternal2
    public ListenableFuture<Void> release() {
        return C7944a.m15540a(new CallbackToFutureAdapter3() { // from class: z0.e.a.e.o
            @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
            /* JADX INFO: renamed from: a */
            public final Object mo15078a(final CallbackToFutureAdapter callbackToFutureAdapter) {
                final Camera2CameraImpl camera2CameraImpl = this.f35579a;
                camera2CameraImpl.f35584h.execute(new Runnable() { // from class: z0.e.a.e.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        final Camera2CameraImpl camera2CameraImpl2 = camera2CameraImpl;
                        CallbackToFutureAdapter callbackToFutureAdapter2 = callbackToFutureAdapter;
                        Camera2CameraImpl.e eVar = Camera2CameraImpl.e.RELEASING;
                        if (camera2CameraImpl2.f35595s == null) {
                            if (camera2CameraImpl2.f35585i != Camera2CameraImpl.e.RELEASED) {
                                camera2CameraImpl2.f35595s = C7944a.m15540a(new CallbackToFutureAdapter3() { // from class: z0.e.a.e.n
                                    @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo15078a(CallbackToFutureAdapter callbackToFutureAdapter3) {
                                        Camera2CameraImpl camera2CameraImpl3 = camera2CameraImpl2;
                                        C8162a.m16065j(camera2CameraImpl3.f35596t == null, "Camera can only be released once, so release completer should be null on creation.");
                                        camera2CameraImpl3.f35596t = callbackToFutureAdapter3;
                                        return "Release[camera=" + camera2CameraImpl3 + "]";
                                    }
                                });
                            } else {
                                camera2CameraImpl2.f35595s = Futures2.m15428c(null);
                            }
                        }
                        ListenableFuture<Void> listenableFuture = camera2CameraImpl2.f35595s;
                        switch (camera2CameraImpl2.f35585i) {
                            case INITIALIZED:
                            case PENDING_OPEN:
                                C8162a.m16065j(camera2CameraImpl2.f35590n == null, null);
                                camera2CameraImpl2.m15178v(eVar);
                                C8162a.m16065j(camera2CameraImpl2.m15172p(), null);
                                camera2CameraImpl2.m15171n();
                                break;
                            case OPENING:
                            case CLOSING:
                            case REOPENING:
                            case RELEASING:
                                boolean zM15181a = camera2CameraImpl2.f35588l.m15181a();
                                camera2CameraImpl2.m15178v(eVar);
                                if (zM15181a) {
                                    C8162a.m16065j(camera2CameraImpl2.m15172p(), null);
                                    camera2CameraImpl2.m15171n();
                                }
                                break;
                            case OPENED:
                                camera2CameraImpl2.m15178v(eVar);
                                camera2CameraImpl2.m15168k(false);
                                break;
                            default:
                                StringBuilder sbM1556G = outline.m1556G("release() ignored due to being in state: ");
                                sbM1556G.append(camera2CameraImpl2.f35585i);
                                camera2CameraImpl2.m15170m(sbM1556G.toString(), null);
                                break;
                        }
                        Futures2.m15430e(listenableFuture, callbackToFutureAdapter2);
                    }
                });
                return "Release[request=" + camera2CameraImpl.f35594r.getAndIncrement() + "]";
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public ListenableFuture<Void> m15175s(final CaptureSession captureSession, boolean z) {
        ListenableFuture<Void> listenableFutureM15428c;
        CaptureSession.c cVar = CaptureSession.c.RELEASED;
        synchronized (captureSession.f35442a) {
            int iOrdinal = captureSession.f35453l.ordinal();
            if (iOrdinal == 0) {
                throw new IllegalStateException("close() should not be possible in state: " + captureSession.f35453l);
            }
            if (iOrdinal == 1) {
                captureSession.f35453l = cVar;
            } else if (iOrdinal == 2) {
                C8162a.m16063h(captureSession.f35446e, "The Opener shouldn't null in state:" + captureSession.f35453l);
                captureSession.f35446e.m15198a();
                captureSession.f35453l = cVar;
            } else if (iOrdinal == 3) {
                C8162a.m16063h(captureSession.f35446e, "The Opener shouldn't null in state:" + captureSession.f35453l);
                captureSession.f35446e.m15198a();
                captureSession.f35453l = CaptureSession.c.CLOSED;
                captureSession.f35448g = null;
            } else if (iOrdinal == 4) {
                if (captureSession.f35448g != null) {
                    CameraEventCallbacks.a aVarM15076c = captureSession.f35450i.m15076c();
                    ArrayList arrayList = new ArrayList();
                    Iterator<CameraEventCallback> it = aVarM15076c.f35422a.iterator();
                    while (it.hasNext()) {
                        Objects.requireNonNull(it.next());
                    }
                    if (!arrayList.isEmpty()) {
                        try {
                            captureSession.m15084d(captureSession.m15089j(arrayList));
                        } catch (IllegalStateException e2) {
                            Logger8.m15273b("CaptureSession", "Unable to issue the request before close the capture session", e2);
                        }
                    }
                }
                C8162a.m16063h(captureSession.f35446e, "The Opener shouldn't null in state:" + captureSession.f35453l);
                captureSession.f35446e.m15198a();
                captureSession.f35453l = CaptureSession.c.CLOSED;
                captureSession.f35448g = null;
            }
        }
        synchronized (captureSession.f35442a) {
            switch (captureSession.f35453l.ordinal()) {
                case 0:
                    throw new IllegalStateException("release() should not be possible in state: " + captureSession.f35453l);
                case 2:
                    C8162a.m16063h(captureSession.f35446e, "The Opener shouldn't null in state:" + captureSession.f35453l);
                    captureSession.f35446e.m15198a();
                case 1:
                    captureSession.f35453l = cVar;
                    listenableFutureM15428c = Futures2.m15428c(null);
                    break;
                case 4:
                case 5:
                    SynchronizedCaptureSession synchronizedCaptureSession = captureSession.f35447f;
                    if (synchronizedCaptureSession != null) {
                        if (z) {
                            try {
                                synchronizedCaptureSession.mo15149e();
                            } catch (CameraAccessException e3) {
                                Logger8.m15273b("CaptureSession", "Unable to abort captures.", e3);
                            }
                        }
                        captureSession.f35447f.close();
                        break;
                    }
                case 3:
                    captureSession.f35453l = CaptureSession.c.RELEASING;
                    C8162a.m16063h(captureSession.f35446e, "The Opener shouldn't null in state:" + captureSession.f35453l);
                    if (captureSession.f35446e.m15198a()) {
                        captureSession.m15082b();
                        listenableFutureM15428c = Futures2.m15428c(null);
                        break;
                    }
                case 6:
                    if (captureSession.f35454m == null) {
                        captureSession.f35454m = C7944a.m15540a(new CallbackToFutureAdapter3() { // from class: z0.e.a.e.v
                            @Override // p636z0.p693h.p694a.CallbackToFutureAdapter3
                            /* JADX INFO: renamed from: a */
                            public final Object mo15078a(CallbackToFutureAdapter callbackToFutureAdapter) {
                                String str;
                                CaptureSession captureSession2 = captureSession;
                                synchronized (captureSession2.f35442a) {
                                    C8162a.m16065j(captureSession2.f35455n == null, "Release completer expected to be null");
                                    captureSession2.f35455n = callbackToFutureAdapter;
                                    str = "Release[session=" + captureSession2 + "]";
                                }
                                return str;
                            }
                        });
                    }
                    listenableFutureM15428c = captureSession.f35454m;
                    break;
                default:
                    listenableFutureM15428c = Futures2.m15428c(null);
                    break;
            }
        }
        StringBuilder sbM1556G = outline.m1556G("Releasing session in state ");
        sbM1556G.append(this.f35585i.name());
        m15170m(sbM1556G.toString(), null);
        this.f35597u.put(captureSession, listenableFutureM15428c);
        listenableFutureM15428c.mo11664h(new Futures2.d(listenableFutureM15428c, new a(captureSession)), C7462a.m14569f());
        return listenableFutureM15428c;
    }

    /* JADX INFO: renamed from: t */
    public final void m15176t() {
        if (this.f35601y != null) {
            UseCaseAttachState useCaseAttachState = this.f35582f;
            StringBuilder sb = new StringBuilder();
            Objects.requireNonNull(this.f35601y);
            sb.append("MeteringRepeating");
            sb.append(this.f35601y.hashCode());
            String string = sb.toString();
            if (useCaseAttachState.f36222b.containsKey(string)) {
                UseCaseAttachState.b bVar = useCaseAttachState.f36222b.get(string);
                bVar.f36224b = false;
                if (!bVar.f36225c) {
                    useCaseAttachState.f36222b.remove(string);
                }
            }
            UseCaseAttachState useCaseAttachState2 = this.f35582f;
            StringBuilder sb2 = new StringBuilder();
            Objects.requireNonNull(this.f35601y);
            sb2.append("MeteringRepeating");
            sb2.append(this.f35601y.hashCode());
            useCaseAttachState2.m15404g(sb2.toString());
            MeteringRepeatingSession meteringRepeatingSession = this.f35601y;
            Objects.requireNonNull(meteringRepeatingSession);
            Logger8.m15272a("MeteringRepeating", "MeteringRepeating clear!", null);
            DeferrableSurface deferrableSurface = meteringRepeatingSession.f35519a;
            if (deferrableSurface != null) {
                deferrableSurface.m15388a();
            }
            meteringRepeatingSession.f35519a = null;
            this.f35601y = null;
        }
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f35589m.f35632a);
    }

    /* JADX INFO: renamed from: u */
    public void m15177u(boolean z) {
        SessionConfig sessionConfig;
        List<CaptureConfig> listUnmodifiableList;
        C8162a.m16065j(this.f35592p != null, null);
        m15170m("Resetting Capture Session", null);
        CaptureSession captureSession = this.f35592p;
        synchronized (captureSession.f35442a) {
            sessionConfig = captureSession.f35448g;
        }
        synchronized (captureSession.f35442a) {
            listUnmodifiableList = Collections.unmodifiableList(captureSession.f35443b);
        }
        CaptureSession captureSession2 = new CaptureSession();
        this.f35592p = captureSession2;
        captureSession2.m15088i(sessionConfig);
        this.f35592p.m15084d(listUnmodifiableList);
        m15175s(captureSession, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: v */
    public void m15178v(e eVar) {
        CameraInternal2.a aVar;
        CameraInternal2.a aVar2;
        ?? SingletonList;
        CameraInternal2.a aVar3 = CameraInternal2.a.RELEASED;
        CameraInternal2.a aVar4 = CameraInternal2.a.PENDING_OPEN;
        CameraInternal2.a aVar5 = CameraInternal2.a.OPENING;
        StringBuilder sbM1556G = outline.m1556G("Transitioning camera internal state: ");
        sbM1556G.append(this.f35585i);
        sbM1556G.append(" --> ");
        sbM1556G.append(eVar);
        m15170m(sbM1556G.toString(), null);
        this.f35585i = eVar;
        switch (eVar) {
            case INITIALIZED:
                aVar = CameraInternal2.a.CLOSED;
                break;
            case PENDING_OPEN:
                aVar = aVar4;
                break;
            case OPENING:
            case REOPENING:
                aVar = aVar5;
                break;
            case OPENED:
                aVar = CameraInternal2.a.OPEN;
                break;
            case CLOSING:
                aVar = CameraInternal2.a.CLOSING;
                break;
            case RELEASING:
                aVar = CameraInternal2.a.RELEASING;
                break;
            case RELEASED:
                aVar = aVar3;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + eVar);
        }
        CameraStateRegistry cameraStateRegistry = this.f35599w;
        synchronized (cameraStateRegistry.f36124b) {
            int i = cameraStateRegistry.f36127e;
            if (aVar == aVar3) {
                CameraStateRegistry.a aVarRemove = cameraStateRegistry.f36126d.remove(this);
                if (aVarRemove != null) {
                    cameraStateRegistry.m15350b();
                    aVar2 = aVarRemove.f36128a;
                } else {
                    aVar2 = null;
                }
            } else {
                CameraStateRegistry.a aVar6 = cameraStateRegistry.f36126d.get(this);
                C8162a.m16063h(aVar6, "Cannot update state of camera which has not yet been registered. Register with CameraAvailabilityRegistry.registerCamera()");
                CameraInternal2.a aVar7 = aVar6.f36128a;
                aVar6.f36128a = aVar;
                if (aVar == aVar5) {
                    C8162a.m16065j(CameraStateRegistry.m15349a(aVar) || aVar7 == aVar5, "Cannot mark camera as opening until camera was successful at calling CameraAvailabilityRegistry.tryOpen()");
                }
                if (aVar7 != aVar) {
                    cameraStateRegistry.m15350b();
                }
                aVar2 = aVar7;
            }
            if (aVar2 != aVar) {
                if (i >= 1 || cameraStateRegistry.f36127e <= 0) {
                    SingletonList = (aVar != aVar4 || cameraStateRegistry.f36127e <= 0) ? 0 : Collections.singletonList(cameraStateRegistry.f36126d.get(this));
                } else {
                    SingletonList = new ArrayList();
                    for (Map.Entry<Camera2, CameraStateRegistry.a> entry : cameraStateRegistry.f36126d.entrySet()) {
                        if (entry.getValue().f36128a == aVar4) {
                            SingletonList.add(entry.getValue());
                        }
                    }
                }
                if (SingletonList != 0) {
                    for (CameraStateRegistry.a aVar8 : SingletonList) {
                        Objects.requireNonNull(aVar8);
                        try {
                            Executor executor = aVar8.f36129b;
                            final CameraStateRegistry.b bVar = aVar8.f36130c;
                            Objects.requireNonNull(bVar);
                            executor.execute(new Runnable() { // from class: z0.e.b.v1.l
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Camera2CameraImpl.c cVar = (Camera2CameraImpl.c) bVar;
                                    if (Camera2CameraImpl.this.f35585i == Camera2CameraImpl.e.PENDING_OPEN) {
                                        Camera2CameraImpl.this.m15173q(false);
                                    }
                                }
                            });
                        } catch (RejectedExecutionException e2) {
                            Logger8.m15273b("CameraStateRegistry", "Unable to notify camera.", e2);
                        }
                    }
                }
            }
        }
        this.f35586j.f36309a.m16742k(new LiveDataObservable.a<>(aVar, null));
    }

    /* JADX INFO: renamed from: w */
    public final void m15179w(Collection<UseCase> collection) {
        boolean zIsEmpty = this.f35582f.m15399b().isEmpty();
        ArrayList<UseCase> arrayList = new ArrayList();
        for (UseCase useCase : collection) {
            if (!this.f35582f.m15401d(useCase.m15303e() + useCase.hashCode())) {
                try {
                    this.f35582f.m15403f(useCase.m15303e() + useCase.hashCode(), useCase.f36023k);
                    arrayList.add(useCase);
                } catch (NullPointerException unused) {
                    m15170m("Failed to attach a detached use case", null);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        StringBuilder sbM1556G = outline.m1556G("Use cases [");
        sbM1556G.append(TextUtils.join(", ", arrayList));
        sbM1556G.append("] now ATTACHED");
        m15170m(sbM1556G.toString(), null);
        if (zIsEmpty) {
            this.f35587k.m15127j(true);
            Camera2CameraControlImpl camera2CameraControlImpl = this.f35587k;
            synchronized (camera2CameraControlImpl.f35528d) {
                camera2CameraControlImpl.f35538n++;
            }
        }
        m15167j();
        m15180x();
        m15177u(false);
        e eVar = this.f35585i;
        e eVar2 = e.OPENED;
        if (eVar == eVar2) {
            m15174r();
        } else {
            int iOrdinal = this.f35585i.ordinal();
            if (iOrdinal == 0) {
                m15173q(false);
            } else if (iOrdinal != 4) {
                StringBuilder sbM1556G2 = outline.m1556G("open() ignored due to being in state: ");
                sbM1556G2.append(this.f35585i);
                m15170m(sbM1556G2.toString(), null);
            } else {
                m15178v(e.REOPENING);
                if (!m15172p() && this.f35591o == 0) {
                    C8162a.m16065j(this.f35590n != null, "Camera Device should be open if session close is not complete");
                    m15178v(eVar2);
                    m15174r();
                }
            }
        }
        for (UseCase useCase2 : arrayList) {
            if (useCase2 instanceof Preview) {
                Size size = useCase2.f36019g;
                if (size != null) {
                    new Rational(size.getWidth(), size.getHeight());
                    Objects.requireNonNull(this.f35587k);
                    return;
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public void m15180x() {
        UseCaseAttachState useCaseAttachState = this.f35582f;
        Objects.requireNonNull(useCaseAttachState);
        SessionConfig.f fVar = new SessionConfig.f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, UseCaseAttachState.b> entry : useCaseAttachState.f36222b.entrySet()) {
            UseCaseAttachState.b value = entry.getValue();
            if (value.f36225c && value.f36224b) {
                String key = entry.getKey();
                fVar.m15378a(value.f36223a);
                arrayList.add(key);
            }
        }
        Logger8.m15272a("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + useCaseAttachState.f36221a, null);
        if (!(fVar.f36175h && fVar.f36174g)) {
            this.f35592p.m15088i(this.f35593q);
        } else {
            fVar.m15378a(this.f35593q);
            this.f35592p.m15088i(fVar.m15379b());
        }
    }
}
