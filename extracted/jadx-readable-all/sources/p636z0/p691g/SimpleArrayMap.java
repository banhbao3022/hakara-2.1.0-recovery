package p636z0.p691g;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: z0.g.h, reason: use source file name */
/* JADX INFO: compiled from: SimpleArrayMap.java */
/* JADX INFO: loaded from: classes.dex */
public class SimpleArrayMap<K, V> {

    /* JADX INFO: renamed from: f */
    public static Object[] f36661f;

    /* JADX INFO: renamed from: g */
    public static int f36662g;

    /* JADX INFO: renamed from: h */
    public static Object[] f36663h;

    /* JADX INFO: renamed from: i */
    public static int f36664i;

    /* JADX INFO: renamed from: j */
    public int[] f36665j;

    /* JADX INFO: renamed from: k */
    public Object[] f36666k;

    /* JADX INFO: renamed from: l */
    public int f36667l;

    public SimpleArrayMap() {
        this.f36665j = ContainerHelpers.f36631a;
        this.f36666k = ContainerHelpers.f36633c;
        this.f36667l = 0;
    }

    /* JADX INFO: renamed from: c */
    public static void m15604c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (SimpleArrayMap.class) {
                if (f36664i < 10) {
                    objArr[0] = f36663h;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f36663h = objArr;
                    f36664i++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (SimpleArrayMap.class) {
                if (f36662g < 10) {
                    objArr[0] = f36661f;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f36661f = objArr;
                    f36662g++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m15605a(int i) {
        if (i == 8) {
            synchronized (SimpleArrayMap.class) {
                Object[] objArr = f36663h;
                if (objArr != null) {
                    this.f36666k = objArr;
                    f36663h = (Object[]) objArr[0];
                    this.f36665j = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f36664i--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (SimpleArrayMap.class) {
                Object[] objArr2 = f36661f;
                if (objArr2 != null) {
                    this.f36666k = objArr2;
                    f36661f = (Object[]) objArr2[0];
                    this.f36665j = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f36662g--;
                    return;
                }
            }
        }
        this.f36665j = new int[i];
        this.f36666k = new Object[i << 1];
    }

    /* JADX INFO: renamed from: b */
    public void m15606b(int i) {
        int i2 = this.f36667l;
        int[] iArr = this.f36665j;
        if (iArr.length < i) {
            Object[] objArr = this.f36666k;
            m15605a(i);
            if (this.f36667l > 0) {
                System.arraycopy(iArr, 0, this.f36665j, 0, i2);
                System.arraycopy(objArr, 0, this.f36666k, 0, i2 << 1);
            }
            m15604c(iArr, objArr, i2);
        }
        if (this.f36667l != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f36667l;
        if (i > 0) {
            int[] iArr = this.f36665j;
            Object[] objArr = this.f36666k;
            this.f36665j = ContainerHelpers.f36631a;
            this.f36666k = ContainerHelpers.f36633c;
            this.f36667l = 0;
            m15604c(iArr, objArr, i);
        }
        if (this.f36667l > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m15608e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m15610g(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public int m15607d(Object obj, int i) {
        int i2 = this.f36667l;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM15578a = ContainerHelpers.m15578a(this.f36665j, i2, i);
            if (iM15578a < 0 || obj.equals(this.f36666k[iM15578a << 1])) {
                return iM15578a;
            }
            int i3 = iM15578a + 1;
            while (i3 < i2 && this.f36665j[i3] == i) {
                if (obj.equals(this.f36666k[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM15578a - 1; i4 >= 0 && this.f36665j[i4] == i; i4--) {
                if (obj.equals(this.f36666k[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: e */
    public int m15608e(Object obj) {
        return obj == null ? m15609f() : m15607d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SimpleArrayMap) {
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
            if (this.f36667l != simpleArrayMap.f36667l) {
                return false;
            }
            for (int i = 0; i < this.f36667l; i++) {
                try {
                    K kM15611h = m15611h(i);
                    V vM15612l = m15612l(i);
                    Object obj2 = simpleArrayMap.get(kM15611h);
                    if (vM15612l == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(kM15611h)) {
                            return false;
                        }
                    } else if (!vM15612l.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f36667l != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f36667l; i2++) {
                try {
                    K kM15611h2 = m15611h(i2);
                    V vM15612l2 = m15612l(i2);
                    Object obj3 = map.get(kM15611h2);
                    if (vM15612l2 == null) {
                        if (obj3 != null || !map.containsKey(kM15611h2)) {
                            return false;
                        }
                    } else if (!vM15612l2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public int m15609f() {
        int i = this.f36667l;
        if (i == 0) {
            return -1;
        }
        try {
            int iM15578a = ContainerHelpers.m15578a(this.f36665j, i, 0);
            if (iM15578a < 0 || this.f36666k[iM15578a << 1] == null) {
                return iM15578a;
            }
            int i2 = iM15578a + 1;
            while (i2 < i && this.f36665j[i2] == 0) {
                if (this.f36666k[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iM15578a - 1; i3 >= 0 && this.f36665j[i3] == 0; i3--) {
                if (this.f36666k[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: g */
    public int m15610g(Object obj) {
        int i = this.f36667l * 2;
        Object[] objArr = this.f36666k;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int iM15608e = m15608e(obj);
        return iM15608e >= 0 ? (V) this.f36666k[(iM15608e << 1) + 1] : v;
    }

    /* JADX INFO: renamed from: h */
    public K m15611h(int i) {
        return (K) this.f36666k[i << 1];
    }

    public int hashCode() {
        int[] iArr = this.f36665j;
        Object[] objArr = this.f36666k;
        int i = this.f36667l;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public void mo2035i(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        int i = simpleArrayMap.f36667l;
        m15606b(this.f36667l + i);
        if (this.f36667l != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(simpleArrayMap.m15611h(i2), simpleArrayMap.m15612l(i2));
            }
        } else if (i > 0) {
            System.arraycopy(simpleArrayMap.f36665j, 0, this.f36665j, 0, i);
            System.arraycopy(simpleArrayMap.f36666k, 0, this.f36666k, 0, i << 1);
            this.f36667l = i;
        }
    }

    public boolean isEmpty() {
        return this.f36667l <= 0;
    }

    /* JADX INFO: renamed from: j */
    public V mo2036j(int i) {
        Object[] objArr = this.f36666k;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f36667l;
        int i4 = 0;
        if (i3 <= 1) {
            m15604c(this.f36665j, objArr, i3);
            this.f36665j = ContainerHelpers.f36631a;
            this.f36666k = ContainerHelpers.f36633c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f36665j;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f36666k;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f36666k;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                m15605a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f36667l) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f36665j, 0, i);
                    System.arraycopy(objArr, 0, this.f36666k, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f36665j, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f36666k, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f36667l) {
            throw new ConcurrentModificationException();
        }
        this.f36667l = i4;
        return v;
    }

    /* JADX INFO: renamed from: k */
    public V mo2037k(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f36666k;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    /* JADX INFO: renamed from: l */
    public V m15612l(int i) {
        return (V) this.f36666k[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int iM15607d;
        int i2 = this.f36667l;
        if (k == null) {
            iM15607d = m15609f();
            i = 0;
        } else {
            int iHashCode = k.hashCode();
            i = iHashCode;
            iM15607d = m15607d(k, iHashCode);
        }
        if (iM15607d >= 0) {
            int i3 = (iM15607d << 1) + 1;
            Object[] objArr = this.f36666k;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~iM15607d;
        int[] iArr = this.f36665j;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.f36666k;
            m15605a(i5);
            if (i2 != this.f36667l) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f36665j;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f36666k, 0, objArr2.length);
            }
            m15604c(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f36665j;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f36666k;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f36667l - i4) << 1);
        }
        int i7 = this.f36667l;
        if (i2 == i7) {
            int[] iArr4 = this.f36665j;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f36666k;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f36667l = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, null);
        return orDefault == null ? put(k, v) : orDefault;
    }

    public V remove(Object obj) {
        int iM15608e = m15608e(obj);
        if (iM15608e >= 0) {
            return mo2036j(iM15608e);
        }
        return null;
    }

    public V replace(K k, V v) {
        int iM15608e = m15608e(k);
        if (iM15608e >= 0) {
            return mo2037k(iM15608e, v);
        }
        return null;
    }

    public int size() {
        return this.f36667l;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f36667l * 28);
        sb.append('{');
        for (int i = 0; i < this.f36667l; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K kM15611h = m15611h(i);
            if (kM15611h != this) {
                sb.append(kM15611h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vM15612l = m15612l(i);
            if (vM15612l != this) {
                sb.append(vM15612l);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int iM15608e = m15608e(obj);
        if (iM15608e < 0) {
            return false;
        }
        V vM15612l = m15612l(iM15608e);
        if (obj2 != vM15612l && (obj2 == null || !obj2.equals(vM15612l))) {
            return false;
        }
        mo2036j(iM15608e);
        return true;
    }

    public boolean replace(K k, V v, V v2) {
        int iM15608e = m15608e(k);
        if (iM15608e < 0) {
            return false;
        }
        V vM15612l = m15612l(iM15608e);
        if (vM15612l != v && (v == null || !v.equals(vM15612l))) {
            return false;
        }
        mo2037k(iM15608e, v2);
        return true;
    }

    public SimpleArrayMap(int i) {
        if (i == 0) {
            this.f36665j = ContainerHelpers.f36631a;
            this.f36666k = ContainerHelpers.f36633c;
        } else {
            m15605a(i);
        }
        this.f36667l = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleArrayMap(SimpleArrayMap<K, V> simpleArrayMap) {
        this();
        if (simpleArrayMap != 0) {
            mo2035i(simpleArrayMap);
        }
    }
}
