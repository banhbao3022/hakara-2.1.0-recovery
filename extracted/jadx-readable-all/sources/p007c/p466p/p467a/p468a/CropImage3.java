package p007c.p466p.p467a.p468a;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.theartofdev.edmodo.cropper.CropImageView;

/* JADX INFO: renamed from: c.p.a.a.f, reason: use source file name */
/* JADX INFO: compiled from: CropImage.java */
/* JADX INFO: loaded from: classes.dex */
public final class CropImage3 extends CropImageView.C6009b implements Parcelable {
    public static final Parcelable.Creator<CropImage3> CREATOR = new a();

    /* JADX INFO: renamed from: c.p.a.a.f$a */
    /* JADX INFO: compiled from: CropImage.java */
    public static class a implements Parcelable.Creator<CropImage3> {
        @Override // android.os.Parcelable.Creator
        public CropImage3 createFromParcel(Parcel parcel) {
            return new CropImage3(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public CropImage3[] newArray(int i) {
            return new CropImage3[i];
        }
    }

    public CropImage3(Uri uri, Uri uri2, Exception exc, float[] fArr, Rect rect, int i, Rect rect2, int i2) {
        super(null, uri, null, uri2, exc, fArr, rect, rect2, i, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f29375f, i);
        parcel.writeParcelable(this.f29376g, i);
        parcel.writeSerializable(this.f29377h);
        parcel.writeFloatArray(this.f29378i);
        parcel.writeParcelable(this.f29379j, i);
        parcel.writeParcelable(this.f29380k, i);
        parcel.writeInt(this.f29381l);
        parcel.writeInt(this.f29382m);
    }

    public CropImage3(Parcel parcel) {
        super(null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), null, (Uri) parcel.readParcelable(Uri.class.getClassLoader()), (Exception) parcel.readSerializable(), parcel.createFloatArray(), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), (Rect) parcel.readParcelable(Rect.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
