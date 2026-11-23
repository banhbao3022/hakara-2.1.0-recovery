package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vs1<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: f */
    public transient xs1<Map.Entry<K, V>> f20923f;

    /* JADX INFO: renamed from: g */
    public transient xs1<K> f20924g;

    /* JADX INFO: renamed from: h */
    public transient qs1<V> f20925h;

    /* JADX INFO: renamed from: a */
    public static <K, V> vs1<K, V> m8588a(K k, V v) {
        C2622l.m5336Z0(k, v);
        return gt1.m7029e(1, new Object[]{k, v});
    }

    /* JADX INFO: renamed from: b */
    public static <K, V> us1<K, V> m8589b(int i) {
        return new us1<>(7);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final xs1<Map.Entry<K, V>> entrySet() {
        xs1<Map.Entry<K, V>> xs1Var = this.f20923f;
        if (xs1Var != null) {
            return xs1Var;
        }
        gt1 gt1Var = (gt1) this;
        dt1 dt1Var = new dt1(gt1Var, gt1Var.f14678k, gt1Var.f14679l);
        this.f20923f = dt1Var;
        return dt1Var;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final qs1<V> values() {
        qs1<V> qs1Var = this.f20925h;
        if (qs1Var != null) {
            return qs1Var;
        }
        gt1 gt1Var = (gt1) this;
        ft1 ft1Var = new ft1(gt1Var.f14678k, 1, gt1Var.f14679l);
        this.f20925h = ft1Var;
        return ft1Var;
    }

    @Override // java.util.Map
    public final boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return C2622l.m5380i0(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((gt1) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        xs1<K> xs1Var = this.f20924g;
        if (xs1Var != null) {
            return xs1Var;
        }
        gt1 gt1Var = (gt1) this;
        et1 et1Var = new et1(gt1Var, new ft1(gt1Var.f14678k, 0, gt1Var.f14679l));
        this.f20924g = et1Var;
        return et1Var;
    }

    @Override // java.util.Map
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
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = ((gt1) this).size();
        C2622l.m5229B1(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
