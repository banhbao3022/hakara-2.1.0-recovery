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
public final class a82 extends u62<Float> implements RandomAccess, o82, r92 {

    /* JADX INFO: renamed from: g */
    public static final a82 f12035g;

    /* JADX INFO: renamed from: h */
    public float[] f12036h;

    /* JADX INFO: renamed from: i */
    public int f12037i;

    static {
        a82 a82Var = new a82(new float[0], 0);
        f12035g = a82Var;
        a82Var.f20226f = false;
    }

    public a82() {
        this.f12036h = new float[10];
        this.f12037i = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m8471c();
        if (i < 0 || i > (i2 = this.f12037i)) {
            throw new IndexOutOfBoundsException(m5704j(i));
        }
        float[] fArr = this.f12036h;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[outline.m1602x(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f12036h, i, fArr2, i + 1, this.f12037i - i);
            this.f12036h = fArr2;
        }
        this.f12036h[i] = fFloatValue;
        this.f12037i++;
        ((AbstractList) this).modCount++;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        m8471c();
        Charset charset = p82.f17879a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof a82)) {
            return super.addAll(collection);
        }
        a82 a82Var = (a82) collection;
        int i = a82Var.f12037i;
        if (i == 0) {
            return false;
        }
        int i2 = this.f12037i;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f12036h;
        if (i3 > fArr.length) {
            this.f12036h = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(a82Var.f12036h, 0, this.f12036h, this.f12037i, a82Var.f12037i);
        this.f12037i = i3;
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
        if (!(obj instanceof a82)) {
            return super.equals(obj);
        }
        a82 a82Var = (a82) obj;
        if (this.f12037i != a82Var.f12037i) {
            return false;
        }
        float[] fArr = a82Var.f12036h;
        for (int i = 0; i < this.f12037i; i++) {
            if (Float.floatToIntBits(this.f12036h[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m5702f(float f) {
        m8471c();
        int i = this.f12037i;
        float[] fArr = this.f12036h;
        if (i == fArr.length) {
            float[] fArr2 = new float[outline.m1602x(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f12036h = fArr2;
        }
        float[] fArr3 = this.f12036h;
        int i2 = this.f12037i;
        this.f12037i = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        m5703h(i);
        return Float.valueOf(this.f12036h[i]);
    }

    /* JADX INFO: renamed from: h */
    public final void m5703h(int i) {
        if (i < 0 || i >= this.f12037i) {
            throw new IndexOutOfBoundsException(m5704j(i));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f12037i; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f12036h[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f12037i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f12036h[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final String m5704j(int i) {
        return outline.m1586h(35, "Index:", i, ", Size:", this.f12037i);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.o82
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ o82 mo5705l(int i) {
        if (i >= this.f12037i) {
            return new a82(Arrays.copyOf(this.f12036h, i), this.f12037i);
        }
        throw new IllegalArgumentException();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m8471c();
        m5703h(i);
        float[] fArr = this.f12036h;
        float f = fArr[i];
        int i2 = this.f12037i;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f12037i--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m8471c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f12036h;
        System.arraycopy(fArr, i2, fArr, i, this.f12037i - i2);
        this.f12037i -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m8471c();
        m5703h(i);
        float[] fArr = this.f12036h;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12037i;
    }

    public a82(float[] fArr, int i) {
        this.f12036h = fArr;
        this.f12037i = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.u62, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        m5702f(((Float) obj).floatValue());
        return true;
    }
}
