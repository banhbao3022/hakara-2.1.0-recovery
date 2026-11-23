package p007c.p190n.p194b.p266d.p314j.p325k;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.k.v3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4376v3 extends AbstractC4335s3<Boolean> implements InterfaceC4197i5<Boolean>, InterfaceC4366u6, RandomAccess {

    /* JADX INFO: renamed from: g */
    public boolean[] f23511g;

    /* JADX INFO: renamed from: h */
    public int f23512h;

    static {
        new C4376v3(new boolean[0], 0).f23452f = false;
    }

    public C4376v3() {
        this.f23511g = new boolean[10];
        this.f23512h = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m10203c();
        if (i < 0 || i > (i2 = this.f23512h)) {
            throw new IndexOutOfBoundsException(m10284j(i));
        }
        boolean[] zArr = this.f23511g;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[outline.m1602x(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f23511g, i, zArr2, i + 1, this.f23512h - i);
            this.f23511g = zArr2;
        }
        this.f23511g[i] = zBooleanValue;
        this.f23512h++;
        ((AbstractList) this).modCount++;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        m10203c();
        Charset charset = C4127d5.f23112a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C4376v3)) {
            return super.addAll(collection);
        }
        C4376v3 c4376v3 = (C4376v3) collection;
        int i = c4376v3.f23512h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f23512h;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f23511g;
        if (i3 > zArr.length) {
            this.f23511g = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(c4376v3.f23511g, 0, this.f23511g, this.f23512h, c4376v3.f23512h);
        this.f23512h = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4197i5
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC4197i5<Boolean> mo9340b(int i) {
        if (i >= this.f23512h) {
            return new C4376v3(Arrays.copyOf(this.f23511g, i), this.f23512h);
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
        if (!(obj instanceof C4376v3)) {
            return super.equals(obj);
        }
        C4376v3 c4376v3 = (C4376v3) obj;
        if (this.f23512h != c4376v3.f23512h) {
            return false;
        }
        boolean[] zArr = c4376v3.f23511g;
        for (int i = 0; i < this.f23512h; i++) {
            if (this.f23511g[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m10282f(boolean z) {
        m10203c();
        int i = this.f23512h;
        boolean[] zArr = this.f23511g;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[outline.m1602x(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f23511g = zArr2;
        }
        boolean[] zArr3 = this.f23511g;
        int i2 = this.f23512h;
        this.f23512h = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m10283h(i);
        return Boolean.valueOf(this.f23511g[i]);
    }

    /* JADX INFO: renamed from: h */
    public final void m10283h(int i) {
        if (i < 0 || i >= this.f23512h) {
            throw new IndexOutOfBoundsException(m10284j(i));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM9546b = 1;
        for (int i = 0; i < this.f23512h; i++) {
            iM9546b = (iM9546b * 31) + C4127d5.m9546b(this.f23511g[i]);
        }
        return iM9546b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f23512h;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f23511g[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final String m10284j(int i) {
        return outline.m1586h(35, "Index:", i, ", Size:", this.f23512h);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m10203c();
        m10283h(i);
        boolean[] zArr = this.f23511g;
        boolean z = zArr[i];
        int i2 = this.f23512h;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f23512h--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m10203c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f23511g;
        System.arraycopy(zArr, i2, zArr, i, this.f23512h - i2);
        this.f23512h -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m10203c();
        m10283h(i);
        boolean[] zArr = this.f23511g;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23512h;
    }

    public C4376v3(boolean[] zArr, int i) {
        this.f23511g = zArr;
        this.f23512h = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m10282f(((Boolean) obj).booleanValue());
        return true;
    }
}
