package p007c.p190n.p194b.p266d.p267a.p282z.p283a;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.stetho.common.Utf8Charset;
import com.facebook.stetho.websocket.CloseCodes;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.Collections;
import p007c.p190n.p194b.p266d.p267a.p282z.C2321l;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p007c.p190n.p194b.p266d.p314j.p315a.AbstractBinderC2918ch;
import p007c.p190n.p194b.p266d.p314j.p315a.AbstractC3718y2;
import p007c.p190n.p194b.p266d.p314j.p315a.C2855at;
import p007c.p190n.p194b.p266d.p314j.p315a.C2862b;
import p007c.p190n.p194b.p266d.p314j.p315a.C2967dt;
import p007c.p190n.p194b.p266d.p314j.p315a.C3005eu;
import p007c.p190n.p194b.p266d.p314j.p315a.C3052g3;
import p007c.p190n.p194b.p266d.p314j.p315a.C3287mg;
import p007c.p190n.p194b.p266d.p314j.p315a.C3670ws;
import p007c.p190n.p194b.p266d.p314j.p315a.C3702xn;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2856au;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2931cu;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3410ps;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3463r7;
import p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3537t7;
import p007c.p190n.p194b.p266d.p314j.p315a.as2;
import p007c.p190n.p194b.p266d.p314j.p315a.uv2;
import p007c.p190n.p194b.p266d.p314j.p315a.xr1;
import p007c.p190n.p194b.p266d.p314j.p315a.xw0;

