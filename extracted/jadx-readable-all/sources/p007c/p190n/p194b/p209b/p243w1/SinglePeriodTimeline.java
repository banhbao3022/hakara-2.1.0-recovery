package p007c.p190n.p194b.p209b.p243w1;

import android.net.Uri;
import java.util.Objects;
import p007c.p190n.p194b.p209b.MediaItem2;
import p007c.p190n.p194b.p209b.Timeline;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.w1.p0, reason: use source file name */
/* JADX INFO: compiled from: SinglePeriodTimeline.java */
/* JADX INFO: loaded from: classes.dex */
public final class SinglePeriodTimeline extends Timeline {

    /* JADX INFO: renamed from: b */
    public static final Object f9049b = new Object();

    /* JADX INFO: renamed from: c */
    public static final MediaItem2 f9050c;

    /* JADX INFO: renamed from: d */
    public final long f9051d;

    /* JADX INFO: renamed from: e */
    public final long f9052e;

    /* JADX INFO: renamed from: f */
    public final long f9053f;

    /* JADX INFO: renamed from: g */
    public final long f9054g;

    /* JADX INFO: renamed from: h */
    public final long f9055h;

    /* JADX INFO: renamed from: i */
    public final long f9056i;

    /* JADX INFO: renamed from: j */
    public final long f9057j;

    /* JADX INFO: renamed from: k */
    public final boolean f9058k;

    /* JADX INFO: renamed from: l */
    public final boolean f9059l;

    /* JADX INFO: renamed from: m */
    public final Object f9060m;

    /* JADX INFO: renamed from: n */
    public final MediaItem2 f9061n;

    /* JADX INFO: renamed from: o */
    public final MediaItem2.f f9062o;

    static {
        MediaItem2.c cVar = new MediaItem2.c();
        cVar.f7474a = "SinglePeriodTimeline";
        cVar.f7475b = Uri.EMPTY;
        f9050c = cVar.m3708a();
    }

    @Deprecated
    public SinglePeriodTimeline(long j2, boolean z, boolean z2, boolean z3, Object obj, Object obj2) {
        this(j2, j2, 0L, 0L, z, z2, z3, obj, obj2);
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: b */
    public int mo3457b(Object obj) {
        return f9049b.equals(obj) ? 0 : -1;
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: g */
    public Timeline.b mo3462g(int i, Timeline.b bVar, boolean z) {
        C2096e.m4569e(i, 0, 1);
        bVar.m3476f(null, z ? f9049b : null, 0, this.f9054g, -this.f9056i);
        return bVar;
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: i */
    public int mo3355i() {
        return 1;
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: m */
    public Object mo3467m(int i) {
        C2096e.m4569e(i, 0, 1);
        return f9049b;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002a A[PHI: r1
  0x002a: PHI (r1v2 long) = (r1v1 long), (r1v1 long), (r1v5 long) binds: [B:3:0x0012, B:5:0x0018, B:10:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: o */
    public Timeline.c mo3469o(int i, Timeline.c cVar, long j2) {
        long j3;
        C2096e.m4569e(i, 0, 1);
        long j4 = this.f9057j;
        boolean z = this.f9059l;
        if (!z || j2 == 0) {
            j3 = j4;
        } else {
            long j5 = this.f9055h;
            if (j5 != -9223372036854775807L) {
                j4 += j2;
                if (j4 <= j5) {
                    j3 = j4;
                }
            }
            j3 = -9223372036854775807L;
        }
        cVar.m3480d(Timeline.c.f6750a, this.f9061n, this.f9060m, this.f9051d, this.f9052e, this.f9053f, this.f9058k, z, this.f9062o, j3, this.f9055h, 0, 0, this.f9056i);
        return cVar;
    }

    @Override // p007c.p190n.p194b.p209b.Timeline
    /* JADX INFO: renamed from: p */
    public int mo3356p() {
        return 1;
    }

    public SinglePeriodTimeline(long j2, boolean z, boolean z2, boolean z3, Object obj, MediaItem2 mediaItem2) {
        this(j2, j2, 0L, 0L, z, z2, z3, obj, mediaItem2);
    }

    @Deprecated
    public SinglePeriodTimeline(long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, Object obj, Object obj2) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j2, j3, j4, j5, z, z2, z3, obj, obj2);
    }

    public SinglePeriodTimeline(long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3, Object obj, MediaItem2 mediaItem2) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j2, j3, j4, j5, z, z2, obj, mediaItem2, z3 ? mediaItem2.f7467c : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    public SinglePeriodTimeline(long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z, boolean z2, boolean z3, Object obj, Object obj2) {
        MediaItem2 mediaItem2 = f9050c;
        MediaItem2.c cVarM3707a = mediaItem2.m3707a();
        cVarM3707a.f7495v = obj2;
        this(j2, j3, j4, j5, j6, j7, j8, z, z2, obj, cVarM3707a.m3708a(), z3 ? mediaItem2.f7467c : null);
    }

    public SinglePeriodTimeline(long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z, boolean z2, Object obj, MediaItem2 mediaItem2, MediaItem2.f fVar) {
        this.f9051d = j2;
        this.f9052e = j3;
        this.f9053f = j4;
        this.f9054g = j5;
        this.f9055h = j6;
        this.f9056i = j7;
        this.f9057j = j8;
        this.f9058k = z;
        this.f9059l = z2;
        this.f9060m = obj;
        Objects.requireNonNull(mediaItem2);
        this.f9061n = mediaItem2;
        this.f9062o = fVar;
    }
}
