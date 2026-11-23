package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.n9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3317n9 implements Parcelable.Creator<C3280m9> {
    @Override // android.os.Parcelable.Creator
    public final C3280m9 createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        String[] strArrM5434t = null;
        String[] strArrM5434t2 = null;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 == 2) {
                strArrM5434t = C2622l.m5434t(parcel, i);
            } else if (c2 != 3) {
                C2622l.m5282M(parcel, i);
            } else {
                strArrM5434t2 = C2622l.m5434t(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C3280m9(strM5429s, strArrM5434t, strArrM5434t2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3280m9[] newArray(int i) {
        return new C3280m9[i];
    }
}
