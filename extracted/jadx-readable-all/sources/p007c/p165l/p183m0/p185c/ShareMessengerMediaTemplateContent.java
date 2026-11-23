package p007c.p165l.p183m0.p185c;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.l.m0.c.l, reason: use source file name */
/* JADX INFO: compiled from: ShareMessengerMediaTemplateContent.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class ShareMessengerMediaTemplateContent extends ShareContent<ShareMessengerMediaTemplateContent, ?> {
    public static final Parcelable.Creator<ShareMessengerMediaTemplateContent> CREATOR = new a();

    /* JADX INFO: renamed from: l */
    public final b f5288l;

    /* JADX INFO: renamed from: m */
    public final String f5289m;

    /* JADX INFO: renamed from: n */
    public final Uri f5290n;

    /* JADX INFO: renamed from: o */
    public final ShareMessengerActionButton f5291o;

    /* JADX INFO: renamed from: c.l.m0.c.l$a */
    /* JADX INFO: compiled from: ShareMessengerMediaTemplateContent.java */
    public static class a implements Parcelable.Creator<ShareMessengerMediaTemplateContent> {
        @Override // android.os.Parcelable.Creator
        public ShareMessengerMediaTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerMediaTemplateContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ShareMessengerMediaTemplateContent[] newArray(int i) {
            return new ShareMessengerMediaTemplateContent[i];
        }
    }

    /* JADX INFO: renamed from: c.l.m0.c.l$b */
    /* JADX INFO: compiled from: ShareMessengerMediaTemplateContent.java */
    public enum b {
        IMAGE,
        VIDEO
    }

    public ShareMessengerMediaTemplateContent(Parcel parcel) {
        super(parcel);
        this.f5288l = (b) parcel.readSerializable();
        this.f5289m = parcel.readString();
        this.f5290n = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f5291o = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.f5288l);
        parcel.writeString(this.f5289m);
        parcel.writeParcelable(this.f5290n, i);
        parcel.writeParcelable(this.f5291o, i);
    }
}
