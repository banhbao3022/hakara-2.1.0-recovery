package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.RemoteException;
import java.util.Collections;
import java.util.List;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fk0 extends AbstractBinderC3093h7 {

    /* JADX INFO: renamed from: f */
    public final String f14045f;

    /* JADX INFO: renamed from: g */
    public final wf0 f14046g;

    /* JADX INFO: renamed from: h */
    public final bg0 f14047h;

    public fk0(String str, wf0 wf0Var, bg0 bg0Var) {
        this.f14045f = str;
        this.f14046g = wf0Var;
        this.f14047h = bg0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: C */
    public final InterfaceC2799a mo6818C() throws RemoteException {
        return this.f14047h.m6001g();
    }

    /* JADX INFO: renamed from: F6 */
    public final void m6819F6(InterfaceC3456r0 interfaceC3456r0) throws RemoteException {
        wf0 wf0Var = this.f14046g;
        synchronized (wf0Var) {
            wf0Var.f21053k.mo5761s(interfaceC3456r0);
        }
    }

    /* JADX INFO: renamed from: G6 */
    public final void m6820G6(InterfaceC3345o0 interfaceC3345o0) throws RemoteException {
        wf0 wf0Var = this.f14046g;
        synchronized (wf0Var) {
            wf0Var.f21053k.mo5743b(interfaceC3345o0);
        }
    }

    /* JADX INFO: renamed from: H6 */
    public final void m6821H6() {
        wf0 wf0Var = this.f14046g;
        synchronized (wf0Var) {
            wf0Var.f21053k.mo5747f();
        }
    }

    /* JADX INFO: renamed from: I6 */
    public final void m6822I6() {
        final wf0 wf0Var = this.f14046g;
        synchronized (wf0Var) {
            wh0 wh0Var = wf0Var.f21062t;
            if (wh0Var == null) {
                C2622l.m5318U2("Ad should be associated with an ad view before calling recordCustomClickGesture()");
            } else {
                final boolean z = wh0Var instanceof ug0;
                wf0Var.f21051i.execute(new Runnable(wf0Var, z) { // from class: c.n.b.d.j.a.uf0

                    /* JADX INFO: renamed from: f */
                    public final wf0 f20300f;

                    /* JADX INFO: renamed from: g */
                    public final boolean f20301g;

                    {
                        this.f20300f = wf0Var;
                        this.f20301g = z;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        wf0 wf0Var2 = this.f20300f;
                        wf0Var2.f21053k.mo5762t(wf0Var2.f21062t.mo8489K2(), wf0Var2.f21062t.mo8492h(), wf0Var2.f21062t.mo8494k(), this.f20301g);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: J6 */
    public final boolean m6823J6() {
        boolean zMo5748g;
        wf0 wf0Var = this.f14046g;
        synchronized (wf0Var) {
            zMo5748g = wf0Var.f21053k.mo5748g();
        }
        return zMo5748g;
    }

    /* JADX INFO: renamed from: K6 */
    public final void m6824K6(InterfaceC2864b1 interfaceC2864b1) throws RemoteException {
        wf0 wf0Var = this.f14046g;
        synchronized (wf0Var) {
            wf0Var.f21048B.f15882f.set(interfaceC2864b1);
        }
    }

    /* JADX INFO: renamed from: L6 */
    public final void m6825L6(InterfaceC3019f7 interfaceC3019f7) throws RemoteException {
        wf0 wf0Var = this.f14046g;
        synchronized (wf0Var) {
            wf0Var.f21053k.mo5752k(interfaceC3019f7);
        }
    }

    /* JADX INFO: renamed from: M6 */
    public final void m6826M6() throws RemoteException {
        wf0 wf0Var = this.f14046g;
        synchronized (wf0Var) {
            wf0Var.f21053k.mo5755n();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final boolean m6827b0() throws RemoteException {
        return (this.f14047h.m5995a().isEmpty() || this.f14047h.m5996b() == null) ? false : true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: c */
    public final String mo6828c() throws RemoteException {
        return this.f14047h.m6011u();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: d */
    public final List<?> mo6829d() throws RemoteException {
        return this.f14047h.m6012v();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: f */
    public final String mo6830f() throws RemoteException {
        return this.f14047h.m5997c();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: g */
    public final InterfaceC3610v5 mo6831g() throws RemoteException {
        InterfaceC3610v5 interfaceC3610v5;
        bg0 bg0Var = this.f14047h;
        synchronized (bg0Var) {
            interfaceC3610v5 = bg0Var.f12615o;
        }
        return interfaceC3610v5;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: h */
    public final String mo6832h() throws RemoteException {
        String strM6007q;
        bg0 bg0Var = this.f14047h;
        synchronized (bg0Var) {
            strM6007q = bg0Var.m6007q("advertiser");
        }
        return strM6007q;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: i */
    public final String mo6833i() throws RemoteException {
        return this.f14047h.m5999e();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: j */
    public final String mo6834j() throws RemoteException {
        String strM6007q;
        bg0 bg0Var = this.f14047h;
        synchronized (bg0Var) {
            strM6007q = bg0Var.m6007q("store");
        }
        return strM6007q;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: k */
    public final double mo6835k() throws RemoteException {
        double d;
        bg0 bg0Var = this.f14047h;
        synchronized (bg0Var) {
            d = bg0Var.f12614n;
        }
        return d;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: l */
    public final InterfaceC3350o5 mo6836l() throws RemoteException {
        return this.f14047h.m6010t();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: m */
    public final String mo6837m() throws RemoteException {
        String strM6007q;
        bg0 bg0Var = this.f14047h;
        synchronized (bg0Var) {
            strM6007q = bg0Var.m6007q("price");
        }
        return strM6007q;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: p */
    public final InterfaceC3087h1 mo6838p() throws RemoteException {
        return this.f14047h.m6009s();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3130i7
    /* JADX INFO: renamed from: v */
    public final List<?> mo6839v() throws RemoteException {
        return m6827b0() ? this.f14047h.m5995a() : Collections.emptyList();
    }
}
