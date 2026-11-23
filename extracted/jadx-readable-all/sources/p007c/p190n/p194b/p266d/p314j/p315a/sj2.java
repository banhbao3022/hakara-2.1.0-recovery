package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class sj2 {

    /* JADX INFO: renamed from: a */
    public final do2 f19593a = new do2(8);

    /* JADX INFO: renamed from: b */
    public int f19594b;

    /* JADX INFO: renamed from: a */
    public final long m8354a(bj2 bj2Var) throws InterruptedException, IOException {
        int i = 0;
        bj2Var.m6023c(this.f19593a.f13340a, 0, 1);
        int i2 = this.f19593a.f13340a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = 128;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        bj2Var.m6023c(this.f19593a.f13340a, 1, i4);
        while (i < i4) {
            i++;
            i5 = (this.f19593a.f13340a[i] & 255) + (i5 << 8);
        }
        this.f19594b = i4 + 1 + this.f19594b;
        return i5;
    }
}
