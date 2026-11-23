package p007c.p190n.p194b.p209b.p221s1;

import com.facebook.stetho.websocket.CloseCodes;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.s1.m, reason: use source file name */
/* JADX INFO: compiled from: FlacFrameReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class FlacFrameReader {

    /* JADX INFO: renamed from: c.n.b.b.s1.m$a */
    /* JADX INFO: compiled from: FlacFrameReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public long f8082a;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3858a(ParsableByteArray parsableByteArray, FlacStreamMetadata flacStreamMetadata, boolean z, a aVar) {
        try {
            long jM3220y = parsableByteArray.m3220y();
            if (!z) {
                jM3220y *= (long) flacStreamMetadata.f8497b;
            }
            aVar.f8082a = jM3220y;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Instruction removed from duplicated block: B:62:0x00ae, please report this as an issue */
    /* JADX INFO: renamed from: b */
    public static boolean m3859b(ParsableByteArray parsableByteArray, FlacStreamMetadata flacStreamMetadata, int i, a aVar) {
        boolean z;
        long jM3215t = parsableByteArray.m3215t();
        long j2 = jM3215t >>> 16;
        if (j2 != i) {
            return false;
        }
        boolean z2 = (j2 & 1) == 1;
        int i2 = (int) ((jM3215t >> 12) & 15);
        int i3 = (int) ((jM3215t >> 8) & 15);
        int i4 = (int) (15 & (jM3215t >> 4));
        int i5 = (int) ((jM3215t >> 1) & 7);
        boolean z3 = (jM3215t & 1) == 1;
        if (!(i4 > 7 ? !(i4 > 10 || flacStreamMetadata.f8502g != 2) : i4 == flacStreamMetadata.f8502g - 1)) {
            return false;
        }
        if (!(i5 == 0 || i5 == flacStreamMetadata.f8504i) || z3 || !m3858a(parsableByteArray, flacStreamMetadata, z2, aVar)) {
            return false;
        }
        int iM3860c = m3860c(parsableByteArray, i2);
        if (!(iM3860c != -1 && iM3860c <= flacStreamMetadata.f8497b)) {
            return false;
        }
        int i6 = flacStreamMetadata.f8500e;
        if (i3 != 0) {
            if (i3 <= 11) {
                if (i3 == flacStreamMetadata.f8501f) {
                }
            } else if (i3 != 12) {
                if (i3 <= 14) {
                    int iM3219x = parsableByteArray.m3219x();
                    if (i3 == 14) {
                        iM3219x *= 10;
                    }
                    z = iM3219x == i6;
                }
            } else if (parsableByteArray.m3214s() * CloseCodes.NORMAL_CLOSURE == i6) {
            }
        }
        if (!z) {
            return false;
        }
        int iM3214s = parsableByteArray.m3214s();
        int i7 = parsableByteArray.f6393b;
        byte[] bArr = parsableByteArray.f6392a;
        int i8 = i7 - 1;
        int i9 = Util6.f6307a;
        int i10 = 0;
        for (int i11 = parsableByteArray.f6393b; i11 < i8; i11++) {
            i10 = Util6.f6321o[i10 ^ (bArr[i11] & 255)];
        }
        return iM3214s == i10;
    }

    /* JADX INFO: renamed from: c */
    public static int m3860c(ParsableByteArray parsableByteArray, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return parsableByteArray.m3214s() + 1;
            case 7:
                return parsableByteArray.m3219x() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
