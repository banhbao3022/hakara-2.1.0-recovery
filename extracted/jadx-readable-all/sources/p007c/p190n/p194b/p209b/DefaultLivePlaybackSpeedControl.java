package p007c.p190n.p194b.p209b;

/* JADX INFO: renamed from: c.n.b.b.d0, reason: use source file name */
/* JADX INFO: compiled from: DefaultLivePlaybackSpeedControl.java */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultLivePlaybackSpeedControl implements LivePlaybackSpeedControl {

    /* JADX INFO: renamed from: a */
    public final float f6545a;

    /* JADX INFO: renamed from: b */
    public final float f6546b;

    /* JADX INFO: renamed from: c */
    public final long f6547c;

    /* JADX INFO: renamed from: d */
    public final float f6548d;

    /* JADX INFO: renamed from: e */
    public final long f6549e;

    /* JADX INFO: renamed from: f */
    public final long f6550f;

    /* JADX INFO: renamed from: g */
    public final float f6551g;

    /* JADX INFO: renamed from: n */
    public float f6558n;

    /* JADX INFO: renamed from: o */
    public float f6559o;

    /* JADX INFO: renamed from: h */
    public long f6552h = -9223372036854775807L;

    /* JADX INFO: renamed from: i */
    public long f6553i = -9223372036854775807L;

    /* JADX INFO: renamed from: k */
    public long f6555k = -9223372036854775807L;

    /* JADX INFO: renamed from: l */
    public long f6556l = -9223372036854775807L;

    /* JADX INFO: renamed from: p */
    public float f6560p = 1.0f;

    /* JADX INFO: renamed from: q */
    public long f6561q = -9223372036854775807L;

    /* JADX INFO: renamed from: j */
    public long f6554j = -9223372036854775807L;

    /* JADX INFO: renamed from: m */
    public long f6557m = -9223372036854775807L;

    /* JADX INFO: renamed from: r */
    public long f6562r = -9223372036854775807L;

    /* JADX INFO: renamed from: s */
    public long f6563s = -9223372036854775807L;

    /* JADX INFO: renamed from: c.n.b.b.d0$b */
    /* JADX INFO: compiled from: DefaultLivePlaybackSpeedControl.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public float f6564a = 0.97f;

        /* JADX INFO: renamed from: b */
        public float f6565b = 1.03f;

        /* JADX INFO: renamed from: c */
        public long f6566c = 1000;

        /* JADX INFO: renamed from: d */
        public float f6567d = 1.0E-7f;

        /* JADX INFO: renamed from: e */
        public long f6568e = C.m3236b(20);

        /* JADX INFO: renamed from: f */
        public long f6569f = C.m3236b(500);

        /* JADX INFO: renamed from: g */
        public float f6570g = 0.999f;
    }

    public DefaultLivePlaybackSpeedControl(float f, float f2, long j2, float f3, long j3, long j4, float f4, a aVar) {
        this.f6545a = f;
        this.f6546b = f2;
        this.f6547c = j2;
        this.f6548d = f3;
        this.f6549e = j3;
        this.f6550f = j4;
        this.f6551g = f4;
        this.f6559o = f;
        this.f6558n = f2;
    }

    /* JADX INFO: renamed from: a */
    public final void m3328a() {
        long j2 = this.f6552h;
        if (j2 != -9223372036854775807L) {
            long j3 = this.f6553i;
            if (j3 != -9223372036854775807L) {
                j2 = j3;
            }
            long j4 = this.f6555k;
            if (j4 != -9223372036854775807L && j2 < j4) {
                j2 = j4;
            }
            long j5 = this.f6556l;
            if (j5 != -9223372036854775807L && j2 > j5) {
                j2 = j5;
            }
        } else {
            j2 = -9223372036854775807L;
        }
        if (this.f6554j == j2) {
            return;
        }
        this.f6554j = j2;
        this.f6557m = j2;
        this.f6562r = -9223372036854775807L;
        this.f6563s = -9223372036854775807L;
        this.f6561q = -9223372036854775807L;
    }
}
