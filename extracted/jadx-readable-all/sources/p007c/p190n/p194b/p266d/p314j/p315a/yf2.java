package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yf2<T> {

    /* JADX INFO: renamed from: a */
    public final Map<String, AtomicReference<T>> f21873a = new HashMap();

    /* JADX INFO: renamed from: a */
    public final AtomicReference<T> m8794a(String str) {
        synchronized (this) {
            if (!this.f21873a.containsKey(str)) {
                this.f21873a.put(str, new AtomicReference<>());
            }
        }
        return this.f21873a.get(str);
    }
}
