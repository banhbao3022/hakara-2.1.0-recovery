package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import java.util.Iterator;
import java.util.Map;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.p299o.C2630c;
import p007c.p190n.p194b.p266d.p298f.p299o.InterfaceC2633f;
import p007c.p190n.p194b.p266d.p333n.C4782j;
import p636z0.p691g.ArrayMap;
import p636z0.p691g.MapCollections;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.b1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2646b1 {

    /* JADX INFO: renamed from: d */
    public int f11636d;

    /* JADX INFO: renamed from: b */
    public final ArrayMap<C2644b<?>, String> f11634b = new ArrayMap<>();

    /* JADX INFO: renamed from: c */
    public final C4782j<Map<C2644b<?>, String>> f11635c = new C4782j<>();

    /* JADX INFO: renamed from: e */
    public boolean f11637e = false;

    /* JADX INFO: renamed from: a */
    public final ArrayMap<C2644b<?>, C2602b> f11633a = new ArrayMap<>();

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
    public C2646b1(Iterable<? extends InterfaceC2633f<?>> iterable) {
        Iterator<? extends InterfaceC2633f<?>> it = iterable.iterator();
        while (it.hasNext()) {
            this.f11633a.put(it.next().mo5485a(), null);
        }
        this.f11636d = ((MapCollections.c) this.f11633a.keySet()).size();
    }

    /* JADX INFO: renamed from: a */
    public final void m5500a(C2644b<?> c2644b, C2602b c2602b, String str) {
        this.f11633a.put(c2644b, c2602b);
        this.f11634b.put(c2644b, str);
        this.f11636d--;
        if (!c2602b.m5197K()) {
            this.f11637e = true;
        }
        if (this.f11636d == 0) {
            if (this.f11637e) {
                this.f11635c.f24683a.m10943p(new C2630c(this.f11633a));
            } else {
                this.f11635c.f24683a.m10944q(this.f11634b);
            }
        }
    }
}
