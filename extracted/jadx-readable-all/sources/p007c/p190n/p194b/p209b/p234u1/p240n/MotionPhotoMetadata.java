package p007c.p190n.p194b.p209b.p234u1.p240n;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.Metadata2;
import p007c.p190n.p194b.p334e.C4799a;

/* JADX INFO: renamed from: c.n.b.b.u1.n.b, reason: use source file name */
/* JADX INFO: compiled from: MotionPhotoMetadata.java */
/* JADX INFO: loaded from: classes.dex */
public final class MotionPhotoMetadata implements Metadata.b {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final long f8758f;

    /* JADX INFO: renamed from: g */
    public final long f8759g;

    /* JADX INFO: renamed from: h */
    public final long f8760h;

    /* JADX INFO: renamed from: i */
    public final long f8761i;

    /* JADX INFO: renamed from: j */
    public final long f8762j;

    /* JADX INFO: renamed from: c.n.b.b.u1.n.b$a */
    /* JADX INFO: compiled from: MotionPhotoMetadata.java */
    public class a implements Parcelable.Creator<MotionPhotoMetadata> {
        @Override // android.os.Parcelable.Creator
        public MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public MotionPhotoMetadata[] newArray(int i) {
            return new MotionPhotoMetadata[i];
        }
    }

    public MotionPhotoMetadata(long j2, long j3, long j4, long j5, long j6) {
        this.f8758f = j2;
        this.f8759g = j3;
        this.f8760h = j4;
        this.f8761i = j5;
        this.f8762j = j6;
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.Metadata.b
    /* JADX INFO: renamed from: F */
    public /* synthetic */ byte[] mo4010F() {
        return Metadata2.m4012a(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MotionPhotoMetadata.class != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.f8758f == motionPhotoMetadata.f8758f && this.f8759g == motionPhotoMetadata.f8759g && this.f8760h == motionPhotoMetadata.f8760h && this.f8761i == motionPhotoMetadata.f8761i && this.f8762j == motionPhotoMetadata.f8762j;
    }

    public int hashCode() {
        return C4799a.m10968S(this.f8762j) + ((C4799a.m10968S(this.f8761i) + ((C4799a.m10968S(this.f8760h) + ((C4799a.m10968S(this.f8759g) + ((C4799a.m10968S(this.f8758f) + 527) * 31)) * 31)) * 31)) * 31);
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.Metadata.b
    /* JADX INFO: renamed from: q */
    public /* synthetic */ Format mo4011q() {
        return Metadata2.m4013b(this);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Motion photo metadata: photoStartPosition=");
        sbM1556G.append(this.f8758f);
        sbM1556G.append(", photoSize=");
        sbM1556G.append(this.f8759g);
        sbM1556G.append(", photoPresentationTimestampUs=");
        sbM1556G.append(this.f8760h);
        sbM1556G.append(", videoStartPosition=");
        sbM1556G.append(this.f8761i);
        sbM1556G.append(", videoSize=");
        sbM1556G.append(this.f8762j);
        return sbM1556G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8758f);
        parcel.writeLong(this.f8759g);
        parcel.writeLong(this.f8760h);
        parcel.writeLong(this.f8761i);
        parcel.writeLong(this.f8762j);
    }

    public MotionPhotoMetadata(Parcel parcel, a aVar) {
        this.f8758f = parcel.readLong();
        this.f8759g = parcel.readLong();
        this.f8760h = parcel.readLong();
        this.f8761i = parcel.readLong();
        this.f8762j = parcel.readLong();
    }
}
