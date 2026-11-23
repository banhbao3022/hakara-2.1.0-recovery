package p007c.p190n.p194b.p266d.p314j.p320f;

import java.util.Map;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: c.n.b.d.j.f.h7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3886h7<K, V> implements Comparable<C3886h7>, Map.Entry<K, V> {

    /* JADX INFO: Incorrect field signature: TK; */
    /* JADX INFO: renamed from: f */
    public final Comparable f22695f;

    /* JADX INFO: renamed from: g */
    public V f22696g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3816a7 f22697h;

    public C3886h7(C3816a7 c3816a7, Map.Entry<K, V> entry) {
        Comparable comparable = (Comparable) entry.getKey();
        V value = entry.getValue();
        this.f22697h = c3816a7;
        this.f22695f = comparable;
        this.f22696g = value;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C3886h7 c3886h7) {
        return this.f22695f.compareTo(c3886h7.f22695f);
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
        Comparable comparable = this.f22695f;
        Object key = entry.getKey();
        if (comparable == null) {
            zEquals = key == null;
        } else {
            zEquals = comparable.equals(key);
        }
        if (zEquals) {
            V v = this.f22696g;
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
        return this.f22695f;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.f22696g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f22695f;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        V v = this.f22696g;
        return iHashCode ^ (v != null ? v.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        C3816a7 c3816a7 = this.f22697h;
        int i = C3816a7.f22508f;
        c3816a7.m8939h();
        V v2 = this.f22696g;
        this.f22696g = v;
        return v2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f22695f);
        String strValueOf2 = String.valueOf(this.f22696g);
        return outline.m1587i(strValueOf2.length() + strValueOf.length() + 1, strValueOf, "=", strValueOf2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3886h7(C3816a7 c3816a7, K k, V v) {
        this.f22697h = c3816a7;
        this.f22695f = k;
        this.f22696g = v;
    }
}
