package p636z0.p655c.p656a.p658b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: z0.c.a.b.b, reason: use source file name */
/* JADX INFO: compiled from: SafeIterableMap.java */
/* JADX INFO: loaded from: classes.dex */
public class SafeIterableMap<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: f */
    public c<K, V> f35311f;

    /* JADX INFO: renamed from: g */
    public c<K, V> f35312g;

    /* JADX INFO: renamed from: h */
    public WeakHashMap<f<K, V>, Boolean> f35313h = new WeakHashMap<>();

    /* JADX INFO: renamed from: i */
    public int f35314i = 0;

    /* JADX INFO: renamed from: z0.c.a.b.b$a */
    /* JADX INFO: compiled from: SafeIterableMap.java */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p636z0.p655c.p656a.p658b.SafeIterableMap.e
        /* JADX INFO: renamed from: b */
        public c<K, V> mo15033b(c<K, V> cVar) {
            return cVar.f35318i;
        }

        @Override // p636z0.p655c.p656a.p658b.SafeIterableMap.e
        /* JADX INFO: renamed from: c */
        public c<K, V> mo15034c(c<K, V> cVar) {
            return cVar.f35317h;
        }
    }

    /* JADX INFO: renamed from: z0.c.a.b.b$b */
    /* JADX INFO: compiled from: SafeIterableMap.java */
    public static class b<K, V> extends e<K, V> {
        public b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // p636z0.p655c.p656a.p658b.SafeIterableMap.e
        /* JADX INFO: renamed from: b */
        public c<K, V> mo15033b(c<K, V> cVar) {
            return cVar.f35317h;
        }

        @Override // p636z0.p655c.p656a.p658b.SafeIterableMap.e
        /* JADX INFO: renamed from: c */
        public c<K, V> mo15034c(c<K, V> cVar) {
            return cVar.f35318i;
        }
    }

    /* JADX INFO: renamed from: z0.c.a.b.b$c */
    /* JADX INFO: compiled from: SafeIterableMap.java */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: f */
        public final K f35315f;

        /* JADX INFO: renamed from: g */
        public final V f35316g;

        /* JADX INFO: renamed from: h */
        public c<K, V> f35317h;

        /* JADX INFO: renamed from: i */
        public c<K, V> f35318i;

        public c(K k, V v) {
            this.f35315f = k;
            this.f35316g = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f35315f.equals(cVar.f35315f) && this.f35316g.equals(cVar.f35316g);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f35315f;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f35316g;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f35315f.hashCode() ^ this.f35316g.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f35315f + "=" + this.f35316g;
        }
    }

    /* JADX INFO: renamed from: z0.c.a.b.b$d */
    /* JADX INFO: compiled from: SafeIterableMap.java */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* JADX INFO: renamed from: f */
        public c<K, V> f35319f;

        /* JADX INFO: renamed from: g */
        public boolean f35320g = true;

        public d() {
        }

        @Override // p636z0.p655c.p656a.p658b.SafeIterableMap.f
        /* JADX INFO: renamed from: a */
        public void mo15035a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f35319f;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f35318i;
                this.f35319f = cVar3;
                this.f35320g = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f35320g) {
                return SafeIterableMap.this.f35311f != null;
            }
            c<K, V> cVar = this.f35319f;
            return (cVar == null || cVar.f35317h == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f35320g) {
                this.f35320g = false;
                this.f35319f = SafeIterableMap.this.f35311f;
            } else {
                c<K, V> cVar = this.f35319f;
                this.f35319f = cVar != null ? cVar.f35317h : null;
            }
            return this.f35319f;
        }
    }

    /* JADX INFO: renamed from: z0.c.a.b.b$e */
    /* JADX INFO: compiled from: SafeIterableMap.java */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* JADX INFO: renamed from: f */
        public c<K, V> f35322f;

        /* JADX INFO: renamed from: g */
        public c<K, V> f35323g;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f35322f = cVar2;
            this.f35323g = cVar;
        }

        @Override // p636z0.p655c.p656a.p658b.SafeIterableMap.f
        /* JADX INFO: renamed from: a */
        public void mo15035a(c<K, V> cVar) {
            c<K, V> cVarMo15034c = null;
            if (this.f35322f == cVar && cVar == this.f35323g) {
                this.f35323g = null;
                this.f35322f = null;
            }
            c<K, V> cVar2 = this.f35322f;
            if (cVar2 == cVar) {
                this.f35322f = mo15033b(cVar2);
            }
            c<K, V> cVar3 = this.f35323g;
            if (cVar3 == cVar) {
                c<K, V> cVar4 = this.f35322f;
                if (cVar3 != cVar4 && cVar4 != null) {
                    cVarMo15034c = mo15034c(cVar3);
                }
                this.f35323g = cVarMo15034c;
            }
        }

        /* JADX INFO: renamed from: b */
        public abstract c<K, V> mo15033b(c<K, V> cVar);

        /* JADX INFO: renamed from: c */
        public abstract c<K, V> mo15034c(c<K, V> cVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f35323g != null;
        }

        @Override // java.util.Iterator
        public Object next() {
            c<K, V> cVar = this.f35323g;
            c<K, V> cVar2 = this.f35322f;
            this.f35323g = (cVar == cVar2 || cVar2 == null) ? null : mo15034c(cVar);
            return cVar;
        }
    }

    /* JADX INFO: renamed from: z0.c.a.b.b$f */
    /* JADX INFO: compiled from: SafeIterableMap.java */
    public interface f<K, V> {
        /* JADX INFO: renamed from: a */
        void mo15035a(c<K, V> cVar);
    }

    /* JADX INFO: renamed from: c */
    public c<K, V> mo15028c(K k) {
        c<K, V> cVar = this.f35311f;
        while (cVar != null && !cVar.f35315f.equals(k)) {
            cVar = cVar.f35317h;
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        e eVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SafeIterableMap)) {
            return false;
        }
        SafeIterableMap safeIterableMap = (SafeIterableMap) obj;
        if (this.f35314i != safeIterableMap.f35314i) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = safeIterableMap.iterator();
        while (true) {
            eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (eVar.hasNext() || ((e) it2).hasNext()) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public SafeIterableMap<K, V>.d m15031f() {
        SafeIterableMap<K, V>.d dVar = new d();
        this.f35313h.put(dVar, Boolean.FALSE);
        return dVar;
    }

    /* JADX INFO: renamed from: h */
    public c<K, V> m15032h(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.f35314i++;
        c<K, V> cVar2 = this.f35312g;
        if (cVar2 == null) {
            this.f35311f = cVar;
            this.f35312g = cVar;
            return cVar;
        }
        cVar2.f35317h = cVar;
        cVar.f35318i = cVar2;
        this.f35312g = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f35311f, this.f35312g);
        this.f35313h.put(aVar, Boolean.FALSE);
        return aVar;
    }

    /* JADX INFO: renamed from: j */
    public V mo15029j(K k, V v) {
        c<K, V> cVarMo15028c = mo15028c(k);
        if (cVarMo15028c != null) {
            return cVarMo15028c.f35316g;
        }
        m15032h(k, v);
        return null;
    }

    /* JADX INFO: renamed from: m */
    public V mo15030m(K k) {
        c<K, V> cVarMo15028c = mo15028c(k);
        if (cVarMo15028c == null) {
            return null;
        }
        this.f35314i--;
        if (!this.f35313h.isEmpty()) {
            Iterator<f<K, V>> it = this.f35313h.keySet().iterator();
            while (it.hasNext()) {
                it.next().mo15035a(cVarMo15028c);
            }
        }
        c<K, V> cVar = cVarMo15028c.f35318i;
        if (cVar != null) {
            cVar.f35317h = cVarMo15028c.f35317h;
        } else {
            this.f35311f = cVarMo15028c.f35317h;
        }
        c<K, V> cVar2 = cVarMo15028c.f35317h;
        if (cVar2 != null) {
            cVar2.f35318i = cVar;
        } else {
            this.f35312g = cVar;
        }
        cVarMo15028c.f35317h = null;
        cVarMo15028c.f35318i = null;
        return cVarMo15028c.f35316g;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sbM1556G.append("]");
                return sbM1556G.toString();
            }
            sbM1556G.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sbM1556G.append(", ");
            }
        }
    }
}
