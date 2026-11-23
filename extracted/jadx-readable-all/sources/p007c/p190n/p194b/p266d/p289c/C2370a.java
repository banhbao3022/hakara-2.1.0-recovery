package p007c.p190n.p194b.p266d.p289c;

import java.util.Collection;
import java.util.Iterator;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p290d.p295s.C2516a;

/* JADX INFO: renamed from: c.n.b.d.c.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2370a {
    /* JADX INFO: renamed from: a */
    public static String m4939a(String str, String str2, Collection collection) throws IllegalArgumentException {
        StringBuilder sb = new StringBuilder(str);
        String upperCase = str2.toUpperCase();
        if (!upperCase.matches("[A-F0-9]+")) {
            throw new IllegalArgumentException(str2.length() != 0 ? "Invalid application ID: ".concat(str2) : new String("Invalid application ID: "));
        }
        sb.append("/");
        sb.append(upperCase);
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            sb.append("/");
            Iterator it = collection.iterator();
            boolean z = true;
            while (it.hasNext()) {
                String string = (String) it.next();
                C2516a.m5113c(string);
                if (z) {
                    z = false;
                } else {
                    sb.append(",");
                }
                if (!C2516a.f11372a.matcher(string).matches()) {
                    StringBuilder sb2 = new StringBuilder(string.length());
                    for (int i = 0; i < string.length(); i++) {
                        char cCharAt = string.charAt(i);
                        if (((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '_' || cCharAt == '-')) || cCharAt == '.' || cCharAt == ':') {
                            sb2.append(cCharAt);
                        } else {
                            sb2.append(String.format("%%%04x", Integer.valueOf(cCharAt & 65535)));
                        }
                    }
                    string = sb2.toString();
                }
                sb.append(string);
            }
        }
        if (collection == null) {
            sb.append("/");
        }
        return outline.m1552C(sb, "/", "/", "ALLOW_IPV6");
    }
}
