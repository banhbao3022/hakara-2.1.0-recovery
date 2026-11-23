package p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.d.d */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2340d implements Parcelable.Creator<C2337a> {
    @Override // android.os.Parcelable.Creator
    public final C2337a createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        int iM5267J = 0;
        Bundle bundleM5404n = null;
        int iM5267J2 = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                iM5267J = C2622l.m5267J(parcel, i);
            } else if (c2 == 2) {
                iM5267J2 = C2622l.m5267J(parcel, i);
            } else if (c2 != 3) {
                C2622l.m5282M(parcel, i);
            } else {
                bundleM5404n = C2622l.m5404n(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2337a(iM5267J, iM5267J2, bundleM5404n);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2337a[] newArray(int i) {
        return new C2337a[i];
    }
}
