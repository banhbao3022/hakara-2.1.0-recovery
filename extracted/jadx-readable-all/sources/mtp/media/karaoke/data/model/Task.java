package mtp.media.karaoke.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p430e.p431d0.SerializedName;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: compiled from: Task.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Task implements Parcelable {
    public static final Parcelable.Creator<Task> CREATOR = new Creator();
    private int coin;
    private ArrayList<Integer> coins;

    @SerializedName("created_at")
    private String createdAt;
    private int diamond;
    private ArrayList<Integer> diamonds;
    private int exp;
    private ArrayList<Integer> exps;

    @SerializedName("finished_count")
    private int finishedCount;
    private int goal;

    /* JADX INFO: renamed from: id */
    private int f33502id;
    private Task4 log;
    private String name;
    private int type;

    @SerializedName("updated_at")
    private String updatedAt;

    public static class Creator implements Parcelable.Creator<Task> {
        @Override // android.os.Parcelable.Creator
        public final Task createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Intrinsics2.m13089e(parcel, "in");
            int i = parcel.readInt();
            String string = parcel.readString();
            int i2 = parcel.readInt();
            int i3 = parcel.readInt();
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            int i6 = parcel.readInt();
            if (parcel.readInt() != 0) {
                int i7 = parcel.readInt();
                arrayList = new ArrayList(i7);
                while (i7 != 0) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                    i7--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                int i8 = parcel.readInt();
                arrayList2 = new ArrayList(i8);
                while (i8 != 0) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                    i8--;
                }
            } else {
                arrayList2 = null;
            }
            if (parcel.readInt() != 0) {
                int i9 = parcel.readInt();
                arrayList3 = new ArrayList(i9);
                while (i9 != 0) {
                    arrayList3.add(Integer.valueOf(parcel.readInt()));
                    i9--;
                }
            } else {
                arrayList3 = null;
            }
            return new Task(i, string, i2, i3, i4, i5, i6, arrayList, arrayList2, arrayList3, parcel.readInt() != 0 ? Task4.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Task[] newArray(int i) {
            return new Task[i];
        }
    }

    public Task(int i, String str, int i2, int i3, int i4, int i5, int i6, ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2, ArrayList<Integer> arrayList3, Task4 task4, int i7, String str2, String str3) {
        Intrinsics2.m13089e(str, "name");
        this.f33502id = i;
        this.name = str;
        this.type = i2;
        this.goal = i3;
        this.coin = i4;
        this.exp = i5;
        this.diamond = i6;
        this.coins = arrayList;
        this.exps = arrayList2;
        this.diamonds = arrayList3;
        this.log = task4;
        this.finishedCount = i7;
        this.createdAt = str2;
        this.updatedAt = str3;
    }

    public final int checkLogStatus() {
        Task4 task4 = this.log;
        Integer numValueOf = task4 != null ? Integer.valueOf(task4.getStatus()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return 2;
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return this.finishedCount >= this.goal ? 3 : 4;
        }
        return 1;
    }

    public final int component1() {
        return this.f33502id;
    }

    public final ArrayList<Integer> component10() {
        return this.diamonds;
    }

    public final Task4 component11() {
        return this.log;
    }

    public final int component12() {
        return this.finishedCount;
    }

    public final String component13() {
        return this.createdAt;
    }

    public final String component14() {
        return this.updatedAt;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.type;
    }

    public final int component4() {
        return this.goal;
    }

    public final int component5() {
        return this.coin;
    }

    public final int component6() {
        return this.exp;
    }

    public final int component7() {
        return this.diamond;
    }

    public final ArrayList<Integer> component8() {
        return this.coins;
    }

    public final ArrayList<Integer> component9() {
        return this.exps;
    }

    public final Task copy(int i, String str, int i2, int i3, int i4, int i5, int i6, ArrayList<Integer> arrayList, ArrayList<Integer> arrayList2, ArrayList<Integer> arrayList3, Task4 task4, int i7, String str2, String str3) {
        Intrinsics2.m13089e(str, "name");
        return new Task(i, str, i2, i3, i4, i5, i6, arrayList, arrayList2, arrayList3, task4, i7, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Task)) {
            return false;
        }
        Task task = (Task) obj;
        return this.f33502id == task.f33502id && Intrinsics2.m13085a(this.name, task.name) && this.type == task.type && this.goal == task.goal && this.coin == task.coin && this.exp == task.exp && this.diamond == task.diamond && Intrinsics2.m13085a(this.coins, task.coins) && Intrinsics2.m13085a(this.exps, task.exps) && Intrinsics2.m13085a(this.diamonds, task.diamonds) && Intrinsics2.m13085a(this.log, task.log) && this.finishedCount == task.finishedCount && Intrinsics2.m13085a(this.createdAt, task.createdAt) && Intrinsics2.m13085a(this.updatedAt, task.updatedAt);
    }

    public final int getCoin() {
        return this.coin;
    }

    public final ArrayList<Integer> getCoins() {
        return this.coins;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final int getDiamond() {
        return this.diamond;
    }

    public final ArrayList<Integer> getDiamonds() {
        return this.diamonds;
    }

    public final int getExp() {
        return this.exp;
    }

    public final ArrayList<Integer> getExps() {
        return this.exps;
    }

    public final int getFinishedCount() {
        return this.finishedCount;
    }

    public final int getGoal() {
        return this.goal;
    }

    public final int getId() {
        return this.f33502id;
    }

    public final Task4 getLog() {
        return this.log;
    }

    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        int i = this.f33502id * 31;
        String str = this.name;
        int iHashCode = (((((((((((i + (str != null ? str.hashCode() : 0)) * 31) + this.type) * 31) + this.goal) * 31) + this.coin) * 31) + this.exp) * 31) + this.diamond) * 31;
        ArrayList<Integer> arrayList = this.coins;
        int iHashCode2 = (iHashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        ArrayList<Integer> arrayList2 = this.exps;
        int iHashCode3 = (iHashCode2 + (arrayList2 != null ? arrayList2.hashCode() : 0)) * 31;
        ArrayList<Integer> arrayList3 = this.diamonds;
        int iHashCode4 = (iHashCode3 + (arrayList3 != null ? arrayList3.hashCode() : 0)) * 31;
        Task4 task4 = this.log;
        int iHashCode5 = (((iHashCode4 + (task4 != null ? task4.hashCode() : 0)) * 31) + this.finishedCount) * 31;
        String str2 = this.createdAt;
        int iHashCode6 = (iHashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.updatedAt;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setCoin(int i) {
        this.coin = i;
    }

    public final void setCoins(ArrayList<Integer> arrayList) {
        this.coins = arrayList;
    }

    public final void setCreatedAt(String str) {
        this.createdAt = str;
    }

    public final void setDiamond(int i) {
        this.diamond = i;
    }

    public final void setDiamonds(ArrayList<Integer> arrayList) {
        this.diamonds = arrayList;
    }

    public final void setExp(int i) {
        this.exp = i;
    }

    public final void setExps(ArrayList<Integer> arrayList) {
        this.exps = arrayList;
    }

    public final void setFinishedCount(int i) {
        this.finishedCount = i;
    }

    public final void setGoal(int i) {
        this.goal = i;
    }

    public final void setId(int i) {
        this.f33502id = i;
    }

    public final void setLog(Task4 task4) {
        this.log = task4;
    }

    public final void setName(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.name = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setUpdatedAt(String str) {
        this.updatedAt = str;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Task(id=");
        sbM1556G.append(this.f33502id);
        sbM1556G.append(", name=");
        sbM1556G.append(this.name);
        sbM1556G.append(", type=");
        sbM1556G.append(this.type);
        sbM1556G.append(", goal=");
        sbM1556G.append(this.goal);
        sbM1556G.append(", coin=");
        sbM1556G.append(this.coin);
        sbM1556G.append(", exp=");
        sbM1556G.append(this.exp);
        sbM1556G.append(", diamond=");
        sbM1556G.append(this.diamond);
        sbM1556G.append(", coins=");
        sbM1556G.append(this.coins);
        sbM1556G.append(", exps=");
        sbM1556G.append(this.exps);
        sbM1556G.append(", diamonds=");
        sbM1556G.append(this.diamonds);
        sbM1556G.append(", log=");
        sbM1556G.append(this.log);
        sbM1556G.append(", finishedCount=");
        sbM1556G.append(this.finishedCount);
        sbM1556G.append(", createdAt=");
        sbM1556G.append(this.createdAt);
        sbM1556G.append(", updatedAt=");
        return outline.m1550A(sbM1556G, this.updatedAt, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics2.m13089e(parcel, "parcel");
        parcel.writeInt(this.f33502id);
        parcel.writeString(this.name);
        parcel.writeInt(this.type);
        parcel.writeInt(this.goal);
        parcel.writeInt(this.coin);
        parcel.writeInt(this.exp);
        parcel.writeInt(this.diamond);
        ArrayList<Integer> arrayList = this.coins;
        if (arrayList != null) {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<Integer> it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeInt(it.next().intValue());
            }
        } else {
            parcel.writeInt(0);
        }
        ArrayList<Integer> arrayList2 = this.exps;
        if (arrayList2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(arrayList2.size());
            Iterator<Integer> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                parcel.writeInt(it2.next().intValue());
            }
        } else {
            parcel.writeInt(0);
        }
        ArrayList<Integer> arrayList3 = this.diamonds;
        if (arrayList3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(arrayList3.size());
            Iterator<Integer> it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                parcel.writeInt(it3.next().intValue());
            }
        } else {
            parcel.writeInt(0);
        }
        Task4 task4 = this.log;
        if (task4 != null) {
            parcel.writeInt(1);
            task4.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.finishedCount);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
    }
}
