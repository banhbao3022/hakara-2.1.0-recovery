package p636z0.p667e.p676b;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p007c.p071d.p078c.p079a.outline;
import p007c.p114h.p115a.p116a.C0836a;
import p007c.p114h.p115a.p116a.CameraXController;
import p007c.p114h.p115a.p116a.OnSurfaceTextureListener;
import p007c.p114h.p115a.p119d.CameraPreviewPresenter;
import p007c.p114h.p115a.p120e.CameraRenderHandler;
import p007c.p114h.p115a.p120e.CameraRenderer;
import p007c.p114h.p123c.p124a.FaceTracker;
import p007c.p114h.p123c.p124a.FaceTracker2;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p644b.C7462a;
import p636z0.p667e.p676b.p677v1.CameraCaptureCallback;
import p636z0.p667e.p676b.p677v1.CameraCaptureResult;
import p636z0.p667e.p676b.p677v1.CameraInfoInternal;
import p636z0.p667e.p676b.p677v1.CameraInternal2;
import p636z0.p667e.p676b.p677v1.CaptureProcessor;
import p636z0.p667e.p676b.p677v1.CaptureStage;
import p636z0.p667e.p676b.p677v1.Config2;
import p636z0.p667e.p676b.p677v1.Config3;
import p636z0.p667e.p676b.p677v1.DeferrableSurface;
import p636z0.p667e.p676b.p677v1.ImageInfoProcessor;
import p636z0.p667e.p676b.p677v1.ImageInputConfig2;
import p636z0.p667e.p676b.p677v1.ImageOutputConfig2;
import p636z0.p667e.p676b.p677v1.MutableConfig;
import p636z0.p667e.p676b.p677v1.MutableOptionsBundle;
import p636z0.p667e.p676b.p677v1.OptionsBundle;
import p636z0.p667e.p676b.p677v1.PreviewConfig;
import p636z0.p667e.p676b.p677v1.SessionConfig;
import p636z0.p667e.p676b.p677v1.UseCaseConfig2;
import p636z0.p667e.p676b.p677v1.UseCaseConfigFactory;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.Futures2;
import p636z0.p667e.p676b.p681w1.CameraCaptureResultImageInfo;
import p636z0.p667e.p676b.p681w1.TargetConfig2;
import p636z0.p725k.C8162a;
import p636z0.p725k.p738k.Consumer2;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: z0.e.b.l1, reason: use source file name */
/* JADX INFO: compiled from: Preview.java */
/* JADX INFO: loaded from: classes.dex */
public final class Preview extends UseCase {

    /* JADX INFO: renamed from: l */
    public static final c f35936l = new c();

    /* JADX INFO: renamed from: m */
    public static final Executor f35937m = C7462a.m14576m();

    /* JADX INFO: renamed from: n */
    public d f35938n;

    /* JADX INFO: renamed from: o */
    public Executor f35939o;

    /* JADX INFO: renamed from: p */
    public DeferrableSurface f35940p;

    /* JADX INFO: renamed from: q */
    public SurfaceRequest f35941q;

    /* JADX INFO: renamed from: r */
    public boolean f35942r;

    /* JADX INFO: renamed from: s */
    public Size f35943s;

    /* JADX INFO: renamed from: z0.e.b.l1$a */
    /* JADX INFO: compiled from: Preview.java */
    public class a extends CameraCaptureCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ImageInfoProcessor f35944a;

        public a(ImageInfoProcessor imageInfoProcessor) {
            this.f35944a = imageInfoProcessor;
        }

