package p007c.p056c.p057a.p064d0.p065h0;

import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p524h1.Buffer3;
import p524h1.BufferedSource;
import p524h1.ByteString3;

/* JADX INFO: renamed from: c.c.a.d0.h0.d, reason: use source file name */
/* JADX INFO: compiled from: JsonUtf8Reader.java */
/* JADX INFO: loaded from: classes.dex */
public final class JsonUtf8Reader extends JsonReader {

    /* JADX INFO: renamed from: k */
    public static final ByteString3 f2279k;

    /* JADX INFO: renamed from: l */
    public static final ByteString3 f2280l;

    /* JADX INFO: renamed from: m */
    public static final ByteString3 f2281m;

    /* JADX INFO: renamed from: n */
    public static final ByteString3 f2282n;

    /* JADX INFO: renamed from: o */
    public static final ByteString3 f2283o;

    /* JADX INFO: renamed from: p */
    public final BufferedSource f2284p;

    /* JADX INFO: renamed from: q */
    public final Buffer3 f2285q;

    /* JADX INFO: renamed from: r */
    public int f2286r = 0;

    /* JADX INFO: renamed from: s */
    public long f2287s;

    /* JADX INFO: renamed from: t */
    public int f2288t;

    /* JADX INFO: renamed from: u */
    public String f2289u;

    static {
        ByteString3.a aVar = ByteString3.f30712g;
        f2279k = aVar.m13777c("'\\");
        f2280l = aVar.m13777c("\"\\");
        f2281m = aVar.m13777c("{}[]:, \n\t\r\f/\\;#=");
        f2282n = aVar.m13777c("\n\r");
        f2283o = aVar.m13777c("*/");
    }

    public JsonUtf8Reader(BufferedSource bufferedSource) {
        Objects.requireNonNull(bufferedSource, "source == null");
        this.f2284p = bufferedSource;
        this.f2285q = bufferedSource.mo13746l();
        m1387g0(6);
    }

    @Override // p007c.p056c.p057a.p064d0.p065h0.JsonReader
    /* JADX INFO: renamed from: B */
    public boolean mo1377B() throws IOException {
        int iM1395D0 = this.f2286r;
        if (iM1395D0 == 0) {
            iM1395D0 = m1395D0();
        }
        return (iM1395D0 == 2 || iM1395D0 == 4 || iM1395D0 == 18) ? false : true;
    }

