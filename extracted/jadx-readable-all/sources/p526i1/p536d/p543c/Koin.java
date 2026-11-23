package p526i1.p536d.p543c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p477d1.p493x.p495c.Intrinsics2;
import p526i1.p536d.p543c.p547j.InstanceContext;
import p526i1.p536d.p543c.p547j.InstanceFactory2;
import p526i1.p536d.p543c.p547j.SingleInstanceFactory;
import p526i1.p536d.p543c.p548k.EmptyLogger;
import p526i1.p536d.p543c.p548k.Logger7;
import p526i1.p536d.p543c.p549l.Module;
import p526i1.p536d.p543c.p552o.InstanceRegistry;
import p526i1.p536d.p543c.p552o.PropertyRegistry;
import p526i1.p536d.p543c.p552o.ScopeRegistry;
import p526i1.p536d.p543c.p553p.Scope2;

/* JADX INFO: renamed from: i1.d.c.a, reason: use source file name */
/* JADX INFO: compiled from: Koin.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Koin {

    /* JADX INFO: renamed from: a */
    public final ScopeRegistry f30886a = new ScopeRegistry(this);

    /* JADX INFO: renamed from: b */
    public Logger7 f30887b;

    /* JADX INFO: renamed from: c */
    public final HashSet<Module> f30888c;

    public Koin() {
        new PropertyRegistry(this);
        this.f30887b = new EmptyLogger();
        this.f30888c = new HashSet<>();
    }

    /* JADX INFO: renamed from: a */
    public final void m13842a() {
        ScopeRegistry scopeRegistry = this.f30886a;
        if (scopeRegistry.f30939c == null) {
            scopeRegistry.m13858a();
        }
        Scope2 scope2 = this.f30886a.f30939c;
        if (scope2 == null) {
            throw new IllegalStateException("No root scoped initialized".toString());
        }
        if (scope2.f30946f.f30956d) {
            InstanceRegistry instanceRegistry = scope2.f30942b;
            Collection<InstanceFactory2<?>> collectionValues = instanceRegistry.f30934a.values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionValues) {
                if (obj instanceof SingleInstanceFactory) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((SingleInstanceFactory) obj2).f30919b.f30904g.f30912a) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((SingleInstanceFactory) it.next()).mo13847c(new InstanceContext(instanceRegistry.f30935b, instanceRegistry.f30936c, null, 4, null));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13843b(List<Module> list) {
        Intrinsics2.m13090f(list, "modules");
        synchronized (this) {
            this.f30888c.addAll(list);
            this.f30886a.m13860c(list);
        }
    }
}
