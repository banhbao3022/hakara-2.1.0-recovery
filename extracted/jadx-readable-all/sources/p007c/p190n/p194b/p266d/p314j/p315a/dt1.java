package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class dt1<K, V> extends xs1<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: i */
    public final transient vs1<K, V> f13382i;

    /* JADX INFO: renamed from: j */
    public final transient Object[] f13383j;

    /* JADX INFO: renamed from: k */
    public final transient int f13384k;

    public dt1(vs1 vs1Var, Object[] objArr, int i) {
        this.f13382i = vs1Var;
        this.f13383j = objArr;
        this.f13384k = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: c */
    public final kt1<Map.Entry<K, V>> iterator() {
        return mo6685m().listIterator(0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f13382i.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xs1, p007c.p190n.p194b.p266d.p314j.p315a.qs1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return mo6685m().listIterator(0);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: s */
    public final int mo6095s(Object[] objArr, int i) {
        return mo6685m().mo6095s(objArr, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f13384k;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xs1
    /* JADX INFO: renamed from: x */
    public final ts1<Map.Entry<K, V>> mo6519x() {
        return new ct1(this);
    }
}
