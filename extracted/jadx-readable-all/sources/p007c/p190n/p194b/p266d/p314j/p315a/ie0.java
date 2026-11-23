package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.lang.reflect.Method;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p310g.BinderC2800b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ie0 implements i60, tb0 {

    /* JADX INFO: renamed from: f */
    public final C3181jl f15158f;

    /* JADX INFO: renamed from: g */
    public final Context f15159g;

    /* JADX INFO: renamed from: h */
    public final C2885bm f15160h;

    /* JADX INFO: renamed from: i */
    public final View f15161i;

    /* JADX INFO: renamed from: j */
    public String f15162j;

    /* JADX INFO: renamed from: k */
    public final gs2 f15163k;

    public ie0(C3181jl c3181jl, Context context, C2885bm c2885bm, View view, gs2 gs2Var) {
        this.f15158f = c3181jl;
        this.f15159g = context;
        this.f15160h = c2885bm;
        this.f15161i = view;
        this.f15163k = gs2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: b */
    public final void mo6969b() {
        View view = this.f15161i;
        if (view != null && this.f15162j != null) {
            C2885bm c2885bm = this.f15160h;
            final Context context = view.getContext();
            final String str = this.f15162j;
            if (c2885bm.m6048f(context) && (context instanceof Activity)) {
                if (C2885bm.m6042m(context)) {
                    c2885bm.m6046d("setScreenName", new InterfaceC2848am(context, str) { // from class: c.n.b.d.j.a.tl

                        /* JADX INFO: renamed from: a */
                        public final Context f19905a;

                        /* JADX INFO: renamed from: b */
                        public final String f19906b;

                        {
                            this.f19905a = context;
                            this.f19906b = str;
                        }

                        @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC2848am
                        /* JADX INFO: renamed from: a */
                        public final void mo5828a(InterfaceC3079gu interfaceC3079gu) throws RemoteException {
                            Context context2 = this.f19905a;
                            interfaceC3079gu.mo6620M2(new BinderC2800b(context2), this.f19906b, context2.getPackageName());
                        }
                    });
                } else if (c2885bm.m6045c(context, "com.google.firebase.analytics.FirebaseAnalytics", c2885bm.f12739h, false)) {
                    Method declaredMethod = c2885bm.f12740i.get("setCurrentScreen");
                    if (declaredMethod == null) {
                        try {
                            declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                            c2885bm.f12740i.put("setCurrentScreen", declaredMethod);
                        } catch (Exception unused) {
                            c2885bm.m6043a("setCurrentScreen", false);
                            declaredMethod = null;
                        }
                    }
                    try {
                        declaredMethod.invoke(c2885bm.f12739h.get(), (Activity) context, str, context.getPackageName());
                    } catch (Exception unused2) {
                        c2885bm.m6043a("setCurrentScreen", false);
                    }
                }
            }
        }
        this.f15158f.m7361a(true);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: c */
    public final void mo6970c() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: e */
    public final void mo6972e() {
        this.f15158f.m7361a(false);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: f */
    public final void mo6973f() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: g */
    public final void mo6974g() {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tb0
    /* JADX INFO: renamed from: h */
    public final void mo7194h() {
        C2885bm c2885bm = this.f15160h;
        Context context = this.f15159g;
        String str = "";
        if (c2885bm.m6048f(context)) {
            if (C2885bm.m6042m(context)) {
                str = (String) c2885bm.m6047e("getCurrentScreenNameOrScreenClass", "", C3514sl.f19603a);
            } else if (c2885bm.m6045c(context, "com.google.android.gms.measurement.AppMeasurement", c2885bm.f12738g, true)) {
                try {
                    String str2 = (String) c2885bm.m6056o(context, "getCurrentScreenName").invoke(c2885bm.f12738g.get(), new Object[0]);
                    if (str2 == null) {
                        str2 = (String) c2885bm.m6056o(context, "getCurrentScreenClass").invoke(c2885bm.f12738g.get(), new Object[0]);
                    }
                    if (str2 != null) {
                        str = str2;
                    }
                } catch (Exception unused) {
                    c2885bm.m6043a("getCurrentScreenName", false);
                }
            }
        }
        this.f15162j = str;
        String strValueOf = String.valueOf(str);
        String str3 = this.f15163k == gs2.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial";
        this.f15162j = str3.length() != 0 ? strValueOf.concat(str3) : new String(strValueOf);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.i60
    /* JADX INFO: renamed from: j */
    public final void mo6975j(InterfaceC3068gj interfaceC3068gj, String str, String str2) {
        if (this.f15160h.m6048f(this.f15159g)) {
            try {
                C2885bm c2885bm = this.f15160h;
                Context context = this.f15159g;
                c2885bm.m6054l(context, c2885bm.m6051i(context), this.f15158f.f15647h, ((BinderC2957dj) interfaceC3068gj).f13282f, ((BinderC2957dj) interfaceC3068gj).f13283g);
            } catch (RemoteException e) {
                C2622l.m5241D3("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.tb0
    public final void zza() {
    }
}
