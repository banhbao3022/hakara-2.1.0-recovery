package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import p007c.p190n.p194b.p266d.p298f.C2606d;
import p007c.p190n.p194b.p266d.p333n.C4782j;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.a1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2643a1 extends AbstractC2700x0<Boolean> {

    /* JADX INFO: renamed from: b */
    public final C2671k.a<?> f11628b;

    public C2643a1(C2671k.a<?> aVar, C4782j<Boolean> c4782j) {
        super(4, c4782j);
        this.f11628b = aVar;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2700x0, p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2678m0
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo5496b(C2664h1 c2664h1, boolean z) {
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2701y
    /* JADX INFO: renamed from: f */
    public final C2606d[] mo5497f(C2659g.a<?> aVar) {
        C2669j0 c2669j0 = aVar.f11679l.get(this.f11628b);
        if (c2669j0 == null) {
            return null;
        }
        return c2669j0.f11710a.f11730b;
    }

    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2701y
    /* JADX INFO: renamed from: g */
    public final boolean mo5498g(C2659g.a<?> aVar) {
        C2669j0 c2669j0 = aVar.f11679l.get(this.f11628b);
        return c2669j0 != null && c2669j0.f11710a.f11731c;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v4 boolean
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // p007c.p190n.p194b.p266d.p298f.p299o.p300n.AbstractC2700x0
    /* JADX INFO: renamed from: h */
    public final void mo5499h(p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2659g.a<?> r4) throws android.os.RemoteException {
        /*
            r3 = this;
            java.util.Map<c.n.b.d.f.o.n.k$a<?>, c.n.b.d.f.o.n.j0> r0 = r4.f11679l
            c.n.b.d.f.o.n.k$a<?> r1 = r3.f11628b
            java.lang.Object r0 = r0.remove(r1)
            c.n.b.d.f.o.n.j0 r0 = (p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2669j0) r0
            if (r0 == 0) goto L23
            c.n.b.d.f.o.n.s<c.n.b.d.f.o.a$b, ?> r1 = r0.f11711b
            c.n.b.d.f.o.a$f r4 = r4.f11674g
            c.n.b.d.n.j<T> r2 = r3.f11767a
            c.n.b.d.f.o.n.l0 r1 = (p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2675l0) r1
            c.n.b.d.f.o.n.n r1 = r1.f11724b
            c.n.b.d.f.o.n.o<A extends c.n.b.d.f.o.a$b, c.n.b.d.n.j<java.lang.Boolean>> r1 = r1.f11733b
            r1.mo4950a(r4, r2)
            c.n.b.d.f.o.n.m<c.n.b.d.f.o.a$b, ?> r4 = r0.f11710a
            c.n.b.d.f.o.n.k<L> r4 = r4.f11729a
            r0 = 0
            r4.f11716a = r0
            return
        L23:
            c.n.b.d.n.j<T> r4 = r3.f11767a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.m10948b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p007c.p190n.p194b.p266d.p298f.p299o.p300n.C2643a1.mo5499h(c.n.b.d.f.o.n.g$a):void");
    }
}
