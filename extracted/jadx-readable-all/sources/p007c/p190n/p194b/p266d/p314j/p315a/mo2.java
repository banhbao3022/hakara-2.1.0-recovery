package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mo2 implements Parcelable {
    public static final Parcelable.Creator<mo2> CREATOR = new lo2();

    /* JADX INFO: renamed from: f */
    public final int f16812f;

    /* JADX INFO: renamed from: g */
    public final int f16813g;

    /* JADX INFO: renamed from: h */
    public final int f16814h;

    /* JADX INFO: renamed from: i */
    public final byte[] f16815i;

    /* JADX INFO: renamed from: j */
    public int f16816j;

    public mo2(int i, int i2, int i3, byte[] bArr) {
        this.f16812f = i;
        this.f16813g = i2;
        this.f16814h = i3;
        this.f16815i = bArr;
    }

    public mo2(Parcel parcel) {
        this.f16812f = parcel.readInt();
        this.f16813g = parcel.readInt();
        this.f16814h = parcel.readInt();
        this.f16815i = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mo2.class == obj.getClass()) {
            mo2 mo2Var = (mo2) obj;
            if (this.f16812f == mo2Var.f16812f && this.f16813g == mo2Var.f16813g && this.f16814h == mo2Var.f16814h && Arrays.equals(this.f16815i, mo2Var.f16815i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f16816j;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f16815i) + ((((((this.f16812f + 527) * 31) + this.f16813g) * 31) + this.f16814h) * 31);
        this.f16816j = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        int i = this.f16812f;
        int i2 = this.f16813g;
        int i3 = this.f16814h;
        boolean z = this.f16815i != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f16812f);
        parcel.writeInt(this.f16813g);
        parcel.writeInt(this.f16814h);
        parcel.writeInt(this.f16815i != null ? 1 : 0);
        byte[] bArr = this.f16815i;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
