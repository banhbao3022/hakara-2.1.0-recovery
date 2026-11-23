package p007c.p190n.p194b.p334e.p355o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.e.o.a, reason: use source file name */
/* JADX INFO: compiled from: CalendarConstraints.java */
/* JADX INFO: loaded from: classes.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final Month f25200f;

    /* JADX INFO: renamed from: g */
    public final Month f25201g;

    /* JADX INFO: renamed from: h */
    public final c f25202h;

    /* JADX INFO: renamed from: i */
    public Month f25203i;

    /* JADX INFO: renamed from: j */
    public final int f25204j;

    /* JADX INFO: renamed from: k */
    public final int f25205k;

    /* JADX INFO: renamed from: c.n.b.e.o.a$a */
    /* JADX INFO: compiled from: CalendarConstraints.java */
    public static class a implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    /* JADX INFO: renamed from: c.n.b.e.o.a$c */
    /* JADX INFO: compiled from: CalendarConstraints.java */
    public interface c extends Parcelable {
        /* JADX INFO: renamed from: x */
        boolean mo11210x(long j2);
    }

    public CalendarConstraints(Month month, Month month2, c cVar, Month month3, a aVar) {
        this.f25200f = month;
        this.f25201g = month2;
        this.f25203i = month3;
        this.f25202h = cVar;
        if (month3 != null && month.f25289f.compareTo(month3.f25289f) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.f25289f.compareTo(month2.f25289f) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f25205k = month.m11238B(month2) + 1;
        this.f25204j = (month2.f25291h - month.f25291h) + 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f25200f.equals(calendarConstraints.f25200f) && this.f25201g.equals(calendarConstraints.f25201g) && Objects.equals(this.f25203i, calendarConstraints.f25203i) && this.f25202h.equals(calendarConstraints.f25202h);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f25200f, this.f25201g, this.f25203i, this.f25202h});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f25200f, 0);
        parcel.writeParcelable(this.f25201g, 0);
        parcel.writeParcelable(this.f25203i, 0);
        parcel.writeParcelable(this.f25202h, 0);
    }

    /* JADX INFO: renamed from: c.n.b.e.o.a$b */
    /* JADX INFO: compiled from: CalendarConstraints.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final long f25206a = UtcDates.m11251a(Month.m11235h(1900, 0).f25294k);

        /* JADX INFO: renamed from: b */
        public static final long f25207b = UtcDates.m11251a(Month.m11235h(2100, 11).f25294k);

        /* JADX INFO: renamed from: c */
        public long f25208c;

        /* JADX INFO: renamed from: d */
        public long f25209d;

        /* JADX INFO: renamed from: e */
        public Long f25210e;

        /* JADX INFO: renamed from: f */
        public c f25211f;

        public b() {
            this.f25208c = f25206a;
            this.f25209d = f25207b;
            this.f25211f = new DateValidatorPointForward(Long.MIN_VALUE);
        }

        public b(CalendarConstraints calendarConstraints) {
            this.f25208c = f25206a;
            this.f25209d = f25207b;
            this.f25211f = new DateValidatorPointForward(Long.MIN_VALUE);
            this.f25208c = calendarConstraints.f25200f.f25294k;
            this.f25209d = calendarConstraints.f25201g.f25294k;
            this.f25210e = Long.valueOf(calendarConstraints.f25203i.f25294k);
            this.f25211f = calendarConstraints.f25202h;
        }
    }
}
