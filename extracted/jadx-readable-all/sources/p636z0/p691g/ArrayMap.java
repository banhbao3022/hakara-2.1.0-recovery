package p636z0.p691g;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p636z0.p691g.MapCollections.b;
import p636z0.p691g.MapCollections.c;
import p636z0.p691g.MapCollections.e;

/* JADX INFO: renamed from: z0.g.a, reason: use source file name */
/* JADX INFO: compiled from: ArrayMap.java */
/* JADX INFO: loaded from: classes.dex */
public class ArrayMap<K, V> extends SimpleArrayMap<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: m */
    public MapCollections<K, V> f36618m;

    /* JADX INFO: renamed from: z0.g.a$a */
    /* JADX INFO: compiled from: ArrayMap.java */
    public class a extends MapCollections<K, V> {
        public a() {
        }

        @Override // p636z0.p691g.MapCollections
        /* JADX INFO: renamed from: a */
        public void mo15563a() {
            ArrayMap.this.clear();
        }

        @Override // p636z0.p691g.MapCollections
        /* JADX INFO: renamed from: b */
        public Object mo15564b(int i, int i2) {
            return ArrayMap.this.f36666k[(i << 1) + i2];
        }

        @Override // p636z0.p691g.MapCollections
        /* JADX INFO: renamed from: c */
        public Map<K, V> mo15565c() {
            return ArrayMap.this;
        }

        @Override // p636z0.p691g.MapCollections
        /* JADX INFO: renamed from: d */
        public int mo15566d() {
            return ArrayMap.this.f36667l;
        }

        @Override // p636z0.p691g.MapCollections
        /* JADX INFO: renamed from: e */
        public int mo15567e(Object obj) {
            return ArrayMap.this.m15608e(obj);
        }

        @Override // p636z0.p691g.MapCollections
        /* JADX INFO: renamed from: f */
        public int mo15568f(Object obj) {
            return ArrayMap.this.m15610g(obj);
        }

        @Override // p636z0.p691g.MapCollections
        /* JADX INFO: renamed from: g */
        public void mo15569g(K k, V v) {
            ArrayMap.this.put(k, v);
        }

        @Override // p636z0.p691g.MapCollections
        /* JADX INFO: renamed from: h */
        public void mo15570h(int i) {
            ArrayMap.this.mo2036j(i);
        }

        @Override // p636z0.p691g.MapCollections
        /* JADX INFO: renamed from: i */
        public V mo15571i(int i, V v) {
            return ArrayMap.this.mo2037k(i, v);
        }
    }

    public ArrayMap() {
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        MapCollections<K, V> mapCollectionsM15562m = m15562m();
        if (mapCollectionsM15562m.f36646a == null) {
            mapCollectionsM15562m.f36646a = mapCollectionsM15562m.new b();
        }
        return mapCollectionsM15562m.f36646a;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        MapCollections<K, V> mapCollectionsM15562m = m15562m();
        if (mapCollectionsM15562m.f36647b == null) {
            mapCollectionsM15562m.f36647b = mapCollectionsM15562m.new c();
        }
        return mapCollectionsM15562m.f36647b;
    }

    /* JADX INFO: renamed from: m */
    public final MapCollections<K, V> m15562m() {
        if (this.f36618m == null) {
            this.f36618m = new a();
        }
        return this.f36618m;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m15606b(map.size() + this.f36667l);
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        MapCollections<K, V> mapCollectionsM15562m = m15562m();
        if (mapCollectionsM15562m.f36648c == null) {
            mapCollectionsM15562m.f36648c = mapCollectionsM15562m.new e();
        }
        return mapCollectionsM15562m.f36648c;
    }

    public ArrayMap(int i) {
        super(i);
    }

    public ArrayMap(SimpleArrayMap simpleArrayMap) {
        super(simpleArrayMap);
    }
}
