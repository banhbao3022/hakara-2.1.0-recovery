package p477d1.p484t;

import java.util.Comparator;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.t.c, reason: use source file name */
/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Comparisons3 implements Comparator<Comparable<? super Object>> {

    /* JADX INFO: renamed from: f */
    public static final Comparisons3 f29523f = new Comparisons3();

    @Override // java.util.Comparator
    public int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> comparable3 = comparable;
        Comparable<? super Object> comparable4 = comparable2;
        Intrinsics2.m13089e(comparable3, "a");
        Intrinsics2.m13089e(comparable4, "b");
        return comparable4.compareTo(comparable3);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return Comparisons2.f29522f;
    }
}
