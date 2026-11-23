package p007c.p165l.p183m0.p185c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.l.m0.c.w, reason: use source file name */
/* JADX INFO: compiled from: ShareVideoContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class ShareVideoContent extends ShareContent<ShareVideoContent, ?> implements Parcelable {
    public static final Parcelable.Creator<ShareVideoContent> CREATOR = new a();

    /* JADX INFO: renamed from: l */
    public final String f5326l;

    /* JADX INFO: renamed from: m */
    public final String f5327m;

    /* JADX INFO: renamed from: n */
    public final SharePhoto f5328n;

    /* JADX INFO: renamed from: o */
    public final ShareVideo f5329o;

    /* JADX INFO: renamed from: c.l.m0.c.w$a */
    /* JADX INFO: compiled from: ShareVideoContent.java */
    public static class a implements Parcelable.Creator<ShareVideoContent> {
        @Override // android.os.Parcelable.Creator
        public ShareVideoContent createFromParcel(Parcel parcel) {
            return new ShareVideoContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ShareVideoContent[] newArray(int i) {
            return new ShareVideoContent[i];
        }
    }

    public ShareVideoContent(Parcel parcel) {
        super(parcel);
        this.f5326l = parcel.readString();
        this.f5327m = parcel.readString();
        SharePhoto.b bVarM2653b = new SharePhoto.b().m2653b((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        if (bVarM2653b.f5315c == null && bVarM2653b.f5314b == null) {
            this.f5328n = null;
        } else {
            this.f5328n = bVarM2653b.m2652a();
        }
        ShareVideo.b bVar = new ShareVideo.b();
        ShareVideo shareVideo = (ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader());
        if (shareVideo != null) {
            bVar.f5274a.putAll(new Bundle(shareVideo.f5273f));
            bVar.f5325b = shareVideo.f5324g;
        }
        this.f5329o = new ShareVideo(bVar, null);
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f5326l);
        parcel.writeString(this.f5327m);
        parcel.writeParcelable(this.f5328n, 0);
        parcel.writeParcelable(this.f5329o, 0);
    }
}
