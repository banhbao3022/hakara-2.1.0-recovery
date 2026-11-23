package p636z0.p667e.p676b;

import android.media.ImageReader;
import android.util.Size;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p644b.C7462a;
import p636z0.p667e.p676b.p677v1.CameraInternal2;
import p636z0.p667e.p676b.p677v1.Config2;
import p636z0.p667e.p676b.p677v1.Config3;
import p636z0.p667e.p676b.p677v1.DeferrableSurface;
import p636z0.p667e.p676b.p677v1.ImageAnalysisConfig;
import p636z0.p667e.p676b.p677v1.ImageOutputConfig2;
import p636z0.p667e.p676b.p677v1.ImmediateSurface;
import p636z0.p667e.p676b.p677v1.MutableConfig;
import p636z0.p667e.p676b.p677v1.MutableOptionsBundle;
import p636z0.p667e.p676b.p677v1.OptionsBundle;
import p636z0.p667e.p676b.p677v1.SessionConfig;
import p636z0.p667e.p676b.p677v1.UseCaseConfig2;
import p636z0.p667e.p676b.p677v1.UseCaseConfigFactory;
import p636z0.p667e.p676b.p681w1.TargetConfig2;
import p636z0.p667e.p676b.p681w1.ThreadConfig;

/* JADX INFO: renamed from: z0.e.b.a1, reason: use source file name */
/* JADX INFO: compiled from: ImageAnalysis.java */
/* JADX INFO: loaded from: classes.dex */
public final class ImageAnalysis extends UseCase {

    /* JADX INFO: renamed from: l */
    public static final d f35857l = new d();

    /* JADX INFO: renamed from: m */
    public final ImageAnalysisAbstractAnalyzer f35858m;

    /* JADX INFO: renamed from: n */
    public final Object f35859n;

    /* JADX INFO: renamed from: o */
    public a f35860o;

    /* JADX INFO: renamed from: p */
    public DeferrableSurface f35861p;

    /* JADX INFO: renamed from: z0.e.b.a1$a */
    /* JADX INFO: compiled from: ImageAnalysis.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2064a(ImageProxy imageProxy);
    }

    /* JADX INFO: renamed from: z0.e.b.a1$b */
    /* JADX INFO: compiled from: ImageAnalysis.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: renamed from: z0.e.b.a1$c */
    /* JADX INFO: compiled from: ImageAnalysis.java */
    public static final class c implements UseCaseConfig2.a<ImageAnalysis, ImageAnalysisConfig, c> {

        /* JADX INFO: renamed from: a */
        public final MutableOptionsBundle f35862a;

        public c() {
            this(MutableOptionsBundle.m15434y());
        }

        @Override // p636z0.p667e.p676b.ExtendableBuilder
        /* JADX INFO: renamed from: a */
        public MutableConfig mo15071a() {
            return this.f35862a;
        }

        @Override // p636z0.p667e.p676b.p677v1.UseCaseConfig2.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public ImageAnalysisConfig mo15252b() {
            return new ImageAnalysisConfig(OptionsBundle.m15339x(this.f35862a));
        }

