package p007c.p190n.p430e.p432e0;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import p007c.p190n.p430e.InstanceCreator;
import p007c.p190n.p430e.p432e0.p435b0.ReflectionAccessor;
import p007c.p190n.p430e.p436f0.TypeToken;

/* JADX INFO: renamed from: c.n.e.e0.g */
/* JADX INFO: compiled from: ConstructorConstructor.java */
/* JADX INFO: loaded from: classes.dex */
public final class C5611g {

    /* JADX INFO: renamed from: a */
    public final Map<Type, InstanceCreator<?>> f27463a;

    /* JADX INFO: renamed from: b */
    public final ReflectionAccessor f27464b = ReflectionAccessor.f27456a;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: c.n.e.e0.g$a */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class a<T> implements ObjectConstructor<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InstanceCreator f27465a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Type f27466b;

        public a(C5611g c5611g, InstanceCreator instanceCreator, Type type) {
            this.f27465a = instanceCreator;
            this.f27466b = type;
        }

        @Override // p007c.p190n.p430e.p432e0.ObjectConstructor
        /* JADX INFO: renamed from: a */
        public T mo12272a() {
            return (T) this.f27465a.m12323a(this.f27466b);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: c.n.e.e0.g$b */
    /* JADX INFO: compiled from: ConstructorConstructor.java */
    public class b<T> implements ObjectConstructor<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InstanceCreator f27467a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Type f27468b;

        public b(C5611g c5611g, InstanceCreator instanceCreator, Type type) {
            this.f27467a = instanceCreator;
            this.f27468b = type;
        }

        @Override // p007c.p190n.p430e.p432e0.ObjectConstructor
        /* JADX INFO: renamed from: a */
        public T mo12272a() {
            return (T) this.f27467a.m12323a(this.f27468b);
        }
    }

    public C5611g(Map<Type, InstanceCreator<?>> map) {
        this.f27463a = map;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00e5  */
    /* JADX INFO: renamed from: a */
    public <T> ObjectConstructor<T> m12274a(TypeToken<T> typeToken) {
        C5612h c5612h;
        Type type = typeToken.f27514b;
        Class<? super T> cls = typeToken.f27513a;
        InstanceCreator<?> instanceCreator = this.f27463a.get(type);
        if (instanceCreator != null) {
            return new a(this, instanceCreator, type);
        }
        InstanceCreator<?> instanceCreator2 = this.f27463a.get(cls);
        if (instanceCreator2 != null) {
            return new b(this, instanceCreator2, type);
        }
        ObjectConstructor<T> c5609e = null;
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f27464b.mo12273a(declaredConstructor);
            }
            c5612h = new C5612h(this, declaredConstructor);
        } catch (NoSuchMethodException unused) {
            c5612h = null;
        }
        if (c5612h != null) {
            return c5612h;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                c5609e = new C5613i<>(this);
            } else if (EnumSet.class.isAssignableFrom(cls)) {
                c5609e = new C5614j<>(this, type);
            } else if (Set.class.isAssignableFrom(cls)) {
                c5609e = new C5615k<>(this);
            } else {
                c5609e = Queue.class.isAssignableFrom(cls) ? new C5616l<>(this) : new C5617m<>(this);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                c5609e = new C5618n<>(this);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                c5609e = new C5603b<>(this);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                c5609e = new C5607c<>(this);
            } else if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                Objects.requireNonNull(type2);
                Type typeM12220a = C$Gson$Types.m12220a(type2);
                Class<?> clsM12224e = C$Gson$Types.m12224e(typeM12220a);
                typeM12220a.hashCode();
                if (String.class.isAssignableFrom(clsM12224e)) {
                    c5609e = new C5609e<>(this);
                } else {
                    c5609e = new C5608d<>(this);
                }
            } else {
                c5609e = new C5609e<>(this);
            }
        }
        return c5609e != null ? c5609e : new C5610f(this, cls, type);
    }

    public String toString() {
        return this.f27463a.toString();
    }
}
