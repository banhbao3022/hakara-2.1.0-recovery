package p007c.p190n.p194b.p266d.p298f;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.n.b.d.f.l0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2623l0 implements Parcelable.Creator<C2621k0> {
    @Override // android.os.Parcelable.Creator
    public final C2621k0 createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        boolean zM5247F = false;
        String strM5429s = null;
        int iM5267J = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                zM5247F = C2622l.m5247F(parcel, i);
            } else if (c2 == 2) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 != 3) {
                C2622l.m5282M(parcel, i);
            } else {
                iM5267J = C2622l.m5267J(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2621k0(zM5247F, strM5429s, iM5267J);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2621k0[] newArray(int i) {
        return new C2621k0[i];
    }
}
