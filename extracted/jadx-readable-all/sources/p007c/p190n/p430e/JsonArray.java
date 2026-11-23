package p007c.p190n.p430e;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: c.n.e.n, reason: use source file name */
/* JADX INFO: compiled from: JsonArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class JsonArray extends JsonElement implements Iterable<JsonElement> {

    /* JADX INFO: renamed from: f */
    public final List<JsonElement> f27580f;

    public JsonArray() {
        this.f27580f = new ArrayList();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof JsonArray) && ((JsonArray) obj).f27580f.equals(this.f27580f));
    }

    public int hashCode() {
        return this.f27580f.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<JsonElement> iterator() {
        return this.f27580f.iterator();
    }

    public JsonArray(int i) {
        this.f27580f = new ArrayList(i);
    }
}
