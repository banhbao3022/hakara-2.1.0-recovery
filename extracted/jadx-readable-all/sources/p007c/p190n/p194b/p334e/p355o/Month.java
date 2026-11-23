package p007c.p190n.p194b.p334e.p355o;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: renamed from: c.n.b.e.o.r, reason: use source file name */
/* JADX INFO: compiled from: Month.java */
/* JADX INFO: loaded from: classes.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final Calendar f25289f;

    /* JADX INFO: renamed from: g */
    public final int f25290g;

    /* JADX INFO: renamed from: h */
    public final int f25291h;

    /* JADX INFO: renamed from: i */
    public final int f25292i;

    /* JADX INFO: renamed from: j */
    public final int f25293j;

    /* JADX INFO: renamed from: k */
    public final long f25294k;

    /* JADX INFO: renamed from: l */
    public String f25295l;

    /* JADX INFO: renamed from: c.n.b.e.o.r$a */
    /* JADX INFO: compiled from: Month.java */
    public static class a implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        public Month createFromParcel(Parcel parcel) {
            return Month.m11235h(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarM11252b = UtcDates.m11252b(calendar);
        this.f25289f = calendarM11252b;
        this.f25290g = calendarM11252b.get(2);
        this.f25291h = calendarM11252b.get(1);
        this.f25292i = calendarM11252b.getMaximum(7);
        this.f25293j = calendarM11252b.getActualMaximum(5);
        this.f25294k = calendarM11252b.getTimeInMillis();
    }

    /* JADX INFO: renamed from: h */
    public static Month m11235h(int i, int i2) {
        Calendar calendarM11255e = UtcDates.m11255e();
        calendarM11255e.set(1, i);
        calendarM11255e.set(2, i2);
        return new Month(calendarM11255e);
    }

    /* JADX INFO: renamed from: l */
    public static Month m11236l(long j2) {
        Calendar calendarM11255e = UtcDates.m11255e();
        calendarM11255e.setTimeInMillis(j2);
        return new Month(calendarM11255e);
    }

    /* JADX INFO: renamed from: A */
    public Month m11237A(int i) {
        Calendar calendarM11252b = UtcDates.m11252b(this.f25289f);
        calendarM11252b.add(2, i);
        return new Month(calendarM11252b);
    }

    /* JADX INFO: renamed from: B */
    public int m11238B(Month month) {
        if (!(this.f25289f instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (month.f25290g - this.f25290g) + ((month.f25291h - this.f25291h) * 12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f25290g == month.f25290g && this.f25291h == month.f25291h;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(Month month) {
        return this.f25289f.compareTo(month.f25289f);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f25290g), Integer.valueOf(this.f25291h)});
    }

    /* JADX INFO: renamed from: u */
    public int m11240u() {
        int firstDayOfWeek = this.f25289f.get(7) - this.f25289f.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f25292i : firstDayOfWeek;
    }

    /* JADX INFO: renamed from: w */
    public String m11241w(Context context) {
        if (this.f25295l == null) {
            long timeInMillis = this.f25289f.getTimeInMillis();
            this.f25295l = DateUtils.formatDateTime(context, timeInMillis - ((long) TimeZone.getDefault().getOffset(timeInMillis)), 36);
        }
        return this.f25295l;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f25291h);
        parcel.writeInt(this.f25290g);
    }
}
