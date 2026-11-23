package p007c.p190n.p194b.p209b.p221s1;

import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.s1.z, reason: use source file name */
/* JADX INFO: compiled from: VorbisBitArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class VorbisBitArray {

    /* JADX INFO: renamed from: a */
    public final byte[] f8531a;

    /* JADX INFO: renamed from: b */
    public final int f8532b;

    /* JADX INFO: renamed from: c */
    public int f8533c;

    /* JADX INFO: renamed from: d */
    public int f8534d;

    public VorbisBitArray(byte[] bArr) {
        this.f8531a = bArr;
        this.f8532b = bArr.length;
    }

    /* JADX INFO: renamed from: a */
    public boolean m3928a() {
        boolean z = (((this.f8531a[this.f8533c] & 255) >> this.f8534d) & 1) == 1;
        m3930c(1);
        return z;
    }

    /* JADX INFO: renamed from: b */
    public int m3929b(int i) {
        int i2 = this.f8533c;
        int iMin = Math.min(i, 8 - this.f8534d);
        int i3 = i2 + 1;
        int i4 = ((this.f8531a[i2] & 255) >> this.f8534d) & (255 >> (8 - iMin));
        while (iMin < i) {
            i4 |= (this.f8531a[i3] & 255) << iMin;
            iMin += 8;
            i3++;
        }
        int i5 = i4 & ((-1) >>> (32 - i));
        m3930c(i);
        return i5;
    }

    /* JADX INFO: renamed from: c */
    public void m3930c(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f8533c + i3;
        this.f8533c = i4;
        int i5 = (i - (i3 * 8)) + this.f8534d;
        this.f8534d = i5;
        boolean z = true;
        if (i5 > 7) {
            this.f8533c = i4 + 1;
            this.f8534d = i5 - 8;
        }
        int i6 = this.f8533c;
        if (i6 < 0 || (i6 >= (i2 = this.f8532b) && (i6 != i2 || this.f8534d != 0))) {
            z = false;
        }
        C2096e.m4570f(z);
    }
}
