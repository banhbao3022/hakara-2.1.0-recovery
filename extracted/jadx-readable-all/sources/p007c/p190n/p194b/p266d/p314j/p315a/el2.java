package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class el2 implements Parcelable {
    public static final Parcelable.Creator<el2> CREATOR = new cl2();

    /* JADX INFO: renamed from: f */
    public final dl2[] f13606f;

    public el2(Parcel parcel) {
        this.f13606f = new dl2[parcel.readInt()];
        int i = 0;
        while (true) {
            dl2[] dl2VarArr = this.f13606f;
            if (i >= dl2VarArr.length) {
                return;
            }
            dl2VarArr[i] = (dl2) parcel.readParcelable(dl2.class.getClassLoader());
            i++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || el2.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f13606f, ((el2) obj).f13606f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f13606f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13606f.length);
        for (dl2 dl2Var : this.f13606f) {
            parcel.writeParcelable(dl2Var, 0);
        }
    }

    public el2(List<? extends dl2> list) {
        dl2[] dl2VarArr = new dl2[list.size()];
        this.f13606f = dl2VarArr;
        list.toArray(dl2VarArr);
    }
}
