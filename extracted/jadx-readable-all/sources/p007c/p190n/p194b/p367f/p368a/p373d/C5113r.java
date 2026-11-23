package p007c.p190n.p194b.p367f.p368a.p373d;

import java.io.File;

/* JADX INFO: renamed from: c.n.b.f.a.d.r */
/* JADX INFO: loaded from: classes.dex */
public final class C5113r {
    /* JADX INFO: renamed from: a */
    public static String m11551a(File file) {
        if (!file.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String str = "";
        String strReplaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
        if (strReplaceFirst.equals("base-master")) {
            return "";
        }
        String str2 = "base-";
        if (strReplaceFirst.startsWith("base-")) {
            str = "config.";
        } else {
            strReplaceFirst = strReplaceFirst.replace("-", ".config.");
            str2 = ".config.master";
        }
        return strReplaceFirst.replace(str2, str);
    }
}
