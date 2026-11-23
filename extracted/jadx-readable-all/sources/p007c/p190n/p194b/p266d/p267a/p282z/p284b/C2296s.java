package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.s */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2296s implements Parcelable.Creator<C2294r> {
    @Override // android.os.Parcelable.Creator
    public final C2294r createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        int iM5267J = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 != 2) {
                C2622l.m5282M(parcel, i);
            } else {
                iM5267J = C2622l.m5267J(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2294r(strM5429s, iM5267J);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2294r[] newArray(int i) {
        return new C2294r[i];
    }
}
