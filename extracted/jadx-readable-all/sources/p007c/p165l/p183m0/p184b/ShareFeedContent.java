package p007c.p165l.p183m0.p184b;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p165l.p183m0.p185c.ShareContent;

/* JADX INFO: renamed from: c.l.m0.b.n, reason: use source file name */
/* JADX INFO: compiled from: ShareFeedContent.java */
/* JADX INFO: loaded from: classes.dex */
public class ShareFeedContent extends ShareContent<ShareFeedContent, ?> {
    public static final Parcelable.Creator<ShareFeedContent> CREATOR = new a();

    /* JADX INFO: renamed from: l */
    public final String f5226l;

    /* JADX INFO: renamed from: m */
    public final String f5227m;

    /* JADX INFO: renamed from: n */
    public final String f5228n;

    /* JADX INFO: renamed from: o */
    public final String f5229o;

    /* JADX INFO: renamed from: p */
    public final String f5230p;

    /* JADX INFO: renamed from: q */
    public final String f5231q;

    /* JADX INFO: renamed from: r */
    public final String f5232r;

    /* JADX INFO: renamed from: c.l.m0.b.n$a */
    /* JADX INFO: compiled from: ShareFeedContent.java */
    public static class a implements Parcelable.Creator<ShareFeedContent> {
        @Override // android.os.Parcelable.Creator
        public ShareFeedContent createFromParcel(Parcel parcel) {
            return new ShareFeedContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ShareFeedContent[] newArray(int i) {
            return new ShareFeedContent[i];
        }
    }

    public ShareFeedContent(Parcel parcel) {
        super(parcel);
        this.f5226l = parcel.readString();
        this.f5227m = parcel.readString();
        this.f5228n = parcel.readString();
        this.f5229o = parcel.readString();
        this.f5230p = parcel.readString();
        this.f5231q = parcel.readString();
        this.f5232r = parcel.readString();
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f5226l);
        parcel.writeString(this.f5227m);
        parcel.writeString(this.f5228n);
        parcel.writeString(this.f5229o);
        parcel.writeString(this.f5230p);
        parcel.writeString(this.f5231q);
        parcel.writeString(this.f5232r);
    }
}
