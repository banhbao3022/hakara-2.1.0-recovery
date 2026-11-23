package p007c.p190n.p194b.p266d.p267a.p282z;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Objects;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p315a.AbstractBinderC3566u;
import p007c.p190n.p194b.p266d.p314j.p315a.C2962do;
import p007c.p190n.p194b.p266d.p314j.p315a.C3012f0;
import p007c.p190n.p194b.p266d.p314j.p315a.C3053g4;
import p007c.p190n.p194b.p266d.p314j.p315a.C3235l1;
import p007c.p190n.p194b.p266d.p314j.p315a.C3310n2;
import p007c.p190n.p194b.p266d.p314j.p315a.C3702xn;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2863b0;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2864b1;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2976e1;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3011f;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3087h1;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3122i;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3123i0;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3177jh;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3216kj;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3233l;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3251lh;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3715y;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3719y3;
import p007c.p190n.p194b.p266d.p314j.p315a.ew2;
import p007c.p190n.p194b.p266d.p314j.p315a.fa1;
import p007c.p190n.p194b.p266d.p314j.p315a.jw2;
import p007c.p190n.p194b.p266d.p314j.p315a.qw2;
import p007c.p190n.p194b.p266d.p314j.p315a.rd2;
import p007c.p190n.p194b.p266d.p314j.p315a.zq2;

