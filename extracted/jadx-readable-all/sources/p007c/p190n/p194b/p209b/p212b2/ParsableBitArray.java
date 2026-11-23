package p007c.p190n.p194b.p209b.p212b2;

import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.b2.v, reason: use source file name */
/* JADX INFO: compiled from: ParsableBitArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class ParsableBitArray {

    /* JADX INFO: renamed from: a */
    public byte[] f6388a;

    /* JADX INFO: renamed from: b */
    public int f6389b;

    /* JADX INFO: renamed from: c */
    public int f6390c;

    /* JADX INFO: renamed from: d */
    public int f6391d;

    public ParsableBitArray() {
        this.f6388a = Util6.f6312f;
    }

    /* JADX INFO: renamed from: a */
    public final void m3177a() {
        int i;
        int i2 = this.f6389b;
        C2096e.m4570f(i2 >= 0 && (i2 < (i = this.f6391d) || (i2 == i && this.f6390c == 0)));
    }

    /* JADX INFO: renamed from: b */
    public int m3178b() {
        return ((this.f6391d - this.f6389b) * 8) - this.f6390c;
    }

    /* JADX INFO: renamed from: c */
    public void m3179c() {
        if (this.f6390c == 0) {
            return;
        }
        this.f6390c = 0;
        this.f6389b++;
        m3177a();
    }

    /* JADX INFO: renamed from: d */
    public int m3180d() {
        C2096e.m4570f(this.f6390c == 0);
        return this.f6389b;
    }

    /* JADX INFO: renamed from: e */
    public int m3181e() {
        return (this.f6389b * 8) + this.f6390c;
    }

    /* JADX INFO: renamed from: f */
    public boolean m3182f() {
        boolean z = (this.f6388a[this.f6389b] & (128 >> this.f6390c)) != 0;
        m3188l();
        return z;
    }

    /* JADX INFO: renamed from: g */
    public int m3183g(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f6390c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f6390c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f6390c = i4;
            byte[] bArr = this.f6388a;
            int i5 = this.f6389b;
            this.f6389b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f6388a;
        int i6 = this.f6389b;
        int i7 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f6390c = 0;
            this.f6389b = i6 + 1;
        }
        m3177a();
        return i7;
    }

    /* JADX INFO: renamed from: h */
    public void m3184h(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + i;
        while (i < i3) {
            byte[] bArr2 = this.f6388a;
            int i4 = this.f6389b;
            int i5 = i4 + 1;
            this.f6389b = i5;
            byte b = bArr2[i4];
            int i6 = this.f6390c;
            bArr[i] = (byte) (b << i6);
            bArr[i] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | bArr[i]);
            i++;
        }
        int i7 = i2 & 7;
        if (i7 == 0) {
            return;
        }
        bArr[i3] = (byte) (bArr[i3] & (255 >> i7));
        int i8 = this.f6390c;
        if (i8 + i7 > 8) {
            int i9 = bArr[i3];
            byte[] bArr3 = this.f6388a;
            int i10 = this.f6389b;
            this.f6389b = i10 + 1;
            bArr[i3] = (byte) (i9 | ((bArr3[i10] & 255) << i8));
            this.f6390c = i8 - 8;
        }
        int i11 = this.f6390c + i7;
        this.f6390c = i11;
        byte[] bArr4 = this.f6388a;
        int i12 = this.f6389b;
        bArr[i3] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i7))) | bArr[i3]);
        if (i11 == 8) {
            this.f6390c = 0;
            this.f6389b = i12 + 1;
        }
        m3177a();
    }

    /* JADX INFO: renamed from: i */
    public void m3185i(byte[] bArr, int i, int i2) {
        C2096e.m4570f(this.f6390c == 0);
        System.arraycopy(this.f6388a, this.f6389b, bArr, i, i2);
        this.f6389b += i2;
        m3177a();
    }

    /* JADX INFO: renamed from: j */
    public void m3186j(byte[] bArr, int i) {
        this.f6388a = bArr;
        this.f6389b = 0;
        this.f6390c = 0;
        this.f6391d = i;
    }

    /* JADX INFO: renamed from: k */
    public void m3187k(int i) {
        int i2 = i / 8;
        this.f6389b = i2;
        this.f6390c = i - (i2 * 8);
        m3177a();
    }

    /* JADX INFO: renamed from: l */
    public void m3188l() {
        int i = this.f6390c + 1;
        this.f6390c = i;
        if (i == 8) {
            this.f6390c = 0;
            this.f6389b++;
        }
        m3177a();
    }

    /* JADX INFO: renamed from: m */
    public void m3189m(int i) {
        int i2 = i / 8;
        int i3 = this.f6389b + i2;
        this.f6389b = i3;
        int i4 = (i - (i2 * 8)) + this.f6390c;
        this.f6390c = i4;
        if (i4 > 7) {
            this.f6389b = i3 + 1;
            this.f6390c = i4 - 8;
        }
        m3177a();
    }

    /* JADX INFO: renamed from: n */
    public void m3190n(int i) {
        C2096e.m4570f(this.f6390c == 0);
        this.f6389b += i;
        m3177a();
    }

    public ParsableBitArray(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public ParsableBitArray(byte[] bArr, int i) {
        this.f6388a = bArr;
        this.f6391d = i;
    }
}