    @Override // p007c.p056c.p057a.p064d0.p065h0.JsonReader
    /* JADX INFO: renamed from: D */
    public boolean mo1378D() throws IOException {
        int iM1395D0 = this.f2286r;
        if (iM1395D0 == 0) {
            iM1395D0 = m1395D0();
        }
        if (iM1395D0 == 5) {
            this.f2286r = 0;
            int[] iArr = this.f2265j;
            int i = this.f2262g - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM1395D0 == 6) {
            this.f2286r = 0;
            int[] iArr2 = this.f2265j;
            int i2 = this.f2262g - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        StringBuilder sbM1556G = outline.m1556G("Expected a boolean but was ");
        sbM1556G.append(mo1386f0());
        sbM1556G.append(" at path ");
        sbM1556G.append(m1391u());
        throw new JsonDataException(sbM1556G.toString());
    }

    /* JADX WARN: Code duplicated, block: B:135:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:147:0x01d1 A[DONT_INVERT, PHI: r2
  0x01d1: PHI (r2v20 char) = (r2v19 char), (r2v23 char) binds: [B:134:0x01ab, B:146:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:162:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:164:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:167:0x0201  */
    /* JADX WARN: Code duplicated, block: B:173:0x0211 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:174:0x0212  */
    /* JADX WARN: Code duplicated, block: B:176:0x0220  */
    /* JADX WARN: Code duplicated, block: B:178:0x0226  */
    /* JADX WARN: Code duplicated, block: B:233:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0120 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x0121  */
    /* JADX WARN: Code duplicated, block: B:90:0x0134  */
    /* JADX WARN: Code duplicated, block: B:92:0x013f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: D0 */
    public final int m1395D0() throws IOException {
        String str;
        String str2;
        int i;
        byte bM13740b0;
        char c2;
        int i2;
        boolean z;
        int i3;
        char c3;
        int i4;
        byte bM13740b1;
        int i5;
        int[] iArr = this.f2263h;
        int i6 = this.f2262g;
        int i7 = iArr[i6 - 1];
        if (i7 == 1) {
            iArr[i6 - 1] = 2;
        } else if (i7 == 2) {
            int iM1398H0 = m1398H0(true);
            this.f2285q.readByte();
            if (iM1398H0 != 44) {
                if (iM1398H0 == 59) {
                    m1404z0();
                    throw null;
                }
                if (iM1398H0 == 93) {
                    this.f2286r = 4;
                    return 4;
                }
                m1393x0("Unterminated array");
                throw null;
            }
        } else {
            if (i7 == 3 || i7 == 5) {
                iArr[i6 - 1] = 4;
                if (i7 == 5) {
                    int iM1398H1 = m1398H0(true);
                    this.f2285q.readByte();
                    if (iM1398H1 != 44) {
                        if (iM1398H1 == 59) {
                            m1404z0();
                            throw null;
                        }
                        if (iM1398H1 == 125) {
                            this.f2286r = 2;
                            return 2;
                        }
                        m1393x0("Unterminated object");
                        throw null;
                    }
                }
                int iM1398H2 = m1398H0(true);
                if (iM1398H2 == 34) {
                    this.f2285q.readByte();
                    this.f2286r = 13;
                    return 13;
                }
                if (iM1398H2 == 39) {
                    this.f2285q.readByte();
                    m1404z0();
                    throw null;
                }
                if (iM1398H2 != 125) {
                    m1404z0();
                    throw null;
                }
                if (i7 == 5) {
                    m1393x0("Expected name");
                    throw null;
                }
                this.f2285q.readByte();
                this.f2286r = 2;
                return 2;
            }
            if (i7 == 4) {
                iArr[i6 - 1] = 5;
                int iM1398H3 = m1398H0(true);
                this.f2285q.readByte();
                if (iM1398H3 != 58) {
                    if (iM1398H3 != 61) {
                        m1393x0("Expected ':'");
                        throw null;
                    }
                    m1404z0();
                    throw null;
                }
            } else if (i7 == 6) {
                iArr[i6 - 1] = 7;
            } else {
                if (i7 == 7) {
                    if (m1398H0(false) == -1) {
                        this.f2286r = 18;
                        return 18;
                    }
                    m1404z0();
                    throw null;
                }
                if (i7 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
            }
        }
        int iM1398H4 = m1398H0(true);
        if (iM1398H4 == 34) {
            this.f2285q.readByte();
            this.f2286r = 9;
            return 9;
        }
        if (iM1398H4 == 39) {
            m1404z0();
            throw null;
        }
        if (iM1398H4 != 44 && iM1398H4 != 59) {
            if (iM1398H4 == 91) {
                this.f2285q.readByte();
                this.f2286r = 3;
                return 3;
            }
            if (iM1398H4 != 93) {
                if (iM1398H4 == 123) {
                    this.f2285q.readByte();
                    this.f2286r = 1;
                    return 1;
                }
                byte bM13740b2 = this.f2285q.m13740b0(0L);
                if (bM13740b2 == 116 || bM13740b2 == 84) {
                    str = "true";
                    str2 = "TRUE";
                    i = 5;
                } else {
                    if (bM13740b2 != 102 && bM13740b2 != 70) {
                        if (bM13740b2 != 110 && bM13740b2 != 78) {
                            i = 0;
                            break;
                        }
                        str = "null";
                        str2 = "NULL";
                        i = 7;
                        if (i != 0) {
                            return i;
                        }
                        long j2 = 0;
                        c2 = 0;
                        i2 = 0;
                        z = true;
                        boolean z2 = false;
                        while (true) {
                            i3 = i2 + 1;
                            if (this.f2284p.mo13738a0(i3)) {
                                bM13740b1 = this.f2285q.m13740b0(i2);
                                if (bM13740b1 != 43) {
                                    if (bM13740b1 != 69 || bM13740b1 == 101) {
                                        i5 = i3;
                                        if (c2 != 2 || c2 == 4) {
                                            c2 = 5;
                                            i2 = i5;
                                        } else {
                                            i4 = 0;
                                        }
                                    } else if (bM13740b1 == 45) {
                                        i5 = i3;
                                        if (c2 == 0) {
                                            c2 = 1;
                                            z2 = true;
                                        } else {
                                            if (c2 != 5) {
                                                i4 = 0;
                                            }
                                            c2 = 6;
                                        }
                                        i2 = i5;
                                    } else if (bM13740b1 != 46) {
                                        if (bM13740b1 >= 48 && bM13740b1 <= 57) {
                                            if (c2 == 1 || c2 == 0) {
                                                i5 = i3;
                                                j2 = -(bM13740b1 - 48);
                                                c2 = 2;
                                            } else if (c2 != 2) {
                                                i5 = i3;
                                                if (c2 == 3) {
                                                    c2 = 4;
                                                } else if (c2 == 5 || c2 == 6) {
                                                    c2 = 7;
                                                }
                                                i2 = i5;
                                            } else if (j2 != 0) {
                                                i5 = i3;
                                                long j3 = (10 * j2) - ((long) (bM13740b1 - 48));
                                                z = (j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2)) & z;
                                                j2 = j3;
                                            }
                                            i2 = i5;
                                        } else if (!m1397G0(bM13740b1)) {
                                        }
                                        i4 = 0;
                                    } else {
                                        i5 = i3;
                                        if (c2 == 2) {
                                            c2 = 3;
                                            i2 = i5;
                                        } else {
                                            i4 = 0;
                                        }
                                    }
                                    if (i4 != 0) {
                                        return i4;
                                    }
                                    if (m1397G0(this.f2285q.m13740b0(0L))) {
                                        m1404z0();
                                        throw null;
                                    }
                                    m1393x0("Expected value");
                                    throw null;
                                }
                                i5 = i3;
                                if (c2 != 5) {
                                    i4 = 0;
                                    if (i4 != 0) {
                                        return i4;
                                    }
                                    if (m1397G0(this.f2285q.m13740b0(0L))) {
                                        m1393x0("Expected value");
                                        throw null;
                                    }
                                    m1404z0();
                                    throw null;
                                }
                                c2 = 6;
                                i2 = i5;
                            }
                            c3 = 2;
                            if (c2 != 2) {
                                if (c2 != c3 || c2 == 4 || c2 == 7) {
                                    this.f2288t = i2;
                                    i4 = 17;
                                    this.f2286r = 17;
                                } else {
                                    i4 = 0;
                                }
                            } else if (z || ((j2 == Long.MIN_VALUE && !z2) || (j2 == 0 && z2))) {
                                c3 = 2;
                                if (c2 != c3) {
                                }
                                this.f2288t = i2;
                                i4 = 17;
                                this.f2286r = 17;
                            } else {
                                if (!z2) {
                                    j2 = -j2;
                                }
                                this.f2287s = j2;
                                this.f2285q.skip(i2);
                                i4 = 16;
                                this.f2286r = 16;
                            }
                            if (i4 != 0) {
                                return i4;
                            }
                            if (m1397G0(this.f2285q.m13740b0(0L))) {
                                m1393x0("Expected value");
                                throw null;
                            }
                            m1404z0();
                            throw null;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i = 6;
                }
                int length = str.length();
                int i8 = 1;
                while (true) {
                    if (i8 >= length) {
                        if (!this.f2284p.mo13738a0(length + 1) || !m1397G0(this.f2285q.m13740b0(length))) {
                            this.f2285q.skip(length);
                            this.f2286r = i;
                            break;
                        }
                    } else {
                        int i9 = i8 + 1;
                        if (this.f2284p.mo13738a0(i9) && ((bM13740b0 = this.f2285q.m13740b0(i8)) == str.charAt(i8) || bM13740b0 == str2.charAt(i8))) {
                            i8 = i9;
                        }
                    }
                    i = 0;
                    break;
                }
                if (i != 0) {
                    return i;
                }
                long j4 = 0;
                c2 = 0;
                i2 = 0;
                z = true;
                boolean z3 = false;
                while (true) {
                    i3 = i2 + 1;
                    if (this.f2284p.mo13738a0(i3)) {
                        bM13740b1 = this.f2285q.m13740b0(i2);
                        if (bM13740b1 != 43) {
                            if (bM13740b1 != 69) {
                                i5 = i3;
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i2 = i5;
                            } else {
                                i5 = i3;
                                if (c2 != 2) {
                                }
                                c2 = 5;
                                i2 = i5;
                            }
                            if (i4 != 0) {
                                return i4;
                            }
                            if (m1397G0(this.f2285q.m13740b0(0L))) {
                                m1393x0("Expected value");
                                throw null;
                            }
                            m1404z0();
                            throw null;
                        }
                        i5 = i3;
                        if (c2 != 5) {
                            i4 = 0;
                            if (i4 != 0) {
                                return i4;
                            }
                            if (m1397G0(this.f2285q.m13740b0(0L))) {
                                m1393x0("Expected value");
                                throw null;
                            }
                            m1404z0();
                            throw null;
                        }
                        c2 = 6;
                        i2 = i5;
                    }
                    c3 = 2;
                    if (c2 != 2) {
                        if (c2 != c3) {
                        }
                        this.f2288t = i2;
                        i4 = 17;
                        this.f2286r = 17;
                    } else {
                        if (z) {
                        }
                        c3 = 2;
                        if (c2 != c3) {
                        }
                        this.f2288t = i2;
                        i4 = 17;
                        this.f2286r = 17;
                    }
                    if (i4 != 0) {
                        return i4;
                    }
                    if (m1397G0(this.f2285q.m13740b0(0L))) {
                        m1393x0("Expected value");
                        throw null;
                    }
                    m1404z0();
                    throw null;
                }
            }
            if (i7 == 1) {
                this.f2285q.readByte();
                this.f2286r = 4;
                return 4;
            }
        }
        if (i7 == 1 || i7 == 2) {
            m1404z0();
            throw null;
        }
        m1393x0("Unexpected value");
        throw null;
    }

    /* JADX INFO: renamed from: F0 */
    public final int m1396F0(String str, JsonReader.a aVar) {
        int length = aVar.f2266a.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(aVar.f2266a[i])) {
                this.f2286r = 0;
                this.f2264i[this.f2262g - 1] = str;
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: G0 */
    public final boolean m1397G0(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m1404z0();
        throw null;
    }

    @Override // p007c.p056c.p057a.p064d0.p065h0.JsonReader
    /* JADX INFO: renamed from: H */
    public double mo1379H() throws IOException {
        int iM1395D0 = this.f2286r;
        if (iM1395D0 == 0) {
            iM1395D0 = m1395D0();
        }
        if (iM1395D0 == 16) {
            this.f2286r = 0;
            int[] iArr = this.f2265j;
            int i = this.f2262g - 1;
            iArr[i] = iArr[i] + 1;
            return this.f2287s;
        }
        if (iM1395D0 == 17) {
            this.f2289u = this.f2285q.m13758x0(this.f2288t);
        } else if (iM1395D0 == 9) {
            this.f2289u = m1399I0(f2280l);
        } else if (iM1395D0 == 8) {
            this.f2289u = m1399I0(f2279k);
        } else if (iM1395D0 == 10) {
            this.f2289u = m1400J0();
        } else if (iM1395D0 != 11) {
            StringBuilder sbM1556G = outline.m1556G("Expected a double but was ");
            sbM1556G.append(mo1386f0());
            sbM1556G.append(" at path ");
            sbM1556G.append(m1391u());
            throw new JsonDataException(sbM1556G.toString());
        }
        this.f2286r = 11;
        try {
            double d = Double.parseDouble(this.f2289u);
            if (Double.isNaN(d) || Double.isInfinite(d)) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + d + " at path " + m1391u());
            }
            this.f2289u = null;
            this.f2286r = 0;
            int[] iArr2 = this.f2265j;
            int i2 = this.f2262g - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            StringBuilder sbM1556G2 = outline.m1556G("Expected a double but was ");
            sbM1556G2.append(this.f2289u);
            sbM1556G2.append(" at path ");
            sbM1556G2.append(m1391u());
            throw new JsonDataException(sbM1556G2.toString());
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final int m1398H0(boolean z) throws IOException {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!this.f2284p.mo13738a0(i2)) {
                if (z) {
                    throw new EOFException("End of input");
                }
                return -1;
            }
            byte bM13740b0 = this.f2285q.m13740b0(i);
            if (bM13740b0 != 10 && bM13740b0 != 32 && bM13740b0 != 13 && bM13740b0 != 9) {
                this.f2285q.skip(i2 - 1);
                if (bM13740b0 == 47) {
                    if (!this.f2284p.mo13738a0(2L)) {
                        return bM13740b0;
                    }
                    m1404z0();
                    throw null;
                }
                if (bM13740b0 != 35) {
                    return bM13740b0;
                }
                m1404z0();
                throw null;
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final String m1399I0(ByteString3 byteString3) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jMo13712E = this.f2284p.mo13712E(byteString3);
            if (jMo13712E == -1) {
                m1393x0("Unterminated string");
                throw null;
            }
            if (this.f2285q.m13740b0(jMo13712E) != 92) {
                if (sb == null) {
                    String strM13758x0 = this.f2285q.m13758x0(jMo13712E);
                    this.f2285q.readByte();
                    return strM13758x0;
                }
                sb.append(this.f2285q.m13758x0(jMo13712E));
                this.f2285q.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.f2285q.m13758x0(jMo13712E));
            this.f2285q.readByte();
            sb.append(m1401K0());
        }
    }

    /* JADX INFO: renamed from: J0 */
    public final String m1400J0() throws IOException {
        long jMo13712E = this.f2284p.mo13712E(f2281m);
        return jMo13712E != -1 ? this.f2285q.m13758x0(jMo13712E) : this.f2285q.m13755u0();
    }

    /* JADX INFO: renamed from: K0 */
    public final char m1401K0() throws IOException {
        int i;
        int i2;
        if (!this.f2284p.mo13738a0(1L)) {
            m1393x0("Unterminated escape sequence");
            throw null;
        }
        byte b = this.f2285q.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            StringBuilder sbM1556G = outline.m1556G("Invalid escape sequence: \\");
            sbM1556G.append((char) b);
            m1393x0(sbM1556G.toString());
            throw null;
        }
        if (!this.f2284p.mo13738a0(4L)) {
            StringBuilder sbM1556G2 = outline.m1556G("Unterminated escape sequence at path ");
            sbM1556G2.append(m1391u());
            throw new EOFException(sbM1556G2.toString());
        }
        char c2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            byte bM13740b0 = this.f2285q.m13740b0(i3);
            char c3 = (char) (c2 << 4);
            if (bM13740b0 < 48 || bM13740b0 > 57) {
                if (bM13740b0 >= 97 && bM13740b0 <= 102) {
                    i = bM13740b0 - 97;
                } else {
                    if (bM13740b0 < 65 || bM13740b0 > 70) {
                        StringBuilder sbM1556G3 = outline.m1556G("\\u");
                        sbM1556G3.append(this.f2285q.m13758x0(4L));
                        m1393x0(sbM1556G3.toString());
                        throw null;
                    }
                    i = bM13740b0 - 65;
                }
                i2 = i + 10;
            } else {
                i2 = bM13740b0 - 48;
            }
            c2 = (char) (i2 + c3);
        }
        this.f2285q.skip(4L);
        return c2;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m1402L0(ByteString3 byteString3) throws IOException {
        while (true) {
            long jMo13712E = this.f2284p.mo13712E(byteString3);
            if (jMo13712E == -1) {
                m1393x0("Unterminated string");
                throw null;
            }
            if (this.f2285q.m13740b0(jMo13712E) != 92) {
                this.f2285q.skip(jMo13712E + 1);
                return;
            } else {
                this.f2285q.skip(jMo13712E + 1);
                m1401K0();
            }
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m1403M0() throws IOException {
        long jMo13712E = this.f2284p.mo13712E(f2281m);
        Buffer3 buffer3 = this.f2285q;
        if (jMo13712E == -1) {
            jMo13712E = buffer3.f30708g;
        }
        buffer3.skip(jMo13712E);
    }

    @Override // p007c.p056c.p057a.p064d0.p065h0.JsonReader
    /* JADX INFO: renamed from: O */
    public int mo1380O() throws IOException {
        int iM1395D0 = this.f2286r;
        if (iM1395D0 == 0) {
            iM1395D0 = m1395D0();
        }
        if (iM1395D0 == 16) {
            long j2 = this.f2287s;
            int i = (int) j2;
            if (j2 == i) {
                this.f2286r = 0;
                int[] iArr = this.f2265j;
                int i2 = this.f2262g - 1;
                iArr[i2] = iArr[i2] + 1;
                return i;
            }
            StringBuilder sbM1556G = outline.m1556G("Expected an int but was ");
            sbM1556G.append(this.f2287s);
            sbM1556G.append(" at path ");
            sbM1556G.append(m1391u());
            throw new JsonDataException(sbM1556G.toString());
        }
        if (iM1395D0 == 17) {
            this.f2289u = this.f2285q.m13758x0(this.f2288t);
        } else if (iM1395D0 == 9 || iM1395D0 == 8) {
            String strM1399I0 = iM1395D0 == 9 ? m1399I0(f2280l) : m1399I0(f2279k);
            this.f2289u = strM1399I0;
            try {
                int i3 = Integer.parseInt(strM1399I0);
                this.f2286r = 0;
                int[] iArr2 = this.f2265j;
                int i4 = this.f2262g - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iM1395D0 != 11) {
            StringBuilder sbM1556G2 = outline.m1556G("Expected an int but was ");
            sbM1556G2.append(mo1386f0());
            sbM1556G2.append(" at path ");
            sbM1556G2.append(m1391u());
            throw new JsonDataException(sbM1556G2.toString());
        }
        this.f2286r = 11;
        try {
            double d = Double.parseDouble(this.f2289u);
            int i5 = (int) d;
            if (i5 != d) {
                StringBuilder sbM1556G3 = outline.m1556G("Expected an int but was ");
                sbM1556G3.append(this.f2289u);
                sbM1556G3.append(" at path ");
                sbM1556G3.append(m1391u());
                throw new JsonDataException(sbM1556G3.toString());
            }
            this.f2289u = null;
            this.f2286r = 0;
            int[] iArr3 = this.f2265j;
            int i6 = this.f2262g - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            StringBuilder sbM1556G4 = outline.m1556G("Expected an int but was ");
            sbM1556G4.append(this.f2289u);
            sbM1556G4.append(" at path ");
            sbM1556G4.append(m1391u());
            throw new JsonDataException(sbM1556G4.toString());
        }
    }

    @Override // p007c.p056c.p057a.p064d0.p065h0.JsonReader
    /* JADX INFO: renamed from: R */
    public String mo1381R() throws IOException {
        String strM1399I0;
        int iM1395D0 = this.f2286r;
        if (iM1395D0 == 0) {
            iM1395D0 = m1395D0();
        }
        if (iM1395D0 == 14) {
            strM1399I0 = m1400J0();
        } else if (iM1395D0 == 13) {
            strM1399I0 = m1399I0(f2280l);
        } else if (iM1395D0 == 12) {
            strM1399I0 = m1399I0(f2279k);
        } else {
            if (iM1395D0 != 15) {
                StringBuilder sbM1556G = outline.m1556G("Expected a name but was ");
                sbM1556G.append(mo1386f0());
                sbM1556G.append(" at path ");
                sbM1556G.append(m1391u());
                throw new JsonDataException(sbM1556G.toString());
            }
            strM1399I0 = this.f2289u;
        }
        this.f2286r = 0;
        this.f2264i[this.f2262g - 1] = strM1399I0;
        return strM1399I0;
    }

    @Override // p007c.p056c.p057a.p064d0.p065h0.JsonReader
    /* JADX INFO: renamed from: a */
    public void mo1382a() throws IOException {
        int iM1395D0 = this.f2286r;
        if (iM1395D0 == 0) {
            iM1395D0 = m1395D0();
        }
        if (iM1395D0 == 3) {
            m1387g0(1);
            this.f2265j[this.f2262g - 1] = 0;
            this.f2286r = 0;
        } else {
            StringBuilder sbM1556G = outline.m1556G("Expected BEGIN_ARRAY but was ");
            sbM1556G.append(mo1386f0());
            sbM1556G.append(" at path ");
            sbM1556G.append(m1391u());
            throw new JsonDataException(sbM1556G.toString());
        }
    }

    @Override // p007c.p056c.p057a.p064d0.p065h0.JsonReader
    /* JADX INFO: renamed from: b0 */
    public String mo1383b0() throws IOException {
        String strM13758x0;
        int iM1395D0 = this.f2286r;
        if (iM1395D0 == 0) {
            iM1395D0 = m1395D0();
        }
        if (iM1395D0 == 10) {
            strM13758x0 = m1400J0();
        } else if (iM1395D0 == 9) {
            strM13758x0 = m1399I0(f2280l);
        } else if (iM1395D0 == 8) {
            strM13758x0 = m1399I0(f2279k);
        } else if (iM1395D0 == 11) {
            strM13758x0 = this.f2289u;
            this.f2289u = null;
        } else if (iM1395D0 == 16) {
            strM13758x0 = Long.toString(this.f2287s);
        } else {
            if (iM1395D0 != 17) {
                StringBuilder sbM1556G = outline.m1556G("Expected a string but was ");
                sbM1556G.append(mo1386f0());
                sbM1556G.append(" at path ");
                sbM1556G.append(m1391u());
                throw new JsonDataException(sbM1556G.toString());
            }
            strM13758x0 = this.f2285q.m13758x0(this.f2288t);
        }
        this.f2286r = 0;
        int[] iArr = this.f2265j;
        int i = this.f2262g - 1;
        iArr[i] = iArr[i] + 1;
        return strM13758x0;
    }

    @Override // p007c.p056c.p057a.p064d0.p065h0.JsonReader
    /* JADX INFO: renamed from: c */
    public void mo1384c() throws IOException {
        int iM1395D0 = this.f2286r;
        if (iM1395D0 == 0) {
            iM1395D0 = m1395D0();
        }
        if (iM1395D0 == 1) {
            m1387g0(3);
            this.f2286r = 0;
        } else {
            StringBuilder sbM1556G = outline.m1556G("Expected BEGIN_OBJECT but was ");
            sbM1556G.append(mo1386f0());
            sbM1556G.append(" at path ");
            sbM1556G.append(m1391u());
            throw new JsonDataException(sbM1556G.toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f2286r = 0;
        this.f2263h[0] = 8;
        this.f2262g = 1;
        Buffer3 buffer3 = this.f2285q;
        buffer3.skip(buffer3.f30708g);
        this.f2284p.close();
    }

    @Override // p007c.p056c.p057a.p064d0.p065h0.JsonReader
    /* JADX INFO: renamed from: f */
    public void mo1385f() throws IOException {
        int iM1395D0 = this.f2286r;
        if (iM1395D0 == 0) {
            iM1395D0 = m1395D0();
        }
        if (iM1395D0 != 4) {
            StringBuilder sbM1556G = outline.m1556G("Expected END_ARRAY but was ");
            sbM1556G.append(mo1386f0());
            sbM1556G.append(" at path ");
            sbM1556G.append(m1391u());
            throw new JsonDataException(sbM1556G.toString());
        }
        int i = this.f2262g - 1;
        this.f2262g = i;
        int[] iArr = this.f2265j;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f2286r = 0;
    }

    @Override // p007c.p056c.p057a.p064d0.p065h0.JsonReader
    /* JADX INFO: renamed from: f0 */
    public JsonReader.b mo1386f0() throws IOException {
        int iM1395D0 = this.f2286r;
        if (iM1395D0 == 0) {
            iM1395D0 = m1395D0();
        }
        switch (iM1395D0) {
            case 1:
                return JsonReader.b.BEGIN_OBJECT;
            case 2:
                return JsonReader.b.END_OBJECT;
            case 3:
                return JsonReader.b.BEGIN_ARRAY;
            case 4:
                return JsonReader.b.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.b.BOOLEAN;
            case 7:
                return JsonReader.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.b.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.b.NAME;
            case 16:
            case 17:
                return JsonReader.b.NUMBER;
            case 18:
                return JsonReader.b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    @Override // p007c.p056c.p057a.p064d0.p065h0.JsonReader
    /* JADX INFO: renamed from: h */
    public void mo1388h() throws IOException {
        int iM1395D0 = this.f2286r;
        if (iM1395D0 == 0) {
            iM1395D0 = m1395D0();
        }
        if (iM1395D0 != 2) {
            StringBuilder sbM1556G = outline.m1556G("Expected END_OBJECT but was ");
            sbM1556G.append(mo1386f0());
            sbM1556G.append(" at path ");
            sbM1556G.append(m1391u());
            throw new JsonDataException(sbM1556G.toString());
        }
        int i = this.f2262g - 1;
        this.f2262g = i;
        this.f2264i[i] = null;
        int[] iArr = this.f2265j;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f2286r = 0;
    }

    @Override // p007c.p056c.p057a.p064d0.p065h0.JsonReader
    /* JADX INFO: renamed from: n0 */
    public int mo1389n0(JsonReader.a aVar) throws IOException {
        int iM1395D0 = this.f2286r;
        if (iM1395D0 == 0) {
            iM1395D0 = m1395D0();
        }
        if (iM1395D0 < 12 || iM1395D0 > 15) {
            return -1;
        }
        if (iM1395D0 == 15) {
            return m1396F0(this.f2289u, aVar);
        }
        int iMo13713E0 = this.f2284p.mo13713E0(aVar.f2267b);
        if (iMo13713E0 != -1) {
            this.f2286r = 0;
            this.f2264i[this.f2262g - 1] = aVar.f2266a[iMo13713E0];
            return iMo13713E0;
        }
        String str = this.f2264i[this.f2262g - 1];
        String strMo1381R = mo1381R();
        int iM1396F0 = m1396F0(strMo1381R, aVar);
        if (iM1396F0 == -1) {
            this.f2286r = 15;
            this.f2289u = strMo1381R;
            this.f2264i[this.f2262g - 1] = str;
        }
        return iM1396F0;
    }

    @Override // p007c.p056c.p057a.p064d0.p065h0.JsonReader
    /* JADX INFO: renamed from: t0 */
    public void mo1390t0() throws IOException {
        int iM1395D0 = this.f2286r;
        if (iM1395D0 == 0) {
            iM1395D0 = m1395D0();
        }
        if (iM1395D0 == 14) {
            m1403M0();
        } else if (iM1395D0 == 13) {
            m1402L0(f2280l);
        } else if (iM1395D0 == 12) {
            m1402L0(f2279k);
        } else if (iM1395D0 != 15) {
            StringBuilder sbM1556G = outline.m1556G("Expected a name but was ");
            sbM1556G.append(mo1386f0());
            sbM1556G.append(" at path ");
            sbM1556G.append(m1391u());
            throw new JsonDataException(sbM1556G.toString());
        }
        this.f2286r = 0;
        this.f2264i[this.f2262g - 1] = "null";
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("JsonReader(");
        sbM1556G.append(this.f2284p);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }

    @Override // p007c.p056c.p057a.p064d0.p065h0.JsonReader
    /* JADX INFO: renamed from: u0 */
    public void mo1392u0() throws IOException {
        int i = 0;
        do {
            int iM1395D0 = this.f2286r;
            if (iM1395D0 == 0) {
                iM1395D0 = m1395D0();
            }
            if (iM1395D0 == 3) {
                m1387g0(1);
            } else {
                if (iM1395D0 == 1) {
                    m1387g0(3);
                } else if (iM1395D0 == 4) {
                    i--;
                    if (i < 0) {
                        StringBuilder sbM1556G = outline.m1556G("Expected a value but was ");
                        sbM1556G.append(mo1386f0());
                        sbM1556G.append(" at path ");
                        sbM1556G.append(m1391u());
                        throw new JsonDataException(sbM1556G.toString());
                    }
                    this.f2262g--;
                } else if (iM1395D0 == 2) {
                    i--;
                    if (i < 0) {
                        StringBuilder sbM1556G2 = outline.m1556G("Expected a value but was ");
                        sbM1556G2.append(mo1386f0());
                        sbM1556G2.append(" at path ");
                        sbM1556G2.append(m1391u());
                        throw new JsonDataException(sbM1556G2.toString());
                    }
                    this.f2262g--;
                } else if (iM1395D0 == 14 || iM1395D0 == 10) {
                    m1403M0();
                } else if (iM1395D0 == 9 || iM1395D0 == 13) {
                    m1402L0(f2280l);
                } else if (iM1395D0 == 8 || iM1395D0 == 12) {
                    m1402L0(f2279k);
                } else if (iM1395D0 == 17) {
                    this.f2285q.skip(this.f2288t);
                } else if (iM1395D0 == 18) {
                    StringBuilder sbM1556G3 = outline.m1556G("Expected a value but was ");
                    sbM1556G3.append(mo1386f0());
                    sbM1556G3.append(" at path ");
                    sbM1556G3.append(m1391u());
                    throw new JsonDataException(sbM1556G3.toString());
                }
                this.f2286r = 0;
            }
            i++;
            this.f2286r = 0;
        } while (i != 0);
        int[] iArr = this.f2265j;
        int i2 = this.f2262g;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.f2264i[i2 - 1] = "null";
    }

    /* JADX INFO: renamed from: z0 */
    public final void m1404z0() throws IOException {
        m1393x0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }
}
