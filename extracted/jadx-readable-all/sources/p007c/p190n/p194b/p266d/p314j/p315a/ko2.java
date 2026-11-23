package p007c.p190n.p194b.p266d.p314j.p315a;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ko2 {

    /* JADX INFO: renamed from: a */
    public final List<byte[]> f16005a;

    /* JADX INFO: renamed from: b */
    public final int f16006b;

    /* JADX INFO: renamed from: c */
    public final float f16007c;

    public ko2(List list, int i, float f) {
        this.f16005a = list;
        this.f16006b = i;
        this.f16007c = f;
    }

    /* JADX INFO: renamed from: a */
    public static ko2 m7534a(do2 do2Var) throws fh2 {
        try {
            do2Var.m6390g(4);
            int iM6392i = (do2Var.m6392i() & 3) + 1;
            if (iM6392i == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iM6392i2 = do2Var.m6392i() & 31;
            for (int i = 0; i < iM6392i2; i++) {
                arrayList.add(m7535b(do2Var));
            }
            int iM6392i3 = do2Var.m6392i();
            for (int i2 = 0; i2 < iM6392i3; i2++) {
                arrayList.add(m7535b(do2Var));
            }
            float f = 1.0f;
            if (iM6392i2 > 0) {
                eo2 eo2Var = new eo2((byte[]) arrayList.get(0), iM6392i, ((byte[]) arrayList.get(0)).length);
                eo2Var.m6652a(8);
                int iM6654c = eo2Var.m6654c(8);
                eo2Var.m6652a(16);
                eo2Var.m6656e();
                if (iM6654c == 100 || iM6654c == 110 || iM6654c == 122 || iM6654c == 244 || iM6654c == 44 || iM6654c == 83 || iM6654c == 86 || iM6654c == 118 || iM6654c == 128 || iM6654c == 138) {
                    int iM6656e = eo2Var.m6656e();
                    if (iM6656e == 3) {
                        eo2Var.m6653b();
                        iM6656e = 3;
                    }
                    eo2Var.m6656e();
                    eo2Var.m6656e();
                    eo2Var.m6652a(1);
                    if (eo2Var.m6653b()) {
                        int i3 = iM6656e != 3 ? 8 : 12;
                        int i4 = 0;
                        while (i4 < i3) {
                            if (eo2Var.m6653b()) {
                                int i5 = i4 < 6 ? 16 : 64;
                                int iM6655d = 8;
                                int i6 = 8;
                                for (int i7 = 0; i7 < i5; i7++) {
                                    if (iM6655d != 0) {
                                        iM6655d = ((eo2Var.m6655d() + i6) + 256) % 256;
                                    }
                                    if (iM6655d != 0) {
                                        i6 = iM6655d;
                                    }
                                }
                            }
                            i4++;
                        }
                    }
                }
                eo2Var.m6656e();
                int iM6656e2 = eo2Var.m6656e();
                if (iM6656e2 == 0) {
                    eo2Var.m6656e();
                } else if (iM6656e2 == 1) {
                    eo2Var.m6653b();
                    eo2Var.m6655d();
                    eo2Var.m6655d();
                    long jM6656e = eo2Var.m6656e();
                    for (int i8 = 0; i8 < jM6656e; i8++) {
                        eo2Var.m6656e();
                    }
                }
                eo2Var.m6656e();
                eo2Var.m6652a(1);
                eo2Var.m6656e();
                eo2Var.m6656e();
                if (!eo2Var.m6653b()) {
                    eo2Var.m6652a(1);
                }
                eo2Var.m6652a(1);
                if (eo2Var.m6653b()) {
                    eo2Var.m6656e();
                    eo2Var.m6656e();
                    eo2Var.m6656e();
                    eo2Var.m6656e();
                }
                if (eo2Var.m6653b() && eo2Var.m6653b()) {
                    int iM6654c2 = eo2Var.m6654c(8);
                    if (iM6654c2 == 255) {
                        int iM6654c3 = eo2Var.m6654c(16);
                        int iM6654c4 = eo2Var.m6654c(16);
                        if (iM6654c3 != 0 && iM6654c4 != 0) {
                            f = iM6654c3 / iM6654c4;
                        }
                    } else if (iM6654c2 < 17) {
                        f = bo2.f12763b[iM6654c2];
                    } else {
                        StringBuilder sb = new StringBuilder(46);
                        sb.append("Unexpected aspect_ratio_idc value: ");
                        sb.append(iM6654c2);
                        Log.w("NalUnitUtil", sb.toString());
                    }
                }
            }
            return new ko2(arrayList, iM6392i, f);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new fh2("Error parsing AVC config", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m7535b(do2 do2Var) {
        int iM6393j = do2Var.m6393j();
        int i = do2Var.f13341b;
        do2Var.m6390g(iM6393j);
        byte[] bArr = do2Var.f13340a;
        byte[] bArr2 = new byte[iM6393j + 4];
        System.arraycopy(wn2.f21271a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, iM6393j);
        return bArr2;
    }
}
