package p636z0.p691g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: z0.g.g, reason: use source file name */
/* JADX INFO: compiled from: MapCollections.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class MapCollections<K, V> {

    /* JADX INFO: renamed from: a */
    public MapCollections<K, V>.b f36646a;

    /* JADX INFO: renamed from: b */
    public MapCollections<K, V>.c f36647b;

    /* JADX INFO: renamed from: c */
    public MapCollections<K, V>.e f36648c;

    /* JADX INFO: renamed from: z0.g.g$a */
    /* JADX INFO: compiled from: MapCollections.java */
    public final class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: f */
        public final int f36649f;

        /* JADX INFO: renamed from: g */
        public int f36650g;

        /* JADX INFO: renamed from: h */
        public int f36651h;

        /* JADX INFO: renamed from: i */
        public boolean f36652i = false;

        public a(int i) {
            this.f36649f = i;
            this.f36650g = MapCollections.this.mo15566d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36651h < this.f36650g;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) MapCollections.this.mo15564b(this.f36651h, this.f36649f);
            this.f36651h++;
            this.f36652i = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f36652i) {
                throw new IllegalStateException();
            }
            int i = this.f36651h - 1;
            this.f36651h = i;
            this.f36650g--;
            this.f36652i = false;
            MapCollections.this.mo15570h(i);
        }
    }

    /* JADX INFO: renamed from: z0.g.g$b */
    /* JADX INFO: compiled from: MapCollections.java */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int iMo15566d = MapCollections.this.mo15566d();
            for (Map.Entry<K, V> entry : collection) {
                MapCollections.this.mo15569g(entry.getKey(), entry.getValue());
            }
            return iMo15566d != MapCollections.this.mo15566d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            MapCollections.this.mo15563a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iMo15567e = MapCollections.this.mo15567e(entry.getKey());
            if (iMo15567e < 0) {
                return false;
            }
            return ContainerHelpers.m15580c(MapCollections.this.mo15564b(iMo15567e, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return MapCollections.m15600j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iMo15566d = MapCollections.this.mo15566d() - 1; iMo15566d >= 0; iMo15566d--) {
                Object objMo15564b = MapCollections.this.mo15564b(iMo15566d, 0);
                Object objMo15564b2 = MapCollections.this.mo15564b(iMo15566d, 1);
                iHashCode += (objMo15564b == null ? 0 : objMo15564b.hashCode()) ^ (objMo15564b2 == null ? 0 : objMo15564b2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return MapCollections.this.mo15566d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return MapCollections.this.mo15566d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: z0.g.g$c */
    /* JADX INFO: compiled from: MapCollections.java */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            MapCollections.this.mo15563a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return MapCollections.this.mo15567e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Map<K, V> mapMo15565c = MapCollections.this.mo15565c();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!mapMo15565c.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return MapCollections.m15600j(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iMo15566d = MapCollections.this.mo15566d() - 1; iMo15566d >= 0; iMo15566d--) {
                Object objMo15564b = MapCollections.this.mo15564b(iMo15566d, 0);
                iHashCode += objMo15564b == null ? 0 : objMo15564b.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return MapCollections.this.mo15566d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iMo15567e = MapCollections.this.mo15567e(obj);
            if (iMo15567e < 0) {
                return false;
            }
            MapCollections.this.mo15570h(iMo15567e);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Map<K, V> mapMo15565c = MapCollections.this.mo15565c();
            int size = mapMo15565c.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                mapMo15565c.remove(it.next());
            }
            return size != mapMo15565c.size();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return MapCollections.m15601k(MapCollections.this.mo15565c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return MapCollections.this.mo15566d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return MapCollections.this.m15602l(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapCollections.this.m15603m(tArr, 0);
        }
    }

    /* JADX INFO: renamed from: z0.g.g$d */
    /* JADX INFO: compiled from: MapCollections.java */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: f */
        public int f36656f;

        /* JADX INFO: renamed from: h */
        public boolean f36658h = false;

        /* JADX INFO: renamed from: g */
        public int f36657g = -1;

        public d() {
            this.f36656f = MapCollections.this.mo15566d() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f36658h) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return ContainerHelpers.m15580c(entry.getKey(), MapCollections.this.mo15564b(this.f36657g, 0)) && ContainerHelpers.m15580c(entry.getValue(), MapCollections.this.mo15564b(this.f36657g, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f36658h) {
                return (K) MapCollections.this.mo15564b(this.f36657g, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f36658h) {
                return (V) MapCollections.this.mo15564b(this.f36657g, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f36657g < this.f36656f;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f36658h) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objMo15564b = MapCollections.this.mo15564b(this.f36657g, 0);
            Object objMo15564b2 = MapCollections.this.mo15564b(this.f36657g, 1);
            return (objMo15564b == null ? 0 : objMo15564b.hashCode()) ^ (objMo15564b2 != null ? objMo15564b2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f36657g++;
            this.f36658h = true;
            return this;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f36658h) {
                throw new IllegalStateException();
            }
            MapCollections.this.mo15570h(this.f36657g);
            this.f36657g--;
            this.f36656f--;
            this.f36658h = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f36658h) {
                return (V) MapCollections.this.mo15571i(this.f36657g, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: z0.g.g$e */
    /* JADX INFO: compiled from: MapCollections.java */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            MapCollections.this.mo15563a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return MapCollections.this.mo15568f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return MapCollections.this.mo15566d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iMo15568f = MapCollections.this.mo15568f(obj);
            if (iMo15568f < 0) {
                return false;
            }
            MapCollections.this.mo15570h(iMo15568f);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int iMo15566d = MapCollections.this.mo15566d();
            int i = 0;
            boolean z = false;
            while (i < iMo15566d) {
                if (collection.contains(MapCollections.this.mo15564b(i, 1))) {
                    MapCollections.this.mo15570h(i);
                    i--;
                    iMo15566d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int iMo15566d = MapCollections.this.mo15566d();
            int i = 0;
            boolean z = false;
            while (i < iMo15566d) {
                if (!collection.contains(MapCollections.this.mo15564b(i, 1))) {
                    MapCollections.this.mo15570h(i);
                    i--;
                    iMo15566d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return MapCollections.this.mo15566d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return MapCollections.this.m15602l(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) MapCollections.this.m15603m(tArr, 1);
        }
    }

    /* JADX INFO: renamed from: j */
    public static <T> boolean m15600j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static <K, V> boolean m15601k(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo15563a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo15564b(int i, int i2);

    /* JADX INFO: renamed from: c */
    public abstract Map<K, V> mo15565c();

    /* JADX INFO: renamed from: d */
    public abstract int mo15566d();

    /* JADX INFO: renamed from: e */
    public abstract int mo15567e(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract int mo15568f(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract void mo15569g(K k, V v);

    /* JADX INFO: renamed from: h */
    public abstract void mo15570h(int i);

    /* JADX INFO: renamed from: i */
    public abstract V mo15571i(int i, V v);

    /* JADX INFO: renamed from: l */
    public Object[] m15602l(int i) {
        int iMo15566d = mo15566d();
        Object[] objArr = new Object[iMo15566d];
        for (int i2 = 0; i2 < iMo15566d; i2++) {
            objArr[i2] = mo15564b(i2, i);
        }
        return objArr;
    }

    /* JADX INFO: renamed from: m */
    public <T> T[] m15603m(T[] tArr, int i) {
        int iMo15566d = mo15566d();
        if (tArr.length < iMo15566d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iMo15566d));
        }
        for (int i2 = 0; i2 < iMo15566d; i2++) {
            tArr[i2] = mo15564b(i2, i);
        }
        if (tArr.length > iMo15566d) {
            tArr[iMo15566d] = null;
        }
        return tArr;
    }
}
