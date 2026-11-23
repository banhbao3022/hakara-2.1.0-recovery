package p007c.p190n.p430e;

import p007c.p190n.p430e.p432e0.LinkedTreeMap;

/* JADX INFO: renamed from: c.n.e.t, reason: use source file name */
/* JADX INFO: compiled from: JsonObject.java */
/* JADX INFO: loaded from: classes.dex */
public final class JsonObject extends JsonElement {

    /* JADX INFO: renamed from: a */
    public final LinkedTreeMap<String, JsonElement> f27582a = new LinkedTreeMap<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof JsonObject) && ((JsonObject) obj).f27582a.equals(this.f27582a));
    }

    public int hashCode() {
        return this.f27582a.hashCode();
    }
}
