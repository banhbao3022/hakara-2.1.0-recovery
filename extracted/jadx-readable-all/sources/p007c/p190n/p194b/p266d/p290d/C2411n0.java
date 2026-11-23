package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.n0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2411n0 implements Parcelable.Creator<C2374b> {
    @Override // android.os.Parcelable.Creator
    public final C2374b createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        String[] strArrM5434t = null;
        long jM5272K = 0;
        long jM5272K2 = 0;
        boolean zM5247F = false;
        boolean zM5247F2 = false;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    jM5272K = C2622l.m5272K(parcel, i);
                    break;
                case 3:
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case 4:
                    jM5272K2 = C2622l.m5272K(parcel, i);
                    break;
                case 5:
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case 6:
                    strArrM5434t = C2622l.m5434t(parcel, i);
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
        return new C2374b(jM5272K, strM5429s, jM5272K2, zM5247F, strArrM5434t, zM5247F2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2374b[] newArray(int i) {
        return new C2374b[i];
    }
}
