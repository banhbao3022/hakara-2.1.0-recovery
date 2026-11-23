package p007c.p165l.p183m0.p185c;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.l.m0.c.v, reason: use source file name */
/* JADX INFO: compiled from: ShareVideo.java */
/* JADX INFO: loaded from: classes.dex */
public final class ShareVideo extends ShareMedia {
    public static final Parcelable.Creator<ShareVideo> CREATOR = new a();

    /* JADX INFO: renamed from: g */
    public final Uri f5324g;

    /* JADX INFO: renamed from: c.l.m0.c.v$a */
    /* JADX INFO: compiled from: ShareVideo.java */
    public static class a implements Parcelable.Creator<ShareVideo> {
        @Override // android.os.Parcelable.Creator
        public ShareVideo createFromParcel(Parcel parcel) {
            return new ShareVideo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ShareVideo[] newArray(int i) {
            return new ShareVideo[i];
        }
    }

    /* JADX INFO: renamed from: c.l.m0.c.v$b */
    /* JADX INFO: compiled from: ShareVideo.java */
    public static final class b extends ShareMedia.a<ShareVideo, b> {

        /* JADX INFO: renamed from: b */
        public Uri f5325b;
    }

    public ShareVideo(b bVar, a aVar) {
        super(bVar);
        this.f5324g = bVar.f5325b;
    }

    @Override // p007c.p165l.p183m0.p185c.ShareMedia
    /* JADX INFO: renamed from: a */
    public int mo2648a() {
        return 2;
    }

    @Override // p007c.p165l.p183m0.p185c.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p007c.p165l.p183m0.p185c.ShareMedia, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f5273f);
        parcel.writeParcelable(this.f5324g, 0);
    }

    public ShareVideo(Parcel parcel) {
        super(parcel);
        this.f5324g = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
