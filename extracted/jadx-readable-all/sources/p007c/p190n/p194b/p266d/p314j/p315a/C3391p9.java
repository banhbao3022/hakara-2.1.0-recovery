package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.p9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3391p9 implements Parcelable.Creator<C3354o9> {
    @Override // android.os.Parcelable.Creator
    public final C3354o9 createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        byte[] bArrM5409o = null;
        String[] strArrM5434t = null;
        String[] strArrM5434t2 = null;
        long jM5272K = 0;
        boolean zM5247F = false;
        int iM5267J = 0;
        boolean zM5247F2 = false;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case 2:
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case 3:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case 4:
                    bArrM5409o = C2622l.m5409o(parcel, i);
                    break;
                case 5:
                    strArrM5434t = C2622l.m5434t(parcel, i);
                    break;
                case 6:
                    strArrM5434t2 = C2622l.m5434t(parcel, i);
                    break;
                case 7:
                    zM5247F2 = C2622l.m5247F(parcel, i);
                    break;
                case '\b':
                    jM5272K = C2622l.m5272K(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C3354o9(zM5247F, strM5429s, iM5267J, bArrM5409o, strArrM5434t, strArrM5434t2, zM5247F2, jM5272K);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3354o9[] newArray(int i) {
        return new C3354o9[i];
    }
}
