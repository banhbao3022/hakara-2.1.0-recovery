package p007c.p190n.p194b.p266d.p314j.p325k;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: c.n.b.d.j.k.f6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4156f6<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: f */
    public static final C4156f6 f23158f;

    /* JADX INFO: renamed from: g */
    public boolean f23159g;

    static {
        C4156f6 c4156f6 = new C4156f6();
        f23158f = c4156f6;
        c4156f6.f23159g = false;
    }

    public C4156f6() {
        this.f23159g = true;
    }

    /* JADX INFO: renamed from: a */
    public static int m9623a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC4155f5) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = C4127d5.f23112a;
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
    public final void m9624b() {
        if (!this.f23159g) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m9624b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this == map) {
                z = true;
            } else {
                if (size() == map.size()) {
                    Iterator<Map.Entry<K, V>> it = entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry<K, V> next = it.next();
                            if (map.containsKey(next.getKey())) {
                                V value = next.getValue();
                                Object obj2 = map.get(next.getKey());
                                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                                }
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM9623a = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iM9623a += m9623a(entry.getValue()) ^ m9623a(entry.getKey());
        }
        return iM9623a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        m9624b();
        Charset charset = C4127d5.f23112a;
        Objects.requireNonNull(k);
        Objects.requireNonNull(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m9624b();
        for (K k : map.keySet()) {
            Charset charset = C4127d5.f23112a;
            Objects.requireNonNull(k);
            Objects.requireNonNull(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m9624b();
        return (V) super.remove(obj);
    }

    public C4156f6(Map<K, V> map) {
        super(map);
        this.f23159g = true;
    }
}
