package p007c.p165l.p183m0.p185c;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.l.m0.c.b, reason: use source file name */
/* JADX INFO: compiled from: CameraEffectTextures.java */
/* JADX INFO: loaded from: classes.dex */
public class CameraEffectTextures implements Parcelable {
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final Bundle f5250f;

    /* JADX INFO: renamed from: c.l.m0.c.b$a */
    /* JADX INFO: compiled from: CameraEffectTextures.java */
    public static class a implements Parcelable.Creator<CameraEffectTextures> {
        @Override // android.os.Parcelable.Creator
        public CameraEffectTextures createFromParcel(Parcel parcel) {
            return new CameraEffectTextures(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public CameraEffectTextures[] newArray(int i) {
            return new CameraEffectTextures[i];
        }
    }

    /* JADX INFO: renamed from: c.l.m0.c.b$b */
    /* JADX INFO: compiled from: CameraEffectTextures.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        public Bundle f5251a = new Bundle();
    }

    public CameraEffectTextures(b bVar, a aVar) {
        this.f5250f = bVar.f5251a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f5250f);
    }

    public CameraEffectTextures(Parcel parcel) {
        this.f5250f = parcel.readBundle(CameraEffectTextures.class.getClassLoader());
    }
}
