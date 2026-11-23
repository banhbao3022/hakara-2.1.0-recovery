package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2305w0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class bv0 implements pb0 {

    /* JADX INFO: renamed from: h */
    public final String f12873h;

    /* JADX INFO: renamed from: i */
    public final im1 f12874i;

    /* JADX INFO: renamed from: f */
    public boolean f12871f = false;

    /* JADX INFO: renamed from: g */
    public boolean f12872g = false;

    /* JADX INFO: renamed from: j */
    public final InterfaceC2305w0 f12875j = C2330u.f10884a.f10893h.m6649f();

    public bv0(String str, im1 im1Var) {
        this.f12873h = str;
        this.f12874i = im1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.pb0
    /* JADX INFO: renamed from: C0 */
    public final void mo6106C0(String str, String str2) {
        im1 im1Var = this.f12874i;
        hm1 hm1VarM6107a = m6107a("adapter_init_finished");
        hm1VarM6107a.f14911a.put("ancn", str);
        hm1VarM6107a.f14911a.put("rqe", str2);
        im1Var.mo7280b(hm1VarM6107a);
    }

    /* JADX INFO: renamed from: a */
    public final hm1 m6107a(String str) {
        String str2 = this.f12875j.mo4811O() ? "" : this.f12873h;
        hm1 hm1VarM7144a = hm1.m7144a(str);
        hm1VarM7144a.f14911a.put("tms", Long.toString(C2330u.f10884a.f10896k.mo5621a(), 10));
        hm1VarM7144a.f14911a.put("tid", str2);
        return hm1VarM7144a;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.pb0
    /* JADX INFO: renamed from: c */
    public final synchronized void mo6108c() {
        if (this.f12872g) {
            return;
        }
        this.f12874i.mo7280b(m6107a("init_finished"));
        this.f12872g = true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.pb0
    /* JADX INFO: renamed from: e */
    public final synchronized void mo6109e() {
        if (this.f12871f) {
            return;
        }
        this.f12874i.mo7280b(m6107a("init_started"));
        this.f12871f = true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.pb0
    /* JADX INFO: renamed from: f */
    public final void mo6110f(String str) {
        im1 im1Var = this.f12874i;
        hm1 hm1VarM6107a = m6107a("adapter_init_started");
        hm1VarM6107a.f14911a.put("ancn", str);
        im1Var.mo7280b(hm1VarM6107a);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.pb0
    /* JADX INFO: renamed from: t */
    public final void mo6111t(String str) {
        im1 im1Var = this.f12874i;
        hm1 hm1VarM6107a = m6107a("adapter_init_finished");
        hm1VarM6107a.f14911a.put("ancn", str);
        im1Var.mo7280b(hm1VarM6107a);
    }
}
