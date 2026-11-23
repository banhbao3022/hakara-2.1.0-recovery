package p007c.p190n.p194b.p266d.p314j.p325k;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.k.m4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4252m4 extends AbstractC4335s3<Double> implements InterfaceC4197i5<Double>, InterfaceC4366u6, RandomAccess {

    /* JADX INFO: renamed from: g */
    public double[] f23314g;

    /* JADX INFO: renamed from: h */
    public int f23315h;

    static {
        new C4252m4(new double[0], 0).f23452f = false;
    }

    public C4252m4() {
        this.f23314g = new double[10];
        this.f23315h = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        m10203c();
        if (i < 0 || i > (i2 = this.f23315h)) {
            throw new IndexOutOfBoundsException(m10008j(i));
        }
        double[] dArr = this.f23314g;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[outline.m1602x(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f23314g, i, dArr2, i + 1, this.f23315h - i);
            this.f23314g = dArr2;
        }
        this.f23314g[i] = dDoubleValue;
        this.f23315h++;
        ((AbstractList) this).modCount++;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        m10203c();
        Charset charset = C4127d5.f23112a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C4252m4)) {
            return super.addAll(collection);
        }
        C4252m4 c4252m4 = (C4252m4) collection;
        int i = c4252m4.f23315h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f23315h;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f23314g;
        if (i3 > dArr.length) {
            this.f23314g = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(c4252m4.f23314g, 0, this.f23314g, this.f23315h, c4252m4.f23315h);
        this.f23315h = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4197i5
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC4197i5<Double> mo9340b(int i) {
        if (i >= this.f23315h) {
            return new C4252m4(Arrays.copyOf(this.f23314g, i), this.f23315h);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4252m4)) {
            return super.equals(obj);
        }
        C4252m4 c4252m4 = (C4252m4) obj;
        if (this.f23315h != c4252m4.f23315h) {
            return false;
        }
        double[] dArr = c4252m4.f23314g;
        for (int i = 0; i < this.f23315h; i++) {
            if (Double.doubleToLongBits(this.f23314g[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m10006f(double d) {
        m10203c();
        int i = this.f23315h;
        double[] dArr = this.f23314g;
        if (i == dArr.length) {
            double[] dArr2 = new double[outline.m1602x(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f23314g = dArr2;
        }
        double[] dArr3 = this.f23314g;
        int i2 = this.f23315h;
        this.f23315h = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m10007h(i);
        return Double.valueOf(this.f23314g[i]);
    }

    /* JADX INFO: renamed from: h */
    public final void m10007h(int i) {
        if (i < 0 || i >= this.f23315h) {
            throw new IndexOutOfBoundsException(m10008j(i));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM9545a = 1;
        for (int i = 0; i < this.f23315h; i++) {
            iM9545a = (iM9545a * 31) + C4127d5.m9545a(Double.doubleToLongBits(this.f23314g[i]));
        }
        return iM9545a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f23315h;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f23314g[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final String m10008j(int i) {
        return outline.m1586h(35, "Index:", i, ", Size:", this.f23315h);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m10203c();
        m10007h(i);
        double[] dArr = this.f23314g;
        double d = dArr[i];
        int i2 = this.f23315h;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f23315h--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m10203c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f23314g;
        System.arraycopy(dArr, i2, dArr, i, this.f23315h - i2);
        this.f23315h -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m10203c();
        m10007h(i);
        double[] dArr = this.f23314g;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23315h;
    }

    public C4252m4(double[] dArr, int i) {
        this.f23314g = dArr;
        this.f23315h = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m10006f(((Double) obj).doubleValue());
        return true;
    }
}
