package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2284n0;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.pb */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3393pb implements InterfaceC3464r8<InterfaceC2987ec> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC3689xa f17896a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2284n0 f17897b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2950dc f17898c;

    public C3393pb(C2950dc c2950dc, InterfaceC3689xa interfaceC3689xa, C2284n0 c2284n0) {
        this.f17898c = c2950dc;
        this.f17896a = interfaceC3689xa;
        this.f17897b = c2284n0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, c.n.b.d.j.a.r8] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.InterfaceC3464r8
    /* JADX INFO: renamed from: a */
    public final void mo6148a(InterfaceC2987ec interfaceC2987ec, Map map) {
        synchronized (this.f17898c.f13224a) {
            try {
                C2622l.m5458x3("JS Engine is requesting an update");
                if (this.f17898c.f13230g == 0) {
                    C2622l.m5458x3("Starting reload.");
                    C2950dc c2950dc = this.f17898c;
                    c2950dc.f13230g = 2;
                    c2950dc.m6349a(null);
                }
                this.f17896a.mo6617c("/requestReload", this.f17897b.f10754a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
