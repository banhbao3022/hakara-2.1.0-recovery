package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.view.ViewGroup;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dk0 extends AbstractBinderC3055g6 {

    /* JADX INFO: renamed from: f */
    public final Context f13289f;

    /* JADX INFO: renamed from: g */
    public final bg0 f13290g;

    /* JADX INFO: renamed from: h */
    public ah0 f13291h;

    /* JADX INFO: renamed from: i */
    public wf0 f13292i;

    public dk0(Context context, bg0 bg0Var, ah0 ah0Var, wf0 wf0Var) {
        this.f13289f = context;
        this.f13290g = bg0Var;
        this.f13291h = ah0Var;
        this.f13292i = wf0Var;
    }

    /* JADX INFO: renamed from: F6 */
    public final void m6363F6(String str) {
        wf0 wf0Var = this.f13292i;
        if (wf0Var != null) {
            synchronized (wf0Var) {
                wf0Var.f21053k.mo5757o0(str);
            }
        }
    }

    /* JADX INFO: renamed from: G6 */
    public final void m6364G6() {
        String str;
        bg0 bg0Var = this.f13290g;
        synchronized (bg0Var) {
            str = bg0Var.f12621u;
        }
        if ("Google".equals(str)) {
            C2622l.m5226A3("Illegal argument specified for omid partner name.");
            return;
        }
        wf0 wf0Var = this.f13292i;
        if (wf0Var != null) {
            wf0Var.m8629c(str, false);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3129i6
    /* JADX INFO: renamed from: H */
    public final boolean mo6365H(InterfaceC2799a interfaceC2799a) {
        ah0 ah0Var;
        Object objM5639T1 = BinderC2800b.m5639T1(interfaceC2799a);
        if (!(objM5639T1 instanceof ViewGroup) || (ah0Var = this.f13291h) == null || !ah0Var.m5786b((ViewGroup) objM5639T1)) {
            return false;
        }
        this.f13290g.m6003i().mo6511w0(new ck0(this));
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3129i6
    /* JADX INFO: renamed from: g */
    public final String mo6366g() {
        return this.f13290g.m6002h();
    }

    /* JADX INFO: renamed from: h */
    public final void m6367h() {
        wf0 wf0Var = this.f13292i;
        if (wf0Var != null) {
            synchronized (wf0Var) {
                if (wf0Var.f21063u) {
                    return;
                }
                wf0Var.f21053k.mo5754m();
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3129i6
    /* JADX INFO: renamed from: m */
    public final InterfaceC2799a mo6368m() {
        return new BinderC2800b(this.f13289f);
    }
}
