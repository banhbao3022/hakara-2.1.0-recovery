package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import p007c.p190n.p194b.p266d.p267a.p282z.C2321l;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.C2233p;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2242y;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rx0 implements ce0 {

    /* JADX INFO: renamed from: a */
    public final C3702xn f19412a;

    /* JADX INFO: renamed from: b */
    public final kv1<a00> f19413b;

    /* JADX INFO: renamed from: c */
    public final rh1 f19414c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3410ps f19415d;

    /* JADX INFO: renamed from: e */
    public final ii1 f19416e;

    /* JADX INFO: renamed from: f */
    public final C3575u8 f19417f;

    /* JADX INFO: renamed from: g */
    public final boolean f19418g;

    public rx0(C3702xn c3702xn, kv1<a00> kv1Var, rh1 rh1Var, InterfaceC3410ps interfaceC3410ps, ii1 ii1Var, boolean z, C3575u8 c3575u8) {
        this.f19412a = c3702xn;
        this.f19413b = kv1Var;
        this.f19414c = rh1Var;
        this.f19415d = interfaceC3410ps;
        this.f19416e = ii1Var;
        this.f19418g = z;
        this.f19417f = c3575u8;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ce0
    /* JADX INFO: renamed from: a */
    public final void mo6171a(boolean z, Context context) {
        int i;
        a00 a00Var = (a00) cw0.m6255y(this.f19413b);
        this.f19415d.mo6451K0(true);
        C2321l c2321l = new C2321l(this.f19418g ? this.f19417f.m8472a(true) : true, true, this.f19418g ? this.f19417f.m8473b() : false, this.f19418g ? this.f19417f.m8474c() : 0.0f, -1, z, this.f19414c.f18786J, false);
        C2233p c2233p = C2330u.f10884a.f10888c;
        sd0 sd0VarMo5654j = a00Var.mo5654j();
        InterfaceC3410ps interfaceC3410ps = this.f19415d;
        int i2 = this.f19414c.f18788L;
        if (i2 == -1) {
            qw2 qw2Var = this.f19416e.f15197j;
            if (qw2Var != null) {
                int i3 = qw2Var.f18655f;
                if (i3 == 1) {
                    i = 7;
                } else if (i3 == 2) {
                    i = 6;
                }
            }
            C2622l.m5318U2("Error setting app open orientation; no targeting orientation available.");
            i2 = this.f19414c.f18788L;
            i = i2;
        } else {
            i = i2;
        }
        C3702xn c3702xn = this.f19412a;
        rh1 rh1Var = this.f19414c;
        String str = rh1Var.f18777A;
        wh1 wh1Var = rh1Var.f18827r;
        C2233p.m4697a(context, new AdOverlayInfoParcel((uv2) null, sd0VarMo5654j, (InterfaceC2242y) null, interfaceC3410ps, i, c3702xn, str, c2321l, wh1Var.f21126b, wh1Var.f21125a, this.f19416e.f15193f), true);
    }
}
