package p007c.p190n.p194b.p266d.p298f;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.n.b.d.f.x */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2796x implements Parcelable.Creator<C2606d> {
    @Override // android.os.Parcelable.Creator
    public final C2606d createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        int iM5267J = 0;
        long jM5272K = -1;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 == 2) {
                iM5267J = C2622l.m5267J(parcel, i);
            } else if (c2 != 3) {
                C2622l.m5282M(parcel, i);
            } else {
                jM5272K = C2622l.m5272K(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2606d(strM5429s, iM5267J, jM5272K);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2606d[] newArray(int i) {
        return new C2606d[i];
    }
}
