package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class uh0 {

    /* JADX INFO: renamed from: a */
    public final yl0 f20314a;

    /* JADX INFO: renamed from: b */
    public final vk0 f20315b;

    /* JADX INFO: renamed from: c */
    public ViewTreeObserver.OnScrollChangedListener f20316c = null;

    public uh0(yl0 yl0Var, vk0 vk0Var) {
        this.f20314a = yl0Var;
        this.f20315b = vk0Var;
    }

    /* JADX INFO: renamed from: b */
    public static final int m8499b(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        C3331nn c3331nn = gx2.f14692a.f14693b;
        return C3331nn.m7886d(context.getResources().getDisplayMetrics(), i);
    }

    /* JADX INFO: renamed from: a */
    public final View m8500a(final View view, final WindowManager windowManager) throws C3781zs {
        Object objM8802a = this.f20314a.m8802a(jw2.m7416H(), null, null);
        View view2 = (View) objM8802a;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        C2967dt c2967dt = (C2967dt) objM8802a;
        c2967dt.f13378f.mo6479f0("/sendMessageToSdk", new InterfaceC3464r8(this) { // from class: c.n.b.d.j.a.oh0

            /* JADX INFO: renamed from: a */
            public final uh0 f17617a;

            {
                this.f17617a = this;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
            /* JADX INFO: renamed from: a */
            public final void mo6148a(Object obj, Map map) {
                this.f17617a.f20315b.m8564d("sendMessageToNativeJs", map);
            }
        });
        c2967dt.f13378f.mo6479f0("/hideValidatorOverlay", new InterfaceC3464r8(this, windowManager, view) { // from class: c.n.b.d.j.a.ph0

            /* JADX INFO: renamed from: a */
            public final uh0 f17972a;

            /* JADX INFO: renamed from: b */
            public final WindowManager f17973b;

            /* JADX INFO: renamed from: c */
            public final View f17974c;

            {
                this.f17972a = this;
                this.f17973b = windowManager;
                this.f17974c = view;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
            /* JADX INFO: renamed from: a */
            public final void mo6148a(Object obj, Map map) {
                uh0 uh0Var = this.f17972a;
                WindowManager windowManager2 = this.f17973b;
                View view3 = this.f17974c;
                InterfaceC3410ps interfaceC3410ps = (InterfaceC3410ps) obj;
                Objects.requireNonNull(uh0Var);
                C2622l.m5318U2("Hide native ad policy validator overlay.");
                interfaceC3410ps.mo6468X().setVisibility(8);
                if (interfaceC3410ps.mo6468X().getWindowToken() != null) {
                    windowManager2.removeView(interfaceC3410ps.mo6468X());
                }
                interfaceC3410ps.destroy();
                ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
                if (uh0Var.f20316c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                    return;
                }
                viewTreeObserver.removeOnScrollChangedListener(uh0Var.f20316c);
            }
        });
        c2967dt.f13378f.mo6479f0("/open", new C2910c9(null, null, null, null, null));
        vk0 vk0Var = this.f20315b;
        vk0Var.m8562b("/loadNativeAdPolicyViolations", new uk0(vk0Var, new WeakReference(objM8802a), "/loadNativeAdPolicyViolations", new InterfaceC3464r8(this, view, windowManager) { // from class: c.n.b.d.j.a.qh0

            /* JADX INFO: renamed from: a */
            public final uh0 f18288a;

            /* JADX INFO: renamed from: b */
            public final View f18289b;

            /* JADX INFO: renamed from: c */
            public final WindowManager f18290c;

            {
                this.f18288a = this;
                this.f18289b = view;
                this.f18290c = windowManager;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
            /* JADX INFO: renamed from: a */
            public final void mo6148a(Object obj, final Map map) {
                final uh0 uh0Var = this.f18288a;
                final View view3 = this.f18289b;
                final WindowManager windowManager2 = this.f18290c;
                final InterfaceC3410ps interfaceC3410ps = (InterfaceC3410ps) obj;
                Objects.requireNonNull(uh0Var);
                ((C3670ws) interfaceC3410ps.mo6459O0()).f21331m = new InterfaceC2856au(uh0Var, map) { // from class: c.n.b.d.j.a.th0

                    /* JADX INFO: renamed from: f */
                    public final uh0 f19830f;

                    /* JADX INFO: renamed from: g */
                    public final Map f19831g;

                    {
                        this.f19830f = uh0Var;
                        this.f19831g = map;
                    }

                    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2856au
                    /* JADX INFO: renamed from: B */
                    public final void mo4670B(boolean z) {
                        uh0 uh0Var2 = this.f19830f;
                        Map map2 = this.f19831g;
                        Objects.requireNonNull(uh0Var2);
                        HashMap map3 = new HashMap();
                        map3.put("messageType", "validatorHtmlLoaded");
                        map3.put("id", (String) map2.get("id"));
                        uh0Var2.f20315b.m8564d("sendMessageToNativeJs", map3);
                    }
                };
                if (map == null) {
                    return;
                }
                Context context = view3.getContext();
                String str = (String) map.get("validator_width");
                AbstractC3718y2<Integer> abstractC3718y2 = C3052g3.f14201H4;
                C2862b c2862b = C2862b.f12493a;
                int iM8499b = uh0.m8499b(context, str, ((Integer) c2862b.f12496d.m6596a(abstractC3718y2)).intValue());
                int iM8499b2 = uh0.m8499b(context, (String) map.get("validator_height"), ((Integer) c2862b.f12496d.m6596a(C3052g3.f14207I4)).intValue());
                int iM8499b3 = uh0.m8499b(context, (String) map.get("validator_x"), 0);
                int iM8499b4 = uh0.m8499b(context, (String) map.get("validator_y"), 0);
                interfaceC3410ps.mo6437D0(C3005eu.m6688c(iM8499b, iM8499b2));
                try {
                    interfaceC3410ps.mo6456N().getSettings().setUseWideViewPort(((Boolean) c2862b.f12496d.m6596a(C3052g3.f14213J4)).booleanValue());
                    interfaceC3410ps.mo6456N().getSettings().setLoadWithOverviewMode(((Boolean) c2862b.f12496d.m6596a(C3052g3.f14219K4)).booleanValue());
                } catch (NullPointerException unused) {
                }
                final WindowManager.LayoutParams layoutParamsM4563L = C2096e.m4563L();
                layoutParamsM4563L.x = iM8499b3;
                layoutParamsM4563L.y = iM8499b4;
                windowManager2.updateViewLayout(interfaceC3410ps.mo6468X(), layoutParamsM4563L);
                final String str2 = (String) map.get("orientation");
                Rect rect = new Rect();
                if (view3.getGlobalVisibleRect(rect)) {
                    final int i = (("1".equals(str2) || "2".equals(str2)) ? rect.bottom : rect.top) - iM8499b4;
                    uh0Var.f20316c = new ViewTreeObserver.OnScrollChangedListener(view3, interfaceC3410ps, str2, layoutParamsM4563L, i, windowManager2) { // from class: c.n.b.d.j.a.sh0

                        /* JADX INFO: renamed from: f */
                        public final View f19557f;

                        /* JADX INFO: renamed from: g */
                        public final InterfaceC3410ps f19558g;

                        /* JADX INFO: renamed from: h */
                        public final String f19559h;

                        /* JADX INFO: renamed from: i */
                        public final WindowManager.LayoutParams f19560i;

                        /* JADX INFO: renamed from: j */
                        public final int f19561j;

                        /* JADX INFO: renamed from: k */
                        public final WindowManager f19562k;

                        {
                            this.f19557f = view3;
                            this.f19558g = interfaceC3410ps;
                            this.f19559h = str2;
                            this.f19560i = layoutParamsM4563L;
                            this.f19561j = i;
                            this.f19562k = windowManager2;
                        }

                        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                        public final void onScrollChanged() {
                            View view4 = this.f19557f;
                            InterfaceC3410ps interfaceC3410ps2 = this.f19558g;
                            String str3 = this.f19559h;
                            WindowManager.LayoutParams layoutParams = this.f19560i;
                            int i2 = this.f19561j;
                            WindowManager windowManager3 = this.f19562k;
                            Rect rect2 = new Rect();
                            if (!view4.getGlobalVisibleRect(rect2) || interfaceC3410ps2.mo6468X().getWindowToken() == null) {
                                return;
                            }
                            if ("1".equals(str3) || "2".equals(str3)) {
                                layoutParams.y = rect2.bottom - i2;
                            } else {
                                layoutParams.y = rect2.top - i2;
                            }
                            windowManager3.updateViewLayout(interfaceC3410ps2.mo6468X(), layoutParams);
                        }
                    };
                    ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
                    if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnScrollChangedListener(uh0Var.f20316c);
                    }
                }
                String str3 = (String) map.get("overlay_url");
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                interfaceC3410ps.loadUrl(str3);
            }
        }));
        vk0 vk0Var2 = this.f20315b;
        vk0Var2.m8562b("/showValidatorOverlay", new uk0(vk0Var2, new WeakReference(objM8802a), "/showValidatorOverlay", rh0.f18776a));
        return view2;
    }
}
