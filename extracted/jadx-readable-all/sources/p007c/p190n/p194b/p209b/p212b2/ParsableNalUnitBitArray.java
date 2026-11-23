package p007c.p190n.p194b.p209b.p212b2;

import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.b2.x, reason: use source file name */
/* JADX INFO: compiled from: ParsableNalUnitBitArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class ParsableNalUnitBitArray {

    /* JADX INFO: renamed from: a */
    public byte[] f6395a;

    /* JADX INFO: renamed from: b */
    public int f6396b;

    /* JADX INFO: renamed from: c */
    public int f6397c;

    /* JADX INFO: renamed from: d */
    public int f6398d = 0;

    public ParsableNalUnitBitArray(byte[] bArr, int i, int i2) {
        this.f6395a = bArr;
        this.f6397c = i;
        this.f6396b = i2;
        m3222a();
    }

    /* JADX INFO: renamed from: a */
    public final void m3222a() {
        int i;
        int i2 = this.f6397c;
        C2096e.m4570f(i2 >= 0 && (i2 < (i = this.f6396b) || (i2 == i && this.f6398d == 0)));
    }

    /* JADX INFO: renamed from: b */
    public boolean m3223b(int i) {
        int i2 = this.f6397c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f6398d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f6396b) {
                break;
            }
            if (m3230i(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i6 = this.f6396b;
        if (i4 >= i6) {
            return i4 == i6 && i5 == 0;
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public boolean m3224c() {
        int i = this.f6397c;
        int i2 = this.f6398d;
        int i3 = 0;
        while (this.f6397c < this.f6396b && !m3225d()) {
            i3++;
        }
        boolean z = this.f6397c == this.f6396b;
        this.f6397c = i;
        this.f6398d = i2;
        return !z && m3223b((i3 * 2) + 1);
    }

    /* JADX INFO: renamed from: d */
    public boolean m3225d() {
        boolean z = (this.f6395a[this.f6397c] & (128 >> this.f6398d)) != 0;
        m3231j();
        return z;
    }

    /* JADX INFO: renamed from: e */
    public int m3226e(int i) {
        int i2;
        this.f6398d += i;
        int i3 = 0;
        while (true) {
            i2 = this.f6398d;
            int i4 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f6398d = i5;
            byte[] bArr = this.f6395a;
            int i6 = this.f6397c;
            i3 |= (bArr[i6] & 255) << i5;
            if (!m3230i(i6 + 1)) {
                i4 = 1;
            }
            this.f6397c = i6 + i4;
        }
        byte[] bArr2 = this.f6395a;
        int i7 = this.f6397c;
        int i8 = ((-1) >>> (32 - i)) & (i3 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f6398d = 0;
            this.f6397c = i7 + (m3230i(i7 + 1) ? 2 : 1);
        }
        m3222a();
        return i8;
    }

    /* JADX INFO: renamed from: f */
    public final int m3227f() {
        int i = 0;
        while (!m3225d()) {
            i++;
        }
        return ((1 << i) - 1) + (i > 0 ? m3226e(i) : 0);
    }

    /* JADX INFO: renamed from: g */
    public int m3228g() {
        int iM3227f = m3227f();
        return ((iM3227f + 1) / 2) * (iM3227f % 2 == 0 ? -1 : 1);
    }

    /* JADX INFO: renamed from: h */
    public void m3229h(byte[] bArr, int i, int i2) {
        this.f6395a = bArr;
        this.f6397c = i;
        this.f6396b = i2;
        this.f6398d = 0;
        m3222a();
    }

    /* JADX INFO: renamed from: i */
    public final boolean m3230i(int i) {
        if (2 <= i && i < this.f6396b) {
            byte[] bArr = this.f6395a;
            if (bArr[i] == 3 && bArr[i - 2] == 0 && bArr[i - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void m3231j() {
        int i = this.f6398d + 1;
        this.f6398d = i;
        if (i == 8) {
            this.f6398d = 0;
            int i2 = this.f6397c;
            this.f6397c = i2 + (m3230i(i2 + 1) ? 2 : 1);
        }
        m3222a();
    }

    /* JADX INFO: renamed from: k */
    public void m3232k(int i) {
        int i2 = this.f6397c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f6397c = i4;
        int i5 = (i - (i3 * 8)) + this.f6398d;
        this.f6398d = i5;
        if (i5 > 7) {
            this.f6397c = i4 + 1;
            this.f6398d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f6397c) {
                m3222a();
                return;
            } else if (m3230i(i2)) {
                this.f6397c++;
                i2 += 2;
            }
        }
    }
}
