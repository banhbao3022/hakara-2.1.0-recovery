package p007c.p190n.p194b.p266d.p298f.p302q;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.f.q.y0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2772y0 implements Parcelable.Creator<C2726f> {
    @Override // android.os.Parcelable.Creator
    public final C2726f createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        C2761u c2761u = null;
        int[] iArrM5414p = null;
        int[] iArrM5414p2 = null;
        boolean zM5247F = false;
        boolean zM5247F2 = false;
        int iM5267J = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    c2761u = (C2761u) C2622l.m5424r(parcel, i, C2761u.CREATOR);
                    break;
                case 2:
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case 3:
                    zM5247F2 = C2622l.m5247F(parcel, i);
                    break;
                case 4:
                    iArrM5414p = C2622l.m5414p(parcel, i);
                    break;
                case 5:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case 6:
                    iArrM5414p2 = C2622l.m5414p(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2726f(c2761u, zM5247F, zM5247F2, iArrM5414p, iM5267J, iArrM5414p2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2726f[] newArray(int i) {
        return new C2726f[i];
    }
}
