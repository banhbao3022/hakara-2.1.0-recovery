package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class la2<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f16302f = 0;

    /* JADX INFO: renamed from: g */
    public final int f16303g;

    /* JADX INFO: renamed from: j */
    public boolean f16306j;

    /* JADX INFO: renamed from: k */
    public volatile ka2 f16307k;

    /* JADX INFO: renamed from: h */
    public List<ia2> f16304h = Collections.emptyList();

    /* JADX INFO: renamed from: i */
    public Map<K, V> f16305i = Collections.emptyMap();

    /* JADX INFO: renamed from: l */
    public Map<K, V> f16308l = Collections.emptyMap();

    /* JADX INFO: renamed from: a */
    public void mo6616a() {
        if (this.f16306j) {
            return;
        }
        this.f16305i = this.f16305i.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f16305i);
        this.f16308l = this.f16308l.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f16308l);
        this.f16306j = true;
    }

    /* JADX INFO: renamed from: b */
    public final int m7575b() {
        return this.f16304h.size();
    }

    /* JADX INFO: renamed from: c */
    public final Map.Entry<K, V> m7576c(int i) {
        return this.f16304h.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        m7580g();
        if (!this.f16304h.isEmpty()) {
            this.f16304h.clear();
        }
        if (this.f16305i.isEmpty()) {
            return;
        }
        this.f16305i.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m7579f(comparable) >= 0 || this.f16305i.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        m7580g();
        int iM7579f = m7579f(k);
        if (iM7579f >= 0) {
            ia2 ia2Var = this.f16304h.get(iM7579f);
            ia2Var.f15131h.m7580g();
            V v2 = (V) ia2Var.f15130g;
            ia2Var.f15130g = v;
            return v2;
        }
        m7580g();
        if (this.f16304h.isEmpty() && !(this.f16304h instanceof ArrayList)) {
            this.f16304h = new ArrayList(this.f16303g);
        }
        int i = -(iM7579f + 1);
        if (i >= this.f16303g) {
            return m7581h().put(k, v);
        }
        int size = this.f16304h.size();
        int i2 = this.f16303g;
        if (size == i2) {
            ia2 ia2VarRemove = this.f16304h.remove(i2 - 1);
            m7581h().put(ia2VarRemove.f15129f, ia2VarRemove.f15130g);
        }
        this.f16304h.add(i, new ia2(this, k, v));
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final V m7578e(int i) {
        m7580g();
        V v = (V) this.f16304h.remove(i).f15130g;
        if (!this.f16305i.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m7581h().entrySet().iterator();
            List<ia2> list = this.f16304h;
            Map.Entry<K, V> next = it.next();
            list.add(new ia2(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f16307k == null) {
            this.f16307k = new ka2(this);
        }
        return this.f16307k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof la2)) {
            return super.equals(obj);
        }
        la2 la2Var = (la2) obj;
        int size = size();
        if (size != la2Var.size()) {
            return false;
        }
        int iM7575b = m7575b();
        if (iM7575b != la2Var.m7575b()) {
            return ((AbstractSet) entrySet()).equals(la2Var.entrySet());
        }
        for (int i = 0; i < iM7575b; i++) {
            if (!m7576c(i).equals(la2Var.m7576c(i))) {
                return false;
            }
        }
        if (iM7575b != size) {
            return this.f16305i.equals(la2Var.f16305i);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final int m7579f(K k) {
        int size = this.f16304h.size() - 1;
        int i = 0;
        if (size >= 0) {
            int iCompareTo = k.compareTo(this.f16304h.get(size).f15129f);
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int iCompareTo2 = k.compareTo(this.f16304h.get(i2).f15129f);
            if (iCompareTo2 < 0) {
                size = i2 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i2;
                }
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: g */
    public final void m7580g() {
        if (this.f16306j) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM7579f = m7579f(comparable);
        return iM7579f >= 0 ? (V) this.f16304h.get(iM7579f).f15130g : this.f16305i.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    public final SortedMap<K, V> m7581h() {
        m7580g();
        if (this.f16305i.isEmpty() && !(this.f16305i instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f16305i = treeMap;
            this.f16308l = treeMap.descendingMap();
        }
        return (SortedMap) this.f16305i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM7575b = m7575b();
        int iHashCode = 0;
        for (int i = 0; i < iM7575b; i++) {
            iHashCode += this.f16304h.get(i).hashCode();
        }
        return this.f16305i.size() > 0 ? this.f16305i.hashCode() + iHashCode : iHashCode;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        m7580g();
        Comparable comparable = (Comparable) obj;
        int iM7579f = m7579f(comparable);
        if (iM7579f >= 0) {
            return m7578e(iM7579f);
        }
        if (this.f16305i.isEmpty()) {
            return null;
        }
        return this.f16305i.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f16305i.size() + this.f16304h.size();
    }
}
