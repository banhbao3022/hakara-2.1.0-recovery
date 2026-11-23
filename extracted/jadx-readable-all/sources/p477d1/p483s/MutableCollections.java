package p477d1.p483s;

import java.util.Collection;
import java.util.Iterator;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.s.o, reason: use source file name */
/* JADX INFO: compiled from: MutableCollections.kt */
/* JADX INFO: loaded from: classes.dex */
public class MutableCollections extends MutableCollectionsJVM {
    /* JADX INFO: renamed from: h */
    public static final <T> boolean m13043h(Collection<? super T> collection, Iterable<? extends T> iterable) {
        Intrinsics2.m13089e(collection, "$this$addAll");
        Intrinsics2.m13089e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z = true;
            }
        }
        return z;
    }
}
