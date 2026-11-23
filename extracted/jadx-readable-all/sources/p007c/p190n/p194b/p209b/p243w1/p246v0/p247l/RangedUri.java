package p007c.p190n.p194b.p209b.p243w1.p246v0.p247l;

import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.w1.v0.l.h, reason: use source file name */
/* JADX INFO: compiled from: RangedUri.java */
/* JADX INFO: loaded from: classes.dex */
public final class RangedUri {

    /* JADX INFO: renamed from: a */
    public final long f9295a;

    /* JADX INFO: renamed from: b */
    public final long f9296b;

    /* JADX INFO: renamed from: c */
    public final String f9297c;

    /* JADX INFO: renamed from: d */
    public int f9298d;

    public RangedUri(String str, long j2, long j3) {
        this.f9297c = str == null ? "" : str;
        this.f9295a = j2;
        this.f9296b = j3;
    }

    /* JADX INFO: renamed from: a */
    public RangedUri m4282a(RangedUri rangedUri, String str) {
        String strM4584t = C2096e.m4584t(str, this.f9297c);
        if (rangedUri != null && strM4584t.equals(C2096e.m4584t(str, rangedUri.f9297c))) {
            long j2 = this.f9296b;
            if (j2 != -1) {
                long j3 = this.f9295a;
                if (j3 + j2 == rangedUri.f9295a) {
                    long j4 = rangedUri.f9296b;
                    return new RangedUri(strM4584t, j3, j4 == -1 ? -1L : j2 + j4);
                }
            }
            long j5 = rangedUri.f9296b;
            if (j5 != -1) {
                long j6 = rangedUri.f9295a;
                if (j6 + j5 == this.f9295a) {
                    return new RangedUri(strM4584t, j6, j2 == -1 ? -1L : j5 + j2);
                }
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RangedUri.class != obj.getClass()) {
            return false;
        }
        RangedUri rangedUri = (RangedUri) obj;
        return this.f9295a == rangedUri.f9295a && this.f9296b == rangedUri.f9296b && this.f9297c.equals(rangedUri.f9297c);
    }

    public int hashCode() {
        if (this.f9298d == 0) {
            this.f9298d = this.f9297c.hashCode() + ((((527 + ((int) this.f9295a)) * 31) + ((int) this.f9296b)) * 31);
        }
        return this.f9298d;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("RangedUri(referenceUri=");
        sbM1556G.append(this.f9297c);
        sbM1556G.append(", start=");
        sbM1556G.append(this.f9295a);
        sbM1556G.append(", length=");
        sbM1556G.append(this.f9296b);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }
}
