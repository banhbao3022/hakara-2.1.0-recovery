package p007c.p085g.p086a.p112s;

import p636z0.p691g.ArrayMap;
import p636z0.p691g.SimpleArrayMap;

/* JADX INFO: renamed from: c.g.a.s.b, reason: use source file name */
/* JADX INFO: compiled from: CachedHashCodeArrayMap.java */
/* JADX INFO: loaded from: classes.dex */
public final class CachedHashCodeArrayMap<K, V> extends ArrayMap<K, V> {

    /* JADX INFO: renamed from: n */
    public int f3810n;

    @Override // p636z0.p691g.SimpleArrayMap, java.util.Map
    public void clear() {
        this.f3810n = 0;
        super.clear();
    }

    @Override // p636z0.p691g.SimpleArrayMap, java.util.Map
    public int hashCode() {
        if (this.f3810n == 0) {
            this.f3810n = super.hashCode();
        }
        return this.f3810n;
    }

    @Override // p636z0.p691g.SimpleArrayMap
    /* JADX INFO: renamed from: i */
    public void mo2035i(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this.f3810n = 0;
        super.mo2035i(simpleArrayMap);
    }

    @Override // p636z0.p691g.SimpleArrayMap
    /* JADX INFO: renamed from: j */
    public V mo2036j(int i) {
        this.f3810n = 0;
        return (V) super.mo2036j(i);
    }

    @Override // p636z0.p691g.SimpleArrayMap
    /* JADX INFO: renamed from: k */
    public V mo2037k(int i, V v) {
        this.f3810n = 0;
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f36666k;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    @Override // p636z0.p691g.SimpleArrayMap, java.util.Map
    public V put(K k, V v) {
        this.f3810n = 0;
        return (V) super.put(k, v);
    }
}
