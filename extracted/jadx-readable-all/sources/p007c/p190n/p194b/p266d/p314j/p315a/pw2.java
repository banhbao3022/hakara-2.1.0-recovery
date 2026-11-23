package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class pw2 implements Parcelable.Creator<ow2> {
    @Override // android.os.Parcelable.Creator
    public final ow2 createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        yv2 yv2Var = null;
        Bundle bundleM5404n = null;
        long jM5272K = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 == 2) {
                jM5272K = C2622l.m5272K(parcel, i);
            } else if (c2 == 3) {
                yv2Var = (yv2) C2622l.m5424r(parcel, i, yv2.CREATOR);
            } else if (c2 != 4) {
                C2622l.m5282M(parcel, i);
            } else {
                bundleM5404n = C2622l.m5404n(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new ow2(strM5429s, jM5272K, yv2Var, bundleM5404n);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ ow2[] newArray(int i) {
        return new ow2[i];
    }
}
