package p007c.p165l.p183m0.p185c;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.l.m0.c.j, reason: use source file name */
/* JADX INFO: compiled from: ShareMessengerGenericTemplateContent.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class ShareMessengerGenericTemplateContent extends ShareContent<ShareMessengerGenericTemplateContent, ?> {
    public static final Parcelable.Creator<ShareMessengerGenericTemplateContent> CREATOR = new a();

    /* JADX INFO: renamed from: l */
    public final boolean f5277l;

    /* JADX INFO: renamed from: m */
    public final b f5278m;

    /* JADX INFO: renamed from: n */
    public final ShareMessengerGenericTemplateElement f5279n;

    /* JADX INFO: renamed from: c.l.m0.c.j$a */
    /* JADX INFO: compiled from: ShareMessengerGenericTemplateContent.java */
    public static class a implements Parcelable.Creator<ShareMessengerGenericTemplateContent> {
        @Override // android.os.Parcelable.Creator
        public ShareMessengerGenericTemplateContent createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ShareMessengerGenericTemplateContent[] newArray(int i) {
            return new ShareMessengerGenericTemplateContent[i];
        }
    }

    /* JADX INFO: renamed from: c.l.m0.c.j$b */
    /* JADX INFO: compiled from: ShareMessengerGenericTemplateContent.java */
    public enum b {
        HORIZONTAL,
        SQUARE
    }

    public ShareMessengerGenericTemplateContent(Parcel parcel) {
        super(parcel);
        this.f5277l = parcel.readByte() != 0;
        this.f5278m = (b) parcel.readSerializable();
        this.f5279n = (ShareMessengerGenericTemplateElement) parcel.readParcelable(ShareMessengerGenericTemplateElement.class.getClassLoader());
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f5277l ? (byte) 1 : (byte) 0);
        parcel.writeSerializable(this.f5278m);
        parcel.writeParcelable(this.f5279n, i);
    }
}
