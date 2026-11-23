package p007c.p190n.p194b.p266d.p314j.p315a;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class q72 extends u62<Double> implements RandomAccess, o82, r92 {

    /* JADX INFO: renamed from: g */
    public static final q72 f18209g;

    /* JADX INFO: renamed from: h */
    public double[] f18210h;

    /* JADX INFO: renamed from: i */
    public int f18211i;

    static {
        q72 q72Var = new q72(new double[0], 0);
        f18209g = q72Var;
        q72Var.f20226f = false;
    }

    public q72() {
        this.f18210h = new double[10];
        this.f18211i = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double dDoubleValue = ((Double) obj).doubleValue();
        m8471c();
        if (i < 0 || i > (i2 = this.f18211i)) {
            throw new IndexOutOfBoundsException(m8195j(i));
        }
        double[] dArr = this.f18210h;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[outline.m1602x(i2, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f18210h, i, dArr2, i + 1, this.f18211i - i);
            this.f18210h = dArr2;
        }
        this.f18210h[i] = dDoubleValue;
        this.f18211i++;
        ((AbstractList) this).modCount++;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        m8471c();
        Charset charset = p82.f17879a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof q72)) {
            return super.addAll(collection);
        }
        q72 q72Var = (q72) collection;
        int i = q72Var.f18211i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f18211i;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f18210h;
        if (i3 > dArr.length) {
            this.f18210h = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(q72Var.f18210h, 0, this.f18210h, this.f18211i, q72Var.f18211i);
        this.f18211i = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q72)) {
            return super.equals(obj);
        }
        q72 q72Var = (q72) obj;
        if (this.f18211i != q72Var.f18211i) {
            return false;
        }
        double[] dArr = q72Var.f18210h;
        for (int i = 0; i < this.f18211i; i++) {
            if (Double.doubleToLongBits(this.f18210h[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m8193f(double d) {
        m8471c();
        int i = this.f18211i;
        double[] dArr = this.f18210h;
        if (i == dArr.length) {
            double[] dArr2 = new double[outline.m1602x(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f18210h = dArr2;
        }
        double[] dArr3 = this.f18210h;
        int i2 = this.f18211i;
        this.f18211i = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        m8194h(i);
        return Double.valueOf(this.f18210h[i]);
    }

    /* JADX INFO: renamed from: h */
    public final void m8194h(int i) {
        if (i < 0 || i >= this.f18211i) {
            throw new IndexOutOfBoundsException(m8195j(i));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM8088a = 1;
        for (int i = 0; i < this.f18211i; i++) {
            iM8088a = (iM8088a * 31) + p82.m8088a(Double.doubleToLongBits(this.f18210h[i]));
        }
        return iM8088a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i = this.f18211i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f18210h[i2] == dDoubleValue) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final String m8195j(int i) {
        return outline.m1586h(35, "Index:", i, ", Size:", this.f18211i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o82
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ o82 mo5705l(int i) {
        if (i >= this.f18211i) {
            return new q72(Arrays.copyOf(this.f18210h, i), this.f18211i);
        }
        throw new IllegalArgumentException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m8471c();
        m8194h(i);
        double[] dArr = this.f18210h;
        double d = dArr[i];
        int i2 = this.f18211i;
        if (i < i2 - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f18211i--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m8471c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f18210h;
        System.arraycopy(dArr, i2, dArr, i, this.f18211i - i2);
        this.f18211i -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        m8471c();
        m8194h(i);
        double[] dArr = this.f18210h;
        double d = dArr[i];
        dArr[i] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f18211i;
    }

    public q72(double[] dArr, int i) {
        this.f18210h = dArr;
        this.f18211i = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8193f(((Double) obj).doubleValue());
        return true;
    }
}
