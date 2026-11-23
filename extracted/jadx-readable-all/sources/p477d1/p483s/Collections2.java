package p477d1.p483s;

import java.util.ArrayList;
import java.util.List;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.s.j, reason: use source file name */
/* JADX INFO: compiled from: Collections.kt */
/* JADX INFO: loaded from: classes.dex */
public class Collections2 extends CollectionsJVM {
    /* JADX INFO: renamed from: b */
    public static final <T> int m13037b(List<? extends T> list) {
        Intrinsics2.m13089e(list, "$this$lastIndex");
        return list.size() - 1;
    }

    /* JADX INFO: renamed from: c */
    public static final <T> List<T> m13038c(T... tArr) {
        Intrinsics2.m13089e(tArr, "elements");
        return tArr.length > 0 ? _ArraysJvm.m13027a(tArr) : Collections4.f29519f;
    }

    /* JADX INFO: renamed from: d */
    public static final <T> List<T> m13039d(T... tArr) {
        Intrinsics2.m13089e(tArr, "elements");
        Intrinsics2.m13089e(tArr, "$this$filterNotNull");
        ArrayList arrayList = new ArrayList();
        Intrinsics2.m13089e(tArr, "$this$filterNotNullTo");
        Intrinsics2.m13089e(arrayList, "destination");
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public static final <T> List<T> m13040e(List<? extends T> list) {
        Intrinsics2.m13089e(list, "$this$optimizeReadOnlyList");
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : CollectionsJVM.m13036a(list.get(0));
        }
        return Collections4.f29519f;
    }

    /* JADX INFO: renamed from: f */
    public static final void m13041f() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
