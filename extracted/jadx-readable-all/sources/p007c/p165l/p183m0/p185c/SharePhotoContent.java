package p007c.p165l.p183m0.p185c;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: c.l.m0.c.t, reason: use source file name */
/* JADX INFO: compiled from: SharePhotoContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class SharePhotoContent extends ShareContent<SharePhotoContent, b> {
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new a();

    /* JADX INFO: renamed from: l */
    public final List<SharePhoto> f5318l;

    /* JADX INFO: renamed from: c.l.m0.c.t$a */
    /* JADX INFO: compiled from: SharePhotoContent.java */
    public static class a implements Parcelable.Creator<SharePhotoContent> {
        @Override // android.os.Parcelable.Creator
        public SharePhotoContent createFromParcel(Parcel parcel) {
            return new SharePhotoContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public SharePhotoContent[] newArray(int i) {
            return new SharePhotoContent[i];
        }
    }

    /* JADX INFO: renamed from: c.l.m0.c.t$b */
    /* JADX INFO: compiled from: SharePhotoContent.java */
    public static class b extends ShareContent.a<SharePhotoContent, b> {

        /* JADX INFO: renamed from: g */
        public final List<SharePhoto> f5319g = new ArrayList();

        /* JADX INFO: renamed from: a */
        public b m2654a(List<SharePhoto> list) {
            if (list != null) {
                for (SharePhoto sharePhoto : list) {
                    if (sharePhoto != null) {
                        this.f5319g.add(new SharePhoto.b().m2653b(sharePhoto).m2652a());
                    }
                }
            }
            return this;
        }
    }

    public SharePhotoContent(Parcel parcel) {
        super(parcel);
        Parcelable[] parcelableArray = parcel.readParcelableArray(ShareMedia.class.getClassLoader());
        ArrayList<ShareMedia> arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((ShareMedia) parcelable);
        }
        ArrayList arrayList2 = new ArrayList();
        for (ShareMedia shareMedia : arrayList) {
            if (shareMedia instanceof SharePhoto) {
                arrayList2.add((SharePhoto) shareMedia);
            }
        }
        this.f5318l = Collections.unmodifiableList(arrayList2);
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        List<SharePhoto> list = this.f5318l;
        ShareMedia[] shareMediaArr = new ShareMedia[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            shareMediaArr[i2] = list.get(i2);
        }
        parcel.writeParcelableArray(shareMediaArr, i);
    }
}
