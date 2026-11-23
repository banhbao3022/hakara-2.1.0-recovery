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
public final class b92 extends u62<Long> implements RandomAccess, n82, r92 {

    /* JADX INFO: renamed from: g */
    public static final b92 f12548g;

    /* JADX INFO: renamed from: h */
    public long[] f12549h;

    /* JADX INFO: renamed from: i */
    public int f12550i;

    static {
        b92 b92Var = new b92(new long[0], 0);
        f12548g = b92Var;
        b92Var.f20226f = false;
    }

    public b92() {
        this.f12549h = new long[10];
        this.f12550i = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long jLongValue = ((Long) obj).longValue();
        m8471c();
        if (i < 0 || i > (i2 = this.f12550i)) {
            throw new IndexOutOfBoundsException(m5940q(i));
        }
        long[] jArr = this.f12549h;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[outline.m1602x(i2, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f12549h, i, jArr2, i + 1, this.f12550i - i);
            this.f12549h = jArr2;
        }
        this.f12549h[i] = jLongValue;
        this.f12550i++;
        ((AbstractList) this).modCount++;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        m8471c();
        Charset charset = p82.f17879a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof b92)) {
            return super.addAll(collection);
        }
        b92 b92Var = (b92) collection;
        int i = b92Var.f12550i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f12550i;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f12549h;
        if (i3 > jArr.length) {
            this.f12549h = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(b92Var.f12549h, 0, this.f12549h, this.f12550i, b92Var.f12550i);
        this.f12550i = i3;
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
        if (!(obj instanceof b92)) {
            return super.equals(obj);
        }
        b92 b92Var = (b92) obj;
        if (this.f12550i != b92Var.f12550i) {
            return false;
        }
        long[] jArr = b92Var.f12549h;
        for (int i = 0; i < this.f12550i; i++) {
            if (this.f12549h[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o82
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final n82 mo5705l(int i) {
        if (i >= this.f12550i) {
            return new b92(Arrays.copyOf(this.f12549h, i), this.f12550i);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        m5939m(i);
        return Long.valueOf(this.f12549h[i]);
    }

    /* JADX INFO: renamed from: h */
    public final long m5937h(int i) {
        m5939m(i);
        return this.f12549h[i];
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM8088a = 1;
        for (int i = 0; i < this.f12550i; i++) {
            iM8088a = (iM8088a * 31) + p82.m8088a(this.f12549h[i]);
        }
        return iM8088a;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i = this.f12550i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f12549h[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m5938j(long j2) {
        m8471c();
        int i = this.f12550i;
        long[] jArr = this.f12549h;
        if (i == jArr.length) {
            long[] jArr2 = new long[outline.m1602x(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f12549h = jArr2;
        }
        long[] jArr3 = this.f12549h;
        int i2 = this.f12550i;
        this.f12550i = i2 + 1;
        jArr3[i2] = j2;
    }

    /* JADX INFO: renamed from: m */
    public final void m5939m(int i) {
        if (i < 0 || i >= this.f12550i) {
            throw new IndexOutOfBoundsException(m5940q(i));
        }
    }

    /* JADX INFO: renamed from: q */
    public final String m5940q(int i) {
        return outline.m1586h(35, "Index:", i, ", Size:", this.f12550i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m8471c();
        m5939m(i);
        long[] jArr = this.f12549h;
        long j2 = jArr[i];
        int i2 = this.f12550i;
        if (i < i2 - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f12550i--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m8471c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f12549h;
        System.arraycopy(jArr, i2, jArr, i, this.f12550i - i2);
        this.f12550i -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        m8471c();
        m5939m(i);
        long[] jArr = this.f12549h;
        long j2 = jArr[i];
        jArr[i] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12550i;
    }

    public b92(long[] jArr, int i) {
        this.f12549h = jArr;
        this.f12550i = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m5938j(((Long) obj).longValue());
        return true;
    }
}
