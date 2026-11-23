package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.w */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2563w implements Parcelable.Creator<C2565x> {
    @Override // android.os.Parcelable.Creator
    public final C2565x createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        C2561v c2561v = null;
        C2561v c2561v2 = null;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 2) {
                c2561v = (C2561v) C2622l.m5424r(parcel, i, C2561v.CREATOR);
            } else if (c2 != 3) {
                C2622l.m5282M(parcel, i);
            } else {
                c2561v2 = (C2561v) C2622l.m5424r(parcel, i, C2561v.CREATOR);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2565x(c2561v, c2561v2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2565x[] newArray(int i) {
        return new C2565x[i];
    }
}
