package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nw2 implements Parcelable.Creator<lw2> {
    @Override // android.os.Parcelable.Creator
    public final lw2 createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        long jM5272K = 0;
        int iM5267J = 0;
        int iM5267J2 = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                iM5267J = C2622l.m5267J(parcel, i);
            } else if (c2 == 2) {
                iM5267J2 = C2622l.m5267J(parcel, i);
            } else if (c2 == 3) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 != 4) {
                C2622l.m5282M(parcel, i);
            } else {
                jM5272K = C2622l.m5272K(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new lw2(iM5267J, iM5267J2, strM5429s, jM5272K);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ lw2[] newArray(int i) {
        return new lw2[i];
    }
}
