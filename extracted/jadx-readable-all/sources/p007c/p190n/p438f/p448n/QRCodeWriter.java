package p007c.p190n.p438f.p448n;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import p007c.p190n.p194b.p334e.C4799a;
import p007c.p190n.p438f.BarcodeFormat;
import p007c.p190n.p438f.EncodeHintType;
import p007c.p190n.p438f.Writer;
import p007c.p190n.p438f.WriterException;
import p007c.p190n.p438f.p441j.BitArray;
import p007c.p190n.p438f.p441j.BitMatrix;
import p007c.p190n.p438f.p441j.CharacterSetECI;
import p007c.p190n.p438f.p441j.p442d.GenericGF;
import p007c.p190n.p438f.p441j.p442d.ReedSolomonEncoder;
import p007c.p190n.p438f.p448n.p449b.ErrorCorrectionLevel;
import p007c.p190n.p438f.p448n.p449b.Mode;
import p007c.p190n.p438f.p448n.p449b.Version;
import p007c.p190n.p438f.p448n.p450c.BlockPair;
import p007c.p190n.p438f.p448n.p450c.ByteMatrix;
import p007c.p190n.p438f.p448n.p450c.Encoder5;
import p007c.p190n.p438f.p448n.p450c.MatrixUtil;
import p007c.p190n.p438f.p448n.p450c.QRCode;

