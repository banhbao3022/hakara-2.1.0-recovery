package p636z0.p691g;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: z0.g.c, reason: use source file name */
/* JADX INFO: compiled from: ArraySet.java */
/* JADX INFO: loaded from: classes.dex */
public final class ArraySet2<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: f */
    public static final int[] f36621f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final Object[] f36622g = new Object[0];

    /* JADX INFO: renamed from: h */
    public static Object[] f36623h;

    /* JADX INFO: renamed from: i */
    public static int f36624i;

    /* JADX INFO: renamed from: j */
    public static Object[] f36625j;

    /* JADX INFO: renamed from: k */
    public static int f36626k;

    /* JADX INFO: renamed from: l */
    public int[] f36627l;

    /* JADX INFO: renamed from: m */
    public Object[] f36628m;

    /* JADX INFO: renamed from: n */
    public int f36629n;

    /* JADX INFO: renamed from: o */
    public MapCollections<E, E> f36630o;

    public ArraySet2() {
        this(0);
    }

    /* JADX INFO: renamed from: h */
    public static void m15572h(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (ArraySet2.class) {
                if (f36626k < 10) {
                    objArr[0] = f36625j;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f36625j = objArr;
                    f36626k++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (ArraySet2.class) {
                if (f36624i < 10) {
                    objArr[0] = f36623h;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f36623h = objArr;
                    f36624i++;
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e) {
        int i;
        int iM15575j;
        if (e == null) {
            iM15575j = m15576m();
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iM15575j = m15575j(e, iHashCode);
        }
        if (iM15575j >= 0) {
            return false;
        }
        int i2 = ~iM15575j;
        int i3 = this.f36629n;
        int[] iArr = this.f36627l;
        if (i3 >= iArr.length) {
            int i4 = 4;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i4 = 8;
            }
            Object[] objArr = this.f36628m;
            m15573c(i4);
            int[] iArr2 = this.f36627l;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f36628m, 0, objArr.length);
            }
            m15572h(iArr, objArr, this.f36629n);
        }
        int i5 = this.f36629n;
        if (i2 < i5) {
            int[] iArr3 = this.f36627l;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f36628m;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f36629n - i2);
        }
        this.f36627l[i2] = i;
        this.f36628m[i2] = e;
        this.f36629n++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        m15574f(collection.size() + this.f36629n);
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: c */
    public final void m15573c(int i) {
        if (i == 8) {
            synchronized (ArraySet2.class) {
                Object[] objArr = f36625j;
                if (objArr != null) {
                    this.f36628m = objArr;
                    f36625j = (Object[]) objArr[0];
                    this.f36627l = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f36626k--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (ArraySet2.class) {
                Object[] objArr2 = f36623h;
                if (objArr2 != null) {
                    this.f36628m = objArr2;
                    f36623h = (Object[]) objArr2[0];
                    this.f36627l = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f36624i--;
                    return;
                }
            }
        }
        this.f36627l = new int[i];
        this.f36628m = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i = this.f36629n;
        if (i != 0) {
            m15572h(this.f36627l, this.f36628m, i);
            this.f36627l = f36621f;
            this.f36628m = f36622g;
            this.f36629n = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f36629n != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f36629n; i++) {
                try {
                    if (!set.contains(this.f36628m[i])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m15574f(int i) {
        int[] iArr = this.f36627l;
        if (iArr.length < i) {
            Object[] objArr = this.f36628m;
            m15573c(i);
            int i2 = this.f36629n;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f36627l, 0, i2);
                System.arraycopy(objArr, 0, this.f36628m, 0, this.f36629n);
            }
            m15572h(iArr, objArr, this.f36629n);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f36627l;
        int i = this.f36629n;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m15576m() : m15575j(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f36629n <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        if (this.f36630o == null) {
            this.f36630o = new ArraySet(this);
        }
        MapCollections<E, E> mapCollections = this.f36630o;
        if (mapCollections.f36647b == null) {
            mapCollections.f36647b = new MapCollections.c();
        }
        return mapCollections.f36647b.iterator();
    }

    /* JADX INFO: renamed from: j */
    public final int m15575j(Object obj, int i) {
        int i2 = this.f36629n;
        if (i2 == 0) {
            return -1;
        }
        int iM15578a = ContainerHelpers.m15578a(this.f36627l, i2, i);
        if (iM15578a < 0 || obj.equals(this.f36628m[iM15578a])) {
            return iM15578a;
        }
        int i3 = iM15578a + 1;
        while (i3 < i2 && this.f36627l[i3] == i) {
            if (obj.equals(this.f36628m[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM15578a - 1; i4 >= 0 && this.f36627l[i4] == i; i4--) {
            if (obj.equals(this.f36628m[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: m */
    public final int m15576m() {
        int i = this.f36629n;
        if (i == 0) {
            return -1;
        }
        int iM15578a = ContainerHelpers.m15578a(this.f36627l, i, 0);
        if (iM15578a < 0 || this.f36628m[iM15578a] == null) {
            return iM15578a;
        }
        int i2 = iM15578a + 1;
        while (i2 < i && this.f36627l[i2] == 0) {
            if (this.f36628m[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM15578a - 1; i3 >= 0 && this.f36627l[i3] == 0; i3--) {
            if (this.f36628m[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: q */
    public E m15577q(int i) {
        Object[] objArr = this.f36628m;
        E e = (E) objArr[i];
        int i2 = this.f36629n;
        if (i2 <= 1) {
            m15572h(this.f36627l, objArr, i2);
            this.f36627l = f36621f;
            this.f36628m = f36622g;
            this.f36629n = 0;
        } else {
            int[] iArr = this.f36627l;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i3 = i2 - 1;
                this.f36629n = i3;
                if (i < i3) {
                    int i4 = i + 1;
                    System.arraycopy(iArr, i4, iArr, i, i3 - i);
                    Object[] objArr2 = this.f36628m;
                    System.arraycopy(objArr2, i4, objArr2, i, this.f36629n - i);
                }
                this.f36628m[this.f36629n] = null;
            } else {
                m15573c(i2 > 8 ? i2 + (i2 >> 1) : 8);
                this.f36629n--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f36627l, 0, i);
                    System.arraycopy(objArr, 0, this.f36628m, 0, i);
                }
                int i5 = this.f36629n;
                if (i < i5) {
                    int i6 = i + 1;
                    System.arraycopy(iArr, i6, this.f36627l, i, i5 - i);
                    System.arraycopy(objArr, i6, this.f36628m, i, this.f36629n - i);
                }
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        m15577q(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f36629n - 1; i >= 0; i--) {
            if (!collection.contains(this.f36628m[i])) {
                m15577q(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f36629n;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i = this.f36629n;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f36628m, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f36629n * 14);
        sb.append('{');
        for (int i = 0; i < this.f36629n; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f36628m[i];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public ArraySet2(int i) {
        if (i == 0) {
            this.f36627l = f36621f;
            this.f36628m = f36622g;
        } else {
            m15573c(i);
        }
        this.f36629n = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f36629n) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f36629n));
        }
        System.arraycopy(this.f36628m, 0, tArr, 0, this.f36629n);
        int length = tArr.length;
        int i = this.f36629n;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet2(ArraySet2<E> arraySet2) {
        this();
        if (arraySet2 != null) {
            int i = arraySet2.f36629n;
            m15574f(this.f36629n + i);
            if (this.f36629n != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    add(arraySet2.f36628m[i2]);
                }
            } else if (i > 0) {
                System.arraycopy(arraySet2.f36627l, 0, this.f36627l, 0, i);
                System.arraycopy(arraySet2.f36628m, 0, this.f36628m, 0, i);
                this.f36629n = i;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArraySet2(Collection<E> collection) {
        this();
        if (collection != 0) {
            addAll(collection);
        }
    }
}
