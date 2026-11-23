package p007c.p165l.p183m0.p185c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import p007c.p165l.p183m0.p185c.ShareOpenGraphValueContainer;
import p007c.p165l.p183m0.p185c.ShareOpenGraphValueContainer.a;

/* JADX INFO: renamed from: c.l.m0.c.r, reason: use source file name */
/* JADX INFO: compiled from: ShareOpenGraphValueContainer.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class ShareOpenGraphValueContainer<P extends ShareOpenGraphValueContainer, E extends a> implements Parcelable {

    /* JADX INFO: renamed from: f */
    public final Bundle f5308f;

    /* JADX INFO: renamed from: c.l.m0.c.r$a */
    /* JADX INFO: compiled from: ShareOpenGraphValueContainer.java */
    public static abstract class a<P extends ShareOpenGraphValueContainer, E extends a> {

        /* JADX INFO: renamed from: a */
        public Bundle f5309a = new Bundle();
    }

    public ShareOpenGraphValueContainer(a<P, E> aVar) {
        this.f5308f = (Bundle) aVar.f5309a.clone();
    }

    /* JADX INFO: renamed from: a */
    public Object m2650a(String str) {
        return this.f5308f.get(str);
    }

    /* JADX INFO: renamed from: b */
    public Set<String> m2651b() {
        return this.f5308f.keySet();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f5308f);
    }

    public ShareOpenGraphValueContainer(Parcel parcel) {
        this.f5308f = parcel.readBundle(a.class.getClassLoader());
    }
}
