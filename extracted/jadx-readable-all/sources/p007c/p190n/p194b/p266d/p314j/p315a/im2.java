package p007c.p190n.p194b.p266d.p314j.p315a;

import com.facebook.stetho.websocket.CloseCodes;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class im2 {

    /* JADX INFO: renamed from: i */
    public int f15310i;

    /* JADX INFO: renamed from: j */
    public int f15311j;

    /* JADX INFO: renamed from: k */
    public int f15312k;

    /* JADX INFO: renamed from: l */
    public int f15313l;

    /* JADX INFO: renamed from: q */
    public ch2 f15318q;

    /* JADX INFO: renamed from: a */
    public int f15302a = CloseCodes.NORMAL_CLOSURE;

    /* JADX INFO: renamed from: b */
    public int[] f15303b = new int[CloseCodes.NORMAL_CLOSURE];

    /* JADX INFO: renamed from: c */
    public long[] f15304c = new long[CloseCodes.NORMAL_CLOSURE];

    /* JADX INFO: renamed from: f */
    public long[] f15307f = new long[CloseCodes.NORMAL_CLOSURE];

    /* JADX INFO: renamed from: e */
    public int[] f15306e = new int[CloseCodes.NORMAL_CLOSURE];

    /* JADX INFO: renamed from: d */
    public int[] f15305d = new int[CloseCodes.NORMAL_CLOSURE];

    /* JADX INFO: renamed from: g */
    public kj2[] f15308g = new kj2[CloseCodes.NORMAL_CLOSURE];

    /* JADX INFO: renamed from: h */
    public ch2[] f15309h = new ch2[CloseCodes.NORMAL_CLOSURE];

    /* JADX INFO: renamed from: m */
    public long f15314m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: n */
    public long f15315n = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p */
    public boolean f15317p = true;

    /* JADX INFO: renamed from: o */
    public boolean f15316o = true;

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m7281a() {
        return this.f15310i != 0;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m7282b(long j2, int i, long j3, int i2, kj2 kj2Var) {
        if (this.f15316o) {
            if ((i & 1) == 0) {
                return;
            } else {
                this.f15316o = false;
            }
        }
        C2622l.m5322V2(!this.f15317p);
        synchronized (this) {
            this.f15315n = Math.max(this.f15315n, j2);
            long[] jArr = this.f15307f;
            int i3 = this.f15313l;
            jArr[i3] = j2;
            long[] jArr2 = this.f15304c;
            jArr2[i3] = j3;
            this.f15305d[i3] = i2;
            this.f15306e[i3] = i;
            this.f15308g[i3] = kj2Var;
            this.f15309h[i3] = this.f15318q;
            this.f15303b[i3] = 0;
            int i4 = this.f15310i + 1;
            this.f15310i = i4;
            int i5 = this.f15302a;
            if (i4 != i5) {
                int i6 = i3 + 1;
                this.f15313l = i6;
                if (i6 == i5) {
                    this.f15313l = 0;
                    return;
                }
                return;
            }
            int i7 = i5 + CloseCodes.NORMAL_CLOSURE;
            int[] iArr = new int[i7];
            long[] jArr3 = new long[i7];
            long[] jArr4 = new long[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            kj2[] kj2VarArr = new kj2[i7];
            ch2[] ch2VarArr = new ch2[i7];
            int i8 = this.f15312k;
            int i9 = i5 - i8;
            System.arraycopy(jArr2, i8, jArr3, 0, i9);
            System.arraycopy(this.f15307f, this.f15312k, jArr4, 0, i9);
            System.arraycopy(this.f15306e, this.f15312k, iArr2, 0, i9);
            System.arraycopy(this.f15305d, this.f15312k, iArr3, 0, i9);
            System.arraycopy(this.f15308g, this.f15312k, kj2VarArr, 0, i9);
            System.arraycopy(this.f15309h, this.f15312k, ch2VarArr, 0, i9);
            System.arraycopy(this.f15303b, this.f15312k, iArr, 0, i9);
            int i10 = this.f15312k;
            System.arraycopy(this.f15304c, 0, jArr3, i9, i10);
            System.arraycopy(this.f15307f, 0, jArr4, i9, i10);
            System.arraycopy(this.f15306e, 0, iArr2, i9, i10);
            System.arraycopy(this.f15305d, 0, iArr3, i9, i10);
            System.arraycopy(this.f15308g, 0, kj2VarArr, i9, i10);
            System.arraycopy(this.f15309h, 0, ch2VarArr, i9, i10);
            System.arraycopy(this.f15303b, 0, iArr, i9, i10);
            this.f15304c = jArr3;
            this.f15307f = jArr4;
            this.f15306e = iArr2;
            this.f15305d = iArr3;
            this.f15308g = kj2VarArr;
            this.f15309h = ch2VarArr;
            this.f15303b = iArr;
            this.f15312k = 0;
            int i11 = this.f15302a;
            this.f15313l = i11;
            this.f15310i = i11;
            this.f15302a = i7;
        }
    }
}
