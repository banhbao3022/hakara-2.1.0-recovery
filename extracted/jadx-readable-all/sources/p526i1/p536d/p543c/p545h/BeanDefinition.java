package p526i1.p536d.p543c.p545h;

import java.util.List;
import p007c.p071d.p078c.p079a.outline;
import p477d1.TypeCastException;
import p477d1.p479b0.KClass;
import p477d1.p483s.Collections4;
import p477d1.p483s._Collections;
import p477d1.p493x.p494b.InterfaceC6164l;
import p477d1.p493x.p494b.InterfaceC6168p;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p477d1.p493x.p495c.Lambda;
import p526i1.p536d.p543c.p550m.DefinitionParameters;
import p526i1.p536d.p543c.p551n.Qualifier;
import p526i1.p536d.p543c.p553p.Scope2;
import p526i1.p536d.p543c.p553p.ScopeDefinition;
import p526i1.p536d.p554d.KClassExt;

/* JADX INFO: renamed from: i1.d.c.h.a, reason: use source file name */
/* JADX INFO: compiled from: BeanDefinition.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BeanDefinition<T> {

    /* JADX INFO: renamed from: a */
    public final ScopeDefinition f30898a;

    /* JADX INFO: renamed from: b */
    public final KClass<?> f30899b;

    /* JADX INFO: renamed from: c */
    public final Qualifier f30900c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6168p<Scope2, DefinitionParameters, T> f30901d;

    /* JADX INFO: renamed from: e */
    public final BeanDefinition2 f30902e;

    /* JADX INFO: renamed from: f */
    public final List<KClass<?>> f30903f;

    /* JADX INFO: renamed from: g */
    public final Options4 f30904g;

    /* JADX INFO: renamed from: h */
    public final Properties f30905h;

    /* JADX INFO: renamed from: i */
    public final Callbacks<T> f30906i;

    /* JADX INFO: renamed from: i1.d.c.h.a$a */
    /* JADX INFO: compiled from: BeanDefinition.kt */
    public static final class a extends Lambda implements InterfaceC6164l<KClass<?>, String> {

        /* JADX INFO: renamed from: g */
        public static final a f30907g = new a();

        public a() {
            super(1);
        }

        @Override // p477d1.p493x.p494b.InterfaceC6164l
        /* JADX INFO: renamed from: b */
        public String mo3b(KClass<?> kClass) {
            KClass<?> kClass2 = kClass;
            Intrinsics2.m13090f(kClass2, "it");
            return KClassExt.m13867a(kClass2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeanDefinition(ScopeDefinition scopeDefinition, KClass<?> kClass, Qualifier qualifier, InterfaceC6168p<? super Scope2, ? super DefinitionParameters, ? extends T> interfaceC6168p, BeanDefinition2 beanDefinition2, List<? extends KClass<?>> list, Options4 options4, Properties properties, Callbacks<T> callbacks) {
        Intrinsics2.m13090f(scopeDefinition, "scopeDefinition");
        Intrinsics2.m13090f(kClass, "primaryType");
        Intrinsics2.m13090f(interfaceC6168p, "definition");
        Intrinsics2.m13090f(beanDefinition2, "kind");
        Intrinsics2.m13090f(list, "secondaryTypes");
        Intrinsics2.m13090f(options4, "options");
        Intrinsics2.m13090f(properties, "properties");
        Intrinsics2.m13090f(callbacks, "callbacks");
        this.f30898a = scopeDefinition;
        this.f30899b = kClass;
        this.f30900c = qualifier;
        this.f30901d = interfaceC6168p;
        this.f30902e = beanDefinition2;
        this.f30903f = list;
        this.f30904g = options4;
        this.f30905h = properties;
        this.f30906i = callbacks;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            throw new TypeCastException("null cannot be cast to non-null type org.koin.core.definition.BeanDefinition<*>");
        }
        BeanDefinition beanDefinition = (BeanDefinition) obj;
        return ((Intrinsics2.m13085a(this.f30899b, beanDefinition.f30899b) ^ true) || (Intrinsics2.m13085a(this.f30900c, beanDefinition.f30900c) ^ true) || (Intrinsics2.m13085a(this.f30898a, beanDefinition.f30898a) ^ true)) ? false : true;
    }

    public int hashCode() {
        Qualifier qualifier = this.f30900c;
        return this.f30898a.hashCode() + ((this.f30899b.hashCode() + ((qualifier != null ? qualifier.hashCode() : 0) * 31)) * 31);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0034  */
    public String toString() {
        String string;
        String string2;
        String string3 = this.f30902e.toString();
        StringBuilder sbM1555F = outline.m1555F('\'');
        sbM1555F.append(KClassExt.m13867a(this.f30899b));
        sbM1555F.append('\'');
        String string4 = sbM1555F.toString();
        if (this.f30900c != null) {
            StringBuilder sbM1556G = outline.m1556G(",qualifier:");
            sbM1556G.append(this.f30900c);
            string = sbM1556G.toString();
            if (string == null) {
                string = "";
            }
        } else {
            string = "";
        }
        if (this.f30898a.f30956d) {
            string2 = "";
        } else {
            StringBuilder sbM1556G2 = outline.m1556G(",scope:");
            sbM1556G2.append(this.f30898a.f30955c);
            string2 = sbM1556G2.toString();
        }
        return '[' + string3 + ':' + string4 + string + string2 + (this.f30903f.isEmpty() ^ true ? outline.m1599u(",binds:", _Collections.m13046k(this.f30903f, ",", null, null, 0, null, a.f30907g, 30)) : "") + ']';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ BeanDefinition(ScopeDefinition scopeDefinition, KClass kClass, Qualifier qualifier, InterfaceC6168p interfaceC6168p, BeanDefinition2 beanDefinition2, List list, Options4 options4, Properties properties, Callbacks callbacks, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = 1;
        this(scopeDefinition, kClass, (i & 4) != 0 ? null : qualifier, interfaceC6168p, beanDefinition2, (i & 32) != 0 ? Collections4.f29519f : list, (i & 64) != 0 ? new Options4(false, false, 3, null) : options4, (i & 128) != 0 ? new Properties(null, i2, 0 == true ? 1 : 0) : properties, (i & 256) != 0 ? new Callbacks(0 == true ? 1 : 0, i2, 0 == true ? 1 : 0) : callbacks);
    }
}
