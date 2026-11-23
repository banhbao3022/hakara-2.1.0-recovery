package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class do2 {

    /* JADX INFO: renamed from: a */
    public byte[] f13340a;

    /* JADX INFO: renamed from: b */
    public int f13341b;

    /* JADX INFO: renamed from: c */
    public int f13342c;

    public do2() {
    }

    public do2(int i) {
        this.f13340a = new byte[i];
        this.f13342c = i;
    }

    /* JADX INFO: renamed from: a */
    public final void m6384a(int i) {
        m6385b(m6388e() < i ? new byte[i] : this.f13340a, i);
    }

    /* JADX INFO: renamed from: b */
    public final void m6385b(byte[] bArr, int i) {
        this.f13340a = bArr;
        this.f13342c = i;
        this.f13341b = 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m6386c() {
        return this.f13342c - this.f13341b;
    }

    /* JADX INFO: renamed from: d */
    public final void m6387d(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f13340a.length) {
            z = true;
        }
        C2622l.m5366f1(z);
        this.f13342c = i;
    }

    /* JADX INFO: renamed from: e */
    public final int m6388e() {
        byte[] bArr = this.f13340a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* JADX INFO: renamed from: f */
    public final void m6389f(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f13342c) {
            z = true;
        }
        C2622l.m5366f1(z);
        this.f13341b = i;
    }

    /* JADX INFO: renamed from: g */
    public final void m6390g(int i) {
        m6389f(this.f13341b + i);
    }

    /* JADX INFO: renamed from: h */
    public final void m6391h(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f13340a, this.f13341b, bArr, i, i2);
        this.f13341b += i2;
    }

    /* JADX INFO: renamed from: i */
    public final int m6392i() {
        byte[] bArr = this.f13340a;
        int i = this.f13341b;
        this.f13341b = i + 1;
        return bArr[i] & 255;
    }

    /* JADX INFO: renamed from: j */
    public final int m6393j() {
        byte[] bArr = this.f13340a;
        int i = this.f13341b;
        int i2 = i + 1;
        this.f13341b = i2;
        byte b = bArr[i];
        this.f13341b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    /* JADX INFO: renamed from: k */
    public final long m6394k() {
        byte[] bArr = this.f13340a;
        int i = this.f13341b;
        int i2 = i + 1;
        this.f13341b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13341b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f13341b = i4;
        byte b3 = bArr[i3];
        this.f13341b = i4 + 1;
        return ((((long) b2) & 255) << 16) | ((((long) b) & 255) << 24) | ((((long) b3) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* JADX INFO: renamed from: l */
    public final int m6395l() {
        byte[] bArr = this.f13340a;
        int i = this.f13341b;
        int i2 = i + 1;
        this.f13341b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13341b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f13341b = i4;
        byte b3 = bArr[i3];
        this.f13341b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    /* JADX INFO: renamed from: m */
    public final long m6396m() {
        byte[] bArr = this.f13340a;
        int i = this.f13341b;
        int i2 = i + 1;
        this.f13341b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f13341b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f13341b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f13341b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f13341b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f13341b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f13341b = i8;
        byte b7 = bArr[i7];
        this.f13341b = i8 + 1;
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* JADX INFO: renamed from: n */
    public final int m6397n() {
        int iM6395l = m6395l();
        if (iM6395l >= 0) {
            return iM6395l;
        }
        throw new IllegalStateException(outline.m1585g(29, "Top bit not zero: ", iM6395l));
    }

    /* JADX INFO: renamed from: o */
    public final long m6398o() {
        long jM6396m = m6396m();
        if (jM6396m >= 0) {
            return jM6396m;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(jM6396m);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: p */
    public final String m6399p(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f13341b;
        int i3 = (i2 + i) - 1;
        String str = new String(this.f13340a, i2, (i3 >= this.f13342c || this.f13340a[i3] != 0) ? i : i - 1);
        this.f13341b += i;
        return str;
    }

    public do2(byte[] bArr) {
        this.f13340a = bArr;
        this.f13342c = bArr.length;
    }
}
