package mtp.media.karaoke.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.p431d0.SerializedName;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: compiled from: Present.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Present implements Parcelable {
    public static final Parcelable.Creator<Present> CREATOR = new Creator();

    @SerializedName("created_at")
    private String createdAt;
    private Gift gift;

    @SerializedName("gift_id")
    private int giftId;

    /* JADX INFO: renamed from: id */
    private int f33497id;
    private int quantity;

    @SerializedName("recording_id")
    private int recordingId;
    private int stars;

    @SerializedName("updated_at")
    private String updatedAt;
    private User user;

    @SerializedName("user_id")
    private int userId;

    public static class Creator implements Parcelable.Creator<Present> {
        @Override // android.os.Parcelable.Creator
        public final Present createFromParcel(Parcel parcel) {
            Intrinsics2.m13089e(parcel, "in");
            return new Present(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? User.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? Gift.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Present[] newArray(int i) {
            return new Present[i];
        }
    }

    public Present(int i, int i2, User user, int i3, int i4, Gift gift, int i5, int i6, String str, String str2) {
        Intrinsics2.m13089e(str, "createdAt");
        Intrinsics2.m13089e(str2, "updatedAt");
        this.f33497id = i;
        this.userId = i2;
        this.user = user;
        this.recordingId = i3;
        this.giftId = i4;
        this.gift = gift;
        this.quantity = i5;
        this.stars = i6;
        this.createdAt = str;
        this.updatedAt = str2;
    }

    public final int component1() {
        return this.f33497id;
    }

    public final String component10() {
        return this.updatedAt;
    }

    public final int component2() {
        return this.userId;
    }

    public final User component3() {
        return this.user;
    }

    public final int component4() {
        return this.recordingId;
    }

    public final int component5() {
        return this.giftId;
    }

    public final Gift component6() {
        return this.gift;
    }

    public final int component7() {
        return this.quantity;
    }

    public final int component8() {
        return this.stars;
    }

    public final String component9() {
        return this.createdAt;
    }

    public final Present copy(int i, int i2, User user, int i3, int i4, Gift gift, int i5, int i6, String str, String str2) {
        Intrinsics2.m13089e(str, "createdAt");
        Intrinsics2.m13089e(str2, "updatedAt");
        return new Present(i, i2, user, i3, i4, gift, i5, i6, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Present)) {
            return false;
        }
        Present present = (Present) obj;
        return this.f33497id == present.f33497id && this.userId == present.userId && Intrinsics2.m13085a(this.user, present.user) && this.recordingId == present.recordingId && this.giftId == present.giftId && Intrinsics2.m13085a(this.gift, present.gift) && this.quantity == present.quantity && this.stars == present.stars && Intrinsics2.m13085a(this.createdAt, present.createdAt) && Intrinsics2.m13085a(this.updatedAt, present.updatedAt);
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final Gift getGift() {
        return this.gift;
    }

    public final int getGiftId() {
        return this.giftId;
    }

    public final int getId() {
        return this.f33497id;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final int getRecordingId() {
        return this.recordingId;
    }

    public final int getStars() {
        return this.stars;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final User getUser() {
        return this.user;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int i = ((this.f33497id * 31) + this.userId) * 31;
        User user = this.user;
        int iHashCode = (((((i + (user != null ? user.hashCode() : 0)) * 31) + this.recordingId) * 31) + this.giftId) * 31;
        Gift gift = this.gift;
        int iHashCode2 = (((((iHashCode + (gift != null ? gift.hashCode() : 0)) * 31) + this.quantity) * 31) + this.stars) * 31;
        String str = this.createdAt;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.updatedAt;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCreatedAt(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.createdAt = str;
    }

    public final void setGift(Gift gift) {
        this.gift = gift;
    }

    public final void setGiftId(int i) {
        this.giftId = i;
    }

    public final void setId(int i) {
        this.f33497id = i;
    }

    public final void setQuantity(int i) {
        this.quantity = i;
    }

    public final void setRecordingId(int i) {
        this.recordingId = i;
    }

    public final void setStars(int i) {
        this.stars = i;
    }

    public final void setUpdatedAt(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.updatedAt = str;
    }

    public final void setUser(User user) {
        this.user = user;
    }

    public final void setUserId(int i) {
        this.userId = i;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Present(id=");
        sbM1556G.append(this.f33497id);
        sbM1556G.append(", userId=");
        sbM1556G.append(this.userId);
        sbM1556G.append(", user=");
        sbM1556G.append(this.user);
        sbM1556G.append(", recordingId=");
        sbM1556G.append(this.recordingId);
        sbM1556G.append(", giftId=");
        sbM1556G.append(this.giftId);
        sbM1556G.append(", gift=");
        sbM1556G.append(this.gift);
        sbM1556G.append(", quantity=");
        sbM1556G.append(this.quantity);
        sbM1556G.append(", stars=");
        sbM1556G.append(this.stars);
        sbM1556G.append(", createdAt=");
        sbM1556G.append(this.createdAt);
        sbM1556G.append(", updatedAt=");
        return outline.m1550A(sbM1556G, this.updatedAt, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics2.m13089e(parcel, "parcel");
        parcel.writeInt(this.f33497id);
        parcel.writeInt(this.userId);
        User user = this.user;
        if (user != null) {
            parcel.writeInt(1);
            user.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.recordingId);
        parcel.writeInt(this.giftId);
        Gift gift = this.gift;
        if (gift != null) {
            parcel.writeInt(1);
            gift.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.quantity);
        parcel.writeInt(this.stars);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
    }
}
