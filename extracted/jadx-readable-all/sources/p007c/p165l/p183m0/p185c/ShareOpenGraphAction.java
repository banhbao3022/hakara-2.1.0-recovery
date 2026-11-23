package p007c.p165l.p183m0.p185c;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.l.m0.c.o, reason: use source file name */
/* JADX INFO: compiled from: ShareOpenGraphAction.java */
/* JADX INFO: loaded from: classes.dex */
public final class ShareOpenGraphAction extends ShareOpenGraphValueContainer<ShareOpenGraphAction, b> {
    public static final Parcelable.Creator<ShareOpenGraphAction> CREATOR = new a();

    /* JADX INFO: renamed from: c.l.m0.c.o$a */
    /* JADX INFO: compiled from: ShareOpenGraphAction.java */
    public static class a implements Parcelable.Creator<ShareOpenGraphAction> {
        @Override // android.os.Parcelable.Creator
        public ShareOpenGraphAction createFromParcel(Parcel parcel) {
            return new ShareOpenGraphAction(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ShareOpenGraphAction[] newArray(int i) {
            return new ShareOpenGraphAction[i];
        }
    }

    /* JADX INFO: renamed from: c.l.m0.c.o$b */
    /* JADX INFO: compiled from: ShareOpenGraphAction.java */
    public static final class b extends ShareOpenGraphValueContainer.a<ShareOpenGraphAction, b> {
    }

    public ShareOpenGraphAction(b bVar, a aVar) {
        super(bVar);
    }

    /* JADX INFO: renamed from: c */
    public String m2649c() {
        return this.f5308f.getString("og:type");
    }

    public ShareOpenGraphAction(Parcel parcel) {
        super(parcel);
    }
}
