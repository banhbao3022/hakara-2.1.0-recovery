package p007c.p190n.p194b.p209b.p234u1.p237k;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.Format;
import p007c.p190n.p194b.p209b.p212b2.Util6;
import p007c.p190n.p194b.p209b.p234u1.Metadata;
import p007c.p190n.p194b.p209b.p234u1.Metadata2;

/* JADX INFO: renamed from: c.n.b.b.u1.k.a, reason: use source file name */
/* JADX INFO: compiled from: PictureFrame.java */
/* JADX INFO: loaded from: classes.dex */
public final class PictureFrame implements Metadata.b {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final int f8688f;

    /* JADX INFO: renamed from: g */
    public final String f8689g;

    /* JADX INFO: renamed from: h */
    public final String f8690h;

    /* JADX INFO: renamed from: i */
    public final int f8691i;

    /* JADX INFO: renamed from: j */
    public final int f8692j;

    /* JADX INFO: renamed from: k */
    public final int f8693k;

    /* JADX INFO: renamed from: l */
    public final int f8694l;

    /* JADX INFO: renamed from: m */
    public final byte[] f8695m;

    /* JADX INFO: renamed from: c.n.b.b.u1.k.a$a */
    /* JADX INFO: compiled from: PictureFrame.java */
    public class a implements Parcelable.Creator<PictureFrame> {
        @Override // android.os.Parcelable.Creator
        public PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PictureFrame[] newArray(int i) {
            return new PictureFrame[i];
        }
    }

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f8688f = i;
        this.f8689g = str;
        this.f8690h = str2;
        this.f8691i = i2;
        this.f8692j = i3;
        this.f8693k = i4;
        this.f8694l = i5;
        this.f8695m = bArr;
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
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.f8688f == pictureFrame.f8688f && this.f8689g.equals(pictureFrame.f8689g) && this.f8690h.equals(pictureFrame.f8690h) && this.f8691i == pictureFrame.f8691i && this.f8692j == pictureFrame.f8692j && this.f8693k == pictureFrame.f8693k && this.f8694l == pictureFrame.f8694l && Arrays.equals(this.f8695m, pictureFrame.f8695m);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f8695m) + ((((((((outline.m1569T(this.f8690h, outline.m1569T(this.f8689g, (this.f8688f + 527) * 31, 31), 31) + this.f8691i) * 31) + this.f8692j) * 31) + this.f8693k) * 31) + this.f8694l) * 31);
    }

    @Override // p007c.p190n.p194b.p209b.p234u1.Metadata.b
    /* JADX INFO: renamed from: q */
    public /* synthetic */ Format mo4011q() {
        return Metadata2.m4013b(this);
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Picture: mimeType=");
        sbM1556G.append(this.f8689g);
        sbM1556G.append(", description=");
        sbM1556G.append(this.f8690h);
        return sbM1556G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f8688f);
        parcel.writeString(this.f8689g);
        parcel.writeString(this.f8690h);
        parcel.writeInt(this.f8691i);
        parcel.writeInt(this.f8692j);
        parcel.writeInt(this.f8693k);
        parcel.writeInt(this.f8694l);
        parcel.writeByteArray(this.f8695m);
    }

    public PictureFrame(Parcel parcel) {
        this.f8688f = parcel.readInt();
        String string = parcel.readString();
        int i = Util6.f6307a;
        this.f8689g = string;
        this.f8690h = parcel.readString();
        this.f8691i = parcel.readInt();
        this.f8692j = parcel.readInt();
        this.f8693k = parcel.readInt();
        this.f8694l = parcel.readInt();
        this.f8695m = parcel.createByteArray();
    }
}
