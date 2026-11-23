package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class po2 {

    /* JADX INFO: renamed from: a */
    public final List<byte[]> f18049a;

    /* JADX INFO: renamed from: b */
    public final int f18050b;

    public po2(List<byte[]> list, int i) {
        this.f18049a = list;
        this.f18050b = i;
    }

    /* JADX INFO: renamed from: a */
    public static po2 m8138a(do2 do2Var) throws fh2 {
        try {
            do2Var.m6390g(21);
            int iM6392i = do2Var.m6392i() & 3;
            int iM6392i2 = do2Var.m6392i();
            int i = do2Var.f13341b;
            int i2 = 0;
            for (int i3 = 0; i3 < iM6392i2; i3++) {
                do2Var.m6390g(1);
                int iM6393j = do2Var.m6393j();
                for (int i4 = 0; i4 < iM6393j; i4++) {
                    int iM6393j2 = do2Var.m6393j();
                    i2 += iM6393j2 + 4;
                    do2Var.m6390g(iM6393j2);
                }
            }
            do2Var.m6389f(i);
            byte[] bArr = new byte[i2];
            int i5 = 0;
            for (int i6 = 0; i6 < iM6392i2; i6++) {
                do2Var.m6390g(1);
                int iM6393j3 = do2Var.m6393j();
                for (int i7 = 0; i7 < iM6393j3; i7++) {
                    int iM6393j4 = do2Var.m6393j();
                    System.arraycopy(bo2.f12762a, 0, bArr, i5, 4);
                    int i8 = i5 + 4;
                    System.arraycopy(do2Var.f13340a, do2Var.f13341b, bArr, i8, iM6393j4);
                    i5 = i8 + iM6393j4;
                    do2Var.m6390g(iM6393j4);
                }
            }
            return new po2(i2 == 0 ? null : Collections.singletonList(bArr), iM6392i + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new fh2("Error parsing HEVC config", e);
        }
    }
}
