package p007c.p190n.p194b.p367f.p368a.p372c;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: c.n.b.f.a.c.c */
/* JADX INFO: loaded from: classes.dex */
public final class C5076c {

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> f26034a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final AtomicBoolean f26035b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public final synchronized boolean m11525a() {
        if (!this.f26035b.get()) {
            synchronized (this) {
                this.f26034a.put("assetOnlyUpdates", Boolean.FALSE);
            }
        }
        Object obj = this.f26034a.get("assetOnlyUpdates");
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }
}
