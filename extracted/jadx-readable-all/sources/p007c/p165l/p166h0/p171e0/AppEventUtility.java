package p007c.p165l.p166h0.p171e0;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p007c.p165l.p178k0.Utility;

/* JADX INFO: renamed from: c.l.h0.e0.e, reason: use source file name */
/* JADX INFO: compiled from: AppEventUtility.java */
/* JADX INFO: loaded from: classes.dex */
public class AppEventUtility {
    /* JADX INFO: renamed from: a */
    public static String m2315a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            stringBuffer.append(String.format("%02x", Byte.valueOf(b)));
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    public static double m2316b(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([\\,\\.]\\d+)*([\\.\\,]\\d+)?", 8).matcher(str);
            if (matcher.find()) {
                String strGroup = matcher.group(0);
                Locale localeM2456o = Utility.m2456o();
                if (localeM2456o == null) {
                    localeM2456o = Locale.getDefault();
                }
                return NumberFormat.getNumberInstance(localeM2456o).parse(strGroup).doubleValue();
            }
        } catch (ParseException unused) {
        }
        return 0.0d;
    }
}
