package p477d1.p483s;

import java.util.Map;
import p477d1.Tuples;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.s.a0, reason: use source file name */
/* JADX INFO: compiled from: Maps.kt */
/* JADX INFO: loaded from: classes.dex */
public class Maps6 extends MapsJVM {
    /* JADX INFO: renamed from: c */
    public static final <K, V, M extends Map<? super K, ? super V>> M m13024c(Iterable<? extends Tuples<? extends K, ? extends V>> iterable, M m) {
        Intrinsics2.m13089e(iterable, "$this$toMap");
        Intrinsics2.m13089e(m, "destination");
        Intrinsics2.m13089e(m, "$this$putAll");
        Intrinsics2.m13089e(iterable, "pairs");
        for (Tuples<? extends K, ? extends V> tuples : iterable) {
            m.put(tuples.f29491f, tuples.f29492g);
        }
        return m;
    }
}
