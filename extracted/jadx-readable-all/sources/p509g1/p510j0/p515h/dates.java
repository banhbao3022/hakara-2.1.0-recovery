package p509g1.p510j0.p515h;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p477d1.p493x.p495c.Intrinsics2;
import p509g1.p510j0.Util9;

/* JADX INFO: renamed from: g1.j0.h.c, reason: use source file name */
/* JADX INFO: compiled from: dates.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class dates {

    /* JADX INFO: renamed from: a */
    public static final a f30282a = new a();

    /* JADX INFO: renamed from: b */
    public static final String[] f30283b;

    /* JADX INFO: renamed from: c */
    public static final DateFormat[] f30284c;

    /* JADX INFO: renamed from: g1.j0.h.c$a */
    /* JADX INFO: compiled from: dates.kt */
    public static final class a extends ThreadLocal<DateFormat> {
        @Override // java.lang.ThreadLocal
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(Util9.f30074e);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f30283b = strArr;
        f30284c = new DateFormat[strArr.length];
    }

    /* JADX INFO: renamed from: a */
    public static final Date m13476a(String str) {
        DateFormat dateFormat;
        Intrinsics2.m13090f(str, "$this$toHttpDateOrNull");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date date = f30282a.get().parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return date;
        }
        String[] strArr = f30283b;
        synchronized (strArr) {
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                DateFormat[] dateFormatArr = f30284c;
                DateFormat dateFormat2 = dateFormatArr[i];
                if (dateFormat2 == null) {
                    dateFormat = dateFormat2;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(f30283b[i], Locale.US);
                    simpleDateFormat.setTimeZone(Util9.f30074e);
                    dateFormatArr[i] = simpleDateFormat;
                    dateFormat = simpleDateFormat;
                }
                dateFormat = dateFormat2;
                parsePosition.setIndex(0);
                Date date2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return date2;
                }
            }
            return null;
        }
    }
}
