package p007c.p190n.p438f.p443k.p444b;

import p007c.p190n.p438f.Dimension;

/* JADX INFO: renamed from: c.n.f.k.b.j, reason: use source file name */
/* JADX INFO: compiled from: SymbolInfo.java */
/* JADX INFO: loaded from: classes.dex */
public class SymbolInfo {

    /* JADX INFO: renamed from: a */
    public static SymbolInfo[] f27712a = {new SymbolInfo(false, 3, 5, 8, 8, 1), new SymbolInfo(false, 5, 7, 10, 10, 1), new SymbolInfo(true, 5, 7, 16, 6, 1), new SymbolInfo(false, 8, 10, 12, 12, 1), new SymbolInfo(true, 10, 11, 14, 6, 2), new SymbolInfo(false, 12, 12, 14, 14, 1), new SymbolInfo(true, 16, 14, 24, 10, 1), new SymbolInfo(false, 18, 14, 16, 16, 1), new SymbolInfo(false, 22, 18, 18, 18, 1), new SymbolInfo(true, 22, 18, 16, 10, 2), new SymbolInfo(false, 30, 20, 20, 20, 1), new SymbolInfo(true, 32, 24, 16, 14, 2), new SymbolInfo(false, 36, 24, 22, 22, 1), new SymbolInfo(false, 44, 28, 24, 24, 1), new SymbolInfo(true, 49, 28, 22, 14, 2), new SymbolInfo(false, 62, 36, 14, 14, 4), new SymbolInfo(false, 86, 42, 16, 16, 4), new SymbolInfo(false, 114, 48, 18, 18, 4), new SymbolInfo(false, 144, 56, 20, 20, 4), new SymbolInfo(false, 174, 68, 22, 22, 4), new SymbolInfo(false, 204, 84, 24, 24, 4, 102, 42), new SymbolInfo(false, 280, 112, 14, 14, 16, 140, 56), new SymbolInfo(false, 368, 144, 16, 16, 16, 92, 36), new SymbolInfo(false, 456, 192, 18, 18, 16, 114, 48), new SymbolInfo(false, 576, 224, 20, 20, 16, 144, 56), new SymbolInfo(false, 696, 272, 22, 22, 16, 174, 68), new SymbolInfo(false, 816, 336, 24, 24, 16, 136, 56), new SymbolInfo(false, 1050, 408, 18, 18, 36, 175, 68), new SymbolInfo(false, 1304, 496, 20, 20, 36, 163, 62), new DataMatrixSymbolInfo144()};

    /* JADX INFO: renamed from: b */
    public final boolean f27713b;

    /* JADX INFO: renamed from: c */
    public final int f27714c;

    /* JADX INFO: renamed from: d */
    public final int f27715d;

    /* JADX INFO: renamed from: e */
    public final int f27716e;

    /* JADX INFO: renamed from: f */
    public final int f27717f;

    /* JADX INFO: renamed from: g */
    public final int f27718g;

    /* JADX INFO: renamed from: h */
    public final int f27719h;

    /* JADX INFO: renamed from: i */
    public final int f27720i;

    public SymbolInfo(boolean z, int i, int i2, int i3, int i4, int i5) {
        this(z, i, i2, i3, i4, i5, i, i2);
    }

    /* JADX INFO: renamed from: i */
    public static SymbolInfo m12378i(int i, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2, boolean z) {
        for (SymbolInfo symbolInfo : f27712a) {
            if (!(symbolShapeHint == SymbolShapeHint.FORCE_SQUARE && symbolInfo.f27713b) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || symbolInfo.f27713b) && ((dimension == null || (symbolInfo.m12383g() >= dimension.f27605a && symbolInfo.m12382f() >= dimension.f27606b)) && ((dimension2 == null || (symbolInfo.m12383g() <= dimension2.f27605a && symbolInfo.m12382f() <= dimension2.f27606b)) && i <= symbolInfo.f27714c)))) {
                return symbolInfo;
            }
        }
        if (z) {
            throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public int mo12364a(int i) {
        return this.f27719h;
    }

    /* JADX INFO: renamed from: b */
    public final int m12379b() {
        int i = this.f27718g;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 4) {
                if (i == 16) {
                    return 4;
                }
                if (i == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public int mo12365c() {
        return this.f27714c / this.f27719h;
    }

    /* JADX INFO: renamed from: d */
    public final int m12380d() {
        return m12384h() * this.f27717f;
    }

    /* JADX INFO: renamed from: e */
    public final int m12381e() {
        return m12379b() * this.f27716e;
    }

    /* JADX INFO: renamed from: f */
    public final int m12382f() {
        return m12380d() + (m12384h() << 1);
    }

    /* JADX INFO: renamed from: g */
    public final int m12383g() {
        return m12381e() + (m12379b() << 1);
    }

    /* JADX INFO: renamed from: h */
    public final int m12384h() {
        int i = this.f27718g;
        if (i == 1 || i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f27713b ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.f27716e);
        sb.append('x');
        sb.append(this.f27717f);
        sb.append(", symbol size ");
        sb.append(m12383g());
        sb.append('x');
        sb.append(m12382f());
        sb.append(", symbol data size ");
        sb.append(m12381e());
        sb.append('x');
        sb.append(m12380d());
        sb.append(", codewords ");
        sb.append(this.f27714c);
        sb.append('+');
        sb.append(this.f27715d);
        return sb.toString();
    }

    public SymbolInfo(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f27713b = z;
        this.f27714c = i;
        this.f27715d = i2;
        this.f27716e = i3;
        this.f27717f = i4;
        this.f27718g = i5;
        this.f27719h = i6;
        this.f27720i = i7;
    }
}
