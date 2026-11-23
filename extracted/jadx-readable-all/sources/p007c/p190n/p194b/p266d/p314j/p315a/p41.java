package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class p41 extends AbstractBinderC3566u {

    /* JADX INFO: renamed from: f */
    public final jw2 f17832f;

    /* JADX INFO: renamed from: g */
    public final Context f17833g;

    /* JADX INFO: renamed from: h */
    public final yf1 f17834h;

    /* JADX INFO: renamed from: i */
    public final String f17835i;

    /* JADX INFO: renamed from: j */
    public final h41 f17836j;

    /* JADX INFO: renamed from: k */
    public final wg1 f17837k;

    /* JADX INFO: renamed from: l */
    public yc0 f17838l;

    /* JADX INFO: renamed from: m */
    public boolean f17839m = ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14416p0)).booleanValue();

    public p41(Context context, jw2 jw2Var, String str, yf1 yf1Var, h41 h41Var, wg1 wg1Var) {
        this.f17832f = jw2Var;
        this.f17835i = str;
        this.f17833g = context;
        this.f17834h = yf1Var;
        this.f17836j = h41Var;
        this.f17837k = wg1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: B */
    public final InterfaceC3122i mo4864B() {
        return this.f17836j.m7054n();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: C */
    public final InterfaceC2863b0 mo4865C() {
        InterfaceC2863b0 interfaceC2863b0;
        h41 h41Var = this.f17836j;
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
        h41 h41Var = this.f17836j;
        h41Var.f14749g.set(interfaceC2863b0);
        h41Var.f14754l.set(true);
        h41Var.m7055p();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: E5 */
    public final void mo4868E5(ew2 ew2Var, InterfaceC3233l interfaceC3233l) {
        this.f17836j.f14751i.set(interfaceC3233l);
        mo4904y0(ew2Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: F2 */
    public final void mo4869F2(jw2 jw2Var) {
    }

    /* JADX INFO: renamed from: F6 */
    public final synchronized boolean m8077F6() {
        yc0 yc0Var;
        yc0Var = this.f17838l;
        return (yc0Var == null || yc0Var.f21847m.f14729g.get()) ? false : true;
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
    public final synchronized void mo4874L0(boolean z) {
        C2622l.m5354d("setImmersiveMode must be called on the main UI thread.");
        this.f17839m = z;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: M */
    public final InterfaceC3087h1 mo4875M() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: P1 */
    public final void mo4876P1(InterfaceC3011f interfaceC3011f) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: Q4 */
    public final void mo4877Q4(zq2 zq2Var) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: R5 */
    public final void mo4878R5(C3012f0 c3012f0) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: S4 */
    public final void mo4879S4(InterfaceC3123i0 interfaceC3123i0) {
        this.f17836j.f14752j.set(interfaceC3123i0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: T5 */
    public final void mo4880T5(InterfaceC2864b1 interfaceC2864b1) {
        C2622l.m5354d("setPaidEventListener must be called on the main UI thread.");
        this.f17836j.f14750h.set(interfaceC2864b1);
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
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: a4 */
    public final synchronized void mo4884a4(InterfaceC2799a interfaceC2799a) {
        if (this.f17838l != null) {
            this.f17838l.m8790c(this.f17839m, (Activity) BinderC2800b.m5639T1(interfaceC2799a));
        } else {
            C2622l.m5226A3("Interstitial can not be shown before loaded.");
            cw0.m6234d(this.f17836j.f14752j, new v31(C2622l.m5285M2(9, null, null)));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: a6 */
    public final void mo4885a6(C3310n2 c3310n2) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: b */
    public final synchronized void mo4886b() {
        C2622l.m5354d("destroy must be called on the main UI thread.");
        yc0 yc0Var = this.f17838l;
        if (yc0Var != null) {
            yc0Var.f16666c.m6938P0(null);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: b0 */
    public final synchronized boolean mo4887b0() {
        return this.f17834h.mo6606a();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: b2 */
    public final synchronized boolean mo4888b2() {
        C2622l.m5354d("isLoaded must be called on the main UI thread.");
        return m8077F6();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: d */
    public final synchronized void mo4889d() {
        C2622l.m5354d("pause must be called on the main UI thread.");
        yc0 yc0Var = this.f17838l;
        if (yc0Var != null) {
            yc0Var.f16666c.m6936B0(null);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: f */
    public final synchronized void mo4890f() {
        C2622l.m5354d("resume must be called on the main UI thread.");
        yc0 yc0Var = this.f17838l;
        if (yc0Var != null) {
            yc0Var.f16666c.m6937E0(null);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: h4 */
    public final void mo4891h4(boolean z) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: j */
    public final synchronized void mo4892j() {
        C2622l.m5354d("showInterstitial must be called on the main UI thread.");
        yc0 yc0Var = this.f17838l;
        if (yc0Var == null) {
            return;
        }
        yc0Var.m8790c(this.f17839m, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: j5 */
    public final void mo4893j5(InterfaceC3122i interfaceC3122i) {
        C2622l.m5354d("setAdListener must be called on the main UI thread.");
        this.f17836j.f14748f.set(interfaceC3122i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: k */
    public final Bundle mo4894k() {
        C2622l.m5354d("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: m */
    public final void mo4895m() {
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
        yc0 yc0Var = this.f17838l;
        if (yc0Var == null) {
            return null;
        }
        return yc0Var.f16669f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: p */
    public final jw2 mo4898p() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: p2 */
    public final void mo4899p2(InterfaceC3216kj interfaceC3216kj) {
        this.f17837k.f21099j.set(interfaceC3216kj);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: q */
    public final synchronized String mo4900q() {
        a60 a60Var;
        yc0 yc0Var = this.f17838l;
        if (yc0Var == null || (a60Var = yc0Var.f16669f) == null) {
            return null;
        }
        return a60Var.f12023f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: r */
    public final synchronized String mo4901r() {
        return this.f17835i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: u2 */
    public final synchronized void mo4902u2(InterfaceC3719y3 interfaceC3719y3) {
        C2622l.m5354d("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.f17834h.f21870f = interfaceC3719y3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: x1 */
    public final void mo4903x1(qw2 qw2Var) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: y0 */
    public final synchronized boolean mo4904y0(ew2 ew2Var) {
        C2622l.m5354d("loadAd must be called on the main UI thread.");
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        if (C2267h1.m4749h(this.f17833g) && ew2Var.f13731x == null) {
            C2622l.m5408n3("Failed to load the ad because app ID is missing.");
            h41 h41Var = this.f17836j;
            if (h41Var != null) {
                h41Var.mo6216o0(C2622l.m5285M2(4, null, null));
            }
            return false;
        }
        if (m8077F6()) {
            return false;
        }
        cw0.m6239i(this.f17833g, ew2Var.f13718k);
        this.f17838l = null;
        return this.f17834h.mo6607b(ew2Var, this.f17835i, new rf1(this.f17832f), new o41(this));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: z */
    public final synchronized String mo4905z() {
        a60 a60Var;
        yc0 yc0Var = this.f17838l;
        if (yc0Var == null || (a60Var = yc0Var.f16669f) == null) {
            return null;
        }
        return a60Var.f12023f;
    }
}
