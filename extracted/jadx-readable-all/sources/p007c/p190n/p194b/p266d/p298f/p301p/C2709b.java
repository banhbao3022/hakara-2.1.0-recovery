package p007c.p190n.p194b.p266d.p298f.p301p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.f.p.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2709b implements Parcelable.Creator<C2708a> {
    @Override // android.os.Parcelable.Creator
    public final C2708a createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        int iM5267J = 0;
        Uri uri = null;
        int iM5267J2 = 0;
        int iM5267J3 = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                iM5267J = C2622l.m5267J(parcel, i);
            } else if (c2 == 2) {
                uri = (Uri) C2622l.m5424r(parcel, i, Uri.CREATOR);
            } else if (c2 == 3) {
                iM5267J2 = C2622l.m5267J(parcel, i);
            } else if (c2 != 4) {
                C2622l.m5282M(parcel, i);
            } else {
                iM5267J3 = C2622l.m5267J(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2708a(iM5267J, uri, iM5267J2, iM5267J3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2708a[] newArray(int i) {
        return new C2708a[i];
    }
}
