package mtp.media.karaoke.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.p431d0.SerializedName;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: compiled from: User.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class User implements Parcelable {
    public static final Parcelable.Creator<User> CREATOR = new Creator();

    @SerializedName("access_token")
    private final String accessToken;
    private final String address;
    private final String avatar;
    private final String bio;
    private final String birthday;
    private final String city;
    private int coins;
    private final String country;
    private final String cover;

    @SerializedName("created_at")
    private final String createdAt;

    @SerializedName("current_level_exps")
    private final int currentLevelExps;
    private int diamonds;
    private final Float distance;
    private final String email;
    private int exps;

    @SerializedName("fb_user_id")
    private final String fbUserId;

    @SerializedName("follow_status")
    private boolean followStatus;

    @SerializedName("follower_count")
    private int followerCount;

    @SerializedName("following_count")
    private final int followingCount;

    @SerializedName("full_name")
    private final String fullName;
    private final int gender;

    @SerializedName("gg_user_id")
    private final String ggUserId;

    @SerializedName("gift_count")
    private final int giftCount;

    /* JADX INFO: renamed from: id */
    private final int f33504id;

    @SerializedName("label")
    private final String label;
    private final String language;

    @SerializedName("lat")
    private final Double latitude;
    private final int level;

    @SerializedName("long")
    private final Double longitude;

    @SerializedName("next_level_exps")
    private final int nextLevelExps;

    @SerializedName("notification_count")
    private final int notificationCount;
    private final String phone;

    @SerializedName("play_count")
    private final int playCount;

    @SerializedName("recording_count")
    private final int recordingCount;
    private final String region;
    private final int stars;
    private final String uid;

    @SerializedName("updated_at")
    private final String updatedAt;

    public static class Creator implements Parcelable.Creator<User> {
        @Override // android.os.Parcelable.Creator
        public final User createFromParcel(Parcel parcel) {
            Intrinsics2.m13089e(parcel, "in");
            return new User(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null, parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null, parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final User[] newArray(int i) {
            return new User[i];
        }
    }

    public User(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i2, String str14, String str15, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str16, int i10, int i11, int i12, int i13, int i14, int i15, Double d, Double d2, Float f, String str17, boolean z, String str18, String str19) {
        Intrinsics2.m13089e(str, "uid");
        Intrinsics2.m13089e(str4, "fullName");
        this.f33504id = i;
        this.uid = str;
        this.fbUserId = str2;
        this.ggUserId = str3;
        this.fullName = str4;
        this.email = str5;
        this.address = str6;
        this.city = str7;
        this.country = str8;
        this.language = str9;
        this.region = str10;
        this.phone = str11;
        this.avatar = str12;
        this.cover = str13;
        this.gender = i2;
        this.birthday = str14;
        this.bio = str15;
        this.level = i3;
        this.currentLevelExps = i4;
        this.nextLevelExps = i5;
        this.diamonds = i6;
        this.coins = i7;
        this.stars = i8;
        this.exps = i9;
        this.accessToken = str16;
        this.recordingCount = i10;
        this.notificationCount = i11;
        this.followingCount = i12;
        this.followerCount = i13;
        this.giftCount = i14;
        this.playCount = i15;
        this.latitude = d;
        this.longitude = d2;
        this.distance = f;
        this.label = str17;
        this.followStatus = z;
        this.createdAt = str18;
        this.updatedAt = str19;
    }

    public final int component1() {
        return this.f33504id;
    }

    public final String component10() {
        return this.language;
    }

    public final String component11() {
        return this.region;
    }

    public final String component12() {
        return this.phone;
    }

    public final String component13() {
        return this.avatar;
    }

    public final String component14() {
        return this.cover;
    }

    public final int component15() {
        return this.gender;
    }

    public final String component16() {
        return this.birthday;
    }

    public final String component17() {
        return this.bio;
    }

    public final int component18() {
        return this.level;
    }

    public final int component19() {
        return this.currentLevelExps;
    }

    public final String component2() {
        return this.uid;
    }

    public final int component20() {
        return this.nextLevelExps;
    }

    public final int component21() {
        return this.diamonds;
    }

    public final int component22() {
        return this.coins;
    }

    public final int component23() {
        return this.stars;
    }

    public final int component24() {
        return this.exps;
    }

    public final String component25() {
        return this.accessToken;
    }

    public final int component26() {
        return this.recordingCount;
    }

    public final int component27() {
        return this.notificationCount;
    }

    public final int component28() {
        return this.followingCount;
    }

    public final int component29() {
        return this.followerCount;
    }

    public final String component3() {
        return this.fbUserId;
    }

    public final int component30() {
        return this.giftCount;
    }

    public final int component31() {
        return this.playCount;
    }

    public final Double component32() {
        return this.latitude;
    }

    public final Double component33() {
        return this.longitude;
    }

    public final Float component34() {
        return this.distance;
    }

    public final String component35() {
        return this.label;
    }

    public final boolean component36() {
        return this.followStatus;
    }

    public final String component37() {
        return this.createdAt;
    }

    public final String component38() {
        return this.updatedAt;
    }

    public final String component4() {
        return this.ggUserId;
    }

    public final String component5() {
        return this.fullName;
    }

    public final String component6() {
        return this.email;
    }

    public final String component7() {
        return this.address;
    }

    public final String component8() {
        return this.city;
    }

    public final String component9() {
        return this.country;
    }

    public final User copy(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i2, String str14, String str15, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str16, int i10, int i11, int i12, int i13, int i14, int i15, Double d, Double d2, Float f, String str17, boolean z, String str18, String str19) {
        Intrinsics2.m13089e(str, "uid");
        Intrinsics2.m13089e(str4, "fullName");
        return new User(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, i2, str14, str15, i3, i4, i5, i6, i7, i8, i9, str16, i10, i11, i12, i13, i14, i15, d, d2, f, str17, z, str18, str19);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return this.f33504id == user.f33504id && Intrinsics2.m13085a(this.uid, user.uid) && Intrinsics2.m13085a(this.fbUserId, user.fbUserId) && Intrinsics2.m13085a(this.ggUserId, user.ggUserId) && Intrinsics2.m13085a(this.fullName, user.fullName) && Intrinsics2.m13085a(this.email, user.email) && Intrinsics2.m13085a(this.address, user.address) && Intrinsics2.m13085a(this.city, user.city) && Intrinsics2.m13085a(this.country, user.country) && Intrinsics2.m13085a(this.language, user.language) && Intrinsics2.m13085a(this.region, user.region) && Intrinsics2.m13085a(this.phone, user.phone) && Intrinsics2.m13085a(this.avatar, user.avatar) && Intrinsics2.m13085a(this.cover, user.cover) && this.gender == user.gender && Intrinsics2.m13085a(this.birthday, user.birthday) && Intrinsics2.m13085a(this.bio, user.bio) && this.level == user.level && this.currentLevelExps == user.currentLevelExps && this.nextLevelExps == user.nextLevelExps && this.diamonds == user.diamonds && this.coins == user.coins && this.stars == user.stars && this.exps == user.exps && Intrinsics2.m13085a(this.accessToken, user.accessToken) && this.recordingCount == user.recordingCount && this.notificationCount == user.notificationCount && this.followingCount == user.followingCount && this.followerCount == user.followerCount && this.giftCount == user.giftCount && this.playCount == user.playCount && Intrinsics2.m13085a(this.latitude, user.latitude) && Intrinsics2.m13085a(this.longitude, user.longitude) && Intrinsics2.m13085a(this.distance, user.distance) && Intrinsics2.m13085a(this.label, user.label) && this.followStatus == user.followStatus && Intrinsics2.m13085a(this.createdAt, user.createdAt) && Intrinsics2.m13085a(this.updatedAt, user.updatedAt);
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getAddress() {
        return this.address;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getBio() {
        return this.bio;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final String getCity() {
        return this.city;
    }

    public final int getCoins() {
        return this.coins;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getCover() {
        return this.cover;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final int getCurrentLevelExps() {
        return this.currentLevelExps;
    }

    public final int getDiamonds() {
        return this.diamonds;
    }

    public final Float getDistance() {
        return this.distance;
    }

    public final String getEmail() {
        return this.email;
    }

    public final int getExps() {
        return this.exps;
    }

    public final String getFbUserId() {
        return this.fbUserId;
    }

    public final boolean getFollowStatus() {
        return this.followStatus;
    }

    public final int getFollowerCount() {
        return this.followerCount;
    }

    public final int getFollowingCount() {
        return this.followingCount;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final int getGender() {
        return this.gender;
    }

    public final String getGgUserId() {
        return this.ggUserId;
    }

    public final int getGiftCount() {
        return this.giftCount;
    }

    public final int getId() {
        return this.f33504id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final int getLevel() {
        return this.level;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final int getNextLevelExps() {
        return this.nextLevelExps;
    }

    public final int getNotificationCount() {
        return this.notificationCount;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final int getPlayCount() {
        return this.playCount;
    }

    public final int getRecordingCount() {
        return this.recordingCount;
    }

    public final String getRegion() {
        return this.region;
    }

    public final int getStars() {
        return this.stars;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v70, types: [int] */
    /* JADX WARN: Type inference failed for: r1v102 */
    /* JADX WARN: Type inference failed for: r1v75, types: [int] */
    /* JADX WARN: Type inference failed for: r1v81 */
    public int hashCode() {
        int i = this.f33504id * 31;
        String str = this.uid;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.fbUserId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.ggUserId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.fullName;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.email;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.address;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.city;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.country;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.language;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.region;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.phone;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.avatar;
        int iHashCode12 = (iHashCode11 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.cover;
        int iHashCode13 = (((iHashCode12 + (str13 != null ? str13.hashCode() : 0)) * 31) + this.gender) * 31;
        String str14 = this.birthday;
        int iHashCode14 = (iHashCode13 + (str14 != null ? str14.hashCode() : 0)) * 31;
        String str15 = this.bio;
        int iHashCode15 = (((((((((((((((iHashCode14 + (str15 != null ? str15.hashCode() : 0)) * 31) + this.level) * 31) + this.currentLevelExps) * 31) + this.nextLevelExps) * 31) + this.diamonds) * 31) + this.coins) * 31) + this.stars) * 31) + this.exps) * 31;
        String str16 = this.accessToken;
        int iHashCode16 = (((((((((((((iHashCode15 + (str16 != null ? str16.hashCode() : 0)) * 31) + this.recordingCount) * 31) + this.notificationCount) * 31) + this.followingCount) * 31) + this.followerCount) * 31) + this.giftCount) * 31) + this.playCount) * 31;
        Double d = this.latitude;
        int iHashCode17 = (iHashCode16 + (d != null ? d.hashCode() : 0)) * 31;
        Double d2 = this.longitude;
        int iHashCode18 = (iHashCode17 + (d2 != null ? d2.hashCode() : 0)) * 31;
        Float f = this.distance;
        int iHashCode19 = (iHashCode18 + (f != null ? f.hashCode() : 0)) * 31;
        String str17 = this.label;
        int iHashCode20 = (iHashCode19 + (str17 != null ? str17.hashCode() : 0)) * 31;
        boolean z = this.followStatus;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (iHashCode20 + r1) * 31;
        String str18 = this.createdAt;
        int iHashCode21 = (i2 + (str18 != null ? str18.hashCode() : 0)) * 31;
        String str19 = this.updatedAt;
        return iHashCode21 + (str19 != null ? str19.hashCode() : 0);
    }

    public final void setCoins(int i) {
        this.coins = i;
    }

    public final void setDiamonds(int i) {
        this.diamonds = i;
    }

    public final void setExps(int i) {
        this.exps = i;
    }

    public final void setFollowStatus(boolean z) {
        this.followStatus = z;
    }

    public final void setFollowerCount(int i) {
        this.followerCount = i;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("User(id=");
        sbM1556G.append(this.f33504id);
        sbM1556G.append(", uid=");
        sbM1556G.append(this.uid);
        sbM1556G.append(", fbUserId=");
        sbM1556G.append(this.fbUserId);
        sbM1556G.append(", ggUserId=");
        sbM1556G.append(this.ggUserId);
        sbM1556G.append(", fullName=");
        sbM1556G.append(this.fullName);
        sbM1556G.append(", email=");
        sbM1556G.append(this.email);
        sbM1556G.append(", address=");
        sbM1556G.append(this.address);
        sbM1556G.append(", city=");
        sbM1556G.append(this.city);
        sbM1556G.append(", country=");
        sbM1556G.append(this.country);
        sbM1556G.append(", language=");
        sbM1556G.append(this.language);
        sbM1556G.append(", region=");
        sbM1556G.append(this.region);
        sbM1556G.append(", phone=");
        sbM1556G.append(this.phone);
        sbM1556G.append(", avatar=");
        sbM1556G.append(this.avatar);
        sbM1556G.append(", cover=");
        sbM1556G.append(this.cover);
        sbM1556G.append(", gender=");
        sbM1556G.append(this.gender);
        sbM1556G.append(", birthday=");
        sbM1556G.append(this.birthday);
        sbM1556G.append(", bio=");
        sbM1556G.append(this.bio);
        sbM1556G.append(", level=");
        sbM1556G.append(this.level);
        sbM1556G.append(", currentLevelExps=");
        sbM1556G.append(this.currentLevelExps);
        sbM1556G.append(", nextLevelExps=");
        sbM1556G.append(this.nextLevelExps);
        sbM1556G.append(", diamonds=");
        sbM1556G.append(this.diamonds);
        sbM1556G.append(", coins=");
        sbM1556G.append(this.coins);
        sbM1556G.append(", stars=");
        sbM1556G.append(this.stars);
        sbM1556G.append(", exps=");
        sbM1556G.append(this.exps);
        sbM1556G.append(", accessToken=");
        sbM1556G.append(this.accessToken);
        sbM1556G.append(", recordingCount=");
        sbM1556G.append(this.recordingCount);
        sbM1556G.append(", notificationCount=");
        sbM1556G.append(this.notificationCount);
        sbM1556G.append(", followingCount=");
        sbM1556G.append(this.followingCount);
        sbM1556G.append(", followerCount=");
        sbM1556G.append(this.followerCount);
        sbM1556G.append(", giftCount=");
        sbM1556G.append(this.giftCount);
        sbM1556G.append(", playCount=");
        sbM1556G.append(this.playCount);
        sbM1556G.append(", latitude=");
        sbM1556G.append(this.latitude);
        sbM1556G.append(", longitude=");
        sbM1556G.append(this.longitude);
        sbM1556G.append(", distance=");
        sbM1556G.append(this.distance);
        sbM1556G.append(", label=");
        sbM1556G.append(this.label);
        sbM1556G.append(", followStatus=");
        sbM1556G.append(this.followStatus);
        sbM1556G.append(", createdAt=");
        sbM1556G.append(this.createdAt);
        sbM1556G.append(", updatedAt=");
        return outline.m1550A(sbM1556G, this.updatedAt, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics2.m13089e(parcel, "parcel");
        parcel.writeInt(this.f33504id);
        parcel.writeString(this.uid);
        parcel.writeString(this.fbUserId);
        parcel.writeString(this.ggUserId);
        parcel.writeString(this.fullName);
        parcel.writeString(this.email);
        parcel.writeString(this.address);
        parcel.writeString(this.city);
        parcel.writeString(this.country);
        parcel.writeString(this.language);
        parcel.writeString(this.region);
        parcel.writeString(this.phone);
        parcel.writeString(this.avatar);
        parcel.writeString(this.cover);
        parcel.writeInt(this.gender);
        parcel.writeString(this.birthday);
        parcel.writeString(this.bio);
        parcel.writeInt(this.level);
        parcel.writeInt(this.currentLevelExps);
        parcel.writeInt(this.nextLevelExps);
        parcel.writeInt(this.diamonds);
        parcel.writeInt(this.coins);
        parcel.writeInt(this.stars);
        parcel.writeInt(this.exps);
        parcel.writeString(this.accessToken);
        parcel.writeInt(this.recordingCount);
        parcel.writeInt(this.notificationCount);
        parcel.writeInt(this.followingCount);
        parcel.writeInt(this.followerCount);
        parcel.writeInt(this.giftCount);
        parcel.writeInt(this.playCount);
        Double d = this.latitude;
        if (d != null) {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        } else {
            parcel.writeInt(0);
        }
        Double d2 = this.longitude;
        if (d2 != null) {
            parcel.writeInt(1);
            parcel.writeDouble(d2.doubleValue());
        } else {
            parcel.writeInt(0);
        }
        Float f = this.distance;
        if (f != null) {
            parcel.writeInt(1);
            parcel.writeFloat(f.floatValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.label);
        parcel.writeInt(this.followStatus ? 1 : 0);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
    }
}
