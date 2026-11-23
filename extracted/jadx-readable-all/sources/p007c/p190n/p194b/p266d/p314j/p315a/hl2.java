package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class hl2 extends kl2 {
    public static final Parcelable.Creator<hl2> CREATOR = new gl2();

    /* JADX INFO: renamed from: g */
    public final String f14905g;

    /* JADX INFO: renamed from: h */
    public final String f14906h;

    /* JADX INFO: renamed from: i */
    public final int f14907i;

    /* JADX INFO: renamed from: j */
    public final byte[] f14908j;

    public hl2(Parcel parcel) {
        super("APIC");
        this.f14905g = parcel.readString();
        this.f14906h = parcel.readString();
        this.f14907i = parcel.readInt();
        this.f14908j = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hl2.class == obj.getClass()) {
            hl2 hl2Var = (hl2) obj;
            if (this.f14907i == hl2Var.f14907i && jo2.m7369a(this.f14905g, hl2Var.f14905g) && jo2.m7369a(this.f14906h, hl2Var.f14906h) && Arrays.equals(this.f14908j, hl2Var.f14908j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f14907i + 527) * 31;
        String str = this.f14905g;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f14906h;
        return Arrays.hashCode(this.f14908j) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14905g);
        parcel.writeString(this.f14906h);
        parcel.writeInt(this.f14907i);
        parcel.writeByteArray(this.f14908j);
    }

    public hl2(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f14905g = str;
        this.f14906h = null;
        this.f14907i = 3;
        this.f14908j = bArr;
    }
}
