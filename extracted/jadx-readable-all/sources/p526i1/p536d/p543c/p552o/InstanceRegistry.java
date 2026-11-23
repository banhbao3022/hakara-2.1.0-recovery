package p526i1.p536d.p543c.p552o;

import java.util.HashMap;
import java.util.Iterator;
import p477d1.NoWhenBranchMatchedException;
import p477d1.p479b0.KClass;
import p477d1.p493x.p495c.Intrinsics2;
import p526i1.p536d.p543c.Koin;
import p526i1.p536d.p543c.p545h.BeanDefinition;
import p526i1.p536d.p543c.p547j.FactoryInstanceFactory;
import p526i1.p536d.p543c.p547j.InstanceFactory2;
import p526i1.p536d.p543c.p547j.SingleInstanceFactory;
import p526i1.p536d.p543c.p553p.Scope2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;

/* JADX INFO: renamed from: i1.d.c.o.a, reason: use source file name */
/* JADX INFO: compiled from: InstanceRegistry.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class InstanceRegistry {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, InstanceFactory2<?>> f30934a;

    /* JADX INFO: renamed from: b */
    public final Koin f30935b;

    /* JADX INFO: renamed from: c */
    public final Scope2 f30936c;

    public InstanceRegistry(Koin koin, Scope2 scope2) {
        Intrinsics2.m13090f(koin, "_koin");
        Intrinsics2.m13090f(scope2, "_scope");
        this.f30935b = koin;
        this.f30936c = scope2;
        this.f30934a = new HashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public final void m13856a(BeanDefinition<?> beanDefinition, boolean z) {
        InstanceFactory2<?> singleInstanceFactory;
        Intrinsics2.m13090f(beanDefinition, "definition");
        boolean z2 = beanDefinition.f30904g.f30913b || z;
        Koin koin = this.f30935b;
        int iOrdinal = beanDefinition.f30902e.ordinal();
        if (iOrdinal == 0) {
            singleInstanceFactory = new SingleInstanceFactory<>(koin, beanDefinition);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            singleInstanceFactory = new FactoryInstanceFactory<>(koin, beanDefinition);
        }
        m13857b(SkuDao.a.m14111x(beanDefinition.f30899b, beanDefinition.f30900c), singleInstanceFactory, z2);
        Iterator<T> it = beanDefinition.f30903f.iterator();
        while (it.hasNext()) {
            KClass kClass = (KClass) it.next();
            if (z2) {
                m13857b(SkuDao.a.m14111x(kClass, beanDefinition.f30900c), singleInstanceFactory, z2);
            } else {
                String strM14111x = SkuDao.a.m14111x(kClass, beanDefinition.f30900c);
                if (!this.f30934a.containsKey(strM14111x)) {
                    this.f30934a.put(strM14111x, singleInstanceFactory);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13857b(String str, InstanceFactory2<?> instanceFactory2, boolean z) {
        if (!this.f30934a.containsKey(str) || z) {
            this.f30934a.put(str, instanceFactory2);
            return;
        }
        throw new IllegalStateException(("InstanceRegistry already contains index '" + str + '\'').toString());
    }
}
