package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.i1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2397i1 implements Parcelable.Creator<C2377c> {
    @Override // android.os.Parcelable.Creator
    public final C2377c createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        String strM5429s2 = null;
        long jM5272K = 0;
        long jM5272K2 = 0;
        long jM5272K3 = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 2) {
                jM5272K = C2622l.m5272K(parcel, i);
            } else if (c2 == 3) {
                jM5272K2 = C2622l.m5272K(parcel, i);
            } else if (c2 == 4) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 == 5) {
                strM5429s2 = C2622l.m5429s(parcel, i);
            } else if (c2 != 6) {
                C2622l.m5282M(parcel, i);
            } else {
                jM5272K3 = C2622l.m5272K(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2377c(jM5272K, jM5272K2, strM5429s, strM5429s2, jM5272K3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2377c[] newArray(int i) {
        return new C2377c[i];
    }
}
