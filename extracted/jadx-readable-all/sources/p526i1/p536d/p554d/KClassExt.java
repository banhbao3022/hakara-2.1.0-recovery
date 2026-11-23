package p526i1.p536d.p554d;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p007c.p451o.p452a.C5729a;
import p477d1.p479b0.KClass;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: i1.d.d.a, reason: use source file name */
/* JADX INFO: compiled from: KClassExt.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class KClassExt {

    /* JADX INFO: renamed from: a */
    public static final Map<KClass<?>, String> f30958a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static final String m13867a(KClass<?> kClass) {
        Intrinsics2.m13090f(kClass, "$this$getFullName");
        Map<KClass<?>, String> map = f30958a;
        String str = map.get(kClass);
        if (str != null) {
            return str;
        }
        Intrinsics2.m13090f(kClass, "$this$saveCache");
        String name = C5729a.m12464s(kClass).getName();
        Intrinsics2.m13086b(name, "name");
        map.put(kClass, name);
        return name;
    }
}
