package p007c.p190n.p194b.p209b.p221s1;

import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.s1.c, reason: use source file name */
/* JADX INFO: compiled from: ChunkIndex.java */
/* JADX INFO: loaded from: classes.dex */
public final class ChunkIndex implements SeekMap {

    /* JADX INFO: renamed from: a */
    public final int f7550a;

    /* JADX INFO: renamed from: b */
    public final int[] f7551b;

    /* JADX INFO: renamed from: c */
    public final long[] f7552c;

    /* JADX INFO: renamed from: d */
    public final long[] f7553d;

    /* JADX INFO: renamed from: e */
    public final long[] f7554e;

    /* JADX INFO: renamed from: f */
    public final long f7555f;

    public ChunkIndex(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f7551b = iArr;
        this.f7552c = jArr;
        this.f7553d = jArr2;
        this.f7554e = jArr3;
        int length = iArr.length;
        this.f7550a = length;
        if (length > 0) {
            this.f7555f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f7555f = 0L;
        }
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: d */
    public boolean mo3716d() {
        return true;
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: h */
    public SeekMap.a mo3717h(long j2) {
        int iM3118f = Util6.m3118f(this.f7554e, j2, true, true);
        SeekPoint seekPoint = new SeekPoint(this.f7554e[iM3118f], this.f7552c[iM3118f]);
        if (seekPoint.f8525b >= j2 || iM3118f == this.f7550a - 1) {
            return new SeekMap.a(seekPoint);
        }
        int i = iM3118f + 1;
        return new SeekMap.a(seekPoint, new SeekPoint(this.f7554e[i], this.f7552c[i]));
    }

    @Override // p007c.p190n.p194b.p209b.p221s1.SeekMap
    /* JADX INFO: renamed from: i */
    public long mo3718i() {
        return this.f7555f;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("ChunkIndex(length=");
        sbM1556G.append(this.f7550a);
        sbM1556G.append(", sizes=");
        sbM1556G.append(Arrays.toString(this.f7551b));
        sbM1556G.append(", offsets=");
        sbM1556G.append(Arrays.toString(this.f7552c));
        sbM1556G.append(", timeUs=");
        sbM1556G.append(Arrays.toString(this.f7554e));
        sbM1556G.append(", durationsUs=");
        sbM1556G.append(Arrays.toString(this.f7553d));
        sbM1556G.append(")");
        return sbM1556G.toString();
    }
}
