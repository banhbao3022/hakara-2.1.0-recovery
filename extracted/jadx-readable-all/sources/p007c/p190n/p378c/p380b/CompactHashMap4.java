package p007c.p190n.p378c.p380b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.c.b.l, reason: use source file name */
/* JADX INFO: compiled from: CompactHashMap.java */
/* JADX INFO: loaded from: classes.dex */
public class CompactHashMap4<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f26196f = 0;

    /* JADX INFO: renamed from: g */
    @MonotonicNonNullDecl
    public transient int[] f26197g;

    /* JADX INFO: renamed from: h */
    @MonotonicNonNullDecl
    public transient long[] f26198h;

    /* JADX INFO: renamed from: i */
    @MonotonicNonNullDecl
    public transient Object[] f26199i;

    /* JADX INFO: renamed from: j */
    @MonotonicNonNullDecl
    public transient Object[] f26200j;

    /* JADX INFO: renamed from: k */
    public transient float f26201k;

    /* JADX INFO: renamed from: l */
    public transient int f26202l;

    /* JADX INFO: renamed from: m */
    public transient int f26203m;

    /* JADX INFO: renamed from: n */
    public transient int f26204n;

    /* JADX INFO: renamed from: o */
    @MonotonicNonNullDecl
    public transient Set<K> f26205o;

    /* JADX INFO: renamed from: p */
    @MonotonicNonNullDecl
    public transient Set<Map.Entry<K, V>> f26206p;

    /* JADX INFO: renamed from: q */
    @MonotonicNonNullDecl
    public transient Collection<V> f26207q;

    /* JADX INFO: renamed from: c.n.c.b.l$a */
    /* JADX INFO: compiled from: CompactHashMap.java */
    public class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap4.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iM11614d = CompactHashMap4.this.m11614d(entry.getKey());
            return iM11614d != -1 && C4799a.m10952C(CompactHashMap4.this.f26200j[iM11614d], entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            CompactHashMap4 compactHashMap4 = CompactHashMap4.this;
            Objects.requireNonNull(compactHashMap4);
            return new CompactHashMap2(compactHashMap4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iM11614d = CompactHashMap4.this.m11614d(entry.getKey());
            if (iM11614d == -1 || !C4799a.m10952C(CompactHashMap4.this.f26200j[iM11614d], entry.getValue())) {
                return false;
            }
            CompactHashMap4.m11610a(CompactHashMap4.this, iM11614d);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap4.this.f26204n;
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.l$b */
    /* JADX INFO: compiled from: CompactHashMap.java */
    public abstract class b<T> implements Iterator<T> {

        /* JADX INFO: renamed from: f */
        public int f26209f;

        /* JADX INFO: renamed from: g */
        public int f26210g;

        /* JADX INFO: renamed from: h */
        public int f26211h;

        public b(CompactHashMap compactHashMap) {
            this.f26209f = CompactHashMap4.this.f26202l;
            this.f26210g = CompactHashMap4.this.isEmpty() ? -1 : 0;
            this.f26211h = -1;
        }

        /* JADX INFO: renamed from: a */
        public abstract T mo11606a(int i);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26210g >= 0;
        }

        @Override // java.util.Iterator
        public T next() {
            if (CompactHashMap4.this.f26202l != this.f26209f) {
                throw new ConcurrentModificationException();
            }
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i = this.f26210g;
            this.f26211h = i;
            T tMo11606a = mo11606a(i);
            CompactHashMap4 compactHashMap4 = CompactHashMap4.this;
            int i2 = this.f26210g + 1;
            if (i2 >= compactHashMap4.f26204n) {
                i2 = -1;
            }
            this.f26210g = i2;
            return tMo11606a;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (CompactHashMap4.this.f26202l != this.f26209f) {
                throw new ConcurrentModificationException();
            }
            C4799a.m11006p(this.f26211h >= 0);
            this.f26209f++;
            CompactHashMap4.m11610a(CompactHashMap4.this, this.f26211h);
            CompactHashMap4 compactHashMap4 = CompactHashMap4.this;
            int i = this.f26210g;
            Objects.requireNonNull(compactHashMap4);
            this.f26210g = i - 1;
            this.f26211h = -1;
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.l$c */
    /* JADX INFO: compiled from: CompactHashMap.java */
    public class c extends AbstractSet<K> {
        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            CompactHashMap4.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return CompactHashMap4.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            CompactHashMap4 compactHashMap4 = CompactHashMap4.this;
            Objects.requireNonNull(compactHashMap4);
            return new CompactHashMap(compactHashMap4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@NullableDecl Object obj) {
            int iM11614d = CompactHashMap4.this.m11614d(obj);
            if (iM11614d == -1) {
                return false;
            }
            CompactHashMap4.m11610a(CompactHashMap4.this, iM11614d);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return CompactHashMap4.this.f26204n;
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.l$d */
    /* JADX INFO: compiled from: CompactHashMap.java */
    public final class d extends AbstractMapEntry<K, V> {

        /* JADX INFO: renamed from: f */
        @NullableDecl
        public final K f26214f;

        /* JADX INFO: renamed from: g */
        public int f26215g;

        public d(int i) {
            this.f26214f = (K) CompactHashMap4.this.f26199i[i];
            this.f26215g = i;
        }

        /* JADX INFO: renamed from: a */
        public final void m11617a() {
            int i = this.f26215g;
            if (i != -1) {
                CompactHashMap4 compactHashMap4 = CompactHashMap4.this;
                if (i < compactHashMap4.f26204n && C4799a.m10952C(this.f26214f, compactHashMap4.f26199i[i])) {
                    return;
                }
            }
            CompactHashMap4 compactHashMap5 = CompactHashMap4.this;
            K k = this.f26214f;
            int i2 = CompactHashMap4.f26196f;
            this.f26215g = compactHashMap5.m11614d(k);
        }

        @Override // p007c.p190n.p378c.p380b.AbstractMapEntry, java.util.Map.Entry
        public K getKey() {
            return this.f26214f;
        }

        @Override // p007c.p190n.p378c.p380b.AbstractMapEntry, java.util.Map.Entry
        public V getValue() {
            m11617a();
            int i = this.f26215g;
            if (i == -1) {
                return null;
            }
            return (V) CompactHashMap4.this.f26200j[i];
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            m11617a();
            int i = this.f26215g;
            if (i == -1) {
                CompactHashMap4.this.put(this.f26214f, v);
                return null;
            }
            Object[] objArr = CompactHashMap4.this.f26200j;
            V v2 = (V) objArr[i];
            objArr[i] = v;
            return v2;
        }
    }

    /* JADX INFO: renamed from: c.n.c.b.l$e */
    /* JADX INFO: compiled from: CompactHashMap.java */
    public class e extends AbstractCollection<V> {
        public e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            CompactHashMap4.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            CompactHashMap4 compactHashMap4 = CompactHashMap4.this;
            Objects.requireNonNull(compactHashMap4);
            return new CompactHashMap3(compactHashMap4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return CompactHashMap4.this.f26204n;
        }
    }

    public CompactHashMap4() {
        m11615e(3, 1.0f);
    }

    /* JADX INFO: renamed from: a */
    public static Object m11610a(CompactHashMap4 compactHashMap4, int i) {
        return compactHashMap4.m11616f(compactHashMap4.f26199i[i], m11611b(compactHashMap4.f26198h[i]));
    }

    /* JADX INFO: renamed from: b */
    public static int m11611b(long j2) {
        return (int) (j2 >>> 32);
    }

    /* JADX INFO: renamed from: g */
    public static long m11612g(long j2, int i) {
        return (j2 & (-4294967296L)) | (((long) i) & 4294967295L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        m11615e(3, 1.0f);
        int i = objectInputStream.readInt();
        while (true) {
            i--;
            if (i < 0) {
                return;
            } else {
                put(objectInputStream.readObject(), objectInputStream.readObject());
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.f26204n);
        for (int i = 0; i < this.f26204n; i++) {
            objectOutputStream.writeObject(this.f26199i[i]);
            objectOutputStream.writeObject(this.f26200j[i]);
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m11613c() {
        return this.f26197g.length - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f26202l++;
        Arrays.fill(this.f26199i, 0, this.f26204n, (Object) null);
        Arrays.fill(this.f26200j, 0, this.f26204n, (Object) null);
        Arrays.fill(this.f26197g, -1);
        Arrays.fill(this.f26198h, -1L);
        this.f26204n = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return m11614d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        for (int i = 0; i < this.f26204n; i++) {
            if (C4799a.m10952C(obj, this.f26200j[i])) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final int m11614d(@NullableDecl Object obj) {
        int iM11009q0 = C4799a.m11009q0(obj);
        int i = this.f26197g[m11613c() & iM11009q0];
        while (i != -1) {
            long j2 = this.f26198h[i];
            if (m11611b(j2) == iM11009q0 && C4799a.m10952C(obj, this.f26199i[i])) {
                return i;
            }
            i = (int) j2;
        }
        return -1;
    }

    /* JADX INFO: renamed from: e */
    public void m11615e(int i, float f) {
        C4799a.m10990h(i >= 0, "Initial capacity must be non-negative");
        C4799a.m10990h(f > 0.0f, "Illegal load factor");
        int iMax = Math.max(i, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax > ((int) (((double) f) * ((double) iHighestOneBit))) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
            iHighestOneBit = 1073741824;
        }
        int[] iArr = new int[iHighestOneBit];
        Arrays.fill(iArr, -1);
        this.f26197g = iArr;
        this.f26201k = f;
        this.f26199i = new Object[i];
        this.f26200j = new Object[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.f26198h = jArr;
        this.f26203m = Math.max(1, (int) (iHighestOneBit * f));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f26206p;
        if (set != null) {
            return set;
        }
        a aVar = new a();
        this.f26206p = aVar;
        return aVar;
    }

    @NullableDecl
    /* JADX INFO: renamed from: f */
    public final V m11616f(@NullableDecl Object obj, int i) {
        long[] jArr;
        long j2;
        int iM11613c = m11613c() & i;
        int i2 = this.f26197g[iM11613c];
        if (i2 == -1) {
            return null;
        }
        int i3 = -1;
        while (true) {
            if (m11611b(this.f26198h[i2]) == i && C4799a.m10952C(obj, this.f26199i[i2])) {
                V v = (V) this.f26200j[i2];
                if (i3 == -1) {
                    this.f26197g[iM11613c] = (int) this.f26198h[i2];
                } else {
                    long[] jArr2 = this.f26198h;
                    jArr2[i3] = m11612g(jArr2[i3], (int) jArr2[i2]);
                }
                int i4 = this.f26204n - 1;
                if (i2 < i4) {
                    Object[] objArr = this.f26199i;
                    objArr[i2] = objArr[i4];
                    Object[] objArr2 = this.f26200j;
                    objArr2[i2] = objArr2[i4];
                    objArr[i4] = null;
                    objArr2[i4] = null;
                    long[] jArr3 = this.f26198h;
                    long j3 = jArr3[i4];
                    jArr3[i2] = j3;
                    jArr3[i4] = -1;
                    int iM11611b = m11611b(j3) & m11613c();
                    int[] iArr = this.f26197g;
                    int i5 = iArr[iM11611b];
                    if (i5 == i4) {
                        iArr[iM11611b] = i2;
                    } else {
                        while (true) {
                            jArr = this.f26198h;
                            j2 = jArr[i5];
                            int i6 = (int) j2;
                            if (i6 == i4) {
                                break;
                            }
                            i5 = i6;
                        }
                        jArr[i5] = m11612g(j2, i2);
                    }
                } else {
                    this.f26199i[i2] = null;
                    this.f26200j[i2] = null;
                    this.f26198h[i2] = -1;
                }
                this.f26204n--;
                this.f26202l++;
                return v;
            }
            int i7 = (int) this.f26198h[i2];
            if (i7 == -1) {
                return null;
            }
            i3 = i2;
            i2 = i7;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(@NullableDecl Object obj) {
        int iM11614d = m11614d(obj);
        if (iM11614d == -1) {
            return null;
        }
        return (V) this.f26200j[iM11614d];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return this.f26204n == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f26205o;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.f26205o = cVar;
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V put(@NullableDecl K k, @NullableDecl V v) {
        long[] jArr = this.f26198h;
        Object[] objArr = this.f26199i;
        Object[] objArr2 = this.f26200j;
        int iM11009q0 = C4799a.m11009q0(k);
        int iM11613c = m11613c() & iM11009q0;
        int i = this.f26204n;
        int[] iArr = this.f26197g;
        int i2 = iArr[iM11613c];
        if (i2 == -1) {
            iArr[iM11613c] = i;
        } else {
            while (true) {
                long j2 = jArr[i2];
                if (m11611b(j2) == iM11009q0 && C4799a.m10952C(k, objArr[i2])) {
                    V v2 = (V) objArr2[i2];
                    objArr2[i2] = v;
                    return v2;
                }
                int i3 = (int) j2;
                if (i3 == -1) {
                    jArr[i2] = m11612g(j2, i);
                    break;
                }
                i2 = i3;
            }
        }
        if (i == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i4 = i + 1;
        int length = this.f26198h.length;
        if (i4 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                this.f26199i = Arrays.copyOf(this.f26199i, iMax);
                this.f26200j = Arrays.copyOf(this.f26200j, iMax);
                long[] jArr2 = this.f26198h;
                int length2 = jArr2.length;
                long[] jArrCopyOf = Arrays.copyOf(jArr2, iMax);
                if (iMax > length2) {
                    Arrays.fill(jArrCopyOf, length2, iMax, -1L);
                }
                this.f26198h = jArrCopyOf;
            }
        }
        this.f26198h[i] = (((long) iM11009q0) << 32) | 4294967295L;
        this.f26199i[i] = k;
        this.f26200j[i] = v;
        this.f26204n = i4;
        if (i >= this.f26203m) {
            int[] iArr2 = this.f26197g;
            int length3 = iArr2.length * 2;
            if (iArr2.length >= 1073741824) {
                this.f26203m = Integer.MAX_VALUE;
            } else {
                int i5 = ((int) (length3 * this.f26201k)) + 1;
                int[] iArr3 = new int[length3];
                Arrays.fill(iArr3, -1);
                long[] jArr3 = this.f26198h;
                int i6 = length3 - 1;
                for (int i7 = 0; i7 < this.f26204n; i7++) {
                    int iM11611b = m11611b(jArr3[i7]);
                    int i8 = iM11611b & i6;
                    int i9 = iArr3[i8];
                    iArr3[i8] = i7;
                    jArr3[i7] = (((long) iM11611b) << 32) | (((long) i9) & 4294967295L);
                }
                this.f26203m = i5;
                this.f26197g = iArr3;
            }
        }
        this.f26202l++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @CanIgnoreReturnValue
    @NullableDecl
    public V remove(@NullableDecl Object obj) {
        return m11616f(obj, C4799a.m11009q0(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f26204n;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f26207q;
        if (collection != null) {
            return collection;
        }
        e eVar = new e();
        this.f26207q = eVar;
        return eVar;
    }
}
