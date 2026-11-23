package p007c.p190n.p191a.p192d;

import com.google.ads.mediation.AbstractAdViewAdapter;
import p007c.p190n.p194b.p266d.p267a.C2186m;
import p007c.p190n.p194b.p266d.p267a.p268a0.AbstractC2104a;
import p007c.p190n.p194b.p266d.p267a.p268a0.AbstractC2105b;
import p007c.p190n.p194b.p266d.p267a.p269b0.InterfaceC2117k;
import p007c.p190n.p194b.p266d.p314j.p315a.C3359oe;

/* JADX INFO: renamed from: c.n.a.d.j */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1268j extends AbstractC2105b {

    /* JADX INFO: renamed from: a */
    public final AbstractAdViewAdapter f5506a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2117k f5507b;

    public C1268j(AbstractAdViewAdapter abstractAdViewAdapter, InterfaceC2117k interfaceC2117k) {
        this.f5506a = abstractAdViewAdapter;
        this.f5507b = interfaceC2117k;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2140d
    /* JADX INFO: renamed from: a */
    public final void mo2740a(C2186m c2186m) {
        ((C3359oe) this.f5507b).m8000d(this.f5506a, c2186m);
    }

    @Override // p007c.p190n.p194b.p266d.p267a.AbstractC2140d
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo2741b(AbstractC2104a abstractC2104a) {
        AbstractC2104a abstractC2104a2 = abstractC2104a;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f5506a;
        abstractAdViewAdapter.zzb = abstractC2104a2;
        abstractC2104a2.mo4600b(new C1269k(abstractAdViewAdapter, this.f5507b));
        ((C3359oe) this.f5507b).m8002f(this.f5506a);
    }
}
