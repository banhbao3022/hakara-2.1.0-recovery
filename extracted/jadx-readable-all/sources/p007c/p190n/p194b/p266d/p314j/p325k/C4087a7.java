package p007c.p190n.p194b.p266d.p314j.p325k;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: c.n.b.d.j.k.a7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class C4087a7<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f23031f = 0;

    /* JADX INFO: renamed from: g */
    public final int f23032g;

    /* JADX INFO: renamed from: j */
    public boolean f23035j;

    /* JADX INFO: renamed from: k */
    public volatile C4213j7 f23036k;

    /* JADX INFO: renamed from: h */
    public List<C4185h7> f23033h = Collections.emptyList();

    /* JADX INFO: renamed from: i */
    public Map<K, V> f23034i = Collections.emptyMap();

    /* JADX INFO: renamed from: l */
    public Map<K, V> f23037l = Collections.emptyMap();

    public C4087a7(int i, C4115c7 c4115c7) {
        this.f23032g = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m9346a(K k) {
        int size = this.f23033h.size() - 1;
        if (size >= 0) {
            int iCompareTo = k.compareTo(this.f23033h.get(size).f23221f);
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int iCompareTo2 = k.compareTo(this.f23033h.get(i2).f23221f);
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

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final V put(K k, V v) {
        m9353h();
        int iM9346a = m9346a(k);
        if (iM9346a >= 0) {
            C4185h7 c4185h7 = this.f23033h.get(iM9346a);
            c4185h7.f23223h.m9353h();
            V v2 = c4185h7.f23222g;
            c4185h7.f23222g = v;
            return v2;
        }
        m9353h();
        if (this.f23033h.isEmpty() && !(this.f23033h instanceof ArrayList)) {
            this.f23033h = new ArrayList(this.f23032g);
        }
        int i = -(iM9346a + 1);
        if (i >= this.f23032g) {
            return m9354i().put(k, v);
        }
        int size = this.f23033h.size();
        int i2 = this.f23032g;
        if (size == i2) {
            C4185h7 c4185h7Remove = this.f23033h.remove(i2 - 1);
            m9354i().put(c4185h7Remove.f23221f, c4185h7Remove.f23222g);
        }
        this.f23033h.add(i, new C4185h7(this, k, v));
        return null;
    }

    /* JADX INFO: renamed from: c */
    public void mo9348c() {
        if (this.f23035j) {
            return;
        }
        this.f23034i = this.f23034i.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f23034i);
        this.f23037l = this.f23037l.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f23037l);
        this.f23035j = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m9353h();
        if (!this.f23033h.isEmpty()) {
            this.f23033h.clear();
        }
        if (this.f23034i.isEmpty()) {
            return;
        }
        this.f23034i.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m9346a(comparable) >= 0 || this.f23034i.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final Map.Entry<K, V> m9349d(int i) {
        return this.f23033h.get(i);
    }

    /* JADX INFO: renamed from: e */
    public final int m9350e() {
        return this.f23033h.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f23036k == null) {
            this.f23036k = new C4213j7(this, null);
        }
        return this.f23036k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4087a7)) {
            return super.equals(obj);
        }
        C4087a7 c4087a7 = (C4087a7) obj;
        int size = size();
        if (size != c4087a7.size()) {
            return false;
        }
        int iM9350e = m9350e();
        if (iM9350e != c4087a7.m9350e()) {
            return entrySet().equals(c4087a7.entrySet());
        }
        for (int i = 0; i < iM9350e; i++) {
            if (!m9349d(i).equals(c4087a7.m9349d(i))) {
                return false;
            }
        }
        if (iM9350e != size) {
            return this.f23034i.equals(c4087a7.f23034i);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final V m9351f(int i) {
        m9353h();
        V v = this.f23033h.remove(i).f23222g;
        if (!this.f23034i.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m9354i().entrySet().iterator();
            this.f23033h.add(new C4185h7(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* JADX INFO: renamed from: g */
    public final Iterable<Map.Entry<K, V>> m9352g() {
        return this.f23034i.isEmpty() ? (Iterable<Map.Entry<K, V>>) C4129d7.f23115b : this.f23034i.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM9346a = m9346a(comparable);
        return iM9346a >= 0 ? this.f23033h.get(iM9346a).f23222g : this.f23034i.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    public final void m9353h() {
        if (this.f23035j) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM9350e = m9350e();
        int iHashCode = 0;
        for (int i = 0; i < iM9350e; i++) {
            iHashCode += this.f23033h.get(i).hashCode();
        }
        return this.f23034i.size() > 0 ? iHashCode + this.f23034i.hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final SortedMap<K, V> m9354i() {
        m9353h();
        if (this.f23034i.isEmpty() && !(this.f23034i instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f23034i = treeMap;
            this.f23037l = treeMap.descendingMap();
        }
        return (SortedMap) this.f23034i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m9353h();
        Comparable comparable = (Comparable) obj;
        int iM9346a = m9346a(comparable);
        if (iM9346a >= 0) {
            return m9351f(iM9346a);
        }
        if (this.f23034i.isEmpty()) {
            return null;
        }
        return this.f23034i.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f23034i.size() + this.f23033h.size();
    }
}
