package p007c.p165l.p183m0.p185c;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.l.m0.c.k, reason: use source file name */
/* JADX INFO: compiled from: ShareMessengerGenericTemplateElement.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class ShareMessengerGenericTemplateElement implements Parcelable {
    public static final Parcelable.Creator<ShareMessengerGenericTemplateElement> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final String f5283f;

    /* JADX INFO: renamed from: g */
    public final String f5284g;

    /* JADX INFO: renamed from: h */
    public final Uri f5285h;

    /* JADX INFO: renamed from: i */
    public final ShareMessengerActionButton f5286i;

    /* JADX INFO: renamed from: j */
    public final ShareMessengerActionButton f5287j;

    /* JADX INFO: renamed from: c.l.m0.c.k$a */
    /* JADX INFO: compiled from: ShareMessengerGenericTemplateElement.java */
    public static class a implements Parcelable.Creator<ShareMessengerGenericTemplateElement> {
        @Override // android.os.Parcelable.Creator
        public ShareMessengerGenericTemplateElement createFromParcel(Parcel parcel) {
            return new ShareMessengerGenericTemplateElement(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ShareMessengerGenericTemplateElement[] newArray(int i) {
            return new ShareMessengerGenericTemplateElement[i];
        }
    }

    public ShareMessengerGenericTemplateElement(Parcel parcel) {
        this.f5283f = parcel.readString();
        this.f5284g = parcel.readString();
        this.f5285h = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f5286i = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
        this.f5287j = (ShareMessengerActionButton) parcel.readParcelable(ShareMessengerActionButton.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5283f);
        parcel.writeString(this.f5284g);
        parcel.writeParcelable(this.f5285h, i);
        parcel.writeParcelable(this.f5286i, i);
        parcel.writeParcelable(this.f5287j, i);
    }
}
