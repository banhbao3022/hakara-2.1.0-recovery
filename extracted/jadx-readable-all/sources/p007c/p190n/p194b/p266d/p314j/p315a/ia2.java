package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ia2 implements Map.Entry, Comparable<ia2> {

    /* JADX INFO: renamed from: f */
    public final Comparable f15129f;

    /* JADX INFO: renamed from: g */
    public Object f15130g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ la2 f15131h;

    public ia2(la2 la2Var, Comparable comparable, Object obj) {
        this.f15131h = la2Var;
        this.f15129f = comparable;
        this.f15130g = obj;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ia2 ia2Var) {
        return this.f15129f.compareTo(ia2Var.f15129f);
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
        Comparable comparable = this.f15129f;
        Object key = entry.getKey();
        if (comparable == null) {
            zEquals = key == null;
        } else {
            zEquals = comparable.equals(key);
        }
        if (zEquals) {
            Object obj2 = this.f15130g;
            Object value = entry.getValue();
            if (obj2 == null) {
                zEquals2 = value == null;
            } else {
                zEquals2 = obj2.equals(value);
            }
            if (zEquals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f15129f;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f15130g;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f15129f;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f15130g;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        la2 la2Var = this.f15131h;
        int i = la2.f16302f;
        la2Var.m7580g();
        Object obj2 = this.f15130g;
        this.f15130g = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f15129f);
        String strValueOf2 = String.valueOf(this.f15130g);
        return outline.m1552C(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, "=", strValueOf2);
    }
}
