package p007c.p190n.p385d.p390k;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p007c.p190n.p385d.p416p.Publisher;
import p007c.p190n.p385d.p420s.Provider2;

/* JADX INFO: renamed from: c.n.d.k.e0, reason: use source file name */
/* JADX INFO: compiled from: RestrictedComponentContainer.java */
/* JADX INFO: loaded from: classes.dex */
public final class RestrictedComponentContainer extends AbstractComponentContainer {

    /* JADX INFO: renamed from: a */
    public final Set<Class<?>> f26370a;

    /* JADX INFO: renamed from: b */
    public final Set<Class<?>> f26371b;

    /* JADX INFO: renamed from: c */
    public final Set<Class<?>> f26372c;

    /* JADX INFO: renamed from: d */
    public final Set<Class<?>> f26373d;

    /* JADX INFO: renamed from: e */
    public final Set<Class<?>> f26374e;

    /* JADX INFO: renamed from: f */
    public final ComponentContainer f26375f;

    /* JADX INFO: renamed from: c.n.d.k.e0$a */
    /* JADX INFO: compiled from: RestrictedComponentContainer.java */
    public static class a implements Publisher {

        /* JADX INFO: renamed from: a */
        public final Publisher f26376a;

        public a(Set<Class<?>> set, Publisher publisher) {
            this.f26376a = publisher;
        }
    }

    public RestrictedComponentContainer(Component3<?> component3, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (Dependency dependency : component3.f26356b) {
            int i = dependency.f26401c;
            if (!(i == 0)) {
                if (i == 2) {
                    hashSet3.add(dependency.f26399a);
                } else if (dependency.m11700a()) {
                    hashSet5.add(dependency.f26399a);
                } else {
                    hashSet2.add(dependency.f26399a);
                }
            } else if (dependency.m11700a()) {
                hashSet4.add(dependency.f26399a);
            } else {
                hashSet.add(dependency.f26399a);
            }
        }
        if (!component3.f26360f.isEmpty()) {
            hashSet.add(Publisher.class);
        }
        this.f26370a = Collections.unmodifiableSet(hashSet);
        this.f26371b = Collections.unmodifiableSet(hashSet2);
        Collections.unmodifiableSet(hashSet3);
        this.f26372c = Collections.unmodifiableSet(hashSet4);
        this.f26373d = Collections.unmodifiableSet(hashSet5);
        this.f26374e = component3.f26360f;
        this.f26375f = componentContainer;
    }

    @Override // p007c.p190n.p385d.p390k.AbstractComponentContainer, p007c.p190n.p385d.p390k.ComponentContainer
    /* JADX INFO: renamed from: a */
    public <T> T mo11684a(Class<T> cls) {
        if (!this.f26370a.contains(cls)) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.f26375f.mo11684a(cls);
        return !cls.equals(Publisher.class) ? t : (T) new a(this.f26374e, (Publisher) t);
    }

    @Override // p007c.p190n.p385d.p390k.ComponentContainer
    /* JADX INFO: renamed from: b */
    public <T> Provider2<T> mo11693b(Class<T> cls) {
        if (this.f26371b.contains(cls)) {
            return this.f26375f.mo11693b(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // p007c.p190n.p385d.p390k.ComponentContainer
    /* JADX INFO: renamed from: c */
    public <T> Provider2<Set<T>> mo11694c(Class<T> cls) {
        if (this.f26373d.contains(cls)) {
            return this.f26375f.mo11694c(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }

    @Override // p007c.p190n.p385d.p390k.AbstractComponentContainer, p007c.p190n.p385d.p390k.ComponentContainer
    /* JADX INFO: renamed from: d */
    public <T> Set<T> mo11685d(Class<T> cls) {
        if (this.f26372c.contains(cls)) {
            return this.f26375f.mo11685d(cls);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }
}
