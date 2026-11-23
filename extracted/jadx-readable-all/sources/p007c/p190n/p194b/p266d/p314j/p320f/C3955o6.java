package p007c.p190n.p194b.p266d.p314j.p320f;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: c.n.b.d.j.f.o6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3955o6<T> implements InterfaceC4059z6<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3895i6 f22828a;

    /* JADX INFO: renamed from: b */
    public final AbstractC3946n7<?, ?> f22829b;

    /* JADX INFO: renamed from: c */
    public final boolean f22830c;

    /* JADX INFO: renamed from: d */
    public final AbstractC3963p4<?> f22831d;

    public C3955o6(AbstractC3946n7<?, ?> abstractC3946n7, AbstractC3963p4<?> abstractC3963p4, InterfaceC3895i6 interfaceC3895i6) {
        this.f22829b = abstractC3946n7;
        this.f22830c = abstractC3963p4.mo9178f(interfaceC3895i6);
        this.f22831d = abstractC3963p4;
        this.f22828a = interfaceC3895i6;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC4059z6
    /* JADX INFO: renamed from: a */
    public final boolean mo9122a(T t) {
        return this.f22831d.mo9175c(t).m9194a();
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
    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC4059z6
    /* JADX INFO: renamed from: b */
    public final int mo9123b(T t) {
        AbstractC3946n7<?, ?> abstractC3946n7 = this.f22829b;
        int iMo9165h = abstractC3946n7.mo9165h(abstractC3946n7.mo9164g(t)) + 0;
        if (!this.f22830c) {
            return iMo9165h;
        }
        C3973q4<T> c3973q4Mo9175c = this.f22831d.mo9175c(t);
        int iM9192k = 0;
        for (int i = 0; i < c3973q4Mo9175c.f22847b.m8937f(); i++) {
            iM9192k += C3973q4.m9192k(c3973q4Mo9175c.f22847b.m8934c(i));
        }
        Iterator<T> it = c3973q4Mo9175c.f22847b.m8938g().iterator();
        while (it.hasNext()) {
            iM9192k += C3973q4.m9192k((Map.Entry) it.next());
        }
        return iMo9165h + iM9192k;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC4059z6
    /* JADX INFO: renamed from: c */
    public final void mo9124c(T t) {
        this.f22829b.mo9160c(t);
        this.f22831d.mo9177e(t);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC4059z6
    /* JADX INFO: renamed from: d */
    public final void mo9125d(T t, InterfaceC3887h8 interfaceC3887h8) throws IOException {
        Iterator itM9195b = this.f22831d.mo9175c(t).m9195b();
        while (itM9195b.hasNext()) {
            Map.Entry entry = (Map.Entry) itM9195b.next();
            InterfaceC3993s4 interfaceC3993s4 = (InterfaceC3993s4) entry.getKey();
            if (interfaceC3993s4.mo9216i() != EnumC3867f8.MESSAGE || interfaceC3993s4.mo9218n() || interfaceC3993s4.mo9215g()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof C3954o5) {
                ((C3943n4) interfaceC3887h8).m9154e(interfaceC3993s4.mo9214d(), ((C3954o5) entry).f22827f.getValue().m9201b());
            } else {
                ((C3943n4) interfaceC3887h8).m9154e(interfaceC3993s4.mo9214d(), entry.getValue());
            }
        }
        AbstractC3946n7<?, ?> abstractC3946n7 = this.f22829b;
        abstractC3946n7.mo9159b(abstractC3946n7.mo9164g(t), interfaceC3887h8);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC4059z6
    /* JADX INFO: renamed from: e */
    public final boolean mo9126e(T t, T t2) {
        if (!this.f22829b.mo9164g(t).equals(this.f22829b.mo9164g(t2))) {
            return false;
        }
        if (this.f22830c) {
            return this.f22831d.mo9175c(t).equals(this.f22831d.mo9175c(t2));
        }
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC4059z6
    /* JADX INFO: renamed from: f */
    public final void mo9127f(T t, T t2) {
        AbstractC3946n7<?, ?> abstractC3946n7 = this.f22829b;
        Class<?> cls = C3826b7.f22526a;
        abstractC3946n7.mo9161d(t, abstractC3946n7.mo9162e(abstractC3946n7.mo9164g(t), abstractC3946n7.mo9164g(t2)));
        if (this.f22830c) {
            C3826b7.m8982d(this.f22831d, t, t2);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC4059z6
    /* JADX INFO: renamed from: g */
    public final int mo9128g(T t) {
        int iHashCode = this.f22829b.mo9164g(t).hashCode();
        return this.f22830c ? (iHashCode * 53) + this.f22831d.mo9175c(t).hashCode() : iHashCode;
    }
}
