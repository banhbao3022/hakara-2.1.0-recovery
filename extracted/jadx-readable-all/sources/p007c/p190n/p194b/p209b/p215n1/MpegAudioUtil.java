package p007c.p190n.p194b.p209b.p215n1;

import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.b.b.n1.c0, reason: use source file name */
/* JADX INFO: compiled from: MpegAudioUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class MpegAudioUtil {

    /* JADX INFO: renamed from: a */
    public static final String[] f6993a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b */
    public static final int[] f6994b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c */
    public static final int[] f6995c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d */
    public static final int[] f6996d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e */
    public static final int[] f6997e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f */
    public static final int[] f6998f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g */
    public static final int[] f6999g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: renamed from: c.n.b.b.n1.c0$a */
    /* JADX INFO: compiled from: MpegAudioUtil.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public int f7000a;

        /* JADX INFO: renamed from: b */
        public String f7001b;

        /* JADX INFO: renamed from: c */
        public int f7002c;

        /* JADX INFO: renamed from: d */
        public int f7003d;

        /* JADX INFO: renamed from: e */
        public int f7004e;

        /* JADX INFO: renamed from: f */
        public int f7005f;

        /* JADX INFO: renamed from: g */
        public int f7006g;

        /* JADX INFO: renamed from: a */
        public boolean m3532a(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            if (!MpegAudioUtil.m3530c(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f7000a = i2;
            this.f7001b = MpegAudioUtil.f6993a[3 - i3];
            int i6 = MpegAudioUtil.f6994b[i5];
            this.f7003d = i6;
            if (i2 == 2) {
                this.f7003d = i6 / 2;
            } else if (i2 == 0) {
                this.f7003d = i6 / 4;
            }
            int i7 = (i >>> 9) & 1;
            this.f7006g = MpegAudioUtil.m3529b(i2, i3);
            if (i3 == 3) {
                int i8 = i2 == 3 ? MpegAudioUtil.f6995c[i4 - 1] : MpegAudioUtil.f6996d[i4 - 1];
                this.f7005f = i8;
                this.f7002c = (((i8 * 12) / this.f7003d) + i7) * 4;
            } else {
                if (i2 == 3) {
                    int i9 = i3 == 2 ? MpegAudioUtil.f6997e[i4 - 1] : MpegAudioUtil.f6998f[i4 - 1];
                    this.f7005f = i9;
                    this.f7002c = ((i9 * 144) / this.f7003d) + i7;
                } else {
                    int i10 = MpegAudioUtil.f6999g[i4 - 1];
                    this.f7005f = i10;
                    this.f7002c = (((i3 == 1 ? 72 : 144) * i10) / this.f7003d) + i7;
                }
            }
            this.f7004e = ((i >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m3528a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!m3530c(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f6994b[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f6995c[i4 - 1] : f6996d[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f6997e[i4 - 1] : f6998f[i4 - 1];
        } else {
            i6 = f6999g[i4 - 1];
        }
        if (i2 == 3) {
            return outline.m1602x(i6, 144, i7, i8);
        }
        return outline.m1602x(i3 == 1 ? 72 : 144, i6, i7, i8);
    }

    /* JADX INFO: renamed from: b */
    public static int m3529b(int i, int i2) {
        if (i2 == 1) {
            return i == 3 ? 1152 : 576;
        }
        if (i2 == 2) {
            return 1152;
        }
        if (i2 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3530c(int i) {
        return (i & (-2097152)) == -2097152;
    }

    /* JADX INFO: renamed from: d */
    public static int m3531d(int i) {
        int i2;
        int i3;
        if (!m3530c(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return m3529b(i2, i3);
    }
}
