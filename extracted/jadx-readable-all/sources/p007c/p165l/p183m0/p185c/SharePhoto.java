package p007c.p165l.p183m0.p185c;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.l.m0.c.s, reason: use source file name */
/* JADX INFO: compiled from: SharePhoto.java */
/* JADX INFO: loaded from: classes.dex */
public final class SharePhoto extends ShareMedia {
    public static final Parcelable.Creator<SharePhoto> CREATOR = new a();

    /* JADX INFO: renamed from: g */
    public final Bitmap f5310g;

    /* JADX INFO: renamed from: h */
    public final Uri f5311h;

    /* JADX INFO: renamed from: i */
    public final boolean f5312i;

    /* JADX INFO: renamed from: j */
    public final String f5313j;

    /* JADX INFO: renamed from: c.l.m0.c.s$a */
    /* JADX INFO: compiled from: SharePhoto.java */
    public static class a implements Parcelable.Creator<SharePhoto> {
        @Override // android.os.Parcelable.Creator
        public SharePhoto createFromParcel(Parcel parcel) {
            return new SharePhoto(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public SharePhoto[] newArray(int i) {
            return new SharePhoto[i];
        }
    }

    /* JADX INFO: renamed from: c.l.m0.c.s$b */
    /* JADX INFO: compiled from: SharePhoto.java */
    public static final class b extends ShareMedia.a<SharePhoto, b> {

        /* JADX INFO: renamed from: b */
        public Bitmap f5314b;

        /* JADX INFO: renamed from: c */
        public Uri f5315c;

        /* JADX INFO: renamed from: d */
        public boolean f5316d;

        /* JADX INFO: renamed from: e */
        public String f5317e;

        /* JADX INFO: renamed from: a */
        public SharePhoto m2652a() {
            return new SharePhoto(this, null);
        }

        /* JADX INFO: renamed from: b */
        public b m2653b(SharePhoto sharePhoto) {
            if (sharePhoto == null) {
                return this;
            }
            this.f5274a.putAll(new Bundle(sharePhoto.f5273f));
            this.f5314b = sharePhoto.f5310g;
            this.f5315c = sharePhoto.f5311h;
            this.f5316d = sharePhoto.f5312i;
            this.f5317e = sharePhoto.f5313j;
            return this;
        }
    }

    public SharePhoto(b bVar, a aVar) {
        super(bVar);
        this.f5310g = bVar.f5314b;
        this.f5311h = bVar.f5315c;
        this.f5312i = bVar.f5316d;
        this.f5313j = bVar.f5317e;
    }

    @Override // p007c.p165l.p183m0.p185c.ShareMedia
    /* JADX INFO: renamed from: a */
    public int mo2648a() {
        return 1;
    }

    @Override // p007c.p165l.p183m0.p185c.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p007c.p165l.p183m0.p185c.ShareMedia, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f5273f);
        parcel.writeParcelable(this.f5310g, 0);
        parcel.writeParcelable(this.f5311h, 0);
        parcel.writeByte(this.f5312i ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f5313j);
    }

    public SharePhoto(Parcel parcel) {
        super(parcel);
        this.f5310g = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.f5311h = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f5312i = parcel.readByte() != 0;
        this.f5313j = parcel.readString();
    }
}
