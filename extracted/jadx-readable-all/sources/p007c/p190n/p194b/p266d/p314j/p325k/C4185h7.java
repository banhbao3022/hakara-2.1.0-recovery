package p007c.p190n.p194b.p266d.p314j.p325k;

import java.util.Map;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: c.n.b.d.j.k.h7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4185h7<K, V> implements Comparable<C4185h7>, Map.Entry<K, V> {

    /* JADX INFO: Incorrect field signature: TK; */
    /* JADX INFO: renamed from: f */
    public final Comparable f23221f;

    /* JADX INFO: renamed from: g */
    public V f23222g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4087a7 f23223h;

    public C4185h7(C4087a7 c4087a7, Map.Entry<K, V> entry) {
        Comparable comparable = (Comparable) entry.getKey();
        V value = entry.getValue();
        this.f23223h = c4087a7;
        this.f23221f = comparable;
        this.f23222g = value;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C4185h7 c4185h7) {
        return this.f23221f.compareTo(c4185h7.f23221f);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.f23221f;
        Object key = entry.getKey();
        if (comparable == null) {
            zEquals = key == null;
        } else {
            zEquals = comparable.equals(key);
        }
        if (zEquals) {
            V v = this.f23222g;
            Object value = entry.getValue();
            if (v == null) {
                zEquals2 = value == null;
            } else {
                zEquals2 = v.equals(value);
            }
            if (zEquals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.f23221f;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f23222g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f23221f;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.f23222g;
        return iHashCode ^ (v != null ? v.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        C4087a7 c4087a7 = this.f23223h;
        int i = C4087a7.f23031f;
        c4087a7.m9353h();
        V v2 = this.f23222g;
        this.f23222g = v;
        return v2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f23221f);
        String strValueOf2 = String.valueOf(this.f23222g);
        return outline.m1587i(strValueOf2.length() + strValueOf.length() + 1, strValueOf, "=", strValueOf2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4185h7(C4087a7 c4087a7, K k, V v) {
        this.f23223h = c4087a7;
        this.f23221f = k;
        this.f23222g = v;
    }
}
