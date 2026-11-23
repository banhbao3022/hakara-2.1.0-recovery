package p007c.p190n.p438f.p443k;

import java.util.Map;
import p007c.p190n.p438f.BarcodeFormat;
import p007c.p190n.p438f.Dimension;
import p007c.p190n.p438f.EncodeHintType;
import p007c.p190n.p438f.Writer;
import p007c.p190n.p438f.p441j.BitMatrix;
import p007c.p190n.p438f.p443k.p444b.ASCIIEncoder;
import p007c.p190n.p438f.p443k.p444b.Base256Encoder;
import p007c.p190n.p438f.p443k.p444b.C40Encoder;
import p007c.p190n.p438f.p443k.p444b.DefaultPlacement;
import p007c.p190n.p438f.p443k.p444b.EdifactEncoder;
import p007c.p190n.p438f.p443k.p444b.Encoder4;
import p007c.p190n.p438f.p443k.p444b.EncoderContext;
import p007c.p190n.p438f.p443k.p444b.ErrorCorrection;
import p007c.p190n.p438f.p443k.p444b.SymbolInfo;
import p007c.p190n.p438f.p443k.p444b.SymbolShapeHint;
import p007c.p190n.p438f.p443k.p444b.TextEncoder;
import p007c.p190n.p438f.p443k.p444b.X12Encoder;
import p007c.p190n.p438f.p448n.p450c.ByteMatrix;

