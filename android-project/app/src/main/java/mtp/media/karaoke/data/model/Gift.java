package mtp.media.karaoke.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.p431d0.SerializedName;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: compiled from: Gift.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Gift implements Parcelable {
    public static final Parcelable.Creator<Gift> CREATOR = new Creator();
    private int amount;

    @SerializedName("created_at")
    private String createdAt;
    private int exp;

    /* JADX INFO: renamed from: id */
    private int f33493id;
    private String image;
    private String name;
    private int type;

    @SerializedName("updated_at")
    private String updatedAt;

    public static class Creator implements Parcelable.Creator<Gift> {
        @Override // android.os.Parcelable.Creator
        public final Gift createFromParcel(Parcel parcel) {
            Intrinsics2.m13089e(parcel, "in");
            return new Gift(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Gift[] newArray(int i) {
            return new Gift[i];
        }
    }

    public Gift(int i, String str, String str2, int i2, int i3, int i4, String str3, String str4) {
        Intrinsics2.m13089e(str, "name");
        Intrinsics2.m13089e(str2, "image");
        Intrinsics2.m13089e(str3, "createdAt");
        Intrinsics2.m13089e(str4, "updatedAt");
        this.f33493id = i;
        this.name = str;
        this.image = str2;
        this.amount = i2;
        this.type = i3;
        this.exp = i4;
        this.createdAt = str3;
        this.updatedAt = str4;
    }

    public final int component1() {
        return this.f33493id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.image;
    }

    public final int component4() {
        return this.amount;
    }

    public final int component5() {
        return this.type;
    }

    public final int component6() {
        return this.exp;
    }

    public final String component7() {
        return this.createdAt;
    }

    public final String component8() {
        return this.updatedAt;
    }

    public final Gift copy(int i, String str, String str2, int i2, int i3, int i4, String str3, String str4) {
        Intrinsics2.m13089e(str, "name");
        Intrinsics2.m13089e(str2, "image");
        Intrinsics2.m13089e(str3, "createdAt");
        Intrinsics2.m13089e(str4, "updatedAt");
        return new Gift(i, str, str2, i2, i3, i4, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Gift)) {
            return false;
        }
        Gift gift = (Gift) obj;
        return this.f33493id == gift.f33493id && Intrinsics2.m13085a(this.name, gift.name) && Intrinsics2.m13085a(this.image, gift.image) && this.amount == gift.amount && this.type == gift.type && this.exp == gift.exp && Intrinsics2.m13085a(this.createdAt, gift.createdAt) && Intrinsics2.m13085a(this.updatedAt, gift.updatedAt);
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final int getExp() {
        return this.exp;
    }

    public final int getId() {
        return this.f33493id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int i = this.f33493id * 31;
        String str = this.name;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.image;
        int iHashCode2 = (((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.amount) * 31) + this.type) * 31) + this.exp) * 31;
        String str3 = this.createdAt;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.updatedAt;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setAmount(int i) {
        this.amount = i;
    }

    public final void setCreatedAt(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.createdAt = str;
    }

    public final void setExp(int i) {
        this.exp = i;
    }

    public final void setId(int i) {
        this.f33493id = i;
    }

    public final void setImage(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.image = str;
    }

    public final void setName(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.name = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUpdatedAt(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.updatedAt = str;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Gift(id=");
        sbM1556G.append(this.f33493id);
        sbM1556G.append(", name=");
        sbM1556G.append(this.name);
        sbM1556G.append(", image=");
        sbM1556G.append(this.image);
        sbM1556G.append(", amount=");
        sbM1556G.append(this.amount);
        sbM1556G.append(", type=");
        sbM1556G.append(this.type);
        sbM1556G.append(", exp=");
        sbM1556G.append(this.exp);
        sbM1556G.append(", createdAt=");
        sbM1556G.append(this.createdAt);
        sbM1556G.append(", updatedAt=");
        return outline.m1550A(sbM1556G, this.updatedAt, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics2.m13089e(parcel, "parcel");
        parcel.writeInt(this.f33493id);
        parcel.writeString(this.name);
        parcel.writeString(this.image);
        parcel.writeInt(this.amount);
        parcel.writeInt(this.type);
        parcel.writeInt(this.exp);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
    }
}
