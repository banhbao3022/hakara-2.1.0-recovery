package p007c.p190n.p194b.p209b.p212b2;

/* JADX INFO: renamed from: c.n.b.b.b2.h, reason: use source file name */
/* JADX INFO: compiled from: CodecSpecificDataUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class CodecSpecificDataUtil {

    /* JADX INFO: renamed from: a */
    public static final byte[] f6305a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final String[] f6306b = {"", "A", "B", "C"};

    /* JADX INFO: renamed from: a */
    public static String m3089a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* JADX INFO: renamed from: b */
    public static String m3090b(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.m3232k(24);
        int iM3226e = parsableNalUnitBitArray.m3226e(2);
        boolean zM3225d = parsableNalUnitBitArray.m3225d();
        int iM3226e2 = parsableNalUnitBitArray.m3226e(5);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            if (parsableNalUnitBitArray.m3225d()) {
                i |= 1 << i2;
            }
        }
        int i3 = 6;
        int[] iArr = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr[i4] = parsableNalUnitBitArray.m3226e(8);
        }
        int iM3226e3 = parsableNalUnitBitArray.m3226e(8);
        Object[] objArr = new Object[5];
        objArr[0] = f6306b[iM3226e];
        objArr[1] = Integer.valueOf(iM3226e2);
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Character.valueOf(zM3225d ? 'H' : 'L');
        objArr[4] = Integer.valueOf(iM3226e3);
        StringBuilder sb = new StringBuilder(Util6.m3126n("hvc1.%s%d.%X.%c%d", objArr));
        while (i3 > 0) {
            int i5 = i3 - 1;
            if (iArr[i5] != 0) {
                break;
            }
            i3 = i5;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i6])));
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3091c(byte[] bArr, int i) {
        if (bArr.length - i <= f6305a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f6305a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }
}
