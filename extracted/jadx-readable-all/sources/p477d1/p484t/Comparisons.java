package p477d1.p484t;

/* JADX INFO: renamed from: d1.t.a, reason: use source file name */
/* JADX INFO: compiled from: Comparisons.kt */
/* JADX INFO: loaded from: classes.dex */
public class Comparisons {
    /* JADX INFO: renamed from: a */
    public static final <T extends Comparable<?>> int m13054a(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }
}
