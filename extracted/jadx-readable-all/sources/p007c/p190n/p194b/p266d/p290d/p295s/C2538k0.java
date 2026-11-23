package p007c.p190n.p194b.p266d.p290d.p295s;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p290d.C2380d;
import p007c.p190n.p194b.p266d.p290d.C2565x;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.s.k0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2538k0 implements Parcelable.Creator<C2536j0> {
    @Override // android.os.Parcelable.Creator
    public final C2536j0 createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        C2380d c2380d = null;
        C2565x c2565x = null;
        double dM5252G = 0.0d;
        double dM5252G2 = 0.0d;
        boolean zM5247F = false;
        int iM5267J = 0;
        int iM5267J2 = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    dM5252G = C2622l.m5252G(parcel, i);
                    break;
                case 3:
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case 4:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case 5:
                    c2380d = (C2380d) C2622l.m5424r(parcel, i, C2380d.CREATOR);
                    break;
                case 6:
                    iM5267J2 = C2622l.m5267J(parcel, i);
                    break;
                case 7:
                    c2565x = (C2565x) C2622l.m5424r(parcel, i, C2565x.CREATOR);
                    break;
                case '\b':
                    dM5252G2 = C2622l.m5252G(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2536j0(dM5252G, zM5247F, iM5267J, c2380d, iM5267J2, c2565x, dM5252G2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2536j0[] newArray(int i) {
        return new C2536j0[i];
    }
}
