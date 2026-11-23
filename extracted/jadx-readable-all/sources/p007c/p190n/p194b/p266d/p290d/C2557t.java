package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.t */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2557t implements Parcelable.Creator<C2371a> {
    @Override // android.os.Parcelable.Creator
    public final C2371a createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        long jM5272K = 0;
        long jM5272K2 = 0;
        String strM5429s = null;
        String strM5429s2 = null;
        String strM5429s3 = null;
        String strM5429s4 = null;
        String strM5429s5 = null;
        String strM5429s6 = null;
        String strM5429s7 = null;
        String strM5429s8 = null;
        String strM5429s9 = null;
        C2416p c2416p = null;
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
                    jM5272K = C2622l.m5272K(parcel, i);
                    break;
                case 5:
                    strM5429s3 = C2622l.m5429s(parcel, i);
                    break;
                case 6:
                    strM5429s4 = C2622l.m5429s(parcel, i);
                    break;
                case 7:
                    strM5429s5 = C2622l.m5429s(parcel, i);
                    break;
                case '\b':
                    strM5429s6 = C2622l.m5429s(parcel, i);
                    break;
                case '\t':
                    strM5429s7 = C2622l.m5429s(parcel, i);
                    break;
                case '\n':
                    strM5429s8 = C2622l.m5429s(parcel, i);
                    break;
                case 11:
                    jM5272K2 = C2622l.m5272K(parcel, i);
                    break;
                case '\f':
                    strM5429s9 = C2622l.m5429s(parcel, i);
                    break;
                case '\r':
                    c2416p = (C2416p) C2622l.m5424r(parcel, i, C2416p.CREATOR);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2371a(strM5429s, strM5429s2, jM5272K, strM5429s3, strM5429s4, strM5429s5, strM5429s6, strM5429s7, strM5429s8, jM5272K2, strM5429s9, c2416p);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2371a[] newArray(int i) {
        return new C2371a[i];
    }
}
