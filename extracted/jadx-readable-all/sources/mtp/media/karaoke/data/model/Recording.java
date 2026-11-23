package mtp.media.karaoke.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Objects;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.p431d0.SerializedName;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;
import p555j.p556a.p557a.p606h.p609c.p610a.SkuDao;
import p555j.p556a.p557a.p619l.UnitConversionUtils;
import p555j.p556a.p557a.p619l.UnitConversionUtils2;

/* JADX INFO: compiled from: Recording.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Recording implements Parcelable {
    public static final Parcelable.Creator<Recording> CREATOR = new Creator();

    @SerializedName("comment_count")
    private int commentCount;

    @SerializedName("created_at")
    private String createdAt;
    private Duet duet;

    @SerializedName("duet_count")
    private int duetCount;

    @SerializedName("duet_id")
    private int duetId;
    private Integer duration;
    private Integer effect;

    @SerializedName("effect_custom")
    private String effectCustom;
    private int format;

    @SerializedName("gift_count")
    private int giftCount;

    /* JADX INFO: renamed from: id */
    private final int f33499id;

    @SerializedName("image_ids")
    private String imageIds;
    private ArrayList<Image> images;

    @SerializedName("like_count")
    private int likeCount;

    @SerializedName("like_status")
    private boolean likeStatus;
    private String message;
    private String name;
    private int pin;

    @SerializedName("play_count")
    private int playCount;
    private int privacy;

    @SerializedName("share_count")
    private int shareCount;

    @SerializedName("share_url")
    private String shareUrl;
    private String slug;
    private Song song;

    @SerializedName("song_id")
    private int songId;

    @SerializedName("star_count")
    private Integer starCount;
    private int status;
    private String thumbnail;
    private int type;

    @SerializedName("updated_at")
    private String updatedAt;
    private String url;

    @SerializedName("url_video_resize")
    private String urlVideoResize;

    @SerializedName("use_headphone")
    private Boolean useHeadphone;
    private User user;

    @SerializedName("user_id")
    private int userId;

    @SerializedName("video_ratio")
    private int videoRatio;

    public static class Creator implements Parcelable.Creator<Recording> {
        @Override // android.os.Parcelable.Creator
        public final Recording createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String str;
            ArrayList arrayList;
            Intrinsics2.m13089e(parcel, "in");
            int i = parcel.readInt();
            String string = parcel.readString();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            int i5 = parcel.readInt();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            int i6 = parcel.readInt();
            int i7 = parcel.readInt();
            int i8 = parcel.readInt();
            int i9 = parcel.readInt();
            int i10 = parcel.readInt();
            int i11 = parcel.readInt();
            Integer numValueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            Integer numValueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            Integer numValueOf3 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String string8 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                boolValueOf = null;
            }
            int i14 = parcel.readInt();
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                int i15 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i15);
                while (true) {
                    str = string7;
                    if (i15 == 0) {
                        break;
                    }
                    arrayList2.add(Image.CREATOR.createFromParcel(parcel));
                    i15--;
                    string7 = str;
                }
                arrayList = arrayList2;
            } else {
                str = string7;
                arrayList = null;
            }
            return new Recording(i, string, i2, i3, i4, string2, string3, string4, string5, i5, string6, str, i6, i7, i8, i9, i10, i11, numValueOf, i12, i13, numValueOf2, numValueOf3, string8, boolValueOf, i14, z, arrayList, parcel.readInt() != 0 ? User.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Duet.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? Song.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Recording[] newArray(int i) {
            return new Recording[i];
        }
    }

    public Recording(int i, String str, int i2, int i3, int i4, String str2, String str3, String str4, String str5, int i5, String str6, String str7, int i6, int i7, int i8, int i9, int i10, int i11, Integer num, int i12, int i13, Integer num2, Integer num3, String str8, Boolean bool, int i14, boolean z, ArrayList<Image> arrayList, User user, Duet duet, Song song, int i15, int i16, String str9, String str10, String str11) {
        Intrinsics2.m13089e(str, "name");
        Intrinsics2.m13089e(str3, "slug");
        Intrinsics2.m13089e(str4, "thumbnail");
        Intrinsics2.m13089e(str5, "url");
        Intrinsics2.m13089e(str7, "shareUrl");
        Intrinsics2.m13089e(str10, "createdAt");
        Intrinsics2.m13089e(str11, "updatedAt");
        this.f33499id = i;
        this.name = str;
        this.userId = i2;
        this.songId = i3;
        this.duetId = i4;
        this.message = str2;
        this.slug = str3;
        this.thumbnail = str4;
        this.url = str5;
        this.type = i5;
        this.imageIds = str6;
        this.shareUrl = str7;
        this.playCount = i6;
        this.likeCount = i7;
        this.commentCount = i8;
        this.shareCount = i9;
        this.giftCount = i10;
        this.duetCount = i11;
        this.starCount = num;
        this.privacy = i12;
        this.pin = i13;
        this.duration = num2;
        this.effect = num3;
        this.effectCustom = str8;
        this.useHeadphone = bool;
        this.status = i14;
        this.likeStatus = z;
        this.images = arrayList;
        this.user = user;
        this.duet = duet;
        this.song = song;
        this.format = i15;
        this.videoRatio = i16;
        this.urlVideoResize = str9;
        this.createdAt = str10;
        this.updatedAt = str11;
    }

    public final int component1() {
        return this.f33499id;
    }

    public final int component10() {
        return this.type;
    }

    public final String component11() {
        return this.imageIds;
    }

    public final String component12() {
        return this.shareUrl;
    }

    public final int component13() {
        return this.playCount;
    }

    public final int component14() {
        return this.likeCount;
    }

    public final int component15() {
        return this.commentCount;
    }

    public final int component16() {
        return this.shareCount;
    }

    public final int component17() {
        return this.giftCount;
    }

    public final int component18() {
        return this.duetCount;
    }

    public final Integer component19() {
        return this.starCount;
    }

    public final String component2() {
        return this.name;
    }

    public final int component20() {
        return this.privacy;
    }

    public final int component21() {
        return this.pin;
    }

    public final Integer component22() {
        return this.duration;
    }

    public final Integer component23() {
        return this.effect;
    }

    public final String component24() {
        return this.effectCustom;
    }

    public final Boolean component25() {
        return this.useHeadphone;
    }

    public final int component26() {
        return this.status;
    }

    public final boolean component27() {
        return this.likeStatus;
    }

    public final ArrayList<Image> component28() {
        return this.images;
    }

    public final User component29() {
        return this.user;
    }

    public final int component3() {
        return this.userId;
    }

    public final Duet component30() {
        return this.duet;
    }

    public final Song component31() {
        return this.song;
    }

    public final int component32() {
        return this.format;
    }

    public final int component33() {
        return this.videoRatio;
    }

    public final String component34() {
        return this.urlVideoResize;
    }

    public final String component35() {
        return this.createdAt;
    }

    public final String component36() {
        return this.updatedAt;
    }

    public final int component4() {
        return this.songId;
    }

    public final int component5() {
        return this.duetId;
    }

    public final String component6() {
        return this.message;
    }

    public final String component7() {
        return this.slug;
    }

    public final String component8() {
        return this.thumbnail;
    }

    public final String component9() {
        return this.url;
    }

    public final Recording copy(int i, String str, int i2, int i3, int i4, String str2, String str3, String str4, String str5, int i5, String str6, String str7, int i6, int i7, int i8, int i9, int i10, int i11, Integer num, int i12, int i13, Integer num2, Integer num3, String str8, Boolean bool, int i14, boolean z, ArrayList<Image> arrayList, User user, Duet duet, Song song, int i15, int i16, String str9, String str10, String str11) {
        Intrinsics2.m13089e(str, "name");
        Intrinsics2.m13089e(str3, "slug");
        Intrinsics2.m13089e(str4, "thumbnail");
        Intrinsics2.m13089e(str5, "url");
        Intrinsics2.m13089e(str7, "shareUrl");
        Intrinsics2.m13089e(str10, "createdAt");
        Intrinsics2.m13089e(str11, "updatedAt");
        return new Recording(i, str, i2, i3, i4, str2, str3, str4, str5, i5, str6, str7, i6, i7, i8, i9, i10, i11, num, i12, i13, num2, num3, str8, bool, i14, z, arrayList, user, duet, song, i15, i16, str9, str10, str11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Recording)) {
            return false;
        }
        Recording recording = (Recording) obj;
        return this.f33499id == recording.f33499id && Intrinsics2.m13085a(this.name, recording.name) && this.userId == recording.userId && this.songId == recording.songId && this.duetId == recording.duetId && Intrinsics2.m13085a(this.message, recording.message) && Intrinsics2.m13085a(this.slug, recording.slug) && Intrinsics2.m13085a(this.thumbnail, recording.thumbnail) && Intrinsics2.m13085a(this.url, recording.url) && this.type == recording.type && Intrinsics2.m13085a(this.imageIds, recording.imageIds) && Intrinsics2.m13085a(this.shareUrl, recording.shareUrl) && this.playCount == recording.playCount && this.likeCount == recording.likeCount && this.commentCount == recording.commentCount && this.shareCount == recording.shareCount && this.giftCount == recording.giftCount && this.duetCount == recording.duetCount && Intrinsics2.m13085a(this.starCount, recording.starCount) && this.privacy == recording.privacy && this.pin == recording.pin && Intrinsics2.m13085a(this.duration, recording.duration) && Intrinsics2.m13085a(this.effect, recording.effect) && Intrinsics2.m13085a(this.effectCustom, recording.effectCustom) && Intrinsics2.m13085a(this.useHeadphone, recording.useHeadphone) && this.status == recording.status && this.likeStatus == recording.likeStatus && Intrinsics2.m13085a(this.images, recording.images) && Intrinsics2.m13085a(this.user, recording.user) && Intrinsics2.m13085a(this.duet, recording.duet) && Intrinsics2.m13085a(this.song, recording.song) && this.format == recording.format && this.videoRatio == recording.videoRatio && Intrinsics2.m13085a(this.urlVideoResize, recording.urlVideoResize) && Intrinsics2.m13085a(this.createdAt, recording.createdAt) && Intrinsics2.m13085a(this.updatedAt, recording.updatedAt);
    }

    public final int getCommentCount() {
        return this.commentCount;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final Duet getDuet() {
        return this.duet;
    }

    public final int getDuetCount() {
        return this.duetCount;
    }

    public final int getDuetId() {
        return this.duetId;
    }

    public final Integer getDuration() {
        return this.duration;
    }

    public final Integer getEffect() {
        return this.effect;
    }

    public final String getEffectCustom() {
        return this.effectCustom;
    }

    public final int getFormat() {
        return this.format;
    }

    public final int getGiftCount() {
        return this.giftCount;
    }

    public final int getId() {
        return this.f33499id;
    }

    public final String getImageIds() {
        return this.imageIds;
    }

    public final ArrayList<Image> getImages() {
        return this.images;
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

    public final String getName() {
        return this.name;
    }

    public final int getPin() {
        return this.pin;
    }

    public final int getPlayCount() {
        return this.playCount;
    }

    public final String getPostDate() {
        Float distance;
        String string;
        Date dateM14093j = SkuDao.a.m14093j(this.createdAt, "yyyy-MM-dd HH:mm:ss");
        String strValueOf = String.valueOf(dateM14093j != null ? SkuDao.a.m14106s(dateM14093j) : null);
        User user = this.user;
        if (user == null || (distance = user.getDistance()) == null) {
            return strValueOf;
        }
        float fFloatValue = distance.floatValue();
        if (fFloatValue <= 0) {
            return strValueOf;
        }
        StringBuilder sbM1556G = outline.m1556G(strValueOf);
        if (fFloatValue < 1) {
            StringBuilder sbM1556G2 = outline.m1556G(" ᛫ ");
            Float fValueOf = Float.valueOf(fFloatValue);
            Intrinsics2.m13089e(fValueOf, "$this$kilometers");
            double dDoubleValue = fValueOf.doubleValue();
            UnitConversionUtils.a aVar = UnitConversionUtils.f33084d;
            Objects.requireNonNull(aVar);
            UnitConversionUtils2 unitConversionUtils2 = new UnitConversionUtils2(dDoubleValue, UnitConversionUtils.f33082b);
            Objects.requireNonNull(aVar);
            UnitConversionUtils unitConversionUtils = UnitConversionUtils.f33083c;
            Intrinsics2.m13089e(unitConversionUtils, "unit");
            sbM1556G2.append(SkuDao.a.m14095k((float) new UnitConversionUtils2((unitConversionUtils2.f33090a * unitConversionUtils2.f33091b.f33095a) / unitConversionUtils.f33095a, unitConversionUtils).f33090a));
            sbM1556G2.append(" m");
            string = sbM1556G2.toString();
        } else {
            StringBuilder sbM1556G3 = outline.m1556G(" ᛫ ");
            sbM1556G3.append(SkuDao.a.m14095k(fFloatValue));
            sbM1556G3.append(" km");
            string = sbM1556G3.toString();
        }
        sbM1556G.append(string);
        return sbM1556G.toString();
    }

    public final int getPrivacy() {
        return this.privacy;
    }

    public final int getShareCount() {
        return this.shareCount;
    }

    public final String getShareUrl() {
        return this.shareUrl;
    }

    public final String getSlug() {
        return this.slug;
    }

    public final Song getSong() {
        return this.song;
    }

    public final int getSongId() {
        return this.songId;
    }

    public final Integer getStarCount() {
        return this.starCount;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getUrlVideoResize() {
        return this.urlVideoResize;
    }

    public final Boolean getUseHeadphone() {
        return this.useHeadphone;
    }

    public final User getUser() {
        return this.user;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final int getVideoRatio() {
        return this.videoRatio;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v52, types: [int] */
    /* JADX WARN: Type inference failed for: r1v50, types: [int] */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v91 */
    public int hashCode() {
        int i = this.f33499id * 31;
        String str = this.name;
        int iHashCode = (((((((i + (str != null ? str.hashCode() : 0)) * 31) + this.userId) * 31) + this.songId) * 31) + this.duetId) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.slug;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.thumbnail;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.url;
        int iHashCode5 = (((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.type) * 31;
        String str6 = this.imageIds;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.shareUrl;
        int iHashCode7 = (((((((((((((iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + this.playCount) * 31) + this.likeCount) * 31) + this.commentCount) * 31) + this.shareCount) * 31) + this.giftCount) * 31) + this.duetCount) * 31;
        Integer num = this.starCount;
        int iHashCode8 = (((((iHashCode7 + (num != null ? num.hashCode() : 0)) * 31) + this.privacy) * 31) + this.pin) * 31;
        Integer num2 = this.duration;
        int iHashCode9 = (iHashCode8 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.effect;
        int iHashCode10 = (iHashCode9 + (num3 != null ? num3.hashCode() : 0)) * 31;
        String str8 = this.effectCustom;
        int iHashCode11 = (iHashCode10 + (str8 != null ? str8.hashCode() : 0)) * 31;
        Boolean bool = this.useHeadphone;
        int iHashCode12 = (((iHashCode11 + (bool != null ? bool.hashCode() : 0)) * 31) + this.status) * 31;
        boolean z = this.likeStatus;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i2 = (iHashCode12 + r1) * 31;
        ArrayList<Image> arrayList = this.images;
        int iHashCode13 = (i2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        User user = this.user;
        int iHashCode14 = (iHashCode13 + (user != null ? user.hashCode() : 0)) * 31;
        Duet duet = this.duet;
        int iHashCode15 = (iHashCode14 + (duet != null ? duet.hashCode() : 0)) * 31;
        Song song = this.song;
        int iHashCode16 = (((((iHashCode15 + (song != null ? song.hashCode() : 0)) * 31) + this.format) * 31) + this.videoRatio) * 31;
        String str9 = this.urlVideoResize;
        int iHashCode17 = (iHashCode16 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.createdAt;
        int iHashCode18 = (iHashCode17 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.updatedAt;
        return iHashCode18 + (str11 != null ? str11.hashCode() : 0);
    }

    public final void setCommentCount(int i) {
        this.commentCount = i;
    }

    public final void setCreatedAt(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.createdAt = str;
    }

    public final void setDuet(Duet duet) {
        this.duet = duet;
    }

    public final void setDuetCount(int i) {
        this.duetCount = i;
    }

    public final void setDuetId(int i) {
        this.duetId = i;
    }

    public final void setDuration(Integer num) {
        this.duration = num;
    }

    public final void setEffect(Integer num) {
        this.effect = num;
    }

    public final void setEffectCustom(String str) {
        this.effectCustom = str;
    }

    public final void setFormat(int i) {
        this.format = i;
    }

    public final void setGiftCount(int i) {
        this.giftCount = i;
    }

    public final void setImageIds(String str) {
        this.imageIds = str;
    }

    public final void setImages(ArrayList<Image> arrayList) {
        this.images = arrayList;
    }

    public final void setLikeCount(int i) {
        this.likeCount = i;
    }

    public final void setLikeStatus(boolean z) {
        this.likeStatus = z;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setName(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.name = str;
    }

    public final void setPin(int i) {
        this.pin = i;
    }

    public final void setPlayCount(int i) {
        this.playCount = i;
    }

    public final void setPrivacy(int i) {
        this.privacy = i;
    }

    public final void setShareCount(int i) {
        this.shareCount = i;
    }

    public final void setShareUrl(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.shareUrl = str;
    }

    public final void setSlug(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.slug = str;
    }

    public final void setSong(Song song) {
        this.song = song;
    }

    public final void setSongId(int i) {
        this.songId = i;
    }

    public final void setStarCount(Integer num) {
        this.starCount = num;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setThumbnail(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.thumbnail = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUpdatedAt(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.updatedAt = str;
    }

    public final void setUrl(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.url = str;
    }

    public final void setUrlVideoResize(String str) {
        this.urlVideoResize = str;
    }

    public final void setUseHeadphone(Boolean bool) {
        this.useHeadphone = bool;
    }

    public final void setUser(User user) {
        this.user = user;
    }

    public final void setUserId(int i) {
        this.userId = i;
    }

    public final void setVideoRatio(int i) {
        this.videoRatio = i;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Recording(id=");
        sbM1556G.append(this.f33499id);
        sbM1556G.append(", name=");
        sbM1556G.append(this.name);
        sbM1556G.append(", userId=");
        sbM1556G.append(this.userId);
        sbM1556G.append(", songId=");
        sbM1556G.append(this.songId);
        sbM1556G.append(", duetId=");
        sbM1556G.append(this.duetId);
        sbM1556G.append(", message=");
        sbM1556G.append(this.message);
        sbM1556G.append(", slug=");
        sbM1556G.append(this.slug);
        sbM1556G.append(", thumbnail=");
        sbM1556G.append(this.thumbnail);
        sbM1556G.append(", url=");
        sbM1556G.append(this.url);
        sbM1556G.append(", type=");
        sbM1556G.append(this.type);
        sbM1556G.append(", imageIds=");
        sbM1556G.append(this.imageIds);
        sbM1556G.append(", shareUrl=");
        sbM1556G.append(this.shareUrl);
        sbM1556G.append(", playCount=");
        sbM1556G.append(this.playCount);
        sbM1556G.append(", likeCount=");
        sbM1556G.append(this.likeCount);
        sbM1556G.append(", commentCount=");
        sbM1556G.append(this.commentCount);
        sbM1556G.append(", shareCount=");
        sbM1556G.append(this.shareCount);
        sbM1556G.append(", giftCount=");
        sbM1556G.append(this.giftCount);
        sbM1556G.append(", duetCount=");
        sbM1556G.append(this.duetCount);
        sbM1556G.append(", starCount=");
        sbM1556G.append(this.starCount);
        sbM1556G.append(", privacy=");
        sbM1556G.append(this.privacy);
        sbM1556G.append(", pin=");
        sbM1556G.append(this.pin);
        sbM1556G.append(", duration=");
        sbM1556G.append(this.duration);
        sbM1556G.append(", effect=");
        sbM1556G.append(this.effect);
        sbM1556G.append(", effectCustom=");
        sbM1556G.append(this.effectCustom);
        sbM1556G.append(", useHeadphone=");
        sbM1556G.append(this.useHeadphone);
        sbM1556G.append(", status=");
        sbM1556G.append(this.status);
        sbM1556G.append(", likeStatus=");
        sbM1556G.append(this.likeStatus);
        sbM1556G.append(", images=");
        sbM1556G.append(this.images);
        sbM1556G.append(", user=");
        sbM1556G.append(this.user);
        sbM1556G.append(", duet=");
        sbM1556G.append(this.duet);
        sbM1556G.append(", song=");
        sbM1556G.append(this.song);
        sbM1556G.append(", format=");
        sbM1556G.append(this.format);
        sbM1556G.append(", videoRatio=");
        sbM1556G.append(this.videoRatio);
        sbM1556G.append(", urlVideoResize=");
        sbM1556G.append(this.urlVideoResize);
        sbM1556G.append(", createdAt=");
        sbM1556G.append(this.createdAt);
        sbM1556G.append(", updatedAt=");
        return outline.m1550A(sbM1556G, this.updatedAt, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics2.m13089e(parcel, "parcel");
        parcel.writeInt(this.f33499id);
        parcel.writeString(this.name);
        parcel.writeInt(this.userId);
        parcel.writeInt(this.songId);
        parcel.writeInt(this.duetId);
        parcel.writeString(this.message);
        parcel.writeString(this.slug);
        parcel.writeString(this.thumbnail);
        parcel.writeString(this.url);
        parcel.writeInt(this.type);
        parcel.writeString(this.imageIds);
        parcel.writeString(this.shareUrl);
        parcel.writeInt(this.playCount);
        parcel.writeInt(this.likeCount);
        parcel.writeInt(this.commentCount);
        parcel.writeInt(this.shareCount);
        parcel.writeInt(this.giftCount);
        parcel.writeInt(this.duetCount);
        Integer num = this.starCount;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.privacy);
        parcel.writeInt(this.pin);
        Integer num2 = this.duration;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num3 = this.effect;
        if (num3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.effectCustom);
        Boolean bool = this.useHeadphone;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.status);
        parcel.writeInt(this.likeStatus ? 1 : 0);
        ArrayList<Image> arrayList = this.images;
        if (arrayList != null) {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<Image> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        User user = this.user;
        if (user != null) {
            parcel.writeInt(1);
            user.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Duet duet = this.duet;
        if (duet != null) {
            parcel.writeInt(1);
            duet.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Song song = this.song;
        if (song != null) {
            parcel.writeInt(1);
            song.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.format);
        parcel.writeInt(this.videoRatio);
        parcel.writeString(this.urlVideoResize);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
    }

    public /* synthetic */ Recording(int i, String str, int i2, int i3, int i4, String str2, String str3, String str4, String str5, int i5, String str6, String str7, int i6, int i7, int i8, int i9, int i10, int i11, Integer num, int i12, int i13, Integer num2, Integer num3, String str8, Boolean bool, int i14, boolean z, ArrayList arrayList, User user, Duet duet, Song song, int i15, int i16, String str9, String str10, String str11, int i17, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, i3, i4, (i17 & 32) != 0 ? null : str2, str3, str4, str5, i5, (i17 & 1024) != 0 ? null : str6, str7, i6, i7, i8, i9, i10, i11, (262144 & i17) != 0 ? 0 : num, i12, i13, (2097152 & i17) != 0 ? 0 : num2, (4194304 & i17) != 0 ? 0 : num3, (8388608 & i17) != 0 ? null : str8, (16777216 & i17) != 0 ? Boolean.FALSE : bool, i14, z, (134217728 & i17) != 0 ? null : arrayList, (268435456 & i17) != 0 ? null : user, (536870912 & i17) != 0 ? null : duet, (1073741824 & i17) != 0 ? null : song, (i17 & Integer.MIN_VALUE) != 0 ? 0 : i15, (i18 & 1) != 0 ? 0 : i16, (i18 & 2) != 0 ? null : str9, str10, str11);
    }
}
