package p524h1.p525b0;

/* JADX INFO: renamed from: h1.b0.b, reason: use source file name */
/* JADX INFO: compiled from: ByteString.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ByteString2 {

    /* JADX INFO: renamed from: a */
    public static final char[] f30702a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: a */
    public static final int m13708a(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        char c3 = 'a';
        if ('a' > c2 || 'f' < c2) {
            c3 = 'A';
            if ('A' > c2 || 'F' < c2) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c2);
            }
        }
        return (c2 - c3) + 10;
    }
}
