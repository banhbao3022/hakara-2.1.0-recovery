package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class jl2 extends kl2 {
    public static final Parcelable.Creator<jl2> CREATOR = new il2();

    /* JADX INFO: renamed from: g */
    public final String f15651g;

    /* JADX INFO: renamed from: h */
    public final String f15652h;

    /* JADX INFO: renamed from: i */
    public final String f15653i;

    public jl2(Parcel parcel) {
        super("COMM");
        this.f15651g = parcel.readString();
        this.f15652h = parcel.readString();
        this.f15653i = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jl2.class == obj.getClass()) {
            jl2 jl2Var = (jl2) obj;
            if (jo2.m7369a(this.f15652h, jl2Var.f15652h) && jo2.m7369a(this.f15651g, jl2Var.f15651g) && jo2.m7369a(this.f15653i, jl2Var.f15653i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f15651g;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f15652h;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f15653i;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15979f);
        parcel.writeString(this.f15651g);
        parcel.writeString(this.f15653i);
    }

    public jl2(String str, String str2, String str3) {
        super("COMM");
        this.f15651g = "und";
        this.f15652h = str2;
        this.f15653i = str3;
    }
}
