package p007c.p165l.p183m0.p185c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.l.m0.c.a, reason: use source file name */
/* JADX INFO: compiled from: CameraEffectArguments.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraEffectArguments implements Parcelable {
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final Bundle f5248f;

    /* JADX INFO: renamed from: c.l.m0.c.a$a */
    /* JADX INFO: compiled from: CameraEffectArguments.java */
    public static class a implements Parcelable.Creator<CameraEffectArguments> {
        @Override // android.os.Parcelable.Creator
        public CameraEffectArguments createFromParcel(Parcel parcel) {
            return new CameraEffectArguments(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public CameraEffectArguments[] newArray(int i) {
            return new CameraEffectArguments[i];
        }
    }

    /* JADX INFO: renamed from: c.l.m0.c.a$b */
    /* JADX INFO: compiled from: CameraEffectArguments.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public Bundle f5249a = new Bundle();
    }

    public CameraEffectArguments(b bVar, a aVar) {
        this.f5248f = bVar.f5249a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f5248f);
    }

    public CameraEffectArguments(Parcel parcel) {
        this.f5248f = parcel.readBundle(CameraEffectArguments.class.getClassLoader());
    }
}
