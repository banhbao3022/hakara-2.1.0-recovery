package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yn2 {

    /* JADX INFO: renamed from: a */
    public int f21934a;

    /* JADX INFO: renamed from: b */
    public long[] f21935b;

    public yn2() {
        this(32);
    }

    public yn2(int i) {
        this.f21935b = new long[32];
    }

    /* JADX INFO: renamed from: a */
    public final void m8809a(long j2) {
        int i = this.f21934a;
        long[] jArr = this.f21935b;
        if (i == jArr.length) {
            this.f21935b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.f21935b;
        int i2 = this.f21934a;
        this.f21934a = i2 + 1;
        jArr2[i2] = j2;
    }

    /* JADX INFO: renamed from: b */
    public final long m8810b(int i) {
        if (i < 0 || i >= this.f21934a) {
            throw new IndexOutOfBoundsException(outline.m1586h(46, "Invalid index ", i, ", size is ", this.f21934a));
        }
        return this.f21935b[i];
    }
}
