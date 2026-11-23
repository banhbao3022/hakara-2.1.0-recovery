package p007c.p165l.p183m0.p185c;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p007c.p165l.p183m0.p185c.ShareContent;
import p007c.p165l.p183m0.p185c.ShareContent.a;

/* JADX INFO: renamed from: c.l.m0.c.d, reason: use source file name */
/* JADX INFO: compiled from: ShareContent.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ShareContent<P extends ShareContent, E extends a> implements Parcelable {

    /* JADX INFO: renamed from: f */
    public final Uri f5255f;

    /* JADX INFO: renamed from: g */
    public final List<String> f5256g;

    /* JADX INFO: renamed from: h */
    public final String f5257h;

    /* JADX INFO: renamed from: i */
    public final String f5258i;

    /* JADX INFO: renamed from: j */
    public final String f5259j;

    /* JADX INFO: renamed from: k */
    public final ShareHashtag f5260k;

    /* JADX INFO: renamed from: c.l.m0.c.d$a */
    /* JADX INFO: compiled from: ShareContent.java */
    public static abstract class a<P extends ShareContent, E extends a> {

        /* JADX INFO: renamed from: a */
        public Uri f5261a;

        /* JADX INFO: renamed from: b */
        public List<String> f5262b;

        /* JADX INFO: renamed from: c */
        public String f5263c;

        /* JADX INFO: renamed from: d */
        public String f5264d;

        /* JADX INFO: renamed from: e */
        public String f5265e;

        /* JADX INFO: renamed from: f */
        public ShareHashtag f5266f;
    }

    public ShareContent(a aVar) {
        this.f5255f = aVar.f5261a;
        this.f5256g = aVar.f5262b;
        this.f5257h = aVar.f5263c;
        this.f5258i = aVar.f5264d;
        this.f5259j = aVar.f5265e;
        this.f5260k = aVar.f5266f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f5255f, 0);
        parcel.writeStringList(this.f5256g);
        parcel.writeString(this.f5257h);
        parcel.writeString(this.f5258i);
        parcel.writeString(this.f5259j);
        parcel.writeParcelable(this.f5260k, 0);
    }

    public ShareContent(Parcel parcel) {
        this.f5255f = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f5256g = arrayList.size() == 0 ? null : Collections.unmodifiableList(arrayList);
        this.f5257h = parcel.readString();
        this.f5258i = parcel.readString();
        this.f5259j = parcel.readString();
        ShareHashtag.b bVar = new ShareHashtag.b();
        ShareHashtag shareHashtag = (ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader());
        if (shareHashtag != null) {
            bVar.f5268a = shareHashtag.f5267f;
        }
        this.f5260k = new ShareHashtag(bVar, null);
    }
}
