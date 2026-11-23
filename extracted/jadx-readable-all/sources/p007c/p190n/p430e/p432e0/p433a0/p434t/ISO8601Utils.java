package p007c.p190n.p430e.p432e0.p433a0.p434t;

import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: renamed from: c.n.e.e0.a0.t.a, reason: use source file name */
/* JADX INFO: compiled from: ISO8601Utils.java */
/* JADX INFO: loaded from: classes.dex */
public class ISO8601Utils {

    /* JADX INFO: renamed from: a */
    public static final TimeZone f27455a = TimeZone.getTimeZone("UTC");

    /* JADX INFO: renamed from: a */
    public static boolean m12269a(String str, int i, char c2) {
        return i < str.length() && str.charAt(i) == c2;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00e1 A[Catch: IllegalArgumentException -> 0x01d0, NumberFormatException -> 0x01d2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:37:0x009c, B:39:0x00a2, B:44:0x00af, B:46:0x00b6, B:57:0x00db, B:59:0x00e1, B:61:0x00e8, B:86:0x0197, B:66:0x00f4, B:67:0x010f, B:68:0x0110, B:72:0x012c, B:74:0x0139, B:77:0x0142, B:79:0x0161, B:82:0x0170, B:83:0x0192, B:85:0x0195, B:71:0x011b, B:88:0x01c8, B:89:0x01cf, B:50:0x00c6, B:51:0x00c9, B:45:0x00b2), top: B:105:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00e8 A[Catch: IllegalArgumentException -> 0x01d0, NumberFormatException -> 0x01d2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:37:0x009c, B:39:0x00a2, B:44:0x00af, B:46:0x00b6, B:57:0x00db, B:59:0x00e1, B:61:0x00e8, B:86:0x0197, B:66:0x00f4, B:67:0x010f, B:68:0x0110, B:72:0x012c, B:74:0x0139, B:77:0x0142, B:79:0x0161, B:82:0x0170, B:83:0x0192, B:85:0x0195, B:71:0x011b, B:88:0x01c8, B:89:0x01cf, B:50:0x00c6, B:51:0x00c9, B:45:0x00b2), top: B:105:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:70:0x011a  */
    /* JADX WARN: Code duplicated, block: B:71:0x011b A[Catch: IllegalArgumentException -> 0x01d0, NumberFormatException -> 0x01d2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:37:0x009c, B:39:0x00a2, B:44:0x00af, B:46:0x00b6, B:57:0x00db, B:59:0x00e1, B:61:0x00e8, B:86:0x0197, B:66:0x00f4, B:67:0x010f, B:68:0x0110, B:72:0x012c, B:74:0x0139, B:77:0x0142, B:79:0x0161, B:82:0x0170, B:83:0x0192, B:85:0x0195, B:71:0x011b, B:88:0x01c8, B:89:0x01cf, B:50:0x00c6, B:51:0x00c9, B:45:0x00b2), top: B:105:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0195 A[Catch: IllegalArgumentException -> 0x01d0, NumberFormatException -> 0x01d2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:37:0x009c, B:39:0x00a2, B:44:0x00af, B:46:0x00b6, B:57:0x00db, B:59:0x00e1, B:61:0x00e8, B:86:0x0197, B:66:0x00f4, B:67:0x010f, B:68:0x0110, B:72:0x012c, B:74:0x0139, B:77:0x0142, B:79:0x0161, B:82:0x0170, B:83:0x0192, B:85:0x0195, B:71:0x011b, B:88:0x01c8, B:89:0x01cf, B:50:0x00c6, B:51:0x00c9, B:45:0x00b2), top: B:105:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c8 A[Catch: IllegalArgumentException -> 0x01d0, NumberFormatException -> 0x01d2, IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, TryCatch #2 {IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException -> 0x01d4, blocks: (B:3:0x0004, B:5:0x0016, B:6:0x0018, B:8:0x0024, B:9:0x0026, B:11:0x0035, B:13:0x003b, B:17:0x0050, B:19:0x0060, B:20:0x0062, B:22:0x006e, B:23:0x0070, B:25:0x0076, B:29:0x0080, B:34:0x0090, B:36:0x0098, B:37:0x009c, B:39:0x00a2, B:44:0x00af, B:46:0x00b6, B:57:0x00db, B:59:0x00e1, B:61:0x00e8, B:86:0x0197, B:66:0x00f4, B:67:0x010f, B:68:0x0110, B:72:0x012c, B:74:0x0139, B:77:0x0142, B:79:0x0161, B:82:0x0170, B:83:0x0192, B:85:0x0195, B:71:0x011b, B:88:0x01c8, B:89:0x01cf, B:50:0x00c6, B:51:0x00c9, B:45:0x00b2), top: B:105:0x0004 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x011b, please report this as an issue */
    /* JADX INFO: renamed from: b */
    public static Date m12270b(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        int i;
        int iM12271c;
        int iM12271c2;
        int iM12271c3;
        int iM12271c4;
        int i2;
        char cCharAt;
        String strSubstring;
        int length;
        TimeZone timeZone;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i3 = index + 4;
            int iM12271c5 = m12271c(str, index, i3);
            if (m12269a(str, i3, '-')) {
                i3++;
            }
            int i4 = i3 + 2;
            int iM12271c6 = m12271c(str, i3, i4);
            if (m12269a(str, i4, '-')) {
                i4++;
            }
            int i5 = i4 + 2;
            int iM12271c7 = m12271c(str, i4, i5);
            boolean zM12269a = m12269a(str, i5, 'T');
            if (!zM12269a && str.length() <= i5) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iM12271c5, iM12271c6 - 1, iM12271c7);
                parsePosition.setIndex(i5);
                return gregorianCalendar.getTime();
            }
            if (zM12269a) {
                int i6 = i5 + 1;
                int i7 = i6 + 2;
                iM12271c4 = m12271c(str, i6, i7);
                if (m12269a(str, i7, ':')) {
                    i7++;
                }
                int i8 = i7 + 2;
                iM12271c = m12271c(str, i7, i8);
                if (m12269a(str, i8, ':')) {
                    i8++;
                }
                if (str.length() <= i8 || (cCharAt2 = str.charAt(i8)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i = iM12271c4;
                    i5 = i8;
                } else {
                    i2 = i8 + 2;
                    iM12271c3 = m12271c(str, i8, i2);
                    if (iM12271c3 > 59 && iM12271c3 < 63) {
                        iM12271c3 = 59;
                    }
                    if (m12269a(str, i2, '.')) {
                        int i9 = i2 + 1;
                        int length2 = i9 + 1;
                        while (true) {
                            if (length2 >= str.length()) {
                                length2 = str.length();
                                break;
                            }
                            char cCharAt3 = str.charAt(length2);
                            if (cCharAt3 < '0' || cCharAt3 > '9') {
                                break;
                                break;
                            }
                            length2++;
                        }
                        int iMin = Math.min(length2, i9 + 3);
                        iM12271c2 = m12271c(str, i9, iMin);
                        int i10 = iMin - i9;
                        if (i10 == 1) {
                            iM12271c2 *= 100;
                        } else if (i10 == 2) {
                            iM12271c2 *= 10;
                        }
                        i2 = length2;
                    } else {
                        iM12271c2 = 0;
                    }
                }
                if (str.length() > i2) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i2);
                if (cCharAt == 'Z') {
                    timeZone = f27455a;
                    length = i2 + 1;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i2);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i2 + strSubstring.length();
                    if (!"+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                        timeZone = f27455a;
                    } else {
                        String str3 = "GMT" + strSubstring;
                        TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                        String id = timeZone2.getID();
                        if (!id.equals(str3) && !id.replace(":", "").equals(str3)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iM12271c5);
                gregorianCalendar2.set(2, iM12271c6 - 1);
                gregorianCalendar2.set(5, iM12271c7);
                gregorianCalendar2.set(11, iM12271c4);
                gregorianCalendar2.set(12, iM12271c);
                gregorianCalendar2.set(13, iM12271c3);
                gregorianCalendar2.set(14, iM12271c2);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i = 0;
            iM12271c = 0;
            iM12271c2 = 0;
            iM12271c3 = 0;
            int i11 = i5;
            iM12271c4 = i;
            i2 = i11;
            if (str.length() > i2) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i2);
            if (cCharAt == 'Z') {
                timeZone = f27455a;
                length = i2 + 1;
            } else {
                if (cCharAt != '+') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i2);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i2 + strSubstring.length();
                if ("+0000".equals(strSubstring)) {
                    timeZone = f27455a;
                } else {
                    timeZone = f27455a;
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iM12271c5);
            gregorianCalendar3.set(2, iM12271c6 - 1);
            gregorianCalendar3.set(5, iM12271c7);
            gregorianCalendar3.set(11, iM12271c4);
            gregorianCalendar3.set(12, iM12271c);
            gregorianCalendar3.set(13, iM12271c3);
            gregorianCalendar3.set(14, iM12271c2);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IndexOutOfBoundsException | NumberFormatException | IllegalArgumentException e) {
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            String message = e.getMessage();
            if (message == null || message.isEmpty()) {
                StringBuilder sbM1556G = outline.m1556G("(");
                sbM1556G.append(e.getClass().getName());
                sbM1556G.append(")");
                message = sbM1556G.toString();
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m12271c(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int iDigit = Character.digit(str.charAt(i), 10);
            if (iDigit < 0) {
                StringBuilder sbM1556G = outline.m1556G("Invalid number: ");
                sbM1556G.append(str.substring(i, i2));
                throw new NumberFormatException(sbM1556G.toString());
            }
            i3 = -iDigit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int iDigit2 = Character.digit(str.charAt(i4), 10);
            if (iDigit2 < 0) {
                StringBuilder sbM1556G2 = outline.m1556G("Invalid number: ");
                sbM1556G2.append(str.substring(i, i2));
                throw new NumberFormatException(sbM1556G2.toString());
            }
            i3 = (i3 * 10) - iDigit2;
            i4 = i5;
        }
        return -i3;
    }
}
