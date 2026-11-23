package mtp.media.karaoke.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.p431d0.SerializedName;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: compiled from: Image.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Image implements Parcelable {
    public static final Parcelable.Creator<Image> CREATOR = new Creator();

    @SerializedName("created_at")
    private String createdAt;

    /* JADX INFO: renamed from: id */
    private int f33494id;
    private String image;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("user_id")
    private int userId;

    public static class Creator implements Parcelable.Creator<Image> {
        @Override // android.os.Parcelable.Creator
        public final Image createFromParcel(Parcel parcel) {
            Intrinsics2.m13089e(parcel, "in");
            return new Image(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Image[] newArray(int i) {
            return new Image[i];
        }
    }

    public Image(int i, int i2, String str, String str2, String str3) {
        Intrinsics2.m13089e(str, "image");
        Intrinsics2.m13089e(str2, "createdAt");
        Intrinsics2.m13089e(str3, "updatedAt");
        this.f33494id = i;
        this.userId = i2;
        this.image = str;
        this.createdAt = str2;
        this.updatedAt = str3;
    }

    public static /* synthetic */ Image copy$default(Image image, int i, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = image.f33494id;
        }
        if ((i3 & 2) != 0) {
            i2 = image.userId;
        }
        int i4 = i2;
        if ((i3 & 4) != 0) {
            str = image.image;
        }
        String str4 = str;
        if ((i3 & 8) != 0) {
            str2 = image.createdAt;
        }
        String str5 = str2;
        if ((i3 & 16) != 0) {
            str3 = image.updatedAt;
        }
        return image.copy(i, i4, str4, str5, str3);
    }

    public final int component1() {
        return this.f33494id;
    }

    public final int component2() {
        return this.userId;
    }

    public final String component3() {
        return this.image;
    }

    public final String component4() {
        return this.createdAt;
    }

    public final String component5() {
        return this.updatedAt;
    }

    public final Image copy(int i, int i2, String str, String str2, String str3) {
        Intrinsics2.m13089e(str, "image");
        Intrinsics2.m13089e(str2, "createdAt");
        Intrinsics2.m13089e(str3, "updatedAt");
        return new Image(i, i2, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        return this.f33494id == image.f33494id && this.userId == image.userId && Intrinsics2.m13085a(this.image, image.image) && Intrinsics2.m13085a(this.createdAt, image.createdAt) && Intrinsics2.m13085a(this.updatedAt, image.updatedAt);
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final int getId() {
        return this.f33494id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int i = ((this.f33494id * 31) + this.userId) * 31;
        String str = this.image;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.createdAt;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.updatedAt;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setCreatedAt(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.createdAt = str;
    }

    public final void setId(int i) {
        this.f33494id = i;
    }

    public final void setImage(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.image = str;
    }

    public final void setUpdatedAt(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.updatedAt = str;
    }

    public final void setUserId(int i) {
        this.userId = i;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Image(id=");
        sbM1556G.append(this.f33494id);
        sbM1556G.append(", userId=");
        sbM1556G.append(this.userId);
        sbM1556G.append(", image=");
        sbM1556G.append(this.image);
        sbM1556G.append(", createdAt=");
        sbM1556G.append(this.createdAt);
        sbM1556G.append(", updatedAt=");
        return outline.m1550A(sbM1556G, this.updatedAt, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics2.m13089e(parcel, "parcel");
        parcel.writeInt(this.f33494id);
        parcel.writeInt(this.userId);
        parcel.writeString(this.image);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
    }
}
