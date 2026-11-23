package p007c.p190n.p194b.p367f.p368a.p372c;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p007c.p190n.p194b.p367f.p368a.p373d.C5089f;

/* JADX INFO: renamed from: c.n.b.f.a.c.b */
/* JADX INFO: loaded from: classes.dex */
public class C5075b {

    /* JADX INFO: renamed from: a */
    public static final Map<String, Map<String, Integer>> f26033a;

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", "unity"));
        f26033a = new HashMap();
        new C5089f("PlayCoreVersion");
    }

    /* JADX INFO: renamed from: a */
    public static Bundle m11524a(String str) {
        Map<String, Integer> map;
        Bundle bundle = new Bundle();
        synchronized (C5075b.class) {
            Map<String, Map<String, Integer>> map2 = f26033a;
            if (!map2.containsKey(str)) {
                HashMap map3 = new HashMap();
                map3.put("java", 11000);
                map2.put(str, map3);
            }
            map = map2.get(str);
        }
        bundle.putInt("playcore_version_code", map.get("java").intValue());
        if (map.containsKey("native")) {
            bundle.putInt("playcore_native_version", map.get("native").intValue());
        }
        if (map.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", map.get("unity").intValue());
        }
        return bundle;
    }
}
