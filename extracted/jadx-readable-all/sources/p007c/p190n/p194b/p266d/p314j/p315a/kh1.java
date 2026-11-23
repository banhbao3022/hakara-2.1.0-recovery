package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class kh1 extends AbstractBinderC3698xj {

    /* JADX INFO: renamed from: g */
    public final gh1 f15943g;

    /* JADX INFO: renamed from: h */
    public final wg1 f15944h;

    /* JADX INFO: renamed from: i */
    public final String f15945i;

    /* JADX INFO: renamed from: j */
    public final ei1 f15946j;

    /* JADX INFO: renamed from: k */
    public final Context f15947k;

    /* JADX INFO: renamed from: l */
    public dl0 f15948l;

    /* JADX INFO: renamed from: m */
    public boolean f15949m = ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14416p0)).booleanValue();

    public kh1(String str, gh1 gh1Var, Context context, wg1 wg1Var, ei1 ei1Var) {
        this.f15945i = str;
        this.f15943g = gh1Var;
        this.f15944h = wg1Var;
        this.f15946j = ei1Var;
        this.f15947k = context;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3735yj
    /* JADX INFO: renamed from: D3 */
    public final synchronized void mo6902D3(ew2 ew2Var, InterfaceC3032fk interfaceC3032fk) throws RemoteException {
        m7494F6(ew2Var, interfaceC3032fk, 2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3735yj
    /* JADX INFO: renamed from: F0 */
    public final synchronized void mo6903F0(boolean z) {
        C2622l.m5354d("setImmersiveMode must be called on the main UI thread.");
        this.f15949m = z;
    }

    /* JADX INFO: renamed from: F6 */
    public final synchronized void m7494F6(ew2 ew2Var, InterfaceC3032fk interfaceC3032fk, int i) throws RemoteException {
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        this.f15944h.f21097h.set(interfaceC3032fk);
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        if (C2267h1.m4749h(this.f15947k) && ew2Var.f13731x == null) {
            C2622l.m5408n3("Failed to load the ad because app ID is missing.");
            this.f15944h.mo6216o0(C2622l.m5285M2(4, null, null));
            return;
        }
        if (this.f15948l != null) {
            return;
        }
        yg1 yg1Var = new yg1(null);
        gh1 gh1Var = this.f15943g;
        gh1Var.f14586g.f14869o.f21546a = i;
        gh1Var.mo6607b(ew2Var, this.f15945i, yg1Var, new jh1(this));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3735yj
    /* JADX INFO: renamed from: N0 */
    public final synchronized void mo6904N0(C3291mk c3291mk) {
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        ei1 ei1Var = this.f15946j;
        ei1Var.f13588a = c3291mk.f16781f;
        ei1Var.f13589b = c3291mk.f16782g;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3735yj
    /* JADX INFO: renamed from: X4 */
    public final void mo6905X4(InterfaceC3716y0 interfaceC3716y0) {
        if (interfaceC3716y0 == null) {
            this.f15944h.f21096g.set(null);
            return;
        }
        wg1 wg1Var = this.f15944h;
        wg1Var.f21096g.set(new ih1(this, interfaceC3716y0));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3735yj
    /* JADX INFO: renamed from: Z0 */
    public final synchronized void mo6906Z0(InterfaceC2799a interfaceC2799a, boolean z) throws RemoteException {
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        if (this.f15948l == null) {
            C2622l.m5226A3("Rewarded can not be shown before loaded");
            this.f15944h.mo6976m0(C2622l.m5285M2(9, null, null));
        } else {
            this.f15948l.m6373c(z, (Activity) BinderC2800b.m5639T1(interfaceC2799a));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3735yj
    /* JADX INFO: renamed from: f */
    public final Bundle mo6907f() {
        Bundle bundle;
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        dl0 dl0Var = this.f15948l;
        if (dl0Var == null) {
            return new Bundle();
        }
        a80 a80Var = dl0Var.f13310n;
        synchronized (a80Var) {
            bundle = new Bundle(a80Var.f12033g);
        }
        return bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3735yj
    /* JADX INFO: renamed from: h */
    public final synchronized String mo6908h() throws RemoteException {
        a60 a60Var;
        dl0 dl0Var = this.f15948l;
        if (dl0Var == null || (a60Var = dl0Var.f16669f) == null) {
            return null;
        }
        return a60Var.f12023f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3735yj
    /* JADX INFO: renamed from: i */
    public final boolean mo6909i() {
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        dl0 dl0Var = this.f15948l;
        return (dl0Var == null || dl0Var.f13314r) ? false : true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3735yj
    /* JADX INFO: renamed from: i2 */
    public final void mo6910i2(InterfaceC2864b1 interfaceC2864b1) {
        C2622l.m5354d("setOnPaidEventListener must be called on the main UI thread.");
        this.f15944h.f21102m.set(interfaceC2864b1);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3735yj
    /* JADX INFO: renamed from: j */
    public final InterfaceC3624vj mo6911j() {
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        dl0 dl0Var = this.f15948l;
        if (dl0Var != null) {
            return dl0Var.f13312p;
        }
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3735yj
    /* JADX INFO: renamed from: m */
    public final InterfaceC2976e1 mo6912m() {
        dl0 dl0Var;
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14413o4)).booleanValue() && (dl0Var = this.f15948l) != null) {
            return dl0Var.f16669f;
        }
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3735yj
    /* JADX INFO: renamed from: n4 */
    public final synchronized void mo6913n4(ew2 ew2Var, InterfaceC3032fk interfaceC3032fk) throws RemoteException {
        m7494F6(ew2Var, interfaceC3032fk, 3);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3735yj
    /* JADX INFO: renamed from: o5 */
    public final void mo6914o5(C3069gk c3069gk) {
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        this.f15944h.f21100k.set(c3069gk);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3735yj
    /* JADX INFO: renamed from: t0 */
    public final synchronized void mo6915t0(InterfaceC2799a interfaceC2799a) throws RemoteException {
        mo6906Z0(interfaceC2799a, this.f15949m);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3735yj
    /* JADX INFO: renamed from: w4 */
    public final void mo6916w4(InterfaceC2883bk interfaceC2883bk) {
        C2622l.m5354d("#008 Must be called on the main UI thread.");
        this.f15944h.f21098i.set(interfaceC2883bk);
    }
}
