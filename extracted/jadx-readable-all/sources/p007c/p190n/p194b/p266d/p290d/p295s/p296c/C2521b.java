package p007c.p190n.p194b.p266d.p290d.p295s.p296c;

import android.text.TextUtils;
import android.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p290d.p295s.C2518b;
import p007c.p190n.p194b.p266d.p298f.p301p.C2708a;

/* JADX INFO: renamed from: c.n.b.d.d.s.c.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2521b {

    /* JADX INFO: renamed from: a */
    public static final C2518b f11381a = new C2518b("MetadataUtils");

    /* JADX INFO: renamed from: b */
    public static final String[] f11382b;

    /* JADX INFO: renamed from: c */
    public static final String f11383c;

    static {
        String[] strArr = {"Z", "+hh", "+hhmm", "+hh:mm"};
        f11382b = strArr;
        String strValueOf = String.valueOf(strArr[0]);
        f11383c = strValueOf.length() != 0 ? "yyyyMMdd'T'HHmmss".concat(strValueOf) : new String("yyyyMMdd'T'HHmmss");
    }

    /* JADX INFO: renamed from: a */
    public static void m5126a(List<C2708a> list, JSONArray jSONArray) {
        try {
            list.clear();
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    list.add(new C2708a(jSONArray.getJSONObject(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        } catch (JSONException unused2) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0045  */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x0118  */
    /* JADX WARN: Code duplicated, block: B:57:0x011b  */
    /* JADX WARN: Code duplicated, block: B:58:0x011e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static Calendar m5127b(String str) {
        String strSubstring;
        int iIndexOf;
        int i;
        String strSubstring2;
        char cCharAt;
        int length;
        String[] strArr;
        boolean z;
        String str2;
        if (TextUtils.isEmpty(str)) {
            f11381a.m5119a("Input string is empty or null", new Object[0]);
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            f11381a.m5119a("Input string is empty or null", new Object[0]);
        } else {
            try {
                strSubstring = str.substring(0, 8);
            } catch (IndexOutOfBoundsException e) {
                C2518b c2518b = f11381a;
                Log.i(c2518b.f11373a, c2518b.m5123e("Error extracting the date: %s", e.getMessage()));
                strSubstring = null;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                f11381a.m5119a("Invalid date format", new Object[0]);
                return null;
            }
            try {
                if (TextUtils.isEmpty(str)) {
                    f11381a.m5119a("string is empty or null", new Object[0]);
                } else {
                    iIndexOf = str.indexOf(84);
                    i = iIndexOf + 1;
                    if (iIndexOf != 8) {
                        try {
                            strSubstring2 = str.substring(i);
                            if (strSubstring2.length() != 6) {
                                cCharAt = strSubstring2.charAt(6);
                                if (cCharAt != '+' || cCharAt == '-') {
                                    length = strSubstring2.length();
                                    strArr = f11382b;
                                    if (length != strArr[1].length() + 6 || length == strArr[2].length() + 6 || length == strArr[3].length() + 6) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        strSubstring2 = strSubstring2.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                                    }
                                } else if (cCharAt == 'Z' && strSubstring2.length() == f11382b[0].length() + 6) {
                                    strSubstring2 = String.valueOf(strSubstring2.substring(0, strSubstring2.length() - 1)).concat("+0000");
                                }
                            }
                        } catch (IndexOutOfBoundsException e2) {
                            f11381a.m5119a("Error extracting the time substring: %s", e2.getMessage());
                        }
                        if (TextUtils.isEmpty(strSubstring2)) {
                            str2 = "yyyyMMdd";
                        } else {
                            String strValueOf = String.valueOf(strSubstring);
                            strSubstring = outline.m1587i(outline.m1558I(strSubstring2, strValueOf.length() + 1), strValueOf, "T", strSubstring2);
                            if (strSubstring2.length() == 6) {
                                str2 = "yyyyMMdd'T'HHmmss";
                            } else {
                                str2 = f11383c;
                            }
                        }
                        Calendar gregorianCalendar = GregorianCalendar.getInstance();
                        gregorianCalendar.setTime(new SimpleDateFormat(str2).parse(strSubstring));
                        return gregorianCalendar;
                    }
                    f11381a.m5119a("T delimeter is not found", new Object[0]);
                }
                gregorianCalendar.setTime(new SimpleDateFormat(str2).parse(strSubstring));
                return gregorianCalendar;
            } catch (ParseException e3) {
                f11381a.m5119a("Error parsing string: %s", e3.getMessage());
                return null;
            }
            strSubstring2 = null;
            if (TextUtils.isEmpty(strSubstring2)) {
                String strValueOf2 = String.valueOf(strSubstring);
                strSubstring = outline.m1587i(outline.m1558I(strSubstring2, strValueOf2.length() + 1), strValueOf2, "T", strSubstring2);
                if (strSubstring2.length() == 6) {
                    str2 = "yyyyMMdd'T'HHmmss";
                } else {
                    str2 = f11383c;
                }
            } else {
                str2 = "yyyyMMdd";
            }
            Calendar gregorianCalendar2 = GregorianCalendar.getInstance();
        }
        strSubstring = null;
        if (TextUtils.isEmpty(strSubstring)) {
            f11381a.m5119a("Invalid date format", new Object[0]);
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            f11381a.m5119a("string is empty or null", new Object[0]);
        } else {
            iIndexOf = str.indexOf(84);
            i = iIndexOf + 1;
            if (iIndexOf != 8) {
                strSubstring2 = str.substring(i);
                if (strSubstring2.length() != 6) {
                    cCharAt = strSubstring2.charAt(6);
                    if (cCharAt != '+') {
                        length = strSubstring2.length();
                        strArr = f11382b;
                        if (length != strArr[1].length() + 6) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (z) {
                            strSubstring2 = strSubstring2.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                        }
                    } else {
                        length = strSubstring2.length();
                        strArr = f11382b;
                        if (length != strArr[1].length() + 6) {
                            z = true;
                        } else {
                            z = true;
                        }
                        if (z) {
                            strSubstring2 = strSubstring2.replaceAll("([\\+\\-]\\d\\d):(\\d\\d)", "$1$2");
                        }
                    }
                }
                if (TextUtils.isEmpty(strSubstring2)) {
                    String strValueOf3 = String.valueOf(strSubstring);
                    strSubstring = outline.m1587i(outline.m1558I(strSubstring2, strValueOf3.length() + 1), strValueOf3, "T", strSubstring2);
                    if (strSubstring2.length() == 6) {
                        str2 = "yyyyMMdd'T'HHmmss";
                    } else {
                        str2 = f11383c;
                    }
                } else {
                    str2 = "yyyyMMdd";
                }
                Calendar gregorianCalendar3 = GregorianCalendar.getInstance();
                gregorianCalendar3.setTime(new SimpleDateFormat(str2).parse(strSubstring));
                return gregorianCalendar3;
            }
            f11381a.m5119a("T delimeter is not found", new Object[0]);
        }
        strSubstring2 = null;
        if (TextUtils.isEmpty(strSubstring2)) {
            String strValueOf4 = String.valueOf(strSubstring);
            strSubstring = outline.m1587i(outline.m1558I(strSubstring2, strValueOf4.length() + 1), strValueOf4, "T", strSubstring2);
            if (strSubstring2.length() == 6) {
                str2 = "yyyyMMdd'T'HHmmss";
            } else {
                str2 = f11383c;
            }
        } else {
            str2 = "yyyyMMdd";
        }
        Calendar gregorianCalendar4 = GregorianCalendar.getInstance();
        gregorianCalendar4.setTime(new SimpleDateFormat(str2).parse(strSubstring));
        return gregorianCalendar4;
    }
}
