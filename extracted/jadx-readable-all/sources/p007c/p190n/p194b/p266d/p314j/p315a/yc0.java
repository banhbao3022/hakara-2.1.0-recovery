package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yc0 extends m20 {

    /* JADX INFO: renamed from: i */
    public final Context f21843i;

    /* JADX INFO: renamed from: j */
    public final WeakReference<InterfaceC3410ps> f21844j;

    /* JADX INFO: renamed from: k */
    public final sb0 f21845k;

    /* JADX INFO: renamed from: l */
    public final ce0 f21846l;

    /* JADX INFO: renamed from: m */
    public final h30 f21847m;

    /* JADX INFO: renamed from: n */
    public final up1 f21848n;

    /* JADX INFO: renamed from: o */
    public final t60 f21849o;

    /* JADX INFO: renamed from: p */
    public boolean f21850p;

    public yc0(l20 l20Var, Context context, InterfaceC3410ps interfaceC3410ps, sb0 sb0Var, ce0 ce0Var, h30 h30Var, up1 up1Var, t60 t60Var) {
        super(l20Var);
        this.f21850p = false;
        this.f21843i = context;
        this.f21844j = new WeakReference<>(interfaceC3410ps);
        this.f21845k = sb0Var;
        this.f21846l = ce0Var;
        this.f21847m = h30Var;
        this.f21848n = up1Var;
        this.f21849o = t60Var;
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
    public final boolean m8790c(boolean z, Activity activity) {
        Context context;
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14402n0;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            C2267h1 c2267h1 = C2330u.f10884a.f10889d;
            if (C2267h1.m4748g(this.f21843i)) {
                C2622l.m5226A3("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f21849o.m7108A0(p60.f17863a);
                if (!((Boolean) c2862b.f12496d.m6596a(C3052g3.f14409o0)).booleanValue()) {
                    return false;
                }
                this.f21848n.m8517a(this.f16664a.f13281b.f12695b.f20318b);
                return false;
            }
        }
        if (this.f21850p) {
            return false;
        }
        this.f21845k.m7108A0(qb0.f18246a);
        if (activity == null) {
            context = activity;
            context = this.f21843i;
        }
        try {
            context = activity;
            this.f21846l.mo6171a(z, context);
            this.f21845k.m7108A0(rb0.f18736a);
            this.f21850p = true;
            return true;
        } catch (be0 e) {
            this.f21849o.m7108A0(new o60(e));
            return false;
        }
    }

    public final void finalize() throws Throwable {
        try {
            final InterfaceC3410ps interfaceC3410ps = this.f21844j.get();
            if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14399m4)).booleanValue()) {
                if (!this.f21850p && interfaceC3410ps != null) {
                    C2962do.f13334e.execute(new Runnable(interfaceC3410ps) { // from class: c.n.b.d.j.a.xc0

                        /* JADX INFO: renamed from: f */
                        public final InterfaceC3410ps f21484f;

                        {
                            this.f21484f = interfaceC3410ps;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f21484f.destroy();
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
