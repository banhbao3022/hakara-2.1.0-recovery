package p007c.p190n.p430e.p432e0;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.e.e0.u, reason: use source file name */
/* JADX INFO: compiled from: PreJava9DateFormatProvider.java */
/* JADX INFO: loaded from: classes.dex */
public class PreJava9DateFormatProvider {
    /* JADX INFO: renamed from: a */
    public static DateFormat m12290a(int i, int i2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i == 1) {
            str = "MMMM d, yyyy";
        } else if (i == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(outline.m1590l("Unknown DateFormat style: ", i));
            }
            str = "M/d/yy";
        }
        sb.append(str);
        sb.append(" ");
        if (i2 == 0 || i2 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i2 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException(outline.m1590l("Unknown DateFormat style: ", i2));
            }
            str2 = "h:mm a";
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }
}
