package p007c.p165l.p183m0.p185c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.l.m0.c.p, reason: use source file name */
/* JADX INFO: compiled from: ShareOpenGraphContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class ShareOpenGraphContent extends ShareContent<ShareOpenGraphContent, ?> {
    public static final Parcelable.Creator<ShareOpenGraphContent> CREATOR = new a();

    /* JADX INFO: renamed from: l */
    public final ShareOpenGraphAction f5306l;

    /* JADX INFO: renamed from: m */
    public final String f5307m;

    /* JADX INFO: renamed from: c.l.m0.c.p$a */
    /* JADX INFO: compiled from: ShareOpenGraphContent.java */
    public static class a implements Parcelable.Creator<ShareOpenGraphContent> {
        @Override // android.os.Parcelable.Creator
        public ShareOpenGraphContent createFromParcel(Parcel parcel) {
            return new ShareOpenGraphContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ShareOpenGraphContent[] newArray(int i) {
            return new ShareOpenGraphContent[i];
        }
    }

    public ShareOpenGraphContent(Parcel parcel) {
        super(parcel);
        ShareOpenGraphAction.b bVar = new ShareOpenGraphAction.b();
        ShareOpenGraphAction shareOpenGraphAction = (ShareOpenGraphAction) parcel.readParcelable(ShareOpenGraphAction.class.getClassLoader());
        if (shareOpenGraphAction != null) {
            bVar.f5309a.putAll((Bundle) shareOpenGraphAction.f5308f.clone());
            bVar.f5309a.putString("og:type", shareOpenGraphAction.m2649c());
        }
        this.f5306l = new ShareOpenGraphAction(bVar, null);
        this.f5307m = parcel.readString();
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f5306l, 0);
        parcel.writeString(this.f5307m);
    }
}
