package p007c.p190n.p194b.p209b.p221s1.p228k0;

import java.io.IOException;
import p007c.p190n.p194b.p209b.p212b2.ParsableByteArray;
import p007c.p190n.p194b.p209b.p221s1.ExtractorInput;

/* JADX INFO: renamed from: c.n.b.b.s1.k0.l, reason: use source file name */
/* JADX INFO: compiled from: Sniffer.java */
/* JADX INFO: loaded from: classes.dex */
public final class Sniffer2 {

    /* JADX INFO: renamed from: a */
    public static final int[] f7977a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX INFO: renamed from: a */
    public static boolean m3840a(ExtractorInput extractorInput, boolean z, boolean z2) throws IOException {
        boolean z3;
        boolean z4;
        long jMo3729a = extractorInput.mo3729a();
        long j2 = 4096;
        long j3 = -1;
        if (jMo3729a != -1 && jMo3729a <= 4096) {
            j2 = jMo3729a;
        }
        int i = (int) j2;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        boolean z5 = false;
        int i2 = 0;
        boolean z6 = false;
        while (true) {
            if (i2 < i) {
                parsableByteArray.m3221z(8);
                if (extractorInput.mo3731d(parsableByteArray.f6392a, z5 ? 1 : 0, 8, true)) {
                    long jM3215t = parsableByteArray.m3215t();
                    int iM3201f = parsableByteArray.m3201f();
                    int i3 = 16;
                    if (jM3215t == 1) {
                        extractorInput.mo3739o(parsableByteArray.f6392a, 8, 8);
                        parsableByteArray.m3193C(16);
                        jM3215t = parsableByteArray.m3208m();
                    } else {
                        if (jM3215t == 0) {
                            long jMo3729a2 = extractorInput.mo3729a();
                            if (jMo3729a2 != j3) {
                                jM3215t = (jMo3729a2 - extractorInput.mo3732e()) + ((long) 8);
                            }
                        }
                        i3 = 8;
                    }
                    long j4 = i3;
                    if (jM3215t < j4) {
                        return z5;
                    }
                    i2 += i3;
                    if (iM3201f == 1836019574) {
                        i += (int) jM3215t;
                        if (jMo3729a != -1 && i > jMo3729a) {
                            i = (int) jMo3729a;
                        }
                        j3 = -1;
                    } else {
                        if (iM3201f == 1836019558 || iM3201f == 1836475768) {
                            z3 = true;
                            return !z6 && z == z3;
                        }
                        long j5 = jMo3729a;
                        if ((((long) i2) + jM3215t) - j4 < i) {
                            int i4 = (int) (jM3215t - j4);
                            i2 += i4;
                            if (iM3201f == 1718909296) {
                                if (i4 < 8) {
                                    return false;
                                }
                                parsableByteArray.m3221z(i4);
                                extractorInput.mo3739o(parsableByteArray.f6392a, 0, i4);
                                int i5 = i4 / 4;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    if (i6 != 1) {
                                        int iM3201f2 = parsableByteArray.m3201f();
                                        if ((iM3201f2 >>> 8) == 3368816 || (iM3201f2 == 1751476579 && z2)) {
                                            z4 = true;
                                            break;
                                        }
                                        int[] iArr = f7977a;
                                        int length = iArr.length;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= length) {
                                                z4 = false;
                                                break;
                                            }
                                            if (iArr[i7] == iM3201f2) {
                                                z4 = true;
                                                break;
                                            }
                                            i7++;
                                        }
                                        if (z4) {
                                            z6 = true;
                                            break;
                                        }
                                    } else {
                                        parsableByteArray.m3195E(4);
                                    }
                                }
                                if (!z6) {
                                    return false;
                                }
                            } else if (i4 != 0) {
                                extractorInput.mo3733f(i4);
                            }
                            jMo3729a = j5;
                            j3 = -1;
                            z5 = false;
                        }
                    }
                }
            }
            z3 = false;
            if (z6) {
            }
        }
    }
}
