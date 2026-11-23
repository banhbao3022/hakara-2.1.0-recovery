package p007c.p190n.p438f.p446m;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p438f.BarcodeFormat;
import p007c.p190n.p438f.EncodeHintType;
import p007c.p190n.p438f.Writer;
import p007c.p190n.p438f.WriterException;
import p007c.p190n.p438f.p441j.BitMatrix;
import p007c.p190n.p438f.p441j.CharacterSetECI;
import p007c.p190n.p438f.p446m.p447b.BarcodeMatrix;
import p007c.p190n.p438f.p446m.p447b.Dimensions;
import p007c.p190n.p438f.p446m.p447b.PDF417;
import p007c.p190n.p438f.p446m.p447b.PDF417ErrorCorrection;
import p007c.p190n.p438f.p446m.p447b.PDF417HighLevelEncoder;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: c.n.f.m.a, reason: use source file name */
/* JADX INFO: compiled from: PDF417Writer.java */
/* JADX INFO: loaded from: classes.dex */
public final class PDF417Writer implements Writer {
    /* JADX INFO: renamed from: b */
    public static BitMatrix m12397b(byte[][] bArr, int i) {
        int i2 = i * 2;
        BitMatrix bitMatrix = new BitMatrix(bArr[0].length + i2, bArr.length + i2);
        int length = bitMatrix.f27646i.length;
        for (int i3 = 0; i3 < length; i3++) {
            bitMatrix.f27646i[i3] = 0;
        }
        int i4 = (bitMatrix.f27644g - i) - 1;
        int i5 = 0;
        while (i5 < bArr.length) {
            byte[] bArr2 = bArr[i5];
            for (int i6 = 0; i6 < bArr[0].length; i6++) {
                if (bArr2[i6] == 1) {
                    bitMatrix.m12349b(i6 + i, i4);
                }
            }
            i5++;
            i4--;
        }
        return bitMatrix;
    }

