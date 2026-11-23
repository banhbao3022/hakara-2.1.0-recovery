package p007c.p190n.p438f.p439i;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p438f.BarcodeFormat;
import p007c.p190n.p438f.EncodeHintType;
import p007c.p190n.p438f.Writer;
import p007c.p190n.p438f.p439i.p440b.AztecCode;
import p007c.p190n.p438f.p439i.p440b.Encoder3;
import p007c.p190n.p438f.p439i.p440b.HighLevelEncoder;
import p007c.p190n.p438f.p439i.p440b.HighLevelEncoder2;
import p007c.p190n.p438f.p439i.p440b.State;
import p007c.p190n.p438f.p439i.p440b.Token2;
import p007c.p190n.p438f.p441j.BitArray;
import p007c.p190n.p438f.p441j.BitMatrix;

/* JADX INFO: renamed from: c.n.f.i.a, reason: use source file name */
/* JADX INFO: compiled from: AztecWriter.java */
/* JADX INFO: loaded from: classes.dex */
public final class AztecWriter implements Writer {
    /* JADX WARN: Code duplicated, block: B:13:0x0046 A[PHI: r1 r3
  0x0046: PHI (r1v1 java.nio.charset.Charset) = (r1v0 java.nio.charset.Charset), (r1v40 java.nio.charset.Charset) binds: [B:3:0x0007, B:11:0x0037] A[DONT_GENERATE, DONT_INLINE]
  0x0046: PHI (r3v1 int) = (r3v0 int), (r3v17 int) binds: [B:3:0x0007, B:11:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    @Override // p007c.p190n.p438f.Writer
    /* JADX INFO: renamed from: a */
    public BitMatrix mo12331a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        int i3;
        int i4;
        int i5;
        BitArray bitArrayM12335c;
        int i6;
        boolean z;
        int iAbs;
        int i7;
        BitArray bitArrayM12334b;
        int i8;
        int i9;
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        int i10 = 33;
        if (map != null) {
            EncodeHintType encodeHintType = EncodeHintType.CHARACTER_SET;
            if (map.containsKey(encodeHintType)) {
                charsetForName = Charset.forName(map.get(encodeHintType).toString());
            }
            EncodeHintType encodeHintType2 = EncodeHintType.ERROR_CORRECTION;
            i10 = map.containsKey(encodeHintType2) ? Integer.parseInt(map.get(encodeHintType2).toString()) : 33;
            EncodeHintType encodeHintType3 = EncodeHintType.AZTEC_LAYERS;
            if (map.containsKey(encodeHintType3)) {
                i3 = Integer.parseInt(map.get(encodeHintType3).toString());
            } else {
                i3 = 0;
            }
        } else {
            i3 = 0;
        }
        if (barcodeFormat != BarcodeFormat.AZTEC) {
            throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat)));
        }
        HighLevelEncoder2 highLevelEncoder2 = new HighLevelEncoder2(str.getBytes(charsetForName));
        Collection<State> collectionSingletonList = Collections.singletonList(State.f27634a);
        int i11 = 0;
        while (true) {
            byte[] bArr = highLevelEncoder2.f27631e;
            i4 = 32;
            int i12 = 4;
            int i13 = 2;
            i5 = 1;
            if (i11 >= bArr.length) {
                break;
            }
            int i14 = i11 + 1;
            byte b = i14 < bArr.length ? bArr[i14] : (byte) 0;
            byte b2 = bArr[i11];
            if (b2 != 13) {
                if (b2 != 44) {
                    if (b2 != 46) {
                        if (b2 == 58 && b == 32) {
                            i9 = 5;
                        } else {
                            i9 = 0;
                        }
                    } else if (b == 32) {
                        i9 = 3;
                    } else {
                        i9 = 0;
                    }
                } else if (b == 32) {
                    i9 = 4;
                } else {
                    i9 = 0;
                }
            } else if (b == 10) {
                i9 = 2;
            } else {
                i9 = 0;
            }
            if (i9 > 0) {
                LinkedList linkedList = new LinkedList();
                for (State state : collectionSingletonList) {
                    State stateM12338b = state.m12338b(i11);
                    linkedList.add(stateM12338b.m12340d(4, i9));
                    if (state.f27635b != 4) {
                        linkedList.add(stateM12338b.m12341e(4, i9));
                    }
                    if (i9 == 3 || i9 == 4) {
                        linkedList.add(stateM12338b.m12340d(2, 16 - i9).m12340d(2, 1));
                    }
                    if (state.f27637d > 0) {
                        linkedList.add(state.m12337a(i11).m12337a(i14));
                    }
                }
                collectionSingletonList = HighLevelEncoder2.m12336a(linkedList);
                i11 = i14;
            } else {
                LinkedList linkedList2 = new LinkedList();
                for (State state2 : collectionSingletonList) {
                    char c2 = (char) (highLevelEncoder2.f27631e[i11] & 255);
                    boolean z2 = HighLevelEncoder2.f27629c[state2.f27635b][c2] > 0;
                    int i15 = 0;
                    State stateM12338b2 = null;
                    while (i15 <= i12) {
                        int i16 = HighLevelEncoder2.f27629c[i15][c2];
                        if (i16 > 0) {
                            if (stateM12338b2 == null) {
                                stateM12338b2 = state2.m12338b(i11);
                            }
                            if (!z2 || i15 == state2.f27635b || i15 == i13) {
                                linkedList2.add(stateM12338b2.m12340d(i15, i16));
                            }
                            if (!z2 && HighLevelEncoder2.f27630d[state2.f27635b][i15] >= 0) {
                                linkedList2.add(stateM12338b2.m12341e(i15, i16));
                            }
                        }
                        i15++;
                        i12 = 4;
                        i13 = 2;
                    }
                    if (state2.f27637d > 0 || HighLevelEncoder2.f27629c[state2.f27635b][c2] == 0) {
                        linkedList2.add(state2.m12337a(i11));
                    }
                    i12 = 4;
                    i13 = 2;
                }
                collectionSingletonList = HighLevelEncoder2.m12336a(linkedList2);
            }
            i11++;
        }
        State state3 = (State) Collections.min(collectionSingletonList, new HighLevelEncoder(highLevelEncoder2));
        byte[] bArr2 = highLevelEncoder2.f27631e;
        Objects.requireNonNull(state3);
        LinkedList linkedList3 = new LinkedList();
        for (Token2 token2 = state3.m12338b(bArr2.length).f27636c; token2 != null; token2 = token2.f27640b) {
            linkedList3.addFirst(token2);
        }
        BitArray bitArray = new BitArray();
        Iterator it = linkedList3.iterator();
        while (it.hasNext()) {
            ((Token2) it.next()).mo12332a(bitArray, bArr2);
        }
        int i17 = bitArray.f27642g;
        int iM1602x = outline.m1602x(i10, i17, 100, 11);
        int i18 = i17 + iM1602x;
        if (i3 != 0) {
            z = i3 < 0;
            iAbs = Math.abs(i3);
            if (iAbs > (z ? 4 : 32)) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i3)));
            }
            i7 = ((z ? 88 : 112) + (iAbs << 4)) * iAbs;
            i6 = Encoder3.f27626a[iAbs];
            int i19 = i7 - (i7 % i6);
            bitArrayM12335c = Encoder3.m12335c(bitArray, i6);
            int i20 = bitArrayM12335c.f27642g;
            if (iM1602x + i20 > i19) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (z && i20 > (i6 << 6)) {
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
        } else {
            int i21 = 0;
            BitArray bitArrayM12335c2 = null;
            int i22 = 0;
            while (true) {
                if (i21 > i4) {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
                boolean z3 = i21 <= 3;
                int i23 = z3 ? i21 + 1 : i21;
                int i24 = ((z3 ? 88 : 112) + (i23 << 4)) * i23;
                if (i18 <= i24) {
                    if (bitArrayM12335c2 == null || i22 != Encoder3.f27626a[i23]) {
                        int i25 = Encoder3.f27626a[i23];
                        i22 = i25;
                        bitArrayM12335c2 = Encoder3.m12335c(bitArray, i25);
                    }
                    int i26 = i24 - (i24 % i22);
                    if ((!z3 || bitArrayM12335c2.f27642g <= (i22 << 6)) && bitArrayM12335c2.f27642g + iM1602x <= i26) {
                        bitArrayM12335c = bitArrayM12335c2;
                        i6 = i22;
                        z = z3;
                        iAbs = i23;
                        i7 = i24;
                        break;
                    }
                }
                i21++;
                i5 = 1;
                i4 = 32;
            }
        }
        BitArray bitArrayM12334b2 = Encoder3.m12334b(bitArrayM12335c, i7, i6);
        int i27 = bitArrayM12335c.f27642g / i6;
        BitArray bitArray2 = new BitArray();
        if (z) {
            bitArray2.m12344d(iAbs - 1, 2);
            bitArray2.m12344d(i27 - 1, 6);
            bitArrayM12334b = Encoder3.m12334b(bitArray2, 28, 4);
        } else {
            bitArray2.m12344d(iAbs - 1, 5);
            bitArray2.m12344d(i27 - 1, 11);
            bitArrayM12334b = Encoder3.m12334b(bitArray2, 40, 4);
        }
        int i28 = (z ? 11 : 14) + (iAbs << 2);
        int[] iArr = new int[i28];
        if (z) {
            for (int i29 = 0; i29 < i28; i29++) {
                iArr[i29] = i29;
            }
            i8 = i28;
        } else {
            int i30 = i28 / 2;
            i8 = (((i30 - 1) / 15) * 2) + i28 + 1;
            int i31 = i8 / 2;
            for (int i32 = 0; i32 < i30; i32++) {
                int i33 = (i32 / 15) + i32;
                iArr[(i30 - i32) - i5] = (i31 - i33) - 1;
                iArr[i30 + i32] = i33 + i31 + i5;
            }
        }
        BitMatrix bitMatrix = new BitMatrix(i8);
        int i34 = 0;
        for (int i35 = 0; i35 < iAbs; i35++) {
            int i36 = ((iAbs - i35) << 2) + (z ? 9 : 12);
            for (int i37 = 0; i37 < i36; i37++) {
                int i38 = i37 << 1;
                for (int i39 = 0; i39 < 2; i39++) {
                    if (bitArrayM12334b2.m12346g(i34 + i38 + i39)) {
                        int i40 = i35 << 1;
                        bitMatrix.m12349b(iArr[i40 + i39], iArr[i40 + i37]);
                    }
                    if (bitArrayM12334b2.m12346g((i36 << 1) + i34 + i38 + i39)) {
                        int i41 = i35 << 1;
                        bitMatrix.m12349b(iArr[i41 + i37], iArr[((i28 - 1) - i41) - i39]);
                    }
                    if (bitArrayM12334b2.m12346g((i36 << 2) + i34 + i38 + i39)) {
                        int i42 = (i28 - 1) - (i35 << 1);
                        bitMatrix.m12349b(iArr[i42 - i39], iArr[i42 - i37]);
                    }
                    if (bitArrayM12334b2.m12346g((i36 * 6) + i34 + i38 + i39)) {
                        int i43 = i35 << 1;
                        bitMatrix.m12349b(iArr[((i28 - 1) - i43) - i37], iArr[i43 + i39]);
                    }
                }
            }
            i34 += i36 << 3;
        }
        int i44 = i8 / 2;
        int i45 = 0;
        if (z) {
            while (i45 < 7) {
                int i46 = (i44 - 3) + i45;
                if (bitArrayM12334b.m12346g(i45)) {
                    bitMatrix.m12349b(i46, i44 - 5);
                }
                if (bitArrayM12334b.m12346g(i45 + 7)) {
                    bitMatrix.m12349b(i44 + 5, i46);
                }
                if (bitArrayM12334b.m12346g(20 - i45)) {
                    bitMatrix.m12349b(i46, i44 + 5);
                }
                if (bitArrayM12334b.m12346g(27 - i45)) {
                    bitMatrix.m12349b(i44 - 5, i46);
                }
                i45++;
            }
        } else {
            while (i45 < 10) {
                int i47 = (i45 / 5) + (i44 - 5) + i45;
                if (bitArrayM12334b.m12346g(i45)) {
                    bitMatrix.m12349b(i47, i44 - 7);
                }
                if (bitArrayM12334b.m12346g(i45 + 10)) {
                    bitMatrix.m12349b(i44 + 7, i47);
                }
                if (bitArrayM12334b.m12346g(29 - i45)) {
                    bitMatrix.m12349b(i47, i44 + 7);
                }
                if (bitArrayM12334b.m12346g(39 - i45)) {
                    bitMatrix.m12349b(i44 - 7, i47);
                }
                i45++;
            }
        }
        if (z) {
            Encoder3.m12333a(bitMatrix, i44, 5);
        } else {
            Encoder3.m12333a(bitMatrix, i44, 7);
            int i48 = 0;
            int i49 = 0;
            while (i48 < (i28 / 2) - 1) {
                for (int i50 = i44 & 1; i50 < i8; i50 += 2) {
                    int i51 = i44 - i49;
                    bitMatrix.m12349b(i51, i50);
                    int i52 = i44 + i49;
                    bitMatrix.m12349b(i52, i50);
                    bitMatrix.m12349b(i50, i51);
                    bitMatrix.m12349b(i50, i52);
                }
                i48 += 15;
                i49 += 16;
            }
        }
        new AztecCode().f27623a = bitMatrix;
        int i53 = bitMatrix.f27643f;
        int i54 = bitMatrix.f27644g;
        int iMax = Math.max(i, i53);
        int iMax2 = Math.max(i2, i54);
        int iMin = Math.min(iMax / i53, iMax2 / i54);
        int i55 = (iMax - (i53 * iMin)) / 2;
        int i56 = (iMax2 - (i54 * iMin)) / 2;
        BitMatrix bitMatrix2 = new BitMatrix(iMax, iMax2);
        int i57 = 0;
        while (i57 < i54) {
            int i58 = 0;
            int i59 = i55;
            while (i58 < i53) {
                if (bitMatrix.m12348a(i58, i57)) {
                    bitMatrix2.m12350d(i59, i56, iMin, iMin);
                }
                i58++;
                i59 += iMin;
            }
            i57++;
            i56 += iMin;
        }
        return bitMatrix2;
    }
}
