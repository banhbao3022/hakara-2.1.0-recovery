package p007c.p165l.p183m0.p185c;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.l.m0.c.q, reason: use source file name */
/* JADX INFO: compiled from: ShareOpenGraphObject.java */
/* JADX INFO: loaded from: classes.dex */
public final class ShareOpenGraphObject extends ShareOpenGraphValueContainer<ShareOpenGraphObject, ?> {
    public static final Parcelable.Creator<ShareOpenGraphObject> CREATOR = new a();

    /* JADX INFO: renamed from: c.l.m0.c.q$a */
    /* JADX INFO: compiled from: ShareOpenGraphObject.java */
    public static class a implements Parcelable.Creator<ShareOpenGraphObject> {
        @Override // android.os.Parcelable.Creator
        public ShareOpenGraphObject createFromParcel(Parcel parcel) {
            return new ShareOpenGraphObject(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ShareOpenGraphObject[] newArray(int i) {
            return new ShareOpenGraphObject[i];
        }
    }

    public ShareOpenGraphObject(Parcel parcel) {
        super(parcel);
    }
}
