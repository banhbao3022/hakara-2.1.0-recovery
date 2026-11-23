package p007c.p190n.p430e.p432e0.p433a0;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.JsonArray;
import p007c.p190n.p430e.JsonElement;
import p007c.p190n.p430e.JsonNull;
import p007c.p190n.p430e.JsonObject;
import p007c.p190n.p430e.JsonPrimitive;
import p007c.p190n.p430e.p432e0.LinkedTreeMap;
import p007c.p190n.p430e.p437g0.JsonReader2;
import p007c.p190n.p430e.p437g0.JsonToken;

/* JADX INFO: renamed from: c.n.e.e0.a0.e, reason: use source file name */
/* JADX INFO: compiled from: JsonTreeReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class JsonTreeReader extends JsonReader2 {

    /* JADX INFO: renamed from: v */
    public static final Reader f27339v = new a();

    /* JADX INFO: renamed from: w */
    public static final Object f27340w = new Object();

    /* JADX INFO: renamed from: A */
    public int[] f27341A;

    /* JADX INFO: renamed from: x */
    public Object[] f27342x;

    /* JADX INFO: renamed from: y */
    public int f27343y;

    /* JADX INFO: renamed from: z */
    public String[] f27344z;

    /* JADX INFO: renamed from: c.n.e.e0.a0.e$a */
    /* JADX INFO: compiled from: JsonTreeReader.java */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    public JsonTreeReader(JsonElement jsonElement) {
        super(f27339v);
        this.f27342x = new Object[32];
        this.f27343y = 0;
        this.f27344z = new String[32];
        this.f27341A = new int[32];
        m12240R0(jsonElement);
    }

    /* JADX INFO: renamed from: b0 */
    private String m12230b0() {
        StringBuilder sbM1556G = outline.m1556G(" at path ");
        sbM1556G.append(mo12233H());
        return sbM1556G.toString();
    }

    @Override // p007c.p190n.p430e.p437g0.JsonReader2
    /* JADX INFO: renamed from: B */
    public void mo12231B() throws IOException {
        m12237O0(JsonToken.END_OBJECT);
        m12239Q0();
        m12239Q0();
        int i = this.f27343y;
        if (i > 0) {
            int[] iArr = this.f27341A;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // p007c.p190n.p430e.p437g0.JsonReader2
    /* JADX INFO: renamed from: F0 */
    public String mo12232F0() throws IOException {
        JsonToken jsonTokenMo12234H0 = mo12234H0();
        JsonToken jsonToken = JsonToken.STRING;
        if (jsonTokenMo12234H0 == jsonToken || jsonTokenMo12234H0 == JsonToken.NUMBER) {
            String strM12329j = ((JsonPrimitive) m12239Q0()).m12329j();
            int i = this.f27343y;
            if (i > 0) {
                int[] iArr = this.f27341A;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return strM12329j;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenMo12234H0 + m12230b0());
    }

    @Override // p007c.p190n.p430e.p437g0.JsonReader2
    /* JADX INFO: renamed from: H */
    public String mo12233H() {
        StringBuilder sbM1555F = outline.m1555F('$');
        int i = 0;
        while (i < this.f27343y) {
            Object[] objArr = this.f27342x;
            if (objArr[i] instanceof JsonArray) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sbM1555F.append('[');
                    sbM1555F.append(this.f27341A[i]);
                    sbM1555F.append(']');
                }
            } else if (objArr[i] instanceof JsonObject) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sbM1555F.append('.');
                    String[] strArr = this.f27344z;
                    if (strArr[i] != null) {
                        sbM1555F.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sbM1555F.toString();
    }

    @Override // p007c.p190n.p430e.p437g0.JsonReader2
    /* JADX INFO: renamed from: H0 */
    public JsonToken mo12234H0() throws IOException {
        if (this.f27343y == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object objM12238P0 = m12238P0();
        if (objM12238P0 instanceof Iterator) {
            boolean z = this.f27342x[this.f27343y - 2] instanceof JsonObject;
            Iterator it = (Iterator) objM12238P0;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z) {
                return JsonToken.NAME;
            }
            m12240R0(it.next());
            return mo12234H0();
        }
        if (objM12238P0 instanceof JsonObject) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (objM12238P0 instanceof JsonArray) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (!(objM12238P0 instanceof JsonPrimitive)) {
            if (objM12238P0 instanceof JsonNull) {
                return JsonToken.NULL;
            }
            if (objM12238P0 == f27340w) {
                throw new IllegalStateException("JsonReader is closed");
            }
            throw new AssertionError();
        }
        Object obj = ((JsonPrimitive) objM12238P0).f27583a;
        if (obj instanceof String) {
            return JsonToken.STRING;
        }
        if (obj instanceof Boolean) {
            return JsonToken.BOOLEAN;
        }
        if (obj instanceof Number) {
            return JsonToken.NUMBER;
        }
        throw new AssertionError();
    }

    @Override // p007c.p190n.p430e.p437g0.JsonReader2
    /* JADX INFO: renamed from: M0 */
    public void mo12235M0() throws IOException {
        if (mo12234H0() == JsonToken.NAME) {
            mo12248u0();
            this.f27344z[this.f27343y - 2] = "null";
        } else {
            m12239Q0();
            int i = this.f27343y;
            if (i > 0) {
                this.f27344z[i - 1] = "null";
            }
        }
        int i2 = this.f27343y;
        if (i2 > 0) {
            int[] iArr = this.f27341A;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // p007c.p190n.p430e.p437g0.JsonReader2
    /* JADX INFO: renamed from: O */
    public boolean mo12236O() throws IOException {
        JsonToken jsonTokenMo12234H0 = mo12234H0();
        return (jsonTokenMo12234H0 == JsonToken.END_OBJECT || jsonTokenMo12234H0 == JsonToken.END_ARRAY) ? false : true;
    }

    /* JADX INFO: renamed from: O0 */
    public final void m12237O0(JsonToken jsonToken) throws IOException {
        if (mo12234H0() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + mo12234H0() + m12230b0());
    }

    /* JADX INFO: renamed from: P0 */
    public final Object m12238P0() {
        return this.f27342x[this.f27343y - 1];
    }

    /* JADX INFO: renamed from: Q0 */
    public final Object m12239Q0() {
        Object[] objArr = this.f27342x;
        int i = this.f27343y - 1;
        this.f27343y = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* JADX INFO: renamed from: R0 */
    public final void m12240R0(Object obj) {
        int i = this.f27343y;
        Object[] objArr = this.f27342x;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f27342x = Arrays.copyOf(objArr, i2);
            this.f27341A = Arrays.copyOf(this.f27341A, i2);
            this.f27344z = (String[]) Arrays.copyOf(this.f27344z, i2);
        }
        Object[] objArr2 = this.f27342x;
        int i3 = this.f27343y;
        this.f27343y = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // p007c.p190n.p430e.p437g0.JsonReader2
    /* JADX INFO: renamed from: a */
    public void mo12241a() throws IOException {
        m12237O0(JsonToken.BEGIN_ARRAY);
        m12240R0(((JsonArray) m12238P0()).iterator());
        this.f27341A[this.f27343y - 1] = 0;
    }

    @Override // p007c.p190n.p430e.p437g0.JsonReader2
    /* JADX INFO: renamed from: c */
    public void mo12242c() throws IOException {
        m12237O0(JsonToken.BEGIN_OBJECT);
        m12240R0(new LinkedTreeMap.b.a((LinkedTreeMap.b) ((JsonObject) m12238P0()).f27582a.entrySet()));
    }

    @Override // p007c.p190n.p430e.p437g0.JsonReader2, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f27342x = new Object[]{f27340w};
        this.f27343y = 1;
    }

    @Override // p007c.p190n.p430e.p437g0.JsonReader2
    /* JADX INFO: renamed from: f0 */
    public boolean mo12243f0() throws IOException {
        m12237O0(JsonToken.BOOLEAN);
        boolean zM12327f = ((JsonPrimitive) m12239Q0()).m12327f();
        int i = this.f27343y;
        if (i > 0) {
            int[] iArr = this.f27341A;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return zM12327f;
    }

    @Override // p007c.p190n.p430e.p437g0.JsonReader2
    /* JADX INFO: renamed from: g0 */
    public double mo12244g0() throws IOException {
        JsonToken jsonTokenMo12234H0 = mo12234H0();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenMo12234H0 != jsonToken && jsonTokenMo12234H0 != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenMo12234H0 + m12230b0());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) m12238P0();
        double dDoubleValue = jsonPrimitive.f27583a instanceof Number ? jsonPrimitive.m12328h().doubleValue() : Double.parseDouble(jsonPrimitive.m12329j());
        if (!this.f27518h && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + dDoubleValue);
        }
        m12239Q0();
        int i = this.f27343y;
        if (i > 0) {
            int[] iArr = this.f27341A;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return dDoubleValue;
    }

    @Override // p007c.p190n.p430e.p437g0.JsonReader2
    /* JADX INFO: renamed from: n0 */
    public int mo12245n0() throws IOException {
        JsonToken jsonTokenMo12234H0 = mo12234H0();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenMo12234H0 != jsonToken && jsonTokenMo12234H0 != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenMo12234H0 + m12230b0());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) m12238P0();
        int iIntValue = jsonPrimitive.f27583a instanceof Number ? jsonPrimitive.m12328h().intValue() : Integer.parseInt(jsonPrimitive.m12329j());
        m12239Q0();
        int i = this.f27343y;
        if (i > 0) {
            int[] iArr = this.f27341A;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return iIntValue;
    }

    @Override // p007c.p190n.p430e.p437g0.JsonReader2
    /* JADX INFO: renamed from: t0 */
    public long mo12246t0() throws IOException {
        JsonToken jsonTokenMo12234H0 = mo12234H0();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (jsonTokenMo12234H0 != jsonToken && jsonTokenMo12234H0 != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + jsonTokenMo12234H0 + m12230b0());
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) m12238P0();
        long jLongValue = jsonPrimitive.f27583a instanceof Number ? jsonPrimitive.m12328h().longValue() : Long.parseLong(jsonPrimitive.m12329j());
        m12239Q0();
        int i = this.f27343y;
        if (i > 0) {
            int[] iArr = this.f27341A;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return jLongValue;
    }

    @Override // p007c.p190n.p430e.p437g0.JsonReader2
    public String toString() {
        return JsonTreeReader.class.getSimpleName();
    }

    @Override // p007c.p190n.p430e.p437g0.JsonReader2
    /* JADX INFO: renamed from: u */
    public void mo12247u() throws IOException {
        m12237O0(JsonToken.END_ARRAY);
        m12239Q0();
        m12239Q0();
        int i = this.f27343y;
        if (i > 0) {
            int[] iArr = this.f27341A;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // p007c.p190n.p430e.p437g0.JsonReader2
    /* JADX INFO: renamed from: u0 */
    public String mo12248u0() throws IOException {
        m12237O0(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m12238P0()).next();
        String str = (String) entry.getKey();
        this.f27344z[this.f27343y - 1] = str;
        m12240R0(entry.getValue());
        return str;
    }

    @Override // p007c.p190n.p430e.p437g0.JsonReader2
    /* JADX INFO: renamed from: z0 */
    public void mo12249z0() throws IOException {
        m12237O0(JsonToken.NULL);
        m12239Q0();
        int i = this.f27343y;
        if (i > 0) {
            int[] iArr = this.f27341A;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }
}
