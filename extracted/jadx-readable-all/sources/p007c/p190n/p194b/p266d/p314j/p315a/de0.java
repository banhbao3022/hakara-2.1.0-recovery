package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.view.View;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p636z0.p691g.ArrayMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class de0 implements u70, InterfaceC2235r {

    /* JADX INFO: renamed from: f */
    public final Context f13247f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC3410ps f13248g;

    /* JADX INFO: renamed from: h */
    public final rh1 f13249h;

    /* JADX INFO: renamed from: i */
    public final C3702xn f13250i;

    /* JADX INFO: renamed from: j */
    public final gs2 f13251j;

    /* JADX INFO: renamed from: k */
    public InterfaceC2799a f13252k;

    public de0(Context context, InterfaceC3410ps interfaceC3410ps, rh1 rh1Var, C3702xn c3702xn, gs2 gs2Var) {
        this.f13247f = context;
        this.f13248g = interfaceC3410ps;
        this.f13249h = rh1Var;
        this.f13250i = c3702xn;
        this.f13251j = gs2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: F3 */
    public final void mo4698F3() {
        InterfaceC3410ps interfaceC3410ps;
        if (this.f13252k == null || (interfaceC3410ps = this.f13248g) == null) {
            return;
        }
        interfaceC3410ps.mo6501r0("onSdkImpression", new ArrayMap());
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: J3 */
    public final void mo4699J3(int i) {
        this.f13252k = null;
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: O5 */
    public final void mo4700O5() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u70
    /* JADX INFO: renamed from: a0 */
    public final void mo5730a0() {
        EnumC3769zg enumC3769zg;
        EnumC3732yg enumC3732yg;
        gs2 gs2Var = this.f13251j;
        if ((gs2Var == gs2.REWARD_BASED_VIDEO_AD || gs2Var == gs2.INTERSTITIAL || gs2Var == gs2.APP_OPEN) && this.f13249h.f18790N && this.f13248g != null) {
            C2330u c2330u = C2330u.f10884a;
            if (c2330u.f10908w.mo5884o0(this.f13247f)) {
                C3702xn c3702xn = this.f13250i;
                int i = c3702xn.f21616g;
                int i2 = c3702xn.f21617h;
                StringBuilder sb = new StringBuilder(23);
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                String string = sb.toString();
                String str = this.f13249h.f18792P.m7588a() + (-1) != 1 ? "javascript" : null;
                AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14277U2;
                C2862b c2862b = C2862b.f12493a;
                if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
                    if (this.f13249h.f18792P.m7588a() == 1) {
                        enumC3732yg = EnumC3732yg.VIDEO;
                        enumC3769zg = EnumC3769zg.DEFINED_BY_JAVASCRIPT;
                    } else {
                        enumC3769zg = this.f13249h.f18795S == 2 ? EnumC3769zg.UNSPECIFIED : EnumC3769zg.BEGIN_TO_RENDER;
                        enumC3732yg = EnumC3732yg.HTML_DISPLAY;
                    }
                    this.f13252k = c2330u.f10908w.mo5885p0(string, this.f13248g.mo6456N(), "", "javascript", str, enumC3769zg, enumC3732yg, this.f13249h.f18816g0);
                } else {
                    this.f13252k = c2330u.f10908w.mo5882m0(string, this.f13248g.mo6456N(), "", "javascript", str);
                }
                InterfaceC2799a interfaceC2799a = this.f13252k;
                if (interfaceC2799a != null) {
                    c2330u.f10908w.mo5888s0(interfaceC2799a, (View) this.f13248g);
                    this.f13248g.mo6490l0(this.f13252k);
                    c2330u.f10908w.mo5880k0(this.f13252k);
                    if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14295X2)).booleanValue()) {
                        this.f13248g.mo6501r0("onSdkLoaded", new ArrayMap());
                    }
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: i1 */
    public final void mo4701i1() {
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r
    /* JADX INFO: renamed from: r0 */
    public final void mo4702r0() {
    }
}
