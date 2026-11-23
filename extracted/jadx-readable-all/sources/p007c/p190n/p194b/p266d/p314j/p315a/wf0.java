package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p267a.p279w.C2206i;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;
import p007c.p190n.p194b.p266d.p310g.InterfaceC2799a;
import p636z0.p691g.ArrayMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wf0 extends m20 {

    /* JADX INFO: renamed from: A */
    public final yf0 f21047A;

    /* JADX INFO: renamed from: B */
    public final k41 f21048B;

    /* JADX INFO: renamed from: C */
    public final Map<String, Boolean> f21049C;

    /* JADX INFO: renamed from: D */
    public final List<jp2> f21050D;

    /* JADX INFO: renamed from: i */
    public final Executor f21051i;

    /* JADX INFO: renamed from: j */
    public final bg0 f21052j;

    /* JADX INFO: renamed from: k */
    public final kg0 f21053k;

    /* JADX INFO: renamed from: l */
    public final ah0 f21054l;

    /* JADX INFO: renamed from: m */
    public final hg0 f21055m;

    /* JADX INFO: renamed from: n */
    public final mg0 f21056n;

    /* JADX INFO: renamed from: o */
    public final vc2<ak0> f21057o;

    /* JADX INFO: renamed from: p */
    public final vc2<yj0> f21058p;

    /* JADX INFO: renamed from: q */
    public final vc2<fk0> f21059q;

    /* JADX INFO: renamed from: r */
    public final vc2<wj0> f21060r;

    /* JADX INFO: renamed from: s */
    public final vc2<dk0> f21061s;

    /* JADX INFO: renamed from: t */
    public wh0 f21062t;

    /* JADX INFO: renamed from: u */
    public boolean f21063u;

    /* JADX INFO: renamed from: v */
    public boolean f21064v;

    /* JADX INFO: renamed from: w */
    public final C3181jl f21065w;

    /* JADX INFO: renamed from: x */
    public final rd2 f21066x;

    /* JADX INFO: renamed from: y */
    public final C3702xn f21067y;

    /* JADX INFO: renamed from: z */
    public final Context f21068z;

    public wf0(l20 l20Var, Executor executor, bg0 bg0Var, kg0 kg0Var, ah0 ah0Var, hg0 hg0Var, mg0 mg0Var, vc2<ak0> vc2Var, vc2<yj0> vc2Var2, vc2<fk0> vc2Var3, vc2<wj0> vc2Var4, vc2<dk0> vc2Var5, C3181jl c3181jl, rd2 rd2Var, C3702xn c3702xn, Context context, yf0 yf0Var, k41 k41Var, kp2 kp2Var) {
        super(l20Var);
        this.f21064v = false;
        this.f21051i = executor;
        this.f21052j = bg0Var;
        this.f21053k = kg0Var;
        this.f21054l = ah0Var;
        this.f21055m = hg0Var;
        this.f21056n = mg0Var;
        this.f21057o = vc2Var;
        this.f21058p = vc2Var2;
        this.f21059q = vc2Var3;
        this.f21060r = vc2Var4;
        this.f21061s = vc2Var5;
        this.f21065w = c3181jl;
        this.f21066x = rd2Var;
        this.f21067y = c3702xn;
        this.f21068z = context;
        this.f21047A = yf0Var;
        this.f21048B = k41Var;
        this.f21049C = new HashMap();
        this.f21050D = new ArrayList();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m8628n(View view) {
        return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.m20
    /* JADX INFO: renamed from: a */
    public final void mo7653a() {
        this.f21051i.execute(new Runnable(this) { // from class: c.n.b.d.j.a.pf0

            /* JADX INFO: renamed from: f */
            public final wf0 f17964f;

            {
                this.f17964f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                wf0 wf0Var = this.f17964f;
                Objects.requireNonNull(wf0Var);
                try {
                    int iM6008r = wf0Var.f21052j.m6008r();
                    if (iM6008r == 1) {
                        if (wf0Var.f21056n.f16748b != null) {
                            wf0Var.m8629c("Google", true);
                            wf0Var.f21056n.f16748b.mo7658y6(wf0Var.f21057o.m8545a());
                            return;
                        }
                        return;
                    }
                    if (iM6008r == 2) {
                        if (wf0Var.f21056n.f16749c != null) {
                            wf0Var.m8629c("Google", true);
                            wf0Var.f21056n.f16749c.mo7441R0(wf0Var.f21058p.m8545a());
                            return;
                        }
                        return;
                    }
                    if (iM6008r == 3) {
                        mg0 mg0Var = wf0Var.f21056n;
                        if (mg0Var.f16753g.getOrDefault(wf0Var.f21052j.m6002h(), null) != null) {
                            if (wf0Var.f21052j.m6003i() != null) {
                                wf0Var.m8629c("Google", true);
                            }
                            mg0 mg0Var2 = wf0Var.f21056n;
                            mg0Var2.f16753g.getOrDefault(wf0Var.f21052j.m6002h(), null).mo7779W5(wf0Var.f21061s.m8545a());
                            return;
                        }
                        return;
                    }
                    if (iM6008r == 6) {
                        if (wf0Var.f21056n.f16750d != null) {
                            wf0Var.m8629c("Google", true);
                            wf0Var.f21056n.f16750d.mo8080f6(wf0Var.f21059q.m8545a());
                            return;
                        }
                        return;
                    }
                    if (iM6008r != 7) {
                        C2622l.m5408n3("Wrong native template id!");
                        return;
                    }
                    InterfaceC3503sa interfaceC3503sa = wf0Var.f21056n.f16752f;
                    if (interfaceC3503sa != null) {
                        interfaceC3503sa.mo8268I3(wf0Var.f21060r.m8545a());
                    }
                } catch (RemoteException e) {
                    C2622l.m5438t3("RemoteException when notifyAdLoad is called", e);
                }
            }
        });
        if (this.f21052j.m6008r() != 7) {
            Executor executor = this.f21051i;
            final kg0 kg0Var = this.f21053k;
            kg0Var.getClass();
            executor.execute(new Runnable(kg0Var) { // from class: c.n.b.d.j.a.qf0

                /* JADX INFO: renamed from: f */
                public final kg0 f18276f;

                {
                    this.f18276f = kg0Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f18276f.mo5760r();
                }
            });
        }
        super.mo7653a();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.m20
    /* JADX INFO: renamed from: b */
    public final synchronized void mo7041b() {
        this.f21051i.execute(new Runnable(this) { // from class: c.n.b.d.j.a.rf0

            /* JADX INFO: renamed from: f */
            public final wf0 f18764f;

            {
                this.f18764f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                wf0 wf0Var = this.f18764f;
                wf0Var.f21053k.mo5741B();
                bg0 bg0Var = wf0Var.f21052j;
                synchronized (bg0Var) {
                    InterfaceC3410ps interfaceC3410ps = bg0Var.f12609i;
                    if (interfaceC3410ps != null) {
                        interfaceC3410ps.destroy();
                        bg0Var.f12609i = null;
                    }
                    InterfaceC3410ps interfaceC3410ps2 = bg0Var.f12610j;
                    if (interfaceC3410ps2 != null) {
                        interfaceC3410ps2.destroy();
                        bg0Var.f12610j = null;
                    }
                    bg0Var.f12611k = null;
                    bg0Var.f12618r.clear();
                    bg0Var.f12619s.clear();
                    bg0Var.f12602b = null;
                    bg0Var.f12603c = null;
                    bg0Var.f12604d = null;
                    bg0Var.f12605e = null;
                    bg0Var.f12608h = null;
                    bg0Var.f12612l = null;
                    bg0Var.f12613m = null;
                    bg0Var.f12615o = null;
                    bg0Var.f12616p = null;
                    bg0Var.f12617q = null;
                }
            }
        });
        super.mo7041b();
    }

    /* JADX INFO: renamed from: c */
    public final void m8629c(String str, boolean z) {
        String str2;
        InterfaceC2799a interfaceC2799aMo5883n0;
        EnumC3732yg enumC3732yg;
        EnumC3769zg enumC3769zg;
        if (this.f21055m.mo6999c()) {
            InterfaceC3410ps interfaceC3410psM6004j = this.f21052j.m6004j();
            InterfaceC3410ps interfaceC3410psM6003i = this.f21052j.m6003i();
            if (interfaceC3410psM6004j == null && interfaceC3410psM6003i == null) {
                return;
            }
            if (interfaceC3410psM6004j != null) {
                str2 = null;
            } else {
                str2 = "javascript";
                interfaceC3410psM6004j = interfaceC3410psM6003i;
            }
            String str3 = str2;
            C2330u c2330u = C2330u.f10884a;
            if (!c2330u.f10908w.mo5884o0(this.f21068z)) {
                C2622l.m5226A3("Failed to initialize omid in InternalNativeAd");
                return;
            }
            C3702xn c3702xn = this.f21067y;
            int i = c3702xn.f21616g;
            int i2 = c3702xn.f21617h;
            StringBuilder sb = new StringBuilder(23);
            sb.append(i);
            sb.append(".");
            sb.append(i2);
            String string = sb.toString();
            AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14283V2;
            C2862b c2862b = C2862b.f12493a;
            if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
                if (interfaceC3410psM6003i != null) {
                    enumC3732yg = EnumC3732yg.VIDEO;
                    enumC3769zg = EnumC3769zg.DEFINED_BY_JAVASCRIPT;
                } else {
                    enumC3732yg = EnumC3732yg.NATIVE_DISPLAY;
                    enumC3769zg = this.f21052j.m6008r() == 3 ? EnumC3769zg.UNSPECIFIED : EnumC3769zg.ONE_PIXEL;
                }
                interfaceC2799aMo5883n0 = c2330u.f10908w.mo5881l0(string, interfaceC3410psM6004j.mo6456N(), "", "javascript", str3, str, enumC3769zg, enumC3732yg, this.f16665b.f18816g0);
            } else {
                interfaceC2799aMo5883n0 = c2330u.f10908w.mo5883n0(string, interfaceC3410psM6004j.mo6456N(), "", "javascript", str3, str);
            }
            if (interfaceC2799aMo5883n0 == null) {
                C2622l.m5226A3("Failed to create omid session in InternalNativeAd");
                return;
            }
            bg0 bg0Var = this.f21052j;
            synchronized (bg0Var) {
                bg0Var.f12611k = interfaceC2799aMo5883n0;
            }
            interfaceC3410psM6004j.mo6490l0(interfaceC2799aMo5883n0);
            if (interfaceC3410psM6003i != null) {
                c2330u.f10908w.mo5888s0(interfaceC2799aMo5883n0, interfaceC3410psM6003i.mo6468X());
                this.f21064v = true;
            }
            if (z) {
                c2330u.f10908w.mo5880k0(interfaceC2799aMo5883n0);
                if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14295X2)).booleanValue()) {
                    interfaceC3410psM6004j.mo6501r0("onSdkLoaded", new ArrayMap());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m8630d(View view) {
        InterfaceC2799a interfaceC2799aM6005k = this.f21052j.m6005k();
        InterfaceC3410ps interfaceC3410psM6004j = this.f21052j.m6004j();
        if (!this.f21055m.mo6999c() || interfaceC2799aM6005k == null || interfaceC3410psM6004j == null || view == null) {
            return;
        }
        C2330u.f10884a.f10908w.mo5888s0(interfaceC2799aM6005k, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m8631e(final wh0 wh0Var) {
        Iterator<String> itKeys;
        View view;
        tb2 tb2Var;
        this.f21062t = wh0Var;
        final ah0 ah0Var = this.f21054l;
        ah0Var.f12126g.execute(new Runnable(ah0Var, wh0Var) { // from class: c.n.b.d.j.a.xg0

            /* JADX INFO: renamed from: f */
            public final ah0 f21529f;

            /* JADX INFO: renamed from: g */
            public final wh0 f21530g;

            {
                this.f21529f = ah0Var;
                this.f21530g = wh0Var;
            }

            /* JADX WARN: Code duplicated, block: B:82:0x0172  */
            @Override // java.lang.Runnable
            public final void run() {
                ViewGroup viewGroup;
                View view2;
                View view3;
                final ViewGroup viewGroup2;
                InterfaceC3498s5 interfaceC3498s5M8793a;
                Drawable drawable;
                final ah0 ah0Var2 = this.f21529f;
                wh0 wh0Var2 = this.f21530g;
                int i = 0;
                if (!ah0Var2.f12122c.mo7000d() && !ah0Var2.f12122c.mo6998b()) {
                    viewGroup = null;
                    break;
                }
                String[] strArr = {"1098", "3011"};
                int i2 = 0;
                while (true) {
                    if (i2 >= 2) {
                        viewGroup = null;
                        break;
                    }
                    View viewMo8497q3 = wh0Var2.mo8497q3(strArr[i2]);
                    if (viewMo8497q3 != null && (viewMo8497q3 instanceof ViewGroup)) {
                        viewGroup = (ViewGroup) viewMo8497q3;
                        break;
                    }
                    i2++;
                }
                Context context = wh0Var2.mo8489K2().getContext();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                bg0 bg0Var = ah0Var2.f12123d;
                synchronized (bg0Var) {
                    view2 = bg0Var.f12604d;
                }
                if (view2 != null) {
                    bg0 bg0Var2 = ah0Var2.f12123d;
                    synchronized (bg0Var2) {
                        view3 = bg0Var2.f12604d;
                    }
                    C3165j5 c3165j5 = ah0Var2.f12128i;
                    if (c3165j5 != null && viewGroup == null) {
                        ah0.m5784c(layoutParams, c3165j5.f15479j);
                        view3.setLayoutParams(layoutParams);
                    }
                } else if (ah0Var2.f12123d.m6010t() instanceof BinderC2980e5) {
                    BinderC2980e5 binderC2980e5 = (BinderC2980e5) ah0Var2.f12123d.m6010t();
                    if (viewGroup == null) {
                        ah0.m5784c(layoutParams, binderC2980e5.f13504q);
                    }
                    C3017f5 c3017f5 = new C3017f5(context, binderC2980e5, layoutParams);
                    c3017f5.setContentDescription((CharSequence) C2862b.f12493a.f12496d.m6596a(C3052g3.f14258R1));
                    view3 = c3017f5;
                } else {
                    view3 = null;
                }
                if (view3 != null) {
                    if (view3.getParent() instanceof ViewGroup) {
                        ((ViewGroup) view3.getParent()).removeView(view3);
                    }
                    if (viewGroup != null) {
                        viewGroup.removeAllViews();
                        viewGroup.addView(view3);
                    } else {
                        C2206i c2206i = new C2206i(wh0Var2.mo8489K2().getContext());
                        c2206i.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        c2206i.addView(view3);
                        FrameLayout frameLayoutMo8488E0 = wh0Var2.mo8488E0();
                        if (frameLayoutMo8488E0 != null) {
                            frameLayoutMo8488E0.addView(c2206i);
                        }
                    }
                    wh0Var2.mo8490T1(wh0Var2.mo8496p(), view3, true);
                }
                ts1<String> ts1Var = wg0.f21081f;
                int size = ts1Var.size();
                while (true) {
                    if (i >= size) {
                        viewGroup2 = null;
                        break;
                    }
                    View viewMo8497q4 = wh0Var2.mo8497q3(ts1Var.get(i));
                    i++;
                    if (viewMo8497q4 instanceof ViewGroup) {
                        viewGroup2 = (ViewGroup) viewMo8497q4;
                        break;
                    }
                }
                ah0Var2.f12127h.execute(new Runnable(ah0Var2, viewGroup2) { // from class: c.n.b.d.j.a.yg0

                    /* JADX INFO: renamed from: f */
                    public final ah0 f21879f;

                    /* JADX INFO: renamed from: g */
                    public final ViewGroup f21880g;

                    {
                        this.f21879f = ah0Var2;
                        this.f21880g = viewGroup2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ah0 ah0Var3 = this.f21879f;
                        boolean z = this.f21880g != null;
                        if (ah0Var3.f12123d.m6000f() != null) {
                            if (ah0Var3.f12123d.m6008r() == 2 || ah0Var3.f12123d.m6008r() == 1) {
                                ah0Var3.f12120a.mo4824v0(ah0Var3.f12121b.f15193f, String.valueOf(ah0Var3.f12123d.m6008r()), z);
                            } else if (ah0Var3.f12123d.m6008r() == 6) {
                                ah0Var3.f12120a.mo4824v0(ah0Var3.f12121b.f15193f, "2", z);
                                ah0Var3.f12120a.mo4824v0(ah0Var3.f12121b.f15193f, "1", z);
                            }
                        }
                    }
                });
                if (viewGroup2 == null) {
                    return;
                }
                if (ah0Var2.m5786b(viewGroup2)) {
                    if (ah0Var2.f12123d.m6003i() != null) {
                        ah0Var2.f12123d.m6003i().mo6511w0(new zg0(wh0Var2, viewGroup2));
                        return;
                    }
                    return;
                }
                viewGroup2.removeAllViews();
                View viewMo8489K2 = wh0Var2.mo8489K2();
                Context context2 = viewMo8489K2 != null ? viewMo8489K2.getContext() : null;
                if (context2 == null || (interfaceC3498s5M8793a = ah0Var2.f12129j.m8793a()) == null) {
                    return;
                }
                try {
                    InterfaceC2799a interfaceC2799aMo7858f = interfaceC3498s5M8793a.mo7858f();
                    if (interfaceC2799aMo7858f == null || (drawable = (Drawable) BinderC2800b.m5639T1(interfaceC2799aMo7858f)) == null) {
                        return;
                    }
                    ImageView imageView = new ImageView(context2);
                    imageView.setImageDrawable(drawable);
                    InterfaceC2799a interfaceC2799aMo8498u = wh0Var2.mo8498u();
                    if (interfaceC2799aMo8498u == null) {
                        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    } else if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14230M3)).booleanValue()) {
                        imageView.setScaleType((ImageView.ScaleType) BinderC2800b.m5639T1(interfaceC2799aMo8498u));
                    } else {
                        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                    }
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView);
                } catch (RemoteException unused) {
                    C2622l.m5226A3("Could not get main image drawable");
                }
            }
        });
        this.f21053k.mo5744c(wh0Var.mo8489K2(), wh0Var.mo8494k(), wh0Var.mo8493j(), wh0Var, wh0Var);
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14466w1;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue() && (tb2Var = this.f21066x.f18750d) != null) {
            tb2Var.mo4858g(wh0Var.mo8489K2());
        }
        if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14305Z0)).booleanValue()) {
            rh1 rh1Var = this.f16665b;
            if (rh1Var.f18814f0 && (itKeys = rh1Var.f18812e0.keys()) != null) {
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    WeakReference<View> weakReference = this.f21062t.mo8492h().get(next);
                    this.f21049C.put(next, Boolean.FALSE);
                    if (weakReference != null && (view = weakReference.get()) != null) {
                        jp2 jp2Var = new jp2(this.f21068z, view);
                        this.f21050D.add(jp2Var);
                        jp2Var.f15699s.add(new vf0(this, next));
                        jp2Var.m7383e(3);
                    }
                }
            }
        }
        if (wh0Var.mo8491g() != null) {
            wh0Var.mo8491g().m7379a(this.f21065w);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m8632f(wh0 wh0Var) {
        this.f21053k.mo5745d(wh0Var.mo8489K2(), wh0Var.mo8492h());
        if (wh0Var.mo8488E0() != null) {
            wh0Var.mo8488E0().setClickable(false);
            wh0Var.mo8488E0().removeAllViews();
        }
        if (wh0Var.mo8491g() != null) {
            jp2 jp2VarMo8491g = wh0Var.mo8491g();
            jp2VarMo8491g.f15699s.remove(this.f21065w);
        }
        this.f21062t = null;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m8633g(Bundle bundle) {
        this.f21053k.mo5756o(bundle);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized boolean m8634h(Bundle bundle) {
        if (this.f21063u) {
            return true;
        }
        boolean zMo5753l = this.f21053k.mo5753l(bundle);
        this.f21063u = zMo5753l;
        return zMo5753l;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m8635i(Bundle bundle) {
        this.f21053k.mo5758p(bundle);
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m8636j(final wh0 wh0Var) {
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14299Y0)).booleanValue()) {
            C2267h1.f10713a.post(new Runnable(this, wh0Var) { // from class: c.n.b.d.j.a.sf0

                /* JADX INFO: renamed from: f */
                public final wf0 f19546f;

                /* JADX INFO: renamed from: g */
                public final wh0 f19547g;

                {
                    this.f19546f = this;
                    this.f19547g = wh0Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f19546f.m8631e(this.f19547g);
                }
            });
        } else {
            m8631e(wh0Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m8637k(final wh0 wh0Var) {
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14299Y0)).booleanValue()) {
            C2267h1.f10713a.post(new Runnable(this, wh0Var) { // from class: c.n.b.d.j.a.tf0

                /* JADX INFO: renamed from: f */
                public final wf0 f19824f;

                /* JADX INFO: renamed from: g */
                public final wh0 f19825g;

                {
                    this.f19824f = this;
                    this.f19825g = wh0Var;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f19824f.m8632f(this.f19825g);
                }
            });
        } else {
            m8632f(wh0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0040 A[Catch: all -> 0x006f, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x000a, B:7:0x000e, B:10:0x0015, B:13:0x001e, B:16:0x002d, B:17:0x0032, B:19:0x0040, B:21:0x0052, B:24:0x005b), top: B:34:0x0001, inners: #0 }] */
    /* JADX INFO: renamed from: l */
    public final synchronized void m8638l(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        ah0 ah0Var = this.f21054l;
        wh0 wh0Var = this.f21062t;
        Objects.requireNonNull(ah0Var);
        if (wh0Var == null || ah0Var.f12124e == null || wh0Var.mo8488E0() == null || !ah0Var.f12122c.mo6997a()) {
            this.f21053k.mo5746e(view, view2, map, map2, z);
            if (this.f21064v) {
                if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14252Q1)).booleanValue() && this.f21052j.m6003i() != null) {
                    this.f21052j.m6003i().mo6501r0("onSdkAdUserInteractionClick", new ArrayMap());
                    return;
                }
            }
            return;
        }
        try {
            wh0Var.mo8488E0().addView(ah0Var.f12124e.m7700a());
        } catch (C3781zs e) {
            C2096e.m4554C("web view can not be obtained", e);
        }
        this.f21053k.mo5746e(view, view2, map, map2, z);
        if (this.f21064v) {
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14252Q1)).booleanValue()) {
                this.f21052j.m6003i().mo6501r0("onSdkAdUserInteractionClick", new ArrayMap());
                return;
            }
        }
        return;
        throw th;
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m8639m(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z) {
        if (this.f21063u) {
            return;
        }
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14305Z0)).booleanValue() && this.f16665b.f18814f0) {
            Iterator<String> it = this.f21049C.keySet().iterator();
            while (it.hasNext()) {
                if (!this.f21049C.get(it.next()).booleanValue()) {
                    return;
                }
            }
        }
        if (z) {
            this.f21054l.m5785a(this.f21062t);
            this.f21053k.mo5750i(view, map, map2);
            this.f21063u = true;
            return;
        }
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14282V1)).booleanValue() && map != null) {
            Iterator<Map.Entry<String, WeakReference<View>>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                View view2 = it2.next().getValue().get();
                if (view2 != null && m8628n(view2)) {
                    this.f21054l.m5785a(this.f21062t);
                    this.f21053k.mo5750i(view, map, map2);
                    this.f21063u = true;
                    return;
                }
            }
        }
    }
}
