package p636z0.p667e.p676b;

import android.os.Handler;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p636z0.p667e.p676b.p677v1.AutoValue_Config_Option;
import p636z0.p667e.p676b.p677v1.CameraDeviceSurfaceManager;
import p636z0.p667e.p676b.p677v1.CameraFactory;
import p636z0.p667e.p676b.p677v1.Config3;
import p636z0.p667e.p676b.p677v1.MutableOptionsBundle;
import p636z0.p667e.p676b.p677v1.OptionsBundle;
import p636z0.p667e.p676b.p677v1.ReadableConfig;
import p636z0.p667e.p676b.p677v1.UseCaseConfigFactory;
import p636z0.p667e.p676b.p681w1.TargetConfig;
import p636z0.p667e.p676b.p681w1.TargetConfig2;

/* JADX INFO: renamed from: z0.e.b.x0, reason: use source file name */
/* JADX INFO: compiled from: CameraXConfig.java */
/* JADX INFO: loaded from: classes.dex */
public final class CameraXConfig implements TargetConfig2<CameraX2> {

    /* JADX INFO: renamed from: r */
    public static final Config3.a<CameraFactory.a> f36355r = new AutoValue_Config_Option("camerax.core.appConfig.cameraFactoryProvider", CameraFactory.a.class, null);

    /* JADX INFO: renamed from: s */
    public static final Config3.a<CameraDeviceSurfaceManager.a> f36356s = new AutoValue_Config_Option("camerax.core.appConfig.deviceSurfaceManagerProvider", CameraDeviceSurfaceManager.a.class, null);

    /* JADX INFO: renamed from: t */
    public static final Config3.a<UseCaseConfigFactory.b> f36357t = new AutoValue_Config_Option("camerax.core.appConfig.useCaseConfigFactoryProvider", UseCaseConfigFactory.b.class, null);

    /* JADX INFO: renamed from: u */
    public static final Config3.a<Executor> f36358u = new AutoValue_Config_Option("camerax.core.appConfig.cameraExecutor", Executor.class, null);

    /* JADX INFO: renamed from: v */
    public static final Config3.a<Handler> f36359v = new AutoValue_Config_Option("camerax.core.appConfig.schedulerHandler", Handler.class, null);

    /* JADX INFO: renamed from: w */
    public static final Config3.a<Integer> f36360w = new AutoValue_Config_Option("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);

    /* JADX INFO: renamed from: x */
    public static final Config3.a<CameraSelector> f36361x = new AutoValue_Config_Option("camerax.core.appConfig.availableCamerasLimiter", CameraSelector.class, null);

    /* JADX INFO: renamed from: y */
    public final OptionsBundle f36362y;

    /* JADX INFO: renamed from: z0.e.b.x0$a */
    /* JADX INFO: compiled from: CameraXConfig.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final MutableOptionsBundle f36363a;

        public a() {
            MutableOptionsBundle mutableOptionsBundleM15434y = MutableOptionsBundle.m15434y();
            this.f36363a = mutableOptionsBundleM15434y;
            Config3.a<Class<?>> aVar = TargetConfig2.f36349o;
            Class cls = (Class) mutableOptionsBundleM15434y.mo15105d(aVar, null);
            if (cls != null && !cls.equals(CameraX2.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            Config3.c cVar = Config3.c.OPTIONAL;
            mutableOptionsBundleM15434y.m15436A(aVar, cVar, CameraX2.class);
            Config3.a<String> aVar2 = TargetConfig2.f36348n;
            if (mutableOptionsBundleM15434y.mo15105d(aVar2, null) == null) {
                mutableOptionsBundleM15434y.m15436A(aVar2, cVar, CameraX2.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }
    }

    /* JADX INFO: renamed from: z0.e.b.x0$b */
    /* JADX INFO: compiled from: CameraXConfig.java */
    public interface b {
        CameraXConfig getCameraXConfig();
    }

    public CameraXConfig(OptionsBundle optionsBundle) {
        this.f36362y = optionsBundle;
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
        return this.f36362y;
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
}
