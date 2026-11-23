package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.k.b.na */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4612na implements Parcelable.Creator<C4624oa> {
    @Override // android.os.Parcelable.Creator
    public final C4624oa createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        long jM5272K = 0;
        long jM5272K2 = 0;
        long jM5272K3 = 0;
        String strM5429s = null;
        String strM5429s2 = null;
        C4712w9 c4712w9 = null;
        String strM5429s3 = null;
        C4625p c4625p = null;
        C4625p c4625p2 = null;
        C4625p c4625p3 = null;
        boolean zM5247F = false;
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
                    c4712w9 = (C4712w9) C2622l.m5424r(parcel, i, C4712w9.CREATOR);
                    break;
                case 5:
                    jM5272K = C2622l.m5272K(parcel, i);
                    break;
                case 6:
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case 7:
                    strM5429s3 = C2622l.m5429s(parcel, i);
                    break;
                case '\b':
                    c4625p = (C4625p) C2622l.m5424r(parcel, i, C4625p.CREATOR);
                    break;
                case '\t':
                    jM5272K2 = C2622l.m5272K(parcel, i);
                    break;
                case '\n':
                    c4625p2 = (C4625p) C2622l.m5424r(parcel, i, C4625p.CREATOR);
                    break;
                case 11:
                    jM5272K3 = C2622l.m5272K(parcel, i);
                    break;
                case '\f':
                    c4625p3 = (C4625p) C2622l.m5424r(parcel, i, C4625p.CREATOR);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C4624oa(strM5429s, strM5429s2, c4712w9, jM5272K, zM5247F, strM5429s3, c4625p, jM5272K2, c4625p2, jM5272K3, c4625p3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4624oa[] newArray(int i) {
        return new C4624oa[i];
    }
}
