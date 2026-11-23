package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xs1<E> extends qs1<E> implements Set<E> {

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f21670g = 0;

    /* JADX INFO: renamed from: h */
    @NullableDecl
    public transient ts1<E> f21671h;

    @SafeVarargs
    /* JADX INFO: renamed from: t */
    public static <E> xs1<E> m8751t(E e, E e2, E e3, E e4, E e5, E e6, E... eArr) {
        int length = eArr.length;
        int i = length + 6;
        Object[] objArr = new Object[i];
        objArr[0] = e;
        objArr[1] = e2;
        objArr[2] = e3;
        objArr[3] = e4;
        objArr[4] = e5;
        objArr[5] = e6;
        System.arraycopy(eArr, 0, objArr, 6, length);
        return m8753y(i, objArr);
    }

    /* JADX INFO: renamed from: u */
    public static int m8752u(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            C2622l.m5371g1(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: y */
    public static <E> xs1<E> m8753y(int i, Object... objArr) {
        if (i == 0) {
            return ht1.f15008i;
        }
        if (i == 1) {
            return new it1(objArr[0]);
        }
        int iM8752u = m8752u(i);
        Object[] objArr2 = new Object[iM8752u];
        int i2 = iM8752u - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj = objArr[i5];
            C2622l.m5284M1(obj, i5);
            int iHashCode = obj.hashCode();
            int iM5466z1 = C2622l.m5466z1(iHashCode);
            while (true) {
                int i6 = iM5466z1 & i2;
                Object obj2 = objArr2[i6];
                if (obj2 == null) {
                    objArr[i4] = obj;
                    objArr2[i6] = obj;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj2.equals(obj)) {
                    break;
                }
                iM5466z1++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            return new it1(objArr[0], i3);
        }
        if (m8752u(i4) < iM8752u / 2) {
            return m8753y(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new ht1(objArr, i3, objArr2, i2, i4);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof xs1) && mo7303v() && ((xs1) obj).mo7303v() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return C2622l.m5380i0(this);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.qs1
    /* JADX INFO: renamed from: m */
    public ts1<E> mo6685m() {
        ts1<E> ts1Var = this.f21671h;
        if (ts1Var != null) {
            return ts1Var;
        }
        ts1<E> ts1VarMo6519x = mo6519x();
        this.f21671h = ts1VarMo6519x;
        return ts1VarMo6519x;
    }

    /* JADX INFO: renamed from: v */
    public boolean mo7303v() {
        return this instanceof ht1;
    }

    /* JADX INFO: renamed from: x */
    public ts1<E> mo6519x() {
        Object[] array = toArray();
        ns1<Object> ns1Var = ts1.f19979g;
        return ts1.m8450v(array, array.length);
    }
}
