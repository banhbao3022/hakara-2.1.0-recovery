package p007c.p190n.p438f.p441j;

import java.util.Arrays;

/* JADX INFO: renamed from: c.n.f.j.a, reason: use source file name */
/* JADX INFO: compiled from: BitArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class BitArray implements Cloneable {

    /* JADX INFO: renamed from: f */
    public int[] f27641f;

    /* JADX INFO: renamed from: g */
    public int f27642g;

    public BitArray() {
        this.f27642g = 0;
        this.f27641f = new int[1];
    }

    /* JADX INFO: renamed from: a */
    public void m12342a(boolean z) {
        m12345e(this.f27642g + 1);
        if (z) {
            int[] iArr = this.f27641f;
            int i = this.f27642g;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f27642g++;
    }

    /* JADX INFO: renamed from: b */
    public void m12343b(BitArray bitArray) {
        int i = bitArray.f27642g;
        m12345e(this.f27642g + i);
        for (int i2 = 0; i2 < i; i2++) {
            m12342a(bitArray.m12346g(i2));
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return new BitArray((int[]) this.f27641f.clone(), this.f27642g);
    }

    /* JADX INFO: renamed from: d */
    public void m12344d(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        m12345e(this.f27642g + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            m12342a(z);
            i2--;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12345e(int i) {
        int[] iArr = this.f27641f;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[(i + 31) / 32];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f27641f = iArr2;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BitArray)) {
            return false;
        }
        BitArray bitArray = (BitArray) obj;
        return this.f27642g == bitArray.f27642g && Arrays.equals(this.f27641f, bitArray.f27641f);
    }

    /* JADX INFO: renamed from: g */
    public boolean m12346g(int i) {
        return ((1 << (i & 31)) & this.f27641f[i / 32]) != 0;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f27641f) + (this.f27642g * 31);
    }

    /* JADX INFO: renamed from: i */
    public int m12347i() {
        return (this.f27642g + 7) / 8;
    }

    public String toString() {
        int i = this.f27642g;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.f27642g; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(m12346g(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    public BitArray(int i) {
        this.f27642g = i;
        this.f27641f = new int[(i + 31) / 32];
    }

    public BitArray(int[] iArr, int i) {
        this.f27641f = iArr;
        this.f27642g = i;
    }
}