/* JADX INFO: renamed from: c.n.f.k.a, reason: use source file name */
/* JADX INFO: compiled from: DataMatrixWriter.java */
/* JADX INFO: loaded from: classes.dex */
public final class DataMatrixWriter implements Writer {
    @Override // p007c.p190n.p438f.Writer
    /* JADX INFO: renamed from: a */
    public BitMatrix mo12331a(String str, BarcodeFormat barcodeFormat, int i, int i2, Map<EncodeHintType, ?> map) {
        Dimension dimension;
        int i3;
        int i4;
        BitMatrix bitMatrix;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeFormat != BarcodeFormat.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(barcodeFormat)));
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i2);
        }
        SymbolShapeHint symbolShapeHint = SymbolShapeHint.FORCE_NONE;
        Dimension dimension2 = null;
        if (map != null) {
            SymbolShapeHint symbolShapeHint2 = (SymbolShapeHint) map.get(EncodeHintType.DATA_MATRIX_SHAPE);
            if (symbolShapeHint2 != null) {
                symbolShapeHint = symbolShapeHint2;
            }
            Dimension dimension3 = (Dimension) map.get(EncodeHintType.MIN_SIZE);
            if (dimension3 == null) {
                dimension3 = null;
            }
            dimension = (Dimension) map.get(EncodeHintType.MAX_SIZE);
            if (dimension == null) {
                dimension = null;
            }
            dimension2 = dimension3;
        } else {
            dimension = null;
        }
        Encoder4[] encoder4Arr = {new ASCIIEncoder(), new C40Encoder(), new TextEncoder(), new X12Encoder(), new EdifactEncoder(), new Base256Encoder()};
        EncoderContext encoderContext = new EncoderContext(str);
        encoderContext.f27700b = symbolShapeHint;
        encoderContext.f27701c = dimension2;
        encoderContext.f27702d = dimension;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            encoderContext.f27703e.append((char) 236);
            encoderContext.f27707i = 2;
            encoderContext.f27704f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            encoderContext.f27703e.append((char) 237);
            encoderContext.f27707i = 2;
            encoderContext.f27704f += 7;
        }
        int i5 = 0;
        while (encoderContext.m12374d()) {
            encoder4Arr[i5].mo12358a(encoderContext);
            int i6 = encoderContext.f27705g;
            if (i6 >= 0) {
                encoderContext.f27705g = -1;
                i5 = i6;
            }
        }
        int iM12371a = encoderContext.m12371a();
        encoderContext.m12375e();
        int i7 = encoderContext.f27706h.f27714c;
        if (iM12371a < i7 && i5 != 0 && i5 != 5 && i5 != 4) {
            encoderContext.f27703e.append((char) 254);
        }
        StringBuilder sb = encoderContext.f27703e;
        if (sb.length() < i7) {
            sb.append((char) 129);
        }
        while (sb.length() < i7) {
            int length = (((sb.length() + 1) * 149) % 253) + 1 + 129;
            if (length > 254) {
                length -= 254;
            }
            sb.append((char) length);
        }
        String string = encoderContext.f27703e.toString();
        SymbolInfo symbolInfoM12378i = SymbolInfo.m12378i(string.length(), symbolShapeHint, dimension2, dimension, true);
        int[] iArr = ErrorCorrection.f27708a;
        int length2 = string.length();
        int i8 = symbolInfoM12378i.f27714c;
        if (length2 != i8) {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder sb2 = new StringBuilder(i8 + symbolInfoM12378i.f27715d);
        sb2.append(string);
        int iMo12365c = symbolInfoM12378i.mo12365c();
        if (iMo12365c == 1) {
            sb2.append(ErrorCorrection.m12377a(string, symbolInfoM12378i.f27715d));
        } else {
            sb2.setLength(sb2.capacity());
            int[] iArr2 = new int[iMo12365c];
            int[] iArr3 = new int[iMo12365c];
            int[] iArr4 = new int[iMo12365c];
            int i9 = 0;
            while (i9 < iMo12365c) {
                int i10 = i9 + 1;
                iArr2[i9] = symbolInfoM12378i.mo12364a(i10);
                iArr3[i9] = symbolInfoM12378i.f27720i;
                iArr4[i9] = 0;
                if (i9 > 0) {
                    iArr4[i9] = iArr4[i9 - 1] + iArr2[i9];
                }
                i9 = i10;
            }
            for (int i11 = 0; i11 < iMo12365c; i11++) {
                StringBuilder sb3 = new StringBuilder(iArr2[i11]);
                for (int i12 = i11; i12 < symbolInfoM12378i.f27714c; i12 += iMo12365c) {
                    sb3.append(string.charAt(i12));
                }
                String strM12377a = ErrorCorrection.m12377a(sb3.toString(), iArr3[i11]);
                int i13 = i11;
                int i14 = 0;
                while (i13 < iArr3[i11] * iMo12365c) {
                    sb2.setCharAt(symbolInfoM12378i.f27714c + i13, strM12377a.charAt(i14));
                    i13 += iMo12365c;
                    i14++;
                }
            }
        }
        DefaultPlacement defaultPlacement = new DefaultPlacement(sb2.toString(), symbolInfoM12378i.m12381e(), symbolInfoM12378i.m12380d());
        int i15 = 4;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int i18 = defaultPlacement.f27696b;
            if (i15 == i18 && i16 == 0) {
                defaultPlacement.m12367b(i18 - 1, 0, i17, 1);
                defaultPlacement.m12367b(defaultPlacement.f27696b - 1, 1, i17, 2);
                defaultPlacement.m12367b(defaultPlacement.f27696b - 1, 2, i17, 3);
                defaultPlacement.m12367b(0, defaultPlacement.f27697c - 2, i17, 4);
                defaultPlacement.m12367b(0, defaultPlacement.f27697c - 1, i17, 5);
                defaultPlacement.m12367b(1, defaultPlacement.f27697c - 1, i17, 6);
                defaultPlacement.m12367b(2, defaultPlacement.f27697c - 1, i17, 7);
                defaultPlacement.m12367b(3, defaultPlacement.f27697c - 1, i17, 8);
                i17++;
            }
            int i19 = defaultPlacement.f27696b;
            if (i15 == i19 - 2 && i16 == 0 && defaultPlacement.f27697c % 4 != 0) {
                defaultPlacement.m12367b(i19 - 3, 0, i17, 1);
                defaultPlacement.m12367b(defaultPlacement.f27696b - 2, 0, i17, 2);
                defaultPlacement.m12367b(defaultPlacement.f27696b - 1, 0, i17, 3);
                defaultPlacement.m12367b(0, defaultPlacement.f27697c - 4, i17, 4);
                defaultPlacement.m12367b(0, defaultPlacement.f27697c - 3, i17, 5);
                defaultPlacement.m12367b(0, defaultPlacement.f27697c - 2, i17, 6);
                defaultPlacement.m12367b(0, defaultPlacement.f27697c - 1, i17, 7);
                defaultPlacement.m12367b(1, defaultPlacement.f27697c - 1, i17, 8);
                i17++;
            }
            int i20 = defaultPlacement.f27696b;
            if (i15 == i20 - 2 && i16 == 0 && defaultPlacement.f27697c % 8 == 4) {
                defaultPlacement.m12367b(i20 - 3, 0, i17, 1);
                defaultPlacement.m12367b(defaultPlacement.f27696b - 2, 0, i17, 2);
                defaultPlacement.m12367b(defaultPlacement.f27696b - 1, 0, i17, 3);
                defaultPlacement.m12367b(0, defaultPlacement.f27697c - 2, i17, 4);
                defaultPlacement.m12367b(0, defaultPlacement.f27697c - 1, i17, 5);
                defaultPlacement.m12367b(1, defaultPlacement.f27697c - 1, i17, 6);
                defaultPlacement.m12367b(2, defaultPlacement.f27697c - 1, i17, 7);
                defaultPlacement.m12367b(3, defaultPlacement.f27697c - 1, i17, 8);
                i17++;
            }
            int i21 = defaultPlacement.f27696b;
            if (i15 == i21 + 4 && i16 == 2 && defaultPlacement.f27697c % 8 == 0) {
                defaultPlacement.m12367b(i21 - 1, 0, i17, 1);
                defaultPlacement.m12367b(defaultPlacement.f27696b - 1, defaultPlacement.f27697c - 1, i17, 2);
                defaultPlacement.m12367b(0, defaultPlacement.f27697c - 3, i17, 3);
                defaultPlacement.m12367b(0, defaultPlacement.f27697c - 2, i17, 4);
                defaultPlacement.m12367b(0, defaultPlacement.f27697c - 1, i17, 5);
                defaultPlacement.m12367b(1, defaultPlacement.f27697c - 3, i17, 6);
                defaultPlacement.m12367b(1, defaultPlacement.f27697c - 2, i17, 7);
                defaultPlacement.m12367b(1, defaultPlacement.f27697c - 1, i17, 8);
                i17++;
            }
            do {
                if (i15 < defaultPlacement.f27696b && i16 >= 0 && !defaultPlacement.m12366a(i16, i15)) {
                    defaultPlacement.m12369d(i15, i16, i17);
                    i17++;
                }
                i15 -= 2;
                i16 += 2;
                if (i15 < 0) {
                    break;
                }
            } while (i16 < defaultPlacement.f27697c);
            int i22 = i15 + 1;
            int i23 = i16 + 3;
            do {
                if (i22 >= 0 && i23 < defaultPlacement.f27697c && !defaultPlacement.m12366a(i23, i22)) {
                    defaultPlacement.m12369d(i22, i23, i17);
                    i17++;
                }
                i22 += 2;
                i23 -= 2;
                i3 = defaultPlacement.f27696b;
                if (i22 >= i3) {
                    break;
                }
            } while (i23 >= 0);
            i15 = i22 + 3;
            i16 = i23 + 1;
            if (i15 >= i3 && i16 >= (i4 = defaultPlacement.f27697c)) {
                break;
            }
        }
        if (!defaultPlacement.m12366a(i4 - 1, i3 - 1)) {
            defaultPlacement.m12368c(defaultPlacement.f27697c - 1, defaultPlacement.f27696b - 1, true);
            defaultPlacement.m12368c(defaultPlacement.f27697c - 2, defaultPlacement.f27696b - 2, true);
        }
        int iM12381e = symbolInfoM12378i.m12381e();
        int iM12380d = symbolInfoM12378i.m12380d();
        ByteMatrix byteMatrix = new ByteMatrix(symbolInfoM12378i.m12383g(), symbolInfoM12378i.m12382f());
        int i24 = 0;
        for (int i25 = 0; i25 < iM12380d; i25++) {
            if (i25 % symbolInfoM12378i.f27717f == 0) {
                int i26 = 0;
                for (int i27 = 0; i27 < symbolInfoM12378i.m12383g(); i27++) {
                    byteMatrix.m12417c(i26, i24, i27 % 2 == 0);
                    i26++;
                }
                i24++;
            }
            int i28 = 0;
            for (int i29 = 0; i29 < iM12381e; i29++) {
                if (i29 % symbolInfoM12378i.f27716e == 0) {
                    byteMatrix.m12417c(i28, i24, true);
                    i28++;
                }
                byteMatrix.m12417c(i28, i24, defaultPlacement.f27698d[(defaultPlacement.f27697c * i25) + i29] == 1);
                i28++;
                int i30 = symbolInfoM12378i.f27716e;
                if (i29 % i30 == i30 - 1) {
                    byteMatrix.m12417c(i28, i24, i25 % 2 == 0);
                    i28++;
                }
            }
            i24++;
            int i31 = symbolInfoM12378i.f27717f;
            if (i25 % i31 == i31 - 1) {
                int i32 = 0;
                for (int i33 = 0; i33 < symbolInfoM12378i.m12383g(); i33++) {
                    byteMatrix.m12417c(i32, i24, true);
                    i32++;
                }
                i24++;
            }
        }
        int i34 = byteMatrix.f27800b;
        int i35 = byteMatrix.f27801c;
        int iMax = Math.max(i, i34);
        int iMax2 = Math.max(i2, i35);
        int iMin = Math.min(iMax / i34, iMax2 / i35);
        int i36 = (iMax - (i34 * iMin)) / 2;
        int i37 = (iMax2 - (i35 * iMin)) / 2;
        if (i2 < i35 || i < i34) {
            bitMatrix = new BitMatrix(i34, i35);
            i36 = 0;
            i37 = 0;
        } else {
            bitMatrix = new BitMatrix(i, i2);
        }
        int length3 = bitMatrix.f27646i.length;
        for (int i38 = 0; i38 < length3; i38++) {
            bitMatrix.f27646i[i38] = 0;
        }
        int i39 = 0;
        while (i39 < i35) {
            int i40 = i36;
            int i41 = 0;
            while (i41 < i34) {
                if (byteMatrix.m12415a(i41, i39) == 1) {
                    bitMatrix.m12350d(i40, i37, iMin, iMin);
                }
                i41++;
                i40 += iMin;
            }
            i39++;
            i37 += iMin;
        }
        return bitMatrix;
    }
}
