package p007c.p190n.p194b.p209b.p213c2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p209b.p212b2.Util6;

/* JADX INFO: renamed from: c.n.b.b.c2.k, reason: use source file name */
/* JADX INFO: compiled from: ColorInfo.java */
/* JADX INFO: loaded from: classes.dex */
public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator<ColorInfo> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public final int f6440f;

    /* JADX INFO: renamed from: g */
    public final int f6441g;

    /* JADX INFO: renamed from: h */
    public final int f6442h;

    /* JADX INFO: renamed from: i */
    public final byte[] f6443i;

    /* JADX INFO: renamed from: j */
    public int f6444j;

    /* JADX INFO: renamed from: c.n.b.b.c2.k$a */
    /* JADX INFO: compiled from: ColorInfo.java */
    public class a implements Parcelable.Creator<ColorInfo> {
        @Override // android.os.Parcelable.Creator
        public ColorInfo createFromParcel(Parcel parcel) {
            return new ColorInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ColorInfo[] newArray(int i) {
            return new ColorInfo[i];
        }
    }

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.f6440f = i;
        this.f6441g = i2;
        this.f6442h = i3;
        this.f6443i = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ColorInfo.class != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        return this.f6440f == colorInfo.f6440f && this.f6441g == colorInfo.f6441g && this.f6442h == colorInfo.f6442h && Arrays.equals(this.f6443i, colorInfo.f6443i);
    }

    public int hashCode() {
        if (this.f6444j == 0) {
            this.f6444j = Arrays.hashCode(this.f6443i) + ((((((527 + this.f6440f) * 31) + this.f6441g) * 31) + this.f6442h) * 31);
        }
        return this.f6444j;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("ColorInfo(");
        sbM1556G.append(this.f6440f);
        sbM1556G.append(", ");
        sbM1556G.append(this.f6441g);
        sbM1556G.append(", ");
        sbM1556G.append(this.f6442h);
        sbM1556G.append(", ");
        sbM1556G.append(this.f6443i != null);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f6440f);
        parcel.writeInt(this.f6441g);
        parcel.writeInt(this.f6442h);
        int i2 = this.f6443i != null ? 1 : 0;
        int i3 = Util6.f6307a;
        parcel.writeInt(i2);
        byte[] bArr = this.f6443i;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public ColorInfo(Parcel parcel) {
        this.f6440f = parcel.readInt();
        this.f6441g = parcel.readInt();
        this.f6442h = parcel.readInt();
        int i = Util6.f6307a;
        this.f6443i = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
