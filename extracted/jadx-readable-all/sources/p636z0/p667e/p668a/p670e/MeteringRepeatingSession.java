package p636z0.p667e.p668a.p670e;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p644b.C7462a;
import p636z0.p667e.p668a.p670e.p671w1.CameraCharacteristicsCompat;
import p636z0.p667e.p676b.CameraSelector;
import p636z0.p667e.p676b.Logger8;
import p636z0.p667e.p676b.UseCase;
import p636z0.p667e.p676b.p677v1.Config3;
import p636z0.p667e.p676b.p677v1.DeferrableSurface;
import p636z0.p667e.p676b.p677v1.ImageInputConfig;
import p636z0.p667e.p676b.p677v1.ImmediateSurface;
import p636z0.p667e.p676b.p677v1.MutableOptionsBundle;
import p636z0.p667e.p676b.p677v1.ReadableConfig;
import p636z0.p667e.p676b.p677v1.SessionConfig;
import p636z0.p667e.p676b.p677v1.UseCaseConfig;
import p636z0.p667e.p676b.p677v1.UseCaseConfig2;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback;
import p636z0.p667e.p676b.p677v1.p678r1.p680c.Futures2;
import p636z0.p667e.p676b.p681w1.TargetConfig;
import p636z0.p667e.p676b.p681w1.UseCaseEventConfig;

/* JADX INFO: renamed from: z0.e.a.e.l1, reason: use source file name */
/* JADX INFO: compiled from: MeteringRepeatingSession.java */
/* JADX INFO: loaded from: classes.dex */
public class MeteringRepeatingSession {

    /* JADX INFO: renamed from: a */
    public DeferrableSurface f35519a;

    /* JADX INFO: renamed from: b */
    public final SessionConfig f35520b;

    /* JADX INFO: renamed from: z0.e.a.e.l1$a */
    /* JADX INFO: compiled from: MeteringRepeatingSession.java */
    public class a implements FutureCallback<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Surface f35521a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SurfaceTexture f35522b;

