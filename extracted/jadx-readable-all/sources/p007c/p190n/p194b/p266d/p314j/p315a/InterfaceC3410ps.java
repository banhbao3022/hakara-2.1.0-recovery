package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import p007c.p190n.p194b.p266d.p267a.p282z.C2312c;
import p007c.p190n.p194b.p266d.p267a.p282z.InterfaceC2323n;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.BinderC2232o;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: renamed from: c.n.b.d.j.a.ps */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3410ps extends uv2, InterfaceC3040fs, InterfaceC3577ua, InterfaceC3300mt, InterfaceC3485rt, InterfaceC3060gb, ip2, InterfaceC3634vt, InterfaceC2323n, InterfaceC3708xt, InterfaceC3745yt, InterfaceC3704xp, InterfaceC3782zt {
    /* JADX INFO: renamed from: B */
    boolean mo6432B();

    /* JADX INFO: renamed from: C */
    kv1<String> mo6434C();

    /* JADX INFO: renamed from: D */
    BinderC2232o mo6436D();

    /* JADX INFO: renamed from: D0 */
    void mo6437D0(C3005eu c3005eu);

    /* JADX INFO: renamed from: E */
    void mo6438E(int i);

    /* JADX INFO: renamed from: G0 */
    void mo6443G0(boolean z);

    /* JADX INFO: renamed from: H */
    void mo6444H(boolean z);

    /* JADX INFO: renamed from: H0 */
    void mo6445H0();

    /* JADX INFO: renamed from: I */
    BinderC2232o mo6446I();

    /* JADX INFO: renamed from: I0 */
    void mo6447I0();

    /* JADX INFO: renamed from: J */
    void mo6448J(String str, C2912cb<InterfaceC3464r8<? super InterfaceC3410ps>> c2912cb);

    /* JADX INFO: renamed from: J0 */
    String mo6449J0();

    /* JADX INFO: renamed from: K */
    InterfaceC3128i5 mo6450K();

    /* JADX INFO: renamed from: K0 */
    void mo6451K0(boolean z);

    /* JADX INFO: renamed from: L */
    void mo6452L(InterfaceC3054g5 interfaceC3054g5);

    /* JADX INFO: renamed from: L0 */
    boolean mo6453L0();

    /* JADX INFO: renamed from: M0 */
    void mo6455M0(String str, String str2, String str3);

    /* JADX INFO: renamed from: N */
    WebView mo6456N();

    /* JADX INFO: renamed from: N0 */
    void mo6457N0();

    /* JADX INFO: renamed from: O */
    boolean mo6458O();

    /* JADX INFO: renamed from: O0 */
    InterfaceC2931cu mo6459O0();

    /* JADX INFO: renamed from: P */
    uq2 mo6460P();

    /* JADX INFO: renamed from: R */
    void mo6462R(BinderC2232o binderC2232o);

    /* JADX INFO: renamed from: S */
    void mo6463S(boolean z);

    /* JADX INFO: renamed from: T */
    void mo6464T();

    /* JADX INFO: renamed from: U */
    void mo6465U();

    /* JADX INFO: renamed from: V */
    void mo6466V(String str, InterfaceC3464r8<? super InterfaceC3410ps> interfaceC3464r8);

    /* JADX INFO: renamed from: W */
    void mo6467W(BinderC2232o binderC2232o);

    /* JADX INFO: renamed from: X */
    View mo6468X();

    /* JADX INFO: renamed from: Y */
    void mo6469Y(boolean z);

    boolean canGoBack();

    /* JADX INFO: renamed from: d0 */
    void mo6476d0(Context context);

    void destroy();

    /* JADX INFO: renamed from: e0 */
    boolean mo6477e0(boolean z, int i);

    /* JADX INFO: renamed from: f0 */
    void mo6479f0(String str, InterfaceC3464r8<? super InterfaceC3410ps> interfaceC3464r8);

    /* JADX INFO: renamed from: g */
    BinderC3263lt mo6480g();

    /* JADX INFO: renamed from: g0 */
    InterfaceC2799a mo6481g0();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3485rt, p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    /* JADX INFO: renamed from: h */
    Activity mo6482h();

    /* JADX INFO: renamed from: h0 */
    void mo6483h0(int i);

    /* JADX INFO: renamed from: j0 */
    void mo6486j0();

    /* JADX INFO: renamed from: k */
    C2312c mo6487k();

    /* JADX INFO: renamed from: l */
    C3459r3 mo6489l();

    /* JADX INFO: renamed from: l0 */
    void mo6490l0(InterfaceC2799a interfaceC2799a);

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    void measure(int i, int i2);

    /* JADX INFO: renamed from: n0 */
    boolean mo6494n0();

    /* JADX INFO: renamed from: o */
    C3702xn mo6495o();

    void onPause();

    void onResume();

    /* JADX INFO: renamed from: p0 */
    Context mo6498p0();

    /* JADX INFO: renamed from: q */
    rh1 mo6499q();

    /* JADX INFO: renamed from: r */
    C3005eu mo6500r();

    /* JADX INFO: renamed from: s */
    rd2 mo6502s();

    /* JADX INFO: renamed from: s0 */
    WebViewClient mo6503s0();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3704xp
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    /* JADX INFO: renamed from: t0 */
    void mo6505t0(rh1 rh1Var, uh1 uh1Var);

    /* JADX INFO: renamed from: u */
    void mo6506u(BinderC3263lt binderC3263lt);

    /* JADX INFO: renamed from: v0 */
    void mo6509v0();

    /* JADX INFO: renamed from: w */
    void mo6510w();

    /* JADX INFO: renamed from: w0 */
    void mo6511w0(InterfaceC3128i5 interfaceC3128i5);

    /* JADX INFO: renamed from: x */
    uh1 mo6512x();

    /* JADX INFO: renamed from: x0 */
    boolean mo6513x0();

    /* JADX INFO: renamed from: y */
    boolean mo6514y();

    /* JADX INFO: renamed from: y0 */
    void mo6515y0(boolean z);

    /* JADX INFO: renamed from: z */
    void mo6516z(String str, AbstractC3669wr abstractC3669wr);

    /* JADX INFO: renamed from: z0 */
    void mo6517z0(uq2 uq2Var);
}
