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
public final class h82 extends u62<Integer> implements RandomAccess, k82, r92 {

    /* JADX INFO: renamed from: g */
    public static final h82 f14787g;

    /* JADX INFO: renamed from: h */
    public int[] f14788h;

    /* JADX INFO: renamed from: i */
    public int f14789i;

    static {
        h82 h82Var = new h82(new int[0], 0);
        f14787g = h82Var;
        h82Var.f20226f = false;
    }

    public h82() {
        this.f14788h = new int[10];
        this.f14789i = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m8471c();
        if (i < 0 || i > (i2 = this.f14789i)) {
            throw new IndexOutOfBoundsException(m7104q(i));
        }
        int[] iArr = this.f14788h;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[outline.m1602x(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f14788h, i, iArr2, i + 1, this.f14789i - i);
            this.f14788h = iArr2;
        }
        this.f14788h[i] = iIntValue;
        this.f14789i++;
        ((AbstractList) this).modCount++;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m8471c();
        Charset charset = p82.f17879a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof h82)) {
            return super.addAll(collection);
        }
        h82 h82Var = (h82) collection;
        int i = h82Var.f14789i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f14789i;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f14788h;
        if (i3 > iArr.length) {
            this.f14788h = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(h82Var.f14788h, 0, this.f14788h, this.f14789i, h82Var.f14789i);
        this.f14789i = i3;
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
        if (!(obj instanceof h82)) {
            return super.equals(obj);
        }
        h82 h82Var = (h82) obj;
        if (this.f14789i != h82Var.f14789i) {
            return false;
        }
        int[] iArr = h82Var.f14788h;
        for (int i = 0; i < this.f14789i; i++) {
            if (this.f14788h[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o82
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final k82 mo5705l(int i) {
        if (i >= this.f14789i) {
            return new h82(Arrays.copyOf(this.f14788h, i), this.f14789i);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        m7103m(i);
        return Integer.valueOf(this.f14788h[i]);
    }

    /* JADX INFO: renamed from: h */
    public final int m7101h(int i) {
        m7103m(i);
        return this.f14788h[i];
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f14789i; i2++) {
            i = (i * 31) + this.f14788h[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f14789i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f14788h[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m7102j(int i) {
        m8471c();
        int i2 = this.f14789i;
        int[] iArr = this.f14788h;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[outline.m1602x(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f14788h = iArr2;
        }
        int[] iArr3 = this.f14788h;
        int i3 = this.f14789i;
        this.f14789i = i3 + 1;
        iArr3[i3] = i;
    }

    /* JADX INFO: renamed from: m */
    public final void m7103m(int i) {
        if (i < 0 || i >= this.f14789i) {
            throw new IndexOutOfBoundsException(m7104q(i));
        }
    }

    /* JADX INFO: renamed from: q */
    public final String m7104q(int i) {
        return outline.m1586h(35, "Index:", i, ", Size:", this.f14789i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m8471c();
        m7103m(i);
        int[] iArr = this.f14788h;
        int i2 = iArr[i];
        int i3 = this.f14789i;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f14789i--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m8471c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f14788h;
        System.arraycopy(iArr, i2, iArr, i, this.f14789i - i2);
        this.f14789i -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m8471c();
        m7103m(i);
        int[] iArr = this.f14788h;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14789i;
    }

    public h82(int[] iArr, int i) {
        this.f14788h = iArr;
        this.f14789i = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m7102j(((Integer) obj).intValue());
        return true;
    }
}
