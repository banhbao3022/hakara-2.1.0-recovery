package p636z0.p667e.p668a.p675f;

import java.util.Set;
import p636z0.p667e.p676b.ExtendableBuilder;
import p636z0.p667e.p676b.p677v1.Config3;
import p636z0.p667e.p676b.p677v1.MutableConfig;
import p636z0.p667e.p676b.p677v1.MutableOptionsBundle;
import p636z0.p667e.p676b.p677v1.OptionsBundle;
import p636z0.p667e.p676b.p677v1.ReadableConfig;
import p636z0.p667e.p676b.p677v1.ReadableConfig2;

/* JADX INFO: renamed from: z0.e.a.f.j, reason: use source file name */
/* JADX INFO: compiled from: CaptureRequestOptions.java */
/* JADX INFO: loaded from: classes.dex */
public class CaptureRequestOptions implements ReadableConfig2 {

    /* JADX INFO: renamed from: r */
    public final Config3 f35852r;

    /* JADX INFO: renamed from: z0.e.a.f.j$a */
    /* JADX INFO: compiled from: CaptureRequestOptions.java */
    public static final class a implements ExtendableBuilder<CaptureRequestOptions> {

        /* JADX INFO: renamed from: a */
        public final MutableOptionsBundle f35853a = MutableOptionsBundle.m15434y();

        /* JADX INFO: renamed from: d */
        public static a m15244d(Config3 config3) {
            a aVar = new a();
            config3.mo15110k("camera2.captureRequest.option.", new C7736g(aVar, config3));
            return aVar;
        }

        @Override // p636z0.p667e.p676b.ExtendableBuilder
        /* JADX INFO: renamed from: a */
        public MutableConfig mo15071a() {
            return this.f35853a;
        }

        /* JADX INFO: renamed from: c */
        public CaptureRequestOptions m15245c() {
            return new CaptureRequestOptions(OptionsBundle.m15339x(this.f35853a));
        }
    }

    public CaptureRequestOptions(Config3 config3) {
        this.f35852r = config3;
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
        return this.f35852r;
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
