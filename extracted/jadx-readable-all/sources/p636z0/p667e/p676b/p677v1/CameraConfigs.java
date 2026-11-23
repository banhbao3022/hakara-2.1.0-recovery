package p636z0.p667e.p676b.p677v1;

import java.util.Set;

/* JADX INFO: renamed from: z0.e.b.v1.v, reason: use source file name */
/* JADX INFO: compiled from: CameraConfigs.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraConfigs {

    /* JADX INFO: renamed from: a */
    public static final CameraConfig f36306a = new a();

    /* JADX INFO: renamed from: z0.e.b.v1.v$a */
    /* JADX INFO: compiled from: CameraConfigs.java */
    public static final class a implements CameraConfig {

        /* JADX INFO: renamed from: r */
        public final UseCaseConfigFactory f36307r = new C8568a(this);

        /* JADX INFO: renamed from: z0.e.b.v1.v$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: CameraConfigs.java */
        public class C8568a implements UseCaseConfigFactory {
            public C8568a(a aVar) {
            }

            @Override // p636z0.p667e.p676b.p677v1.UseCaseConfigFactory
            /* JADX INFO: renamed from: a */
            public Config3 mo15201a(UseCaseConfigFactory.a aVar) {
                return null;
            }
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
            return OptionsBundle.f36110r;
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

        @Override // p636z0.p667e.p676b.p677v1.Config3
        /* JADX INFO: renamed from: p */
        public /* synthetic */ Set mo15113p(Config3.a aVar) {
            return ReadableConfig.m15357d(this, aVar);
        }
    }
}
