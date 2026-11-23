package p007c.p165l.p183m0.p185c;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.l.m0.c.m, reason: use source file name */
/* JADX INFO: compiled from: ShareMessengerOpenGraphMusicTemplateContent.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class ShareMessengerOpenGraphMusicTemplateContent extends ShareContent<ShareMessengerOpenGraphMusicTemplateContent, ?> {
    public static final Parcelable.Creator<ShareMessengerOpenGraphMusicTemplateContent> CREATOR = new a();

    /* JADX INFO: renamed from: l */
    public final Uri f5295l;

    /* JADX INFO: renamed from: m */
    public final ShareMessengerActionButton f5296m;

    /* JADX INFO: renamed from: c.l.m0.c.m$a */
    /* JADX INFO: compiled from: ShareMessengerOpenGraphMusicTemplateContent.java */
    public static class a implements Parcelable.Creator<ShareMessengerOpenGraphMusicTemplateContent> {
        @Override // android.os.Parcelable.Creator
        public ShareMessengerOpenGraphMusicTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerOpenGraphMusicTemplateContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ShareMessengerOpenGraphMusicTemplateContent[] newArray(int i) {
            return new ShareMessengerOpenGraphMusicTemplateContent[i];
        }
    }

    public ShareMessengerOpenGraphMusicTemplateContent(Parcel parcel) {
        super(parcel);
        this.f5295l = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f5296m = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f5295l, i);
        parcel.writeParcelable(this.f5296m, i);
    }
}
