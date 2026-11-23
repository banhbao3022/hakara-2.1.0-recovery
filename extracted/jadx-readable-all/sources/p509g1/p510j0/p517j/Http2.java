package p509g1.p510j0.p517j;

import p007c.p071d.p078c.p079a.outline;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util9;
import p524h1.ByteString3;

/* JADX INFO: renamed from: g1.j0.j.e, reason: use source file name */
/* JADX INFO: compiled from: Http2.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Http2 {

    /* JADX INFO: renamed from: d */
    public static final String[] f30371d;

    /* JADX INFO: renamed from: e */
    public static final Http2 f30372e = new Http2();

    /* JADX INFO: renamed from: a */
    public static final ByteString3 f30368a = ByteString3.f30712g.m13777c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* JADX INFO: renamed from: b */
    public static final String[] f30369b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* JADX INFO: renamed from: c */
    public static final String[] f30370c = new String[64];

    static {
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            Intrinsics2.m13086b(binaryString, "Integer.toBinaryString(it)");
            String strM13369i = Util9.m13369i("%8s", binaryString);
            Intrinsics2.m13089e(strM13369i, "$this$replace");
            String strReplace = strM13369i.replace(' ', '0');
            Intrinsics2.m13088d(strReplace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            strArr[i] = strReplace;
        }
        f30371d = strArr;
        String[] strArr2 = f30370c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i2 = 0; i2 < 1; i2++) {
            int i3 = iArr[i2];
            String[] strArr3 = f30370c;
            strArr3[i3 | 8] = Intrinsics2.m13094j(strArr3[i3], "|PADDED");
        }
        String[] strArr4 = f30370c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 < 1; i6++) {
                int i7 = iArr[i6];
                String[] strArr5 = f30370c;
                int i8 = i7 | i5;
                strArr5[i8] = strArr5[i7] + "|" + strArr5[i5];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i7]);
                sb.append("|");
                strArr5[i8 | 8] = outline.m1550A(sb, strArr5[i5], "|PADDED");
            }
        }
        int length = f30370c.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr6 = f30370c;
            if (strArr6[i9] == null) {
                strArr6[i9] = f30371d[i9];
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m13521a(int i) {
        String[] strArr = f30369b;
        return i < strArr.length ? strArr[i] : Util9.m13369i("0x%02x", Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX INFO: renamed from: b */
    public final String m13522b(boolean z, int i, int i2, int i3, int i4) {
        String strM12993j;
        String str;
        String strM13521a = m13521a(i3);
        if (i4 == 0) {
            strM12993j = "";
        } else if (i3 == 2 || i3 == 3) {
            strM12993j = f30371d[i4];
        } else if (i3 == 4 || i3 == 6) {
            strM12993j = i4 == 1 ? "ACK" : f30371d[i4];
        } else if (i3 == 7 || i3 == 8) {
            strM12993j = f30371d[i4];
        } else {
            String[] strArr = f30370c;
            if (i4 < strArr.length) {
                str = strArr[i4];
                if (str == null) {
                    Intrinsics2.m13095k();
                    throw null;
                }
            } else {
                str = f30371d[i4];
            }
            if (i3 != 5 || (i4 & 4) == 0) {
                strM12993j = (i3 != 0 || (i4 & 32) == 0) ? str : StringsJVM.m12993j(str, "PRIORITY", "COMPRESSED", false, 4);
            } else {
                strM12993j = StringsJVM.m12993j(str, "HEADERS", "PUSH_PROMISE", false, 4);
            }
        }
        return Util9.m13369i("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), strM13521a, strM12993j);
    }
}
