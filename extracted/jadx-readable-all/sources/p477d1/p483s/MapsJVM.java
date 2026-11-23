package p477d1.p483s;

import java.util.Collections;
import java.util.Map;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.s.z, reason: use source file name */
/* JADX INFO: compiled from: MapsJVM.kt */
/* JADX INFO: loaded from: classes.dex */
public class MapsJVM extends MapWithDefault {
    /* JADX INFO: renamed from: a */
    public static final int m13052a(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: b */
    public static final <K, V> Map<K, V> m13053b(Map<? extends K, ? extends V> map) {
        Intrinsics2.m13089e(map, "$this$toSingletonMap");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        Intrinsics2.m13088d(mapSingletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return mapSingletonMap;
    }
}
