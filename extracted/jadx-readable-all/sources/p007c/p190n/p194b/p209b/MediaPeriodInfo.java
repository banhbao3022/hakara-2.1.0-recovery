package p007c.p190n.p194b.p209b;

import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p243w1.MediaSource2;

/* JADX INFO: renamed from: c.n.b.b.v0, reason: use source file name */
/* JADX INFO: compiled from: MediaPeriodInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class MediaPeriodInfo {

    /* JADX INFO: renamed from: a */
    public final MediaSource2.a f8809a;

    /* JADX INFO: renamed from: b */
    public final long f8810b;

    /* JADX INFO: renamed from: c */
    public final long f8811c;

    /* JADX INFO: renamed from: d */
    public final long f8812d;

    /* JADX INFO: renamed from: e */
    public final long f8813e;

    /* JADX INFO: renamed from: f */
    public final boolean f8814f;

    /* JADX INFO: renamed from: g */
    public final boolean f8815g;

    /* JADX INFO: renamed from: h */
    public final boolean f8816h;

    public MediaPeriodInfo(MediaSource2.a aVar, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3) {
        this.f8809a = aVar;
        this.f8810b = j2;
        this.f8811c = j3;
        this.f8812d = j4;
        this.f8813e = j5;
        this.f8814f = z;
        this.f8815g = z2;
        this.f8816h = z3;
    }

    /* JADX INFO: renamed from: a */
    public MediaPeriodInfo m4047a(long j2) {
        return j2 == this.f8811c ? this : new MediaPeriodInfo(this.f8809a, this.f8810b, j2, this.f8812d, this.f8813e, this.f8814f, this.f8815g, this.f8816h);
    }

    /* JADX INFO: renamed from: b */
    public MediaPeriodInfo m4048b(long j2) {
        return j2 == this.f8810b ? this : new MediaPeriodInfo(this.f8809a, j2, this.f8811c, this.f8812d, this.f8813e, this.f8814f, this.f8815g, this.f8816h);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaPeriodInfo.class != obj.getClass()) {
            return false;
        }
        MediaPeriodInfo mediaPeriodInfo = (MediaPeriodInfo) obj;
        return this.f8810b == mediaPeriodInfo.f8810b && this.f8811c == mediaPeriodInfo.f8811c && this.f8812d == mediaPeriodInfo.f8812d && this.f8813e == mediaPeriodInfo.f8813e && this.f8814f == mediaPeriodInfo.f8814f && this.f8815g == mediaPeriodInfo.f8815g && this.f8816h == mediaPeriodInfo.f8816h && Util6.m3113a(this.f8809a, mediaPeriodInfo.f8809a);
    }

    public int hashCode() {
        return ((((((((((((((this.f8809a.hashCode() + 527) * 31) + ((int) this.f8810b)) * 31) + ((int) this.f8811c)) * 31) + ((int) this.f8812d)) * 31) + ((int) this.f8813e)) * 31) + (this.f8814f ? 1 : 0)) * 31) + (this.f8815g ? 1 : 0)) * 31) + (this.f8816h ? 1 : 0);
    }
}
