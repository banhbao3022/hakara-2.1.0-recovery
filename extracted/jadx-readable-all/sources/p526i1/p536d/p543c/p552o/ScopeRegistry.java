package p526i1.p536d.p543c.p552o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p483s.Collections4;
import p477d1.p483s.CollectionsJVM;
import p477d1.p493x.p495c.Intrinsics2;
import p526i1.p536d.p543c.Koin;
import p526i1.p536d.p543c.p545h.BeanDefinition;
import p526i1.p536d.p543c.p546i.DefinitionOverrideException;
import p526i1.p536d.p543c.p546i.NoScopeDefFoundException;
import p526i1.p536d.p543c.p546i.ScopeAlreadyCreatedException;
import p526i1.p536d.p543c.p548k.Logger6;
import p526i1.p536d.p543c.p549l.Module;
import p526i1.p536d.p543c.p551n.StringQualifier;
import p526i1.p536d.p543c.p553p.Scope2;
import p526i1.p536d.p543c.p553p.ScopeDefinition;

/* JADX INFO: renamed from: i1.d.c.o.c, reason: use source file name */
/* JADX INFO: compiled from: ScopeRegistry.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ScopeRegistry {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, ScopeDefinition> f30937a;

    /* JADX INFO: renamed from: b */
    public final HashMap<String, Scope2> f30938b;

    /* JADX INFO: renamed from: c */
    public Scope2 f30939c;

    /* JADX INFO: renamed from: d */
    public final Koin f30940d;

    public ScopeRegistry(Koin koin) {
        Intrinsics2.m13090f(koin, "_koin");
        this.f30940d = koin;
        this.f30937a = new HashMap<>();
        this.f30938b = new HashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public final void m13858a() {
        if (this.f30939c == null) {
            Objects.requireNonNull(ScopeDefinition.f30954b);
            StringQualifier stringQualifier = ScopeDefinition.f30953a;
            Intrinsics2.m13090f("-Root-", "scopeId");
            Intrinsics2.m13090f(stringQualifier, "qualifier");
            if (this.f30938b.containsKey("-Root-")) {
                throw new ScopeAlreadyCreatedException("Scope with id '-Root-' is already created");
            }
            ScopeDefinition scopeDefinition = this.f30937a.get(stringQualifier.getValue());
            if (scopeDefinition == null) {
                StringBuilder sbM1556G = outline.m1556G("No Scope Definition found for qualifer '");
                sbM1556G.append(stringQualifier.getValue());
                sbM1556G.append('\'');
                throw new NoScopeDefFoundException(sbM1556G.toString());
            }
            Scope2 scope2 = new Scope2("-Root-", scopeDefinition, this.f30940d, null);
            Scope2 scope3 = this.f30939c;
            Collection<? extends Scope2> collectionM13036a = scope3 != null ? CollectionsJVM.m13036a(scope3) : Collections4.f29519f;
            Intrinsics2.m13090f(collectionM13036a, "links");
            InstanceRegistry instanceRegistry = scope2.f30942b;
            HashSet<BeanDefinition<?>> hashSet = scope2.f30946f.f30957e;
            Objects.requireNonNull(instanceRegistry);
            Intrinsics2.m13090f(hashSet, "definitions");
            for (BeanDefinition<?> beanDefinition : hashSet) {
                if (instanceRegistry.f30935b.f30887b.m13854e(Logger6.DEBUG)) {
                    if (instanceRegistry.f30936c.f30946f.f30956d) {
                        instanceRegistry.f30935b.f30887b.m13850a("- " + beanDefinition);
                    } else {
                        instanceRegistry.f30935b.f30887b.m13850a(instanceRegistry.f30936c + " -> " + beanDefinition);
                    }
                }
                instanceRegistry.m13856a(beanDefinition, false);
            }
            scope2.f30941a.addAll(collectionM13036a);
            this.f30938b.put("-Root-", scope2);
            this.f30939c = scope2;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13859b(ScopeDefinition scopeDefinition) throws DefinitionOverrideException {
        if (this.f30937a.containsKey(scopeDefinition.f30955c.getValue())) {
            ScopeDefinition scopeDefinition2 = this.f30937a.get(scopeDefinition.f30955c.getValue());
            if (scopeDefinition2 == null) {
                throw new IllegalStateException(("Scope definition '" + scopeDefinition + "' not found in " + this.f30937a).toString());
            }
            Iterator<T> it = scopeDefinition.f30957e.iterator();
            while (it.hasNext()) {
                ScopeDefinition.m13866a(scopeDefinition2, (BeanDefinition) it.next(), false, 2);
            }
        } else {
            HashMap<String, ScopeDefinition> map = this.f30937a;
            String value = scopeDefinition.f30955c.getValue();
            ScopeDefinition scopeDefinition3 = new ScopeDefinition(scopeDefinition.f30955c, scopeDefinition.f30956d, new HashSet());
            scopeDefinition3.f30957e.addAll(scopeDefinition.f30957e);
            map.put(value, scopeDefinition3);
        }
        Collection<Scope2> collectionValues = this.f30938b.values();
        Intrinsics2.m13086b(collectionValues, "_scopes.values");
        ArrayList<Scope2> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (Intrinsics2.m13085a(((Scope2) obj).f30946f, scopeDefinition)) {
                arrayList.add(obj);
            }
        }
        for (Scope2 scope2 : arrayList) {
            Objects.requireNonNull(scope2);
            Intrinsics2.m13090f(scopeDefinition, "scopeDefinition");
            for (BeanDefinition<?> beanDefinition : scopeDefinition.f30957e) {
                InstanceRegistry instanceRegistry = scope2.f30942b;
                Objects.requireNonNull(instanceRegistry);
                Intrinsics2.m13090f(beanDefinition, "definition");
                instanceRegistry.m13856a(beanDefinition, false);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m13860c(Iterable<Module> iterable) throws DefinitionOverrideException {
        Intrinsics2.m13090f(iterable, "modules");
        for (Module module : iterable) {
            if (module.f30928b) {
                this.f30940d.f30887b.m13852c("module '" + module + "' already loaded!");
            } else {
                m13859b(module.f30927a);
                Iterator<T> it = module.f30929c.iterator();
                while (it.hasNext()) {
                    m13859b((ScopeDefinition) it.next());
                }
                module.f30928b = true;
            }
        }
    }
}
