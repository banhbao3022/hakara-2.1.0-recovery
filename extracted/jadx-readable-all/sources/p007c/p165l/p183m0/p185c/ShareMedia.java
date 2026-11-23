package p007c.p165l.p183m0.p185c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.l.m0.c.g, reason: use source file name */
/* JADX INFO: compiled from: ShareMedia.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ShareMedia implements Parcelable {

    /* JADX INFO: renamed from: f */
    public final Bundle f5273f;

    /* JADX INFO: renamed from: c.l.m0.c.g$a */
    /* JADX INFO: compiled from: ShareMedia.java */
    public static abstract class a<M extends ShareMedia, B extends a> {

        /* JADX INFO: renamed from: a */
        public Bundle f5274a = new Bundle();
    }

    public ShareMedia(a aVar) {
        this.f5273f = new Bundle(aVar.f5274a);
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo2648a();

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f5273f);
    }

    public ShareMedia(Parcel parcel) {
        this.f5273f = parcel.readBundle();
    }
}
