package p007c.p190n.p430e;

import java.io.IOException;
import java.io.StringWriter;
import p007c.p190n.p430e.p432e0.p433a0.TypeAdapters;
import p007c.p190n.p430e.p437g0.JsonWriter;

/* JADX INFO: renamed from: c.n.e.q, reason: use source file name */
/* JADX INFO: compiled from: JsonElement.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class JsonElement {
    /* JADX INFO: renamed from: c */
    public JsonPrimitive m12325c() {
        if (this instanceof JsonPrimitive) {
            return (JsonPrimitive) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.f27550m = true;
            TypeAdapters.f27411X.mo12213b(jsonWriter, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
