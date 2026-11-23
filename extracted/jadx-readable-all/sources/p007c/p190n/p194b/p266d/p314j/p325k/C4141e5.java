package p007c.p190n.p194b.p266d.p314j.p325k;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.k.e5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4141e5 extends AbstractC4335s3<Integer> implements InterfaceC4169g5, InterfaceC4366u6, RandomAccess {

    /* JADX INFO: renamed from: g */
    public static final C4141e5 f23129g;

    /* JADX INFO: renamed from: h */
    public int[] f23130h;

    /* JADX INFO: renamed from: i */
    public int f23131i;

    static {
        C4141e5 c4141e5 = new C4141e5(new int[0], 0);
        f23129g = c4141e5;
        c4141e5.f23452f = false;
    }

    public C4141e5() {
        this.f23130h = new int[10];
        this.f23131i = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        m10203c();
        if (i < 0 || i > (i2 = this.f23131i)) {
            throw new IndexOutOfBoundsException(m9557q(i));
        }
        int[] iArr = this.f23130h;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[outline.m1602x(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f23130h, i, iArr2, i + 1, this.f23131i - i);
            this.f23130h = iArr2;
        }
        this.f23130h[i] = iIntValue;
        this.f23131i++;
        ((AbstractList) this).modCount++;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        m10203c();
        Charset charset = C4127d5.f23112a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C4141e5)) {
            return super.addAll(collection);
        }
        C4141e5 c4141e5 = (C4141e5) collection;
        int i = c4141e5.f23131i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f23131i;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f23130h;
        if (i3 > iArr.length) {
            this.f23130h = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c4141e5.f23130h, 0, this.f23130h, this.f23131i, c4141e5.f23131i);
        this.f23131i = i3;
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
        if (!(obj instanceof C4141e5)) {
            return super.equals(obj);
        }
        C4141e5 c4141e5 = (C4141e5) obj;
        if (this.f23131i != c4141e5.f23131i) {
            return false;
        }
        int[] iArr = c4141e5.f23130h;
        for (int i = 0; i < this.f23131i; i++) {
            if (this.f23130h[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4197i5
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final InterfaceC4169g5 mo9340b(int i) {
        if (i >= this.f23131i) {
            return new C4141e5(Arrays.copyOf(this.f23130h, i), this.f23131i);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m9556m(i);
        return Integer.valueOf(this.f23130h[i]);
    }

    /* JADX INFO: renamed from: h */
    public final int m9554h(int i) {
        m9556m(i);
        return this.f23130h[i];
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f23131i; i2++) {
            i = (i * 31) + this.f23130h[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.f23131i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f23130h[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final void m9555j(int i) {
        m10203c();
        int i2 = this.f23131i;
        int[] iArr = this.f23130h;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[outline.m1602x(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f23130h = iArr2;
        }
        int[] iArr3 = this.f23130h;
        int i3 = this.f23131i;
        this.f23131i = i3 + 1;
        iArr3[i3] = i;
    }

    /* JADX INFO: renamed from: m */
    public final void m9556m(int i) {
        if (i < 0 || i >= this.f23131i) {
            throw new IndexOutOfBoundsException(m9557q(i));
        }
    }

    /* JADX INFO: renamed from: q */
    public final String m9557q(int i) {
        return outline.m1586h(35, "Index:", i, ", Size:", this.f23131i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m10203c();
        m9556m(i);
        int[] iArr = this.f23130h;
        int i2 = iArr[i];
        int i3 = this.f23131i;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.f23131i--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m10203c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f23130h;
        System.arraycopy(iArr, i2, iArr, i, this.f23131i - i2);
        this.f23131i -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        m10203c();
        m9556m(i);
        int[] iArr = this.f23130h;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23131i;
    }

    public C4141e5(int[] iArr, int i) {
        this.f23130h = iArr;
        this.f23131i = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m9555j(((Integer) obj).intValue());
        return true;
    }
}
