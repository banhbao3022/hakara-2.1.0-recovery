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
public final class x62 extends u62<Boolean> implements RandomAccess, o82, r92 {

    /* JADX INFO: renamed from: g */
    public static final x62 f21441g;

    /* JADX INFO: renamed from: h */
    public boolean[] f21442h;

    /* JADX INFO: renamed from: i */
    public int f21443i;

    static {
        x62 x62Var = new x62(new boolean[0], 0);
        f21441g = x62Var;
        x62Var.f20226f = false;
    }

    public x62() {
        this.f21442h = new boolean[10];
        this.f21443i = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m8471c();
        if (i < 0 || i > (i2 = this.f21443i)) {
            throw new IndexOutOfBoundsException(m8721j(i));
        }
        boolean[] zArr = this.f21442h;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[outline.m1602x(i2, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f21442h, i, zArr2, i + 1, this.f21443i - i);
            this.f21442h = zArr2;
        }
        this.f21442h[i] = zBooleanValue;
        this.f21443i++;
        ((AbstractList) this).modCount++;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        m8471c();
        Charset charset = p82.f17879a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof x62)) {
            return super.addAll(collection);
        }
        x62 x62Var = (x62) collection;
        int i = x62Var.f21443i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f21443i;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f21442h;
        if (i3 > zArr.length) {
            this.f21442h = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(x62Var.f21442h, 0, this.f21442h, this.f21443i, x62Var.f21443i);
        this.f21443i = i3;
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
        if (!(obj instanceof x62)) {
            return super.equals(obj);
        }
        x62 x62Var = (x62) obj;
        if (this.f21443i != x62Var.f21443i) {
            return false;
        }
        boolean[] zArr = x62Var.f21442h;
        for (int i = 0; i < this.f21443i; i++) {
            if (this.f21442h[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m8719f(boolean z) {
        m8471c();
        int i = this.f21443i;
        boolean[] zArr = this.f21442h;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[outline.m1602x(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f21442h = zArr2;
        }
        boolean[] zArr3 = this.f21442h;
        int i2 = this.f21443i;
        this.f21443i = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        m8720h(i);
        return Boolean.valueOf(this.f21442h[i]);
    }

    /* JADX INFO: renamed from: h */
    public final void m8720h(int i) {
        if (i < 0 || i >= this.f21443i) {
            throw new IndexOutOfBoundsException(m8721j(i));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iM8089b = 1;
        for (int i = 0; i < this.f21443i; i++) {
            iM8089b = (iM8089b * 31) + p82.m8089b(this.f21442h[i]);
        }
        return iM8089b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i = this.f21443i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f21442h[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final String m8721j(int i) {
        return outline.m1586h(35, "Index:", i, ", Size:", this.f21443i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o82
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ o82 mo5705l(int i) {
        if (i >= this.f21443i) {
            return new x62(Arrays.copyOf(this.f21442h, i), this.f21443i);
        }
        throw new IllegalArgumentException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m8471c();
        m8720h(i);
        boolean[] zArr = this.f21442h;
        boolean z = zArr[i];
        int i2 = this.f21443i;
        if (i < i2 - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f21443i--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m8471c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f21442h;
        System.arraycopy(zArr, i2, zArr, i, this.f21443i - i2);
        this.f21443i -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        m8471c();
        m8720h(i);
        boolean[] zArr = this.f21442h;
        boolean z = zArr[i];
        zArr[i] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21443i;
    }

    public x62(boolean[] zArr, int i) {
        this.f21442h = zArr;
        this.f21443i = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m8719f(((Boolean) obj).booleanValue());
        return true;
    }
}
