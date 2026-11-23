package p636z0.p644b.p645c;

/* JADX INFO: renamed from: z0.b.c.t, reason: use source file name */
/* JADX INFO: compiled from: TwilightCalculator.java */
/* JADX INFO: loaded from: classes.dex */
public class TwilightCalculator {

    /* JADX INFO: renamed from: a */
    public static TwilightCalculator f34544a;

    /* JADX INFO: renamed from: b */
    public long f34545b;

    /* JADX INFO: renamed from: c */
    public long f34546c;

    /* JADX INFO: renamed from: d */
    public int f34547d;

    /* JADX INFO: renamed from: a */
    public void m14685a(long j2, double d, double d2) {
        float f = (j2 - 946728000000L) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = f2;
        double dSin = (Math.sin(f2 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f2) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + ((double) (Math.round(((double) (f - 9.0E-4f)) - d4) + 9.0E-4f)) + d4;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d5 = 0.01745329238474369d * d;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d5))) / (Math.cos(dAsin) * Math.cos(d5));
        if (dSin3 >= 1.0d) {
            this.f34547d = 1;
            this.f34545b = -1L;
            this.f34546c = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f34547d = 0;
                this.f34545b = -1L;
                this.f34546c = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f34545b = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f34546c = jRound;
            if (jRound >= j2 || this.f34545b <= j2) {
                this.f34547d = 1;
            } else {
                this.f34547d = 0;
            }
        }
    }
}
