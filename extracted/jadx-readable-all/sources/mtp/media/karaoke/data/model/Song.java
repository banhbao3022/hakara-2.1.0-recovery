package mtp.media.karaoke.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p481d0.StringsJVM;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: compiled from: Song.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Song implements Parcelable {
    public static final Parcelable.Creator<Song> CREATOR = new Creator();
    private final String artist;
    private final String cover;
    private final int duet_singer;

    /* JADX INFO: renamed from: id */
    private final int f33501id;
    private final String link;
    private final String link_video;
    private final String name;
    private final String player_ias_url;
    private final int recordCount;
    private final String region;
    private final int status;
    private final String thumbnail;
    private final int trending;
    private final String youtubeId;

    public static class Creator implements Parcelable.Creator<Song> {
        @Override // android.os.Parcelable.Creator
        public final Song createFromParcel(Parcel parcel) {
            Intrinsics2.m13089e(parcel, "in");
            return new Song(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Song[] newArray(int i) {
            return new Song[i];
        }
    }

    public Song(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, int i3, int i4, String str9, int i5) {
        this.f33501id = i;
        this.name = str;
        this.artist = str2;
        this.youtubeId = str3;
        this.player_ias_url = str4;
        this.thumbnail = str5;
        this.cover = str6;
        this.link = str7;
        this.link_video = str8;
        this.trending = i2;
        this.duet_singer = i3;
        this.recordCount = i4;
        this.region = str9;
        this.status = i5;
    }

    public final int component1() {
        return this.f33501id;
    }

    public final int component10() {
        return this.trending;
    }

    public final int component11() {
        return this.duet_singer;
    }

    public final int component12() {
        return this.recordCount;
    }

    public final String component13() {
        return this.region;
    }

    public final int component14() {
        return this.status;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.artist;
    }

    public final String component4() {
        return this.youtubeId;
    }

    public final String component5() {
        return this.player_ias_url;
    }

    public final String component6() {
        return this.thumbnail;
    }

    public final String component7() {
        return this.cover;
    }

    public final String component8() {
        return this.link;
    }

    public final String component9() {
        return this.link_video;
    }

    public final Song copy(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, int i3, int i4, String str9, int i5) {
        return new Song(i, str, str2, str3, str4, str5, str6, str7, str8, i2, i3, i4, str9, i5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Song)) {
            return false;
        }
        Song song = (Song) obj;
        return this.f33501id == song.f33501id && Intrinsics2.m13085a(this.name, song.name) && Intrinsics2.m13085a(this.artist, song.artist) && Intrinsics2.m13085a(this.youtubeId, song.youtubeId) && Intrinsics2.m13085a(this.player_ias_url, song.player_ias_url) && Intrinsics2.m13085a(this.thumbnail, song.thumbnail) && Intrinsics2.m13085a(this.cover, song.cover) && Intrinsics2.m13085a(this.link, song.link) && Intrinsics2.m13085a(this.link_video, song.link_video) && this.trending == song.trending && this.duet_singer == song.duet_singer && this.recordCount == song.recordCount && Intrinsics2.m13085a(this.region, song.region) && this.status == song.status;
    }

    public final String getArtist() {
        return this.artist;
    }

    public final String getCover() {
        return this.cover;
    }

    public final int getDuet_singer() {
        return this.duet_singer;
    }

    public final int getId() {
        return this.f33501id;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getLink_video() {
        return this.link_video;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPlayer_ias_url() {
        return this.player_ias_url;
    }

    public final int getRecordCount() {
        return this.recordCount;
    }

    public final String getRegion() {
        return this.region;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final int getTrending() {
        return this.trending;
    }

    public final String getYoutubeId() {
        return this.youtubeId;
    }

    public int hashCode() {
        int i = this.f33501id * 31;
        String str = this.name;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.artist;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.youtubeId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.player_ias_url;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.thumbnail;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.cover;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.link;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.link_video;
        int iHashCode8 = (((((((iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.trending) * 31) + this.duet_singer) * 31) + this.recordCount) * 31;
        String str9 = this.region;
        return ((iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 31) + this.status;
    }

    public final boolean isArtistShow() {
        String str = this.artist;
        return !(str == null || StringsJVM.m12990g(str));
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Song(id=");
        sbM1556G.append(this.f33501id);
        sbM1556G.append(", name=");
        sbM1556G.append(this.name);
        sbM1556G.append(", artist=");
        sbM1556G.append(this.artist);
        sbM1556G.append(", youtubeId=");
        sbM1556G.append(this.youtubeId);
        sbM1556G.append(", player_ias_url=");
        sbM1556G.append(this.player_ias_url);
        sbM1556G.append(", thumbnail=");
        sbM1556G.append(this.thumbnail);
        sbM1556G.append(", cover=");
        sbM1556G.append(this.cover);
        sbM1556G.append(", link=");
        sbM1556G.append(this.link);
        sbM1556G.append(", link_video=");
        sbM1556G.append(this.link_video);
        sbM1556G.append(", trending=");
        sbM1556G.append(this.trending);
        sbM1556G.append(", duet_singer=");
        sbM1556G.append(this.duet_singer);
        sbM1556G.append(", recordCount=");
        sbM1556G.append(this.recordCount);
        sbM1556G.append(", region=");
        sbM1556G.append(this.region);
        sbM1556G.append(", status=");
        return outline.m1603y(sbM1556G, this.status, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics2.m13089e(parcel, "parcel");
        parcel.writeInt(this.f33501id);
        parcel.writeString(this.name);
        parcel.writeString(this.artist);
        parcel.writeString(this.youtubeId);
        parcel.writeString(this.player_ias_url);
        parcel.writeString(this.thumbnail);
        parcel.writeString(this.cover);
        parcel.writeString(this.link);
        parcel.writeString(this.link_video);
        parcel.writeInt(this.trending);
        parcel.writeInt(this.duet_singer);
        parcel.writeInt(this.recordCount);
        parcel.writeString(this.region);
        parcel.writeInt(this.status);
    }

    public /* synthetic */ Song(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, int i3, int i4, String str9, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, str4, str5, str6, (i6 & 128) != 0 ? null : str7, (i6 & 256) != 0 ? null : str8, i2, i3, i4, str9, i5);
    }
}
