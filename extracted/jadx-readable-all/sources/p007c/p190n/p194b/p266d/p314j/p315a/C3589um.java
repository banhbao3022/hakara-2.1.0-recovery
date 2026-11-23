package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.um */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3589um implements Parcelable.Creator<C3552tm> {
    @Override // android.os.Parcelable.Creator
    public final C3552tm createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        String strM5429s2 = null;
        jw2 jw2Var = null;
        ew2 ew2Var = null;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 == 2) {
                strM5429s2 = C2622l.m5429s(parcel, i);
            } else if (c2 == 3) {
                jw2Var = (jw2) C2622l.m5424r(parcel, i, jw2.CREATOR);
            } else if (c2 != 4) {
                C2622l.m5282M(parcel, i);
            } else {
                ew2Var = (ew2) C2622l.m5424r(parcel, i, ew2.CREATOR);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C3552tm(strM5429s, strM5429s2, jw2Var, ew2Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3552tm[] newArray(int i) {
        return new C3552tm[i];
    }
}
