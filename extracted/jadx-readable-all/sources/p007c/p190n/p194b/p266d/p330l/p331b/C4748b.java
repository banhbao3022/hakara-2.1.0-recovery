package p007c.p190n.p194b.p266d.p330l.p331b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.l.b.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4748b implements Parcelable.Creator<C4749c> {
    @Override // android.os.Parcelable.Creator
    public final C4749c createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        int iM5267J = 0;
        Intent intent = null;
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
                intent = (Intent) C2622l.m5424r(parcel, i, Intent.CREATOR);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C4749c(iM5267J, iM5267J2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4749c[] newArray(int i) {
        return new C4749c[i];
    }
}
