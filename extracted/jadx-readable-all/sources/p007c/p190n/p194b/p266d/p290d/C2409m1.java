package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.m1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2409m1 implements Parcelable.Creator<C2419q> {
    @Override // android.os.Parcelable.Creator
    public final C2419q createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        int iM5267J = 0;
        int iM5267J2 = 0;
        int iM5267J3 = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 2) {
                iM5267J = C2622l.m5267J(parcel, i);
            } else if (c2 == 3) {
                iM5267J2 = C2622l.m5267J(parcel, i);
            } else if (c2 != 4) {
                C2622l.m5282M(parcel, i);
            } else {
                iM5267J3 = C2622l.m5267J(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2419q(iM5267J, iM5267J2, iM5267J3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2419q[] newArray(int i) {
        return new C2419q[i];
    }
}
