package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p007c.p190n.p194b.p266d.p298f.p299o.C2629b;
import p007c.p190n.p194b.p266d.p333n.C4782j;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.h1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2664h1 {

    /* JADX INFO: renamed from: a */
    public final Map<BasePendingResult<?>, Boolean> f11701a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public final Map<C4782j<?>, Boolean> f11702b = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: a */
    public final void m5539a(boolean z, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f11701a) {
            map = new HashMap(this.f11701a);
        }
        synchronized (this.f11702b) {
            map2 = new HashMap(this.f11702b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).m12661l(status);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((C4782j) entry2.getKey()).m10947a(new C2629b(status));
            }
        }
    }
}
