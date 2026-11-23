package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class on2 {

    /* JADX INFO: renamed from: a */
    public final Map<String, String> f17696a = new HashMap();

    /* JADX INFO: renamed from: b */
    public Map<String, String> f17697b;

    /* JADX INFO: renamed from: a */
    public final synchronized Map<String, String> m8045a() {
        if (this.f17697b == null) {
            this.f17697b = Collections.unmodifiableMap(new HashMap(this.f17696a));
        }
        return this.f17697b;
    }
}
