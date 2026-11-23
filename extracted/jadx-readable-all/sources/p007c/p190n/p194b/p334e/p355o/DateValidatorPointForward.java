package p007c.p190n.p194b.p334e.p355o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: c.n.b.e.o.e, reason: use source file name */
/* JADX INFO: compiled from: DateValidatorPointForward.java */
/* JADX INFO: loaded from: classes.dex */
public class DateValidatorPointForward implements CalendarConstraints.c {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final long f25230f;

    /* JADX INFO: renamed from: c.n.b.e.o.e$a */
    /* JADX INFO: compiled from: DateValidatorPointForward.java */
    public static class a implements Parcelable.Creator<DateValidatorPointForward> {
        @Override // android.os.Parcelable.Creator
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        public DateValidatorPointForward[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }
    }

    public DateValidatorPointForward(long j2) {
        this.f25230f = j2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f25230f == ((DateValidatorPointForward) obj).f25230f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f25230f)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f25230f);
    }

    @Override // p007c.p190n.p194b.p334e.p355o.CalendarConstraints.c
    /* JADX INFO: renamed from: x */
    public boolean mo11210x(long j2) {
        return j2 >= this.f25230f;
    }

    public DateValidatorPointForward(long j2, a aVar) {
        this.f25230f = j2;
    }
}
