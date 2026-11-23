package p007c.p190n.p194b.p209b.p213c2;

import java.util.Arrays;

/* JADX INFO: renamed from: c.n.b.b.c2.n, reason: use source file name */
/* JADX INFO: compiled from: FixedFrameRateEstimator.java */
/* JADX INFO: loaded from: classes.dex */
public final class FixedFrameRateEstimator {

    /* JADX INFO: renamed from: c */
    public boolean f6457c;

    /* JADX INFO: renamed from: e */
    public int f6459e;

    /* JADX INFO: renamed from: a */
    public a f6455a = new a();

    /* JADX INFO: renamed from: b */
    public a f6456b = new a();

    /* JADX INFO: renamed from: d */
    public long f6458d = -9223372036854775807L;

    /* JADX INFO: renamed from: c.n.b.b.c2.n$a */
    /* JADX INFO: compiled from: FixedFrameRateEstimator.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public long f6460a;

        /* JADX INFO: renamed from: b */
        public long f6461b;

        /* JADX INFO: renamed from: c */
        public long f6462c;

        /* JADX INFO: renamed from: d */
        public long f6463d;

        /* JADX INFO: renamed from: e */
        public long f6464e;

        /* JADX INFO: renamed from: f */
        public long f6465f;

        /* JADX INFO: renamed from: g */
        public final boolean[] f6466g = new boolean[15];

        /* JADX INFO: renamed from: h */
        public int f6467h;

        /* JADX INFO: renamed from: a */
        public boolean m3265a() {
            return this.f6463d > 15 && this.f6467h == 0;
        }

        /* JADX INFO: renamed from: b */
        public void m3266b(long j2) {
            long j3 = this.f6463d;
            if (j3 == 0) {
                this.f6460a = j2;
            } else if (j3 == 1) {
                long j4 = j2 - this.f6460a;
                this.f6461b = j4;
                this.f6465f = j4;
                this.f6464e = 1L;
            } else {
                long j5 = j2 - this.f6462c;
                int i = (int) (j3 % 15);
                if (Math.abs(j5 - this.f6461b) <= 1000000) {
                    this.f6464e++;
                    this.f6465f += j5;
                    boolean[] zArr = this.f6466g;
                    if (zArr[i]) {
                        zArr[i] = false;
                        this.f6467h--;
                    }
                } else {
                    boolean[] zArr2 = this.f6466g;
                    if (!zArr2[i]) {
                        zArr2[i] = true;
                        this.f6467h++;
                    }
                }
            }
            this.f6463d++;
            this.f6462c = j2;
        }

        /* JADX INFO: renamed from: c */
        public void m3267c() {
            this.f6463d = 0L;
            this.f6464e = 0L;
            this.f6465f = 0L;
            this.f6467h = 0;
            Arrays.fill(this.f6466g, false);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m3264a() {
        return this.f6455a.m3265a();
    }
}
