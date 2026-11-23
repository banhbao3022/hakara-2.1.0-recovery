package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class h00 extends m20 {

    /* JADX INFO: renamed from: i */
    public final InterfaceC3410ps f14711i;

    /* JADX INFO: renamed from: j */
    public final int f14712j;

    /* JADX INFO: renamed from: k */
    public final Context f14713k;

    /* JADX INFO: renamed from: l */
    public final C3528sz f14714l;

    /* JADX INFO: renamed from: m */
    public final ce0 f14715m;

    /* JADX INFO: renamed from: n */
    public boolean f14716n;

    public h00(l20 l20Var, Context context, InterfaceC3410ps interfaceC3410ps, int i, C3528sz c3528sz, ce0 ce0Var) {
        super(l20Var);
        this.f14716n = false;
        this.f14711i = interfaceC3410ps;
        this.f14713k = context;
        this.f14712j = i;
        this.f14714l = c3528sz;
        this.f14715m = ce0Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.m20
    /* JADX INFO: renamed from: b */
    public final void mo7041b() {
        super.mo7041b();
        InterfaceC3410ps interfaceC3410ps = this.f14711i;
        if (interfaceC3410ps != null) {
            interfaceC3410ps.destroy();
        }
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
    public final void m7042c(Activity activity, cr2 cr2Var, boolean z) throws RemoteException {
        Context context = activity;
        if (activity == null) {
            context = this.f14713k;
        }
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14402n0;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            C2330u c2330u = C2330u.f10884a;
            C2267h1 c2267h1 = c2330u.f10889d;
            if (C2267h1.m4748g(context)) {
                C2622l.m5226A3("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                cr2Var.mo6090i0(C2622l.m5285M2(11, null, null));
                if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14409o0)).booleanValue()) {
                    new up1(context.getApplicationContext(), c2330u.f10903r.m4786a()).m8517a(this.f16664a.f13281b.f12695b.f20318b);
                    return;
                }
                return;
            }
        }
        if (this.f14716n) {
            C2622l.m5226A3("App open interstitial ad is already visible.");
        }
        if (this.f14716n) {
            return;
        }
        try {
            this.f14715m.mo6171a(z, context);
            this.f14716n = true;
        } catch (be0 e) {
            cr2Var.mo6090i0(C2622l.m5465z0(e));
        }
    }
}
