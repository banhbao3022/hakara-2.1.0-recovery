package p007c.p114h.p115a.p116a;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.util.Size;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p644b.C7462a;
import p636z0.p667e.p676b.Camera2;
import p636z0.p667e.p676b.CameraSelector;
import p636z0.p667e.p676b.ImageAnalysis;
import p636z0.p667e.p676b.ImageAnalysisAbstractAnalyzer;
import p636z0.p667e.p676b.Preview;
import p636z0.p667e.p676b.p677v1.Config3;
import p636z0.p667e.p676b.p677v1.ImageAnalysisConfig;
import p636z0.p667e.p676b.p677v1.ImageOutputConfig2;
import p636z0.p667e.p676b.p677v1.MutableOptionsBundle;
import p636z0.p667e.p676b.p677v1.PreviewConfig;
import p636z0.p667e.p684c.ProcessCameraProvider;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: c.h.a.a.f, reason: use source file name */
/* JADX INFO: compiled from: CameraXController.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraXController implements ICameraController {

    /* JADX INFO: renamed from: a */
    public int f3848a;

    /* JADX INFO: renamed from: b */
    public int f3849b;

    /* JADX INFO: renamed from: c */
    public int f3850c;

    /* JADX INFO: renamed from: d */
    public final FragmentActivity f3851d;

    /* JADX INFO: renamed from: e */
    public boolean f3852e;

    /* JADX INFO: renamed from: f */
    public ProcessCameraProvider f3853f;

    /* JADX INFO: renamed from: g */
    public Camera2 f3854g;

    /* JADX INFO: renamed from: h */
    public Preview f3855h;

    /* JADX INFO: renamed from: i */
    public Executor f3856i;

    /* JADX INFO: renamed from: j */
    public ImageAnalysis f3857j;

    /* JADX INFO: renamed from: k */
    public PreviewCallback f3858k;

    /* JADX INFO: renamed from: l */
    public OnSurfaceTextureListener f3859l;

    /* JADX INFO: renamed from: m */
    public OnFrameAvailableListener f3860m;

    /* JADX INFO: renamed from: n */
    public SurfaceTexture f3861n;

    public CameraXController(FragmentActivity fragmentActivity) {
        this.f3848a = 540;
        this.f3849b = 960;
        this.f3856i = Executors.newSingleThreadExecutor();
        Log.d("CameraXController", "CameraXController: created!");
        this.f3851d = fragmentActivity;
        this.f3852e = true;
        this.f3850c = 90;
    }

    /* JADX INFO: renamed from: a */
    public final void m2061a() {
        ProcessCameraProvider processCameraProvider = this.f3853f;
        if (processCameraProvider == null) {
            return;
        }
        processCameraProvider.m15458b();
        Preview.b bVar = new Preview.b();
        Size size = new Size(this.f3848a, this.f3849b);
        MutableOptionsBundle mutableOptionsBundle = bVar.f35946a;
        Config3.a<Size> aVar = ImageOutputConfig2.f36301d;
        Config3.c cVar = Config3.c.OPTIONAL;
        mutableOptionsBundle.m15436A(aVar, cVar, size);
        MutableOptionsBundle mutableOptionsBundle2 = bVar.f35946a;
        Config3.a<Integer> aVar2 = ImageOutputConfig2.f36299b;
        if (mutableOptionsBundle2.mo15105d(aVar2, null) != null && bVar.f35946a.mo15105d(aVar, null) != null) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        Preview preview = new Preview(bVar.mo15252b());
        this.f3855h = preview;
        C0836a c0836a = new C0836a(this);
        Executor executor = Preview.f35937m;
        C7462a.m14566c();
        preview.f35938n = c0836a;
        preview.f35939o = executor;
        preview.f36015c = 1;
        preview.m15306i();
        if (preview.f35942r) {
            if (preview.m15283q()) {
                preview.m15284r();
                preview.f35942r = false;
            }
        } else if (preview.f36019g != null) {
            preview.f36023k = preview.m15282p(preview.m15301b(), (PreviewConfig) preview.f36018f, preview.f36019g).m15377e();
            preview.m15305h();
        }
        ImageAnalysis.c cVar2 = new ImageAnalysis.c();
        cVar2.f35862a.m15436A(aVar, cVar, new Size(this.f3848a, this.f3849b));
        cVar2.f35862a.m15436A(ImageAnalysisConfig.f36217r, cVar, 0);
        if (cVar2.f35862a.mo15105d(aVar2, null) != null && cVar2.f35862a.mo15105d(aVar, null) != null) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        final ImageAnalysis imageAnalysis = new ImageAnalysis(cVar2.mo15252b());
        this.f3857j = imageAnalysis;
        Executor executor2 = this.f3856i;
        final PreviewCallbackAnalyzer previewCallbackAnalyzer = new PreviewCallbackAnalyzer(this.f3858k);
        synchronized (imageAnalysis.f35859n) {
            ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = imageAnalysis.f35858m;
            ImageAnalysis.a aVar3 = new ImageAnalysis.a() { // from class: z0.e.b.o
                @Override // p636z0.p667e.p676b.ImageAnalysis.a
                /* JADX INFO: renamed from: a */
                public final void mo2064a(ImageProxy imageProxy) {
                    ImageAnalysis imageAnalysis2 = imageAnalysis;
                    ImageAnalysis.a aVar4 = previewCallbackAnalyzer;
                    Rect rect = imageAnalysis2.f36021i;
                    if (rect != null) {
                        imageProxy.mo15261X(rect);
                    }
                    aVar4.mo2064a(imageProxy);
                }
            };
            synchronized (imageAnalysisAbstractAnalyzer.f35874d) {
                imageAnalysisAbstractAnalyzer.f35871a = aVar3;
                imageAnalysisAbstractAnalyzer.f35873c = executor2;
            }
            if (imageAnalysis.f35860o == null) {
                imageAnalysis.f36015c = 1;
                imageAnalysis.m15306i();
            }
            imageAnalysis.f35860o = previewCallbackAnalyzer;
        }
        CameraSelector.a aVar4 = new CameraSelector.a();
        aVar4.m15299b(!this.f3852e ? 1 : 0);
        this.f3854g = this.f3853f.m15457a(this.f3851d, aVar4.m15298a(), this.f3855h, this.f3857j);
    }

    /* JADX INFO: renamed from: b */
    public int m2062b() {
        int i = this.f3850c;
        return (i == 90 || i == 270) ? this.f3848a : this.f3849b;
    }

    /* JADX INFO: renamed from: c */
    public int m2063c() {
        int i = this.f3850c;
        return (i == 90 || i == 270) ? this.f3849b : this.f3848a;
    }

    public CameraXController(FragmentActivity fragmentActivity, int i, int i2) {
        this.f3848a = 540;
        this.f3849b = 960;
        this.f3856i = Executors.newSingleThreadExecutor();
        Log.d("CameraXController", "CameraXController custom size: created!");
        this.f3851d = fragmentActivity;
        this.f3852e = true;
        this.f3850c = 90;
        if (i > 0 && i2 > 0) {
            Log.d("CameraXController", "CameraXController custom size a:" + i);
            this.f3848a = i;
            this.f3849b = i2;
        }
        StringBuilder sbM1556G = outline.m1556G("CameraXController custom size:");
        sbM1556G.append(this.f3848a);
        Log.d("CameraXController", sbM1556G.toString());
    }
}
