package p007c.p190n.p430e.p437g0;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.e.g0.c, reason: use source file name */
/* JADX INFO: compiled from: JsonWriter.java */
/* JADX INFO: loaded from: classes.dex */
public class JsonWriter implements Closeable, Flushable {

    /* JADX INFO: renamed from: f */
    public static final String[] f27543f = new String[128];

    /* JADX INFO: renamed from: g */
    public static final String[] f27544g;

    /* JADX INFO: renamed from: h */
    public final Writer f27545h;

    /* JADX INFO: renamed from: i */
    public int[] f27546i = new int[32];

    /* JADX INFO: renamed from: j */
    public int f27547j = 0;

    /* JADX INFO: renamed from: k */
    public String f27548k;

    /* JADX INFO: renamed from: l */
    public String f27549l;

    /* JADX INFO: renamed from: m */
    public boolean f27550m;

    /* JADX INFO: renamed from: n */
    public boolean f27551n;

    /* JADX INFO: renamed from: o */
    public String f27552o;

    /* JADX INFO: renamed from: p */
    public boolean f27553p;

    static {
        for (int i = 0; i <= 31; i++) {
            f27543f[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f27543f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f27544g = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        m12310b0(6);
        this.f27549l = ":";
        this.f27553p = true;
        Objects.requireNonNull(writer, "out == null");
        this.f27545h = writer;
    }

    /* JADX INFO: renamed from: B */
    public JsonWriter mo12250B() throws IOException {
        m12313h(3, 5, '}');
        return this;
    }

    /* JADX INFO: renamed from: D */
    public JsonWriter mo12251D(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.f27552o != null) {
            throw new IllegalStateException();
        }
        if (this.f27547j == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f27552o = str;
        return this;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m12306D0() throws IOException {
        if (this.f27552o != null) {
            int iM12308R = m12308R();
            if (iM12308R == 5) {
                this.f27545h.write(44);
            } else if (iM12308R != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m12307H();
            m12311f0(4);
            m12312g0(this.f27552o);
            this.f27552o = null;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m12307H() throws IOException {
        if (this.f27548k == null) {
            return;
        }
        this.f27545h.write(10);
        int i = this.f27547j;
        for (int i2 = 1; i2 < i; i2++) {
            this.f27545h.write(this.f27548k);
        }
    }

    /* JADX INFO: renamed from: O */
    public JsonWriter mo12254O() throws IOException {
        if (this.f27552o != null) {
            if (!this.f27553p) {
                this.f27552o = null;
                return this;
            }
            m12306D0();
        }
        m12309a();
        this.f27545h.write("null");
        return this;
    }

    /* JADX INFO: renamed from: R */
    public final int m12308R() {
        int i = this.f27547j;
        if (i != 0) {
            return this.f27546i[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX INFO: renamed from: a */
    public final void m12309a() throws IOException {
        int iM12308R = m12308R();
        if (iM12308R == 1) {
            m12311f0(2);
            m12307H();
            return;
        }
        if (iM12308R == 2) {
            this.f27545h.append(',');
            m12307H();
        } else {
            if (iM12308R == 4) {
                this.f27545h.append((CharSequence) this.f27549l);
                m12311f0(5);
                return;
            }
            if (iM12308R != 6) {
                if (iM12308R != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f27550m) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m12311f0(7);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m12310b0(int i) {
        int i2 = this.f27547j;
        int[] iArr = this.f27546i;
        if (i2 == iArr.length) {
            this.f27546i = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.f27546i;
        int i3 = this.f27547j;
        this.f27547j = i3 + 1;
        iArr2[i3] = i;
    }

    /* JADX INFO: renamed from: c */
    public JsonWriter mo12255c() throws IOException {
        m12306D0();
        m12309a();
        m12310b0(1);
        this.f27545h.write(91);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f27545h.close();
        int i = this.f27547j;
        if (i > 1 || (i == 1 && this.f27546i[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f27547j = 0;
    }

    /* JADX INFO: renamed from: f */
    public JsonWriter mo12256f() throws IOException {
        m12306D0();
        m12309a();
        m12310b0(3);
        this.f27545h.write(123);
        return this;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m12311f0(int i) {
        this.f27546i[this.f27547j - 1] = i;
    }

    public void flush() throws IOException {
        if (this.f27547j == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f27545h.flush();
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    /* JADX INFO: renamed from: g0 */
    public final void m12312g0(String str) throws IOException {
        String str2;
        String[] strArr = this.f27551n ? f27544g : f27543f;
        this.f27545h.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        this.f27545h.write(str, i, i2 - i);
                    }
                    this.f27545h.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    this.f27545h.write(str, i, i2 - i);
                }
                this.f27545h.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            this.f27545h.write(str, i, length - i);
        }
        this.f27545h.write(34);
    }

    /* JADX INFO: renamed from: h */
    public final JsonWriter m12313h(int i, int i2, char c2) throws IOException {
        int iM12308R = m12308R();
        if (iM12308R != i2 && iM12308R != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f27552o != null) {
            StringBuilder sbM1556G = outline.m1556G("Dangling name: ");
            sbM1556G.append(this.f27552o);
            throw new IllegalStateException(sbM1556G.toString());
        }
        this.f27547j--;
        if (iM12308R == i2) {
            m12307H();
        }
        this.f27545h.write(c2);
        return this;
    }

    /* JADX INFO: renamed from: n0 */
    public JsonWriter mo12257n0(long j2) throws IOException {
        m12306D0();
        m12309a();
        this.f27545h.write(Long.toString(j2));
        return this;
    }

    /* JADX INFO: renamed from: t0 */
    public JsonWriter mo12258t0(Boolean bool) throws IOException {
        if (bool == null) {
            return mo12254O();
        }
        m12306D0();
        m12309a();
        this.f27545h.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* JADX INFO: renamed from: u */
    public JsonWriter mo12259u() throws IOException {
        m12313h(1, 2, ']');
        return this;
    }

    /* JADX INFO: renamed from: u0 */
    public JsonWriter mo12260u0(Number number) throws IOException {
        if (number == null) {
            return mo12254O();
        }
        m12306D0();
        String string = number.toString();
        if (this.f27550m || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            m12309a();
            this.f27545h.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    /* JADX INFO: renamed from: x0 */
    public JsonWriter mo12261x0(String str) throws IOException {
        if (str == null) {
            return mo12254O();
        }
        m12306D0();
        m12309a();
        m12312g0(str);
        return this;
    }

    /* JADX INFO: renamed from: z0 */
    public JsonWriter mo12262z0(boolean z) throws IOException {
        m12306D0();
        m12309a();
        this.f27545h.write(z ? "true" : "false");
        return this;
    }
}
