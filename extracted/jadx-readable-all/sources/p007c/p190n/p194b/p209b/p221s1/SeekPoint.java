package p007c.p190n.p194b.p209b.p221s1;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.b.s1.w, reason: use source file name */
/* JADX INFO: compiled from: SeekPoint.java */
/* JADX INFO: loaded from: classes.dex */
public final class SeekPoint {

    /* JADX INFO: renamed from: a */
    public static final SeekPoint f8524a = new SeekPoint(0, 0);

    /* JADX INFO: renamed from: b */
    public final long f8525b;

    /* JADX INFO: renamed from: c */
    public final long f8526c;

    public SeekPoint(long j2, long j3) {
        this.f8525b = j2;
        this.f8526c = j3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SeekPoint.class != obj.getClass()) {
            return false;
        }
        SeekPoint seekPoint = (SeekPoint) obj;
        return this.f8525b == seekPoint.f8525b && this.f8526c == seekPoint.f8526c;
    }

    public int hashCode() {
        return (((int) this.f8525b) * 31) + ((int) this.f8526c);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("[timeUs=");
        sbM1556G.append(this.f8525b);
        sbM1556G.append(", position=");
        sbM1556G.append(this.f8526c);
        sbM1556G.append("]");
        return sbM1556G.toString();
    }
}
