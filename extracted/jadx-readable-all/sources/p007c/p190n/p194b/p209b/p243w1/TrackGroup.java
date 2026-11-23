package p007c.p190n.p194b.p209b.p243w1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p263z1.C2096e;

/* JADX INFO: renamed from: c.n.b.b.w1.q0, reason: use source file name */
/* JADX INFO: compiled from: TrackGroup.java */
/* JADX INFO: loaded from: classes.dex */
public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final int f9064f;

    /* JADX INFO: renamed from: g */
    public final Format[] f9065g;

    /* JADX INFO: renamed from: h */
    public int f9066h;

    /* JADX INFO: renamed from: c.n.b.b.w1.q0$a */
    /* JADX INFO: compiled from: TrackGroup.java */
    public class a implements Parcelable.Creator<TrackGroup> {
        @Override // android.os.Parcelable.Creator
        public TrackGroup createFromParcel(Parcel parcel) {
            return new TrackGroup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public TrackGroup[] newArray(int i) {
            return new TrackGroup[i];
        }
    }

    public TrackGroup(Format... formatArr) {
        C2096e.m4570f(formatArr.length > 0);
        this.f9065g = formatArr;
        this.f9064f = formatArr.length;
    }

    /* JADX INFO: renamed from: a */
    public int m4192a(Format format) {
        int i = 0;
        while (true) {
            Format[] formatArr = this.f9065g;
            if (i >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i]) {
                return i;
            }
            i++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroup.class != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        return this.f9064f == trackGroup.f9064f && Arrays.equals(this.f9065g, trackGroup.f9065g);
    }

    public int hashCode() {
        if (this.f9066h == 0) {
            this.f9066h = 527 + Arrays.hashCode(this.f9065g);
        }
        return this.f9066h;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9064f);
        for (int i2 = 0; i2 < this.f9064f; i2++) {
            parcel.writeParcelable(this.f9065g[i2], 0);
        }
    }

    public TrackGroup(Parcel parcel) {
        int i = parcel.readInt();
        this.f9064f = i;
        this.f9065g = new Format[i];
        for (int i2 = 0; i2 < this.f9064f; i2++) {
            this.f9065g[i2] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }
}
