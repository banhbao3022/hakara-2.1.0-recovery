package p007c.p190n.p194b.p266d.p314j.p325k;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.k.z5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4430z5 extends AbstractC4335s3<Long> implements InterfaceC4211j5, InterfaceC4366u6, RandomAccess {

    /* JADX INFO: renamed from: g */
    public static final C4430z5 f23654g;

    /* JADX INFO: renamed from: h */
    public long[] f23655h;

    /* JADX INFO: renamed from: i */
    public int f23656i;

    static {
        C4430z5 c4430z5 = new C4430z5(new long[0], 0);
        f23654g = c4430z5;
        c4430z5.f23452f = false;
    }

    public C4430z5() {
        this.f23655h = new long[10];
        this.f23656i = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m10203c();
        if (i < 0 || i > (i2 = this.f23656i)) {
            throw new IndexOutOfBoundsException(m10347q(i));
        }
        long[] jArr = this.f23655h;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[outline.m1602x(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f23655h, i, jArr2, i + 1, this.f23656i - i);
            this.f23655h = jArr2;
        }
        this.f23655h[i] = jLongValue;
        this.f23656i++;
        ((AbstractList) this).modCount++;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m10203c();
        Charset charset = C4127d5.f23112a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C4430z5)) {
            return super.addAll(collection);
        }
        C4430z5 c4430z5 = (C4430z5) collection;
        int i = c4430z5.f23656i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f23656i;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f23655h;
        if (i3 > jArr.length) {
            this.f23655h = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(c4430z5.f23655h, 0, this.f23655h, this.f23656i, c4430z5.f23656i);
        this.f23656i = i3;
        ((AbstractList) this).modCount++;
        return true;
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
        if (!(obj instanceof C4430z5)) {
            return super.equals(obj);
        }
        C4430z5 c4430z5 = (C4430z5) obj;
        if (this.f23656i != c4430z5.f23656i) {
            return false;
        }
        long[] jArr = c4430z5.f23655h;
        for (int i = 0; i < this.f23656i; i++) {
            if (this.f23655h[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m10343f(long j2) {
        m10203c();
        int i = this.f23656i;
        long[] jArr = this.f23655h;
        if (i == jArr.length) {
            long[] jArr2 = new long[outline.m1602x(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f23655h = jArr2;
        }
        long[] jArr3 = this.f23655h;
        int i2 = this.f23656i;
        this.f23656i = i2 + 1;
        jArr3[i2] = j2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m10346m(i);
        return Long.valueOf(this.f23655h[i]);
    }

    /* JADX INFO: renamed from: h */
    public final long m10344h(int i) {
        m10346m(i);
        return this.f23655h[i];
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM9545a = 1;
        for (int i = 0; i < this.f23656i; i++) {
            iM9545a = (iM9545a * 31) + C4127d5.m9545a(this.f23655h[i]);
        }
        return iM9545a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f23656i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f23655h[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4197i5
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final InterfaceC4211j5 mo9340b(int i) {
        if (i >= this.f23656i) {
            return new C4430z5(Arrays.copyOf(this.f23655h, i), this.f23656i);
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: m */
    public final void m10346m(int i) {
        if (i < 0 || i >= this.f23656i) {
            throw new IndexOutOfBoundsException(m10347q(i));
        }
    }

    /* JADX INFO: renamed from: q */
    public final String m10347q(int i) {
        return outline.m1586h(35, "Index:", i, ", Size:", this.f23656i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m10203c();
        m10346m(i);
        long[] jArr = this.f23655h;
        long j2 = jArr[i];
        int i2 = this.f23656i;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f23656i--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m10203c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f23655h;
        System.arraycopy(jArr, i2, jArr, i, this.f23656i - i2);
        this.f23656i -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m10203c();
        m10346m(i);
        long[] jArr = this.f23655h;
        long j2 = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23656i;
    }

    public C4430z5(long[] jArr, int i) {
        this.f23655h = jArr;
        this.f23656i = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m10343f(((Long) obj).longValue());
        return true;
    }
}
