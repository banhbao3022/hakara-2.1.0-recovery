package p477d1.p483s;

import java.util.Collection;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.s.k, reason: use source file name */
/* JADX INFO: compiled from: Iterables.kt */
/* JADX INFO: loaded from: classes.dex */
public class Iterables2 extends Collections2 {
    /* JADX INFO: renamed from: g */
    public static final <T> int m13042g(Iterable<? extends T> iterable, int i) {
        Intrinsics2.m13089e(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i;
    }
}