        public c(MutableOptionsBundle mutableOptionsBundle) {
            this.f35862a = mutableOptionsBundle;
            Config3.a<Class<?>> aVar = TargetConfig2.f36349o;
            Class cls = (Class) mutableOptionsBundle.mo15105d(aVar, null);
            if (cls != null && !cls.equals(ImageAnalysis.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            Config3.c cVar = Config3.c.OPTIONAL;
            mutableOptionsBundle.m15436A(aVar, cVar, ImageAnalysis.class);
            Config3.a<String> aVar2 = TargetConfig2.f36348n;
            if (mutableOptionsBundle.mo15105d(aVar2, null) == null) {
                mutableOptionsBundle.m15436A(aVar2, cVar, ImageAnalysis.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }
    }

    /* JADX INFO: renamed from: z0.e.b.a1$d */
    /* JADX INFO: compiled from: ImageAnalysis.java */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public static final Size f35863a;

        /* JADX INFO: renamed from: b */
        public static final Size f35864b;

        /* JADX INFO: renamed from: c */
        public static final ImageAnalysisConfig f35865c;

        static {
            Size size = new Size(640, 480);
            f35863a = size;
            Size size2 = new Size(1920, 1080);
            f35864b = size2;
            c cVar = new c();
            MutableOptionsBundle mutableOptionsBundle = cVar.f35862a;
            Config3.a<Size> aVar = ImageOutputConfig2.f36302e;
            Config3.c cVar2 = Config3.c.OPTIONAL;
            mutableOptionsBundle.m15436A(aVar, cVar2, size);
            cVar.f35862a.m15436A(ImageOutputConfig2.f36303f, cVar2, size2);
            cVar.f35862a.m15436A(UseCaseConfig2.f36235l, cVar2, 1);
            cVar.f35862a.m15436A(ImageOutputConfig2.f36299b, cVar2, 0);
            f35865c = cVar.mo15252b();
        }
    }

    public ImageAnalysis(ImageAnalysisConfig imageAnalysisConfig) {
        super(imageAnalysisConfig);
        this.f35859n = new Object();
        if (((Integer) ((ImageAnalysisConfig) this.f36018f).mo15105d(ImageAnalysisConfig.f36217r, 0)).intValue() == 1) {
            this.f35858m = new ImageAnalysisBlockingAnalyzer();
        } else {
            this.f35858m = new ImageAnalysisNonBlockingAnalyzer((Executor) imageAnalysisConfig.mo15105d(ThreadConfig.f36350p, C7462a.m14573j()));
        }
    }

    @Override // p636z0.p667e.p676b.UseCase
    /* JADX INFO: renamed from: c */
    public UseCaseConfig2<?> mo15246c(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        Config3 config3Mo15201a = useCaseConfigFactory.mo15201a(UseCaseConfigFactory.a.IMAGE_ANALYSIS);
        if (z) {
            Objects.requireNonNull(f35857l);
            config3Mo15201a = Config2.m15381a(config3Mo15201a, d.f35865c);
        }
        if (config3Mo15201a == null) {
            return null;
        }
        return new c(MutableOptionsBundle.m15435z(config3Mo15201a)).mo15252b();
    }

    @Override // p636z0.p667e.p676b.UseCase
    /* JADX INFO: renamed from: f */
    public UseCaseConfig2.a<?, ?, ?> mo15247f(Config3 config3) {
        return new c(MutableOptionsBundle.m15435z(config3));
    }

    @Override // p636z0.p667e.p676b.UseCase
    /* JADX INFO: renamed from: k */
    public void mo15248k() {
        this.f35858m.f35875e = true;
    }

    @Override // p636z0.p667e.p676b.UseCase
    /* JADX INFO: renamed from: m */
    public void mo15249m() {
        C7462a.m14566c();
        DeferrableSurface deferrableSurface = this.f35861p;
        if (deferrableSurface != null) {
            deferrableSurface.m15388a();
            this.f35861p = null;
        }
        ImageAnalysisAbstractAnalyzer imageAnalysisAbstractAnalyzer = this.f35858m;
        imageAnalysisAbstractAnalyzer.f35875e = false;
        imageAnalysisAbstractAnalyzer.mo15257d();
    }

    @Override // p636z0.p667e.p676b.UseCase
    /* JADX INFO: renamed from: o */
    public Size mo15250o(Size size) {
        this.f36023k = m15251p(m15301b(), (ImageAnalysisConfig) this.f36018f, size).m15377e();
        return size;
    }

    /* JADX INFO: renamed from: p */
    public SessionConfig.b m15251p(final String str, final ImageAnalysisConfig imageAnalysisConfig, final Size size) {
        C7462a.m14566c();
        Executor executor = (Executor) imageAnalysisConfig.mo15105d(ThreadConfig.f36350p, C7462a.m14573j());
        Objects.requireNonNull(executor);
        int iIntValue = ((Integer) ((ImageAnalysisConfig) this.f36018f).mo15105d(ImageAnalysisConfig.f36217r, 0)).intValue() == 1 ? ((Integer) ((ImageAnalysisConfig) this.f36018f).mo15105d(ImageAnalysisConfig.f36218s, 6)).intValue() : 4;
        Config3.a<ImageReaderProxyProvider> aVar = ImageAnalysisConfig.f36219t;
        final SafeCloseImageReaderProxy safeCloseImageReaderProxy = ((ImageReaderProxyProvider) imageAnalysisConfig.mo15105d(aVar, null)) != null ? new SafeCloseImageReaderProxy(((ImageReaderProxyProvider) imageAnalysisConfig.mo15105d(aVar, null)).m15264a(size.getWidth(), size.getHeight(), m15302d(), iIntValue, 0L)) : new SafeCloseImageReaderProxy(new AndroidImageReaderProxy(ImageReader.newInstance(size.getWidth(), size.getHeight(), m15302d(), iIntValue)));
        CameraInternal2 cameraInternal2M15300a = m15300a();
        if (cameraInternal2M15300a != null) {
            this.f35858m.f35872b = cameraInternal2M15300a.mo15166i().mo15185c(((ImageOutputConfig2) this.f36018f).mo15348w(0));
        }
        safeCloseImageReaderProxy.mo15271g(this.f35858m, executor);
        SessionConfig.b bVarM15372f = SessionConfig.b.m15372f(imageAnalysisConfig);
        DeferrableSurface deferrableSurface = this.f35861p;
        if (deferrableSurface != null) {
            deferrableSurface.m15388a();
        }
        ImmediateSurface immediateSurface = new ImmediateSurface(safeCloseImageReaderProxy.mo15266a());
        this.f35861p = immediateSurface;
        immediateSurface.m15391d().mo11664h(new Runnable() { // from class: z0.e.b.g0
            @Override // java.lang.Runnable
            public final void run() {
                SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = safeCloseImageReaderProxy;
                synchronized (safeCloseImageReaderProxy2.f35968a) {
                    safeCloseImageReaderProxy2.f35970c = true;
                    safeCloseImageReaderProxy2.f35971d.mo15268d();
                    if (safeCloseImageReaderProxy2.f35969b == 0) {
                        safeCloseImageReaderProxy2.close();
                    }
                }
            }
        }, C7462a.m14576m());
        bVarM15372f.m15376d(this.f35861p);
        bVarM15372f.f36169e.add(new SessionConfig.c() { // from class: z0.e.b.n
            @Override // p636z0.p667e.p676b.p677v1.SessionConfig.c
            /* JADX INFO: renamed from: a */
            public final void mo15290a(SessionConfig sessionConfig, SessionConfig.e eVar) {
                ImageAnalysis imageAnalysis = this.f35964a;
                String str2 = str;
                ImageAnalysisConfig imageAnalysisConfig2 = imageAnalysisConfig;
                Size size2 = size;
                Objects.requireNonNull(imageAnalysis);
                C7462a.m14566c();
                DeferrableSurface deferrableSurface2 = imageAnalysis.f35861p;
                if (deferrableSurface2 != null) {
                    deferrableSurface2.m15388a();
                    imageAnalysis.f35861p = null;
                }
                imageAnalysis.f35858m.mo15257d();
                if (imageAnalysis.m15300a() == null ? false : Objects.equals(str2, imageAnalysis.m15301b())) {
                    imageAnalysis.f36023k = imageAnalysis.m15251p(str2, imageAnalysisConfig2, size2).m15377e();
                    imageAnalysis.m15305h();
                }
            }
        });
        return bVarM15372f;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("ImageAnalysis:");
        sbM1556G.append(m15303e());
        return sbM1556G.toString();
    }
}