/* JADX INFO: renamed from: c.n.b.d.a.z.t */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2329t extends AbstractBinderC3566u {

    /* JADX INFO: renamed from: f */
    public final C3702xn f10875f;

    /* JADX INFO: renamed from: g */
    public final jw2 f10876g;

    /* JADX INFO: renamed from: h */
    public final Future<rd2> f10877h = C2962do.f13330a.mo6691u0(new CallableC2326q(this));

    /* JADX INFO: renamed from: i */
    public final Context f10878i;

    /* JADX INFO: renamed from: j */
    public final C2328s f10879j;

    /* JADX INFO: renamed from: k */
    public WebView f10880k;

    /* JADX INFO: renamed from: l */
    public InterfaceC3122i f10881l;

    /* JADX INFO: renamed from: m */
    public rd2 f10882m;

    /* JADX INFO: renamed from: n */
    public AsyncTask<Void, Void, String> f10883n;

    public BinderC2329t(Context context, jw2 jw2Var, String str, C3702xn c3702xn) {
        this.f10878i = context;
        this.f10875f = c3702xn;
        this.f10876g = jw2Var;
        this.f10880k = new WebView(context);
        this.f10879j = new C2328s(context, str);
        m4870F6(0);
        this.f10880k.setVerticalScrollBarEnabled(false);
        this.f10880k.getSettings().setJavaScriptEnabled(true);
        this.f10880k.setWebViewClient(new C2324o(this));
        this.f10880k.setOnTouchListener(new ViewOnTouchListenerC2325p(this));
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: B */
    public final InterfaceC3122i mo4864B() {
        throw new IllegalStateException("getIAdListener not implemented");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: C */
    public final InterfaceC2863b0 mo4865C() {
        throw new IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: C6 */
    public final void mo4866C6(InterfaceC3177jh interfaceC3177jh) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: D5 */
    public final void mo4867D5(InterfaceC2863b0 interfaceC2863b0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: E5 */
    public final void mo4868E5(ew2 ew2Var, InterfaceC3233l interfaceC3233l) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: F2 */
    public final void mo4869F2(jw2 jw2Var) throws RemoteException {
        throw new IllegalStateException("AdSize must be set before initialization");
    }

    /* JADX INFO: renamed from: F6 */
    public final void m4870F6(int i) {
        if (this.f10880k == null) {
            return;
        }
        this.f10880k.setLayoutParams(new ViewGroup.LayoutParams(-1, i));
    }

    /* JADX INFO: renamed from: G6 */
    public final String m4871G6() {
        String str = this.f10879j.f10874e;
        if (true == TextUtils.isEmpty(str)) {
            str = "www.google.com";
        }
        String strM6603d = C3053g4.f14498d.m6603d();
        return outline.m1552C(new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(strM6603d).length()), "https://", str, strM6603d);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: H5 */
    public final void mo4872H5(C3235l1 c3235l1) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: I4 */
    public final void mo4873I4(String str) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: L0 */
    public final void mo4874L0(boolean z) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: M */
    public final InterfaceC3087h1 mo4875M() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: P1 */
    public final void mo4876P1(InterfaceC3011f interfaceC3011f) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: Q4 */
    public final void mo4877Q4(zq2 zq2Var) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: R5 */
    public final void mo4878R5(C3012f0 c3012f0) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: S4 */
    public final void mo4879S4(InterfaceC3123i0 interfaceC3123i0) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: T5 */
    public final void mo4880T5(InterfaceC2864b1 interfaceC2864b1) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: U2 */
    public final void mo4881U2(InterfaceC3251lh interfaceC3251lh, String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: U4 */
    public final void mo4882U4(InterfaceC3715y interfaceC3715y) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: a */
    public final InterfaceC2799a mo4883a() throws RemoteException {
        C2622l.m5354d("getAdFrame must be called on the main UI thread.");
        return new BinderC2800b(this.f10880k);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: a4 */
    public final void mo4884a4(InterfaceC2799a interfaceC2799a) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: a6 */
    public final void mo4885a6(C3310n2 c3310n2) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: b */
    public final void mo4886b() throws RemoteException {
        C2622l.m5354d("destroy must be called on the main UI thread.");
        this.f10883n.cancel(true);
        this.f10877h.cancel(true);
        this.f10880k.destroy();
        this.f10880k = null;
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
        C2622l.m5354d("pause must be called on the main UI thread.");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: f */
    public final void mo4890f() throws RemoteException {
        C2622l.m5354d("resume must be called on the main UI thread.");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: h4 */
    public final void mo4891h4(boolean z) throws RemoteException {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: j */
    public final void mo4892j() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: j5 */
    public final void mo4893j5(InterfaceC3122i interfaceC3122i) throws RemoteException {
        this.f10881l = interfaceC3122i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: k */
    public final Bundle mo4894k() {
        throw new IllegalStateException("Unused method");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: m */
    public final void mo4895m() throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: n2 */
    public final void mo4896n2(String str) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: o */
    public final InterfaceC2976e1 mo4897o() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: p */
    public final jw2 mo4898p() throws RemoteException {
        return this.f10876g;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: p2 */
    public final void mo4899p2(InterfaceC3216kj interfaceC3216kj) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: q */
    public final String mo4900q() throws RemoteException {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: r */
    public final String mo4901r() {
        throw new IllegalStateException("getAdUnitId not implemented");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: u2 */
    public final void mo4902u2(InterfaceC3719y3 interfaceC3719y3) throws RemoteException {
        throw new IllegalStateException("Unused method");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: x1 */
    public final void mo4903x1(qw2 qw2Var) {
        throw new IllegalStateException("Unused method");
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: y0 */
    public final boolean mo4904y0(ew2 ew2Var) throws RemoteException {
        C2622l.m5379i(this.f10880k, "This Search Ad has already been torn down");
        C2328s c2328s = this.f10879j;
        C3702xn c3702xn = this.f10875f;
        Objects.requireNonNull(c2328s);
        c2328s.f10873d = ew2Var.f13722o.f15867f;
        Bundle bundle = ew2Var.f13725r;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 != null) {
            String strM6603d = C3053g4.f14497c.m6603d();
            for (String str : bundle2.keySet()) {
                if (strM6603d.equals(str)) {
                    c2328s.f10874e = bundle2.getString(str);
                } else if (str.startsWith("csa_")) {
                    c2328s.f10872c.put(str.substring(4), bundle2.getString(str));
                }
            }
            c2328s.f10872c.put("SDKVersion", c3702xn.f21615f);
            if (C3053g4.f14495a.m6603d().booleanValue()) {
                try {
                    Bundle bundleM6783a = fa1.m6783a(c2328s.f10870a, new JSONArray(C3053g4.f14496b.m6603d()));
                    for (String str2 : bundleM6783a.keySet()) {
                        c2328s.f10872c.put(str2, bundleM6783a.get(str2).toString());
                    }
                } catch (JSONException e) {
                    C2622l.m5438t3("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e);
                }
            }
        }
        this.f10883n = new AsyncTaskC2327r(this).execute(new Void[0]);
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3604v
    /* JADX INFO: renamed from: z */
    public final String mo4905z() throws RemoteException {
        return null;
    }
}
