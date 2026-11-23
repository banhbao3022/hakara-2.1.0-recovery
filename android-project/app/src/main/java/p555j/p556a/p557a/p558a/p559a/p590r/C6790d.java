package p555j.p556a.p557a.p558a.p559a.p590r;

import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p190n.p194b.p266d.p267a.C2186m;
import p007c.p190n.p194b.p266d.p267a.p268a0.AbstractC2104a;
import p007c.p190n.p194b.p266d.p267a.p268a0.AbstractC2105b;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.r.d */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6790d extends AbstractC2105b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SingActivity f31830a;

    public C6790d(SingActivity singActivity) {
        this.f31830a = singActivity;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2140d
    /* JADX INFO: renamed from: a */
    public void mo2740a(C2186m c2186m) {
        Intrinsics2.m13089e(c2186m, "adError");
        String str = c2186m.f10444b;
        Intrinsics2.m13088d(str, "adError.message");
        Intrinsics2.m13089e(str, "message");
        this.f31830a.f33932j0 = null;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2140d
    /* JADX INFO: renamed from: b */
    public void mo2741b(AbstractC2104a abstractC2104a) {
        AbstractC2104a abstractC2104a2 = abstractC2104a;
        Intrinsics2.m13089e(abstractC2104a2, "interstitialAd");
        Intrinsics2.m13089e("Ad was loaded.", "message");
        this.f31830a.f33932j0 = abstractC2104a2;
    }
}
