package p007c.p190n.p194b.p266d.p298f.p302q;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.f.q.o0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2750o0 implements Parcelable.Creator<C2761u> {
    @Override // android.os.Parcelable.Creator
    public final C2761u createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        int iM5267J = 0;
        boolean zM5247F = false;
        boolean zM5247F2 = false;
        int iM5267J2 = 0;
        int iM5267J3 = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                iM5267J = C2622l.m5267J(parcel, i);
            } else if (c2 == 2) {
                zM5247F = C2622l.m5247F(parcel, i);
            } else if (c2 == 3) {
                zM5247F2 = C2622l.m5247F(parcel, i);
            } else if (c2 == 4) {
                iM5267J2 = C2622l.m5267J(parcel, i);
            } else if (c2 != 5) {
                C2622l.m5282M(parcel, i);
            } else {
                iM5267J3 = C2622l.m5267J(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2761u(iM5267J, zM5247F, zM5247F2, iM5267J2, iM5267J3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2761u[] newArray(int i) {
        return new C2761u[i];
    }
}
