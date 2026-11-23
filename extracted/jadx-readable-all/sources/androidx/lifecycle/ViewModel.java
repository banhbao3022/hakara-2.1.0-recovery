package androidx.lifecycle;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ViewModel {

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> f793a = new HashMap();

    /* JADX INFO: renamed from: b */
    public volatile boolean f794b = false;

    /* JADX INFO: renamed from: d */
    public <T> T m437d(String str) {
        T t;
        Map<String, Object> map = this.f793a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.f793a.get(str);
        }
        return t;
    }

    /* JADX INFO: renamed from: e */
    public void mo438e() {
    }

    /* JADX INFO: renamed from: f */
    public <T> T m439f(String str, T t) {
        Object obj;
        synchronized (this.f793a) {
            obj = this.f793a.get(str);
            if (obj == null) {
                this.f793a.put(str, t);
            }
        }
        if (obj != null) {
            t = (T) obj;
        }
        if (this.f794b && (t instanceof Closeable)) {
            try {
                t.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return t;
    }
}
