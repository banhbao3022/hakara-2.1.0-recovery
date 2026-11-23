package p007c.p190n.p194b.p209b.p243w1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: c.n.b.b.w1.r0, reason: use source file name */
/* JADX INFO: compiled from: TrackGroupArray.java */
/* JADX INFO: loaded from: classes.dex */
public final class TrackGroupArray implements Parcelable {

    /* JADX INFO: renamed from: g */
    public final int f9068g;

    /* JADX INFO: renamed from: h */
    public final TrackGroup[] f9069h;

    /* JADX INFO: renamed from: i */
    public int f9070i;

    /* JADX INFO: renamed from: f */
    public static final TrackGroupArray f9067f = new TrackGroupArray(new TrackGroup[0]);
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new a();

    /* JADX INFO: renamed from: c.n.b.b.w1.r0$a */
    /* JADX INFO: compiled from: TrackGroupArray.java */
    public class a implements Parcelable.Creator<TrackGroupArray> {
        @Override // android.os.Parcelable.Creator
        public TrackGroupArray createFromParcel(Parcel parcel) {
            return new TrackGroupArray(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public TrackGroupArray[] newArray(int i) {
            return new TrackGroupArray[i];
        }
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.f9069h = trackGroupArr;
        this.f9068g = trackGroupArr.length;
    }

    /* JADX INFO: renamed from: a */
    public int m4193a(TrackGroup trackGroup) {
        for (int i = 0; i < this.f9068g; i++) {
            if (this.f9069h[i] == trackGroup) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        return this.f9068g == trackGroupArray.f9068g && Arrays.equals(this.f9069h, trackGroupArray.f9069h);
    }

    public int hashCode() {
        if (this.f9070i == 0) {
            this.f9070i = Arrays.hashCode(this.f9069h);
        }
        return this.f9070i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9068g);
        for (int i2 = 0; i2 < this.f9068g; i2++) {
            parcel.writeParcelable(this.f9069h[i2], 0);
        }
    }

    public TrackGroupArray(Parcel parcel) {
        int i = parcel.readInt();
        this.f9068g = i;
        this.f9069h = new TrackGroup[i];
        for (int i2 = 0; i2 < this.f9068g; i2++) {
            this.f9069h[i2] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }
}
