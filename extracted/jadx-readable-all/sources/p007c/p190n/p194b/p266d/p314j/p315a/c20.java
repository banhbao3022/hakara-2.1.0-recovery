package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.view.View;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p636z0.p691g.ArrayMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class c20 implements u70, a70 {

    /* JADX INFO: renamed from: f */
    public final Context f12917f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC3410ps f12918g;

    /* JADX INFO: renamed from: h */
    public final rh1 f12919h;

    /* JADX INFO: renamed from: i */
    public final C3702xn f12920i;

    /* JADX INFO: renamed from: j */
    public InterfaceC2799a f12921j;

    /* JADX INFO: renamed from: k */
    public boolean f12922k;

    public c20(Context context, InterfaceC3410ps interfaceC3410ps, rh1 rh1Var, C3702xn c3702xn) {
        this.f12917f = context;
        this.f12918g = interfaceC3410ps;
        this.f12919h = rh1Var;
        this.f12920i = c3702xn;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m6141a() {
        EnumC3732yg enumC3732yg;
        EnumC3769zg enumC3769zg;
        if (this.f12919h.f18790N) {
            if (this.f12918g == null) {
                return;
            }
            C2330u c2330u = C2330u.f10884a;
            if (c2330u.f10908w.mo5884o0(this.f12917f)) {
                C3702xn c3702xn = this.f12920i;
                int i = c3702xn.f21616g;
                int i2 = c3702xn.f21617h;
                StringBuilder sb = new StringBuilder(23);
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                String string = sb.toString();
                String str = this.f12919h.f18792P.m7588a() + (-1) != 1 ? "javascript" : null;
                AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14277U2;
                C2862b c2862b = C2862b.f12493a;
                if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
                    if (this.f12919h.f18792P.m7588a() == 1) {
                        enumC3732yg = EnumC3732yg.VIDEO;
                        enumC3769zg = EnumC3769zg.DEFINED_BY_JAVASCRIPT;
                    } else {
                        enumC3732yg = EnumC3732yg.HTML_DISPLAY;
                        enumC3769zg = this.f12919h.f18811e == 1 ? EnumC3769zg.ONE_PIXEL : EnumC3769zg.BEGIN_TO_RENDER;
                    }
                    this.f12921j = c2330u.f10908w.mo5885p0(string, this.f12918g.mo6456N(), "", "javascript", str, enumC3769zg, enumC3732yg, this.f12919h.f18816g0);
                } else {
                    this.f12921j = c2330u.f10908w.mo5882m0(string, this.f12918g.mo6456N(), "", "javascript", str);
                }
                Object obj = this.f12918g;
                InterfaceC2799a interfaceC2799a = this.f12921j;
                if (interfaceC2799a != null) {
                    c2330u.f10908w.mo5888s0(interfaceC2799a, (View) obj);
                    this.f12918g.mo6490l0(this.f12921j);
                    c2330u.f10908w.mo5880k0(this.f12921j);
                    this.f12922k = true;
                    if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14295X2)).booleanValue()) {
                        this.f12918g.mo6501r0("onSdkLoaded", new ArrayMap());
                    }
                }
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u70
    /* JADX INFO: renamed from: a0 */
    public final synchronized void mo5730a0() {
        if (this.f12922k) {
            return;
        }
        m6141a();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a70
    /* JADX INFO: renamed from: i */
    public final synchronized void mo5699i() {
        InterfaceC3410ps interfaceC3410ps;
        if (!this.f12922k) {
            m6141a();
        }
        if (!this.f12919h.f18790N || this.f12921j == null || (interfaceC3410ps = this.f12918g) == null) {
            return;
        }
        interfaceC3410ps.mo6501r0("onSdkImpression", new ArrayMap());
    }
}
