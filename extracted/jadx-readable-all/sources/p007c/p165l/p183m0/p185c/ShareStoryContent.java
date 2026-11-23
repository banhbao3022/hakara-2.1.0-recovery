package p007c.p165l.p183m0.p185c;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: c.l.m0.c.u, reason: use source file name */
/* JADX INFO: compiled from: ShareStoryContent.java */
/* JADX INFO: loaded from: classes.dex */
public final class ShareStoryContent extends ShareContent<ShareStoryContent, ?> {
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new a();

    /* JADX INFO: renamed from: l */
    public final ShareMedia f5320l;

    /* JADX INFO: renamed from: m */
    public final SharePhoto f5321m;

    /* JADX INFO: renamed from: n */
    public final List<String> f5322n;

    /* JADX INFO: renamed from: o */
    public final String f5323o;

    /* JADX INFO: renamed from: c.l.m0.c.u$a */
    /* JADX INFO: compiled from: ShareStoryContent.java */
    public static class a implements Parcelable.Creator<ShareStoryContent> {
        @Override // android.os.Parcelable.Creator
        public ShareStoryContent createFromParcel(Parcel parcel) {
            return new ShareStoryContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ShareStoryContent[] newArray(int i) {
            return new ShareStoryContent[i];
        }
    }

    public ShareStoryContent(Parcel parcel) {
        super(parcel);
        this.f5320l = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.f5321m = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f5322n = arrayList.isEmpty() ? null : Collections.unmodifiableList(arrayList);
        this.f5323o = parcel.readString();
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f5320l, 0);
        parcel.writeParcelable(this.f5321m, 0);
        parcel.writeStringList(this.f5322n);
        parcel.writeString(this.f5323o);
    }
}
