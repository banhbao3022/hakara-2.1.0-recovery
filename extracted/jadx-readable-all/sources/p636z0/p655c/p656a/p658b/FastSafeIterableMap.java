package p636z0.p655c.p656a.p658b;

import java.util.HashMap;

/* JADX INFO: renamed from: z0.c.a.b.a, reason: use source file name */
/* JADX INFO: compiled from: FastSafeIterableMap.java */
/* JADX INFO: loaded from: classes.dex */
public class FastSafeIterableMap<K, V> extends SafeIterableMap<K, V> {

    /* JADX INFO: renamed from: j */
    public HashMap<K, SafeIterableMap.c<K, V>> f35310j = new HashMap<>();

    @Override // p636z0.p655c.p656a.p658b.SafeIterableMap
    /* JADX INFO: renamed from: c */
    public SafeIterableMap.c<K, V> mo15028c(K k) {
        return this.f35310j.get(k);
    }

    public boolean contains(K k) {
        return this.f35310j.containsKey(k);
    }

    @Override // p636z0.p655c.p656a.p658b.SafeIterableMap
    /* JADX INFO: renamed from: j */
    public V mo15029j(K k, V v) {
        SafeIterableMap.c<K, V> cVar = this.f35310j.get(k);
        if (cVar != null) {
            return cVar.f35316g;
        }
        this.f35310j.put(k, m15032h(k, v));
        return null;
    }

    @Override // p636z0.p655c.p656a.p658b.SafeIterableMap
    /* JADX INFO: renamed from: m */
    public V mo15030m(K k) {
        V v = (V) super.mo15030m(k);
        this.f35310j.remove(k);
        return v;
    }
}
