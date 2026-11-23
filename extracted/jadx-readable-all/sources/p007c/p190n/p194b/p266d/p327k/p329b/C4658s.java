package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.k.b.s */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4658s implements Parcelable.Creator<C4625p> {
    @Override // android.os.Parcelable.Creator
    public final C4625p createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        C4613o c4613o = null;
        String strM5429s2 = null;
        long jM5272K = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 2) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 == 3) {
                c4613o = (C4613o) C2622l.m5424r(parcel, i, C4613o.CREATOR);
            } else if (c2 == 4) {
                strM5429s2 = C2622l.m5429s(parcel, i);
            } else if (c2 != 5) {
                C2622l.m5282M(parcel, i);
            } else {
                jM5272K = C2622l.m5272K(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C4625p(strM5429s, c4613o, strM5429s2, jM5272K);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4625p[] newArray(int i) {
        return new C4625p[i];
    }
}
