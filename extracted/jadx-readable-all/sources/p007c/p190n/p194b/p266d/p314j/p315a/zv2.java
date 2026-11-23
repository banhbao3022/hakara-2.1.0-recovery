package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zv2 implements Parcelable.Creator<yv2> {
    @Override // android.os.Parcelable.Creator
    public final yv2 createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        String strM5429s2 = null;
        yv2 yv2Var = null;
        IBinder iBinderM5262I = null;
        int iM5267J = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                iM5267J = C2622l.m5267J(parcel, i);
            } else if (c2 == 2) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 == 3) {
                strM5429s2 = C2622l.m5429s(parcel, i);
            } else if (c2 == 4) {
                yv2Var = (yv2) C2622l.m5424r(parcel, i, yv2.CREATOR);
            } else if (c2 != 5) {
                C2622l.m5282M(parcel, i);
            } else {
                iBinderM5262I = C2622l.m5262I(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new yv2(iM5267J, strM5429s, strM5429s2, yv2Var, iBinderM5262I);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ yv2[] newArray(int i) {
        return new yv2[i];
    }
}
