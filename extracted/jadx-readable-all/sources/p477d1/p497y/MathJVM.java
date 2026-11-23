package p477d1.p497y;

/* JADX INFO: renamed from: d1.y.b, reason: use source file name */
/* JADX INFO: compiled from: MathJVM.kt */
/* JADX INFO: loaded from: classes.dex */
public class MathJVM extends MathH {
    /* JADX INFO: renamed from: a */
    public static final int m13102a(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (d < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }
}
