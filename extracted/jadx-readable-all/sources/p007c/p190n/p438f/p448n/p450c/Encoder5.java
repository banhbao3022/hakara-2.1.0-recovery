package p007c.p190n.p438f.p448n.p450c;

import p007c.p190n.p438f.WriterException;
import p007c.p190n.p438f.p448n.p449b.ErrorCorrectionLevel;
import p007c.p190n.p438f.p448n.p449b.Version;

/* JADX INFO: renamed from: c.n.f.n.c.c, reason: use source file name */
/* JADX INFO: compiled from: Encoder.java */
/* JADX INFO: loaded from: classes.dex */
public final class Encoder5 {

    /* JADX INFO: renamed from: a */
    public static final int[] f27802a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: a */
    public static Version m12418a(int i, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            Version versionM12413b = Version.m12413b(i2);
            if (m12420c(i, versionM12413b, errorCorrectionLevel)) {
                return versionM12413b;
            }
        }
        throw new WriterException("Data too big");
    }

    /* JADX INFO: renamed from: b */
    public static int m12419b(int i) {
        int[] iArr = f27802a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m12420c(int i, Version version, ErrorCorrectionLevel errorCorrectionLevel) {
        int i2 = version.f27792d;
        Version.b bVar = version.f27791c[errorCorrectionLevel.ordinal()];
        return i2 - (bVar.m12414a() * bVar.f27795a) >= (i + 7) / 8;
    }
}
