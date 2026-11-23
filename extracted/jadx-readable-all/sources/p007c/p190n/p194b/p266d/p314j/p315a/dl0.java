package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dl0 extends m20 {

    /* JADX INFO: renamed from: i */
    public final Context f13305i;

    /* JADX INFO: renamed from: j */
    public final WeakReference<InterfaceC3410ps> f13306j;

    /* JADX INFO: renamed from: k */
    public final ce0 f13307k;

    /* JADX INFO: renamed from: l */
    public final sb0 f13308l;

    /* JADX INFO: renamed from: m */
    public final t60 f13309m;

    /* JADX INFO: renamed from: n */
    public final a80 f13310n;

    /* JADX INFO: renamed from: o */
    public final h30 f13311o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC3624vj f13312p;

    /* JADX INFO: renamed from: q */
    public final up1 f13313q;

    /* JADX INFO: renamed from: r */
    public boolean f13314r;

    public dl0(l20 l20Var, Context context, InterfaceC3410ps interfaceC3410ps, ce0 ce0Var, sb0 sb0Var, t60 t60Var, a80 a80Var, h30 h30Var, rh1 rh1Var, up1 up1Var) {
        super(l20Var);
        this.f13314r = false;
        this.f13305i = context;
        this.f13307k = ce0Var;
        this.f13306j = new WeakReference<>(interfaceC3410ps);
        this.f13308l = sb0Var;
        this.f13309m = t60Var;
        this.f13310n = a80Var;
        this.f13311o = h30Var;
        this.f13313q = up1Var;
        C3475rj c3475rj = rh1Var.f18821l;
        this.f13312p = new BinderC3402pk(c3475rj != null ? c3475rj.f18847f : "", c3475rj != null ? c3475rj.f18848g : 1);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public final boolean m6373c(boolean z, Activity activity) {
        Context context;
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14402n0;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            C2267h1 c2267h1 = C2330u.f10884a.f10889d;
            if (C2267h1.m4748g(this.f13305i)) {
                C2622l.m5226A3("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f13309m.m7108A0(p60.f17863a);
                if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14409o0)).booleanValue()) {
                    this.f13313q.m8517a(this.f16664a.f13281b.f12695b.f20318b);
                }
                return false;
            }
        }
        if (this.f13314r) {
            C2622l.m5226A3("The rewarded ad have been showed.");
            this.f13309m.m7108A0(new n60(C2622l.m5285M2(10, null, null)));
            return false;
        }
        this.f13314r = true;
        this.f13308l.m7108A0(qb0.f18246a);
        if (activity == null) {
            context = activity;
            context = this.f13305i;
        }
        try {
            context = activity;
            this.f13307k.mo6171a(z, context);
            this.f13308l.m7108A0(rb0.f18736a);
            return true;
        } catch (be0 e) {
            this.f13309m.m7108A0(new o60(e));
            return false;
        }
    }

    public final void finalize() throws Throwable {
        try {
            final InterfaceC3410ps interfaceC3410ps = this.f13306j.get();
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14399m4)).booleanValue()) {
                if (!this.f13314r && interfaceC3410ps != null) {
                    C2962do.f13334e.execute(new Runnable(interfaceC3410ps) { // from class: c.n.b.d.j.a.cl0

                        /* JADX INFO: renamed from: f */
                        public final InterfaceC3410ps f13051f;

                        {
                            this.f13051f = interfaceC3410ps;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f13051f.destroy();
                        }
                    });
                }
            } else if (interfaceC3410ps != null) {
                interfaceC3410ps.destroy();
            }
        } finally {
            super.finalize();
        }
    }
}
