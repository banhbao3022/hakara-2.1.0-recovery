package p007c.p190n.p194b.p266d.p314j.p325k;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.d.j.k.a5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4085a5 extends AbstractC4335s3<Float> implements InterfaceC4197i5<Float>, InterfaceC4366u6, RandomAccess {

    /* JADX INFO: renamed from: g */
    public float[] f23028g;

    /* JADX INFO: renamed from: h */
    public int f23029h;

    static {
        new C4085a5(new float[0], 0).f23452f = false;
    }

    public C4085a5() {
        this.f23028g = new float[10];
        this.f23029h = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        float fFloatValue = ((Float) obj).floatValue();
        m10203c();
        if (i < 0 || i > (i2 = this.f23029h)) {
            throw new IndexOutOfBoundsException(m9343j(i));
        }
        float[] fArr = this.f23028g;
        if (i2 < fArr.length) {
            System.arraycopy(fArr, i, fArr, i + 1, i2 - i);
        } else {
            float[] fArr2 = new float[outline.m1602x(i2, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            System.arraycopy(this.f23028g, i, fArr2, i + 1, this.f23029h - i);
            this.f23028g = fArr2;
        }
        this.f23028g[i] = fFloatValue;
        this.f23029h++;
        ((AbstractList) this).modCount++;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        m10203c();
        Charset charset = C4127d5.f23112a;
        Objects.requireNonNull(collection);
        if (!(collection instanceof C4085a5)) {
            return super.addAll(collection);
        }
        C4085a5 c4085a5 = (C4085a5) collection;
        int i = c4085a5.f23029h;
        if (i == 0) {
            return false;
        }
        int i2 = this.f23029h;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        float[] fArr = this.f23028g;
        if (i3 > fArr.length) {
            this.f23028g = Arrays.copyOf(fArr, i3);
        }
        System.arraycopy(c4085a5.f23028g, 0, this.f23028g, this.f23029h, c4085a5.f23029h);
        this.f23029h = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4197i5
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC4197i5<Float> mo9340b(int i) {
        if (i >= this.f23029h) {
            return new C4085a5(Arrays.copyOf(this.f23028g, i), this.f23029h);
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
        if (!(obj instanceof C4085a5)) {
            return super.equals(obj);
        }
        C4085a5 c4085a5 = (C4085a5) obj;
        if (this.f23029h != c4085a5.f23029h) {
            return false;
        }
        float[] fArr = c4085a5.f23028g;
        for (int i = 0; i < this.f23029h; i++) {
            if (Float.floatToIntBits(this.f23028g[i]) != Float.floatToIntBits(fArr[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m9341f(float f) {
        m10203c();
        int i = this.f23029h;
        float[] fArr = this.f23028g;
        if (i == fArr.length) {
            float[] fArr2 = new float[outline.m1602x(i, 3, 2, 1)];
            System.arraycopy(fArr, 0, fArr2, 0, i);
            this.f23028g = fArr2;
        }
        float[] fArr3 = this.f23028g;
        int i2 = this.f23029h;
        this.f23029h = i2 + 1;
        fArr3[i2] = f;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        m9342h(i);
        return Float.valueOf(this.f23028g[i]);
    }

    /* JADX INFO: renamed from: h */
    public final void m9342h(int i) {
        if (i < 0 || i >= this.f23029h) {
            throw new IndexOutOfBoundsException(m9343j(i));
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i = 0; i < this.f23029h; i++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f23028g[i]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i = this.f23029h;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f23028g[i2] == fFloatValue) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final String m9343j(int i) {
        return outline.m1586h(35, "Index:", i, ", Size:", this.f23029h);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        m10203c();
        m9342h(i);
        float[] fArr = this.f23028g;
        float f = fArr[i];
        int i2 = this.f23029h;
        if (i < i2 - 1) {
            System.arraycopy(fArr, i + 1, fArr, i, (i2 - i) - 1);
        }
        this.f23029h--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        m10203c();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f23028g;
        System.arraycopy(fArr, i2, fArr, i, this.f23029h - i2);
        this.f23029h -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        m10203c();
        m9342h(i);
        float[] fArr = this.f23028g;
        float f = fArr[i];
        fArr[i] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23029h;
    }

    public C4085a5(float[] fArr, int i) {
        this.f23028g = fArr;
        this.f23029h = i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p325k.AbstractC4335s3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        m9341f(((Float) obj).floatValue());
        return true;
    }
}
