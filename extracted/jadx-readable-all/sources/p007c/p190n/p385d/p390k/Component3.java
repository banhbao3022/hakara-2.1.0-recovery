package p007c.p190n.p385d.p390k;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: c.n.d.k.d, reason: use source file name */
/* JADX INFO: compiled from: Component.java */
/* JADX INFO: loaded from: classes.dex */
public final class Component3<T> {

    /* JADX INFO: renamed from: a */
    public final Set<Class<? super T>> f26355a;

    /* JADX INFO: renamed from: b */
    public final Set<Dependency> f26356b;

    /* JADX INFO: renamed from: c */
    public final int f26357c;

    /* JADX INFO: renamed from: d */
    public final int f26358d;

    /* JADX INFO: renamed from: e */
    public final ComponentFactory<T> f26359e;

    /* JADX INFO: renamed from: f */
    public final Set<Class<?>> f26360f;

    /* JADX INFO: renamed from: c.n.d.k.d$b */
    /* JADX INFO: compiled from: Component.java */
    public static class b<T> {

        /* JADX INFO: renamed from: a */
        public final Set<Class<? super T>> f26361a;

        /* JADX INFO: renamed from: b */
        public final Set<Dependency> f26362b;

        /* JADX INFO: renamed from: c */
        public int f26363c;

        /* JADX INFO: renamed from: d */
        public int f26364d;

        /* JADX INFO: renamed from: e */
        public ComponentFactory<T> f26365e;

        /* JADX INFO: renamed from: f */
        public Set<Class<?>> f26366f;

        public b(Class cls, Class[] clsArr, a aVar) {
            HashSet hashSet = new HashSet();
            this.f26361a = hashSet;
            this.f26362b = new HashSet();
            this.f26363c = 0;
            this.f26364d = 0;
            this.f26366f = new HashSet();
            Objects.requireNonNull(cls, "Null interface");
            hashSet.add(cls);
            for (Class cls2 : clsArr) {
                Objects.requireNonNull(cls2, "Null interface");
            }
            Collections.addAll(this.f26361a, clsArr);
        }

        /* JADX INFO: renamed from: a */
        public b<T> m11689a(Dependency dependency) {
            if (!(!this.f26361a.contains(dependency.f26399a))) {
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            this.f26362b.add(dependency);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public Component3<T> m11690b() {
            if (this.f26365e != null) {
                return new Component3<>(new HashSet(this.f26361a), new HashSet(this.f26362b), this.f26363c, this.f26364d, this.f26365e, this.f26366f, null);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        /* JADX INFO: renamed from: c */
        public b<T> m11691c(ComponentFactory<T> componentFactory) {
            this.f26365e = componentFactory;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public final b<T> m11692d(int i) {
            if (!(this.f26363c == 0)) {
                throw new IllegalStateException("Instantiation type has already been set.");
            }
            this.f26363c = i;
            return this;
        }
    }

    public Component3(Set set, Set set2, int i, int i2, ComponentFactory componentFactory, Set set3, a aVar) {
        this.f26355a = Collections.unmodifiableSet(set);
        this.f26356b = Collections.unmodifiableSet(set2);
        this.f26357c = i;
        this.f26358d = i2;
        this.f26359e = componentFactory;
        this.f26360f = Collections.unmodifiableSet(set3);
    }

    /* JADX INFO: renamed from: a */
    public static <T> b<T> m11686a(Class<T> cls) {
        return new b<>(cls, new Class[0], null);
    }

    @SafeVarargs
    /* JADX INFO: renamed from: c */
    public static <T> Component3<T> m11687c(final T t, Class<T> cls, Class<? super T>... clsArr) {
        b bVar = new b(cls, clsArr, null);
        bVar.m11691c(new ComponentFactory(t) { // from class: c.n.d.k.b

            /* JADX INFO: renamed from: a */
            public final Object f26351a;

            {
                this.f26351a = t;
            }

            @Override // p007c.p190n.p385d.p390k.ComponentFactory
            /* JADX INFO: renamed from: a */
            public Object mo11679a(ComponentContainer componentContainer) {
                return this.f26351a;
            }
        });
        return bVar.m11690b();
    }

    /* JADX INFO: renamed from: b */
    public boolean m11688b() {
        return this.f26358d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f26355a.toArray()) + ">{" + this.f26357c + ", type=" + this.f26358d + ", deps=" + Arrays.toString(this.f26356b.toArray()) + "}";
    }
}
