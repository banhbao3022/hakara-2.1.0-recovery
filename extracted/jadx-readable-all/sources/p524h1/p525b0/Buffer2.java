package p524h1.p525b0;

import java.io.EOFException;
import p477d1.p481d0.Charsets2;
import p477d1.p493x.p495c.Intrinsics2;
import p524h1.Buffer3;
import p524h1.Options2;
import p524h1.Segment;

/* JADX INFO: renamed from: h1.b0.a, reason: use source file name */
/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Buffer2 {

    /* JADX INFO: renamed from: a */
    public static final byte[] f30701a;

    static {
        Intrinsics2.m13090f("0123456789abcdef", "$this$asUtf8ToByteArray");
        byte[] bytes = "0123456789abcdef".getBytes(Charsets2.f29452a);
        Intrinsics2.m13086b(bytes, "(this as java.lang.String).getBytes(charset)");
        f30701a = bytes;
    }

    /* JADX INFO: renamed from: a */
    public static final String m13706a(Buffer3 buffer3, long j2) throws EOFException {
        Intrinsics2.m13090f(buffer3, "$this$readUtf8Line");
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (buffer3.m13740b0(j3) == ((byte) 13)) {
                String strM13758x0 = buffer3.m13758x0(j3);
                buffer3.skip(2L);
                return strM13758x0;
            }
        }
        String strM13758x1 = buffer3.m13758x0(j2);
        buffer3.skip(1L);
        return strM13758x1;
    }

    /* JADX INFO: renamed from: b */
    public static final int m13707b(Buffer3 buffer3, Options2 options2, boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        Segment segment;
        Intrinsics2.m13090f(buffer3, "$this$selectPrefix");
        Intrinsics2.m13090f(options2, "options");
        Segment segment2 = buffer3.f30707f;
        if (segment2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = segment2.f30742a;
        int i5 = segment2.f30743b;
        int i6 = segment2.f30744c;
        int[] iArr = options2.f30732i;
        Segment segment3 = segment2;
        int i7 = 0;
        int i8 = -1;
        loop0: while (true) {
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            int i11 = i9 + 1;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i8 = i12;
            }
            if (segment3 == null) {
                break;
            }
            if (i10 >= 0) {
                i = i5 + 1;
                int i13 = bArr[i5] & 255;
                int i14 = i11 + i10;
                while (i11 != i14) {
                    if (i13 == iArr[i11]) {
                        i2 = iArr[i11 + i10];
                        if (i == i6) {
                            segment3 = segment3.f30747f;
                            if (segment3 == null) {
                                Intrinsics2.m13095k();
                                throw null;
                            }
                            i = segment3.f30743b;
                            bArr = segment3.f30742a;
                            i6 = segment3.f30744c;
                            if (segment3 == segment2) {
                                segment3 = null;
                            }
                        }
                    } else {
                        i11++;
                    }
                }
                return i8;
            }
            int i15 = (i10 * (-1)) + i11;
            while (true) {
                int i16 = i5 + 1;
                int i17 = i11 + 1;
                if ((bArr[i5] & 255) != iArr[i11]) {
                    return i8;
                }
                boolean z2 = i17 == i15;
                if (i16 != i6) {
                    Segment segment4 = segment3;
                    i3 = i6;
                    i4 = i16;
                    segment = segment4;
                } else {
                    if (segment3 == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    Segment segment5 = segment3.f30747f;
                    if (segment5 == null) {
                        Intrinsics2.m13095k();
                        throw null;
                    }
                    i4 = segment5.f30743b;
                    byte[] bArr2 = segment5.f30742a;
                    i3 = segment5.f30744c;
                    if (segment5 != segment2) {
                        segment = segment5;
                        bArr = bArr2;
                    } else {
                        if (!z2) {
                            break loop0;
                        }
                        bArr = bArr2;
                        segment = null;
                    }
                }
                if (z2) {
                    i2 = iArr[i17];
                    i = i4;
                    i6 = i3;
                    segment3 = segment;
                    break;
                }
                i5 = i4;
                i6 = i3;
                i11 = i17;
                segment3 = segment;
            }
            if (i2 >= 0) {
                return i2;
            }
            i7 = -i2;
            i5 = i;
        }
        if (z) {
            return -2;
        }
        return i8;
    }
}
