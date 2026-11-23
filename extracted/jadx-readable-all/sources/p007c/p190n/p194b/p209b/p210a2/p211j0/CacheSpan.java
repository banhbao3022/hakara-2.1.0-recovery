package p007c.p190n.p194b.p209b.p210a2.p211j0;

import java.io.File;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.b.a2.j0.j, reason: use source file name */
/* JADX INFO: compiled from: CacheSpan.java */
/* JADX INFO: loaded from: classes.dex */
public class CacheSpan implements Comparable<CacheSpan> {

    /* JADX INFO: renamed from: f */
    public final String f6074f;

    /* JADX INFO: renamed from: g */
    public final long f6075g;

    /* JADX INFO: renamed from: h */
    public final long f6076h;

    /* JADX INFO: renamed from: i */
    public final boolean f6077i;

    /* JADX INFO: renamed from: j */
    public final File f6078j;

    /* JADX INFO: renamed from: k */
    public final long f6079k;

    public CacheSpan(String str, long j2, long j3) {
        this(str, j2, j3, -9223372036854775807L, null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(CacheSpan cacheSpan) {
        if (!this.f6074f.equals(cacheSpan.f6074f)) {
            return this.f6074f.compareTo(cacheSpan.f6074f);
        }
        long j2 = this.f6075g - cacheSpan.f6075g;
        if (j2 == 0) {
            return 0;
        }
        return j2 < 0 ? -1 : 1;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("[");
        sbM1556G.append(this.f6075g);
        sbM1556G.append(", ");
        sbM1556G.append(this.f6076h);
        sbM1556G.append("]");
        return sbM1556G.toString();
    }

    public CacheSpan(String str, long j2, long j3, long j4, File file) {
        this.f6074f = str;
        this.f6075g = j2;
        this.f6076h = j3;
        this.f6077i = file != null;
        this.f6078j = file;
        this.f6079k = j4;
    }
}
