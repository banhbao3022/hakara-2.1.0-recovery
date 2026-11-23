package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.k */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2479k implements Parcelable.Creator<C2444a> {
    @Override // android.os.Parcelable.Creator
    public final C2444a createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        String strM5429s2 = null;
        IBinder iBinderM5262I = null;
        C2456g c2456g = null;
        boolean zM5247F = false;
        boolean zM5247F2 = false;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case 3:
                    strM5429s2 = C2622l.m5429s(parcel, i);
                    break;
                case 4:
                    iBinderM5262I = C2622l.m5262I(parcel, i);
                    break;
                case 5:
                    c2456g = (C2456g) C2622l.m5424r(parcel, i, C2456g.CREATOR);
                    break;
                case 6:
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case 7:
                    zM5247F2 = C2622l.m5247F(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2444a(strM5429s, strM5429s2, iBinderM5262I, c2456g, zM5247F, zM5247F2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2444a[] newArray(int i) {
        return new C2444a[i];
    }
}
