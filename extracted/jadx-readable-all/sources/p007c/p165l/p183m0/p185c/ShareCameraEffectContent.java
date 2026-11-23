package p007c.p165l.p183m0.p185c;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.l.m0.c.c, reason: use source file name */
/* JADX INFO: compiled from: ShareCameraEffectContent.java */
/* JADX INFO: loaded from: classes.dex */
public class ShareCameraEffectContent extends ShareContent<ShareCameraEffectContent, ?> {
    public static final Parcelable.Creator<ShareCameraEffectContent> CREATOR = new a();

    /* JADX INFO: renamed from: l */
    public String f5252l;

    /* JADX INFO: renamed from: m */
    public CameraEffectArguments f5253m;

    /* JADX INFO: renamed from: n */
    public CameraEffectTextures f5254n;

    /* JADX INFO: renamed from: c.l.m0.c.c$a */
    /* JADX INFO: compiled from: ShareCameraEffectContent.java */
    public static class a implements Parcelable.Creator<ShareCameraEffectContent> {
        @Override // android.os.Parcelable.Creator
        public ShareCameraEffectContent createFromParcel(Parcel parcel) {
            return new ShareCameraEffectContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ShareCameraEffectContent[] newArray(int i) {
            return new ShareCameraEffectContent[i];
        }
    }

    public ShareCameraEffectContent(Parcel parcel) {
        super(parcel);
        this.f5252l = parcel.readString();
        CameraEffectArguments.b bVar = new CameraEffectArguments.b();
        CameraEffectArguments cameraEffectArguments = (CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader());
        if (cameraEffectArguments != null) {
            bVar.f5249a.putAll(cameraEffectArguments.f5248f);
        }
        this.f5253m = new CameraEffectArguments(bVar, null);
        CameraEffectTextures.b bVar2 = new CameraEffectTextures.b();
        CameraEffectTextures cameraEffectTextures = (CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader());
        if (cameraEffectTextures != null) {
            bVar2.f5251a.putAll(cameraEffectTextures.f5250f);
        }
        this.f5254n = new CameraEffectTextures(bVar2, null);
    }

    @Override // p007c.p165l.p183m0.p185c.ShareContent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f5252l);
        parcel.writeParcelable(this.f5253m, 0);
        parcel.writeParcelable(this.f5254n, 0);
    }
}
