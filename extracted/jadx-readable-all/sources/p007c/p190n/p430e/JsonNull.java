package p007c.p190n.p430e;

/* JADX INFO: renamed from: c.n.e.s, reason: use source file name */
/* JADX INFO: compiled from: JsonNull.java */
/* JADX INFO: loaded from: classes.dex */
public final class JsonNull extends JsonElement {

    /* JADX INFO: renamed from: a */
    public static final JsonNull f27581a = new JsonNull();

    @Deprecated
    public JsonNull() {
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof JsonNull);
    }

    public int hashCode() {
        return JsonNull.class.hashCode();
    }
}
