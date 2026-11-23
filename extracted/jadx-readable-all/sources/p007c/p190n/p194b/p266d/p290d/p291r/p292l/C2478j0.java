package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.j0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2478j0 implements Parcelable.Creator<C2452e> {
    @Override // android.os.Parcelable.Creator
    public final C2452e createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        String strM5429s2 = null;
        int iM5267J = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 2) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 == 3) {
                iM5267J = C2622l.m5267J(parcel, i);
            } else if (c2 != 4) {
                C2622l.m5282M(parcel, i);
            } else {
                strM5429s2 = C2622l.m5429s(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2452e(strM5429s, iM5267J, strM5429s2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2452e[] newArray(int i) {
        return new C2452e[i];
    }
}
