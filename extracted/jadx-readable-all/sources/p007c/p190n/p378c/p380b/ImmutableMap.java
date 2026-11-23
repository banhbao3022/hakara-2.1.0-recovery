package p007c.p190n.p378c.p380b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.c.b.t, reason: use source file name */
/* JADX INFO: compiled from: ImmutableMap.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: f */
    @LazyInit
    public transient ImmutableSet<Map.Entry<K, V>> f26262f;

    /* JADX INFO: renamed from: g */
    @RetainedWith
    @LazyInit
    public transient ImmutableSet<K> f26263g;

    /* JADX INFO: renamed from: h */
    @RetainedWith
    @LazyInit
    public transient ImmutableCollection<V> f26264h;

    /* JADX INFO: renamed from: c.n.c.b.t$a */
    /* JADX INFO: compiled from: ImmutableMap.java */
    public static class a<K, V> {

        /* JADX INFO: renamed from: a */
        public Object[] f26265a;

        /* JADX INFO: renamed from: b */
        public int f26266b;

        /* JADX INFO: renamed from: c */
        public boolean f26267c;

        public a() {
            this(4);
        }

        /* JADX INFO: renamed from: a */
        public ImmutableMap<K, V> m11654a() {
            int i;
            this.f26267c = true;
            int i2 = this.f26266b;
            Object[] objArr = this.f26265a;
            if (i2 == 0) {
                return (RegularImmutableMap) RegularImmutableMap.f26222i;
            }
            int[] iArr = null;
            if (i2 == 1) {
                C4799a.m10998l(objArr[0], objArr[1]);
                return new RegularImmutableMap(null, objArr, 1);
            }
            C4799a.m11002n(i2, objArr.length >> 1);
            int iM11659t = ImmutableSet.m11659t(i2);
            if (i2 == 1) {
                C4799a.m10998l(objArr[0], objArr[1]);
            } else {
                int i3 = iM11659t - 1;
                int[] iArr2 = new int[iM11659t];
                Arrays.fill(iArr2, -1);
                for (int i4 = 0; i4 < i2; i4++) {
                    int i5 = i4 * 2;
                    int i6 = i5 + 0;
                    Object obj = objArr[i6];
                    Object obj2 = objArr[i5 + 1];
                    C4799a.m10998l(obj, obj2);
                    int iM11007p0 = C4799a.m11007p0(obj.hashCode());
                    while (true) {
                        i = iM11007p0 & i3;
                        int i7 = iArr2[i];
                        if (i7 == -1) {
                            break;
                        }
                        if (objArr[i7].equals(obj)) {
                            throw new IllegalArgumentException("Multiple entries with same key: " + obj + "=" + obj2 + " and " + objArr[i7] + "=" + objArr[1 ^ i7]);
                        }
                        iM11007p0 = i + 1;
                    }
                    iArr2[i] = i6;
                }
                iArr = iArr2;
            }
            return new RegularImmutableMap(iArr, objArr, i2);
        }

        /* JADX INFO: renamed from: b */
        public final void m11655b(int i) {
            int i2 = i * 2;
            Object[] objArr = this.f26265a;
            if (i2 > objArr.length) {
                this.f26265a = Arrays.copyOf(objArr, ImmutableCollection.b.m11636a(objArr.length, i2));
                this.f26267c = false;
            }
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: c */
        public a<K, V> m11656c(K k, V v) {
            m11655b(this.f26266b + 1);
            C4799a.m10998l(k, v);
            Object[] objArr = this.f26265a;
            int i = this.f26266b;
            objArr[i * 2] = k;
            objArr[(i * 2) + 1] = v;
            this.f26266b = i + 1;
            return this;
        }

        public a(int i) {
            this.f26265a = new Object[i * 2];
            this.f26266b = 0;
            this.f26267c = false;
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.t$b */
    /* JADX INFO: compiled from: ImmutableMap.java */
    public static class b implements Serializable {

        /* JADX INFO: renamed from: f */
        public final Object[] f26268f;

        /* JADX INFO: renamed from: g */
        public final Object[] f26269g;

        public b(ImmutableMap<?, ?> immutableMap) {
            this.f26268f = new Object[immutableMap.size()];
            this.f26269g = new Object[immutableMap.size()];
            UnmodifiableIterator<Map.Entry<?, ?>> unmodifiableIteratorMo11627s = immutableMap.entrySet().iterator();
            int i = 0;
            while (unmodifiableIteratorMo11627s.hasNext()) {
                Map.Entry<?, ?> next = unmodifiableIteratorMo11627s.next();
                this.f26268f[i] = next.getKey();
                this.f26269g[i] = next.getValue();
                i++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Object readResolve() {
            a aVar = new a(this.f26268f.length);
            int i = 0;
            while (true) {
                Object[] objArr = this.f26268f;
                if (i >= objArr.length) {
                    return aVar.m11654a();
                }
                aVar.m11656c(objArr[i], this.f26269g[i]);
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static <K, V> ImmutableMap<K, V> m11651a(Map<? extends K, ? extends V> map) {
        if ((map instanceof ImmutableMap) && !(map instanceof SortedMap)) {
            ImmutableMap<K, V> immutableMap = (ImmutableMap) map;
            if (!immutableMap.mo11626f()) {
                return immutableMap;
            }
        }
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        boolean z = setEntrySet instanceof Collection;
        a aVar = new a(z ? setEntrySet.size() : 4);
        if (z) {
            aVar.m11655b(setEntrySet.size() + aVar.f26266b);
        }
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVar.m11656c(entry.getKey(), entry.getValue());
        }
        return aVar.m11654a();
    }

    /* JADX INFO: renamed from: b */
    public abstract ImmutableSet<Map.Entry<K, V>> mo11623b();

    /* JADX INFO: renamed from: c */
    public abstract ImmutableSet<K> mo11624c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    /* JADX INFO: renamed from: d */
    public abstract ImmutableCollection<V> mo11625d();

    @Override // java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f26262f;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> immutableSetMo11623b = mo11623b();
        this.f26262f = immutableSetMo11623b;
        return immutableSetMo11623b;
    }

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo11626f();

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.f26264h;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> immutableCollectionMo11625d = mo11625d();
        this.f26264h = immutableCollectionMo11625d;
        return immutableCollectionMo11625d;
    }

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public int hashCode() {
        return Collections2.m11603a(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public Set keySet() {
        ImmutableSet<K> immutableSet = this.f26263g;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> immutableSetMo11624c = mo11624c();
        this.f26263g = immutableSetMo11624c;
        return immutableSetMo11624c;
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        C4799a.m11000m(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }

    public Object writeReplace() {
        return new b(this);
    }
}
