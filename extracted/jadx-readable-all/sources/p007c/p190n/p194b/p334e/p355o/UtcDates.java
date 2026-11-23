package p007c.p190n.p194b.p334e.p355o;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: c.n.b.e.o.z, reason: use source file name */
/* JADX INFO: compiled from: UtcDates.java */
/* JADX INFO: loaded from: classes.dex */
public class UtcDates {

    /* JADX INFO: renamed from: a */
    public static AtomicReference<TimeSource> f25315a = new AtomicReference<>();

    /* JADX INFO: renamed from: a */
    public static long m11251a(long j2) {
        Calendar calendarM11255e = m11255e();
        calendarM11255e.setTimeInMillis(j2);
        return m11252b(calendarM11255e).getTimeInMillis();
    }

    /* JADX INFO: renamed from: b */
    public static Calendar m11252b(Calendar calendar) {
        Calendar calendarM11256f = m11256f(calendar);
        Calendar calendarM11255e = m11255e();
        calendarM11255e.set(calendarM11256f.get(1), calendarM11256f.get(2), calendarM11256f.get(5));
        return calendarM11255e;
    }

    /* JADX INFO: renamed from: c */
    public static TimeZone m11253c() {
        return TimeZone.getTimeZone("UTC");
    }

    /* JADX INFO: renamed from: d */
    public static Calendar m11254d() {
        TimeSource timeSource = f25315a.get();
        if (timeSource == null) {
            timeSource = TimeSource.f25312a;
        }
        TimeZone timeZone = timeSource.f25314c;
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = timeSource.f25313b;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(m11253c());
        return calendar;
    }

    /* JADX INFO: renamed from: e */
    public static Calendar m11255e() {
        return m11256f(null);
    }

    /* JADX INFO: renamed from: f */
    public static Calendar m11256f(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(m11253c());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
