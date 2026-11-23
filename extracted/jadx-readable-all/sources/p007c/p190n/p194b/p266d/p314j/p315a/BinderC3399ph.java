package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import p007c.p190n.p194b.p266d.p267a.p275e0.AbstractC2171b;
import p007c.p190n.p194b.p266d.p267a.p275e0.C2170a;

/* JADX INFO: renamed from: c.n.b.d.j.a.ph */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3399ph extends AbstractBinderC3256lm {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC2171b f17971f;

    public BinderC3399ph(AbstractC2171b abstractC2171b) {
        this.f17971f = abstractC2171b;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3293mm
    /* JADX INFO: renamed from: E */
    public final void mo7512E(String str) {
        this.f17971f.mo4614a(str);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3293mm
    /* JADX INFO: renamed from: Z */
    public final void mo7513Z(String str, String str2) {
        C2170a c2170a = new C2170a(new C3643w1(str, null));
        gx2.f14692a.f14698g.put(c2170a, str2);
        this.f17971f.mo4615b(c2170a);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3293mm
    /* JADX INFO: renamed from: f0 */
    public final void mo7514f0(String str, String str2, Bundle bundle) {
        C2170a c2170a = new C2170a(new C3643w1(str, bundle));
        gx2.f14692a.f14698g.put(c2170a, str2);
        this.f17971f.mo4615b(c2170a);
    }
}
