package mtp.media.karaoke.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: mtp.media.karaoke.data.model.Background, reason: use source file name */
/* JADX INFO: compiled from: Simple.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Simple2 implements Parcelable {
    public static final Parcelable.Creator<Simple2> CREATOR = new Creator();
    private String key;
    private String value;

    /* JADX INFO: renamed from: mtp.media.karaoke.data.model.Background$Creator */
    public static class Creator implements Parcelable.Creator<Simple2> {
        @Override // android.os.Parcelable.Creator
        public final Simple2 createFromParcel(Parcel parcel) {
            Intrinsics2.m13089e(parcel, "in");
            return new Simple2(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Simple2[] newArray(int i) {
            return new Simple2[i];
        }
    }

    public Simple2(String str, String str2) {
        Intrinsics2.m13089e(str, "key");
        Intrinsics2.m13089e(str2, "value");
        this.key = str;
        this.value = str2;
    }

    public static /* synthetic */ Simple2 copy$default(Simple2 simple2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simple2.key;
        }
        if ((i & 2) != 0) {
            str2 = simple2.value;
        }
        return simple2.copy(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.value;
    }

    public final Simple2 copy(String str, String str2) {
        Intrinsics2.m13089e(str, "key");
        Intrinsics2.m13089e(str2, "value");
        return new Simple2(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Simple2)) {
            return false;
        }
        Simple2 simple2 = (Simple2) obj;
        return Intrinsics2.m13085a(this.key, simple2.key) && Intrinsics2.m13085a(this.value, simple2.value);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.value;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setKey(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.key = str;
    }

    public final void setValue(String str) {
        Intrinsics2.m13089e(str, "<set-?>");
        this.value = str;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Background(key=");
        sbM1556G.append(this.key);
        sbM1556G.append(", value=");
        return outline.m1550A(sbM1556G, this.value, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics2.m13089e(parcel, "parcel");
        parcel.writeString(this.key);
        parcel.writeString(this.value);
    }
}
