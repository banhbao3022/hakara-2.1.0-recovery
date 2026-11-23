package p007c.p190n.p430e.p432e0.p433a0;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p007c.p190n.p430e.JsonArray;
import p007c.p190n.p430e.JsonElement;
import p007c.p190n.p430e.JsonNull;
import p007c.p190n.p430e.JsonObject;
import p007c.p190n.p430e.JsonPrimitive;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: renamed from: c.n.e.e0.a0.f, reason: use source file name */
/* JADX INFO: compiled from: JsonTreeWriter.java */
/* JADX INFO: loaded from: classes.dex */
public final class JsonTreeWriter extends JsonWriter {

    /* JADX INFO: renamed from: q */
    public static final Writer f27345q = new a();

    /* JADX INFO: renamed from: r */
    public static final JsonPrimitive f27346r = new JsonPrimitive("closed");

    /* JADX INFO: renamed from: s */
    public final List<JsonElement> f27347s;

    /* JADX INFO: renamed from: t */
    public String f27348t;

    /* JADX INFO: renamed from: u */
    public JsonElement f27349u;

    /* JADX INFO: renamed from: c.n.e.e0.a0.f$a */
    /* JADX INFO: compiled from: JsonTreeWriter.java */
    public class a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public JsonTreeWriter() {
        super(f27345q);
        this.f27347s = new ArrayList();
        this.f27349u = JsonNull.f27581a;
    }

    @Override // p007c.p190n.p430e.p437g0.JsonWriter
    /* JADX INFO: renamed from: B */
    public JsonWriter mo12250B() throws IOException {
        if (this.f27347s.isEmpty() || this.f27348t != null) {
            throw new IllegalStateException();
        }
        if (!(m12252F0() instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        List<JsonElement> list = this.f27347s;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // p007c.p190n.p430e.p437g0.JsonWriter
    /* JADX INFO: renamed from: D */
    public JsonWriter mo12251D(String str) throws IOException {
        if (this.f27347s.isEmpty() || this.f27348t != null) {
            throw new IllegalStateException();
        }
        if (!(m12252F0() instanceof JsonObject)) {
            throw new IllegalStateException();
        }
        this.f27348t = str;
        return this;
    }

    /* JADX INFO: renamed from: F0 */
    public final JsonElement m12252F0() {
        List<JsonElement> list = this.f27347s;
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m12253G0(JsonElement jsonElement) {
        if (this.f27348t != null) {
            Objects.requireNonNull(jsonElement);
            if (!(jsonElement instanceof JsonNull) || this.f27553p) {
                JsonObject jsonObject = (JsonObject) m12252F0();
                jsonObject.f27582a.put(this.f27348t, jsonElement);
            }
            this.f27348t = null;
            return;
        }
        if (this.f27347s.isEmpty()) {
            this.f27349u = jsonElement;
            return;
        }
        JsonElement jsonElementM12252F0 = m12252F0();
        if (!(jsonElementM12252F0 instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        JsonArray jsonArray = (JsonArray) jsonElementM12252F0;
        Objects.requireNonNull(jsonArray);
        if (jsonElement == null) {
            jsonElement = JsonNull.f27581a;
        }
        jsonArray.f27580f.add(jsonElement);
    }

    @Override // p007c.p190n.p430e.p437g0.JsonWriter
    /* JADX INFO: renamed from: O */
    public JsonWriter mo12254O() throws IOException {
        m12253G0(JsonNull.f27581a);
        return this;
    }

    @Override // p007c.p190n.p430e.p437g0.JsonWriter
    /* JADX INFO: renamed from: c */
    public JsonWriter mo12255c() throws IOException {
        JsonArray jsonArray = new JsonArray();
        m12253G0(jsonArray);
        this.f27347s.add(jsonArray);
        return this;
    }

    @Override // p007c.p190n.p430e.p437g0.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f27347s.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f27347s.add(f27346r);
    }

    @Override // p007c.p190n.p430e.p437g0.JsonWriter
    /* JADX INFO: renamed from: f */
    public JsonWriter mo12256f() throws IOException {
        JsonObject jsonObject = new JsonObject();
        m12253G0(jsonObject);
        this.f27347s.add(jsonObject);
        return this;
    }

    @Override // p007c.p190n.p430e.p437g0.JsonWriter, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // p007c.p190n.p430e.p437g0.JsonWriter
    /* JADX INFO: renamed from: n0 */
    public JsonWriter mo12257n0(long j2) throws IOException {
        m12253G0(new JsonPrimitive(Long.valueOf(j2)));
        return this;
    }

    @Override // p007c.p190n.p430e.p437g0.JsonWriter
    /* JADX INFO: renamed from: t0 */
    public JsonWriter mo12258t0(Boolean bool) throws IOException {
        if (bool == null) {
            m12253G0(JsonNull.f27581a);
            return this;
        }
        m12253G0(new JsonPrimitive(bool));
        return this;
    }

    @Override // p007c.p190n.p430e.p437g0.JsonWriter
    /* JADX INFO: renamed from: u */
    public JsonWriter mo12259u() throws IOException {
        if (this.f27347s.isEmpty() || this.f27348t != null) {
            throw new IllegalStateException();
        }
        if (!(m12252F0() instanceof JsonArray)) {
            throw new IllegalStateException();
        }
        List<JsonElement> list = this.f27347s;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // p007c.p190n.p430e.p437g0.JsonWriter
    /* JADX INFO: renamed from: u0 */
    public JsonWriter mo12260u0(Number number) throws IOException {
        if (number == null) {
            m12253G0(JsonNull.f27581a);
            return this;
        }
        if (!this.f27550m) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m12253G0(new JsonPrimitive(number));
        return this;
    }

    @Override // p007c.p190n.p430e.p437g0.JsonWriter
    /* JADX INFO: renamed from: x0 */
    public JsonWriter mo12261x0(String str) throws IOException {
        if (str == null) {
            m12253G0(JsonNull.f27581a);
            return this;
        }
        m12253G0(new JsonPrimitive(str));
        return this;
    }

    @Override // p007c.p190n.p430e.p437g0.JsonWriter
    /* JADX INFO: renamed from: z0 */
    public JsonWriter mo12262z0(boolean z) throws IOException {
        m12253G0(new JsonPrimitive(Boolean.valueOf(z)));
        return this;
    }
}
