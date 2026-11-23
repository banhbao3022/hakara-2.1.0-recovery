package mtp.media.karaoke.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: compiled from: Simple.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Simple implements Parcelable {
    public static final Parcelable.Creator<Simple> CREATOR = new Creator();

    /* JADX INFO: renamed from: id */
    private int f33500id;
    private String image;
    private Integer localImage;
    private String name;
    private Integer translateName;

    public static class Creator implements Parcelable.Creator<Simple> {
        @Override // android.os.Parcelable.Creator
        public final Simple createFromParcel(Parcel parcel) {
            Intrinsics2.m13089e(parcel, "in");
            return new Simple(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Simple[] newArray(int i) {
            return new Simple[i];
        }
    }

    public Simple(int i, String str, String str2, Integer num, Integer num2) {
        this.f33500id = i;
        this.name = str;
        this.image = str2;
        this.translateName = num;
        this.localImage = num2;
    }

    public static /* synthetic */ Simple copy$default(Simple simple, int i, String str, String str2, Integer num, Integer num2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = simple.f33500id;
        }
        if ((i2 & 2) != 0) {
            str = simple.name;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = simple.image;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            num = simple.translateName;
        }
        Integer num3 = num;
        if ((i2 & 16) != 0) {
            num2 = simple.localImage;
        }
        return simple.copy(i, str3, str4, num3, num2);
    }

    public final int component1() {
        return this.f33500id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.image;
    }

    public final Integer component4() {
        return this.translateName;
    }

    public final Integer component5() {
        return this.localImage;
    }

    public final Simple copy(int i, String str, String str2, Integer num, Integer num2) {
        return new Simple(i, str, str2, num, num2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Simple)) {
            return false;
        }
        Simple simple = (Simple) obj;
        return this.f33500id == simple.f33500id && Intrinsics2.m13085a(this.name, simple.name) && Intrinsics2.m13085a(this.image, simple.image) && Intrinsics2.m13085a(this.translateName, simple.translateName) && Intrinsics2.m13085a(this.localImage, simple.localImage);
    }

    public final int getId() {
        return this.f33500id;
    }

    public final String getImage() {
        return this.image;
    }

    public final Integer getLocalImage() {
        return this.localImage;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getTranslateName() {
        return this.translateName;
    }

    public int hashCode() {
        int i = this.f33500id * 31;
        String str = this.name;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.image;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.translateName;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.localImage;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final void setId(int i) {
        this.f33500id = i;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final void setLocalImage(Integer num) {
        this.localImage = num;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setTranslateName(Integer num) {
        this.translateName = num;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Simple(id=");
        sbM1556G.append(this.f33500id);
        sbM1556G.append(", name=");
        sbM1556G.append(this.name);
        sbM1556G.append(", image=");
        sbM1556G.append(this.image);
        sbM1556G.append(", translateName=");
        sbM1556G.append(this.translateName);
        sbM1556G.append(", localImage=");
        sbM1556G.append(this.localImage);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics2.m13089e(parcel, "parcel");
        parcel.writeInt(this.f33500id);
        parcel.writeString(this.name);
        parcel.writeString(this.image);
        Integer num = this.translateName;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.localImage;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
    }

    public /* synthetic */ Simple(int i, String str, String str2, Integer num, Integer num2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? 0 : num, (i2 & 16) != 0 ? 0 : num2);
    }
}
