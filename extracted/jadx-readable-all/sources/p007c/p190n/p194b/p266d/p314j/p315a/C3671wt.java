package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: c.n.b.d.j.a.wt */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3671wt {

    /* JADX INFO: renamed from: a */
    public static final Pattern f21354a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* JADX INFO: renamed from: b */
    public static final Pattern f21355b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    /* JADX INFO: renamed from: a */
    public static String m8693a(String str, String... strArr) {
        int length = strArr.length;
        if (length == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f21354a.matcher(str);
        int i = 0;
        if (matcher.find()) {
            int iEnd = matcher.end();
            sb.append(str.substring(0, iEnd));
            while (i < length) {
                String str2 = strArr[i];
                if (str2 != null) {
                    sb.append(str2);
                }
                i++;
            }
            sb.append(str.substring(iEnd));
        } else {
            if (!f21355b.matcher(str).find()) {
                while (i < length) {
                    String str3 = strArr[i];
                    if (str3 != null) {
                        sb.append(str3);
                    }
                    i++;
                }
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
