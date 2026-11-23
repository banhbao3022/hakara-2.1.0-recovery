package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0038a();

    /* JADX INFO: renamed from: f */
    public int f105f;

    /* JADX INFO: renamed from: g */
    public int f106g;

    /* JADX INFO: renamed from: h */
    public int f107h;

    /* JADX INFO: renamed from: i */
    public int f108i;

    /* JADX INFO: renamed from: j */
    public int f109j;

    /* JADX INFO: renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    public class C0038a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
        this.f105f = i;
        this.f106g = i2;
        this.f107h = i3;
        this.f108i = i4;
        this.f109j = i5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f105f);
        parcel.writeInt(this.f107h);
        parcel.writeInt(this.f108i);
        parcel.writeInt(this.f109j);
        parcel.writeInt(this.f106g);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f105f = parcel.readInt();
        this.f107h = parcel.readInt();
        this.f108i = parcel.readInt();
        this.f109j = parcel.readInt();
        this.f106g = parcel.readInt();
    }
}
