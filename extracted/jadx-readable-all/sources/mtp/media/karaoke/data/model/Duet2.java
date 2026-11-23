package mtp.media.karaoke.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: mtp.media.karaoke.data.model.DuetSegment, reason: use source file name */
/* JADX INFO: compiled from: Duet.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Duet2 implements Parcelable {
    public static final Parcelable.Creator<Duet2> CREATOR = new Creator();

    /* JADX INFO: renamed from: e */
    private float f33489e;

    /* JADX INFO: renamed from: n */
    private String f33490n;

    /* JADX INFO: renamed from: s */
    private float f33491s;

    /* JADX INFO: renamed from: mtp.media.karaoke.data.model.DuetSegment$Creator */
    public static class Creator implements Parcelable.Creator<Duet2> {
        @Override // android.os.Parcelable.Creator
        public final Duet2 createFromParcel(Parcel parcel) {
            Intrinsics2.m13089e(parcel, "in");
            return new Duet2(parcel.readString(), parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final Duet2[] newArray(int i) {
            return new Duet2[i];
        }
    }

    public Duet2(String str, float f, float f2) {
        Intrinsics2.m13089e(str, "n");
        this.f33490n = str;
        this.f33491s = f;
        this.f33489e = f2;
    }

    public static /* synthetic */ Duet2 copy$default(Duet2 duet2, String str, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = duet2.f33490n;
        }
        if ((i & 2) != 0) {
            f = duet2.f33491s;
        }
        if ((i & 4) != 0) {
            f2 = duet2.f33489e;
        }
        return duet2.copy(str, f, f2);
    }

    public final String component1() {
        return this.f33490n;
    }

    public final float component2() {
        return this.f33491s;
    }

    public final float component3() {
        return this.f33489e;
    }

    public final Duet2 copy(String str, float f, float f2) {
        Intrinsics2.m13089e(str, "n");
        return new Duet2(str, f, f2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duet2)) {
            return false;
        }
        Duet2 duet2 = (Duet2) obj;
        return Intrinsics2.m13085a(this.f33490n, duet2.f33490n) && Float.compare(this.f33491s, duet2.f33491s) == 0 && Float.compare(this.f33489e, duet2.f33489e) == 0;
    }

    public final float getE() {
        return this.f33489e;
    }

    public final String getN() {
        return this.f33490n;
    }

    public final float getS() {
        return this.f33491s;
    }

    public int hashCode() {
        String str = this.f33490n;
        return Float.floatToIntBits(this.f33489e) + ((Float.floatToIntBits(this.f33491s) + ((str != null ? str.hashCode() : 0) * 31)) * 31);
    }

    public final void setE(float f) {
        this.f33489e = f;
    }

    public final void setN(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.f33490n = str;
    }

    public final void setS(float f) {
        this.f33491s = f;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("DuetSegment(n=");
        sbM1556G.append(this.f33490n);
        sbM1556G.append(", s=");
        sbM1556G.append(this.f33491s);
        sbM1556G.append(", e=");
        sbM1556G.append(this.f33489e);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics2.m13089e(parcel, "parcel");
        parcel.writeString(this.f33490n);
        parcel.writeFloat(this.f33491s);
        parcel.writeFloat(this.f33489e);
    }
}
