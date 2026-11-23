package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Collections;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class o31 extends AbstractBinderC3566u implements v80 {

    /* JADX INFO: renamed from: f */
    public final Context f17510f;

    /* JADX INFO: renamed from: g */
    public final ie1 f17511g;

    /* JADX INFO: renamed from: h */
    public final String f17512h;

    /* JADX INFO: renamed from: i */
    public final h41 f17513i;

    /* JADX INFO: renamed from: j */
    public jw2 f17514j;

    /* JADX INFO: renamed from: k */
    public final hi1 f17515k;

    /* JADX INFO: renamed from: l */
    public n00 f17516l;

    public o31(Context context, jw2 jw2Var, String str, ie1 ie1Var, h41 h41Var) {
        this.f17510f = context;
        this.f17511g = ie1Var;
        this.f17514j = jw2Var;
        this.f17512h = str;
        this.f17513i = h41Var;
        this.f17515k = ie1Var.f15172i;
        ie1Var.f15171h.m7109u0(this, ie1Var.f15165b);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: B */
    public final InterfaceC3122i mo4864B() {
        return this.f17513i.m7054n();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: C */
    public final InterfaceC2863b0 mo4865C() {
        InterfaceC2863b0 interfaceC2863b0;
        h41 h41Var = this.f17513i;
        synchronized (h41Var) {
            interfaceC2863b0 = h41Var.f14749g.get();
        }
        return interfaceC2863b0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: C6 */
    public final void mo4866C6(InterfaceC3177jh interfaceC3177jh) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: D5 */
    public final void mo4867D5(InterfaceC2863b0 interfaceC2863b0) {
        C2622l.m5354d("setAppEventListener must be called on the main UI thread.");
        h41 h41Var = this.f17513i;
        h41Var.f14749g.set(interfaceC2863b0);
        h41Var.f14754l.set(true);
        h41Var.m7055p();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: E5 */
    public final void mo4868E5(ew2 ew2Var, InterfaceC3233l interfaceC3233l) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: F2 */
    public final synchronized void mo4869F2(jw2 jw2Var) {
        C2622l.m5354d("setAdSize must be called on the main UI thread.");
        this.f17515k.f14856b = jw2Var;
        this.f17514j = jw2Var;
        n00 n00Var = this.f17516l;
        if (n00Var != null) {
            n00Var.mo7744d(this.f17511g.f15169f, jw2Var);
        }
    }

    /* JADX INFO: renamed from: F6 */
    public final synchronized void m7958F6(jw2 jw2Var) {
        hi1 hi1Var = this.f17515k;
        hi1Var.f14856b = jw2Var;
        hi1Var.f14870p = this.f17514j.f15848s;
    }

    /* JADX INFO: renamed from: G6 */
    public final synchronized boolean m7959G6(ew2 ew2Var) throws RemoteException {
        C2622l.m5354d("loadAd must be called on the main UI thread.");
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        if (!C2267h1.m4749h(this.f17510f) || ew2Var.f13731x != null) {
            cw0.m6239i(this.f17510f, ew2Var.f13718k);
            return this.f17511g.mo6607b(ew2Var, this.f17512h, null, new n31(this));
        }
        C2622l.m5408n3("Failed to load the ad because app ID is missing.");
        h41 h41Var = this.f17513i;
        if (h41Var != null) {
            h41Var.mo6216o0(C2622l.m5285M2(4, null, null));
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: H5 */
    public final void mo4872H5(C3235l1 c3235l1) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: I4 */
    public final void mo4873I4(String str) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: L0 */
    public final void mo4874L0(boolean z) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: M */
    public final synchronized InterfaceC3087h1 mo4875M() {
        C2622l.m5354d("getVideoController must be called from the main thread.");
        n00 n00Var = this.f17516l;
        if (n00Var == null) {
            return null;
        }
        return n00Var.mo7745e();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: P1 */
    public final void mo4876P1(InterfaceC3011f interfaceC3011f) {
        C2622l.m5354d("setAdListener must be called on the main UI thread.");
        l41 l41Var = this.f17511g.f15168e;
        synchronized (l41Var) {
            l41Var.f16279f = interfaceC3011f;
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: Q4 */
    public final void mo4877Q4(zq2 zq2Var) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: R5 */
    public final synchronized void mo4878R5(C3012f0 c3012f0) {
        C2622l.m5354d("setCorrelationIdProvider must be called on the main UI thread");
        this.f17515k.f14872r = c3012f0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: S4 */
    public final void mo4879S4(InterfaceC3123i0 interfaceC3123i0) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: T5 */
    public final void mo4880T5(InterfaceC2864b1 interfaceC2864b1) {
        C2622l.m5354d("setPaidEventListener must be called on the main UI thread.");
        this.f17513i.f14750h.set(interfaceC2864b1);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: U2 */
    public final void mo4881U2(InterfaceC3251lh interfaceC3251lh, String str) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: U4 */
    public final void mo4882U4(InterfaceC3715y interfaceC3715y) {
        C2622l.m5354d("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: a */
    public final InterfaceC2799a mo4883a() {
        C2622l.m5354d("destroy must be called on the main UI thread.");
        return new BinderC2800b(this.f17511g.f15169f);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: a4 */
    public final void mo4884a4(InterfaceC2799a interfaceC2799a) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: a6 */
    public final synchronized void mo4885a6(C3310n2 c3310n2) {
        C2622l.m5354d("setVideoOptions must be called on the main UI thread.");
        this.f17515k.f14858d = c3310n2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: b */
    public final synchronized void mo4886b() {
        C2622l.m5354d("destroy must be called on the main UI thread.");
        n00 n00Var = this.f17516l;
        if (n00Var != null) {
            n00Var.mo7041b();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: b0 */
    public final synchronized boolean mo4887b0() {
        return this.f17511g.mo6606a();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: b2 */
    public final boolean mo4888b2() {
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: d */
    public final synchronized void mo4889d() {
        C2622l.m5354d("pause must be called on the main UI thread.");
        n00 n00Var = this.f17516l;
        if (n00Var != null) {
            n00Var.f16666c.m6936B0(null);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: f */
    public final synchronized void mo4890f() {
        C2622l.m5354d("resume must be called on the main UI thread.");
        n00 n00Var = this.f17516l;
        if (n00Var != null) {
            n00Var.f16666c.m6937E0(null);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: h4 */
    public final synchronized void mo4891h4(boolean z) {
        C2622l.m5354d("setManualImpressionsEnabled must be called from the main thread.");
        this.f17515k.f14859e = z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: j */
    public final void mo4892j() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: j5 */
    public final void mo4893j5(InterfaceC3122i interfaceC3122i) {
        C2622l.m5354d("setAdListener must be called on the main UI thread.");
        this.f17513i.f14748f.set(interfaceC3122i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: k */
    public final Bundle mo4894k() {
        C2622l.m5354d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: m */
    public final synchronized void mo4895m() {
        C2622l.m5354d("recordManualImpression must be called on the main UI thread.");
        n00 n00Var = this.f17516l;
        if (n00Var != null) {
            n00Var.mo7749i();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: n2 */
    public final void mo4896n2(String str) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: o */
    public final synchronized InterfaceC2976e1 mo4897o() {
        if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14413o4)).booleanValue()) {
            return null;
        }
        n00 n00Var = this.f17516l;
        if (n00Var == null) {
            return null;
        }
        return n00Var.f16669f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: p */
    public final synchronized jw2 mo4898p() {
        C2622l.m5354d("getAdSize must be called on the main UI thread.");
        n00 n00Var = this.f17516l;
        if (n00Var != null) {
            return C2622l.m5279L1(this.f17510f, Collections.singletonList(n00Var.mo7746f()));
        }
        return this.f17515k.f14856b;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: p2 */
    public final void mo4899p2(InterfaceC3216kj interfaceC3216kj) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: q */
    public final synchronized String mo4900q() {
        a60 a60Var;
        n00 n00Var = this.f17516l;
        if (n00Var == null || (a60Var = n00Var.f16669f) == null) {
            return null;
        }
        return a60Var.f12023f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: r */
    public final synchronized String mo4901r() {
        return this.f17512h;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: u2 */
    public final synchronized void mo4902u2(InterfaceC3719y3 interfaceC3719y3) {
        C2622l.m5354d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f17511g.f15170g = interfaceC3719y3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: x1 */
    public final void mo4903x1(qw2 qw2Var) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: y0 */
    public final synchronized boolean mo4904y0(ew2 ew2Var) throws RemoteException {
        m7958F6(this.f17514j);
        return m7959G6(ew2Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: z */
    public final synchronized String mo4905z() {
        a60 a60Var;
        n00 n00Var = this.f17516l;
        if (n00Var == null || (a60Var = n00Var.f16669f) == null) {
            return null;
        }
        return a60Var.f12023f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.v80
    public final synchronized void zza() {
        if (!this.f17511g.m7245c()) {
            this.f17511g.f15171h.m8475B0(60);
            return;
        }
        jw2 jw2VarM5279L1 = this.f17515k.f14856b;
        n00 n00Var = this.f17516l;
        if (n00Var != null && n00Var.mo7747g() != null && this.f17515k.f14870p) {
            jw2VarM5279L1 = C2622l.m5279L1(this.f17510f, Collections.singletonList(this.f17516l.mo7747g()));
        }
        m7958F6(jw2VarM5279L1);
        try {
            m7959G6(this.f17515k.f14855a);
        } catch (RemoteException unused) {
            C2622l.m5226A3("Failed to refresh the banner ad.");
        }
    }
}
