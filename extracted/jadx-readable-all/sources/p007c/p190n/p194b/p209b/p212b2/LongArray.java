package p007c.p190n.p194b.p209b.p212b2;

import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.b.b2.q, reason: use source file name */
/* JADX INFO: compiled from: LongArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class LongArray {

    /* JADX INFO: renamed from: a */
    public int f6358a;

    /* JADX INFO: renamed from: b */
    public long[] f6359b;

    public LongArray() {
        this(32);
    }

    /* JADX INFO: renamed from: a */
    public void m3157a(long j2) {
        int i = this.f6358a;
        long[] jArr = this.f6359b;
        if (i == jArr.length) {
            this.f6359b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.f6359b;
        int i2 = this.f6358a;
        this.f6358a = i2 + 1;
        jArr2[i2] = j2;
    }

    /* JADX INFO: renamed from: b */
    public long m3158b(int i) {
        if (i >= 0 && i < this.f6358a) {
            return this.f6359b[i];
        }
        StringBuilder sbM1557H = outline.m1557H("Invalid index ", i, ", size is ");
        sbM1557H.append(this.f6358a);
        throw new IndexOutOfBoundsException(sbM1557H.toString());
    }

    public LongArray(int i) {
        this.f6359b = new long[i];
    }
}
