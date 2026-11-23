package p007c.p190n.p194b.p266d.p314j.p320f;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: c.n.b.d.j.f.c6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3835c6<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: f */
    public boolean f22533f;

    static {
        new C3835c6().f22533f = false;
    }

    public C3835c6() {
        this.f22533f = true;
    }

    /* JADX INFO: renamed from: a */
    public static int m9008a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC3834c5) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        Charset charset = C3814a5.f22506a;
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
    public final void m9009b() {
        if (!this.f22533f) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m9009b();
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
        int iM9008a = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iM9008a += m9008a(entry.getValue()) ^ m9008a(entry.getKey());
        }
        return iM9008a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        m9009b();
        Charset charset = C3814a5.f22506a;
        Objects.requireNonNull(k);
        Objects.requireNonNull(v);
        return (V) super.put(k, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        m9009b();
        for (K k : map.keySet()) {
            Charset charset = C3814a5.f22506a;
            Objects.requireNonNull(k);
            Objects.requireNonNull(map.get(k));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m9009b();
        return (V) super.remove(obj);
    }

    public C3835c6(Map<K, V> map) {
        super(map);
        this.f22533f = true;
    }
}
