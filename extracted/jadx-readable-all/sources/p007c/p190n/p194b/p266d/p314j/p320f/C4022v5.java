package p007c.p190n.p194b.p266d.p314j.p320f;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.f.v5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4022v5 extends AbstractC3813a4<Long> implements InterfaceC3894i5<Long>, InterfaceC4014u6, RandomAccess {

    /* JADX INFO: renamed from: g */
    public static final C4022v5 f22960g;

    /* JADX INFO: renamed from: h */
    public long[] f22961h;

    /* JADX INFO: renamed from: i */
    public int f22962i;

    static {
        C4022v5 c4022v5 = new C4022v5(new long[0], 0);
        f22960g = c4022v5;
        c4022v5.f22505f = false;
    }

    public C4022v5() {
        this.f22961h = new long[10];
        this.f22962i = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m8928c();
        if (i < 0 || i > (i2 = this.f22962i)) {
            throw new IndexOutOfBoundsException(m9285j(i));
        }
        long[] jArr = this.f22961h;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[outline.m1602x(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f22961h, i, jArr2, i + 1, this.f22962i - i);
            this.f22961h = jArr2;
        }
        this.f22961h[i] = jLongValue;
        this.f22962i++;
        ((AbstractList) this).modCount++;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3813a4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m8928c();
        Charset charset = C3814a5.f22506a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C4022v5)) {
            return super.addAll(collection);
        }
        C4022v5 c4022v5 = (C4022v5) collection;
        int i = c4022v5.f22962i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22962i;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f22961h;
        if (i3 > jArr.length) {
            this.f22961h = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c4022v5.f22961h, 0, this.f22961h, this.f22962i, c4022v5.f22962i);
        this.f22962i = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3813a4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4022v5)) {
            return super.equals(obj);
        }
        C4022v5 c4022v5 = (C4022v5) obj;
        if (this.f22962i != c4022v5.f22962i) {
            return false;
        }
        long[] jArr = c4022v5.f22961h;
        for (int i = 0; i < this.f22962i; i++) {
            if (this.f22961h[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final long m9283f(int i) {
        m9284h(i);
        return this.f22961h[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m9284h(i);
        return Long.valueOf(this.f22961h[i]);
    }

    /* JADX INFO: renamed from: h */
    public final void m9284h(int i) {
        if (i < 0 || i >= this.f22962i) {
            throw new IndexOutOfBoundsException(m9285j(i));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3813a4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM8931b = 1;
        for (int i = 0; i < this.f22962i; i++) {
            iM8931b = (iM8931b * 31) + C3814a5.m8931b(this.f22961h[i]);
        }
        return iM8931b;
    }

    /* JADX INFO: renamed from: j */
    public final String m9285j(int i) {
        return outline.m1586h(35, "Index:", i, ", Size:", this.f22962i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3894i5
    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC3894i5<Long> mo8958r(int i) {
        if (i >= this.f22962i) {
            return new C4022v5(Arrays.copyOf(this.f22961h, i), this.f22962i);
        }
        throw new IllegalArgumentException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3813a4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m8928c();
        for (int i = 0; i < this.f22962i; i++) {
            if (obj.equals(Long.valueOf(this.f22961h[i]))) {
                long[] jArr = this.f22961h;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f22962i - i) - 1);
                this.f22962i--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m8928c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f22961h;
        System.arraycopy(jArr, i2, jArr, i, this.f22962i - i2);
        this.f22962i -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m8928c();
        m9284h(i);
        long[] jArr = this.f22961h;
        long j2 = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22962i;
    }

    public C4022v5(long[] jArr, int i) {
        this.f22961h = jArr;
        this.f22962i = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m8928c();
        m9284h(i);
        long[] jArr = this.f22961h;
        long j2 = jArr[i];
        int i2 = this.f22962i;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f22962i--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3813a4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m8928c();
        int i = this.f22962i;
        long[] jArr = this.f22961h;
        if (i == jArr.length) {
            long[] jArr2 = new long[outline.m1602x(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f22961h = jArr2;
        }
        long[] jArr3 = this.f22961h;
        int i2 = this.f22962i;
        this.f22962i = i2 + 1;
        jArr3[i2] = jLongValue;
        return true;
    }
}
