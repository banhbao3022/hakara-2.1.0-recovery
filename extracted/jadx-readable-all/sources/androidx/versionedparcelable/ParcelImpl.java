package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p636z0.p692g0.VersionedParcelParcel;
import p636z0.p692g0.VersionedParcelable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0191a();

    /* JADX INFO: renamed from: f */
    public final VersionedParcelable f1216f;

    /* JADX INFO: renamed from: androidx.versionedparcelable.ParcelImpl$a */
    public static class C0191a implements Parcelable.Creator<ParcelImpl> {
        @Override // android.os.Parcelable.Creator
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(VersionedParcelable versionedParcelable) {
        this.f1216f = versionedParcelable;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        new VersionedParcelParcel(parcel).m15644w(this.f1216f);
    }

    public ParcelImpl(Parcel parcel) {
        this.f1216f = new VersionedParcelParcel(parcel).m15636o();
    }
}
