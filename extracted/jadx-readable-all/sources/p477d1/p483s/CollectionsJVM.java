package p477d1.p483s;

import java.util.Collections;
import java.util.List;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.s.i, reason: use source file name */
/* JADX INFO: compiled from: CollectionsJVM.kt */
/* JADX INFO: loaded from: classes.dex */
public class CollectionsJVM {
    /* JADX INFO: renamed from: a */
    public static final <T> List<T> m13036a(T t) {
        List<T> listSingletonList = Collections.singletonList(t);
        Intrinsics2.m13088d(listSingletonList, "java.util.Collections.singletonList(element)");
        return listSingletonList;
    }
}
