package mtp.media.karaoke.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p071d.p078c.p079a.outline;
import p477d1.p493x.p495c.DefaultConstructorMarker;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: mtp.media.karaoke.data.model.Privacy, reason: use source file name */
/* JADX INFO: compiled from: Simple.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class Simple5 implements Parcelable {
    public static final Parcelable.Creator<Simple5> CREATOR = new Creator();
    private Integer description;

    /* JADX INFO: renamed from: id */
    private int f33498id;
    private boolean isChecked;
    private Integer localImage;
    private Integer title;

    /* JADX INFO: renamed from: mtp.media.karaoke.data.model.Privacy$Creator */
    public static class Creator implements Parcelable.Creator<Simple5> {
        @Override // android.os.Parcelable.Creator
        public final Simple5 createFromParcel(Parcel parcel) {
            Intrinsics2.m13089e(parcel, "in");
            return new Simple5(parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Simple5[] newArray(int i) {
            return new Simple5[i];
        }
    }

    public Simple5(int i, Integer num, Integer num2, Integer num3, boolean z) {
        this.f33498id = i;
        this.title = num;
        this.description = num2;
        this.localImage = num3;
        this.isChecked = z;
    }

    public static /* synthetic */ Simple5 copy$default(Simple5 simple5, int i, Integer num, Integer num2, Integer num3, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = simple5.f33498id;
        }
        if ((i2 & 2) != 0) {
            num = simple5.title;
        }
        Integer num4 = num;
        if ((i2 & 4) != 0) {
            num2 = simple5.description;
        }
        Integer num5 = num2;
        if ((i2 & 8) != 0) {
            num3 = simple5.localImage;
        }
        Integer num6 = num3;
        if ((i2 & 16) != 0) {
            z = simple5.isChecked;
        }
        return simple5.copy(i, num4, num5, num6, z);
    }

    public final int component1() {
        return this.f33498id;
    }

    public final Integer component2() {
        return this.title;
    }

    public final Integer component3() {
        return this.description;
    }

    public final Integer component4() {
        return this.localImage;
    }

    public final boolean component5() {
        return this.isChecked;
    }

    public final Simple5 copy(int i, Integer num, Integer num2, Integer num3, boolean z) {
        return new Simple5(i, num, num2, num3, z);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Simple5)) {
            return false;
        }
        Simple5 simple5 = (Simple5) obj;
        return this.f33498id == simple5.f33498id && Intrinsics2.m13085a(this.title, simple5.title) && Intrinsics2.m13085a(this.description, simple5.description) && Intrinsics2.m13085a(this.localImage, simple5.localImage) && this.isChecked == simple5.isChecked;
    }

    public final Integer getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.f33498id;
    }

    public final Integer getLocalImage() {
        return this.localImage;
    }

    public final Integer getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public int hashCode() {
        int i = this.f33498id * 31;
        Integer num = this.title;
        int iHashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.description;
        int iHashCode2 = (iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.localImage;
        int iHashCode3 = (iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31;
        boolean z = this.isChecked;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode3 + r1;
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    public final void setChecked(boolean z) {
        this.isChecked = z;
    }

    public final void setDescription(Integer num) {
        this.description = num;
    }

    public final void setId(int i) {
        this.f33498id = i;
    }

    public final void setLocalImage(Integer num) {
        this.localImage = num;
    }

    public final void setTitle(Integer num) {
        this.title = num;
    }

    public String toString() {
        StringBuilder sbM1556G = outline.m1556G("Privacy(id=");
        sbM1556G.append(this.f33498id);
        sbM1556G.append(", title=");
        sbM1556G.append(this.title);
        sbM1556G.append(", description=");
        sbM1556G.append(this.description);
        sbM1556G.append(", localImage=");
        sbM1556G.append(this.localImage);
        sbM1556G.append(", isChecked=");
        sbM1556G.append(this.isChecked);
        sbM1556G.append(")");
        return sbM1556G.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics2.m13089e(parcel, "parcel");
        parcel.writeInt(this.f33498id);
        Integer num = this.title;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num2 = this.description;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num3 = this.localImage;
        if (num3 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.isChecked ? 1 : 0);
    }

    public /* synthetic */ Simple5(int i, Integer num, Integer num2, Integer num3, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? 0 : num, (i2 & 4) != 0 ? 0 : num2, (i2 & 8) != 0 ? 0 : num3, (i2 & 16) != 0 ? false : z);
    }
}
