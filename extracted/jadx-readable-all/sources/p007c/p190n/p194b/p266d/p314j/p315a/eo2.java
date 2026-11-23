package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class eo2 {

    /* JADX INFO: renamed from: a */
    public final byte[] f13630a;

    /* JADX INFO: renamed from: b */
    public final int f13631b;

    /* JADX INFO: renamed from: c */
    public int f13632c;

    /* JADX INFO: renamed from: d */
    public int f13633d = 0;

    public eo2(byte[] bArr, int i, int i2) {
        this.f13630a = bArr;
        this.f13632c = i;
        this.f13631b = i2;
        m6658g();
    }

    /* JADX INFO: renamed from: a */
    public final void m6652a(int i) {
        int i2 = this.f13632c;
        int i3 = (i >> 3) + i2;
        this.f13632c = i3;
        int i4 = this.f13633d + (i & 7);
        this.f13633d = i4;
        if (i4 > 7) {
            this.f13632c = i3 + 1;
            this.f13633d = i4 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f13632c) {
                m6658g();
                return;
            } else if (m6657f(i2)) {
                this.f13632c++;
                i2 += 2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6653b() {
        return m6654c(1) == 1;
    }

    /* JADX INFO: renamed from: c */
    public final int m6654c(int i) {
        int i2;
        int i3;
        int i4 = i >> 3;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            int i7 = m6657f(this.f13632c + 1) ? this.f13632c + 2 : this.f13632c + 1;
            int i8 = this.f13633d;
            if (i8 != 0) {
                byte[] bArr = this.f13630a;
                i3 = ((bArr[i7] & 255) >>> (8 - i8)) | ((bArr[this.f13632c] & 255) << i8);
            } else {
                i3 = this.f13630a[this.f13632c];
            }
            i -= 8;
            i5 |= (255 & i3) << i;
            this.f13632c = i7;
        }
        if (i > 0) {
            int i9 = this.f13633d + i;
            byte b = (byte) (255 >> (8 - i));
            int i10 = m6657f(this.f13632c + 1) ? this.f13632c + 2 : this.f13632c + 1;
            if (i9 > 8) {
                byte[] bArr2 = this.f13630a;
                i2 = (b & (((255 & bArr2[i10]) >> (16 - i9)) | ((bArr2[this.f13632c] & 255) << (i9 - 8)))) | i5;
                this.f13632c = i10;
            } else {
                i2 = (b & ((255 & this.f13630a[this.f13632c]) >> (8 - i9))) | i5;
                if (i9 == 8) {
                    this.f13632c = i10;
                }
            }
            i5 = i2;
            this.f13633d = i9 % 8;
        }
        m6658g();
        return i5;
    }

    /* JADX INFO: renamed from: d */
    public final int m6655d() {
        int iM6656e = m6656e();
        return ((iM6656e + 1) / 2) * (iM6656e % 2 == 0 ? -1 : 1);
    }

    /* JADX INFO: renamed from: e */
    public final int m6656e() {
        int i = 0;
        while (!m6653b()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m6654c(i) : 0);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m6657f(int i) {
        if (i < 2 || i >= this.f13631b) {
            return false;
        }
        byte[] bArr = this.f13630a;
        return bArr[i] == 3 && bArr[i + (-2)] == 0 && bArr[i + (-1)] == 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m6658g() {
        int i;
        int i2;
        int i3 = this.f13632c;
        boolean z = true;
        if (i3 < 0 || (i = this.f13633d) < 0 || i >= 8 || (i3 >= (i2 = this.f13631b) && (i3 != i2 || i != 0))) {
            z = false;
        }
        C2622l.m5322V2(z);
    }
}
