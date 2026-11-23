package p007c.p190n.p194b.p209b.p215n1;

import android.util.Log;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.ParserException;
import p007c.p190n.p194b.p209b.p212b2.ParsableBitArray;

/* JADX INFO: renamed from: c.n.b.b.n1.k, reason: use source file name */
/* JADX INFO: compiled from: AacUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class AacUtil {

    /* JADX INFO: renamed from: a */
    public static final int[] f7081a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b */
    public static final int[] f7082b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: c.n.b.b.n1.k$b */
    /* JADX INFO: compiled from: AacUtil.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f7083a;

        /* JADX INFO: renamed from: b */
        public final int f7084b;

        /* JADX INFO: renamed from: c */
        public final String f7085c;

        public b(int i, int i2, String str, a aVar) {
            this.f7083a = i;
            this.f7084b = i2;
            this.f7085c = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m3550a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    /* JADX INFO: renamed from: b */
    public static int m3551b(int i) {
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    /* JADX INFO: renamed from: c */
    public static int m3552c(ParsableBitArray parsableBitArray) throws ParserException {
        int iM3183g = parsableBitArray.m3183g(4);
        if (iM3183g == 15) {
            return parsableBitArray.m3183g(24);
        }
        if (iM3183g < 13) {
            return f7081a[iM3183g];
        }
        throw new ParserException();
    }

    /* JADX INFO: renamed from: d */
    public static b m3553d(ParsableBitArray parsableBitArray, boolean z) throws ParserException {
        int iM3183g = parsableBitArray.m3183g(5);
        if (iM3183g == 31) {
            iM3183g = parsableBitArray.m3183g(6) + 32;
        }
        int iM3552c = m3552c(parsableBitArray);
        int iM3183g2 = parsableBitArray.m3183g(4);
        String strM1590l = outline.m1590l("mp4a.40.", iM3183g);
        if (iM3183g == 5 || iM3183g == 29) {
            iM3552c = m3552c(parsableBitArray);
            int iM3183g3 = parsableBitArray.m3183g(5);
            if (iM3183g3 == 31) {
                iM3183g3 = parsableBitArray.m3183g(6) + 32;
            }
            iM3183g = iM3183g3;
            if (iM3183g == 22) {
                iM3183g2 = parsableBitArray.m3183g(4);
            }
        }
        if (z) {
            if (iM3183g != 1 && iM3183g != 2 && iM3183g != 3 && iM3183g != 4 && iM3183g != 6 && iM3183g != 7 && iM3183g != 17) {
                switch (iM3183g) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new ParserException(outline.m1590l("Unsupported audio object type: ", iM3183g));
                }
            }
            if (parsableBitArray.m3182f()) {
                Log.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (parsableBitArray.m3182f()) {
                parsableBitArray.m3189m(14);
            }
            boolean zM3182f = parsableBitArray.m3182f();
            if (iM3183g2 == 0) {
                throw new UnsupportedOperationException();
            }
            if (iM3183g == 6 || iM3183g == 20) {
                parsableBitArray.m3189m(3);
            }
            if (zM3182f) {
                if (iM3183g == 22) {
                    parsableBitArray.m3189m(16);
                }
                if (iM3183g == 17 || iM3183g == 19 || iM3183g == 20 || iM3183g == 23) {
                    parsableBitArray.m3189m(3);
                }
                parsableBitArray.m3189m(1);
            }
            switch (iM3183g) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iM3183g4 = parsableBitArray.m3183g(2);
                    if (iM3183g4 == 2 || iM3183g4 == 3) {
                        throw new ParserException(outline.m1590l("Unsupported epConfig: ", iM3183g4));
                    }
                    break;
            }
        }
        int i = f7082b[iM3183g2];
        if (i != -1) {
            return new b(iM3552c, i, strM1590l, null);
        }
        throw new ParserException();
    }

    /* JADX INFO: renamed from: e */
    public static b m3554e(byte[] bArr) throws ParserException {
        return m3553d(new ParsableBitArray(bArr), false);
    }
}
