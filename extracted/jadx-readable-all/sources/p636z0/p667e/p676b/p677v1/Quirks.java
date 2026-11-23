package p636z0.p667e.p676b.p677v1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: z0.e.b.v1.e1, reason: use source file name */
/* JADX INFO: compiled from: Quirks.java */
/* JADX INFO: loaded from: classes.dex */
public class Quirks {

    /* JADX INFO: renamed from: a */
    public final List<Quirk> f36132a;

    public Quirks(List<Quirk> list) {
        this.f36132a = new ArrayList(list);
    }

    /* JADX INFO: renamed from: a */
    public <T extends Quirk> T m15353a(Class<T> cls) {
        Iterator<Quirk> it = this.f36132a.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }
}