        @Override // p636z0.p667e.p676b.p677v1.CameraCaptureCallback
        /* JADX INFO: renamed from: b */
        public void mo15131b(CameraCaptureResult cameraCaptureResult) {
            if (this.f35944a.m15406a(new CameraCaptureResultImageInfo(cameraCaptureResult))) {
                Preview preview = Preview.this;
                Iterator<UseCase.b> it = preview.f36013a.iterator();
                while (it.hasNext()) {
                    it.next().mo15160c(preview);
                }
            }
        }
    }

    /* JADX INFO: renamed from: z0.e.b.l1$b */
    /* JADX INFO: compiled from: Preview.java */
    public static final class b implements UseCaseConfig2.a<Preview, PreviewConfig, b> {

        /* JADX INFO: renamed from: a */
        public final MutableOptionsBundle f35946a;

        public b() {
            this(MutableOptionsBundle.m15434y());
        }

        @Override // p636z0.p667e.p676b.ExtendableBuilder
        /* JADX INFO: renamed from: a */
        public MutableConfig mo15071a() {
            return this.f35946a;
        }

        @Override // p636z0.p667e.p676b.p677v1.UseCaseConfig2.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public PreviewConfig mo15252b() {
            return new PreviewConfig(OptionsBundle.m15339x(this.f35946a));
        }

        public b(MutableOptionsBundle mutableOptionsBundle) {
            this.f35946a = mutableOptionsBundle;
            Config3.a<Class<?>> aVar = TargetConfig2.f36349o;
            Class cls = (Class) mutableOptionsBundle.mo15105d(aVar, null);
            if (cls != null && !cls.equals(Preview.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            Config3.c cVar = Config3.c.OPTIONAL;
            mutableOptionsBundle.m15436A(aVar, cVar, Preview.class);
            Config3.a<String> aVar2 = TargetConfig2.f36348n;
            if (mutableOptionsBundle.mo15105d(aVar2, null) == null) {
                mutableOptionsBundle.m15436A(aVar2, cVar, Preview.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }
    }

    /* JADX INFO: renamed from: z0.e.b.l1$c */
    /* JADX INFO: compiled from: Preview.java */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public static final PreviewConfig f35947a;

        static {
            b bVar = new b();
            MutableOptionsBundle mutableOptionsBundle = bVar.f35946a;
            Config3.a<Integer> aVar = UseCaseConfig2.f36235l;
            Config3.c cVar = Config3.c.OPTIONAL;
            mutableOptionsBundle.m15436A(aVar, cVar, 2);
            bVar.f35946a.m15436A(ImageOutputConfig2.f36299b, cVar, 0);
            f35947a = bVar.mo15252b();
        }
    }

    /* JADX INFO: renamed from: z0.e.b.l1$d */
    /* JADX INFO: compiled from: Preview.java */
    public interface d {
    }

    public Preview(PreviewConfig previewConfig) {
        super(previewConfig);
        this.f35939o = f35937m;
        this.f35942r = false;
    }

    @Override // p636z0.p667e.p676b.UseCase
    /* JADX INFO: renamed from: c */
    public UseCaseConfig2<?> mo15246c(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Config3 config3Mo15201a = useCaseConfigFactory.mo15201a(UseCaseConfigFactory.a.PREVIEW);
        if (z) {
            Objects.requireNonNull(f35936l);
            config3Mo15201a = Config2.m15381a(config3Mo15201a, c.f35947a);
        }
        if (config3Mo15201a == null) {
            return null;
        }
        return new b(MutableOptionsBundle.m15435z(config3Mo15201a)).mo15252b();
    }

    @Override // p636z0.p667e.p676b.UseCase
    /* JADX INFO: renamed from: f */
    public UseCaseConfig2.a<?, ?, ?> mo15247f(Config3 config3) {
        return new b(MutableOptionsBundle.m15435z(config3));
    }

    @Override // p636z0.p667e.p676b.UseCase
    /* JADX INFO: renamed from: m */
    public void mo15249m() {
        DeferrableSurface deferrableSurface = this.f35940p;
        if (deferrableSurface != null) {
            deferrableSurface.m15388a();
        }
        this.f35941q = null;
    }

    @Override // p636z0.p667e.p676b.UseCase
    /* JADX INFO: renamed from: n */
    public UseCaseConfig2<?> mo15281n(CameraInfoInternal cameraInfoInternal, UseCaseConfig2.a<?, ?, ?> aVar) {
        Config3.c cVar = Config3.c.OPTIONAL;
        if (((OptionsBundle) aVar.mo15071a()).mo15105d(PreviewConfig.f36120s, null) != null) {
            ((MutableOptionsBundle) aVar.mo15071a()).m15436A(ImageInputConfig2.f36237a, cVar, 35);
        } else {
            ((MutableOptionsBundle) aVar.mo15071a()).m15436A(ImageInputConfig2.f36237a, cVar, 34);
        }
        return aVar.mo15252b();
    }

    @Override // p636z0.p667e.p676b.UseCase
    /* JADX INFO: renamed from: o */
    public Size mo15250o(Size size) {
        this.f35943s = size;
        this.f36023k = m15282p(m15301b(), (PreviewConfig) this.f36018f, this.f35943s).m15377e();
        return size;
    }

    /* JADX INFO: renamed from: p */
    public SessionConfig.b m15282p(final String str, final PreviewConfig previewConfig, final Size size) {
        CameraCaptureCallback cameraCaptureCallback;
        C7462a.m14566c();
        SessionConfig.b bVarM15372f = SessionConfig.b.m15372f(previewConfig);
        CaptureProcessor captureProcessor = (CaptureProcessor) previewConfig.mo15105d(PreviewConfig.f36120s, null);
        DeferrableSurface deferrableSurface = this.f35940p;
        if (deferrableSurface != null) {
            deferrableSurface.m15388a();
        }
        SurfaceRequest surfaceRequest = new SurfaceRequest(size, m15300a(), captureProcessor != null);
        this.f35941q = surfaceRequest;
        if (m15283q()) {
            m15284r();
        } else {
            this.f35942r = true;
        }
        if (captureProcessor != null) {
            CaptureStage.a aVar = new CaptureStage.a();
            final HandlerThread handlerThread = new HandlerThread("CameraX-preview_processing");
            handlerThread.start();
            String string = Integer.toString(aVar.hashCode());
            ProcessingSurface processingSurface = new ProcessingSurface(size.getWidth(), size.getHeight(), previewConfig.mo15108i(), new Handler(handlerThread.getLooper()), aVar, captureProcessor, surfaceRequest.f35998g, string);
            synchronized (processingSurface.f35951i) {
                if (processingSurface.f35953k) {
                    throw new IllegalStateException("ProcessingSurface already released!");
                }
                cameraCaptureCallback = processingSurface.f35960r;
            }
            bVarM15372f.m15373a(cameraCaptureCallback);
            processingSurface.m15391d().mo11664h(new Runnable() { // from class: z0.e.b.a
                @Override // java.lang.Runnable
                public final void run() {
                    handlerThread.quitSafely();
                }
            }, C7462a.m14569f());
            this.f35940p = processingSurface;
            bVarM15372f.f36166b.f36154f.f36213b.put(string, 0);
        } else {
            ImageInfoProcessor imageInfoProcessor = (ImageInfoProcessor) previewConfig.mo15105d(PreviewConfig.f36119r, null);
            if (imageInfoProcessor != null) {
                a aVar2 = new a(imageInfoProcessor);
                bVarM15372f.f36166b.m15364b(aVar2);
                bVarM15372f.f36170f.add(aVar2);
            }
            this.f35940p = surfaceRequest.f35998g;
        }
        bVarM15372f.m15376d(this.f35940p);
        bVarM15372f.f36169e.add(new SessionConfig.c() { // from class: z0.e.b.u
            @Override // p636z0.p667e.p676b.p677v1.SessionConfig.c
            /* JADX INFO: renamed from: a */
            public final void mo15290a(SessionConfig sessionConfig, SessionConfig.e eVar) {
                Preview preview = this.f36026a;
                String str2 = str;
                PreviewConfig previewConfig2 = previewConfig;
                Size size2 = size;
                if (preview.m15300a() == null ? false : Objects.equals(str2, preview.m15301b())) {
                    preview.f36023k = preview.m15282p(str2, previewConfig2, size2).m15377e();
                    preview.m15305h();
                }
            }
        });
        return bVarM15372f;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m15283q() {
        final SurfaceRequest surfaceRequest = this.f35941q;
        final d dVar = this.f35938n;
        if (dVar == null || surfaceRequest == null) {
            return false;
        }
        this.f35939o.execute(new Runnable() { // from class: z0.e.b.v
            @Override // java.lang.Runnable
            public final void run() {
                Preview.d dVar2 = dVar;
                SurfaceRequest surfaceRequest2 = surfaceRequest;
                final CameraXController cameraXController = ((C0836a) dVar2).f3836a;
                Objects.requireNonNull(cameraXController);
                Size size = surfaceRequest2.f35992a;
                if (cameraXController.f3861n == null) {
                    SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                    cameraXController.f3861n = surfaceTexture;
                    surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
                    cameraXController.f3861n.detachFromGLContext();
                    cameraXController.f3861n.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: c.h.a.a.c
                        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                        public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                            OnFrameAvailableListener onFrameAvailableListener = cameraXController.f3860m;
                            if (onFrameAvailableListener != null) {
                            }
                        }
                    });
                }
                final Surface surface = new Surface(cameraXController.f3861n);
                Executor executor = cameraXController.f3856i;
                final Consumer2 consumer2 = new Consumer2() { // from class: c.h.a.a.b
                    @Override // p636z0.p725k.p738k.Consumer2
                    /* JADX INFO: renamed from: a */
                    public final void mo2060a(Object obj) {
                        surface.release();
                    }
                };
                if (surfaceRequest2.f35995d.m15659a(surface) || surfaceRequest2.f35994c.isCancelled()) {
                    ListenableFuture<Void> listenableFuture = surfaceRequest2.f35996e;
                    listenableFuture.mo11664h(new Futures2.d(listenableFuture, new SurfaceRequest2(surfaceRequest2, consumer2, surface)), executor);
                } else {
                    C8162a.m16065j(surfaceRequest2.f35994c.isDone(), null);
                    try {
                        surfaceRequest2.f35994c.get();
                        executor.execute(new Runnable() { // from class: z0.e.b.a0
                            @Override // java.lang.Runnable
                            public final void run() {
                                consumer2.mo2060a(new AutoValue_SurfaceRequest_Result(3, surface));
                            }
                        });
                    } catch (InterruptedException | ExecutionException unused) {
                        executor.execute(new Runnable() { // from class: z0.e.b.b0
                            @Override // java.lang.Runnable
                            public final void run() {
                                consumer2.mo2060a(new AutoValue_SurfaceRequest_Result(4, surface));
                            }
                        });
                    }
                }
                OnSurfaceTextureListener onSurfaceTextureListener = cameraXController.f3859l;
                if (onSurfaceTextureListener != null) {
                    final SurfaceTexture surfaceTexture2 = cameraXController.f3861n;
                    CameraPreviewPresenter cameraPreviewPresenter = (CameraPreviewPresenter) onSurfaceTextureListener;
                    StringBuilder sbM1556G = outline.m1556G("onCameraOpened: orientation - ");
                    sbM1556G.append(((CameraXController) cameraPreviewPresenter.f3906q).f3850c);
                    sbM1556G.append("width - ");
                    sbM1556G.append(((CameraXController) cameraPreviewPresenter.f3906q).m2063c());
                    sbM1556G.append(", height - ");
                    sbM1556G.append(((CameraXController) cameraPreviewPresenter.f3906q).m2062b());
                    Log.d("CameraPreviewPresenter", sbM1556G.toString());
                    FaceTracker faceTracker = FaceTracker.b.f3965a;
                    boolean z = ((CameraXController) cameraPreviewPresenter.f3906q).f3852e;
                    Objects.requireNonNull(faceTracker);
                    FragmentActivity fragmentActivity = cameraPreviewPresenter.f3893d;
                    CameraXController cameraXController2 = (CameraXController) cameraPreviewPresenter.f3906q;
                    int i = cameraXController2.f3850c;
                    int iM2063c = cameraXController2.m2063c();
                    int iM2062b = ((CameraXController) cameraPreviewPresenter.f3906q).m2062b();
                    synchronized (faceTracker.f3963a) {
                        FaceTracker.c cVar = faceTracker.f3964b;
                        if (cVar != null) {
                            cVar.m2115a();
                            cVar.f3969i.post(new FaceTracker2(cVar, fragmentActivity, i, iM2063c, iM2062b));
                        }
                    }
                    final CameraRenderer cameraRenderer = cameraPreviewPresenter.f3907r;
                    Runnable runnable = new Runnable() { // from class: c.h.a.e.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            CameraRenderer cameraRenderer2 = cameraRenderer;
                            SurfaceTexture surfaceTexture3 = surfaceTexture2;
                            synchronized (cameraRenderer2) {
                                WeakReference<SurfaceTexture> weakReference = cameraRenderer2.f3922n;
                                if (weakReference == null || weakReference.get() != surfaceTexture3) {
                                    cameraRenderer2.f3922n = new WeakReference<>(surfaceTexture3);
                                    cameraRenderer2.f3921m = true;
                                }
                            }
                        }
                    };
                    CameraRenderHandler cameraRenderHandlerM2087d = cameraRenderer.m2087d();
                    Objects.requireNonNull(cameraRenderHandlerM2087d);
                    synchronized (cameraRenderHandlerM2087d) {
                        cameraRenderHandlerM2087d.f3912a.add(runnable);
                        cameraRenderHandlerM2087d.notifyAll();
                    }
                }
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: r */
    public final void m15284r() {
        CameraInternal2 cameraInternal2M15300a = m15300a();
        d dVar = this.f35938n;
        Size size = this.f35943s;
        Rect rect = this.f36021i;
        if (rect == null) {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        SurfaceRequest surfaceRequest = this.f35941q;
        if (cameraInternal2M15300a == null || dVar == null || rect == null) {
            return;
        }
        cameraInternal2M15300a.mo15166i().mo15185c(((ImageOutputConfig2) this.f36018f).mo15348w(0));
        ((ImageOutputConfig2) this.f36018f).mo15348w(0);
        Objects.requireNonNull(surfaceRequest);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Preview:");
        sbM1556G.append(m15303e());
        return sbM1556G.toString();
    }
}
