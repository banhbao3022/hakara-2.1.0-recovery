package p555j.p556a.p557a.p558a.p559a.p590r;

import mtp.media.karaoke.p628ui.screen.sing.SingActivity;
import p007c.p190n.p194b.p266d.p267a.AbstractC2185l;
import p007c.p190n.p194b.p266d.p267a.C2103a;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: j.a.a.a.a.r.e */
/* JADX INFO: compiled from: SingActivity.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C6792e extends AbstractC2185l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SingActivity f31833a;

    public C6792e(SingActivity singActivity) {
        this.f31833a = singActivity;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2185l
    /* JADX INFO: renamed from: a */
    public void mo2742a() {
        Intrinsics2.m13089e("Ad was dismissed.", "message");
        this.f31833a.finish();
    }

    @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2185l
    /* JADX INFO: renamed from: b */
    public void mo4630b(C2103a c2103a) {
        Intrinsics2.m13089e("Ad failed to show.", "message");
    }

    @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2185l
    /* JADX INFO: renamed from: c */
    public void mo2743c() {
        Intrinsics2.m13089e("Ad showed fullscreen content.", "message");
        this.f31833a.f33932j0 = null;
    }
}
