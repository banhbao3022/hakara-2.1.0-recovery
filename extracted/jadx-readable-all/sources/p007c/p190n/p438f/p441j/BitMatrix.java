package p007c.p190n.p438f.p441j;

import java.util.Arrays;

/* JADX INFO: renamed from: c.n.f.j.b, reason: use source file name */
/* JADX INFO: compiled from: BitMatrix.java */
/* JADX INFO: loaded from: classes.dex */
public final class BitMatrix implements Cloneable {

    /* JADX INFO: renamed from: f */
    public final int f27643f;

    /* JADX INFO: renamed from: g */
    public final int f27644g;

    /* JADX INFO: renamed from: h */
    public final int f27645h;

    /* JADX INFO: renamed from: i */
    public final int[] f27646i;

    public BitMatrix(int i) {
        this(i, i);
    }

    /* JADX INFO: renamed from: a */
    public boolean m12348a(int i, int i2) {
        return ((this.f27646i[(i / 32) + (i2 * this.f27645h)] >>> (i & 31)) & 1) != 0;
    }

    /* JADX INFO: renamed from: b */
    public void m12349b(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.f27645h);
        int[] iArr = this.f27646i;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public Object clone() throws CloneNotSupportedException {
        return new BitMatrix(this.f27643f, this.f27644g, this.f27645h, (int[]) this.f27646i.clone());
    }

    /* JADX INFO: renamed from: d */
    public void m12350d(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.f27644g || i5 > this.f27643f) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.f27645h * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.f27646i;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BitMatrix)) {
            return false;
        }
        BitMatrix bitMatrix = (BitMatrix) obj;
        return this.f27643f == bitMatrix.f27643f && this.f27644g == bitMatrix.f27644g && this.f27645h == bitMatrix.f27645h && Arrays.equals(this.f27646i, bitMatrix.f27646i);
    }

    public int hashCode() {
        int i = this.f27643f;
        return Arrays.hashCode(this.f27646i) + (((((((i * 31) + i) * 31) + this.f27644g) * 31) + this.f27645h) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f27643f + 1) * this.f27644g);
        for (int i = 0; i < this.f27644g; i++) {
            for (int i2 = 0; i2 < this.f27643f; i2++) {
                sb.append(m12348a(i2, i) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public BitMatrix(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f27643f = i;
        this.f27644g = i2;
        int i3 = (i + 31) / 32;
        this.f27645h = i3;
        this.f27646i = new int[i3 * i2];
    }

    public BitMatrix(int i, int i2, int i3, int[] iArr) {
        this.f27643f = i;
        this.f27644g = i2;
        this.f27645h = i3;
        this.f27646i = iArr;
    }
}