/* JADX INFO: renamed from: c.n.f.n.a, reason: use source file name */
/* JADX INFO: compiled from: QRCodeWriter.java */
/* JADX INFO: loaded from: classes.dex */
public final class QRCodeWriter implements Writer {
    /* JADX WARN: Code duplicated, block: B:104:0x015f A[LOOP:1: B:89:0x012d->B:104:0x015f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:151:0x025d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0045 A[PHI: r4
  0x0045: PHI (r4v4 c.n.f.n.b.a) = (r4v3 c.n.f.n.b.a), (r4v21 c.n.f.n.b.a) binds: [B:9:0x001a, B:14:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:356:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x016e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0099  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bd A[EDGE_INSN: B:61:0x00bd->B:65:0x00c6 BREAK  A[LOOP:0: B:49:0x009c->B:59:0x00b8]] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2 A[EDGE_INSN: B:63:0x00c2->B:65:0x00c6 BREAK  A[LOOP:0: B:49:0x009c->B:59:0x00b8]] */
    @Override // p007c.p190n.p438f.Writer
    /* JADX INFO: renamed from: a */
    public BitMatrix mo12331a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) throws WriterException {
        int i3;
        boolean z;
        Mode mode;
        int i4;
        Version versionM12418a;
        Version version;
        int i5;
        int i6;
        int i7;
        CharacterSetECI characterSetECI;
        boolean z2;
        boolean z3;
        int i8;
        char cCharAt;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(barcodeFormat)));
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        ErrorCorrectionLevel errorCorrectionLevelValueOf = ErrorCorrectionLevel.L;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.ERROR_CORRECTION;
            if (map.containsKey(encodeHintType)) {
                errorCorrectionLevelValueOf = ErrorCorrectionLevel.valueOf(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.MARGIN;
            if (map.containsKey(encodeHintType2)) {
                i3 = Integer.parseInt(map.get(encodeHintType2).toString());
            } else {
                i3 = 4;
            }
        } else {
            i3 = 4;
        }
        EncodeHintType encodeHintType3 = EncodeHintType.GS1_FORMAT;
        EncodeHintType encodeHintType4 = EncodeHintType.CHARACTER_SET;
        Mode mode2 = Mode.BYTE;
        boolean z4 = map != null && map.containsKey(encodeHintType4);
        String string = z4 ? map.get(encodeHintType4).toString() : "ISO-8859-1";
        if (!"Shift_JIS".equals(string)) {
            z2 = false;
            z3 = false;
            i8 = 0;
            while (true) {
                if (i8 < str.length()) {
                    cCharAt = str.charAt(i8);
                    if (cCharAt < '0') {
                        if (Encoder5.m12419b(cCharAt) != -1) {
                            z2 = true;
                        }
                    } else if (Encoder5.m12419b(cCharAt) != -1) {
                        z2 = true;
                    }
                    i8++;
                } else {
                    if (z2) {
                        mode = Mode.ALPHANUMERIC;
                        break;
                    }
                    if (z3) {
                        mode = Mode.NUMERIC;
                        break;
                    }
                }
                mode = mode2;
                break;
            }
        }
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                z = false;
                break;
            }
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    z = true;
                    break;
                }
                int i10 = bytes[i9] & 255;
                if ((i10 < 129 || i10 > 159) && (i10 < 224 || i10 > 235)) {
                    z = false;
                    break;
                }
                i9 += 2;
            }
        } catch (UnsupportedEncodingException unused) {
        }
        if (!z) {
            z2 = false;
            z3 = false;
            i8 = 0;
            while (true) {
                if (i8 < str.length()) {
                    cCharAt = str.charAt(i8);
                    if (cCharAt < '0' && cCharAt <= '9') {
                        z3 = true;
                    } else if (Encoder5.m12419b(cCharAt) != -1) {
                        z2 = true;
                    }
                    i8++;
                } else {
                    if (z2) {
                        mode = Mode.ALPHANUMERIC;
                        break;
                    }
                    if (z3) {
                        mode = Mode.NUMERIC;
                        break;
                    }
                }
                mode = mode2;
                break;
            }
        }
        mode = Mode.KANJI;
        BitArray bitArray = new BitArray();
        if (mode == mode2 && z4 && (characterSetECI = CharacterSetECI.f27654H.get(string)) != null) {
            bitArray.m12344d(7, 4);
            bitArray.m12344d(characterSetECI.f27677J[0], 8);
        }
        if ((map != null && map.containsKey(encodeHintType3)) && Boolean.valueOf(map.get(encodeHintType3).toString()).booleanValue()) {
            i4 = 4;
            bitArray.m12344d(5, 4);
        } else {
            i4 = 4;
        }
        bitArray.m12344d(mode.f27788r, i4);
        BitArray bitArray2 = new BitArray();
        int iOrdinal = mode.ordinal();
        if (iOrdinal == 1) {
            int length2 = str.length();
            int i11 = 0;
            while (i11 < length2) {
                int iCharAt = str.charAt(i11) - '0';
                int i12 = i11 + 2;
                if (i12 < length2) {
                    bitArray2.m12344d(((str.charAt(i11 + 1) - '0') * 10) + (iCharAt * 100) + (str.charAt(i12) - '0'), 10);
                    i11 += 3;
                } else {
                    i11++;
                    if (i11 < length2) {
                        bitArray2.m12344d((iCharAt * 10) + (str.charAt(i11) - '0'), 7);
                        i11 = i12;
                    } else {
                        bitArray2.m12344d(iCharAt, 4);
                    }
                }
            }
        } else if (iOrdinal == 2) {
            int length3 = str.length();
            int i13 = 0;
            while (i13 < length3) {
                int iM12419b = Encoder5.m12419b(str.charAt(i13));
                if (iM12419b == -1) {
                    throw new WriterException();
                }
                int i14 = i13 + 1;
                if (i14 < length3) {
                    int iM12419b2 = Encoder5.m12419b(str.charAt(i14));
                    if (iM12419b2 == -1) {
                        throw new WriterException();
                    }
                    bitArray2.m12344d((iM12419b * 45) + iM12419b2, 11);
                    i13 += 2;
                } else {
                    bitArray2.m12344d(iM12419b, 6);
                    i13 = i14;
                }
            }
        } else if (iOrdinal == i4) {
            try {
                for (byte b : str.getBytes(string)) {
                    bitArray2.m12344d(b, 8);
                }
            } catch (UnsupportedEncodingException e) {
                throw new WriterException(e);
            }
        } else {
            if (iOrdinal != 6) {
                throw new WriterException("Invalid mode: ".concat(String.valueOf(mode)));
            }
            try {
                byte[] bytes2 = str.getBytes("Shift_JIS");
                int length4 = bytes2.length;
                for (int i15 = 0; i15 < length4; i15 += 2) {
                    int i16 = ((bytes2[i15] & 255) << 8) | (bytes2[i15 + 1] & 255);
                    if (i16 < 33088 || i16 > 40956) {
                        if (i16 < 57408 || i16 > 60351) {
                            i6 = -1;
                        } else {
                            i7 = 49472;
                        }
                        if (i6 != -1) {
                            throw new WriterException("Invalid byte sequence");
                        }
                        bitArray2.m12344d(((i6 >> 8) * 192) + (i6 & 255), 13);
                    } else {
                        i7 = 33088;
                    }
                    i6 = i16 - i7;
                    if (i6 != -1) {
                        throw new WriterException("Invalid byte sequence");
                    }
                    bitArray2.m12344d(((i6 >> 8) * 192) + (i6 & 255), 13);
                }
            } catch (UnsupportedEncodingException e2) {
                throw new WriterException(e2);
            }
        }
        if (map != null) {
            EncodeHintType encodeHintType5 = EncodeHintType.QR_VERSION;
            if (map.containsKey(encodeHintType5)) {
                versionM12418a = Version.m12413b(Integer.parseInt(map.get(encodeHintType5).toString()));
                if (!Encoder5.m12420c(mode.m12411f(versionM12418a) + bitArray.f27642g + bitArray2.f27642g, versionM12418a, errorCorrectionLevelValueOf)) {
                    throw new WriterException("Data too big for requested version");
                }
            } else {
                versionM12418a = Encoder5.m12418a(mode.m12411f(Encoder5.m12418a(mode.m12411f(Version.m12413b(1)) + bitArray.f27642g + bitArray2.f27642g, errorCorrectionLevelValueOf)) + bitArray.f27642g + bitArray2.f27642g, errorCorrectionLevelValueOf);
            }
        } else {
            versionM12418a = Encoder5.m12418a(mode.m12411f(Encoder5.m12418a(mode.m12411f(Version.m12413b(1)) + bitArray.f27642g + bitArray2.f27642g, errorCorrectionLevelValueOf)) + bitArray.f27642g + bitArray2.f27642g, errorCorrectionLevelValueOf);
        }
        BitArray bitArray3 = new BitArray();
        bitArray3.m12343b(bitArray);
        int iM12347i = mode == mode2 ? bitArray2.m12347i() : str.length();
        int iM12411f = mode.m12411f(versionM12418a);
        int i17 = 1 << iM12411f;
        if (iM12347i >= i17) {
            throw new WriterException(iM12347i + " is bigger than " + (i17 - 1));
        }
        bitArray3.m12344d(iM12347i, iM12411f);
        bitArray3.m12343b(bitArray2);
        Version.b bVar = versionM12418a.f27791c[errorCorrectionLevelValueOf.ordinal()];
        int iM12414a = versionM12418a.f27792d - (bVar.m12414a() * bVar.f27795a);
        int i18 = iM12414a << 3;
        if (bitArray3.f27642g > i18) {
            throw new WriterException("data bits cannot fit in the QR Code" + bitArray3.f27642g + " > " + i18);
        }
        for (int i19 = 0; i19 < 4 && bitArray3.f27642g < i18; i19++) {
            bitArray3.m12342a(false);
        }
        boolean z5 = false;
        int i20 = bitArray3.f27642g & 7;
        if (i20 > 0) {
            while (i20 < 8) {
                bitArray3.m12342a(z5);
                i20++;
                z5 = false;
            }
        }
        int iM12347i2 = iM12414a - bitArray3.m12347i();
        for (int i21 = 0; i21 < iM12347i2; i21++) {
            bitArray3.m12344d((i21 & 1) == 0 ? 236 : 17, 8);
        }
        if (bitArray3.f27642g != i18) {
            throw new WriterException("Bits size does not equal capacity");
        }
        int i22 = versionM12418a.f27792d;
        int iM12414a2 = bVar.m12414a();
        if (bitArray3.m12347i() != iM12414a) {
            throw new WriterException("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(iM12414a2);
        int i23 = 0;
        int iMax = 0;
        int iMax2 = 0;
        int i24 = 0;
        while (i24 < iM12414a2) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            if (i24 >= iM12414a2) {
                throw new WriterException("Block ID too large");
            }
            int i25 = i22 % iM12414a2;
            int i26 = i3;
            int i27 = iM12414a2 - i25;
            int i28 = i22 / iM12414a2;
            int i29 = i28 + 1;
            int i30 = iM12414a / iM12414a2;
            int i31 = i30 + 1;
            Version version2 = versionM12418a;
            int i32 = i28 - i30;
            Mode mode3 = mode;
            int i33 = i29 - i31;
            if (i32 != i33) {
                throw new WriterException("EC bytes mismatch");
            }
            ErrorCorrectionLevel errorCorrectionLevel = errorCorrectionLevelValueOf;
            if (iM12414a2 != i27 + i25) {
                throw new WriterException("RS blocks mismatch");
            }
            if (i22 != ((i31 + i33) * i25) + ((i30 + i32) * i27)) {
                throw new WriterException("Total bytes mismatch");
            }
            if (i24 < i27) {
                iArr[0] = i30;
                iArr2[0] = i32;
            } else {
                iArr[0] = i31;
                iArr2[0] = i33;
            }
            int i34 = iArr[0];
            byte[] bArr = new byte[i34];
            int i35 = i23 << 3;
            int i36 = 0;
            while (i36 < i34) {
                int i37 = iM12414a2;
                int i38 = i22;
                int i39 = 0;
                int i40 = 0;
                for (int i41 = 8; i40 < i41; i41 = 8) {
                    if (bitArray3.m12346g(i35)) {
                        i39 |= 1 << (7 - i40);
                    }
                    i35++;
                    i40++;
                }
                bArr[i36 + 0] = (byte) i39;
                i36++;
                iM12414a2 = i37;
                i22 = i38;
            }
            int i42 = iM12414a2;
            int i43 = i22;
            int i44 = iArr2[0];
            int[] iArr3 = new int[i34 + i44];
            for (int i45 = 0; i45 < i34; i45++) {
                iArr3[i45] = bArr[i45] & 255;
            }
            new ReedSolomonEncoder(GenericGF.f27683e).m12357a(iArr3, i44);
            byte[] bArr2 = new byte[i44];
            for (int i46 = 0; i46 < i44; i46++) {
                bArr2[i46] = (byte) iArr3[i34 + i46];
            }
            arrayList.add(new BlockPair(bArr, bArr2));
            iMax = Math.max(iMax, i34);
            iMax2 = Math.max(iMax2, i44);
            i23 += iArr[0];
            i24++;
            versionM12418a = version2;
            i3 = i26;
            mode = mode3;
            errorCorrectionLevelValueOf = errorCorrectionLevel;
            iM12414a2 = i42;
            i22 = i43;
        }
        Version version3 = versionM12418a;
        ErrorCorrectionLevel errorCorrectionLevel2 = errorCorrectionLevelValueOf;
        Mode mode4 = mode;
        int i47 = i3;
        int i48 = i22;
        if (iM12414a != i23) {
            throw new WriterException("Data bytes does not match offset");
        }
        BitArray bitArray4 = new BitArray();
        for (int i49 = 0; i49 < iMax; i49++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArr3 = ((BlockPair) it.next()).f27797a;
                if (i49 < bArr3.length) {
                    bitArray4.m12344d(bArr3[i49], 8);
                }
            }
        }
        for (int i50 = 0; i50 < iMax2; i50++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArr4 = ((BlockPair) it2.next()).f27798b;
                if (i50 < bArr4.length) {
                    bitArray4.m12344d(bArr4[i50], 8);
                }
            }
        }
        if (i48 != bitArray4.m12347i()) {
            throw new WriterException("Interleaving error: " + i48 + " and " + bitArray4.m12347i() + " differ.");
        }
        QRCode qRCode = new QRCode();
        qRCode.f27808b = errorCorrectionLevel2;
        qRCode.f27807a = mode4;
        Version version4 = version3;
        qRCode.f27809c = version4;
        int i51 = (version4.f27790b * 4) + 17;
        ByteMatrix byteMatrix = new ByteMatrix(i51, i51);
        int i52 = Integer.MAX_VALUE;
        int i53 = -1;
        int i54 = 0;
        for (int i55 = 8; i54 < i55; i55 = 8) {
            MatrixUtil.m12421a(bitArray4, errorCorrectionLevel2, version4, i54, byteMatrix);
            int i56 = 0;
            int iM10978b = C4799a.m10978b(byteMatrix, false) + C4799a.m10978b(byteMatrix, true);
            byte[][] bArr5 = byteMatrix.f27799a;
            int i57 = byteMatrix.f27800b;
            int i58 = byteMatrix.f27801c;
            int i59 = 0;
            int i60 = 0;
            while (i59 < i58 - 1) {
                byte[] bArr6 = bArr5[i59];
                int i61 = i58;
                while (i56 < i57 - 1) {
                    byte b2 = bArr6[i56];
                    int i62 = i56 + 1;
                    int i63 = i57;
                    if (b2 == bArr6[i62]) {
                        int i64 = i59 + 1;
                        if (b2 == bArr5[i64][i56] && b2 == bArr5[i64][i62]) {
                            i60++;
                        }
                    }
                    i56 = i62;
                    i57 = i63;
                }
                i59++;
                i58 = i61;
                i56 = 0;
            }
            int i65 = (i60 * 3) + iM10978b;
            byte[][] bArr7 = byteMatrix.f27799a;
            int i66 = byteMatrix.f27800b;
            int i67 = byteMatrix.f27801c;
            int i68 = 0;
            for (int i69 = 0; i69 < i67; i69++) {
                int i70 = 0;
                while (i70 < i66) {
                    byte[] bArr8 = bArr7[i69];
                    BitArray bitArray5 = bitArray4;
                    int i71 = i70 + 6;
                    if (i71 < i66) {
                        i5 = i66;
                        version = version4;
                        if (bArr8[i70] == 1 && bArr8[i70 + 1] == 0 && bArr8[i70 + 2] == 1 && bArr8[i70 + 3] == 1 && bArr8[i70 + 4] == 1 && bArr8[i70 + 5] == 0 && bArr8[i71] == 1 && (C4799a.m10979b0(bArr8, i70 - 4, i70) || C4799a.m10979b0(bArr8, i70 + 7, i70 + 11))) {
                            i68++;
                        }
                    } else {
                        version = version4;
                        i5 = i66;
                    }
                    int i72 = i69 + 6;
                    if (i72 < i67 && bArr7[i69][i70] == 1 && bArr7[i69 + 1][i70] == 0 && bArr7[i69 + 2][i70] == 1 && bArr7[i69 + 3][i70] == 1 && bArr7[i69 + 4][i70] == 1 && bArr7[i69 + 5][i70] == 0 && bArr7[i72][i70] == 1 && (C4799a.m10981c0(bArr7, i70, i69 - 4, i69) || C4799a.m10981c0(bArr7, i70, i69 + 7, i69 + 11))) {
                        i68++;
                    }
                    i70++;
                    bitArray4 = bitArray5;
                    version4 = version;
                    i66 = i5;
                }
            }
            BitArray bitArray6 = bitArray4;
            Version version5 = version4;
            int i73 = (i68 * 40) + i65;
            byte[][] bArr9 = byteMatrix.f27799a;
            int i74 = byteMatrix.f27800b;
            int i75 = byteMatrix.f27801c;
            int i76 = 0;
            for (int i77 = 0; i77 < i75; i77++) {
                byte[] bArr10 = bArr9[i77];
                for (int i78 = 0; i78 < i74; i78++) {
                    if (bArr10[i78] == 1) {
                        i76++;
                    }
                }
            }
            int i79 = byteMatrix.f27801c * byteMatrix.f27800b;
            int iAbs = (((Math.abs((i76 << 1) - i79) * 10) / i79) * 10) + i73;
            if (iAbs < i52) {
                i52 = iAbs;
                i53 = i54;
            }
            i54++;
            bitArray4 = bitArray6;
            version4 = version5;
        }
        qRCode.f27810d = i53;
        MatrixUtil.m12421a(bitArray4, errorCorrectionLevel2, version4, i53, byteMatrix);
        qRCode.f27811e = byteMatrix;
        int i80 = byteMatrix.f27800b;
        int i81 = byteMatrix.f27801c;
        int i82 = i47 << 1;
        int i83 = i80 + i82;
        int i84 = i82 + i81;
        int iMax3 = Math.max(i, i83);
        int iMax4 = Math.max(i2, i84);
        int iMin = Math.min(iMax3 / i83, iMax4 / i84);
        int i85 = (iMax3 - (i80 * iMin)) / 2;
        int i86 = (iMax4 - (i81 * iMin)) / 2;
        BitMatrix bitMatrix = new BitMatrix(iMax3, iMax4);
        int i87 = 0;
        while (i87 < i81) {
            int i88 = i85;
            int i89 = 0;
            while (i89 < i80) {
                if (byteMatrix.m12415a(i89, i87) == 1) {
                    bitMatrix.m12350d(i88, i86, iMin, iMin);
                }
                i89++;
                i88 += iMin;
            }
            i87++;
            i86 += iMin;
        }
        return bitMatrix;
    }
}
