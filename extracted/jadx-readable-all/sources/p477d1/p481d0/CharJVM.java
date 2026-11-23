package p477d1.p481d0;

import p007c.p071d.p078c.p079a.outline;
import p477d1.p478a0.Ranges;

/* JADX INFO: renamed from: d1.d0.a, reason: use source file name */
/* JADX INFO: compiled from: CharJVM.kt */
/* JADX INFO: loaded from: classes.dex */
public class CharJVM {
    /* JADX INFO: renamed from: a */
    public static final int m12978a(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        StringBuilder sbM1557H = outline.m1557H("radix ", i, " was not in valid range ");
        sbM1557H.append(new Ranges(2, 36));
        throw new IllegalArgumentException(sbM1557H.toString());
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m12979b(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }
}
