package p007c.p165l.p183m0.p185c;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: c.l.m0.c.h, reason: use source file name */
/* JADX INFO: compiled from: ShareMediaContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class ShareMediaContent extends ShareContent<ShareMediaContent, ?> {
    public static final Parcelable.Creator<ShareMediaContent> CREATOR = new a();

    /* JADX INFO: renamed from: l */
    public final List<ShareMedia> f5275l;

    /* JADX INFO: renamed from: c.l.m0.c.h$a */
    /* JADX INFO: compiled from: ShareMediaContent.java */
    public static class a implements Parcelable.Creator<ShareMediaContent> {
        @Override // android.os.Parcelable.Creator
        public ShareMediaContent createFromParcel(Parcel parcel) {
            return new ShareMediaContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ShareMediaContent[] newArray(int i) {
            return new ShareMediaContent[i];
        }
    }

    public ShareMediaContent(Parcel parcel) {
        super(parcel);
        this.f5275l = Arrays.asList((ShareMedia[]) parcel.readParcelableArray(ShareMedia.class.getClassLoader()));
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelableArray((ShareMedia[]) this.f5275l.toArray(), i);
    }
}
