package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.Collections;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class j31 extends AbstractBinderC3566u {

    /* JADX INFO: renamed from: f */
    public final Context f15461f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC3122i f15462g;

    /* JADX INFO: renamed from: h */
    public final ii1 f15463h;

    /* JADX INFO: renamed from: i */
    public final n00 f15464i;

    /* JADX INFO: renamed from: j */
    public final ViewGroup f15465j;

    public j31(Context context, InterfaceC3122i interfaceC3122i, ii1 ii1Var, n00 n00Var) {
        this.f15461f = context;
        this.f15462g = interfaceC3122i;
        this.f15463h = ii1Var;
        this.f15464i = n00Var;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.removeAllViews();
        frameLayout.addView(n00Var.mo7743c(), C2330u.f10884a.f10891f.mo4721j());
        frameLayout.setMinimumHeight(mo4898p().f15837h);
        frameLayout.setMinimumWidth(mo4898p().f15840k);
        this.f15465j = frameLayout;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: B */
    public final InterfaceC3122i mo4864B() throws RemoteException {
        return this.f15462g;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: C */
    public final InterfaceC2863b0 mo4865C() throws RemoteException {
        return this.f15463h.f15201n;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: C6 */
    public final void mo4866C6(InterfaceC3177jh interfaceC3177jh) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: D5 */
    public final void mo4867D5(InterfaceC2863b0 interfaceC2863b0) throws RemoteException {
        h41 h41Var = this.f15463h.f15190c;
        if (h41Var != null) {
            h41Var.f14749g.set(interfaceC2863b0);
            h41Var.f14754l.set(true);
            h41Var.m7055p();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: E5 */
    public final void mo4868E5(ew2 ew2Var, InterfaceC3233l interfaceC3233l) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: F2 */
    public final void mo4869F2(jw2 jw2Var) throws RemoteException {
        C2622l.m5354d("setAdSize must be called on the main UI thread.");
        n00 n00Var = this.f15464i;
        if (n00Var != null) {
            n00Var.mo7744d(this.f15465j, jw2Var);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: H5 */
    public final void mo4872H5(C3235l1 c3235l1) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: I4 */
    public final void mo4873I4(String str) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: L0 */
    public final void mo4874L0(boolean z) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: M */
    public final InterfaceC3087h1 mo4875M() throws RemoteException {
        return this.f15464i.mo7745e();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: P1 */
    public final void mo4876P1(InterfaceC3011f interfaceC3011f) throws RemoteException {
        C2622l.m5458x3("setAdClickListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: Q4 */
    public final void mo4877Q4(zq2 zq2Var) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: R5 */
    public final void mo4878R5(C3012f0 c3012f0) throws RemoteException {
        C2622l.m5458x3("setCorrelationIdProvider is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: S4 */
    public final void mo4879S4(InterfaceC3123i0 interfaceC3123i0) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: T5 */
    public final void mo4880T5(InterfaceC2864b1 interfaceC2864b1) {
        C2622l.m5458x3("setOnPaidEventListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: U2 */
    public final void mo4881U2(InterfaceC3251lh interfaceC3251lh, String str) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: U4 */
    public final void mo4882U4(InterfaceC3715y interfaceC3715y) throws RemoteException {
        C2622l.m5458x3("setAdMetadataListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: a */
    public final InterfaceC2799a mo4883a() throws RemoteException {
        return new BinderC2800b(this.f15465j);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: a4 */
    public final void mo4884a4(InterfaceC2799a interfaceC2799a) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: a6 */
    public final void mo4885a6(C3310n2 c3310n2) throws RemoteException {
        C2622l.m5458x3("setVideoOptions is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: b */
    public final void mo4886b() throws RemoteException {
        C2622l.m5354d("destroy must be called on the main UI thread.");
        this.f15464i.mo7041b();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: b0 */
    public final boolean mo4887b0() throws RemoteException {
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: b2 */
    public final boolean mo4888b2() throws RemoteException {
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: d */
    public final void mo4889d() throws RemoteException {
        C2622l.m5354d("destroy must be called on the main UI thread.");
        this.f15464i.f16666c.m6936B0(null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: f */
    public final void mo4890f() throws RemoteException {
        C2622l.m5354d("destroy must be called on the main UI thread.");
        this.f15464i.f16666c.m6937E0(null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: h4 */
    public final void mo4891h4(boolean z) throws RemoteException {
        C2622l.m5458x3("setManualImpressionsEnabled is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: j */
    public final void mo4892j() throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: j5 */
    public final void mo4893j5(InterfaceC3122i interfaceC3122i) throws RemoteException {
        C2622l.m5458x3("setAdListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: k */
    public final Bundle mo4894k() throws RemoteException {
        C2622l.m5458x3("getAdMetadata is not supported in Ad Manager AdView returned by AdLoader.");
        return new Bundle();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: m */
    public final void mo4895m() throws RemoteException {
        this.f15464i.mo7749i();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: n2 */
    public final void mo4896n2(String str) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: o */
    public final InterfaceC2976e1 mo4897o() {
        return this.f15464i.f16669f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: p */
    public final jw2 mo4898p() {
        C2622l.m5354d("getAdSize must be called on the main UI thread.");
        return C2622l.m5279L1(this.f15461f, Collections.singletonList(this.f15464i.mo7746f()));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: p2 */
    public final void mo4899p2(InterfaceC3216kj interfaceC3216kj) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: q */
    public final String mo4900q() throws RemoteException {
        a60 a60Var = this.f15464i.f16669f;
        if (a60Var != null) {
            return a60Var.f12023f;
        }
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: r */
    public final String mo4901r() throws RemoteException {
        return this.f15463h.f15193f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: u2 */
    public final void mo4902u2(InterfaceC3719y3 interfaceC3719y3) throws RemoteException {
        C2622l.m5458x3("setOnCustomRenderedAdLoadedListener is not supported in Ad Manager AdView returned by AdLoader.");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: x1 */
    public final void mo4903x1(qw2 qw2Var) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: y0 */
    public final boolean mo4904y0(ew2 ew2Var) throws RemoteException {
        C2622l.m5458x3("loadAd is not supported for an Ad Manager AdView returned from AdLoader.");
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: z */
    public final String mo4905z() throws RemoteException {
        a60 a60Var = this.f15464i.f16669f;
        if (a60Var != null) {
            return a60Var.f12023f;
        }
        return null;
    }
}
