package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.k.b.v9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4701v9 implements Parcelable.Creator<C4712w9> {
    @Override // android.os.Parcelable.Creator
    public final C4712w9 createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        Long lValueOf = null;
        Float fValueOf = null;
        String strM5429s2 = null;
        String strM5429s3 = null;
        Double dValueOf = null;
        long jM5272K = 0;
        int iM5267J = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case 2:
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case 3:
                    jM5272K = C2622l.m5272K(parcel, i);
                    break;
                case 4:
                    int iM5277L = C2622l.m5277L(parcel, i);
                    if (iM5277L != 0) {
                        C2622l.m5309S1(parcel, i, iM5277L, 8);
                        lValueOf = Long.valueOf(parcel.readLong());
                    } else {
                        lValueOf = null;
                    }
                    break;
                case 5:
                    int iM5277L2 = C2622l.m5277L(parcel, i);
                    if (iM5277L2 != 0) {
                        C2622l.m5309S1(parcel, i, iM5277L2, 4);
                        fValueOf = Float.valueOf(parcel.readFloat());
                    } else {
                        fValueOf = null;
                    }
                    break;
                case 6:
                    strM5429s2 = C2622l.m5429s(parcel, i);
                    break;
                case 7:
                    strM5429s3 = C2622l.m5429s(parcel, i);
                    break;
                case '\b':
                    int iM5277L3 = C2622l.m5277L(parcel, i);
                    if (iM5277L3 != 0) {
                        C2622l.m5309S1(parcel, i, iM5277L3, 8);
                        dValueOf = Double.valueOf(parcel.readDouble());
                    } else {
                        dValueOf = null;
                    }
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C4712w9(iM5267J, strM5429s, jM5272K, lValueOf, fValueOf, strM5429s2, strM5429s3, dValueOf);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4712w9[] newArray(int i) {
        return new C4712w9[i];
    }
}
