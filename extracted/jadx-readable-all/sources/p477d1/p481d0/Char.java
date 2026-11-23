package p477d1.p481d0;

/* JADX INFO: renamed from: d1.d0.b, reason: use source file name */
/* JADX INFO: compiled from: Char.kt */
/* JADX INFO: loaded from: classes.dex */
public class Char extends CharJVM {
    /* JADX INFO: renamed from: c */
    public static final boolean m12980c(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (z) {
            return Character.toUpperCase(c2) == Character.toUpperCase(c3) || Character.toLowerCase(c2) == Character.toLowerCase(c3);
        }
        return false;
    }
}