    /* JADX INFO: renamed from: c */
    public static byte[][] m12398c(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) byte.class, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0304  */
    /* JADX WARN: Code duplicated, block: B:197:0x0400 A[LOOP:13: B:196:0x03fe->B:197:0x0400, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:200:0x041d  */
    /* JADX WARN: Code duplicated, block: B:201:0x0426  */
    @Override // p007c.p190n.p438f.Writer
    /* JADX INFO: renamed from: a */
    public BitMatrix mo12331a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        int i3;
        int i4;
        CharacterSetECI characterSetECI;
        int i5;
        int i6;
        char c2;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int iM12406c;
        if (barcodeFormat != BarcodeFormat.PDF_417) {
            throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(barcodeFormat)));
        }
        PDF417 pdf417 = new PDF417();
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.PDF417_COMPACT;
            if (map.containsKey(encodeHintType)) {
                pdf417.f27757c = Boolean.valueOf(map.get(encodeHintType).toString()).booleanValue();
            }
            EncodeHintType encodeHintType2 = EncodeHintType.PDF417_COMPACTION;
            if (map.containsKey(encodeHintType2)) {
                pdf417.f27758d = C7804v0.m15337z(map.get(encodeHintType2).toString());
            }
            EncodeHintType encodeHintType3 = EncodeHintType.PDF417_DIMENSIONS;
            if (map.containsKey(encodeHintType3)) {
                Dimensions dimensions = (Dimensions) map.get(encodeHintType3);
                int i16 = dimensions.f27752b;
                int i17 = dimensions.f27751a;
                int i18 = dimensions.f27754d;
                int i19 = dimensions.f27753c;
                pdf417.f27761g = i16;
                pdf417.f27760f = i17;
                pdf417.f27762h = i18;
                pdf417.f27763i = i19;
            }
            EncodeHintType encodeHintType4 = EncodeHintType.MARGIN;
            i3 = map.containsKey(encodeHintType4) ? Integer.parseInt(map.get(encodeHintType4).toString()) : 30;
            EncodeHintType encodeHintType5 = EncodeHintType.ERROR_CORRECTION;
            i4 = map.containsKey(encodeHintType5) ? Integer.parseInt(map.get(encodeHintType5).toString()) : 2;
            EncodeHintType encodeHintType6 = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType6)) {
                pdf417.f27759e = Charset.forName(map.get(encodeHintType6).toString());
            }
        } else {
            i3 = 30;
            i4 = 2;
        }
        int iM12403a = PDF417ErrorCorrection.m12403a(i4);
        int i20 = pdf417.f27758d;
        Charset charset = pdf417.f27759e;
        byte[] bArr = PDF417HighLevelEncoder.f27765a;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = PDF417HighLevelEncoder.f27769e;
        } else if (!PDF417HighLevelEncoder.f27769e.equals(charset) && (characterSetECI = CharacterSetECI.f27654H.get(charset.name())) != null) {
            int i21 = characterSetECI.f27677J[0];
            if (i21 >= 0 && i21 < 900) {
                sb.append((char) 927);
                sb.append((char) i21);
            } else if (i21 < 810900) {
                sb.append((char) 926);
                sb.append((char) ((i21 / 900) - 1));
                sb.append((char) (i21 % 900));
            } else {
                if (i21 >= 811800) {
                    throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i21)));
                }
                sb.append((char) 925);
                sb.append((char) (810900 - i21));
            }
        }
        int length = str.length();
        int iM15315d = C7804v0.m15315d(i20);
        if (iM15315d == 1) {
            i5 = i3;
            PDF417HighLevelEncoder.m12406c(str, 0, length, sb, 0);
        } else if (iM15315d != 2) {
            char c3 = 902;
            if (iM15315d != 3) {
                int i22 = 0;
                int i23 = 0;
                loop0: while (true) {
                    int i24 = 0;
                    while (true) {
                        if (i23 >= length) {
                            i5 = i3;
                            break loop0;
                        }
                        int length2 = str.length();
                        if (i23 < length2) {
                            char cCharAt = str.charAt(i23);
                            int i25 = 0;
                            int i26 = i23;
                            while (PDF417HighLevelEncoder.m12409f(cCharAt) && i26 < length2) {
                                i25++;
                                i26++;
                                if (i26 < length2) {
                                    cCharAt = str.charAt(i26);
                                }
                            }
                            i12 = i25;
                        } else {
                            i12 = 0;
                        }
                        int i27 = 13;
                        if (i12 >= 13) {
                            break;
                        }
                        int length3 = str.length();
                        int i28 = i23;
                        while (true) {
                            if (i28 < length3) {
                                char cCharAt2 = str.charAt(i28);
                                i13 = i3;
                                int i29 = 0;
                                while (i29 < i27 && PDF417HighLevelEncoder.m12409f(cCharAt2) && i28 < length3) {
                                    i29++;
                                    i28++;
                                    if (i28 < length3) {
                                        cCharAt2 = str.charAt(i28);
                                    }
                                }
                                if (i29 >= i27) {
                                    i14 = (i28 - i23) - i29;
                                    break;
                                }
                                if (i29 <= 0) {
                                    char cCharAt3 = str.charAt(i28);
                                    if (cCharAt3 == '\t' || cCharAt3 == '\n' || cCharAt3 == '\r' || (cCharAt3 >= ' ' && cCharAt3 <= '~')) {
                                        i28++;
                                    }
                                }
                                i27 = 13;
                                i3 = i13;
                            } else {
                                i13 = i3;
                            }
                            i14 = i28 - i23;
                            break;
                        }
                        if (i14 >= 5 || i12 == length) {
                            if (i22 != 0) {
                                sb.append((char) 900);
                                i15 = 0;
                                i22 = 0;
                            } else {
                                i15 = i24;
                            }
                            iM12406c = PDF417HighLevelEncoder.m12406c(str, i23, i14, sb, i15);
                            i23 += i14;
                        } else {
                            CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
                            int length4 = str.length();
                            int i30 = i23;
                            while (i30 < length4) {
                                char cCharAt4 = str.charAt(i30);
                                int i31 = 0;
                                for (int i32 = 13; i31 < i32 && PDF417HighLevelEncoder.m12409f(cCharAt4); i32 = 13) {
                                    i31++;
                                    int i33 = i30 + i31;
                                    if (i33 >= length4) {
                                        break;
                                    }
                                    cCharAt4 = str.charAt(i33);
                                }
                                if (i31 >= 13) {
                                    break;
                                }
                                char cCharAt5 = str.charAt(i30);
                                if (!charsetEncoderNewEncoder.canEncode(cCharAt5)) {
                                    throw new WriterException("Non-encodable character detected: " + cCharAt5 + " (Unicode: " + ((int) cCharAt5) + ')');
                                }
                                i30++;
                            }
                            int i34 = i30 - i23;
                            if (i34 == 0) {
                                i34 = 1;
                            }
                            int i35 = i34 + i23;
                            byte[] bytes = str.substring(i23, i35).getBytes(charset);
                            if (bytes.length == 1 && i22 == 0) {
                                PDF417HighLevelEncoder.m12404a(bytes, 0, 1, 0, sb);
                                iM12406c = i24;
                            } else {
                                PDF417HighLevelEncoder.m12404a(bytes, 0, bytes.length, i22, sb);
                                i22 = 1;
                                iM12406c = 0;
                            }
                            i23 = i35;
                        }
                        i24 = iM12406c;
                        c3 = 902;
                        i3 = i13;
                    }
                    sb.append(c3);
                    PDF417HighLevelEncoder.m12405b(str, i23, i12, sb);
                    i23 += i12;
                    i22 = 2;
                }
            } else {
                i5 = i3;
                sb.append((char) 902);
                PDF417HighLevelEncoder.m12405b(str, 0, length, sb);
            }
        } else {
            i5 = i3;
            byte[] bytes2 = str.getBytes(charset);
            PDF417HighLevelEncoder.m12404a(bytes2, 0, bytes2.length, 1, sb);
        }
        String string = sb.toString();
        int length5 = string.length();
        float f = 0.0f;
        int[] iArr = null;
        for (int i36 = pdf417.f27760f; i36 <= pdf417.f27761g; i36++) {
            int i37 = length5 + 1 + iM12403a;
            int i38 = (i37 / i36) + 1;
            if (i36 * i38 >= i37 + i36) {
                i38--;
            }
            if (i38 < pdf417.f27763i) {
                break;
            }
            if (i38 <= pdf417.f27762h) {
                float f2 = (((i36 * 17) + 69) * 0.357f) / (i38 * 2.0f);
                if (iArr == null || Math.abs(f2 - 3.0f) <= Math.abs(f - 3.0f)) {
                    iArr = new int[]{i36, i38};
                    f = f2;
                }
            }
        }
        if (iArr == null) {
            int i39 = pdf417.f27760f;
            int i40 = length5 + 1 + iM12403a;
            int i41 = (i40 / i39) + 1;
            if (i39 * i41 >= i40 + i39) {
                i41--;
            }
            int i42 = pdf417.f27763i;
            if (i41 < i42) {
                c2 = 0;
                i6 = 1;
                iArr = new int[]{i39, i42};
            } else {
                i6 = 1;
                c2 = 0;
            }
        } else {
            i6 = 1;
            c2 = 0;
        }
        if (iArr == null) {
            throw new WriterException("Unable to fit message in columns");
        }
        int i43 = iArr[c2];
        int i44 = iArr[i6];
        int i45 = (i43 * i44) - iM12403a;
        int i46 = i45 > length5 + 1 ? (i45 - length5) - 1 : 0;
        if (iM12403a + length5 + i6 > 929) {
            throw new WriterException("Encoded message contains too many code words, message too big (" + str.length() + " bytes)");
        }
        int i47 = length5 + i46 + i6;
        StringBuilder sb2 = new StringBuilder(i47);
        sb2.append((char) i47);
        sb2.append(string);
        for (int i48 = 0; i48 < i46; i48++) {
            sb2.append((char) 900);
        }
        String string2 = sb2.toString();
        int iM12403a2 = PDF417ErrorCorrection.m12403a(i4);
        char[] cArr = new char[iM12403a2];
        int length6 = string2.length();
        for (int i49 = 0; i49 < length6; i49++) {
            int i50 = iM12403a2 - 1;
            int iCharAt = (string2.charAt(i49) + cArr[i50]) % 929;
            while (i50 > 0) {
                int i51 = i50 - 1;
                cArr[i50] = (char) ((cArr[i51] + (929 - ((PDF417ErrorCorrection.f27764a[i4][i50] * iCharAt) % 929))) % 929);
                i50 = i51;
            }
            cArr[0] = (char) ((929 - ((iCharAt * PDF417ErrorCorrection.f27764a[i4][0]) % 929)) % 929);
        }
        StringBuilder sb3 = new StringBuilder(iM12403a2);
        while (true) {
            iM12403a2--;
            if (iM12403a2 < 0) {
                break;
            }
            if (cArr[iM12403a2] != 0) {
                cArr[iM12403a2] = (char) (929 - cArr[iM12403a2]);
            }
            sb3.append(cArr[iM12403a2]);
        }
        String string3 = sb3.toString();
        pdf417.f27756b = new BarcodeMatrix(i44, i43);
        String strM1599u = outline.m1599u(string2, string3);
        BarcodeMatrix barcodeMatrix = pdf417.f27756b;
        int i52 = 0;
        for (int i53 = 0; i53 < i44; i53++) {
            int i54 = i53 % 3;
            barcodeMatrix.f27746b++;
            PDF417.m12402a(130728, 17, barcodeMatrix.m12399a());
            if (i54 == 0) {
                i9 = (i53 / 3) * 30;
                i7 = ((i44 - 1) / 3) + i9;
                i10 = i43 - 1;
            } else {
                if (i54 == 1) {
                    i9 = (i53 / 3) * 30;
                    int i55 = i44 - 1;
                    i7 = (i4 * 3) + i9 + (i55 % 3);
                    i10 = i55 / 3;
                } else {
                    int i56 = (i53 / 3) * 30;
                    i7 = (i43 - 1) + i56;
                    i8 = (i4 * 3) + i56 + ((i44 - 1) % 3);
                }
                PDF417.m12402a(PDF417.f27755a[i54][i7], 17, barcodeMatrix.m12399a());
                for (i11 = 0; i11 < i43; i11++) {
                    PDF417.m12402a(PDF417.f27755a[i54][strM1599u.charAt(i52)], 17, barcodeMatrix.m12399a());
                    i52++;
                }
                if (pdf417.f27757c) {
                    PDF417.m12402a(260649, 1, barcodeMatrix.m12399a());
                } else {
                    PDF417.m12402a(PDF417.f27755a[i54][i8], 17, barcodeMatrix.m12399a());
                    PDF417.m12402a(260649, 18, barcodeMatrix.m12399a());
                }
            }
            i8 = i10 + i9;
            PDF417.m12402a(PDF417.f27755a[i54][i7], 17, barcodeMatrix.m12399a());
            while (i11 < i43) {
                PDF417.m12402a(PDF417.f27755a[i54][strM1599u.charAt(i52)], 17, barcodeMatrix.m12399a());
                i52++;
            }
            if (pdf417.f27757c) {
                PDF417.m12402a(260649, 1, barcodeMatrix.m12399a());
            } else {
                PDF417.m12402a(PDF417.f27755a[i54][i8], 17, barcodeMatrix.m12399a());
                PDF417.m12402a(260649, 18, barcodeMatrix.m12399a());
            }
        }
        byte[][] bArrM12400b = pdf417.f27756b.m12400b(1, 4);
        if ((i2 > i) != (bArrM12400b[0].length < bArrM12400b.length)) {
            bArrM12400b = m12398c(bArrM12400b);
            z = true;
        } else {
            z = false;
        }
        int length7 = i / bArrM12400b[0].length;
        int length8 = i2 / bArrM12400b.length;
        if (length7 >= length8) {
            length7 = length8;
        }
        if (length7 <= 1) {
            return m12397b(bArrM12400b, i5);
        }
        byte[][] bArrM12400b2 = pdf417.f27756b.m12400b(length7, length7 << 2);
        if (z) {
            bArrM12400b2 = m12398c(bArrM12400b2);
        }
        return m12397b(bArrM12400b2, i5);
    }
}
