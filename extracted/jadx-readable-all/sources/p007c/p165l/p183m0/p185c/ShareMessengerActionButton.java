package p007c.p165l.p183m0.p185c;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.l.m0.c.i, reason: use source file name */
/* JADX INFO: compiled from: ShareMessengerActionButton.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ShareMessengerActionButton implements Parcelable {

    /* JADX INFO: renamed from: f */
    public final String f5276f;

    public ShareMessengerActionButton(Parcel parcel) {
        this.f5276f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5276f);
    }
}
