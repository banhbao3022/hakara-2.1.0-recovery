package p477d1.p480c0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p477d1.p483s.Collections2;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.c0.j, reason: use source file name */
/* JADX INFO: compiled from: _Sequences.kt */
/* JADX INFO: loaded from: classes.dex */
public class _Sequences extends _SequencesJvm {
    /* JADX INFO: renamed from: b */
    public static final <T> List<T> m12977b(Sequence<? extends T> sequence) {
        Intrinsics2.m13089e(sequence, "$this$toList");
        Intrinsics2.m13089e(sequence, "$this$toMutableList");
        ArrayList arrayList = new ArrayList();
        Intrinsics2.m13089e(sequence, "$this$toCollection");
        Intrinsics2.m13089e(arrayList, "destination");
        Iterator<? extends T> it = sequence.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return Collections2.m13040e(arrayList);
    }
}