        public a(MeteringRepeatingSession meteringRepeatingSession, Surface surface, SurfaceTexture surfaceTexture) {
            this.f35521a = surface;
            this.f35522b = surfaceTexture;
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
        /* JADX INFO: renamed from: a */
        public void mo15090a(Void r1) {
            this.f35521a.release();
            this.f35522b.release();
        }

        @Override // p636z0.p667e.p676b.p677v1.p678r1.p680c.FutureCallback
        /* JADX INFO: renamed from: b */
        public void mo15091b(Throwable th) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
        }
    }

    /* JADX INFO: renamed from: z0.e.a.e.l1$b */
    /* JADX INFO: compiled from: MeteringRepeatingSession.java */
    public static class b implements UseCaseConfig2<UseCase> {

        /* JADX INFO: renamed from: r */
        public final Config3 f35523r;

        public b() {
            MutableOptionsBundle mutableOptionsBundleM15434y = MutableOptionsBundle.m15434y();
            mutableOptionsBundleM15434y.m15436A(UseCaseConfig2.f36233j, Config3.c.OPTIONAL, new Camera2SessionOptionUnpacker());
            this.f35523r = mutableOptionsBundleM15434y;
        }

        @Override // p636z0.p667e.p676b.p677v1.ReadableConfig2, p636z0.p667e.p676b.p677v1.Config3
        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object mo15102a(Config3.a aVar) {
            return ReadableConfig.m15359f(this, aVar);
        }

        @Override // p636z0.p667e.p676b.p677v1.ReadableConfig2, p636z0.p667e.p676b.p677v1.Config3
        /* JADX INFO: renamed from: b */
        public /* synthetic */ boolean mo15103b(Config3.a aVar) {
            return ReadableConfig.m15354a(this, aVar);
        }

        @Override // p636z0.p667e.p676b.p677v1.ReadableConfig2, p636z0.p667e.p676b.p677v1.Config3
        /* JADX INFO: renamed from: c */
        public /* synthetic */ Set mo15104c() {
            return ReadableConfig.m15358e(this);
        }

        @Override // p636z0.p667e.p676b.p677v1.ReadableConfig2, p636z0.p667e.p676b.p677v1.Config3
        /* JADX INFO: renamed from: d */
        public /* synthetic */ Object mo15105d(Config3.a aVar, Object obj) {
            return ReadableConfig.m15360g(this, aVar, obj);
        }

        @Override // p636z0.p667e.p676b.p677v1.ReadableConfig2, p636z0.p667e.p676b.p677v1.Config3
        /* JADX INFO: renamed from: e */
        public /* synthetic */ Config3.c mo15106e(Config3.a aVar) {
            return ReadableConfig.m15356c(this, aVar);
        }

        @Override // p636z0.p667e.p676b.p677v1.ReadableConfig2
        /* JADX INFO: renamed from: h */
        public Config3 mo15107h() {
            return this.f35523r;
        }

        @Override // p636z0.p667e.p676b.p677v1.ImageInputConfig2
        /* JADX INFO: renamed from: i */
        public /* synthetic */ int mo15108i() {
            return ImageInputConfig.m15411a(this);
        }

        @Override // p636z0.p667e.p676b.p677v1.UseCaseConfig2
        /* JADX INFO: renamed from: j */
        public /* synthetic */ SessionConfig mo15109j(SessionConfig sessionConfig) {
            return UseCaseConfig.m15408b(this, sessionConfig);
        }

        @Override // p636z0.p667e.p676b.p677v1.Config3
        /* JADX INFO: renamed from: k */
        public /* synthetic */ void mo15110k(String str, Config3.b bVar) {
            ReadableConfig.m15355b(this, str, bVar);
        }

        @Override // p636z0.p667e.p676b.p677v1.Config3
        /* JADX INFO: renamed from: l */
        public /* synthetic */ Object mo15111l(Config3.a aVar, Config3.c cVar) {
            return ReadableConfig.m15361h(this, aVar, cVar);
        }

        @Override // p636z0.p667e.p676b.p681w1.TargetConfig2
        /* JADX INFO: renamed from: o */
        public /* synthetic */ String mo15112o(String str) {
            return TargetConfig.m15454a(this, str);
        }

        @Override // p636z0.p667e.p676b.p677v1.Config3
        /* JADX INFO: renamed from: p */
        public /* synthetic */ Set mo15113p(Config3.a aVar) {
            return ReadableConfig.m15357d(this, aVar);
        }

        @Override // p636z0.p667e.p676b.p677v1.UseCaseConfig2
        /* JADX INFO: renamed from: r */
        public /* synthetic */ int mo15114r(int i) {
            return UseCaseConfig.m15410d(this, i);
        }

        @Override // p636z0.p667e.p676b.p677v1.UseCaseConfig2
        /* JADX INFO: renamed from: t */
        public /* synthetic */ CameraSelector mo15115t(CameraSelector cameraSelector) {
            return UseCaseConfig.m15407a(this, cameraSelector);
        }

        @Override // p636z0.p667e.p676b.p681w1.UseCaseEventConfig2
        /* JADX INFO: renamed from: u */
        public /* synthetic */ UseCase.a mo15116u(UseCase.a aVar) {
            return UseCaseEventConfig.m15455a(this, aVar);
        }

        @Override // p636z0.p667e.p676b.p677v1.UseCaseConfig2
        /* JADX INFO: renamed from: v */
        public /* synthetic */ SessionConfig.d mo15117v(SessionConfig.d dVar) {
            return UseCaseConfig.m15409c(this, dVar);
        }
    }

    public MeteringRepeatingSession(CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        Size size;
        b bVar = new b();
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristicsCompat.m15209a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            Logger8.m15273b("MeteringRepeating", "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP.", null);
            size = new Size(0, 0);
        } else {
            Size[] outputSizes = Build.VERSION.SDK_INT < 23 ? streamConfigurationMap.getOutputSizes(SurfaceTexture.class) : streamConfigurationMap.getOutputSizes(34);
            if (outputSizes == null) {
                Logger8.m15273b("MeteringRepeating", "Can not get output size list.", null);
                size = new Size(0, 0);
            } else {
                size = (Size) Collections.min(Arrays.asList(outputSizes), new Comparator() { // from class: z0.e.a.e.z
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        Size size2 = (Size) obj;
                        Size size3 = (Size) obj2;
                        return Long.signum((((long) size2.getWidth()) * ((long) size2.getHeight())) - (((long) size3.getWidth()) * ((long) size3.getHeight())));
                    }
                });
            }
        }
        Logger8.m15272a("MeteringRepeating", "MerteringSession SurfaceTexture size: " + size, null);
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        SessionConfig.b bVarM15372f = SessionConfig.b.m15372f(bVar);
        bVarM15372f.f36166b.f36151c = 1;
        ImmediateSurface immediateSurface = new ImmediateSurface(surface);
        this.f35519a = immediateSurface;
        ListenableFuture<Void> listenableFutureM15391d = immediateSurface.m15391d();
        listenableFutureM15391d.mo11664h(new Futures2.d(listenableFutureM15391d, new a(this, surface, surfaceTexture)), C7462a.m14569f());
        bVarM15372f.m15376d(this.f35519a);
        this.f35520b = bVarM15372f.m15377e();
    }
}
