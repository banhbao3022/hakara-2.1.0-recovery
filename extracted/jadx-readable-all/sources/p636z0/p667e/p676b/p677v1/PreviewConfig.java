package p636z0.p667e.p676b.p677v1;

import android.util.Size;
import java.util.List;
import java.util.Set;
import p636z0.p667e.p676b.CameraSelector;
import p636z0.p667e.p676b.Preview;
import p636z0.p667e.p676b.UseCase;
import p636z0.p667e.p676b.p681w1.TargetConfig;
import p636z0.p667e.p676b.p681w1.ThreadConfig;
import p636z0.p667e.p676b.p681w1.UseCaseEventConfig;

/* JADX INFO: renamed from: z0.e.b.v1.c1, reason: use source file name */
/* JADX INFO: compiled from: PreviewConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class PreviewConfig implements UseCaseConfig2<Preview>, ImageOutputConfig2, ThreadConfig {

    /* JADX INFO: renamed from: r */
    public static final Config3.a<ImageInfoProcessor> f36119r = new AutoValue_Config_Option("camerax.core.preview.imageInfoProcessor", ImageInfoProcessor.class, null);

    /* JADX INFO: renamed from: s */
    public static final Config3.a<CaptureProcessor> f36120s = new AutoValue_Config_Option("camerax.core.preview.captureProcessor", CaptureProcessor.class, null);

    /* JADX INFO: renamed from: t */
    public final OptionsBundle f36121t;

    public PreviewConfig(OptionsBundle optionsBundle) {
        this.f36121t = optionsBundle;
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

    @Override // p636z0.p667e.p676b.p677v1.ImageOutputConfig2
    /* JADX INFO: renamed from: f */
    public /* synthetic */ Size mo15342f(Size size) {
        return ImageOutputConfig.m15413b(this, size);
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageOutputConfig2
    /* JADX INFO: renamed from: g */
    public /* synthetic */ List mo15343g(List list) {
        return ImageOutputConfig.m15414c(this, list);
    }

    @Override // p636z0.p667e.p676b.p677v1.ReadableConfig2
    /* JADX INFO: renamed from: h */
    public Config3 mo15107h() {
        return this.f36121t;
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageInputConfig2
    /* JADX INFO: renamed from: i */
    public int mo15108i() {
        return ((Integer) mo15102a(ImageInputConfig2.f36237a)).intValue();
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

    @Override // p636z0.p667e.p676b.p677v1.ImageOutputConfig2
    /* JADX INFO: renamed from: m */
    public /* synthetic */ Size mo15344m(Size size) {
        return ImageOutputConfig.m15412a(this, size);
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageOutputConfig2
    /* JADX INFO: renamed from: n */
    public /* synthetic */ Size mo15345n(Size size) {
        return ImageOutputConfig.m15416e(this, size);
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

    @Override // p636z0.p667e.p676b.p677v1.ImageOutputConfig2
    /* JADX INFO: renamed from: q */
    public /* synthetic */ boolean mo15346q() {
        return ImageOutputConfig.m15418g(this);
    }

    @Override // p636z0.p667e.p676b.p677v1.UseCaseConfig2
    /* JADX INFO: renamed from: r */
    public /* synthetic */ int mo15114r(int i) {
        return UseCaseConfig.m15410d(this, i);
    }

    @Override // p636z0.p667e.p676b.p677v1.ImageOutputConfig2
    /* JADX INFO: renamed from: s */
    public /* synthetic */ int mo15347s() {
        return ImageOutputConfig.m15415d(this);
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

    @Override // p636z0.p667e.p676b.p677v1.ImageOutputConfig2
    /* JADX INFO: renamed from: w */
    public /* synthetic */ int mo15348w(int i) {
        return ImageOutputConfig.m15417f(this, i);
    }
}
