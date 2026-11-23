package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ml2 extends kl2 {
    public static final Parcelable.Creator<ml2> CREATOR = new ll2();

    /* JADX INFO: renamed from: g */
    public final String f16794g;

    /* JADX INFO: renamed from: h */
    public final String f16795h;

    public ml2(Parcel parcel) {
        super(parcel.readString());
        this.f16794g = parcel.readString();
        this.f16795h = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ml2.class == obj.getClass()) {
            ml2 ml2Var = (ml2) obj;
            if (this.f15979f.equals(ml2Var.f15979f) && jo2.m7369a(this.f16794g, ml2Var.f16794g) && jo2.m7369a(this.f16795h, ml2Var.f16795h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM1569T = outline.m1569T(this.f15979f, 527, 31);
        String str = this.f16794g;
        int iHashCode = (iM1569T + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f16795h;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f15979f);
        parcel.writeString(this.f16794g);
        parcel.writeString(this.f16795h);
    }

    public ml2(String str, String str2, String str3) {
        super(str);
        this.f16794g = null;
        this.f16795h = str3;
    }
}