/* JADX INFO: renamed from: c.n.b.d.a.z.a.o */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class BinderC2232o extends AbstractBinderC2918ch implements InterfaceC2218b {

    /* JADX INFO: renamed from: g */
    public static final int f10654g = Color.argb(0, 0, 0, 0);

    /* JADX INFO: renamed from: h */
    public final Activity f10658h;

    /* JADX INFO: renamed from: i */
    public AdOverlayInfoParcel f10659i;

    /* JADX INFO: renamed from: j */
    public InterfaceC3410ps f10660j;

    /* JADX INFO: renamed from: k */
    public C2229l f10661k;

    /* JADX INFO: renamed from: l */
    public ViewOnClickListenerC2237t f10662l;

    /* JADX INFO: renamed from: n */
    public FrameLayout f10664n;

    /* JADX INFO: renamed from: o */
    public WebChromeClient.CustomViewCallback f10665o;

    /* JADX INFO: renamed from: r */
    public C2228k f10668r;

    /* JADX INFO: renamed from: v */
    public Runnable f10672v;

    /* JADX INFO: renamed from: w */
    public Runnable f10673w;

    /* JADX INFO: renamed from: x */
    public boolean f10674x;

    /* JADX INFO: renamed from: y */
    public boolean f10675y;

    /* JADX INFO: renamed from: m */
    public boolean f10663m = false;

    /* JADX INFO: renamed from: p */
    public boolean f10666p = false;

    /* JADX INFO: renamed from: q */
    public boolean f10667q = false;

    /* JADX INFO: renamed from: s */
    public boolean f10669s = false;

    /* JADX INFO: renamed from: C */
    public int f10657C = 1;

    /* JADX INFO: renamed from: t */
    public final Object f10670t = new Object();

    /* JADX INFO: renamed from: u */
    public final Object f10671u = new Object();

    /* JADX INFO: renamed from: z */
    public boolean f10676z = false;

    /* JADX INFO: renamed from: A */
    public boolean f10655A = false;

    /* JADX INFO: renamed from: B */
    public boolean f10656B = true;

    public BinderC2232o(Activity activity) {
        this.f10658h = activity;
    }

    /* JADX INFO: renamed from: F6 */
    public final void m4672F6() {
        InterfaceC3410ps interfaceC3410ps;
        InterfaceC2235r interfaceC2235r;
        if (this.f10655A) {
            return;
        }
        this.f10655A = true;
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14193G2;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            synchronized (this.f10671u) {
                if (!this.f10660j.mo6514y() || this.f10674x) {
                    m4673G6();
                } else {
                    Runnable runnable = new Runnable(this) { // from class: c.n.b.d.a.z.a.i

                        /* JADX INFO: renamed from: f */
                        public final BinderC2232o f10644f;

                        {
                            this.f10644f = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f10644f.m4673G6();
                        }
                    };
                    this.f10673w = runnable;
                    C2267h1.f10713a.postDelayed(runnable, ((Long) c2862b.f12496d.m6596a(C3052g3.f14171D0)).longValue());
                }
            }
        } else {
            m4673G6();
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10659i;
        if (adOverlayInfoParcel != null && (interfaceC2235r = adOverlayInfoParcel.f28469h) != null) {
            interfaceC2235r.mo4699J3(this.f10657C);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f10659i;
        if (adOverlayInfoParcel2 == null || (interfaceC3410ps = adOverlayInfoParcel2.f28470i) == null) {
            return;
        }
        InterfaceC2799a interfaceC2799aMo6481g0 = interfaceC3410ps.mo6481g0();
        View viewMo6468X = this.f10659i.f28470i.mo6468X();
        if (interfaceC2799aMo6481g0 == null || viewMo6468X == null) {
            return;
        }
        C2330u.f10884a.f10908w.mo5888s0(interfaceC2799aMo6481g0, viewMo6468X);
    }

    /* JADX INFO: renamed from: G6 */
    public final void m4673G6() {
        InterfaceC3410ps interfaceC3410ps = this.f10660j;
        if (interfaceC3410ps == null) {
            return;
        }
        this.f10668r.removeView(interfaceC3410ps.mo6468X());
        C2229l c2229l = this.f10661k;
        if (c2229l != null) {
            this.f10660j.mo6476d0(c2229l.f10650d);
            this.f10660j.mo6451K0(false);
            ViewGroup viewGroup = this.f10661k.f10649c;
            View viewMo6468X = this.f10660j.mo6468X();
            C2229l c2229l2 = this.f10661k;
            viewGroup.addView(viewMo6468X, c2229l2.f10647a, c2229l2.f10648b);
            this.f10661k = null;
        } else if (this.f10658h.getApplicationContext() != null) {
            this.f10660j.mo6476d0(this.f10658h.getApplicationContext());
        }
        this.f10660j = null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: H */
    public final void mo4674H(InterfaceC2799a interfaceC2799a) {
        m4676I6((Configuration) BinderC2800b.m5639T1(interfaceC2799a));
    }

    /* JADX INFO: renamed from: H6 */
    public final void m4675H6() {
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14193G2)).booleanValue()) {
            synchronized (this.f10671u) {
                this.f10674x = true;
                Runnable runnable = this.f10673w;
                if (runnable != null) {
                    xr1 xr1Var = C2267h1.f10713a;
                    xr1Var.removeCallbacks(runnable);
                    xr1Var.post(this.f10673w);
                }
            }
            return;
        }
        synchronized (this.f10670t) {
            this.f10674x = true;
            Runnable runnable2 = this.f10672v;
            if (runnable2 != null) {
                xr1 xr1Var2 = C2267h1.f10713a;
                xr1Var2.removeCallbacks(runnable2);
                xr1Var2.post(this.f10672v);
            }
        }
    }

    /* JADX INFO: renamed from: I6 */
    public final void m4676I6(Configuration configuration) {
        C2321l c2321l;
        int i;
        C2321l c2321l2;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10659i;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel == null || (c2321l2 = adOverlayInfoParcel.f28481t) == null || !c2321l2.f10858g) ? false : true;
        boolean zMo4726o = C2330u.f10884a.f10891f.mo4726o(this.f10658h, configuration);
        if ((!this.f10667q || z3) && !zMo4726o) {
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.f10659i;
            if (adOverlayInfoParcel2 != null && (c2321l = adOverlayInfoParcel2.f28481t) != null && c2321l.f10863l) {
                z2 = true;
            }
        } else {
            z = false;
        }
        Window window = this.f10658h.getWindow();
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14191G0)).booleanValue()) {
            View decorView = window.getDecorView();
            if (z) {
                i = z2 ? 5894 : 5380;
            } else {
                i = 256;
            }
            decorView.setSystemUiVisibility(i);
            return;
        }
        if (!z) {
            window.addFlags(2048);
            window.clearFlags(1024);
            return;
        }
        window.addFlags(1024);
        window.clearFlags(2048);
        if (z2) {
            window.getDecorView().setSystemUiVisibility(4098);
        }
    }

    /* JADX INFO: renamed from: J6 */
    public final void m4677J6(boolean z) {
        int iIntValue = ((Integer) C2862b.f12493a.f12496d.m6596a(C3052g3.f14217K2)).intValue();
        C2236s c2236s = new C2236s();
        c2236s.f10680d = 50;
        c2236s.f10677a = true != z ? 0 : iIntValue;
        c2236s.f10678b = true != z ? iIntValue : 0;
        c2236s.f10679c = iIntValue;
        this.f10662l = new ViewOnClickListenerC2237t(this.f10658h, c2236s, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z ? 9 : 11);
        m4678K6(z, this.f10659i.f28473l);
        this.f10668r.addView(this.f10662l, layoutParams);
    }

    /* JADX INFO: renamed from: K6 */
    public final void m4678K6(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        C2321l c2321l;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        C2321l c2321l2;
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14178E0;
        C2862b c2862b = C2862b.f12493a;
        boolean z3 = true;
        boolean z4 = ((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() && (adOverlayInfoParcel2 = this.f10659i) != null && (c2321l2 = adOverlayInfoParcel2.f28481t) != null && c2321l2.f10864m;
        boolean z5 = ((Boolean) c2862b.f12496d.m6596a(C3052g3.f14185F0)).booleanValue() && (adOverlayInfoParcel = this.f10659i) != null && (c2321l = adOverlayInfoParcel.f28481t) != null && c2321l.f10865n;
        if (z && z2 && z4 && !z5) {
            new C3287mg(this.f10660j, "useCustomClose").m7693b("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        ViewOnClickListenerC2237t viewOnClickListenerC2237t = this.f10662l;
        if (viewOnClickListenerC2237t != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            if (z3) {
                viewOnClickListenerC2237t.f10681f.setVisibility(8);
            } else {
                viewOnClickListenerC2237t.f10681f.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: L6 */
    public final void m4679L6(int i) {
        int i2 = this.f10658h.getApplicationInfo().targetSdkVersion;
        AbstractC3718y2<Integer> abstractC3718y2 = C3052g3.f14167C3;
        C2862b c2862b = C2862b.f12493a;
        if (i2 >= ((Integer) c2862b.f12496d.m6596a(abstractC3718y2)).intValue()) {
            if (this.f10658h.getApplicationInfo().targetSdkVersion <= ((Integer) c2862b.f12496d.m6596a(C3052g3.f14174D3)).intValue()) {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= ((Integer) c2862b.f12496d.m6596a(C3052g3.f14181E3)).intValue()) {
                    if (i3 <= ((Integer) c2862b.f12496d.m6596a(C3052g3.f14188F3)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f10658h.setRequestedOrientation(i);
        } catch (Throwable th) {
            C2330u.f10884a.f10893h.m6648e(th, "AdOverlay.setRequestedOrientation");
        }
    }

    /* JADX INFO: renamed from: M6 */
    public final void m4680M6(boolean z) throws C2227j {
        if (!this.f10675y) {
            this.f10658h.requestWindowFeature(1);
        }
        Window window = this.f10658h.getWindow();
        if (window == null) {
            throw new C2227j("Invalid activity, no window available.");
        }
        InterfaceC3410ps interfaceC3410ps = this.f10659i.f28470i;
        InterfaceC2931cu interfaceC2931cuMo6459O0 = interfaceC3410ps != null ? interfaceC3410ps.mo6459O0() : null;
        boolean z2 = false;
        boolean z3 = interfaceC2931cuMo6459O0 != null && ((C3670ws) interfaceC2931cuMo6459O0).m8681j();
        this.f10669s = false;
        if (z3) {
            int i = this.f10659i.f28476o;
            if (i == 6) {
                z2 = this.f10658h.getResources().getConfiguration().orientation == 1;
                this.f10669s = z2;
            } else if (i == 7) {
                z2 = this.f10658h.getResources().getConfiguration().orientation == 2;
                this.f10669s = z2;
            }
        }
        StringBuilder sb = new StringBuilder(46);
        sb.append("Delay onShow to next orientation change: ");
        sb.append(z2);
        C2622l.m5318U2(sb.toString());
        m4679L6(this.f10659i.f28476o);
        window.setFlags(16777216, 16777216);
        C2622l.m5318U2("Hardware acceleration on the AdActivity window enabled.");
        if (this.f10667q) {
            this.f10668r.setBackgroundColor(f10654g);
        } else {
            this.f10668r.setBackgroundColor(-16777216);
        }
        this.f10658h.setContentView(this.f10668r);
        this.f10675y = true;
        if (z) {
            try {
                C2855at c2855at = C2330u.f10884a.f10890e;
                Activity activity = this.f10658h;
                InterfaceC3410ps interfaceC3410ps2 = this.f10659i.f28470i;
                C3005eu c3005euMo6500r = interfaceC3410ps2 != null ? interfaceC3410ps2.mo6500r() : null;
                InterfaceC3410ps interfaceC3410ps3 = this.f10659i.f28470i;
                String strMo6449J0 = interfaceC3410ps3 != null ? interfaceC3410ps3.mo6449J0() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.f10659i;
                C3702xn c3702xn = adOverlayInfoParcel.f28479r;
                InterfaceC3410ps interfaceC3410ps4 = adOverlayInfoParcel.f28470i;
                InterfaceC3410ps interfaceC3410psM5850a = C2855at.m5850a(activity, c3005euMo6500r, strMo6449J0, true, z3, null, null, c3702xn, null, null, interfaceC3410ps4 != null ? interfaceC3410ps4.mo6487k() : null, new as2(), null, null);
                this.f10660j = interfaceC3410psM5850a;
                InterfaceC2931cu interfaceC2931cuMo6459O1 = ((C2967dt) interfaceC3410psM5850a).mo6459O0();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f10659i;
                InterfaceC3463r7 interfaceC3463r7 = adOverlayInfoParcel2.f28482u;
                InterfaceC3537t7 interfaceC3537t7 = adOverlayInfoParcel2.f28471j;
                InterfaceC2242y interfaceC2242y = adOverlayInfoParcel2.f28475n;
                InterfaceC3410ps interfaceC3410ps5 = adOverlayInfoParcel2.f28470i;
                ((C3670ws) interfaceC2931cuMo6459O1).m8676b(null, interfaceC3463r7, null, interfaceC3537t7, interfaceC2242y, true, null, interfaceC3410ps5 != null ? ((C3670ws) interfaceC3410ps5.mo6459O0()).f21342x : null, null, null, null, null, null, null, null);
                ((C3670ws) this.f10660j.mo6459O0()).f21331m = new InterfaceC2856au(this) { // from class: c.n.b.d.a.z.a.g

                    /* JADX INFO: renamed from: f */
                    public final BinderC2232o f10642f;

                    {
                        this.f10642f = this;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2856au
                    /* JADX INFO: renamed from: B */
                    public final void mo4670B(boolean z4) {
                        InterfaceC3410ps interfaceC3410ps6 = this.f10642f.f10660j;
                        if (interfaceC3410ps6 != null) {
                            interfaceC3410ps6.mo6464T();
                        }
                    }
                };
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.f10659i;
                String str = adOverlayInfoParcel3.f28478q;
                if (str != null) {
                    this.f10660j.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.f28474m;
                    if (str2 == null) {
                        throw new C2227j("No URL or HTML to display in ad overlay.");
                    }
                    this.f10660j.loadDataWithBaseURL(adOverlayInfoParcel3.f28472k, str2, "text/html", Utf8Charset.NAME, null);
                }
                InterfaceC3410ps interfaceC3410ps6 = this.f10659i.f28470i;
                if (interfaceC3410ps6 != null) {
                    interfaceC3410ps6.mo6462R(this);
                }
            } catch (Exception e) {
                C2622l.m5438t3("Error obtaining webview.", e);
                throw new C2227j("Could not obtain webview for the overlay.");
            }
        } else {
            InterfaceC3410ps interfaceC3410ps7 = this.f10659i.f28470i;
            this.f10660j = interfaceC3410ps7;
            interfaceC3410ps7.mo6476d0(this.f10658h);
        }
        this.f10660j.mo6467W(this);
        InterfaceC3410ps interfaceC3410ps8 = this.f10659i.f28470i;
        if (interfaceC3410ps8 != null) {
            InterfaceC2799a interfaceC2799aMo6481g0 = interfaceC3410ps8.mo6481g0();
            C2228k c2228k = this.f10668r;
            if (interfaceC2799aMo6481g0 != null && c2228k != null) {
                C2330u.f10884a.f10908w.mo5888s0(interfaceC2799aMo6481g0, c2228k);
            }
        }
        if (this.f10659i.f28477p != 5) {
            ViewParent parent = this.f10660j.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.f10660j.mo6468X());
            }
            if (this.f10667q) {
                this.f10660j.mo6457N0();
            }
            this.f10668r.addView(this.f10660j.mo6468X(), -1, -1);
        }
        if (!z && !this.f10669s) {
            this.f10660j.mo6464T();
        }
        AdOverlayInfoParcel adOverlayInfoParcel4 = this.f10659i;
        if (adOverlayInfoParcel4.f28477p == 5) {
            xw0.m8760F6(this.f10658h, this, adOverlayInfoParcel4.f28487z, adOverlayInfoParcel4.f28484w, adOverlayInfoParcel4.f28485x, adOverlayInfoParcel4.f28486y, adOverlayInfoParcel4.f28483v, adOverlayInfoParcel4.f28465A);
            return;
        }
        m4677J6(z3);
        if (this.f10660j.mo6513x0()) {
            m4678K6(z3, true);
        }
    }

    /* JADX INFO: renamed from: N6 */
    public final void m4681N6() {
        if (!this.f10658h.isFinishing() || this.f10676z) {
            return;
        }
        this.f10676z = true;
        InterfaceC3410ps interfaceC3410ps = this.f10660j;
        if (interfaceC3410ps != null) {
            int i = this.f10657C;
            if (i == 0) {
                throw null;
            }
            interfaceC3410ps.mo6483h0(i - 1);
            AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14193G2;
            C2862b c2862b = C2862b.f12493a;
            if (!((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
                synchronized (this.f10670t) {
                    try {
                        if (!this.f10674x && this.f10660j.mo6514y()) {
                            Runnable runnable = new Runnable(this) { // from class: c.n.b.d.a.z.a.h

                                /* JADX INFO: renamed from: f */
                                public final BinderC2232o f10643f;

                                {
                                    this.f10643f = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f10643f.m4672F6();
                                }
                            };
                            this.f10672v = runnable;
                            C2267h1.f10713a.postDelayed(runnable, ((Long) c2862b.f12496d.m6596a(C3052g3.f14171D0)).longValue());
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        m4672F6();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: Y1 */
    public final void mo4682Y1(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f10666p);
    }

    /* JADX INFO: renamed from: a */
    public final void m4683a() {
        this.f10657C = 3;
        this.f10658h.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10659i;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f28477p != 5) {
            return;
        }
        this.f10658h.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: b */
    public final void m4684b() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10659i;
        if (adOverlayInfoParcel != null && this.f10663m) {
            m4679L6(adOverlayInfoParcel.f28476o);
        }
        if (this.f10664n != null) {
            this.f10658h.setContentView(this.f10668r);
            this.f10675y = true;
            this.f10664n.removeAllViews();
            this.f10664n = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f10665o;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f10665o = null;
        }
        this.f10663m = false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: c */
    public final void mo4685c() {
        this.f10657C = 1;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: c6 */
    public void mo4686c6(Bundle bundle) {
        uv2 uv2Var;
        this.f10658h.requestWindowFeature(1);
        this.f10666p = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelM12636H = AdOverlayInfoParcel.m12636H(this.f10658h.getIntent());
            this.f10659i = adOverlayInfoParcelM12636H;
            if (adOverlayInfoParcelM12636H == null) {
                throw new C2227j("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelM12636H.f28479r.f21617h > 7500000) {
                this.f10657C = 4;
            }
            if (this.f10658h.getIntent() != null) {
                this.f10656B = this.f10658h.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f10659i;
            C2321l c2321l = adOverlayInfoParcel.f28481t;
            if (c2321l != null) {
                boolean z = c2321l.f10857f;
                this.f10667q = z;
                if (z) {
                    if (adOverlayInfoParcel.f28477p != 5 && c2321l.f10862k != -1) {
                        new C2231n(this).m4707b();
                    }
                }
            } else if (adOverlayInfoParcel.f28477p == 5) {
                this.f10667q = true;
                if (adOverlayInfoParcel.f28477p != 5) {
                    new C2231n(this).m4707b();
                }
            } else {
                this.f10667q = false;
            }
            if (bundle == null) {
                InterfaceC2235r interfaceC2235r = this.f10659i.f28469h;
                if (interfaceC2235r != null && this.f10656B) {
                    interfaceC2235r.mo4698F3();
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f10659i;
                if (adOverlayInfoParcel2.f28477p != 1 && (uv2Var = adOverlayInfoParcel2.f28468g) != null) {
                    uv2Var.mo2739i0();
                }
            }
            Activity activity = this.f10658h;
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.f10659i;
            C2228k c2228k = new C2228k(activity, adOverlayInfoParcel3.f28480s, adOverlayInfoParcel3.f28479r.f21615f, adOverlayInfoParcel3.f28466B);
            this.f10668r = c2228k;
            c2228k.setId(CloseCodes.NORMAL_CLOSURE);
            C2330u.f10884a.f10891f.mo4709q(this.f10658h);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.f10659i;
            int i = adOverlayInfoParcel4.f28477p;
            if (i == 1) {
                m4680M6(false);
                return;
            }
            if (i == 2) {
                this.f10661k = new C2229l(adOverlayInfoParcel4.f28470i);
                m4680M6(false);
            } else if (i == 3) {
                m4680M6(true);
            } else {
                if (i != 5) {
                    throw new C2227j("Could not determine ad overlay type.");
                }
                m4680M6(false);
            }
        } catch (C2227j e) {
            C2622l.m5226A3(e.getMessage());
            this.f10657C = 4;
            this.f10658h.finish();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: d */
    public final void mo4687d() {
        InterfaceC2235r interfaceC2235r;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10659i;
        if (adOverlayInfoParcel == null || (interfaceC2235r = adOverlayInfoParcel.f28469h) == null) {
            return;
        }
        interfaceC2235r.mo4702r0();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: d2 */
    public final void mo4688d2(int i, int i2, Intent intent) {
    }

    @Override // p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2218b
    /* JADX INFO: renamed from: e */
    public final void mo4669e() {
        this.f10657C = 2;
        this.f10658h.finish();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: f */
    public final boolean mo4689f() {
        this.f10657C = 1;
        if (this.f10660j == null) {
            return true;
        }
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14400m5)).booleanValue() && this.f10660j.canGoBack()) {
            this.f10660j.goBack();
            return false;
        }
        boolean zMo6453L0 = this.f10660j.mo6453L0();
        if (!zMo6453L0) {
            this.f10660j.mo6501r0("onbackblocked", Collections.emptyMap());
        }
        return zMo6453L0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: h */
    public final void mo4690h() {
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14205I2)).booleanValue()) {
            InterfaceC3410ps interfaceC3410ps = this.f10660j;
            if (interfaceC3410ps == null || interfaceC3410ps.mo6458O()) {
                C2622l.m5226A3("The webview does not exist. Ignoring action.");
            } else {
                this.f10660j.onResume();
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: i */
    public final void mo4691i() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: j */
    public final void mo4692j() {
        InterfaceC2235r interfaceC2235r;
        m4684b();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10659i;
        if (adOverlayInfoParcel != null && (interfaceC2235r = adOverlayInfoParcel.f28469h) != null) {
            interfaceC2235r.mo4701i1();
        }
        if (!((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14205I2)).booleanValue() && this.f10660j != null && (!this.f10658h.isFinishing() || this.f10661k == null)) {
            this.f10660j.onPause();
        }
        m4681N6();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: k */
    public final void mo4693k() {
        InterfaceC2235r interfaceC2235r;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f10659i;
        if (adOverlayInfoParcel != null && (interfaceC2235r = adOverlayInfoParcel.f28469h) != null) {
            interfaceC2235r.mo4700O5();
        }
        m4676I6(this.f10658h.getResources().getConfiguration());
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14205I2)).booleanValue()) {
            return;
        }
        InterfaceC3410ps interfaceC3410ps = this.f10660j;
        if (interfaceC3410ps == null || interfaceC3410ps.mo6458O()) {
            C2622l.m5226A3("The webview does not exist. Ignoring action.");
        } else {
            this.f10660j.onResume();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: l */
    public final void mo4694l() {
        InterfaceC3410ps interfaceC3410ps = this.f10660j;
        if (interfaceC3410ps != null) {
            try {
                this.f10668r.removeView(interfaceC3410ps.mo6468X());
            } catch (NullPointerException unused) {
            }
        }
        m4681N6();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: n */
    public final void mo4695n() {
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14205I2)).booleanValue() && this.f10660j != null && (!this.f10658h.isFinishing() || this.f10661k == null)) {
            this.f10660j.onPause();
        }
        m4681N6();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2955dh
    /* JADX INFO: renamed from: q */
    public final void mo4696q() {
        this.f10675y = true;
    }
}
