package p007c.p165l.p183m0.p185c;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.l.m0.c.e, reason: use source file name */
/* JADX INFO: compiled from: ShareHashtag.java */
/* JADX INFO: loaded from: classes.dex */
public class ShareHashtag implements Parcelable {
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final String f5267f;

    /* JADX INFO: renamed from: c.l.m0.c.e$a */
    /* JADX INFO: compiled from: ShareHashtag.java */
    public static class a implements Parcelable.Creator<ShareHashtag> {
        @Override // android.os.Parcelable.Creator
        public ShareHashtag createFromParcel(Parcel parcel) {
            return new ShareHashtag(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ShareHashtag[] newArray(int i) {
            return new ShareHashtag[i];
        }
    }

    /* JADX INFO: renamed from: c.l.m0.c.e$b */
    /* JADX INFO: compiled from: ShareHashtag.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public String f5268a;
    }

    public ShareHashtag(b bVar, a aVar) {
        this.f5267f = bVar.f5268a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5267f);
    }

    public ShareHashtag(Parcel parcel) {
        this.f5267f = parcel.readString();
    }
}
