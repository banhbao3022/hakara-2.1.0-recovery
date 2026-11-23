package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.ka */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3207ka implements Parcelable.Creator<C3170ja> {
    @Override // android.os.Parcelable.Creator
    public final C3170ja createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        int iM5267J = 0;
        String strM5429s = null;
        int iM5267J2 = 0;
        int iM5267J3 = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                iM5267J2 = C2622l.m5267J(parcel, i);
            } else if (c2 == 2) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 == 3) {
                iM5267J3 = C2622l.m5267J(parcel, i);
            } else if (c2 != 1000) {
                C2622l.m5282M(parcel, i);
            } else {
                iM5267J = C2622l.m5267J(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C3170ja(iM5267J, iM5267J2, strM5429s, iM5267J3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3170ja[] newArray(int i) {
        return new C3170ja[i];
    }
}
