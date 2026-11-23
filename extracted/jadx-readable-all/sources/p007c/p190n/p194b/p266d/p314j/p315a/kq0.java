package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class kq0 extends AbstractBinderC2911ca {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f16013f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f16014g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f16015h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C3147io f16016i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ lq0 f16017j;

    public kq0(lq0 lq0Var, Object obj, String str, long j2, C3147io c3147io) {
        this.f16017j = lq0Var;
        this.f16013f = obj;
        this.f16014g = str;
        this.f16015h = j2;
        this.f16016i = c3147io;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2948da
    /* JADX INFO: renamed from: S */
    public final void mo5941S(String str) {
        synchronized (this.f16013f) {
            lq0.m7601c(this.f16017j, this.f16014g, false, str, (int) (C2330u.f10884a.f10896k.mo5621a() - this.f16015h));
            this.f16017j.f16453l.m8813c(this.f16014g, "error");
            this.f16017j.f16456o.mo6106C0(this.f16014g, "error");
            this.f16016i.m7286a(Boolean.FALSE);
        }
    }
}
