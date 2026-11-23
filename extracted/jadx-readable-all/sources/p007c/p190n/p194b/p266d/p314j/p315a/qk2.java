package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class qk2 {

    /* JADX INFO: renamed from: a */
    public final int f18369a;

    /* JADX INFO: renamed from: b */
    public final long[] f18370b;

    /* JADX INFO: renamed from: c */
    public final int[] f18371c;

    /* JADX INFO: renamed from: d */
    public final int f18372d;

    /* JADX INFO: renamed from: e */
    public final long[] f18373e;

    /* JADX INFO: renamed from: f */
    public final int[] f18374f;

    public qk2(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        int length = jArr2.length;
        C2622l.m5366f1(iArr.length == length);
        int length2 = jArr.length;
        C2622l.m5366f1(length2 == length);
        C2622l.m5366f1(iArr2.length == length);
        this.f18370b = jArr;
        this.f18371c = iArr;
        this.f18372d = i;
        this.f18373e = jArr2;
        this.f18374f = iArr2;
        this.f18369a = length2;
    }

    /* JADX INFO: renamed from: a */
    public final int m8212a(long j2) {
        for (int iM7371c = jo2.m7371c(this.f18373e, j2, true, false); iM7371c >= 0; iM7371c--) {
            if ((this.f18374f[iM7371c] & 1) != 0) {
                return iM7371c;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final int m8213b(long j2) {
        for (int iM7372d = jo2.m7372d(this.f18373e, j2, true, false); iM7372d < this.f18373e.length; iM7372d++) {
            if ((this.f18374f[iM7372d] & 1) != 0) {
                return iM7372d;
            }
        }
        return -1;
    }
}
