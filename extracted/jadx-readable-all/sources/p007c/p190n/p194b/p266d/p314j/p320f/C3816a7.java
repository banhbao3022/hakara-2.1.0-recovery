package p007c.p190n.p194b.p266d.p314j.p320f;

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

/* JADX INFO: renamed from: c.n.b.d.j.f.a7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C3816a7<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f22508f = 0;

    /* JADX INFO: renamed from: g */
    public final int f22509g;

    /* JADX INFO: renamed from: j */
    public boolean f22512j;

    /* JADX INFO: renamed from: k */
    public volatile C3906j7 f22513k;

    /* JADX INFO: renamed from: h */
    public List<C3886h7> f22510h = Collections.emptyList();

    /* JADX INFO: renamed from: i */
    public Map<K, V> f22511i = Collections.emptyMap();

    /* JADX INFO: renamed from: l */
    public Map<K, V> f22514l = Collections.emptyMap();

    public C3816a7(int i, C3836c7 c3836c7) {
        this.f22509g = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m8932a(K k) {
        int size = this.f22510h.size() - 1;
        if (size >= 0) {
            int iCompareTo = k.compareTo(this.f22510h.get(size).f22695f);
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
            int iCompareTo2 = k.compareTo(this.f22510h.get(i2).f22695f);
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
        m8939h();
        int iM8932a = m8932a(k);
        if (iM8932a >= 0) {
            C3886h7 c3886h7 = this.f22510h.get(iM8932a);
            c3886h7.f22697h.m8939h();
            V v2 = c3886h7.f22696g;
            c3886h7.f22696g = v;
            return v2;
        }
        m8939h();
        if (this.f22510h.isEmpty() && !(this.f22510h instanceof ArrayList)) {
            this.f22510h = new ArrayList(this.f22509g);
        }
        int i = -(iM8932a + 1);
        if (i >= this.f22509g) {
            return m8940i().put(k, v);
        }
        int size = this.f22510h.size();
        int i2 = this.f22509g;
        if (size == i2) {
            C3886h7 c3886h7Remove = this.f22510h.remove(i2 - 1);
            m8940i().put(c3886h7Remove.f22695f, c3886h7Remove.f22696g);
        }
        this.f22510h.add(i, new C3886h7(this, k, v));
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final Map.Entry<K, V> m8934c(int i) {
        return this.f22510h.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        m8939h();
        if (!this.f22510h.isEmpty()) {
            this.f22510h.clear();
        }
        if (this.f22511i.isEmpty()) {
            return;
        }
        this.f22511i.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m8932a(comparable) >= 0 || this.f22511i.containsKey(comparable);
    }

    /* JADX INFO: renamed from: d */
    public final V m8935d(int i) {
        m8939h();
        V v = this.f22510h.remove(i).f22696g;
        if (!this.f22511i.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m8940i().entrySet().iterator();
            this.f22510h.add(new C3886h7(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* JADX INFO: renamed from: e */
    public void mo8936e() {
        if (this.f22512j) {
            return;
        }
        this.f22511i = this.f22511i.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f22511i);
        this.f22514l = this.f22514l.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f22514l);
        this.f22512j = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f22513k == null) {
            this.f22513k = new C3906j7(this, null);
        }
        return this.f22513k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3816a7)) {
            return super.equals(obj);
        }
        C3816a7 c3816a7 = (C3816a7) obj;
        int size = size();
        if (size != c3816a7.size()) {
            return false;
        }
        int iM8937f = m8937f();
        if (iM8937f != c3816a7.m8937f()) {
            return entrySet().equals(c3816a7.entrySet());
        }
        for (int i = 0; i < iM8937f; i++) {
            if (!m8934c(i).equals(c3816a7.m8934c(i))) {
                return false;
            }
        }
        if (iM8937f != size) {
            return this.f22511i.equals(c3816a7.f22511i);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final int m8937f() {
        return this.f22510h.size();
    }

    /* JADX INFO: renamed from: g */
    public final Iterable<Map.Entry<K, V>> m8938g() {
        return this.f22511i.isEmpty() ? (Iterable<Map.Entry<K, V>>) C3846d7.f22565b : this.f22511i.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM8932a = m8932a(comparable);
        return iM8932a >= 0 ? this.f22510h.get(iM8932a).f22696g : this.f22511i.get(comparable);
    }

    /* JADX INFO: renamed from: h */
    public final void m8939h() {
        if (this.f22512j) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iM8937f = m8937f();
        int iHashCode = 0;
        for (int i = 0; i < iM8937f; i++) {
            iHashCode += this.f22510h.get(i).hashCode();
        }
        return this.f22511i.size() > 0 ? iHashCode + this.f22511i.hashCode() : iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final SortedMap<K, V> m8940i() {
        m8939h();
        if (this.f22511i.isEmpty() && !(this.f22511i instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f22511i = treeMap;
            this.f22514l = treeMap.descendingMap();
        }
        return (SortedMap) this.f22511i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        m8939h();
        Comparable comparable = (Comparable) obj;
        int iM8932a = m8932a(comparable);
        if (iM8932a >= 0) {
            return m8935d(iM8932a);
        }
        if (this.f22511i.isEmpty()) {
            return null;
        }
        return this.f22511i.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f22511i.size() + this.f22510h.size();
    }
}
