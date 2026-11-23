package p636z0.p667e.p676b.p677v1;

import p636z0.p667e.p676b.CameraSelector;
import p636z0.p667e.p676b.ExtendableBuilder;
import p636z0.p667e.p676b.UseCase;
import p636z0.p667e.p676b.p681w1.TargetConfig2;
import p636z0.p667e.p676b.p681w1.UseCaseEventConfig2;

/* JADX INFO: renamed from: z0.e.b.v1.p1, reason: use source file name */
/* JADX INFO: compiled from: UseCaseConfig.java */
/* JADX INFO: loaded from: classes.dex */
public interface UseCaseConfig2<T extends UseCase> extends TargetConfig2<T>, UseCaseEventConfig2, ImageInputConfig2 {

    /* JADX INFO: renamed from: h */
    public static final Config3.a<SessionConfig> f36231h = new AutoValue_Config_Option("camerax.core.useCase.defaultSessionConfig", SessionConfig.class, null);

    /* JADX INFO: renamed from: i */
    public static final Config3.a<CaptureConfig> f36232i = new AutoValue_Config_Option("camerax.core.useCase.defaultCaptureConfig", CaptureConfig.class, null);

    /* JADX INFO: renamed from: j */
    public static final Config3.a<SessionConfig.d> f36233j = new AutoValue_Config_Option("camerax.core.useCase.sessionConfigUnpacker", SessionConfig.d.class, null);

    /* JADX INFO: renamed from: k */
    public static final Config3.a<CaptureConfig.b> f36234k = new AutoValue_Config_Option("camerax.core.useCase.captureConfigUnpacker", CaptureConfig.b.class, null);

    /* JADX INFO: renamed from: l */
    public static final Config3.a<Integer> f36235l = new AutoValue_Config_Option("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE, null);

    /* JADX INFO: renamed from: m */
    public static final Config3.a<CameraSelector> f36236m = new AutoValue_Config_Option("camerax.core.useCase.cameraSelector", CameraSelector.class, null);

    /* JADX INFO: renamed from: z0.e.b.v1.p1$a */
    /* JADX INFO: compiled from: UseCaseConfig.java */
    public interface a<T extends UseCase, C extends UseCaseConfig2<T>, B> extends ExtendableBuilder<T> {
        /* JADX INFO: renamed from: b */
        C mo15252b();
    }

    /* JADX INFO: renamed from: j */
    SessionConfig mo15109j(SessionConfig sessionConfig);

    /* JADX INFO: renamed from: r */
    int mo15114r(int i);

    /* JADX INFO: renamed from: t */
    CameraSelector mo15115t(CameraSelector cameraSelector);

    /* JADX INFO: renamed from: v */
    SessionConfig.d mo15117v(SessionConfig.d dVar);
}
