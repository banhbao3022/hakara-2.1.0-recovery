package mtp.media.karaoke.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: compiled from: Keyword.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Keyword implements Parcelable {
    public static final Parcelable.Creator<Keyword> CREATOR = new Creator();

    /* JADX INFO: renamed from: id */
    private int f33495id;
    private String name;

    public static class Creator implements Parcelable.Creator<Keyword> {
        @Override // android.os.Parcelable.Creator
        public final Keyword createFromParcel(Parcel parcel) {
            Intrinsics2.m13089e(parcel, "in");
            return new Keyword(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Keyword[] newArray(int i) {
            return new Keyword[i];
        }
    }

    public Keyword(int i, String str) {
        Intrinsics2.m13089e(str, "name");
        this.f33495id = i;
        this.name = str;
    }

    public static /* synthetic */ Keyword copy$default(Keyword keyword, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = keyword.f33495id;
        }
        if ((i2 & 2) != 0) {
            str = keyword.name;
        }
        return keyword.copy(i, str);
    }

    public final int component1() {
        return this.f33495id;
    }

    public final String component2() {
        return this.name;
    }

    public final Keyword copy(int i, String str) {
        Intrinsics2.m13089e(str, "name");
        return new Keyword(i, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Keyword)) {
            return false;
        }
        Keyword keyword = (Keyword) obj;
        return this.f33495id == keyword.f33495id && Intrinsics2.m13085a(this.name, keyword.name);
    }

    public final int getId() {
        return this.f33495id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int i = this.f33495id * 31;
        String str = this.name;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void setId(int i) {
        this.f33495id = i;
    }

    public final void setName(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.name = str;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Keyword(id=");
        sbM1556G.append(this.f33495id);
        sbM1556G.append(", name=");
        return outline.m1550A(sbM1556G, this.name, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics2.m13089e(parcel, "parcel");
        parcel.writeInt(this.f33495id);
        parcel.writeString(this.name);
    }
}
