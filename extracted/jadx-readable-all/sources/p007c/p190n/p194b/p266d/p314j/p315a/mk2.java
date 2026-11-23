package p007c.p190n.p194b.p266d.p314j.p315a;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mk2 {

    /* JADX INFO: renamed from: a */
    public static final int[] f16786a = {jo2.m7375g("isom"), jo2.m7375g("iso2"), jo2.m7375g("iso3"), jo2.m7375g("iso4"), jo2.m7375g("iso5"), jo2.m7375g("iso6"), jo2.m7375g("avc1"), jo2.m7375g("hvc1"), jo2.m7375g("hev1"), jo2.m7375g("mp41"), jo2.m7375g("mp42"), jo2.m7375g("3g2a"), jo2.m7375g("3g2b"), jo2.m7375g("3gr6"), jo2.m7375g("3gs6"), jo2.m7375g("3ge6"), jo2.m7375g("3gg6"), jo2.m7375g("M4V "), jo2.m7375g("M4A "), jo2.m7375g("f4v "), jo2.m7375g("kddi"), jo2.m7375g("M4VP"), jo2.m7375g("qt  "), jo2.m7375g("MSNV")};

    /* JADX INFO: renamed from: a */
    public static boolean m7718a(bj2 bj2Var, boolean z) throws InterruptedException, IOException {
        boolean z2;
        long j2 = bj2Var.f12709c;
        if (j2 == -1 || j2 > 4096) {
            j2 = 4096;
        }
        int i = (int) j2;
        do2 do2Var = new do2(64);
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 < i) {
                do2Var.m6384a(8);
                bj2Var.m6023c(do2Var.f13340a, 0, 8);
                long jM6394k = do2Var.m6394k();
                int iM6395l = do2Var.m6395l();
                int i3 = 16;
                if (jM6394k == 1) {
                    bj2Var.m6023c(do2Var.f13340a, 8, 8);
                    do2Var.m6387d(16);
                    jM6394k = do2Var.m6398o();
                } else {
                    i3 = 8;
                }
                long j3 = i3;
                if (jM6394k < j3) {
                    return false;
                }
                i2 += i3;
                if (iM6395l != wj2.f21143B) {
                    if (iM6395l == wj2.f21161K || iM6395l == wj2.f21165M) {
                        z2 = true;
                        return !z3 && z == z2;
                    }
                    if ((((long) i2) + jM6394k) - j3 < i) {
                        int i4 = (int) (jM6394k - j3);
                        i2 += i4;
                        if (iM6395l == wj2.f21181a) {
                            if (i4 < 8) {
                                return false;
                            }
                            do2Var.m6384a(i4);
                            bj2Var.m6023c(do2Var.f13340a, 0, i4);
                            int i5 = i4 >> 2;
                            for (int i6 = 0; i6 < i5; i6++) {
                                if (i6 != 1) {
                                    int iM6395l2 = do2Var.m6395l();
                                    if ((iM6395l2 >>> 8) != jo2.m7375g("3gp")) {
                                        int[] iArr = f16786a;
                                        int length = iArr.length;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= 24) {
                                                continue;
                                            } else if (iArr[i7] != iM6395l2) {
                                                i7++;
                                            }
                                        }
                                    }
                                    z3 = true;
                                    break;
                                }
                                do2Var.m6390g(4);
                            }
                            if (!z3) {
                                return false;
                            }
                        } else if (i4 != 0) {
                            bj2Var.m6024d(i4, false);
                        }
                    }
                }
            }
            z2 = false;
            if (z3) {
            }
        }
    }
}
