package mtp.media.karaoke.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.p431d0.SerializedName;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: compiled from: Comment.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Comment implements Parcelable {
    public static final Parcelable.Creator<Comment> CREATOR = new Creator();

    @SerializedName("content_id")
    private int contentId;

    @SerializedName("content_type")
    private String contentType;

    @SerializedName("created_at")
    private String createdAt;

    /* JADX INFO: renamed from: id */
    private int f33487id;

    @SerializedName("like_count")
    private int likeCount;

    @SerializedName("like_status")
    private boolean likeStatus;
    private String message;

    @SerializedName("parent_id")
    private int parentId;
    private User quote;

    @SerializedName("quote_id")
    private int quoteId;

    @SerializedName("reply_count")
    private int replyCount;

    @SerializedName("updated_at")
    private String updatedAt;
    private User user;

    @SerializedName("user_id")
    private int userId;

    public static class Creator implements Parcelable.Creator<Comment> {
        @Override // android.os.Parcelable.Creator
        public final Comment createFromParcel(Parcel parcel) {
            Intrinsics2.m13089e(parcel, "in");
            return new Comment(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? User.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? User.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Comment[] newArray(int i) {
            return new Comment[i];
        }
    }

    public Comment(int i, int i2, User user, int i3, int i4, User user2, String str, int i5, int i6, boolean z, int i7, String str2, String str3, String str4) {
        Intrinsics2.m13089e(str, "message");
        Intrinsics2.m13089e(str2, "contentType");
        Intrinsics2.m13089e(str3, "createdAt");
        Intrinsics2.m13089e(str4, "updatedAt");
        this.f33487id = i;
        this.userId = i2;
        this.user = user;
        this.parentId = i3;
        this.quoteId = i4;
        this.quote = user2;
        this.message = str;
        this.likeCount = i5;
        this.replyCount = i6;
        this.likeStatus = z;
        this.contentId = i7;
        this.contentType = str2;
        this.createdAt = str3;
        this.updatedAt = str4;
    }

    public final int component1() {
        return this.f33487id;
    }

    public final boolean component10() {
        return this.likeStatus;
    }

    public final int component11() {
        return this.contentId;
    }

    public final String component12() {
        return this.contentType;
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
        return this.user;
    }

    public final int component4() {
        return this.parentId;
    }

    public final int component5() {
        return this.quoteId;
    }

    public final User component6() {
        return this.quote;
    }

    public final String component7() {
        return this.message;
    }

    public final int component8() {
        return this.likeCount;
    }

    public final int component9() {
        return this.replyCount;
    }

    public final Comment copy(int i, int i2, User user, int i3, int i4, User user2, String str, int i5, int i6, boolean z, int i7, String str2, String str3, String str4) {
        Intrinsics2.m13089e(str, "message");
        Intrinsics2.m13089e(str2, "contentType");
        Intrinsics2.m13089e(str3, "createdAt");
        Intrinsics2.m13089e(str4, "updatedAt");
        return new Comment(i, i2, user, i3, i4, user2, str, i5, i6, z, i7, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Comment)) {
            return false;
        }
        Comment comment = (Comment) obj;
        return this.f33487id == comment.f33487id && this.userId == comment.userId && Intrinsics2.m13085a(this.user, comment.user) && this.parentId == comment.parentId && this.quoteId == comment.quoteId && Intrinsics2.m13085a(this.quote, comment.quote) && Intrinsics2.m13085a(this.message, comment.message) && this.likeCount == comment.likeCount && this.replyCount == comment.replyCount && this.likeStatus == comment.likeStatus && this.contentId == comment.contentId && Intrinsics2.m13085a(this.contentType, comment.contentType) && Intrinsics2.m13085a(this.createdAt, comment.createdAt) && Intrinsics2.m13085a(this.updatedAt, comment.updatedAt);
    }

    public final int getContentId() {
        return this.contentId;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final int getId() {
        return this.f33487id;
    }

    public final int getLikeCount() {
        return this.likeCount;
    }

    public final boolean getLikeStatus() {
        return this.likeStatus;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getParentId() {
        return this.parentId;
    }

    public final User getQuote() {
        return this.quote;
    }

    public final int getQuoteId() {
        return this.quoteId;
    }

    public final int getReplyCount() {
        return this.replyCount;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v30 */
    public int hashCode() {
        int i = ((this.f33487id * 31) + this.userId) * 31;
        User user = this.user;
        int iHashCode = (((((i + (user != null ? user.hashCode() : 0)) * 31) + this.parentId) * 31) + this.quoteId) * 31;
        User user2 = this.quote;
        int iHashCode2 = (iHashCode + (user2 != null ? user2.hashCode() : 0)) * 31;
        String str = this.message;
        int iHashCode3 = (((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.likeCount) * 31) + this.replyCount) * 31;
        boolean z = this.likeStatus;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (((iHashCode3 + r1) * 31) + this.contentId) * 31;
        String str2 = this.contentType;
        int iHashCode4 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.createdAt;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.updatedAt;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setContentId(int i) {
        this.contentId = i;
    }

    public final void setContentType(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.contentType = str;
    }

    public final void setCreatedAt(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.createdAt = str;
    }

    public final void setId(int i) {
        this.f33487id = i;
    }

    public final void setLikeCount(int i) {
        this.likeCount = i;
    }

    public final void setLikeStatus(boolean z) {
        this.likeStatus = z;
    }

    public final void setMessage(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.message = str;
    }

    public final void setParentId(int i) {
        this.parentId = i;
    }

    public final void setQuote(User user) {
        this.quote = user;
    }

    public final void setQuoteId(int i) {
        this.quoteId = i;
    }

    public final void setReplyCount(int i) {
        this.replyCount = i;
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
        StringBuilder sbM1556G = outline.m1556G("Comment(id=");
        sbM1556G.append(this.f33487id);
        sbM1556G.append(", userId=");
        sbM1556G.append(this.userId);
        sbM1556G.append(", user=");
        sbM1556G.append(this.user);
        sbM1556G.append(", parentId=");
        sbM1556G.append(this.parentId);
        sbM1556G.append(", quoteId=");
        sbM1556G.append(this.quoteId);
        sbM1556G.append(", quote=");
        sbM1556G.append(this.quote);
        sbM1556G.append(", message=");
        sbM1556G.append(this.message);
        sbM1556G.append(", likeCount=");
        sbM1556G.append(this.likeCount);
        sbM1556G.append(", replyCount=");
        sbM1556G.append(this.replyCount);
        sbM1556G.append(", likeStatus=");
        sbM1556G.append(this.likeStatus);
        sbM1556G.append(", contentId=");
        sbM1556G.append(this.contentId);
        sbM1556G.append(", contentType=");
        sbM1556G.append(this.contentType);
        sbM1556G.append(", createdAt=");
        sbM1556G.append(this.createdAt);
        sbM1556G.append(", updatedAt=");
        return outline.m1550A(sbM1556G, this.updatedAt, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics2.m13089e(parcel, "parcel");
        parcel.writeInt(this.f33487id);
        parcel.writeInt(this.userId);
        User user = this.user;
        if (user != null) {
            parcel.writeInt(1);
            user.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.parentId);
        parcel.writeInt(this.quoteId);
        User user2 = this.quote;
        if (user2 != null) {
            parcel.writeInt(1);
            user2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.message);
        parcel.writeInt(this.likeCount);
        parcel.writeInt(this.replyCount);
        parcel.writeInt(this.likeStatus ? 1 : 0);
        parcel.writeInt(this.contentId);
        parcel.writeString(this.contentType);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
    }
}
