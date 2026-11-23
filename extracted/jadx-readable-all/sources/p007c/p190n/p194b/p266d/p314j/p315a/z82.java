package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class z82 extends a92 {
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a92
    /* JADX INFO: renamed from: a */
    public final <L> List<L> mo5707a(Object obj, long j2) {
        o82 o82Var = (o82) za2.m8867p(obj, j2);
        if (o82Var.zza()) {
            return o82Var;
        }
        int size = o82Var.size();
        o82 o82VarMo5705l = o82Var.mo5705l(size == 0 ? 10 : size + size);
        za2.f22222e.m8789p(obj, j2, o82VarMo5705l);
        return o82VarMo5705l;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a92
    /* JADX INFO: renamed from: b */
    public final void mo5708b(Object obj, long j2) {
        ((o82) za2.m8867p(obj, j2)).mo7974a();
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
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a92
    /* JADX INFO: renamed from: c */
    public final <E> void mo5709c(Object obj, Object obj2, long j2) {
        o82 o82VarMo5705l = (o82) za2.m8867p(obj, j2);
        o82 o82Var = (o82) za2.m8867p(obj2, j2);
        int size = o82VarMo5705l.size();
        int size2 = o82Var.size();
        if (size > 0 && size2 > 0) {
            if (!o82VarMo5705l.zza()) {
                o82VarMo5705l = o82VarMo5705l.mo5705l(size2 + size);
            }
            o82VarMo5705l.addAll(o82Var);
        }
        if (size > 0) {
            o82Var = o82VarMo5705l;
        }
        za2.f22222e.m8789p(obj, j2, o82Var);
    }
}
