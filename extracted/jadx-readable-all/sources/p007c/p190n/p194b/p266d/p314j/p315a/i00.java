package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class i00 extends wq2 {

    /* JADX INFO: renamed from: f */
    public final h00 f15063f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC3604v f15064g;

    /* JADX INFO: renamed from: h */
    public final ud1 f15065h;

    /* JADX INFO: renamed from: i */
    public boolean f15066i = false;

    public i00(h00 h00Var, InterfaceC3604v interfaceC3604v, ud1 ud1Var) {
        this.f15063f = h00Var;
        this.f15064g = interfaceC3604v;
        this.f15065h = ud1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xq2
    /* JADX INFO: renamed from: P4 */
    public final void mo7181P4(ar2 ar2Var) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xq2
    /* JADX INFO: renamed from: S3 */
    public final void mo7182S3(InterfaceC2799a interfaceC2799a, cr2 cr2Var) {
        try {
            this.f15065h.f20285i.set(cr2Var);
            this.f15063f.m7042c((Activity) BinderC2800b.m5639T1(interfaceC2799a), cr2Var, this.f15066i);
        } catch (RemoteException e) {
            C2622l.m5271J3("#007 Could not call remote method.", e);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xq2
    /* JADX INFO: renamed from: Y5 */
    public final void mo7183Y5(InterfaceC2864b1 interfaceC2864b1) {
        C2622l.m5354d("setOnPaidEventListener must be called on the main UI thread.");
        ud1 ud1Var = this.f15065h;
        if (ud1Var != null) {
            ud1Var.f20288l.set(interfaceC2864b1);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xq2
    /* JADX INFO: renamed from: c */
    public final InterfaceC3604v mo7184c() {
        return this.f15064g;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xq2
    /* JADX INFO: renamed from: f */
    public final InterfaceC2976e1 mo7185f() {
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14413o4)).booleanValue()) {
            return this.f15063f.f16669f;
        }
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xq2
    /* JADX INFO: renamed from: v0 */
    public final void mo7186v0(boolean z) {
        this.f15066i = z;
    }
}
