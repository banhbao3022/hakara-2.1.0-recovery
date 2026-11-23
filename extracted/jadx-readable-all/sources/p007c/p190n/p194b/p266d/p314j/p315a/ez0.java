package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import p007c.p190n.p194b.p266d.p267a.p282z.C2321l;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.C2233p;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2242y;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ez0 implements ce0 {

    /* JADX INFO: renamed from: a */
    public final Context f13760a;

    /* JADX INFO: renamed from: b */
    public final C3702xn f13761b;

    /* JADX INFO: renamed from: c */
    public final kv1<zc0> f13762c;

    /* JADX INFO: renamed from: d */
    public final rh1 f13763d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC3410ps f13764e;

    /* JADX INFO: renamed from: f */
    public final ii1 f13765f;

    /* JADX INFO: renamed from: g */
    public final C3575u8 f13766g;

    /* JADX INFO: renamed from: h */
    public final boolean f13767h;

    public /* synthetic */ ez0(Context context, C3702xn c3702xn, kv1 kv1Var, rh1 rh1Var, InterfaceC3410ps interfaceC3410ps, ii1 ii1Var, boolean z, C3575u8 c3575u8) {
        this.f13760a = context;
        this.f13761b = c3702xn;
        this.f13762c = kv1Var;
        this.f13763d = rh1Var;
        this.f13764e = interfaceC3410ps;
        this.f13765f = ii1Var;
        this.f13766g = c3575u8;
        this.f13767h = z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ce0
    /* JADX INFO: renamed from: a */
    public final void mo6171a(boolean z, Context context) {
        zc0 zc0Var = (zc0) cw0.m6255y(this.f13762c);
        this.f13764e.mo6451K0(true);
        boolean zM8472a = this.f13767h ? this.f13766g.m8472a(false) : false;
        C2330u c2330u = C2330u.f10884a;
        C2267h1 c2267h1 = c2330u.f10889d;
        C2321l c2321l = new C2321l(zM8472a, C2267h1.m4750i(this.f13760a), this.f13767h ? this.f13766g.m8473b() : false, this.f13767h ? this.f13766g.m8474c() : 0.0f, -1, z, this.f13763d.f18786J, false);
        C2233p c2233p = c2330u.f10888c;
        sd0 sd0VarMo7414j = zc0Var.mo7414j();
        InterfaceC3410ps interfaceC3410ps = this.f13764e;
        rh1 rh1Var = this.f13763d;
        int i = rh1Var.f18788L;
        C3702xn c3702xn = this.f13761b;
        String str = rh1Var.f18777A;
        wh1 wh1Var = rh1Var.f18827r;
        C2233p.m4697a(context, new AdOverlayInfoParcel((uv2) null, sd0VarMo7414j, (InterfaceC2242y) null, interfaceC3410ps, i, c3702xn, str, c2321l, wh1Var.f21126b, wh1Var.f21125a, this.f13765f.f15193f), true);
    }
}
