package p477d1.p483s;

import java.util.Collections;
import java.util.Set;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.s.b0, reason: use source file name */
/* JADX INFO: compiled from: SetsJVM.kt */
/* JADX INFO: loaded from: classes.dex */
public class SetsJVM {
    /* JADX INFO: renamed from: a */
    public static final <T> Set<T> m13026a(T t) {
        Set<T> setSingleton = Collections.singleton(t);
        Intrinsics2.m13088d(setSingleton, "java.util.Collections.singleton(element)");
        return setSingleton;
    }
}
