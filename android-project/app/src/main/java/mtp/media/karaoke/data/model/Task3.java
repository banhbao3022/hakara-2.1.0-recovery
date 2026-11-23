package mtp.media.karaoke.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: mtp.media.karaoke.data.model.CheckInMode, reason: use source file name */
/* JADX INFO: compiled from: Task.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Task3 implements Parcelable {
    public static final Parcelable.Creator<Task3> CREATOR = new Creator();
    private int coins;
    private int day;
    private int diamonds;
    private int exps;
    private int status;

    /* JADX INFO: renamed from: mtp.media.karaoke.data.model.CheckInMode$Creator */
    public static class Creator implements Parcelable.Creator<Task3> {
        @Override // android.os.Parcelable.Creator
        public final Task3 createFromParcel(Parcel parcel) {
            Intrinsics2.m13089e(parcel, "in");
            return new Task3(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Task3[] newArray(int i) {
            return new Task3[i];
        }
    }

    public Task3(int i, int i2, int i3, int i4, int i5) {
        this.day = i;
        this.coins = i2;
        this.exps = i3;
        this.diamonds = i4;
        this.status = i5;
    }

    public static /* synthetic */ Task3 copy$default(Task3 task3, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = task3.day;
        }
        if ((i6 & 2) != 0) {
            i2 = task3.coins;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = task3.exps;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = task3.diamonds;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = task3.status;
        }
        return task3.copy(i, i7, i8, i9, i5);
    }

    public final int component1() {
        return this.day;
    }

    public final int component2() {
        return this.coins;
    }

    public final int component3() {
        return this.exps;
    }

    public final int component4() {
        return this.diamonds;
    }

    public final int component5() {
        return this.status;
    }

    public final Task3 copy(int i, int i2, int i3, int i4, int i5) {
        return new Task3(i, i2, i3, i4, i5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Task3)) {
            return false;
        }
        Task3 task3 = (Task3) obj;
        return this.day == task3.day && this.coins == task3.coins && this.exps == task3.exps && this.diamonds == task3.diamonds && this.status == task3.status;
    }

    public final int getCoins() {
        return this.coins;
    }

    public final int getDay() {
        return this.day;
    }

    public final int getDiamonds() {
        return this.diamonds;
    }

    public final int getExps() {
        return this.exps;
    }

    public final int getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((((this.day * 31) + this.coins) * 31) + this.exps) * 31) + this.diamonds) * 31) + this.status;
    }

    public final void setCoins(int i) {
        this.coins = i;
    }

    public final void setDay(int i) {
        this.day = i;
    }

    public final void setDiamonds(int i) {
        this.diamonds = i;
    }

    public final void setExps(int i) {
        this.exps = i;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("CheckInMode(day=");
        sbM1556G.append(this.day);
        sbM1556G.append(", coins=");
        sbM1556G.append(this.coins);
        sbM1556G.append(", exps=");
        sbM1556G.append(this.exps);
        sbM1556G.append(", diamonds=");
        sbM1556G.append(this.diamonds);
        sbM1556G.append(", status=");
        return outline.m1603y(sbM1556G, this.status, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics2.m13089e(parcel, "parcel");
        parcel.writeInt(this.day);
        parcel.writeInt(this.coins);
        parcel.writeInt(this.exps);
        parcel.writeInt(this.diamonds);
        parcel.writeInt(this.status);
    }
}
