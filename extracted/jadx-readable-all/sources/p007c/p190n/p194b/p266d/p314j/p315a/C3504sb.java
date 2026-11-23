package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.d.j.a.sb */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3504sb implements InterfaceC3295mo<InterfaceC3689xa> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2913cc f19517a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2950dc f19518b;

    public C3504sb(C2950dc c2950dc, C2913cc c2913cc) {
        this.f19518b = c2950dc;
        this.f19517a = c2913cc;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3295mo
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo5960a(InterfaceC3689xa interfaceC3689xa) {
        synchronized (this.f19518b.f13224a) {
            C2950dc c2950dc = this.f19518b;
            c2950dc.f13230g = 0;
            C2913cc c2913cc = c2950dc.f13229f;
            if (c2913cc != null && this.f19517a != c2913cc) {
                C2096e.m4590z("New JS engine is loaded, marking previous one as destroyable.");
                this.f19518b.f13229f.m6165f();
            }
            this.f19518b.f13229f = this.f19517a;
        }
    }
}
