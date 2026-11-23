package p526i1.p536d.p543c.p553p;

import java.util.HashSet;
import java.util.Objects;
import p477d1.TypeCastException;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p526i1.p536d.p543c.p545h.BeanDefinition;
import p526i1.p536d.p543c.p546i.DefinitionOverrideException;
import p526i1.p536d.p543c.p551n.Qualifier;
import p526i1.p536d.p543c.p551n.StringQualifier;

/* JADX INFO: renamed from: i1.d.c.p.c, reason: use source file name */
/* JADX INFO: compiled from: ScopeDefinition.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ScopeDefinition {

    /* JADX INFO: renamed from: a */
    public static final StringQualifier f30953a;

    /* JADX INFO: renamed from: b */
    public static final a f30954b = new a(null);

    /* JADX INFO: renamed from: c */
    public final Qualifier f30955c;

    /* JADX INFO: renamed from: d */
    public final boolean f30956d;

    /* JADX INFO: renamed from: e */
    public final HashSet<BeanDefinition<?>> f30957e;

    /* JADX INFO: renamed from: i1.d.c.p.c$a */
    /* JADX INFO: compiled from: ScopeDefinition.kt */
    public static final class a {
        public a() {
        }

        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    static {
        Intrinsics2.m13090f("-Root-", "name");
        f30953a = new StringQualifier("-Root-");
    }

    public ScopeDefinition(Qualifier qualifier, boolean z, HashSet<BeanDefinition<?>> hashSet) {
        Intrinsics2.m13090f(qualifier, "qualifier");
        Intrinsics2.m13090f(hashSet, "_definitions");
        this.f30955c = qualifier;
        this.f30956d = z;
        this.f30957e = hashSet;
    }

    /* JADX INFO: renamed from: a */
    public static void m13866a(ScopeDefinition scopeDefinition, BeanDefinition beanDefinition, boolean z, int i) throws DefinitionOverrideException {
        if ((i & 2) != 0) {
            z = false;
        }
        Objects.requireNonNull(scopeDefinition);
        Intrinsics2.m13090f(beanDefinition, "beanDefinition");
        if (scopeDefinition.f30957e.contains(beanDefinition)) {
            if (!beanDefinition.f30904g.f30913b && !z) {
                for (Object obj : scopeDefinition.f30957e) {
                    if (Intrinsics2.m13085a((BeanDefinition) obj, beanDefinition)) {
                        throw new DefinitionOverrideException("Definition '" + beanDefinition + "' try to override existing definition. Please use override option or check for definition '" + ((BeanDefinition) obj) + '\'');
                    }
                }
                obj = null;
                throw new DefinitionOverrideException("Definition '" + beanDefinition + "' try to override existing definition. Please use override option or check for definition '" + ((BeanDefinition) obj) + '\'');
            }
            scopeDefinition.f30957e.remove(beanDefinition);
        }
        scopeDefinition.f30957e.add(beanDefinition);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics2.m13085a(ScopeDefinition.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.koin.core.scope.ScopeDefinition");
        }
        ScopeDefinition scopeDefinition = (ScopeDefinition) obj;
        return !(Intrinsics2.m13085a(this.f30955c, scopeDefinition.f30955c) ^ true) && this.f30956d == scopeDefinition.f30956d;
    }

    public int hashCode() {
        return Boolean.valueOf(this.f30956d).hashCode() + (this.f30955c.hashCode() * 31);
    }

    public /* synthetic */ ScopeDefinition(Qualifier qualifier, boolean z, HashSet hashSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(qualifier, (i & 2) != 0 ? false : z, (i & 4) != 0 ? new HashSet() : hashSet);
    }
}
