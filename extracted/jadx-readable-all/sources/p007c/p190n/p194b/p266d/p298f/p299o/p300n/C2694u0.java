package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.u0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2694u0 {

    /* JADX INFO: renamed from: a */
    public static final Status f11759a = new Status(8, "The connection to Google Play services was lost");

    /* JADX INFO: renamed from: b */
    public final Set<BasePendingResult<?>> f11760b = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* JADX INFO: renamed from: c */
    public final Map<C2628a.c<?>, C2628a.f> f11761c;

    public C2694u0(Map<C2628a.c<?>, C2628a.f> map) {
        this.f11761c = map;
    }
}
