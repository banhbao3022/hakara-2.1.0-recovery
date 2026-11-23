package p007c.p190n.p194b.p266d.p314j.p320f;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.f.b5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3824b5 extends AbstractC3813a4<Integer> implements InterfaceC3844d5, InterfaceC4014u6, RandomAccess {

    /* JADX INFO: renamed from: g */
    public static final C3824b5 f22522g;

    /* JADX INFO: renamed from: h */
    public int[] f22523h;

    /* JADX INFO: renamed from: i */
    public int f22524i;

    static {
        C3824b5 c3824b5 = new C3824b5(new int[0], 0);
        f22522g = c3824b5;
        c3824b5.f22505f = false;
    }

    public C3824b5() {
        this.f22523h = new int[10];
        this.f22524i = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m8928c();
        if (i < 0 || i > (i2 = this.f22524i)) {
            throw new IndexOutOfBoundsException(m8957q(i));
        }
        int[] iArr = this.f22523h;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[outline.m1602x(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f22523h, i, iArr2, i + 1, this.f22524i - i);
            this.f22523h = iArr2;
        }
        this.f22523h[i] = iIntValue;
        this.f22524i++;
        ((AbstractList) this).modCount++;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3813a4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m8928c();
        Charset charset = C3814a5.f22506a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C3824b5)) {
            return super.addAll(collection);
        }
        C3824b5 c3824b5 = (C3824b5) collection;
        int i = c3824b5.f22524i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f22524i;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f22523h;
        if (i3 > iArr.length) {
            this.f22523h = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c3824b5.f22523h, 0, this.f22523h, this.f22524i, c3824b5.f22524i);
        this.f22524i = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3813a4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3824b5)) {
            return super.equals(obj);
        }
        C3824b5 c3824b5 = (C3824b5) obj;
        if (this.f22524i != c3824b5.f22524i) {
            return false;
        }
        int[] iArr = c3824b5.f22523h;
        for (int i = 0; i < this.f22524i; i++) {
            if (this.f22523h[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final int m8953f(int i) {
        m8956m(i);
        return this.f22523h[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m8956m(i);
        return Integer.valueOf(this.f22523h[i]);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.InterfaceC3894i5
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final InterfaceC3844d5 mo8958r(int i) {
        if (i >= this.f22524i) {
            return new C3824b5(Arrays.copyOf(this.f22523h, i), this.f22524i);
        }
        throw new IllegalArgumentException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3813a4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f22524i; i2++) {
            i = (i * 31) + this.f22523h[i2];
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    public final void m8955j(int i) {
        m8928c();
        int i2 = this.f22524i;
        int[] iArr = this.f22523h;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[outline.m1602x(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f22523h = iArr2;
        }
        int[] iArr3 = this.f22523h;
        int i3 = this.f22524i;
        this.f22524i = i3 + 1;
        iArr3[i3] = i;
    }

    /* JADX INFO: renamed from: m */
    public final void m8956m(int i) {
        if (i < 0 || i >= this.f22524i) {
            throw new IndexOutOfBoundsException(m8957q(i));
        }
    }

    /* JADX INFO: renamed from: q */
    public final String m8957q(int i) {
        return outline.m1586h(35, "Index:", i, ", Size:", this.f22524i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3813a4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m8928c();
        for (int i = 0; i < this.f22524i; i++) {
            if (obj.equals(Integer.valueOf(this.f22523h[i]))) {
                int[] iArr = this.f22523h;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f22524i - i) - 1);
                this.f22524i--;
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
        int[] iArr = this.f22523h;
        System.arraycopy(iArr, i2, iArr, i, this.f22524i - i2);
        this.f22524i -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m8928c();
        m8956m(i);
        int[] iArr = this.f22523h;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f22524i;
    }

    public C3824b5(int[] iArr, int i) {
        this.f22523h = iArr;
        this.f22524i = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m8928c();
        m8956m(i);
        int[] iArr = this.f22523h;
        int i2 = iArr[i];
        int i3 = this.f22524i;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f22524i--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p320f.AbstractC3813a4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m8955j(((Integer) obj).intValue());
        return true;
    }
}
