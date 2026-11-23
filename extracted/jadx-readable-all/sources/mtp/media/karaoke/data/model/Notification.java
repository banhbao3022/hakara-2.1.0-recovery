package mtp.media.karaoke.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.p431d0.SerializedName;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: compiled from: Notification.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Notification implements Parcelable {
    public static final Parcelable.Creator<Notification> CREATOR = new Creator();

    @SerializedName("content_id")
    private int contentId;

    @SerializedName("created_at")
    private String createdAt;

    /* JADX INFO: renamed from: id */
    private int f33496id;
    private String image;

    @SerializedName("is_read")
    private int isRead;
    private String message;

    @SerializedName("pushed_at")
    private String pushedAt;
    private User sender;

    @SerializedName("sub_content_id")
    private Integer subContentId;

    @SerializedName("sub_type")
    private String subType;
    private String title;
    private String type;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("user_id")
    private int userId;

    public static class Creator implements Parcelable.Creator<Notification> {
        @Override // android.os.Parcelable.Creator
        public final Notification createFromParcel(Parcel parcel) {
            Intrinsics2.m13089e(parcel, "in");
            return new Notification(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? User.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Notification[] newArray(int i) {
            return new Notification[i];
        }
    }

    public Notification(int i, int i2, User user, String str, String str2, int i3, Integer num, String str3, String str4, String str5, int i4, String str6, String str7, String str8) {
        Intrinsics2.m13089e(str, "type");
        Intrinsics2.m13089e(str4, "message");
        this.f33496id = i;
        this.userId = i2;
        this.sender = user;
        this.type = str;
        this.subType = str2;
        this.contentId = i3;
        this.subContentId = num;
        this.title = str3;
        this.message = str4;
        this.image = str5;
        this.isRead = i4;
        this.pushedAt = str6;
        this.createdAt = str7;
        this.updatedAt = str8;
    }

    public final int component1() {
        return this.f33496id;
    }

    public final String component10() {
        return this.image;
    }

    public final int component11() {
        return this.isRead;
    }

    public final String component12() {
        return this.pushedAt;
    }

    public final String component13() {
        return this.createdAt;
    }

    public final String component14() {
        return this.updatedAt;
    }

    public final int component2() {
        return this.userId;
    }

    public final User component3() {
        return this.sender;
    }

    public final String component4() {
        return this.type;
    }

    public final String component5() {
        return this.subType;
    }

    public final int component6() {
        return this.contentId;
    }

    public final Integer component7() {
        return this.subContentId;
    }

    public final String component8() {
        return this.title;
    }

    public final String component9() {
        return this.message;
    }

    public final Notification copy(int i, int i2, User user, String str, String str2, int i3, Integer num, String str3, String str4, String str5, int i4, String str6, String str7, String str8) {
        Intrinsics2.m13089e(str, "type");
        Intrinsics2.m13089e(str4, "message");
        return new Notification(i, i2, user, str, str2, i3, num, str3, str4, str5, i4, str6, str7, str8);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Notification)) {
            return false;
        }
        Notification notification = (Notification) obj;
        return this.f33496id == notification.f33496id && this.userId == notification.userId && Intrinsics2.m13085a(this.sender, notification.sender) && Intrinsics2.m13085a(this.type, notification.type) && Intrinsics2.m13085a(this.subType, notification.subType) && this.contentId == notification.contentId && Intrinsics2.m13085a(this.subContentId, notification.subContentId) && Intrinsics2.m13085a(this.title, notification.title) && Intrinsics2.m13085a(this.message, notification.message) && Intrinsics2.m13085a(this.image, notification.image) && this.isRead == notification.isRead && Intrinsics2.m13085a(this.pushedAt, notification.pushedAt) && Intrinsics2.m13085a(this.createdAt, notification.createdAt) && Intrinsics2.m13085a(this.updatedAt, notification.updatedAt);
    }

    public final int getContentId() {
        return this.contentId;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final int getId() {
        return this.f33496id;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPushedAt() {
        return this.pushedAt;
    }

    public final User getSender() {
        return this.sender;
    }

    public final Integer getSubContentId() {
        return this.subContentId;
    }

    public final String getSubType() {
        return this.subType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int i = ((this.f33496id * 31) + this.userId) * 31;
        User user = this.sender;
        int iHashCode = (i + (user != null ? user.hashCode() : 0)) * 31;
        String str = this.type;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.subType;
        int iHashCode3 = (((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.contentId) * 31;
        Integer num = this.subContentId;
        int iHashCode4 = (iHashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.title;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.message;
        int iHashCode6 = (iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.image;
        int iHashCode7 = (((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.isRead) * 31;
        String str6 = this.pushedAt;
        int iHashCode8 = (iHashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.createdAt;
        int iHashCode9 = (iHashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.updatedAt;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public final int isRead() {
        return this.isRead;
    }

    public final void setContentId(int i) {
        this.contentId = i;
    }

    public final void setCreatedAt(String str) {
        this.createdAt = str;
    }

    public final void setId(int i) {
        this.f33496id = i;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final void setMessage(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.message = str;
    }

    public final void setPushedAt(String str) {
        this.pushedAt = str;
    }

    public final void setRead(int i) {
        this.isRead = i;
    }

    public final void setSender(User user) {
        this.sender = user;
    }

    public final void setSubContentId(Integer num) {
        this.subContentId = num;
    }

    public final void setSubType(String str) {
        this.subType = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.type = str;
    }

    public final void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public final void setUserId(int i) {
        this.userId = i;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Notification(id=");
        sbM1556G.append(this.f33496id);
        sbM1556G.append(", userId=");
        sbM1556G.append(this.userId);
        sbM1556G.append(", sender=");
        sbM1556G.append(this.sender);
        sbM1556G.append(", type=");
        sbM1556G.append(this.type);
        sbM1556G.append(", subType=");
        sbM1556G.append(this.subType);
        sbM1556G.append(", contentId=");
        sbM1556G.append(this.contentId);
        sbM1556G.append(", subContentId=");
        sbM1556G.append(this.subContentId);
        sbM1556G.append(", title=");
        sbM1556G.append(this.title);
        sbM1556G.append(", message=");
        sbM1556G.append(this.message);
        sbM1556G.append(", image=");
        sbM1556G.append(this.image);
        sbM1556G.append(", isRead=");
        sbM1556G.append(this.isRead);
        sbM1556G.append(", pushedAt=");
        sbM1556G.append(this.pushedAt);
        sbM1556G.append(", createdAt=");
        sbM1556G.append(this.createdAt);
        sbM1556G.append(", updatedAt=");
        return outline.m1550A(sbM1556G, this.updatedAt, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics2.m13089e(parcel, "parcel");
        parcel.writeInt(this.f33496id);
        parcel.writeInt(this.userId);
        User user = this.sender;
        if (user != null) {
            parcel.writeInt(1);
            user.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.type);
        parcel.writeString(this.subType);
        parcel.writeInt(this.contentId);
        Integer num = this.subContentId;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        parcel.writeString(this.image);
        parcel.writeInt(this.isRead);
        parcel.writeString(this.pushedAt);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
    }

    public /* synthetic */ Notification(int i, int i2, User user, String str, String str2, int i3, Integer num, String str3, String str4, String str5, int i4, String str6, String str7, String str8, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i5 & 4) != 0 ? null : user, str, (i5 & 16) != 0 ? null : str2, i3, (i5 & 64) != 0 ? 0 : num, (i5 & 128) != 0 ? null : str3, str4, (i5 & 512) != 0 ? null : str5, i4, (i5 & 2048) != 0 ? null : str6, (i5 & 4096) != 0 ? null : str7, (i5 & 8192) != 0 ? null : str8);
    }
}
