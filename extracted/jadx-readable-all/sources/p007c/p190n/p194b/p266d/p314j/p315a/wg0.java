package p007c.p190n.p194b.p266d.p314j.p315a;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wg0 extends AbstractBinderC3684x5 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, wh0 {

    /* JADX INFO: renamed from: f */
    public static final ts1<String> f21081f;

    /* JADX INFO: renamed from: g */
    public final String f21082g;

    /* JADX INFO: renamed from: i */
    public FrameLayout f21084i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f21085j;

    /* JADX INFO: renamed from: k */
    public final lv1 f21086k;

    /* JADX INFO: renamed from: l */
    public View f21087l;

    /* JADX INFO: renamed from: n */
    public wf0 f21089n;

    /* JADX INFO: renamed from: o */
    public jp2 f21090o;

    /* JADX INFO: renamed from: q */
    public InterfaceC3498s5 f21092q;

    /* JADX INFO: renamed from: r */
    public boolean f21093r;

    /* JADX INFO: renamed from: h */
    public Map<String, WeakReference<View>> f21083h = new HashMap();

    /* JADX INFO: renamed from: p */
    public InterfaceC2799a f21091p = null;

    /* JADX INFO: renamed from: s */
    public boolean f21094s = false;

    /* JADX INFO: renamed from: m */
    public final int f21088m = 210890000;

    static {
        ns1<Object> ns1Var = ts1.f19979g;
        Object[] objArr = {"2011", "1009", "3010"};
        C2622l.m5421q1(objArr, 3);
        f21081f = ts1.m8450v(objArr, 3);
    }

    public wg0(FrameLayout frameLayout, FrameLayout frameLayout2, int i) {
        this.f21084i = frameLayout;
        this.f21085j = frameLayout2;
        String canonicalName = frameLayout.getClass().getCanonicalName();
        String str = "3012";
        if ("com.google.android.gms.ads.formats.NativeContentAdView".equals(canonicalName)) {
            str = "1007";
        } else if ("com.google.android.gms.ads.formats.NativeAppInstallAdView".equals(canonicalName)) {
            str = "2009";
        } else {
            "com.google.android.gms.ads.formats.UnifiedNativeAdView".equals(canonicalName);
        }
        this.f21082g = str;
        C2330u c2330u = C2330u.f10884a;
        C3443qo c3443qo = c2330u.f10886B;
        C3443qo.m8220a(frameLayout, this);
        C3443qo c3443qo2 = c2330u.f10886B;
        C3443qo.m8221b(frameLayout, this);
        this.f21086k = C2962do.f13334e;
        this.f21090o = new jp2(this.f21084i.getContext(), this.f21084i);
        frameLayout.setOnTouchListener(this);
        frameLayout.setOnClickListener(this);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: E0 */
    public final FrameLayout mo8488E0() {
        return this.f21085j;
    }

    /* JADX INFO: renamed from: F6 */
    public final synchronized void m8642F6(InterfaceC2799a interfaceC2799a) {
        if (this.f21094s) {
            return;
        }
        this.f21091p = interfaceC2799a;
    }

    /* JADX INFO: renamed from: G6 */
    public final synchronized void m8643G6(InterfaceC3498s5 interfaceC3498s5) {
        if (this.f21094s) {
            return;
        }
        this.f21093r = true;
        this.f21092q = interfaceC3498s5;
        wf0 wf0Var = this.f21089n;
        if (wf0Var != null) {
            yf0 yf0Var = wf0Var.f21047A;
            synchronized (yf0Var) {
                yf0Var.f21864a = interfaceC3498s5;
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: K2 */
    public final /* bridge */ /* synthetic */ View mo8489K2() {
        return this.f21084i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: T1 */
    public final synchronized void mo8490T1(String str, View view, boolean z) {
        if (this.f21094s) {
            return;
        }
        if (view == null) {
            this.f21083h.remove(str);
            return;
        }
        this.f21083h.put(str, new WeakReference<>(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            if (C2096e.m4552A(this.f21088m)) {
                view.setOnTouchListener(this);
            }
            view.setClickable(true);
            view.setOnClickListener(this);
        }
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m8644c() {
        if (this.f21094s) {
            return;
        }
        wf0 wf0Var = this.f21089n;
        if (wf0Var != null) {
            wf0Var.m8637k(this);
            this.f21089n = null;
        }
        this.f21083h.clear();
        this.f21084i.removeAllViews();
        this.f21085j.removeAllViews();
        this.f21083h = null;
        this.f21084i = null;
        this.f21085j = null;
        this.f21087l = null;
        this.f21090o = null;
        this.f21094s = true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: g */
    public final jp2 mo8491g() {
        return this.f21090o;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: h */
    public final synchronized Map<String, WeakReference<View>> mo8492h() {
        return this.f21083h;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: j */
    public final synchronized Map<String, WeakReference<View>> mo8493j() {
        return null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: k */
    public final synchronized Map<String, WeakReference<View>> mo8494k() {
        return this.f21083h;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: n */
    public final synchronized JSONObject mo8495n() {
        JSONObject jSONObjectMo5749h;
        wf0 wf0Var = this.f21089n;
        if (wf0Var == null) {
            return null;
        }
        FrameLayout frameLayout = this.f21084i;
        Map<String, WeakReference<View>> mapMo8492h = mo8492h();
        Map<String, WeakReference<View>> mapMo8494k = mo8494k();
        synchronized (wf0Var) {
            jSONObjectMo5749h = wf0Var.f21053k.mo5749h(frameLayout, mapMo8492h, mapMo8494k);
        }
        return jSONObjectMo5749h;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        wf0 wf0Var = this.f21089n;
        if (wf0Var != null) {
            synchronized (wf0Var) {
                wf0Var.f21053k.mo5755n();
            }
            this.f21089n.m8638l(view, this.f21084i, mo8492h(), mo8494k(), false);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        wf0 wf0Var = this.f21089n;
        if (wf0Var != null) {
            wf0Var.m8639m(this.f21084i, mo8492h(), mo8494k(), wf0.m8628n(this.f21084i));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        wf0 wf0Var = this.f21089n;
        if (wf0Var != null) {
            wf0Var.m8639m(this.f21084i, mo8492h(), mo8494k(), wf0.m8628n(this.f21084i));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        wf0 wf0Var = this.f21089n;
        if (wf0Var != null) {
            FrameLayout frameLayout = this.f21084i;
            synchronized (wf0Var) {
                wf0Var.f21053k.mo5742a(view, motionEvent, frameLayout);
            }
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: p */
    public final synchronized String mo8496p() {
        return this.f21082g;
    }

    /* JADX INFO: renamed from: q0 */
    public final synchronized void m8645q0(InterfaceC2799a interfaceC2799a) {
        wf0 wf0Var = this.f21089n;
        View view = (View) BinderC2800b.m5639T1(interfaceC2799a);
        synchronized (wf0Var) {
            wf0Var.f21053k.mo5751j(view);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: q3 */
    public final synchronized View mo8497q3(String str) {
        if (this.f21094s) {
            return null;
        }
        WeakReference<View> weakReference = this.f21083h.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.wh0
    /* JADX INFO: renamed from: u */
    public final InterfaceC2799a mo8498u() {
        return this.f21091p;
    }
}
