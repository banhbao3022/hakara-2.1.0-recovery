package p007c.p190n.p430e.p437g0;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.JsonPrimitive;
import p007c.p190n.p430e.p432e0.JsonReaderInternalAccess;
import p007c.p190n.p430e.p432e0.p433a0.JsonTreeReader;

/* JADX INFO: renamed from: c.n.e.g0.a, reason: use source file name */
/* JADX INFO: compiled from: JsonReader.java */
/* JADX INFO: loaded from: classes.dex */
public class JsonReader2 implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final char[] f27516f = ")]}'\n".toCharArray();

    /* JADX INFO: renamed from: g */
    public final Reader f27517g;

    /* JADX INFO: renamed from: h */
    public boolean f27518h = false;

    /* JADX INFO: renamed from: i */
    public final char[] f27519i = new char[1024];

    /* JADX INFO: renamed from: j */
    public int f27520j = 0;

    /* JADX INFO: renamed from: k */
    public int f27521k = 0;

    /* JADX INFO: renamed from: l */
    public int f27522l = 0;

    /* JADX INFO: renamed from: m */
    public int f27523m = 0;

    /* JADX INFO: renamed from: n */
    public int f27524n = 0;

    /* JADX INFO: renamed from: o */
    public long f27525o;

    /* JADX INFO: renamed from: p */
    public int f27526p;

    /* JADX INFO: renamed from: q */
    public String f27527q;

    /* JADX INFO: renamed from: r */
    public int[] f27528r;

    /* JADX INFO: renamed from: s */
    public int f27529s;

    /* JADX INFO: renamed from: t */
    public String[] f27530t;

    /* JADX INFO: renamed from: u */
    public int[] f27531u;

    /* JADX INFO: renamed from: c.n.e.g0.a$a */
    /* JADX INFO: compiled from: JsonReader.java */
    public class a extends JsonReaderInternalAccess {
        @Override // p007c.p190n.p430e.p432e0.JsonReaderInternalAccess
        /* JADX INFO: renamed from: a */
        public void mo12280a(JsonReader2 jsonReader2) throws IOException {
            if (jsonReader2 instanceof JsonTreeReader) {
                JsonTreeReader jsonTreeReader = (JsonTreeReader) jsonReader2;
                jsonTreeReader.m12237O0(JsonToken.NAME);
                Map.Entry entry = (Map.Entry) ((Iterator) jsonTreeReader.m12238P0()).next();
                jsonTreeReader.m12240R0(entry.getValue());
                jsonTreeReader.m12240R0(new JsonPrimitive((String) entry.getKey()));
                return;
            }
            int iM12304h = jsonReader2.f27524n;
            if (iM12304h == 0) {
                iM12304h = jsonReader2.m12304h();
            }
            if (iM12304h == 13) {
                jsonReader2.f27524n = 9;
                return;
            }
            if (iM12304h == 12) {
                jsonReader2.f27524n = 8;
            } else {
                if (iM12304h == 14) {
                    jsonReader2.f27524n = 10;
                    return;
                }
                StringBuilder sbM1556G = outline.m1556G("Expected a name but was ");
                sbM1556G.append(jsonReader2.mo12234H0());
                sbM1556G.append(jsonReader2.m12302b0());
                throw new IllegalStateException(sbM1556G.toString());
            }
        }
    }

    static {
        JsonReaderInternalAccess.f27484a = new a();
    }

    public JsonReader2(Reader reader) {
        int[] iArr = new int[32];
        this.f27528r = iArr;
        this.f27529s = 0;
        this.f27529s = 0 + 1;
        iArr[0] = 6;
        this.f27530t = new String[32];
        this.f27531u = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f27517g = reader;
    }

    /* JADX INFO: renamed from: B */
    public void mo12231B() throws IOException {
        int iM12304h = this.f27524n;
        if (iM12304h == 0) {
            iM12304h = m12304h();
        }
        if (iM12304h != 2) {
            StringBuilder sbM1556G = outline.m1556G("Expected END_OBJECT but was ");
            sbM1556G.append(mo12234H0());
            sbM1556G.append(m12302b0());
            throw new IllegalStateException(sbM1556G.toString());
        }
        int i = this.f27529s - 1;
        this.f27529s = i;
        this.f27530t[i] = null;
        int[] iArr = this.f27531u;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f27524n = 0;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m12293D(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.f27519i;
        int i4 = this.f27523m;
        int i5 = this.f27520j;
        this.f27523m = i4 - i5;
        int i6 = this.f27521k;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f27521k = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f27521k = 0;
        }
        this.f27520j = 0;
        do {
            Reader reader = this.f27517g;
            int i8 = this.f27521k;
            int i9 = reader.read(cArr, i8, cArr.length - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f27521k + i9;
            this.f27521k = i2;
            if (this.f27522l == 0 && (i3 = this.f27523m) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f27520j++;
                this.f27523m = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* JADX INFO: renamed from: D0 */
    public final String m12294D0(char c2) throws IOException {
        int i;
        char[] cArr = this.f27519i;
        StringBuilder sb = null;
        do {
            int i2 = this.f27520j;
            int i3 = this.f27521k;
            while (true) {
                int i4 = i3;
                i = i2;
                while (true) {
                    if (i2 < i4) {
                        int i5 = i2 + 1;
                        char c3 = cArr[i2];
                        if (c3 == c2) {
                            this.f27520j = i5;
                            int i6 = (i5 - i) - 1;
                            if (sb == null) {
                                return new String(cArr, i, i6);
                            }
                            sb.append(cArr, i, i6);
                            return sb.toString();
                        }
                        if (c3 == '\\') {
                            this.f27520j = i5;
                            int i7 = (i5 - i) - 1;
                            if (sb == null) {
                                sb = new StringBuilder(Math.max((i7 + 1) * 2, 16));
                            }
                            sb.append(cArr, i, i7);
                            sb.append(m12297J0());
                            i2 = this.f27520j;
                            i3 = this.f27521k;
                        } else {
                            if (c3 == '\n') {
                                this.f27522l++;
                                this.f27523m = i5;
                            }
                            i2 = i5;
                        }
                    }
                }
            }
            if (sb == null) {
                sb = new StringBuilder(Math.max((i2 - i) * 2, 16));
            }
            sb.append(cArr, i, i2 - i);
            this.f27520j = i2;
        } while (m12293D(1));
        m12300N0("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: F0 */
    public String mo12232F0() throws IOException {
        String str;
        int iM12304h = this.f27524n;
        if (iM12304h == 0) {
            iM12304h = m12304h();
        }
        if (iM12304h == 10) {
            str = m12295G0();
        } else if (iM12304h == 8) {
            str = m12294D0('\'');
        } else if (iM12304h == 9) {
            str = m12294D0('\"');
        } else if (iM12304h == 11) {
            str = this.f27527q;
            this.f27527q = null;
        } else if (iM12304h == 15) {
            str = Long.toString(this.f27525o);
        } else {
            if (iM12304h != 16) {
                StringBuilder sbM1556G = outline.m1556G("Expected a string but was ");
                sbM1556G.append(mo12234H0());
                sbM1556G.append(m12302b0());
                throw new IllegalStateException(sbM1556G.toString());
            }
            str = new String(this.f27519i, this.f27520j, this.f27526p);
            this.f27520j += this.f27526p;
        }
        this.f27524n = 0;
        int[] iArr = this.f27531u;
        int i = this.f27529s - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX INFO: renamed from: G0 */
    public final String m12295G0() throws IOException {
        String string;
        int i = 0;
        StringBuilder sb = null;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.f27520j;
                if (i3 + i2 < this.f27521k) {
                    char c2 = this.f27519i[i3 + i2];
                    if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                        if (c2 != '#') {
                            if (c2 != ',') {
                                if (c2 != '/' && c2 != '=') {
                                    if (c2 != '{' && c2 != '}' && c2 != ':') {
                                        if (c2 != ';') {
                                            switch (c2) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        m12303f();
                    }
                    i = i2;
                } else if (i2 >= this.f27519i.length) {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max(i2, 16));
                    }
                    sb.append(this.f27519i, this.f27520j, i2);
                    this.f27520j += i2;
                    if (!m12293D(1)) {
                    }
                } else if (!m12293D(i2 + 1)) {
                    i = i2;
                }
                if (sb == null) {
                    string = new String(this.f27519i, this.f27520j, i);
                } else {
                    sb.append(this.f27519i, this.f27520j, i);
                    string = sb.toString();
                }
                this.f27520j += i;
                return string;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public String mo12233H() {
        StringBuilder sbM1555F = outline.m1555F('$');
        int i = this.f27529s;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f27528r[i2];
            if (i3 == 1 || i3 == 2) {
                sbM1555F.append('[');
                sbM1555F.append(this.f27531u[i2]);
                sbM1555F.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sbM1555F.append('.');
                String[] strArr = this.f27530t;
                if (strArr[i2] != null) {
                    sbM1555F.append(strArr[i2]);
                }
            }
        }
        return sbM1555F.toString();
    }

    /* JADX INFO: renamed from: H0 */
    public JsonToken mo12234H0() throws IOException {
        int iM12304h = this.f27524n;
        if (iM12304h == 0) {
            iM12304h = m12304h();
        }
        switch (iM12304h) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m12296I0(int i) {
        int i2 = this.f27529s;
        int[] iArr = this.f27528r;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f27528r = Arrays.copyOf(iArr, i3);
            this.f27531u = Arrays.copyOf(this.f27531u, i3);
            this.f27530t = (String[]) Arrays.copyOf(this.f27530t, i3);
        }
        int[] iArr2 = this.f27528r;
        int i4 = this.f27529s;
        this.f27529s = i4 + 1;
        iArr2[i4] = i;
    }

    /* JADX INFO: renamed from: J0 */
    public final char m12297J0() throws IOException {
        int i;
        int i2;
        if (this.f27520j == this.f27521k && !m12293D(1)) {
            m12300N0("Unterminated escape sequence");
            throw null;
        }
        char[] cArr = this.f27519i;
        int i3 = this.f27520j;
        int i4 = i3 + 1;
        this.f27520j = i4;
        char c2 = cArr[i3];
        if (c2 == '\n') {
            this.f27522l++;
            this.f27523m = i4;
        } else if (c2 != '\"' && c2 != '\'' && c2 != '/' && c2 != '\\') {
            if (c2 == 'b') {
                return '\b';
            }
            if (c2 == 'f') {
                return '\f';
            }
            if (c2 == 'n') {
                return '\n';
            }
            if (c2 == 'r') {
                return '\r';
            }
            if (c2 == 't') {
                return '\t';
            }
            if (c2 != 'u') {
                m12300N0("Invalid escape sequence");
                throw null;
            }
            if (i4 + 4 > this.f27521k && !m12293D(4)) {
                m12300N0("Unterminated escape sequence");
                throw null;
            }
            char c3 = 0;
            int i5 = this.f27520j;
            int i6 = i5 + 4;
            while (i5 < i6) {
                char c4 = this.f27519i[i5];
                char c5 = (char) (c3 << 4);
                if (c4 < '0' || c4 > '9') {
                    if (c4 >= 'a' && c4 <= 'f') {
                        i = c4 - 'a';
                    } else {
                        if (c4 < 'A' || c4 > 'F') {
                            StringBuilder sbM1556G = outline.m1556G("\\u");
                            sbM1556G.append(new String(this.f27519i, this.f27520j, 4));
                            throw new NumberFormatException(sbM1556G.toString());
                        }
                        i = c4 - 'A';
                    }
                    i2 = i + 10;
                } else {
                    i2 = c4 - '0';
                }
                c3 = (char) (i2 + c5);
                i5++;
            }
            this.f27520j += 4;
            return c3;
        }
        return c2;
    }

    /* JADX INFO: renamed from: K0 */
    public final void m12298K0(char c2) throws IOException {
        char[] cArr = this.f27519i;
        do {
            int i = this.f27520j;
            int i2 = this.f27521k;
            while (i < i2) {
                int i3 = i + 1;
                char c3 = cArr[i];
                if (c3 == c2) {
                    this.f27520j = i3;
                    return;
                }
                if (c3 == '\\') {
                    this.f27520j = i3;
                    m12297J0();
                    i = this.f27520j;
                    i2 = this.f27521k;
                } else {
                    if (c3 == '\n') {
                        this.f27522l++;
                        this.f27523m = i3;
                    }
                    i = i3;
                }
            }
            this.f27520j = i;
        } while (m12293D(1));
        m12300N0("Unterminated string");
        throw null;
    }

    /* JADX INFO: renamed from: L0 */
    public final void m12299L0() throws IOException {
        char c2;
        do {
            if (this.f27520j >= this.f27521k && !m12293D(1)) {
                return;
            }
            char[] cArr = this.f27519i;
            int i = this.f27520j;
            int i2 = i + 1;
            this.f27520j = i2;
            c2 = cArr[i];
            if (c2 == '\n') {
                this.f27522l++;
                this.f27523m = i2;
                return;
            }
        } while (c2 != '\r');
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x009b. Please report as an issue. */
    /* JADX INFO: renamed from: M0 */
    public void mo12235M0() throws IOException {
        int i = 0;
        do {
            int iM12304h = this.f27524n;
            if (iM12304h == 0) {
                iM12304h = m12304h();
            }
            if (iM12304h == 3) {
                m12296I0(1);
            } else {
                if (iM12304h == 1) {
                    m12296I0(3);
                } else if (iM12304h == 4 || iM12304h == 2) {
                    this.f27529s--;
                    i--;
                } else if (iM12304h == 14 || iM12304h == 10) {
                    while (true) {
                        int i2 = 0;
                        while (true) {
                            int i3 = this.f27520j + i2;
                            if (i3 < this.f27521k) {
                                char c2 = this.f27519i[i3];
                                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                                    if (c2 != '#') {
                                        if (c2 != ',') {
                                            if (c2 != '/' && c2 != '=') {
                                                if (c2 != '{' && c2 != '}' && c2 != ':') {
                                                    if (c2 != ';') {
                                                        switch (c2) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i2++;
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    m12303f();
                                }
                                this.f27520j += i2;
                            } else {
                                this.f27520j = i3;
                                if (!m12293D(1)) {
                                }
                            }
                        }
                    }
                } else if (iM12304h == 8 || iM12304h == 12) {
                    m12298K0('\'');
                } else if (iM12304h == 9 || iM12304h == 13) {
                    m12298K0('\"');
                } else if (iM12304h == 16) {
                    this.f27520j += this.f27526p;
                }
                this.f27524n = 0;
            }
            i++;
            this.f27524n = 0;
        } while (i != 0);
        int[] iArr = this.f27531u;
        int i4 = this.f27529s;
        int i5 = i4 - 1;
        iArr[i5] = iArr[i5] + 1;
        this.f27530t[i4 - 1] = "null";
    }

    /* JADX INFO: renamed from: N0 */
    public final IOException m12300N0(String str) throws IOException {
        StringBuilder sbM1556G = outline.m1556G(str);
        sbM1556G.append(m12302b0());
        throw new MalformedJsonException(sbM1556G.toString());
    }

    /* JADX INFO: renamed from: O */
    public boolean mo12236O() throws IOException {
        int iM12304h = this.f27524n;
        if (iM12304h == 0) {
            iM12304h = m12304h();
        }
        return (iM12304h == 2 || iM12304h == 4) ? false : true;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m12301R(char c2) throws IOException {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m12303f();
        return false;
    }

    /* JADX INFO: renamed from: a */
    public void mo12241a() throws IOException {
        int iM12304h = this.f27524n;
        if (iM12304h == 0) {
            iM12304h = m12304h();
        }
        if (iM12304h == 3) {
            m12296I0(1);
            this.f27531u[this.f27529s - 1] = 0;
            this.f27524n = 0;
        } else {
            StringBuilder sbM1556G = outline.m1556G("Expected BEGIN_ARRAY but was ");
            sbM1556G.append(mo12234H0());
            sbM1556G.append(m12302b0());
            throw new IllegalStateException(sbM1556G.toString());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public String m12302b0() {
        StringBuilder sbM1559J = outline.m1559J(" at line ", this.f27522l + 1, " column ", (this.f27520j - this.f27523m) + 1, " path ");
        sbM1559J.append(mo12233H());
        return sbM1559J.toString();
    }

    /* JADX INFO: renamed from: c */
    public void mo12242c() throws IOException {
        int iM12304h = this.f27524n;
        if (iM12304h == 0) {
            iM12304h = m12304h();
        }
        if (iM12304h == 1) {
            m12296I0(3);
            this.f27524n = 0;
        } else {
            StringBuilder sbM1556G = outline.m1556G("Expected BEGIN_OBJECT but was ");
            sbM1556G.append(mo12234H0());
            sbM1556G.append(m12302b0());
            throw new IllegalStateException(sbM1556G.toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f27524n = 0;
        this.f27528r[0] = 8;
        this.f27529s = 1;
        this.f27517g.close();
    }

    /* JADX INFO: renamed from: f */
    public final void m12303f() throws IOException {
        if (this.f27518h) {
            return;
        }
        m12300N0("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    /* JADX INFO: renamed from: f0 */
    public boolean mo12243f0() throws IOException {
        int iM12304h = this.f27524n;
        if (iM12304h == 0) {
            iM12304h = m12304h();
        }
        if (iM12304h == 5) {
            this.f27524n = 0;
            int[] iArr = this.f27531u;
            int i = this.f27529s - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iM12304h != 6) {
            StringBuilder sbM1556G = outline.m1556G("Expected a boolean but was ");
            sbM1556G.append(mo12234H0());
            sbM1556G.append(m12302b0());
            throw new IllegalStateException(sbM1556G.toString());
        }
        this.f27524n = 0;
        int[] iArr2 = this.f27531u;
        int i2 = this.f27529s - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return false;
    }

    /* JADX INFO: renamed from: g0 */
    public double mo12244g0() throws IOException {
        int iM12304h = this.f27524n;
        if (iM12304h == 0) {
            iM12304h = m12304h();
        }
        if (iM12304h == 15) {
            this.f27524n = 0;
            int[] iArr = this.f27531u;
            int i = this.f27529s - 1;
            iArr[i] = iArr[i] + 1;
            return this.f27525o;
        }
        if (iM12304h == 16) {
            this.f27527q = new String(this.f27519i, this.f27520j, this.f27526p);
            this.f27520j += this.f27526p;
        } else if (iM12304h == 8 || iM12304h == 9) {
            this.f27527q = m12294D0(iM12304h == 8 ? '\'' : '\"');
        } else if (iM12304h == 10) {
            this.f27527q = m12295G0();
        } else if (iM12304h != 11) {
            StringBuilder sbM1556G = outline.m1556G("Expected a double but was ");
            sbM1556G.append(mo12234H0());
            sbM1556G.append(m12302b0());
            throw new IllegalStateException(sbM1556G.toString());
        }
        this.f27524n = 11;
        double d = Double.parseDouble(this.f27527q);
        if (!this.f27518h && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + d + m12302b0());
        }
        this.f27527q = null;
        this.f27524n = 0;
        int[] iArr2 = this.f27531u;
        int i2 = this.f27529s - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0174 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:108:0x0175  */
    /* JADX WARN: Code duplicated, block: B:111:0x0187  */
    /* JADX WARN: Code duplicated, block: B:114:0x018d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0197  */
    /* JADX WARN: Code duplicated, block: B:118:0x019b A[PHI: r2 r3
  0x019b: PHI (r2v31 int) = (r2v30 int), (r2v36 int) binds: [B:110:0x0185, B:117:0x0197] A[DONT_GENERATE, DONT_INLINE]
  0x019b: PHI (r3v7 int) = (r3v6 int), (r3v9 int) binds: [B:110:0x0185, B:117:0x0197] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:120:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:160:0x0207 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:171:0x0229 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:172:0x022b  */
    /* JADX WARN: Code duplicated, block: B:185:0x024b  */
    /* JADX WARN: Code duplicated, block: B:187:0x0250  */
    /* JADX WARN: Code duplicated, block: B:190:0x0255  */
    /* JADX WARN: Code duplicated, block: B:195:0x0264 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:196:0x0265  */
    /* JADX WARN: Code duplicated, block: B:198:0x0271  */
    /* JADX WARN: Code duplicated, block: B:200:0x0279  */
    /* JADX WARN: Code duplicated, block: B:261:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x018a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0205 A[SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    public int m12304h() throws IOException {
        int iM12305x0;
        String str;
        String str2;
        int i;
        char c2;
        char[] cArr;
        int i2;
        int i3;
        long j2;
        int i4;
        char c3;
        char c4;
        long j3;
        int i5;
        int[] iArr = this.f27528r;
        int i6 = this.f27529s;
        int i7 = iArr[i6 - 1];
        if (i7 == 1) {
            iArr[i6 - 1] = 2;
        } else if (i7 == 2) {
            int iM12305x1 = m12305x0(true);
            if (iM12305x1 != 44) {
                if (iM12305x1 != 59) {
                    if (iM12305x1 == 93) {
                        this.f27524n = 4;
                        return 4;
                    }
                    m12300N0("Unterminated array");
                    throw null;
                }
                m12303f();
            }
        } else {
            if (i7 == 3 || i7 == 5) {
                iArr[i6 - 1] = 4;
                if (i7 == 5 && (iM12305x0 = m12305x0(true)) != 44) {
                    if (iM12305x0 != 59) {
                        if (iM12305x0 == 125) {
                            this.f27524n = 2;
                            return 2;
                        }
                        m12300N0("Unterminated object");
                        throw null;
                    }
                    m12303f();
                }
                int iM12305x2 = m12305x0(true);
                if (iM12305x2 == 34) {
                    this.f27524n = 13;
                    return 13;
                }
                if (iM12305x2 == 39) {
                    m12303f();
                    this.f27524n = 12;
                    return 12;
                }
                if (iM12305x2 == 125) {
                    if (i7 != 5) {
                        this.f27524n = 2;
                        return 2;
                    }
                    m12300N0("Expected name");
                    throw null;
                }
                m12303f();
                this.f27520j--;
                if (m12301R((char) iM12305x2)) {
                    this.f27524n = 14;
                    return 14;
                }
                m12300N0("Expected name");
                throw null;
            }
            if (i7 == 4) {
                iArr[i6 - 1] = 5;
                int iM12305x3 = m12305x0(true);
                if (iM12305x3 != 58) {
                    if (iM12305x3 != 61) {
                        m12300N0("Expected ':'");
                        throw null;
                    }
                    m12303f();
                    if (this.f27520j < this.f27521k || m12293D(1)) {
                        char[] cArr2 = this.f27519i;
                        int i8 = this.f27520j;
                        if (cArr2[i8] == '>') {
                            this.f27520j = i8 + 1;
                        }
                    }
                }
            } else if (i7 == 6) {
                if (this.f27518h) {
                    m12305x0(true);
                    int i9 = this.f27520j - 1;
                    this.f27520j = i9;
                    char[] cArr3 = f27516f;
                    if (i9 + cArr3.length <= this.f27521k || m12293D(cArr3.length)) {
                        int i10 = 0;
                        while (true) {
                            char[] cArr4 = f27516f;
                            if (i10 >= cArr4.length) {
                                this.f27520j += cArr4.length;
                                break;
                            }
                            if (this.f27519i[this.f27520j + i10] != cArr4[i10]) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
                this.f27528r[this.f27529s - 1] = 7;
            } else if (i7 == 7) {
                if (m12305x0(false) == -1) {
                    this.f27524n = 17;
                    return 17;
                }
                m12303f();
                this.f27520j--;
            } else if (i7 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iM12305x4 = m12305x0(true);
        if (iM12305x4 == 34) {
            this.f27524n = 9;
            return 9;
        }
        if (iM12305x4 == 39) {
            m12303f();
            this.f27524n = 8;
            return 8;
        }
        if (iM12305x4 != 44 && iM12305x4 != 59) {
            if (iM12305x4 == 91) {
                this.f27524n = 3;
                return 3;
            }
            if (iM12305x4 != 93) {
                if (iM12305x4 == 123) {
                    this.f27524n = 1;
                    return 1;
                }
                int i11 = this.f27520j - 1;
                this.f27520j = i11;
                char c5 = this.f27519i[i11];
                if (c5 == 't' || c5 == 'T') {
                    str = "true";
                    str2 = "TRUE";
                    i = 5;
                } else {
                    if (c5 != 'f' && c5 != 'F') {
                        if (c5 != 'n' && c5 != 'N') {
                            i = 0;
                            break;
                        }
                        str = "null";
                        str2 = "NULL";
                        i = 7;
                        if (i != 0) {
                            return i;
                        }
                        cArr = this.f27519i;
                        i2 = this.f27520j;
                        i3 = this.f27521k;
                        j2 = 0;
                        long j4 = 0;
                        i4 = 0;
                        c3 = 0;
                        boolean z = true;
                        boolean z2 = false;
                        while (true) {
                            if (i2 + i4 != i3) {
                                c4 = cArr[i2 + i4];
                                if (c4 != '+') {
                                    if (c4 != 'E' || c4 == 'e') {
                                        j3 = j2;
                                        if (c3 != 2 || c3 == 4) {
                                            c3 = 5;
                                            i4++;
                                            j2 = j3;
                                        }
                                    } else if (c4 == '-') {
                                        j3 = j2;
                                        if (c3 == 0) {
                                            c3 = 1;
                                            z2 = true;
                                        } else {
                                            if (c3 != 5) {
                                            }
                                            c3 = 6;
                                        }
                                        i4++;
                                        j2 = j3;
                                    } else if (c4 == '.') {
                                        j3 = j2;
                                        if (c3 == 2) {
                                            c3 = 3;
                                            i4++;
                                            j2 = j3;
                                        }
                                    } else if (c4 >= '0' && c4 <= '9') {
                                        if (c3 == 1 || c3 == 0) {
                                            j4 = -(c4 - '0');
                                            c3 = 2;
                                        } else if (c3 == 2) {
                                            if (j4 != j2) {
                                                long j5 = (10 * j4) - ((long) (c4 - '0'));
                                                z &= j4 > -922337203685477580L || (j4 == -922337203685477580L && j5 < j4);
                                                j4 = j5;
                                            }
                                        } else if (c3 == 3) {
                                            c3 = 4;
                                        } else if (c3 == 5 || c3 == 6) {
                                            c3 = 7;
                                        }
                                        j3 = 0;
                                        i4++;
                                        j2 = j3;
                                    } else if (!m12301R(c4)) {
                                        if (c3 != 2 && z && ((j4 != Long.MIN_VALUE || z2) && (j4 != 0 || !z2))) {
                                            if (!z2) {
                                                j4 = -j4;
                                            }
                                            this.f27525o = j4;
                                            this.f27520j += i4;
                                            i5 = 15;
                                            this.f27524n = 15;
                                        } else if (c3 != 2 || c3 == 4 || c3 == 7) {
                                            this.f27526p = i4;
                                            i5 = 16;
                                            this.f27524n = 16;
                                        }
                                    }
                                    if (i5 != 0) {
                                        return i5;
                                    }
                                    if (m12301R(this.f27519i[this.f27520j])) {
                                        m12300N0("Expected value");
                                        throw null;
                                    }
                                    m12303f();
                                    this.f27524n = 10;
                                    return 10;
                                }
                                j3 = j2;
                                if (c3 != 5) {
                                }
                                c3 = 6;
                                i4++;
                                j2 = j3;
                            } else if (i4 != cArr.length) {
                                if (!m12293D(i4 + 1)) {
                                    i2 = this.f27520j;
                                    i3 = this.f27521k;
                                    c4 = cArr[i2 + i4];
                                    if (c4 != '+') {
                                        if (c4 != 'E') {
                                            j3 = j2;
                                            if (c3 != 2) {
                                            }
                                            c3 = 5;
                                            i4++;
                                            j2 = j3;
                                        } else {
                                            j3 = j2;
                                            if (c3 != 2) {
                                            }
                                            c3 = 5;
                                            i4++;
                                            j2 = j3;
                                        }
                                        if (i5 != 0) {
                                            return i5;
                                        }
                                        if (m12301R(this.f27519i[this.f27520j])) {
                                            m12300N0("Expected value");
                                            throw null;
                                        }
                                        m12303f();
                                        this.f27524n = 10;
                                        return 10;
                                    }
                                    j3 = j2;
                                    if (c3 != 5) {
                                    }
                                    c3 = 6;
                                    i4++;
                                    j2 = j3;
                                }
                                if (c3 != 2) {
                                    if (c3 != 2) {
                                    }
                                    this.f27526p = i4;
                                    i5 = 16;
                                    this.f27524n = 16;
                                } else {
                                    if (c3 != 2) {
                                    }
                                    this.f27526p = i4;
                                    i5 = 16;
                                    this.f27524n = 16;
                                }
                                if (i5 != 0) {
                                    return i5;
                                }
                                if (m12301R(this.f27519i[this.f27520j])) {
                                    m12300N0("Expected value");
                                    throw null;
                                }
                                m12303f();
                                this.f27524n = 10;
                                return 10;
                            }
                            i5 = 0;
                            if (i5 != 0) {
                                return i5;
                            }
                            if (m12301R(this.f27519i[this.f27520j])) {
                                m12300N0("Expected value");
                                throw null;
                            }
                            m12303f();
                            this.f27524n = 10;
                            return 10;
                        }
                    }
                    str = "false";
                    str2 = "FALSE";
                    i = 6;
                }
                int length = str.length();
                int i12 = 1;
                while (true) {
                    if (i12 >= length) {
                        if ((this.f27520j + length >= this.f27521k && !m12293D(length + 1)) || !m12301R(this.f27519i[this.f27520j + length])) {
                            this.f27520j += length;
                            this.f27524n = i;
                            break;
                        }
                        break;
                    }
                    if ((this.f27520j + i12 < this.f27521k || m12293D(i12 + 1)) && ((c2 = this.f27519i[this.f27520j + i12]) == str.charAt(i12) || c2 == str2.charAt(i12))) {
                        i12++;
                    }
                    i = 0;
                    break;
                }
                if (i != 0) {
                    return i;
                }
                cArr = this.f27519i;
                i2 = this.f27520j;
                i3 = this.f27521k;
                j2 = 0;
                long j6 = 0;
                i4 = 0;
                c3 = 0;
                boolean z3 = true;
                boolean z4 = false;
                while (true) {
                    if (i2 + i4 != i3) {
                        c4 = cArr[i2 + i4];
                        if (c4 != '+') {
                            if (c4 != 'E') {
                                j3 = j2;
                                if (c3 != 2) {
                                }
                                c3 = 5;
                                i4++;
                                j2 = j3;
                            } else {
                                j3 = j2;
                                if (c3 != 2) {
                                }
                                c3 = 5;
                                i4++;
                                j2 = j3;
                            }
                            if (i5 != 0) {
                                return i5;
                            }
                            if (m12301R(this.f27519i[this.f27520j])) {
                                m12300N0("Expected value");
                                throw null;
                            }
                            m12303f();
                            this.f27524n = 10;
                            return 10;
                        }
                        j3 = j2;
                        if (c3 != 5) {
                        }
                        c3 = 6;
                        i4++;
                        j2 = j3;
                    } else if (i4 != cArr.length) {
                        if (!m12293D(i4 + 1)) {
                            i2 = this.f27520j;
                            i3 = this.f27521k;
                            c4 = cArr[i2 + i4];
                            if (c4 != '+') {
                                if (c4 != 'E') {
                                    j3 = j2;
                                    if (c3 != 2) {
                                    }
                                    c3 = 5;
                                    i4++;
                                    j2 = j3;
                                } else {
                                    j3 = j2;
                                    if (c3 != 2) {
                                    }
                                    c3 = 5;
                                    i4++;
                                    j2 = j3;
                                }
                                if (i5 != 0) {
                                    return i5;
                                }
                                if (m12301R(this.f27519i[this.f27520j])) {
                                    m12300N0("Expected value");
                                    throw null;
                                }
                                m12303f();
                                this.f27524n = 10;
                                return 10;
                            }
                            j3 = j2;
                            if (c3 != 5) {
                            }
                            c3 = 6;
                            i4++;
                            j2 = j3;
                        }
                        if (c3 != 2) {
                            if (c3 != 2) {
                            }
                            this.f27526p = i4;
                            i5 = 16;
                            this.f27524n = 16;
                        } else {
                            if (c3 != 2) {
                            }
                            this.f27526p = i4;
                            i5 = 16;
                            this.f27524n = 16;
                        }
                        if (i5 != 0) {
                            return i5;
                        }
                        if (m12301R(this.f27519i[this.f27520j])) {
                            m12300N0("Expected value");
                            throw null;
                        }
                        m12303f();
                        this.f27524n = 10;
                        return 10;
                    }
                    i5 = 0;
                    if (i5 != 0) {
                        return i5;
                    }
                    if (m12301R(this.f27519i[this.f27520j])) {
                        m12300N0("Expected value");
                        throw null;
                    }
                    m12303f();
                    this.f27524n = 10;
                    return 10;
                }
            }
            if (i7 == 1) {
                this.f27524n = 4;
                return 4;
            }
        }
        if (i7 != 1 && i7 != 2) {
            m12300N0("Unexpected value");
            throw null;
        }
        m12303f();
        this.f27520j--;
        this.f27524n = 7;
        return 7;
    }

    /* JADX INFO: renamed from: n0 */
    public int mo12245n0() throws IOException {
        int iM12304h = this.f27524n;
        if (iM12304h == 0) {
            iM12304h = m12304h();
        }
        if (iM12304h == 15) {
            long j2 = this.f27525o;
            int i = (int) j2;
            if (j2 != i) {
                StringBuilder sbM1556G = outline.m1556G("Expected an int but was ");
                sbM1556G.append(this.f27525o);
                sbM1556G.append(m12302b0());
                throw new NumberFormatException(sbM1556G.toString());
            }
            this.f27524n = 0;
            int[] iArr = this.f27531u;
            int i2 = this.f27529s - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iM12304h == 16) {
            this.f27527q = new String(this.f27519i, this.f27520j, this.f27526p);
            this.f27520j += this.f27526p;
        } else {
            if (iM12304h != 8 && iM12304h != 9 && iM12304h != 10) {
                StringBuilder sbM1556G2 = outline.m1556G("Expected an int but was ");
                sbM1556G2.append(mo12234H0());
                sbM1556G2.append(m12302b0());
                throw new IllegalStateException(sbM1556G2.toString());
            }
            if (iM12304h == 10) {
                this.f27527q = m12295G0();
            } else {
                this.f27527q = m12294D0(iM12304h == 8 ? '\'' : '\"');
            }
            try {
                int i3 = Integer.parseInt(this.f27527q);
                this.f27524n = 0;
                int[] iArr2 = this.f27531u;
                int i4 = this.f27529s - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        }
        this.f27524n = 11;
        double d = Double.parseDouble(this.f27527q);
        int i5 = (int) d;
        if (i5 != d) {
            StringBuilder sbM1556G3 = outline.m1556G("Expected an int but was ");
            sbM1556G3.append(this.f27527q);
            sbM1556G3.append(m12302b0());
            throw new NumberFormatException(sbM1556G3.toString());
        }
        this.f27527q = null;
        this.f27524n = 0;
        int[] iArr3 = this.f27531u;
        int i6 = this.f27529s - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    /* JADX INFO: renamed from: t0 */
    public long mo12246t0() throws IOException {
        int iM12304h = this.f27524n;
        if (iM12304h == 0) {
            iM12304h = m12304h();
        }
        if (iM12304h == 15) {
            this.f27524n = 0;
            int[] iArr = this.f27531u;
            int i = this.f27529s - 1;
            iArr[i] = iArr[i] + 1;
            return this.f27525o;
        }
        if (iM12304h == 16) {
            this.f27527q = new String(this.f27519i, this.f27520j, this.f27526p);
            this.f27520j += this.f27526p;
        } else {
            if (iM12304h != 8 && iM12304h != 9 && iM12304h != 10) {
                StringBuilder sbM1556G = outline.m1556G("Expected a long but was ");
                sbM1556G.append(mo12234H0());
                sbM1556G.append(m12302b0());
                throw new IllegalStateException(sbM1556G.toString());
            }
            if (iM12304h == 10) {
                this.f27527q = m12295G0();
            } else {
                this.f27527q = m12294D0(iM12304h == 8 ? '\'' : '\"');
            }
            try {
                long j2 = Long.parseLong(this.f27527q);
                this.f27524n = 0;
                int[] iArr2 = this.f27531u;
                int i2 = this.f27529s - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j2;
            } catch (NumberFormatException unused) {
            }
        }
        this.f27524n = 11;
        double d = Double.parseDouble(this.f27527q);
        long j3 = (long) d;
        if (j3 != d) {
            StringBuilder sbM1556G2 = outline.m1556G("Expected a long but was ");
            sbM1556G2.append(this.f27527q);
            sbM1556G2.append(m12302b0());
            throw new NumberFormatException(sbM1556G2.toString());
        }
        this.f27527q = null;
        this.f27524n = 0;
        int[] iArr3 = this.f27531u;
        int i3 = this.f27529s - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j3;
    }

    public String toString() {
        return getClass().getSimpleName() + m12302b0();
    }

    /* JADX INFO: renamed from: u */
    public void mo12247u() throws IOException {
        int iM12304h = this.f27524n;
        if (iM12304h == 0) {
            iM12304h = m12304h();
        }
        if (iM12304h != 4) {
            StringBuilder sbM1556G = outline.m1556G("Expected END_ARRAY but was ");
            sbM1556G.append(mo12234H0());
            sbM1556G.append(m12302b0());
            throw new IllegalStateException(sbM1556G.toString());
        }
        int i = this.f27529s - 1;
        this.f27529s = i;
        int[] iArr = this.f27531u;
        int i2 = i - 1;
        iArr[i2] = iArr[i2] + 1;
        this.f27524n = 0;
    }

    /* JADX INFO: renamed from: u0 */
    public String mo12248u0() throws IOException {
        String strM12294D0;
        int iM12304h = this.f27524n;
        if (iM12304h == 0) {
            iM12304h = m12304h();
        }
        if (iM12304h == 14) {
            strM12294D0 = m12295G0();
        } else if (iM12304h == 12) {
            strM12294D0 = m12294D0('\'');
        } else {
            if (iM12304h != 13) {
                StringBuilder sbM1556G = outline.m1556G("Expected a name but was ");
                sbM1556G.append(mo12234H0());
                sbM1556G.append(m12302b0());
                throw new IllegalStateException(sbM1556G.toString());
            }
            strM12294D0 = m12294D0('\"');
        }
        this.f27524n = 0;
        this.f27530t[this.f27529s - 1] = strM12294D0;
        return strM12294D0;
    }

    /* JADX INFO: renamed from: x0 */
    public final int m12305x0(boolean z) throws IOException {
        char[] cArr = this.f27519i;
        int i = this.f27520j;
        int i2 = this.f27521k;
        while (true) {
            boolean z2 = true;
            if (i == i2) {
                this.f27520j = i;
                if (!m12293D(1)) {
                    if (!z) {
                        return -1;
                    }
                    StringBuilder sbM1556G = outline.m1556G("End of input");
                    sbM1556G.append(m12302b0());
                    throw new EOFException(sbM1556G.toString());
                }
                i = this.f27520j;
                i2 = this.f27521k;
            }
            int i3 = i + 1;
            char c2 = cArr[i];
            if (c2 == '\n') {
                this.f27522l++;
                this.f27523m = i3;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f27520j = i3;
                    if (i3 == i2) {
                        this.f27520j = i3 - 1;
                        boolean zM12293D = m12293D(2);
                        this.f27520j++;
                        if (!zM12293D) {
                            return c2;
                        }
                    }
                    m12303f();
                    int i4 = this.f27520j;
                    char c3 = cArr[i4];
                    if (c3 == '*') {
                        this.f27520j = i4 + 1;
                        while (true) {
                            int i5 = 0;
                            if (this.f27520j + 2 > this.f27521k && !m12293D(2)) {
                                z2 = false;
                                break;
                            }
                            char[] cArr2 = this.f27519i;
                            int i6 = this.f27520j;
                            if (cArr2[i6] != '\n') {
                                while (true) {
                                    if (i5 >= 2) {
                                        break;
                                    }
                                    if (this.f27519i[this.f27520j + i5] != "*/".charAt(i5)) {
                                        break;
                                    }
                                    i5++;
                                }
                            } else {
                                this.f27522l++;
                                this.f27523m = i6 + 1;
                            }
                            this.f27520j++;
                        }
                        if (!z2) {
                            m12300N0("Unterminated comment");
                            throw null;
                        }
                        i = this.f27520j + 2;
                        i2 = this.f27521k;
                    } else {
                        if (c3 != '/') {
                            return c2;
                        }
                        this.f27520j = i4 + 1;
                        m12299L0();
                        i = this.f27520j;
                        i2 = this.f27521k;
                    }
                } else {
                    if (c2 != '#') {
                        this.f27520j = i3;
                        return c2;
                    }
                    this.f27520j = i3;
                    m12303f();
                    m12299L0();
                    i = this.f27520j;
                    i2 = this.f27521k;
                }
            }
            i = i3;
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void mo12249z0() throws IOException {
        int iM12304h = this.f27524n;
        if (iM12304h == 0) {
            iM12304h = m12304h();
        }
        if (iM12304h != 7) {
            StringBuilder sbM1556G = outline.m1556G("Expected null but was ");
            sbM1556G.append(mo12234H0());
            sbM1556G.append(m12302b0());
            throw new IllegalStateException(sbM1556G.toString());
        }
        this.f27524n = 0;
        int[] iArr = this.f27531u;
        int i = this.f27529s - 1;
        iArr[i] = iArr[i] + 1;
    }
}
