package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class y82 extends a92 {

    /* JADX INFO: renamed from: c */
    public static final Class<?> f21812c = Collections.unmodifiableList(Collections.emptyList()).getClass();

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
    /* JADX INFO: renamed from: d */
    public static <L> List<L> m8779d(Object obj, long j2, int i) {
        Object obj2;
        List<L> listMo5705l;
        List<L> list = (List) za2.m8867p(obj, j2);
        if (list.isEmpty()) {
            if (list instanceof w82) {
                listMo5705l = new v82(i);
            } else {
                listMo5705l = ((list instanceof r92) && (list instanceof o82)) ? ((o82) list).mo5705l(i) : new ArrayList<>(i);
            }
            za2.f22222e.m8789p(obj, j2, listMo5705l);
            return listMo5705l;
        }
        if (f21812c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            za2.f22222e.m8789p(obj, j2, arrayList);
            obj2 = arrayList;
        } else {
            if (!(list instanceof ta2)) {
                if (!(list instanceof r92) || !(list instanceof o82)) {
                    return list;
                }
                o82 o82Var = (o82) list;
                if (o82Var.zza()) {
                    return list;
                }
                o82 o82VarMo5705l = o82Var.mo5705l(list.size() + i);
                za2.f22222e.m8789p(obj, j2, o82VarMo5705l);
                return o82VarMo5705l;
            }
            v82 v82Var = new v82(list.size() + i);
            v82Var.addAll(v82Var.size(), (ta2) list);
            za2.f22222e.m8789p(obj, j2, v82Var);
            obj2 = v82Var;
        }
        return (List<L>) obj2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a92
    /* JADX INFO: renamed from: a */
    public final <L> List<L> mo5707a(Object obj, long j2) {
        return m8779d(obj, j2, 10);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a92
    /* JADX INFO: renamed from: b */
    public final void mo5708b(Object obj, long j2) {
        Object objUnmodifiableList;
        List list = (List) za2.m8867p(obj, j2);
        if (list instanceof w82) {
            objUnmodifiableList = ((w82) list).mo8413i();
        } else {
            if (f21812c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof r92) && (list instanceof o82)) {
                o82 o82Var = (o82) list;
                if (o82Var.zza()) {
                    o82Var.mo7974a();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        za2.f22222e.m8789p(obj, j2, objUnmodifiableList);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.a92
    /* JADX INFO: renamed from: c */
    public final <E> void mo5709c(Object obj, Object obj2, long j2) {
        List list = (List) za2.m8867p(obj2, j2);
        List listM8779d = m8779d(obj, j2, list.size());
        int size = listM8779d.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listM8779d.addAll(list);
        }
        if (size > 0) {
            list = listM8779d;
        }
        za2.f22222e.m8789p(obj, j2, list);
    }
}
