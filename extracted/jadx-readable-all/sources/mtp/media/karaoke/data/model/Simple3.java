package mtp.media.karaoke.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: mtp.media.karaoke.data.model.Explore, reason: use source file name */
/* JADX INFO: compiled from: Simple.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Simple3 implements Parcelable {
    public static final Parcelable.Creator<Simple3> CREATOR = new Creator();

    /* JADX INFO: renamed from: id */
    private int f33492id;
    private int layout_type;
    private String name;
    private int type;

    /* JADX INFO: renamed from: mtp.media.karaoke.data.model.Explore$Creator */
    public static class Creator implements Parcelable.Creator<Simple3> {
        @Override // android.os.Parcelable.Creator
        public final Simple3 createFromParcel(Parcel parcel) {
            Intrinsics2.m13089e(parcel, "in");
            return new Simple3(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Simple3[] newArray(int i) {
            return new Simple3[i];
        }
    }

    public Simple3(int i, String str, int i2, int i3) {
        Intrinsics2.m13089e(str, "name");
        this.f33492id = i;
        this.name = str;
        this.type = i2;
        this.layout_type = i3;
    }

    public static /* synthetic */ Simple3 copy$default(Simple3 simple3, int i, String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = simple3.f33492id;
        }
        if ((i4 & 2) != 0) {
            str = simple3.name;
        }
        if ((i4 & 4) != 0) {
            i2 = simple3.type;
        }
        if ((i4 & 8) != 0) {
            i3 = simple3.layout_type;
        }
        return simple3.copy(i, str, i2, i3);
    }

    public final int component1() {
        return this.f33492id;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.type;
    }

    public final int component4() {
        return this.layout_type;
    }

    public final Simple3 copy(int i, String str, int i2, int i3) {
        Intrinsics2.m13089e(str, "name");
        return new Simple3(i, str, i2, i3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Simple3)) {
            return false;
        }
        Simple3 simple3 = (Simple3) obj;
        return this.f33492id == simple3.f33492id && Intrinsics2.m13085a(this.name, simple3.name) && this.type == simple3.type && this.layout_type == simple3.layout_type;
    }

    public final int getId() {
        return this.f33492id;
    }

    public final int getLayout_type() {
        return this.layout_type;
    }

    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int i = this.f33492id * 31;
        String str = this.name;
        return ((((i + (str != null ? str.hashCode() : 0)) * 31) + this.type) * 31) + this.layout_type;
    }

    public final void setId(int i) {
        this.f33492id = i;
    }

    public final void setLayout_type(int i) {
        this.layout_type = i;
    }

    public final void setName(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.name = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Explore(id=");
        sbM1556G.append(this.f33492id);
        sbM1556G.append(", name=");
        sbM1556G.append(this.name);
        sbM1556G.append(", type=");
        sbM1556G.append(this.type);
        sbM1556G.append(", layout_type=");
        return outline.m1603y(sbM1556G, this.layout_type, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics2.m13089e(parcel, "parcel");
        parcel.writeInt(this.f33492id);
        parcel.writeString(this.name);
        parcel.writeInt(this.type);
        parcel.writeInt(this.layout_type);
    }
}
