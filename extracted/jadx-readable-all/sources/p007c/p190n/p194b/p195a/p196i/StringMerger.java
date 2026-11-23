package p007c.p190n.p194b.p195a.p196i;

/* JADX INFO: renamed from: c.n.b.a.i.e, reason: use source file name */
/* JADX INFO: compiled from: StringMerger.java */
/* JADX INFO: loaded from: classes.dex */
public final class StringMerger {
    /* JADX INFO: renamed from: a */
    public static String m2758a(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }
}
