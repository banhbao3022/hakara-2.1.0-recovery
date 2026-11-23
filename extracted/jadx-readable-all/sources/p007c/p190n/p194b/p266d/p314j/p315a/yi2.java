package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yi2 implements Comparator<xi2>, Parcelable {
    public static final Parcelable.Creator<yi2> CREATOR = new vi2();

    /* JADX INFO: renamed from: f */
    public final xi2[] f21899f;

    /* JADX INFO: renamed from: g */
    public int f21900g;

    /* JADX INFO: renamed from: h */
    public final int f21901h;

    public yi2(Parcel parcel) {
        xi2[] xi2VarArr = (xi2[]) parcel.createTypedArray(xi2.CREATOR);
        this.f21899f = xi2VarArr;
        this.f21901h = xi2VarArr.length;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(xi2 xi2Var, xi2 xi2Var2) {
        xi2 xi2Var3 = xi2Var;
        xi2 xi2Var4 = xi2Var2;
        UUID uuid = og2.f17616b;
        if (uuid.equals(xi2Var3.f21553g)) {
            return !uuid.equals(xi2Var4.f21553g) ? 1 : 0;
        }
        return xi2Var3.f21553g.compareTo(xi2Var4.f21553g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yi2.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f21899f, ((yi2) obj).f21899f);
    }

    public final int hashCode() {
        int i = this.f21900g;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f21899f);
        this.f21900g = iHashCode;
        return iHashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedArray(this.f21899f, 0);
    }

    public yi2(List<xi2> list) {
        this(false, (xi2[]) list.toArray(new xi2[list.size()]));
    }

    public yi2(boolean z, xi2... xi2VarArr) {
        xi2VarArr = z ? (xi2[]) xi2VarArr.clone() : xi2VarArr;
        Arrays.sort(xi2VarArr, this);
        int i = 1;
        while (true) {
            int length = xi2VarArr.length;
            if (i >= length) {
                this.f21899f = xi2VarArr;
                this.f21901h = length;
                return;
            } else {
                if (xi2VarArr[i - 1].f21553g.equals(xi2VarArr[i].f21553g)) {
                    String strValueOf = String.valueOf(xi2VarArr[i].f21553g);
                    throw new IllegalArgumentException(outline.m1550A(new StringBuilder(strValueOf.length() + 25), "Duplicate data for uuid: ", strValueOf));
                }
                i++;
            }
        }
    }

    public yi2(xi2... xi2VarArr) {
        this(true, xi2VarArr);
    }
}
