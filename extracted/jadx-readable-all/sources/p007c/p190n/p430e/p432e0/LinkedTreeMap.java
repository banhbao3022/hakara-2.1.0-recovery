package p007c.p190n.p430e.p432e0;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: c.n.e.e0.s, reason: use source file name */
/* JADX INFO: compiled from: LinkedTreeMap.java */
/* JADX INFO: loaded from: classes.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: f */
    public static final Comparator<Comparable> f27486f = new a();

    /* JADX INFO: renamed from: g */
    public Comparator<? super K> f27487g;

    /* JADX INFO: renamed from: h */
    public e<K, V> f27488h;

    /* JADX INFO: renamed from: i */
    public int f27489i;

    /* JADX INFO: renamed from: j */
    public int f27490j;

    /* JADX INFO: renamed from: k */
    public final e<K, V> f27491k;

    /* JADX INFO: renamed from: l */
    public LinkedTreeMap<K, V>.b f27492l;

    /* JADX INFO: renamed from: m */
    public LinkedTreeMap<K, V>.c f27493m;

    /* JADX INFO: renamed from: c.n.e.e0.s$a */
    /* JADX INFO: compiled from: LinkedTreeMap.java */
    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.s$b */
    /* JADX INFO: compiled from: LinkedTreeMap.java */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: c.n.e.e0.s$b$a */
        /* JADX INFO: compiled from: LinkedTreeMap.java */
        public class a extends LinkedTreeMap<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            @Override // java.util.Iterator
            public Object next() {
                return m12289a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && LinkedTreeMap.this.m12282b((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> eVarM12282b;
            if (!(obj instanceof Map.Entry) || (eVarM12282b = LinkedTreeMap.this.m12282b((Map.Entry) obj)) == null) {
                return false;
            }
            LinkedTreeMap.this.m12285e(eVarM12282b, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.f27489i;
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.s$c */
    /* JADX INFO: compiled from: LinkedTreeMap.java */
    public final class c extends AbstractSet<K> {

        /* JADX INFO: renamed from: c.n.e.e0.s$c$a */
        /* JADX INFO: compiled from: LinkedTreeMap.java */
        public class a extends LinkedTreeMap<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return m12289a().f27505k;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedTreeMap.this.m12283c(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            e<K, V> eVarM12283c = linkedTreeMap.m12283c(obj);
            if (eVarM12283c != null) {
                linkedTreeMap.m12285e(eVarM12283c, true);
            }
            return eVarM12283c != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedTreeMap.this.f27489i;
        }
    }

    /* JADX INFO: renamed from: c.n.e.e0.s$d */
    /* JADX INFO: compiled from: LinkedTreeMap.java */
    public abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: f */
        public e<K, V> f27496f;

        /* JADX INFO: renamed from: g */
        public e<K, V> f27497g = null;

        /* JADX INFO: renamed from: h */
        public int f27498h;

        public d() {
            this.f27496f = LinkedTreeMap.this.f27491k.f27503i;
            this.f27498h = LinkedTreeMap.this.f27490j;
        }

        /* JADX INFO: renamed from: a */
        public final e<K, V> m12289a() {
            e<K, V> eVar = this.f27496f;
            LinkedTreeMap linkedTreeMap = LinkedTreeMap.this;
            if (eVar == linkedTreeMap.f27491k) {
                throw new NoSuchElementException();
            }
            if (linkedTreeMap.f27490j != this.f27498h) {
                throw new ConcurrentModificationException();
            }
            this.f27496f = eVar.f27503i;
            this.f27497g = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f27496f != LinkedTreeMap.this.f27491k;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f27497g;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            LinkedTreeMap.this.m12285e(eVar, true);
            this.f27497g = null;
            this.f27498h = LinkedTreeMap.this.f27490j;
        }
    }

    public LinkedTreeMap() {
        this(f27486f);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    /* JADX INFO: renamed from: a */
    public e<K, V> m12281a(K k, boolean z) {
        int iCompareTo;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f27487g;
        e<K, V> eVar2 = this.f27488h;
        if (eVar2 != null) {
            Comparable comparable = comparator == f27486f ? (Comparable) k : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f27505k) : comparator.compare(k, eVar2.f27505k);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f27501g : eVar2.f27502h;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f27491k;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k, eVar4, eVar4.f27504j);
            if (iCompareTo < 0) {
                eVar2.f27501g = eVar;
            } else {
                eVar2.f27502h = eVar;
            }
            m12284d(eVar2, true);
        } else {
            if (comparator == f27486f && !(k instanceof Comparable)) {
                throw new ClassCastException(k.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar2, k, eVar4, eVar4.f27504j);
            this.f27488h = eVar;
        }
        this.f27489i++;
        this.f27490j++;
        return eVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    /* JADX INFO: renamed from: b */
    public e<K, V> m12282b(Map.Entry<?, ?> entry) {
        boolean z;
        e<K, V> eVarM12283c = m12283c(entry.getKey());
        if (eVarM12283c != null) {
            V v = eVarM12283c.f27506l;
            Object value = entry.getValue();
            z = v == value || (v != null && v.equals(value));
        }
        if (z) {
            return eVarM12283c;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public e<K, V> m12283c(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return m12281a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f27488h = null;
        this.f27489i = 0;
        this.f27490j++;
        e<K, V> eVar = this.f27491k;
        eVar.f27504j = eVar;
        eVar.f27503i = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return m12283c(obj) != null;
    }

    /* JADX INFO: renamed from: d */
    public final void m12284d(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f27501g;
            e<K, V> eVar3 = eVar.f27502h;
            int i = eVar2 != null ? eVar2.f27507m : 0;
            int i2 = eVar3 != null ? eVar3.f27507m : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                e<K, V> eVar4 = eVar3.f27501g;
                e<K, V> eVar5 = eVar3.f27502h;
                int i4 = (eVar4 != null ? eVar4.f27507m : 0) - (eVar5 != null ? eVar5.f27507m : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    m12287g(eVar);
                } else {
                    m12288h(eVar3);
                    m12287g(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                e<K, V> eVar6 = eVar2.f27501g;
                e<K, V> eVar7 = eVar2.f27502h;
                int i5 = (eVar6 != null ? eVar6.f27507m : 0) - (eVar7 != null ? eVar7.f27507m : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    m12288h(eVar);
                } else {
                    m12287g(eVar2);
                    m12288h(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                eVar.f27507m = i + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f27507m = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f27500f;
        }
    }

    /* JADX INFO: renamed from: e */
    public void m12285e(e<K, V> eVar, boolean z) {
        e<K, V> eVar2;
        e<K, V> eVar3;
        int i;
        if (z) {
            e<K, V> eVar4 = eVar.f27504j;
            eVar4.f27503i = eVar.f27503i;
            eVar.f27503i.f27504j = eVar4;
        }
        e<K, V> eVar5 = eVar.f27501g;
        e<K, V> eVar6 = eVar.f27502h;
        e<K, V> eVar7 = eVar.f27500f;
        int i2 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                m12286f(eVar, eVar5);
                eVar.f27501g = null;
            } else if (eVar6 != null) {
                m12286f(eVar, eVar6);
                eVar.f27502h = null;
            } else {
                m12286f(eVar, null);
            }
            m12284d(eVar7, false);
            this.f27489i--;
            this.f27490j++;
            return;
        }
        if (eVar5.f27507m > eVar6.f27507m) {
            e<K, V> eVar8 = eVar5.f27502h;
            while (true) {
                e<K, V> eVar9 = eVar8;
                eVar3 = eVar5;
                eVar5 = eVar9;
                if (eVar5 == null) {
                    break;
                } else {
                    eVar8 = eVar5.f27502h;
                }
            }
        } else {
            e<K, V> eVar10 = eVar6.f27501g;
            while (true) {
                eVar2 = eVar6;
                eVar6 = eVar10;
                if (eVar6 == null) {
                    break;
                } else {
                    eVar10 = eVar6.f27501g;
                }
            }
            eVar3 = eVar2;
        }
        m12285e(eVar3, false);
        e<K, V> eVar11 = eVar.f27501g;
        if (eVar11 != null) {
            i = eVar11.f27507m;
            eVar3.f27501g = eVar11;
            eVar11.f27500f = eVar3;
            eVar.f27501g = null;
        } else {
            i = 0;
        }
        e<K, V> eVar12 = eVar.f27502h;
        if (eVar12 != null) {
            i2 = eVar12.f27507m;
            eVar3.f27502h = eVar12;
            eVar12.f27500f = eVar3;
            eVar.f27502h = null;
        }
        eVar3.f27507m = Math.max(i, i2) + 1;
        m12286f(eVar, eVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedTreeMap<K, V>.b bVar = this.f27492l;
        if (bVar != null) {
            return bVar;
        }
        LinkedTreeMap<K, V>.b bVar2 = new b();
        this.f27492l = bVar2;
        return bVar2;
    }

    /* JADX INFO: renamed from: f */
    public final void m12286f(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f27500f;
        eVar.f27500f = null;
        if (eVar2 != null) {
            eVar2.f27500f = eVar3;
        }
        if (eVar3 == null) {
            this.f27488h = eVar2;
        } else if (eVar3.f27501g == eVar) {
            eVar3.f27501g = eVar2;
        } else {
            eVar3.f27502h = eVar2;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m12287g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f27501g;
        e<K, V> eVar3 = eVar.f27502h;
        e<K, V> eVar4 = eVar3.f27501g;
        e<K, V> eVar5 = eVar3.f27502h;
        eVar.f27502h = eVar4;
        if (eVar4 != null) {
            eVar4.f27500f = eVar;
        }
        m12286f(eVar, eVar3);
        eVar3.f27501g = eVar;
        eVar.f27500f = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f27507m : 0, eVar4 != null ? eVar4.f27507m : 0) + 1;
        eVar.f27507m = iMax;
        eVar3.f27507m = Math.max(iMax, eVar5 != null ? eVar5.f27507m : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> eVarM12283c = m12283c(obj);
        if (eVarM12283c != null) {
            return eVarM12283c.f27506l;
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m12288h(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f27501g;
        e<K, V> eVar3 = eVar.f27502h;
        e<K, V> eVar4 = eVar2.f27501g;
        e<K, V> eVar5 = eVar2.f27502h;
        eVar.f27501g = eVar5;
        if (eVar5 != null) {
            eVar5.f27500f = eVar;
        }
        m12286f(eVar, eVar2);
        eVar2.f27502h = eVar;
        eVar.f27500f = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f27507m : 0, eVar5 != null ? eVar5.f27507m : 0) + 1;
        eVar.f27507m = iMax;
        eVar2.f27507m = Math.max(iMax, eVar4 != null ? eVar4.f27507m : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedTreeMap<K, V>.c cVar = this.f27493m;
        if (cVar != null) {
            return cVar;
        }
        LinkedTreeMap<K, V>.c cVar2 = new c();
        this.f27493m = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        e<K, V> eVarM12281a = m12281a(k, true);
        V v2 = eVarM12281a.f27506l;
        eVarM12281a.f27506l = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> eVarM12283c = m12283c(obj);
        if (eVarM12283c != null) {
            m12285e(eVarM12283c, true);
        }
        if (eVarM12283c != null) {
            return eVarM12283c.f27506l;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f27489i;
    }

    public LinkedTreeMap(Comparator<? super K> comparator) {
        this.f27489i = 0;
        this.f27490j = 0;
        this.f27491k = new e<>();
        this.f27487g = comparator == null ? f27486f : comparator;
    }

    /* JADX INFO: renamed from: c.n.e.e0.s$e */
    /* JADX INFO: compiled from: LinkedTreeMap.java */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: f */
        public e<K, V> f27500f;

        /* JADX INFO: renamed from: g */
        public e<K, V> f27501g;

        /* JADX INFO: renamed from: h */
        public e<K, V> f27502h;

        /* JADX INFO: renamed from: i */
        public e<K, V> f27503i;

        /* JADX INFO: renamed from: j */
        public e<K, V> f27504j;

        /* JADX INFO: renamed from: k */
        public final K f27505k;

        /* JADX INFO: renamed from: l */
        public V f27506l;

        /* JADX INFO: renamed from: m */
        public int f27507m;

        public e() {
            this.f27505k = null;
            this.f27504j = this;
            this.f27503i = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f27505k;
            if (k == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k.equals(entry.getKey())) {
                return false;
            }
            V v = this.f27506l;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f27505k;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f27506l;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.f27505k;
            int iHashCode = k == null ? 0 : k.hashCode();
            V v = this.f27506l;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f27506l;
            this.f27506l = v;
            return v2;
        }

        public String toString() {
            return this.f27505k + "=" + this.f27506l;
        }

        public e(e<K, V> eVar, K k, e<K, V> eVar2, e<K, V> eVar3) {
            this.f27500f = eVar;
            this.f27505k = k;
            this.f27507m = 1;
            this.f27503i = eVar2;
            this.f27504j = eVar3;
            eVar3.f27503i = this;
            eVar2.f27504j = this;
        }
    }
}
