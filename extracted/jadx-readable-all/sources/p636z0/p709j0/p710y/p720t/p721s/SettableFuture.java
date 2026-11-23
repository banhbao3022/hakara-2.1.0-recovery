package p636z0.p709j0.p710y.p720t.p721s;

import java.util.Objects;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;

/* JADX INFO: renamed from: z0.j0.y.t.s.c, reason: use source file name */
/* JADX INFO: compiled from: SettableFuture.java */
/* JADX INFO: loaded from: classes.dex */
public final class SettableFuture<V> extends AbstractFuture<V> {
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
    /* JADX INFO: renamed from: k */
    public boolean m16027k(V v) {
        if (v == null) {
            v = (V) AbstractFuture.f37613i;
        }
        if (!AbstractFuture.f37612h.mo16023b(this, null, v)) {
            return false;
        }
        AbstractFuture.m16014b(this);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public boolean m16028l(Throwable th) {
        Objects.requireNonNull(th);
        if (!AbstractFuture.f37612h.mo16023b(this, null, new AbstractFuture.d(th))) {
            return false;
        }
        AbstractFuture.m16014b(this);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public boolean m16029m(ListenableFuture<? extends V> listenableFuture) {
        AbstractFuture.d dVar;
        Objects.requireNonNull(listenableFuture);
        Object obj = this.f37614j;
        if (obj == null) {
            if (listenableFuture.isDone()) {
                if (!AbstractFuture.f37612h.mo16023b(this, null, AbstractFuture.m16016e(listenableFuture))) {
                    return false;
                }
                AbstractFuture.m16014b(this);
            } else {
                AbstractFuture.g gVar = new AbstractFuture.g(this, listenableFuture);
                if (AbstractFuture.f37612h.mo16023b(this, null, gVar)) {
                    try {
                        listenableFuture.mo11664h(gVar, DirectExecutor2.INSTANCE);
                    } catch (Throwable th) {
                        try {
                            dVar = new AbstractFuture.d(th);
                        } catch (Throwable unused) {
                            dVar = AbstractFuture.d.f37621a;
                        }
                        AbstractFuture.f37612h.mo16023b(this, gVar, dVar);
                    }
                } else {
                    obj = this.f37614j;
                }
            }
            return true;
        }
        if (!(obj instanceof AbstractFuture.c)) {
            return false;
        }
        listenableFuture.cancel(((AbstractFuture.c) obj).f37619c);
        return false;
    }
}
