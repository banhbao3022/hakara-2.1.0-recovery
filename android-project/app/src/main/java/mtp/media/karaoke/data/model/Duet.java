package mtp.media.karaoke.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.p431d0.SerializedName;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: compiled from: Duet.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Duet implements Parcelable {
    public static final Parcelable.Creator<Duet> CREATOR = new Creator();

    @SerializedName("created_at")
    private String createdAt;

    /* JADX INFO: renamed from: id */
    private int f33488id;

    @SerializedName("join_count")
    private int joinCount;
    private Recording recording;

    @SerializedName("recording_id")
    private int recordingId;
    private ArrayList<Duet2> segments;

    @SerializedName("song_id")
    private int songId;

    @SerializedName("updated_at")
    private String updatedAt;
    private User user;

    @SerializedName("user_id")
    private int userId;

    public static class Creator implements Parcelable.Creator<Duet> {
        @Override // android.os.Parcelable.Creator
        public final Duet createFromParcel(Parcel parcel) {
            Intrinsics2.m13089e(parcel, "in");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            ArrayList arrayList = null;
            User userCreateFromParcel = parcel.readInt() != 0 ? User.CREATOR.createFromParcel(parcel) : null;
            Recording recordingCreateFromParcel = parcel.readInt() != 0 ? Recording.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                arrayList = new ArrayList(i5);
                while (i5 != 0) {
                    arrayList.add(Duet2.CREATOR.createFromParcel(parcel));
                    i5--;
                }
            }
            return new Duet(i, i2, i3, i4, userCreateFromParcel, recordingCreateFromParcel, arrayList, parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Duet[] newArray(int i) {
            return new Duet[i];
        }
    }

    public Duet(int i, int i2, int i3, int i4, User user, Recording recording, ArrayList<Duet2> arrayList, int i5, String str, String str2) {
        this.f33488id = i;
        this.songId = i2;
        this.userId = i3;
        this.recordingId = i4;
        this.user = user;
        this.recording = recording;
        this.segments = arrayList;
        this.joinCount = i5;
        this.createdAt = str;
        this.updatedAt = str2;
    }

    public final int component1() {
        return this.f33488id;
    }

    public final String component10() {
        return this.updatedAt;
    }

    public final int component2() {
        return this.songId;
    }

    public final int component3() {
        return this.userId;
    }

    public final int component4() {
        return this.recordingId;
    }

    public final User component5() {
        return this.user;
    }

    public final Recording component6() {
        return this.recording;
    }

    public final ArrayList<Duet2> component7() {
        return this.segments;
    }

    public final int component8() {
        return this.joinCount;
    }

    public final String component9() {
        return this.createdAt;
    }

    public final Duet copy(int i, int i2, int i3, int i4, User user, Recording recording, ArrayList<Duet2> arrayList, int i5, String str, String str2) {
        return new Duet(i, i2, i3, i4, user, recording, arrayList, i5, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Duet)) {
            return false;
        }
        Duet duet = (Duet) obj;
        return this.f33488id == duet.f33488id && this.songId == duet.songId && this.userId == duet.userId && this.recordingId == duet.recordingId && Intrinsics2.m13085a(this.user, duet.user) && Intrinsics2.m13085a(this.recording, duet.recording) && Intrinsics2.m13085a(this.segments, duet.segments) && this.joinCount == duet.joinCount && Intrinsics2.m13085a(this.createdAt, duet.createdAt) && Intrinsics2.m13085a(this.updatedAt, duet.updatedAt);
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final int getId() {
        return this.f33488id;
    }

    public final int getJoinCount() {
        return this.joinCount;
    }

    public final Recording getRecording() {
        return this.recording;
    }

    public final int getRecordingId() {
        return this.recordingId;
    }

    public final ArrayList<Duet2> getSegments() {
        return this.segments;
    }

    public final int getSongId() {
        return this.songId;
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
        int i = ((((((this.f33488id * 31) + this.songId) * 31) + this.userId) * 31) + this.recordingId) * 31;
        User user = this.user;
        int iHashCode = (i + (user != null ? user.hashCode() : 0)) * 31;
        Recording recording = this.recording;
        int iHashCode2 = (iHashCode + (recording != null ? recording.hashCode() : 0)) * 31;
        ArrayList<Duet2> arrayList = this.segments;
        int iHashCode3 = (((iHashCode2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31) + this.joinCount) * 31;
        String str = this.createdAt;
        int iHashCode4 = (iHashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.updatedAt;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCreatedAt(String str) {
        this.createdAt = str;
    }

    public final void setId(int i) {
        this.f33488id = i;
    }

    public final void setJoinCount(int i) {
        this.joinCount = i;
    }

    public final void setRecording(Recording recording) {
        this.recording = recording;
    }

    public final void setRecordingId(int i) {
        this.recordingId = i;
    }

    public final void setSegments(ArrayList<Duet2> arrayList) {
        this.segments = arrayList;
    }

    public final void setSongId(int i) {
        this.songId = i;
    }

    public final void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public final void setUser(User user) {
        this.user = user;
    }

    public final void setUserId(int i) {
        this.userId = i;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Duet(id=");
        sbM1556G.append(this.f33488id);
        sbM1556G.append(", songId=");
        sbM1556G.append(this.songId);
        sbM1556G.append(", userId=");
        sbM1556G.append(this.userId);
        sbM1556G.append(", recordingId=");
        sbM1556G.append(this.recordingId);
        sbM1556G.append(", user=");
        sbM1556G.append(this.user);
        sbM1556G.append(", recording=");
        sbM1556G.append(this.recording);
        sbM1556G.append(", segments=");
        sbM1556G.append(this.segments);
        sbM1556G.append(", joinCount=");
        sbM1556G.append(this.joinCount);
        sbM1556G.append(", createdAt=");
        sbM1556G.append(this.createdAt);
        sbM1556G.append(", updatedAt=");
        return outline.m1550A(sbM1556G, this.updatedAt, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics2.m13089e(parcel, "parcel");
        parcel.writeInt(this.f33488id);
        parcel.writeInt(this.songId);
        parcel.writeInt(this.userId);
        parcel.writeInt(this.recordingId);
        User user = this.user;
        if (user != null) {
            parcel.writeInt(1);
            user.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Recording recording = this.recording;
        if (recording != null) {
            parcel.writeInt(1);
            recording.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        ArrayList<Duet2> arrayList = this.segments;
        if (arrayList != null) {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<Duet2> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.joinCount);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
    }
}
