package p007c.p165l.p166h0;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: c.l.h0.x, reason: use source file name */
/* JADX INFO: compiled from: PersistedEvents.java */
/* JADX INFO: loaded from: classes.dex */
public class PersistedEvents implements Serializable {

    /* JADX INFO: renamed from: f */
    public HashMap<AccessTokenAppIdPair, List<AppEvent>> f4856f;

    /* JADX INFO: renamed from: c.l.h0.x$b */
    /* JADX INFO: compiled from: PersistedEvents.java */
    public static class b implements Serializable {

        /* JADX INFO: renamed from: f */
        public final HashMap<AccessTokenAppIdPair, List<AppEvent>> f4857f;

        public b(HashMap map, a aVar) {
            this.f4857f = map;
        }

        private Object readResolve() {
            return new PersistedEvents(this.f4857f);
        }
    }

    public PersistedEvents() {
        this.f4856f = new HashMap<>();
    }

    private Object writeReplace() {
        return new b(this.f4856f, null);
    }

    /* JADX INFO: renamed from: a */
    public void m2371a(AccessTokenAppIdPair accessTokenAppIdPair, List<AppEvent> list) {
        if (this.f4856f.containsKey(accessTokenAppIdPair)) {
            this.f4856f.get(accessTokenAppIdPair).addAll(list);
        } else {
            this.f4856f.put(accessTokenAppIdPair, list);
        }
    }

    public PersistedEvents(HashMap<AccessTokenAppIdPair, List<AppEvent>> map) {
        HashMap<AccessTokenAppIdPair, List<AppEvent>> map2 = new HashMap<>();
        this.f4856f = map2;
        map2.putAll(map);
    }
}
