package p007c.p190n.p438f.p445l;

/* JADX INFO: renamed from: c.n.f.l.a, reason: use source file name */
/* JADX INFO: compiled from: CodaBarReader.java */
/* JADX INFO: loaded from: classes.dex */
public final class CodaBarReader extends OneDReader {

    /* JADX INFO: renamed from: a */
    public static final char[] f27725a = "0123456789-$:/.+ABCD".toCharArray();

    /* JADX INFO: renamed from: b */
    public static final int[] f27726b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    /* JADX INFO: renamed from: a */
    public static boolean m12385a(char[] cArr, char c2) {
        for (char c3 : cArr) {
            if (c3 == c2) {
                return true;
            }
        }
        return false;
    }
}
