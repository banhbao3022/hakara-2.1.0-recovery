package mtp.media.karaoke.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.p431d0.SerializedName;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: mtp.media.karaoke.data.model.TaskLog, reason: use source file name */
/* JADX INFO: compiled from: Task.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Task4 implements Parcelable {
    public static final Parcelable.Creator<Task4> CREATOR = new Creator();

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("daily_task_id")
    private int dailyTaskId;
    private Integer day;

    /* JADX INFO: renamed from: id */
    private int f33503id;
    private int status;

    @SerializedName("updated_at")
    private String updatedAt;

    @SerializedName("user_id")
    private int userId;

    /* JADX INFO: renamed from: mtp.media.karaoke.data.model.TaskLog$Creator */
    public static class Creator implements Parcelable.Creator<Task4> {
        @Override // android.os.Parcelable.Creator
        public final Task4 createFromParcel(Parcel parcel) {
            Intrinsics2.m13089e(parcel, "in");
            return new Task4(parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Task4[] newArray(int i) {
            return new Task4[i];
        }
    }

    public Task4(int i, int i2, Integer num, int i3, int i4, String str, String str2) {
        this.f33503id = i;
        this.userId = i2;
        this.day = num;
        this.status = i3;
        this.dailyTaskId = i4;
        this.createdAt = str;
        this.updatedAt = str2;
    }

    public static /* synthetic */ Task4 copy$default(Task4 task4, int i, int i2, Integer num, int i3, int i4, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = task4.f33503id;
        }
        if ((i5 & 2) != 0) {
            i2 = task4.userId;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            num = task4.day;
        }
        Integer num2 = num;
        if ((i5 & 8) != 0) {
            i3 = task4.status;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = task4.dailyTaskId;
        }
        int i8 = i4;
        if ((i5 & 32) != 0) {
            str = task4.createdAt;
        }
        String str3 = str;
        if ((i5 & 64) != 0) {
            str2 = task4.updatedAt;
        }
        return task4.copy(i, i6, num2, i7, i8, str3, str2);
    }

    public final int component1() {
        return this.f33503id;
    }

    public final int component2() {
        return this.userId;
    }

    public final Integer component3() {
        return this.day;
    }

    public final int component4() {
        return this.status;
    }

    public final int component5() {
        return this.dailyTaskId;
    }

    public final String component6() {
        return this.createdAt;
    }

    public final String component7() {
        return this.updatedAt;
    }

    public final Task4 copy(int i, int i2, Integer num, int i3, int i4, String str, String str2) {
        return new Task4(i, i2, num, i3, i4, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Task4)) {
            return false;
        }
        Task4 task4 = (Task4) obj;
        return this.f33503id == task4.f33503id && this.userId == task4.userId && Intrinsics2.m13085a(this.day, task4.day) && this.status == task4.status && this.dailyTaskId == task4.dailyTaskId && Intrinsics2.m13085a(this.createdAt, task4.createdAt) && Intrinsics2.m13085a(this.updatedAt, task4.updatedAt);
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final int getDailyTaskId() {
        return this.dailyTaskId;
    }

    public final Integer getDay() {
        return this.day;
    }

    public final int getId() {
        return this.f33503id;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int i = ((this.f33503id * 31) + this.userId) * 31;
        Integer num = this.day;
        int iHashCode = (((((i + (num != null ? num.hashCode() : 0)) * 31) + this.status) * 31) + this.dailyTaskId) * 31;
        String str = this.createdAt;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.updatedAt;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setCreatedAt(String str) {
        this.createdAt = str;
    }

    public final void setDailyTaskId(int i) {
        this.dailyTaskId = i;
    }

    public final void setDay(Integer num) {
        this.day = num;
    }

    public final void setId(int i) {
        this.f33503id = i;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public final void setUserId(int i) {
        this.userId = i;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("TaskLog(id=");
        sbM1556G.append(this.f33503id);
        sbM1556G.append(", userId=");
        sbM1556G.append(this.userId);
        sbM1556G.append(", day=");
        sbM1556G.append(this.day);
        sbM1556G.append(", status=");
        sbM1556G.append(this.status);
        sbM1556G.append(", dailyTaskId=");
        sbM1556G.append(this.dailyTaskId);
        sbM1556G.append(", createdAt=");
        sbM1556G.append(this.createdAt);
        sbM1556G.append(", updatedAt=");
        return outline.m1550A(sbM1556G, this.updatedAt, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iIntValue;
        Intrinsics2.m13089e(parcel, "parcel");
        parcel.writeInt(this.f33503id);
        parcel.writeInt(this.userId);
        Integer num = this.day;
        if (num != null) {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        parcel.writeInt(iIntValue);
        parcel.writeInt(this.status);
        parcel.writeInt(this.dailyTaskId);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
    }
}
