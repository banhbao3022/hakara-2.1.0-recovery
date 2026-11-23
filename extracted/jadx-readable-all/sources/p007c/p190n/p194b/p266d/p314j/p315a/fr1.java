package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fr1 implements Parcelable.Creator<er1> {
    @Override // android.os.Parcelable.Creator
    public final er1 createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        int iM5267J = 0;
        byte[] bArrM5409o = null;
        int iM5267J2 = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                iM5267J = C2622l.m5267J(parcel, i);
            } else if (c2 == 2) {
                bArrM5409o = C2622l.m5409o(parcel, i);
            } else if (c2 != 3) {
                C2622l.m5282M(parcel, i);
            } else {
                iM5267J2 = C2622l.m5267J(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new er1(iM5267J, bArrM5409o, iM5267J2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ er1[] newArray(int i) {
        return new er1[i];
    }
}
