package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class tj2 {

    /* JADX INFO: renamed from: a */
    public static final long[] f19855a = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: b */
    public final byte[] f19856b = new byte[8];

    /* JADX INFO: renamed from: c */
    public int f19857c;

    /* JADX INFO: renamed from: d */
    public int f19858d;

    /* JADX INFO: renamed from: a */
    public static int m8417a(int i) {
        int i2 = 0;
        while (i2 < 8) {
            long j2 = f19855a[i2] & ((long) i);
            i2++;
            if (j2 != 0) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static long m8418b(byte[] bArr, int i, boolean z) {
        long j2 = ((long) bArr[0]) & 255;
        if (z) {
            j2 &= ~f19855a[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j2 = (j2 << 8) | (((long) bArr[i2]) & 255);
        }
        return j2;
    }

    /* JADX INFO: renamed from: c */
    public final long m8419c(bj2 bj2Var, boolean z, boolean z2, int i) throws InterruptedException, IOException {
        if (this.f19857c == 0) {
            if (!bj2Var.m6021a(this.f19856b, 0, 1, z)) {
                return -1L;
            }
            int iM8417a = m8417a(this.f19856b[0] & 255);
            this.f19858d = iM8417a;
            if (iM8417a == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f19857c = 1;
        }
        int i2 = this.f19858d;
        if (i2 > i) {
            this.f19857c = 0;
            return -2L;
        }
        if (i2 != 1) {
            bj2Var.m6021a(this.f19856b, 1, i2 - 1, false);
        }
        this.f19857c = 0;
        return m8418b(this.f19856b, this.f19858d, z2);
    }
}
