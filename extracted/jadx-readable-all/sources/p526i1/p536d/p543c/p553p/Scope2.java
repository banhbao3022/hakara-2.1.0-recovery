package p526i1.p536d.p543c.p553p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.Tuples;
import p477d1.p479b0.KClass;
import p477d1.p493x.p494b.InterfaceC6153a;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p526i1.p536d.p543c.Koin;
import p526i1.p536d.p543c.p546i.ClosedScopeException;
import p526i1.p536d.p543c.p546i.NoBeanDefFoundException;
import p526i1.p536d.p543c.p547j.InstanceContext;
import p526i1.p536d.p543c.p547j.InstanceFactory2;
import p526i1.p536d.p543c.p548k.Logger6;
import p526i1.p536d.p543c.p548k.Logger7;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p551n.Qualifier;
import p526i1.p536d.p543c.p552o.InstanceRegistry;
import p526i1.p536d.p543c.p552o.ScopeRegistry;
import p526i1.p536d.p554d.KClassExt;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: i1.d.c.p.a, reason: use source file name */
/* JADX INFO: compiled from: Scope.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Scope2 {

    /* JADX INFO: renamed from: a */
    public final ArrayList<Scope2> f30941a;

    /* JADX INFO: renamed from: b */
    public final InstanceRegistry f30942b;

    /* JADX INFO: renamed from: c */
    public final ArrayList<ScopeCallback> f30943c;

    /* JADX INFO: renamed from: d */
    public boolean f30944d;

    /* JADX INFO: renamed from: e */
    public final String f30945e;

    /* JADX INFO: renamed from: f */
    public final ScopeDefinition f30946f;

    /* JADX INFO: renamed from: g */
    public final Koin f30947g;

    /* JADX INFO: renamed from: h */
    public final Object f30948h;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: i1.d.c.p.a$a */
    /* JADX INFO: compiled from: Scope.kt */
    public static final class a<T> extends Lambda implements InterfaceC6153a<T> {

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Qualifier f30950h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ KClass f30951i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ InterfaceC6153a f30952j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Qualifier qualifier, KClass kClass, InterfaceC6153a interfaceC6153a) {
            super(0);
            this.f30950h = qualifier;
            this.f30951i = kClass;
            this.f30952j = interfaceC6153a;
        }

        @Override // p477d1.p493x.p494b.InterfaceC6153a
        /* JADX INFO: renamed from: c */
        public final T mo2c() {
            return (T) Scope2.this.m13864d(this.f30950h, this.f30951i, this.f30952j);
        }
    }

    public Scope2(String str, ScopeDefinition scopeDefinition, Koin koin, Object obj) {
        Intrinsics2.m13090f(str, "id");
        Intrinsics2.m13090f(scopeDefinition, "_scopeDefinition");
        Intrinsics2.m13090f(koin, "_koin");
        this.f30945e = str;
        this.f30946f = scopeDefinition;
        this.f30947g = koin;
        this.f30948h = obj;
        this.f30941a = new ArrayList<>();
        this.f30942b = new InstanceRegistry(koin, this);
        this.f30943c = new ArrayList<>();
    }

    /* JADX INFO: renamed from: a */
    public final void m13861a() {
        synchronized (this) {
            this.f30944d = true;
            if (this.f30947g.f30887b.m13854e(Logger6.DEBUG)) {
                this.f30947g.f30887b.m13853d("closing scope:'" + this.f30945e + '\'');
            }
            Iterator<T> it = this.f30943c.iterator();
            while (it.hasNext()) {
                ((ScopeCallback) it.next()).m13865a(this);
            }
            this.f30943c.clear();
            InstanceRegistry instanceRegistry = this.f30942b;
            Collection<InstanceFactory2<?>> collectionValues = instanceRegistry.f30934a.values();
            Intrinsics2.m13086b(collectionValues, "_instances.values");
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                ((InstanceFactory2) it2.next()).mo13846b();
            }
            instanceRegistry.f30934a.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13862b() {
        synchronized (this) {
            m13861a();
            ScopeRegistry scopeRegistry = this.f30947g.f30886a;
            Objects.requireNonNull(scopeRegistry);
            Intrinsics2.m13090f(this, "scope");
            scopeRegistry.f30938b.remove(this.f30945e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final <T> T m13863c(KClass<?> kClass, Qualifier qualifier, InterfaceC6153a<DefinitionParameters> interfaceC6153a) {
        String str;
        Intrinsics2.m13090f(kClass, "clazz");
        if (!this.f30947g.f30887b.m13854e(Logger6.DEBUG)) {
            return (T) m13864d(qualifier, kClass, interfaceC6153a);
        }
        if (qualifier != null) {
            str = " with qualifier '" + qualifier + '\'';
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        Logger7 logger7 = this.f30947g.f30887b;
        StringBuilder sbM1556G = outline.m1556G("+- '");
        sbM1556G.append(KClassExt.m13867a(kClass));
        sbM1556G.append('\'');
        sbM1556G.append(str);
        logger7.m13850a(sbM1556G.toString());
        Tuples tuplesM14058J = SkuDao.a.m14058J(new a(qualifier, kClass, interfaceC6153a));
        T t = (T) tuplesM14058J.f29491f;
        double dDoubleValue = ((Number) tuplesM14058J.f29492g).doubleValue();
        Logger7 logger8 = this.f30947g.f30887b;
        StringBuilder sbM1556G2 = outline.m1556G("|- '");
        sbM1556G2.append(KClassExt.m13867a(kClass));
        sbM1556G2.append("' in ");
        sbM1556G2.append(dDoubleValue);
        sbM1556G2.append(" ms");
        logger8.m13850a(sbM1556G2.toString());
        return t;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a2  */
    /* JADX INFO: renamed from: d */
    public final <T> T m13864d(Qualifier qualifier, KClass<?> kClass, InterfaceC6153a<DefinitionParameters> interfaceC6153a) throws NoBeanDefFoundException, ClosedScopeException {
        String str;
        if (this.f30944d) {
            throw new ClosedScopeException(outline.m1550A(outline.m1556G("Scope '"), this.f30945e, "' is closed"));
        }
        String strM14111x = SkuDao.a.m14111x(kClass, qualifier);
        InstanceRegistry instanceRegistry = this.f30942b;
        Objects.requireNonNull(instanceRegistry);
        Intrinsics2.m13090f(strM14111x, "indexKey");
        InstanceFactory2<?> instanceFactory2 = instanceRegistry.f30934a.get(strM14111x);
        Object obj = null;
        Object objMo13847c = instanceFactory2 != null ? instanceFactory2.mo13847c(new InstanceContext(instanceRegistry.f30935b, instanceRegistry.f30936c, interfaceC6153a)) : null;
        if (!(objMo13847c instanceof Object)) {
            objMo13847c = null;
        }
        if (objMo13847c == null) {
            Object objM13863c = null;
            for (Scope2 scope2 : this.f30941a) {
                Objects.requireNonNull(scope2);
                Intrinsics2.m13090f(kClass, "clazz");
                try {
                    objM13863c = scope2.m13863c(kClass, qualifier, interfaceC6153a);
                } catch (Exception unused) {
                    Logger7 logger7 = scope2.f30947g.f30887b;
                    StringBuilder sbM1556G = outline.m1556G("Can't get instance for ");
                    sbM1556G.append(KClassExt.m13867a(kClass));
                    logger7.m13852c(sbM1556G.toString());
                    objM13863c = null;
                }
                if (objM13863c != null) {
                    break;
                }
            }
            objMo13847c = (T) objM13863c;
        }
        if (objMo13847c == null) {
            if (kClass.mo12972a(this.f30948h)) {
                Object obj2 = this.f30948h;
                if (obj2 instanceof Object) {
                    obj = obj2;
                }
            }
            objMo13847c = (T) obj;
        }
        if (objMo13847c != null) {
            return (T) objMo13847c;
        }
        if (qualifier != null) {
            str = " & qualifier:'" + qualifier + '\'';
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        StringBuilder sbM1556G2 = outline.m1556G("No definition found for class:'");
        sbM1556G2.append(KClassExt.m13867a(kClass));
        sbM1556G2.append('\'');
        sbM1556G2.append(str);
        sbM1556G2.append(". Check your definitions!");
        throw new NoBeanDefFoundException(sbM1556G2.toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope2)) {
            return false;
        }
        Scope2 scope2 = (Scope2) obj;
        return Intrinsics2.m13085a(this.f30945e, scope2.f30945e) && Intrinsics2.m13085a(this.f30946f, scope2.f30946f) && Intrinsics2.m13085a(this.f30947g, scope2.f30947g) && Intrinsics2.m13085a(this.f30948h, scope2.f30948h);
    }

    public int hashCode() {
        String str = this.f30945e;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        ScopeDefinition scopeDefinition = this.f30946f;
        int iHashCode2 = (iHashCode + (scopeDefinition != null ? scopeDefinition.hashCode() : 0)) * 31;
        Koin koin = this.f30947g;
        int iHashCode3 = (iHashCode2 + (koin != null ? koin.hashCode() : 0)) * 31;
        Object obj = this.f30948h;
        return iHashCode3 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return outline.m1550A(outline.m1556G("['"), this.f30945e, "']");
    }

    public /* synthetic */ Scope2(String str, ScopeDefinition scopeDefinition, Koin koin, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, scopeDefinition, koin, (i & 8) != 0 ? null : obj);
    }
}
