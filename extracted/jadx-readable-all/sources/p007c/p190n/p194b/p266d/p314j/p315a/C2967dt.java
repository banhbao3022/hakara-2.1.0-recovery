package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.stetho.common.Utf8Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.C2312c;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.BinderC2232o;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.C2223f;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2256e;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.InterfaceC2266h0;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.dt */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2967dt extends FrameLayout implements InterfaceC3410ps {

    /* JADX INFO: renamed from: f */
    public final InterfaceC3410ps f13378f;

    /* JADX INFO: renamed from: g */
    public final C3370op f13379g;

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f13380h;

    /* JADX WARN: Multi-variable type inference failed */
    public C2967dt(InterfaceC3410ps interfaceC3410ps) {
        super(interfaceC3410ps.getContext());
        this.f13380h = new AtomicBoolean();
        this.f13378f = interfaceC3410ps;
        this.f13379g = new C3370op(interfaceC3410ps.mo6498p0(), this, this);
        addView((View) interfaceC3410ps);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: A */
    public final void mo6431A(int i) {
        this.f13378f.mo6431A(i);
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.InterfaceC2323n
    /* JADX INFO: renamed from: A0 */
    public final void mo4862A0() {
        this.f13378f.mo4862A0();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: B */
    public final boolean mo6432B() {
        return this.f13378f.mo6432B();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3577ua
    /* JADX INFO: renamed from: B0 */
    public final void mo6433B0(String str, JSONObject jSONObject) {
        this.f13378f.mo6433B0(str, jSONObject);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: C */
    public final kv1<String> mo6434C() {
        return this.f13378f.mo6434C();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3634vt
    /* JADX INFO: renamed from: C0 */
    public final void mo6435C0(InterfaceC2266h0 interfaceC2266h0, pw0 pw0Var, po0 po0Var, im1 im1Var, String str, String str2, int i) {
        this.f13378f.mo6435C0(interfaceC2266h0, pw0Var, po0Var, im1Var, str, str2, i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: D */
    public final BinderC2232o mo6436D() {
        return this.f13378f.mo6436D();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: D0 */
    public final void mo6437D0(C3005eu c3005eu) {
        this.f13378f.mo6437D0(c3005eu);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: E */
    public final void mo6438E(int i) {
        this.f13378f.mo6438E(i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: E0 */
    public final void mo6439E0(int i) {
        this.f13378f.mo6439E0(i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: F */
    public final AbstractC3669wr mo6440F(String str) {
        return this.f13378f.mo6440F(str);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: F0 */
    public final void mo6441F0(boolean z, long j2) {
        this.f13378f.mo6441F0(z, j2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: G */
    public final int mo6442G() {
        return ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14276U1)).booleanValue() ? this.f13378f.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: G0 */
    public final void mo6443G0(boolean z) {
        this.f13378f.mo6443G0(z);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: H */
    public final void mo6444H(boolean z) {
        this.f13378f.mo6444H(z);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: H0 */
    public final void mo6445H0() {
        this.f13378f.mo6445H0();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: I */
    public final BinderC2232o mo6446I() {
        return this.f13378f.mo6446I();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: I0 */
    public final void mo6447I0() {
        C3370op c3370op = this.f13379g;
        Objects.requireNonNull(c3370op);
        C2622l.m5354d("onDestroy must be called from the UI thread.");
        C3333np c3333np = c3370op.f17712d;
        if (c3333np != null) {
            c3333np.f17197i.m8897a();
            AbstractC3037fp abstractC3037fp = c3333np.f17199k;
            if (abstractC3037fp != null) {
                abstractC3037fp.mo6408i();
            }
            c3333np.m7901d();
            c3370op.f17711c.removeView(c3370op.f17712d);
            c3370op.f17712d = null;
        }
        this.f13378f.mo6447I0();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: J */
    public final void mo6448J(String str, C2912cb<InterfaceC3464r8<? super InterfaceC3410ps>> c2912cb) {
        this.f13378f.mo6448J(str, c2912cb);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: J0 */
    public final String mo6449J0() {
        return this.f13378f.mo6449J0();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: K */
    public final InterfaceC3128i5 mo6450K() {
        return this.f13378f.mo6450K();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: K0 */
    public final void mo6451K0(boolean z) {
        this.f13378f.mo6451K0(z);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: L */
    public final void mo6452L(InterfaceC3054g5 interfaceC3054g5) {
        this.f13378f.mo6452L(interfaceC3054g5);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: L0 */
    public final boolean mo6453L0() {
        return this.f13378f.mo6453L0();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: M */
    public final int mo6454M() {
        return this.f13378f.mo6454M();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: M0 */
    public final void mo6455M0(String str, String str2, String str3) {
        this.f13378f.mo6455M0(str, str2, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: N */
    public final WebView mo6456N() {
        return (WebView) this.f13378f;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: N0 */
    public final void mo6457N0() {
        setBackgroundColor(0);
        this.f13378f.setBackgroundColor(0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: O */
    public final boolean mo6458O() {
        return this.f13378f.mo6458O();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: O0 */
    public final InterfaceC2931cu mo6459O0() {
        return ((ViewTreeObserverOnGlobalLayoutListenerC3115ht) this.f13378f).f14998s;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: P */
    public final uq2 mo6460P() {
        return this.f13378f.mo6460P();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: Q */
    public final void mo6461Q(int i) {
        C3370op c3370op = this.f13379g;
        Objects.requireNonNull(c3370op);
        C2622l.m5354d("setPlayerBackgroundColor must be called from the UI thread.");
        C3333np c3333np = c3370op.f17712d;
        if (c3333np != null) {
            c3333np.f17195g.setBackgroundColor(i);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: R */
    public final void mo6462R(BinderC2232o binderC2232o) {
        this.f13378f.mo6462R(binderC2232o);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: S */
    public final void mo6463S(boolean z) {
        this.f13378f.mo6463S(z);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: T */
    public final void mo6464T() {
        this.f13378f.mo6464T();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: U */
    public final void mo6465U() {
        InterfaceC3410ps interfaceC3410ps = this.f13378f;
        HashMap map = new HashMap(3);
        C2330u c2330u = C2330u.f10884a;
        map.put("app_muted", String.valueOf(c2330u.f10894i.m4733b()));
        map.put("app_volume", String.valueOf(c2330u.f10894i.m4732a()));
        ViewTreeObserverOnGlobalLayoutListenerC3115ht viewTreeObserverOnGlobalLayoutListenerC3115ht = (ViewTreeObserverOnGlobalLayoutListenerC3115ht) interfaceC3410ps;
        map.put("device_volume", String.valueOf(C2256e.m4731c(viewTreeObserverOnGlobalLayoutListenerC3115ht.getContext())));
        viewTreeObserverOnGlobalLayoutListenerC3115ht.mo6501r0("volume", map);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: V */
    public final void mo6466V(String str, InterfaceC3464r8<? super InterfaceC3410ps> interfaceC3464r8) {
        this.f13378f.mo6466V(str, interfaceC3464r8);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: W */
    public final void mo6467W(BinderC2232o binderC2232o) {
        this.f13378f.mo6467W(binderC2232o);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3782zt
    /* JADX INFO: renamed from: X */
    public final View mo6468X() {
        return this;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: Y */
    public final void mo6469Y(boolean z) {
        this.f13378f.mo6469Y(z);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3060gb
    /* JADX INFO: renamed from: Z */
    public final void mo6470Z(String str, String str2) {
        this.f13378f.mo6470Z("window.inspectorInfo", str2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3634vt
    /* JADX INFO: renamed from: a */
    public final void mo6471a(C2223f c2223f) {
        this.f13378f.mo6471a(c2223f);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: a0 */
    public final void mo6472a0(boolean z) {
        this.f13378f.mo6472a0(false);
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.InterfaceC2323n
    /* JADX INFO: renamed from: b */
    public final void mo4863b() {
        this.f13378f.mo4863b();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: b0 */
    public final void mo6473b0() {
        this.f13378f.mo6473b0();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: c0 */
    public final void mo6474c0(int i) {
        this.f13378f.mo6474c0(i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    public final boolean canGoBack() {
        return this.f13378f.canGoBack();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: d */
    public final C3370op mo6475d() {
        return this.f13379g;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: d0 */
    public final void mo6476d0(Context context) {
        this.f13378f.mo6476d0(context);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    public final void destroy() {
        final InterfaceC2799a interfaceC2799aMo6481g0 = mo6481g0();
        if (interfaceC2799aMo6481g0 == null) {
            this.f13378f.destroy();
            return;
        }
        xr1 xr1Var = C2267h1.f10713a;
        xr1Var.post(new Runnable(interfaceC2799aMo6481g0) { // from class: c.n.b.d.j.a.bt

            /* JADX INFO: renamed from: f */
            public final InterfaceC2799a f12858f;

            {
                this.f12858f = interfaceC2799aMo6481g0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C2330u.f10884a.f10908w.mo5878R(this.f12858f);
            }
        });
        final InterfaceC3410ps interfaceC3410ps = this.f13378f;
        interfaceC3410ps.getClass();
        xr1Var.postDelayed(new Runnable(interfaceC3410ps) { // from class: c.n.b.d.j.a.ct

            /* JADX INFO: renamed from: f */
            public final InterfaceC3410ps f13117f;

            {
                this.f13117f = interfaceC3410ps;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f13117f.destroy();
            }
        }, ((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14265S2)).intValue());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: e0 */
    public final boolean mo6477e0(boolean z, int i) {
        if (!this.f13380h.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14444t0)).booleanValue()) {
            return false;
        }
        if (this.f13378f.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f13378f.getParent()).removeView((View) this.f13378f);
        }
        this.f13378f.mo6477e0(z, i);
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3060gb
    /* JADX INFO: renamed from: f */
    public final void mo6478f(String str) {
        ((ViewTreeObserverOnGlobalLayoutListenerC3115ht) this.f13378f).m7165R0(str);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: f0 */
    public final void mo6479f0(String str, InterfaceC3464r8<? super InterfaceC3410ps> interfaceC3464r8) {
        this.f13378f.mo6479f0(str, interfaceC3464r8);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: g */
    public final BinderC3263lt mo6480g() {
        return this.f13378f.mo6480g();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC2799a mo6481g0() {
        return this.f13378f.mo6481g0();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    public final void goBack() {
        this.f13378f.goBack();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3485rt, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: h */
    public final Activity mo6482h() {
        return this.f13378f.mo6482h();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: h0 */
    public final void mo6483h0(int i) {
        this.f13378f.mo6483h0(i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: i */
    public final C3422q3 mo6484i() {
        return this.f13378f.mo6484i();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.uv2
    /* JADX INFO: renamed from: i0 */
    public final void mo2739i0() {
        InterfaceC3410ps interfaceC3410ps = this.f13378f;
        if (interfaceC3410ps != null) {
            interfaceC3410ps.mo2739i0();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: j */
    public final void mo6485j() {
        this.f13378f.mo6485j();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: j0 */
    public final void mo6486j0() {
        this.f13378f.mo6486j0();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: k */
    public final C2312c mo6487k() {
        return this.f13378f.mo6487k();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3634vt
    /* JADX INFO: renamed from: k0 */
    public final void mo6488k0(boolean z, int i, String str) {
        this.f13378f.mo6488k0(z, i, str);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: l */
    public final C3459r3 mo6489l() {
        return this.f13378f.mo6489l();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: l0 */
    public final void mo6490l0(InterfaceC2799a interfaceC2799a) {
        this.f13378f.mo6490l0(interfaceC2799a);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    public final void loadData(String str, String str2, String str3) {
        this.f13378f.loadData(str, "text/html", Utf8Charset.NAME);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.f13378f.loadDataWithBaseURL(str, str2, "text/html", Utf8Charset.NAME, null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    public final void loadUrl(String str) {
        this.f13378f.loadUrl(str);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: m */
    public final String mo6491m() {
        return this.f13378f.mo6491m();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3634vt
    /* JADX INFO: renamed from: m0 */
    public final void mo6492m0(boolean z, int i, String str, String str2) {
        this.f13378f.mo6492m0(z, i, str, str2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: n */
    public final int mo6493n() {
        return this.f13378f.mo6493n();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: n0 */
    public final boolean mo6494n0() {
        return this.f13380h.get();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3745yt, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: o */
    public final C3702xn mo6495o() {
        return this.f13378f.mo6495o();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: o0 */
    public final int mo6496o0() {
        return this.f13378f.mo6496o0();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    public final void onPause() {
        AbstractC3037fp abstractC3037fp;
        C3370op c3370op = this.f13379g;
        Objects.requireNonNull(c3370op);
        C2622l.m5354d("onPause must be called from the UI thread.");
        C3333np c3333np = c3370op.f17712d;
        if (c3333np != null && (abstractC3037fp = c3333np.f17199k) != null) {
            abstractC3037fp.mo6410k();
        }
        this.f13378f.onPause();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    public final void onResume() {
        this.f13378f.onResume();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: p */
    public final String mo6497p() {
        return this.f13378f.mo6497p();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: p0 */
    public final Context mo6498p0() {
        return this.f13378f.mo6498p0();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3040fs
    /* JADX INFO: renamed from: q */
    public final rh1 mo6499q() {
        return this.f13378f.mo6499q();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ip2
    /* JADX INFO: renamed from: q0 */
    public final void mo6352q0(hp2 hp2Var) {
        this.f13378f.mo6352q0(hp2Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: r */
    public final C3005eu mo6500r() {
        return this.f13378f.mo6500r();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3577ua
    /* JADX INFO: renamed from: r0 */
    public final void mo6501r0(String str, Map<String, ?> map) {
        this.f13378f.mo6501r0(str, map);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3708xt
    /* JADX INFO: renamed from: s */
    public final rd2 mo6502s() {
        return this.f13378f.mo6502s();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: s0 */
    public final WebViewClient mo6503s0() {
        return this.f13378f.mo6503s0();
    }

    @Override // android.view.View, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f13378f.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f13378f.setOnTouchListener(onTouchListener);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.f13378f.setWebChromeClient(webChromeClient);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.f13378f.setWebViewClient(webViewClient);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3634vt
    /* JADX INFO: renamed from: t */
    public final void mo6504t(boolean z, int i) {
        this.f13378f.mo6504t(z, i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: t0 */
    public final void mo6505t0(rh1 rh1Var, uh1 uh1Var) {
        this.f13378f.mo6505t0(rh1Var, uh1Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: u */
    public final void mo6506u(BinderC3263lt binderC3263lt) {
        this.f13378f.mo6506u(binderC3263lt);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3060gb
    /* JADX INFO: renamed from: u0 */
    public final void mo6507u0(String str, JSONObject jSONObject) {
        ((ViewTreeObserverOnGlobalLayoutListenerC3115ht) this.f13378f).mo6470Z(str, jSONObject.toString());
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: v */
    public final int mo6508v() {
        return ((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14276U1)).booleanValue() ? this.f13378f.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: v0 */
    public final void mo6509v0() {
        TextView textView = new TextView(getContext());
        C2267h1 c2267h1 = C2330u.f10884a.f10889d;
        textView.setText(C2267h1.m4742a());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: w */
    public final void mo6510w() {
        this.f13378f.mo6510w();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: w0 */
    public final void mo6511w0(InterfaceC3128i5 interfaceC3128i5) {
        this.f13378f.mo6511w0(interfaceC3128i5);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3300mt
    /* JADX INFO: renamed from: x */
    public final uh1 mo6512x() {
        return this.f13378f.mo6512x();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: x0 */
    public final boolean mo6513x0() {
        return this.f13378f.mo6513x0();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: y */
    public final boolean mo6514y() {
        return this.f13378f.mo6514y();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: y0 */
    public final void mo6515y0(boolean z) {
        this.f13378f.mo6515y0(z);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    /* JADX INFO: renamed from: z */
    public final void mo6516z(String str, AbstractC3669wr abstractC3669wr) {
        this.f13378f.mo6516z(str, abstractC3669wr);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps
    /* JADX INFO: renamed from: z0 */
    public final void mo6517z0(uq2 uq2Var) {
        this.f13378f.mo6517z0(uq2Var);
    }
}
