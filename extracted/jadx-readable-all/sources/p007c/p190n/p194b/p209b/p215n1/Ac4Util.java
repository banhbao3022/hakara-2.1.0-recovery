package p007c.p190n.p194b.p209b.p215n1;

import com.cgfay.media.IMediaPlayer;
import com.facebook.stetho.websocket.CloseCodes;
import p007c.p190n.p194b.p209b.p212b2.ParsableBitArray;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;

/* JADX INFO: renamed from: c.n.b.b.n1.m, reason: use source file name */
/* JADX INFO: compiled from: Ac4Util.java */
/* JADX INFO: loaded from: classes.dex */
public final class Ac4Util {

    /* JADX INFO: renamed from: a */
    public static final int[] f7092a = {2002, 2000, 1920, 1601, 1600, 1001, CloseCodes.NORMAL_CLOSURE, 960, IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING, IMediaPlayer.MEDIA_INFO_BAD_INTERLEAVING, 480, 400, 400, 2048};

    /* JADX INFO: renamed from: c.n.b.b.n1.m$b */
    /* JADX INFO: compiled from: Ac4Util.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f7093a;

        /* JADX INFO: renamed from: b */
        public final int f7094b;

        /* JADX INFO: renamed from: c */
        public final int f7095c;

        public b(int i, int i2, int i3, int i4, int i5, a aVar) {
            this.f7093a = i3;
            this.f7094b = i4;
            this.f7095c = i5;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3556a(int i, ParsableByteArray parsableByteArray) {
        parsableByteArray.m3221z(7);
        byte[] bArr = parsableByteArray.f6392a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a5  */
    /* JADX INFO: renamed from: b */
    public static b m3557b(ParsableBitArray parsableBitArray) {
        int i;
        int i2;
        int iM3183g;
        int iM3183g2 = parsableBitArray.m3183g(16);
        int iM3183g3 = parsableBitArray.m3183g(16);
        if (iM3183g3 == 65535) {
            iM3183g3 = parsableBitArray.m3183g(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iM3183g3 + i;
        if (iM3183g2 == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int iM3183g4 = parsableBitArray.m3183g(2);
        if (iM3183g4 == 3) {
            int i5 = 0;
            while (true) {
                iM3183g = parsableBitArray.m3183g(2) + i5;
                if (!parsableBitArray.m3182f()) {
                    break;
                }
                i5 = (iM3183g + 1) << 2;
            }
            iM3183g4 += iM3183g;
        }
        int iM3183g5 = parsableBitArray.m3183g(10);
        if (parsableBitArray.m3182f() && parsableBitArray.m3183g(3) > 0) {
            parsableBitArray.m3189m(2);
        }
        int i6 = parsableBitArray.m3182f() ? 48000 : 44100;
        int iM3183g6 = parsableBitArray.m3183g(4);
        if (i6 == 44100 && iM3183g6 == 13) {
            i2 = f7092a[iM3183g6];
        } else if (i6 == 48000) {
            int[] iArr = f7092a;
            if (iM3183g6 < iArr.length) {
                int i7 = iArr[iM3183g6];
                int i8 = iM3183g5 % 5;
                if (i8 == 1) {
                    if (iM3183g6 != 3 || iM3183g6 == 8) {
                        i7++;
                    }
                } else if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 == 4 && (iM3183g6 == 3 || iM3183g6 == 8 || iM3183g6 == 11)) {
                            i7++;
                        }
                    } else if (iM3183g6 != 3) {
                        i7++;
                    } else {
                        i7++;
                    }
                } else if (iM3183g6 == 8 || iM3183g6 == 11) {
                    i7++;
                }
                i2 = i7;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        return new b(iM3183g4, 2, i6, i4, i2, null);
    }
}
