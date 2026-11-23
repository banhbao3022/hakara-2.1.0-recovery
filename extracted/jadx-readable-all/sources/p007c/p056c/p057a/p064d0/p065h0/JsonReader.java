package p007c.p056c.p057a.p064d0.p065h0;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;
import p524h1.Buffer3;
import p524h1.ByteString3;
import p524h1.Options2;

/* JADX INFO: renamed from: c.c.a.d0.h0.c, reason: use source file name */
/* JADX INFO: compiled from: JsonReader.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class JsonReader implements Closeable {

    /* JADX INFO: renamed from: f */
    public static final String[] f2261f = new String[128];

    /* JADX INFO: renamed from: g */
    public int f2262g;

    /* JADX INFO: renamed from: h */
    public int[] f2263h = new int[32];

    /* JADX INFO: renamed from: i */
    public String[] f2264i = new String[32];

    /* JADX INFO: renamed from: j */
    public int[] f2265j = new int[32];

    /* JADX INFO: renamed from: c.c.a.d0.h0.c$a */
    /* JADX INFO: compiled from: JsonReader.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String[] f2266a;

        /* JADX INFO: renamed from: b */
        public final Options2 f2267b;

        public a(String[] strArr, Options2 options2) {
            this.f2266a = strArr;
            this.f2267b = options2;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: IOException -> 0x006b, TryCatch #0 {IOException -> 0x006b, blocks: (B:2:0x0000, B:3:0x000a, B:5:0x000d, B:7:0x001e, B:9:0x0026, B:21:0x0042, B:19:0x003a, B:20:0x003d, B:23:0x0047, B:24:0x004a, B:25:0x0059), top: B:30:0x0000 }] */
        /* JADX INFO: renamed from: a */
        public static a m1394a(String... strArr) {
            String str;
            try {
                ByteString3[] byteString3Arr = new ByteString3[strArr.length];
                Buffer3 buffer3 = new Buffer3();
                for (int i = 0; i < strArr.length; i++) {
                    String str2 = strArr[i];
                    String[] strArr2 = JsonReader.f2261f;
                    buffer3.m13721J0(34);
                    int length = str2.length();
                    int i2 = 0;
                    for (int i3 = 0; i3 < length; i3++) {
                        char cCharAt = str2.charAt(i3);
                        if (cCharAt < 128) {
                            str = strArr2[cCharAt];
                            if (str != null) {
                                if (i2 < i3) {
                                    buffer3.m13730Q0(str2, i2, i3);
                                }
                                buffer3.m13729P0(str);
                                i2 = i3 + 1;
                            }
                        } else {
                            if (cCharAt == 8232) {
                                str = "\\u2028";
                            } else if (cCharAt == 8233) {
                                str = "\\u2029";
                            }
                            if (i2 < i3) {
                                buffer3.m13730Q0(str2, i2, i3);
                            }
                            buffer3.m13729P0(str);
                            i2 = i3 + 1;
                        }
                    }
                    if (i2 < length) {
                        buffer3.m13730Q0(str2, i2, length);
                    }
                    buffer3.m13721J0(34);
                    buffer3.readByte();
                    byteString3Arr[i] = buffer3.mo13736Y();
                }
                return new a((String[]) strArr.clone(), Options2.f30730g.m13783c(byteString3Arr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* JADX INFO: renamed from: c.c.a.d0.h0.c$b */
    /* JADX INFO: compiled from: JsonReader.java */
    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            f2261f[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f2261f;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* JADX INFO: renamed from: B */
    public abstract boolean mo1377B() throws IOException;

    /* JADX INFO: renamed from: D */
    public abstract boolean mo1378D() throws IOException;

    /* JADX INFO: renamed from: H */
    public abstract double mo1379H() throws IOException;

    /* JADX INFO: renamed from: O */
    public abstract int mo1380O() throws IOException;

    /* JADX INFO: renamed from: R */
    public abstract String mo1381R() throws IOException;

    /* JADX INFO: renamed from: a */
    public abstract void mo1382a() throws IOException;

    /* JADX INFO: renamed from: b0 */
    public abstract String mo1383b0() throws IOException;

    /* JADX INFO: renamed from: c */
    public abstract void mo1384c() throws IOException;

    /* JADX INFO: renamed from: f */
    public abstract void mo1385f() throws IOException;

    /* JADX INFO: renamed from: f0 */
    public abstract b mo1386f0() throws IOException;

    /* JADX INFO: renamed from: g0 */
    public final void m1387g0(int i) {
        int i2 = this.f2262g;
        int[] iArr = this.f2263h;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                StringBuilder sbM1556G = outline.m1556G("Nesting too deep at ");
                sbM1556G.append(m1391u());
                throw new JsonDataException(sbM1556G.toString());
            }
            this.f2263h = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f2264i;
            this.f2264i = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f2265j;
            this.f2265j = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f2263h;
        int i3 = this.f2262g;
        this.f2262g = i3 + 1;
        iArr3[i3] = i;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo1388h() throws IOException;

    /* JADX INFO: renamed from: n0 */
    public abstract int mo1389n0(a aVar) throws IOException;

    /* JADX INFO: renamed from: t0 */
    public abstract void mo1390t0() throws IOException;

    /* JADX INFO: renamed from: u */
    public final String m1391u() {
        int i = this.f2262g;
        int[] iArr = this.f2263h;
        String[] strArr = this.f2264i;
        int[] iArr2 = this.f2265j;
        StringBuilder sbM1555F = outline.m1555F('$');
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sbM1555F.append('[');
                sbM1555F.append(iArr2[i2]);
                sbM1555F.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sbM1555F.append('.');
                if (strArr[i2] != null) {
                    sbM1555F.append(strArr[i2]);
                }
            }
        }
        return sbM1555F.toString();
    }

    /* JADX INFO: renamed from: u0 */
    public abstract void mo1392u0() throws IOException;

    /* JADX INFO: renamed from: x0 */
    public final JsonEncodingException m1393x0(String str) throws JsonEncodingException {
        StringBuilder sbM1561L = outline.m1561L(str, " at path ");
        sbM1561L.append(m1391u());
        throw new JsonEncodingException(sbM1561L.toString());
    }
}
