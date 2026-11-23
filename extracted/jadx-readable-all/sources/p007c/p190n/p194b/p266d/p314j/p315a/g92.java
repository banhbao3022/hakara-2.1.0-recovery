package p007c.p190n.p194b.p266d.p314j.p315a;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class g92<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: f */
    public static final g92 f14523f;

    /* JADX INFO: renamed from: g */
    public boolean f14524g;

    static {
        g92 g92Var = new g92();
        f14523f = g92Var;
        g92Var.f14524g = false;
    }

    public g92() {
        this.f14524g = true;
    }

    /* JADX INFO: renamed from: a */
    public static <K, V> g92<K, V> m6978a() {
        return f14523f;
    }

    /* JADX INFO: renamed from: d */
    public static int m6979d(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof i82) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = p82.f17879a;
        int length = bArr.length;
        int i = length;
        for (int i2 = 0; i2 < 0 + length; i2++) {
            i = (i * 31) + bArr[i2];
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: renamed from: b */
    public final g92<K, V> m6980b() {
        return isEmpty() ? new g92<>() : new g92<>(this);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m6981e();
        super.clear();
    }

    /* JADX INFO: renamed from: e */
    public final void m6981e() {
        if (!this.f14524g) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            V value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM6979d = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iM6979d += m6979d(entry.getValue()) ^ m6979d(entry.getKey());
        }
        return iM6979d;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        m6981e();
        Charset charset = p82.f17879a;
        Objects.requireNonNull(k);
        Objects.requireNonNull(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m6981e();
        for (K k : map.keySet()) {
            Charset charset = p82.f17879a;
            Objects.requireNonNull(k);
            Objects.requireNonNull(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m6981e();
        return (V) super.remove(obj);
    }

    public g92(Map<K, V> map) {
        super(map);
        this.f14524g = true;
    }
}
