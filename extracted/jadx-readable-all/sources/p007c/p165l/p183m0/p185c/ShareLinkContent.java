package p007c.p165l.p183m0.p185c;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.l.m0.c.f, reason: use source file name */
/* JADX INFO: compiled from: ShareLinkContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class ShareLinkContent extends ShareContent<ShareLinkContent, b> {
    public static final Parcelable.Creator<ShareLinkContent> CREATOR = new a();

    /* JADX INFO: renamed from: l */
    @Deprecated
    public final String f5269l;

    /* JADX INFO: renamed from: m */
    @Deprecated
    public final String f5270m;

    /* JADX INFO: renamed from: n */
    @Deprecated
    public final Uri f5271n;

    /* JADX INFO: renamed from: o */
    public final String f5272o;

    /* JADX INFO: renamed from: c.l.m0.c.f$a */
    /* JADX INFO: compiled from: ShareLinkContent.java */
    public static class a implements Parcelable.Creator<ShareLinkContent> {
        @Override // android.os.Parcelable.Creator
        public ShareLinkContent createFromParcel(Parcel parcel) {
            return new ShareLinkContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ShareLinkContent[] newArray(int i) {
            return new ShareLinkContent[i];
        }
    }

    /* JADX INFO: renamed from: c.l.m0.c.f$b */
    /* JADX INFO: compiled from: ShareLinkContent.java */
    public static final class b extends ShareContent.a<ShareLinkContent, b> {
    }

    public ShareLinkContent(b bVar, a aVar) {
        super(bVar);
        this.f5269l = null;
        this.f5270m = null;
        this.f5271n = null;
        this.f5272o = null;
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f5269l);
        parcel.writeString(this.f5270m);
        parcel.writeParcelable(this.f5271n, 0);
        parcel.writeString(this.f5272o);
    }

    public ShareLinkContent(Parcel parcel) {
        super(parcel);
        this.f5269l = parcel.readString();
        this.f5270m = parcel.readString();
        this.f5271n = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f5272o = parcel.readString();
    }
}
