package p007c.p190n.p194b.p209b.p243w1;

/* JADX INFO: renamed from: c.n.b.b.w1.c0, reason: use source file name */
/* JADX INFO: compiled from: MediaPeriodId.java */
/* JADX INFO: loaded from: classes.dex */
public class MediaPeriodId {

    /* JADX INFO: renamed from: a */
    public final Object f8857a;

    /* JADX INFO: renamed from: b */
    public final int f8858b;

    /* JADX INFO: renamed from: c */
    public final int f8859c;

    /* JADX INFO: renamed from: d */
    public final long f8860d;

    /* JADX INFO: renamed from: e */
    public final int f8861e;

    public MediaPeriodId(Object obj) {
        this(obj, -1L);
    }

    /* JADX INFO: renamed from: a */
    public boolean m4081a() {
        return this.f8858b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaPeriodId)) {
            return false;
        }
        MediaPeriodId mediaPeriodId = (MediaPeriodId) obj;
        return this.f8857a.equals(mediaPeriodId.f8857a) && this.f8858b == mediaPeriodId.f8858b && this.f8859c == mediaPeriodId.f8859c && this.f8860d == mediaPeriodId.f8860d && this.f8861e == mediaPeriodId.f8861e;
    }

    public int hashCode() {
        return ((((((((this.f8857a.hashCode() + 527) * 31) + this.f8858b) * 31) + this.f8859c) * 31) + ((int) this.f8860d)) * 31) + this.f8861e;
    }

    public MediaPeriodId(MediaPeriodId mediaPeriodId) {
        this.f8857a = mediaPeriodId.f8857a;
        this.f8858b = mediaPeriodId.f8858b;
        this.f8859c = mediaPeriodId.f8859c;
        this.f8860d = mediaPeriodId.f8860d;
        this.f8861e = mediaPeriodId.f8861e;
    }

    public MediaPeriodId(Object obj, int i, int i2, long j2) {
        this.f8857a = obj;
        this.f8858b = i;
        this.f8859c = i2;
        this.f8860d = j2;
        this.f8861e = -1;
    }

    public MediaPeriodId(Object obj, int i, int i2, long j2, int i3) {
        this.f8857a = obj;
        this.f8858b = i;
        this.f8859c = i2;
        this.f8860d = j2;
        this.f8861e = i3;
    }

    public MediaPeriodId(Object obj, long j2) {
        this.f8857a = obj;
        this.f8858b = -1;
        this.f8859c = -1;
        this.f8860d = j2;
        this.f8861e = -1;
    }

    public MediaPeriodId(Object obj, long j2, int i) {
        this.f8857a = obj;
        this.f8858b = -1;
        this.f8859c = -1;
        this.f8860d = j2;
        this.f8861e = i;
    }
}
