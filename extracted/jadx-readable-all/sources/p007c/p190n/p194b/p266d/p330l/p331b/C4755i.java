package p007c.p190n.p194b.p266d.p330l.p331b;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.C2757s;

/* JADX INFO: renamed from: c.n.b.d.l.b.i */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4755i implements Parcelable.Creator<C4756j> {
    @Override // android.os.Parcelable.Creator
    public final C4756j createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        int iM5267J = 0;
        C2757s c2757s = null;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                iM5267J = C2622l.m5267J(parcel, i);
            } else if (c2 != 2) {
                C2622l.m5282M(parcel, i);
            } else {
                c2757s = (C2757s) C2622l.m5424r(parcel, i, C2757s.CREATOR);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C4756j(iM5267J, c2757s);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4756j[] newArray(int i) {
        return new C4756j[i];
    }
}
