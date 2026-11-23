package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.k.b.ea */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4504ea implements Parcelable.Creator<C4480ca> {
    @Override // android.os.Parcelable.Creator
    public final C4480ca createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        long jM5272K = 0;
        long jM5272K2 = 0;
        long jM5272K3 = 0;
        long jM5272K4 = 0;
        long jM5272K5 = 0;
        String strM5429s = null;
        String strM5429s2 = null;
        String strM5429s3 = null;
        String strM5429s4 = null;
        String strM5429s5 = null;
        String strM5429s6 = null;
        String strM5429s7 = null;
        Boolean boolValueOf = null;
        ArrayList<String> arrayListM5439u = null;
        String strM5429s8 = null;
        long jM5272K6 = -2147483648L;
        String strM5429s9 = "";
        boolean zM5247F = true;
        boolean zM5247F2 = false;
        int iM5267J = 0;
        boolean zM5247F3 = true;
        boolean zM5247F4 = true;
        boolean zM5247F5 = false;
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
                    strM5429s3 = C2622l.m5429s(parcel, i);
                    break;
                case 5:
                    strM5429s4 = C2622l.m5429s(parcel, i);
                    break;
                case 6:
                    jM5272K = C2622l.m5272K(parcel, i);
                    break;
                case 7:
                    jM5272K2 = C2622l.m5272K(parcel, i);
                    break;
                case '\b':
                    strM5429s5 = C2622l.m5429s(parcel, i);
                    break;
                case '\t':
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case '\n':
                    zM5247F2 = C2622l.m5247F(parcel, i);
                    break;
                case 11:
                    jM5272K6 = C2622l.m5272K(parcel, i);
                    break;
                case '\f':
                    strM5429s6 = C2622l.m5429s(parcel, i);
                    break;
                case '\r':
                    jM5272K3 = C2622l.m5272K(parcel, i);
                    break;
                case 14:
                    jM5272K4 = C2622l.m5272K(parcel, i);
                    break;
                case 15:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case 16:
                    zM5247F3 = C2622l.m5247F(parcel, i);
                    break;
                case 17:
                    zM5247F4 = C2622l.m5247F(parcel, i);
                    break;
                case 18:
                    zM5247F5 = C2622l.m5247F(parcel, i);
                    break;
                case 19:
                    strM5429s7 = C2622l.m5429s(parcel, i);
                    break;
                case 20:
                default:
                    C2622l.m5282M(parcel, i);
                    break;
                case 21:
                    int iM5277L = C2622l.m5277L(parcel, i);
                    if (iM5277L != 0) {
                        C2622l.m5309S1(parcel, i, iM5277L, 4);
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    } else {
                        boolValueOf = null;
                    }
                    break;
                case 22:
                    jM5272K5 = C2622l.m5272K(parcel, i);
                    break;
                case 23:
                    arrayListM5439u = C2622l.m5439u(parcel, i);
                    break;
                case 24:
                    strM5429s8 = C2622l.m5429s(parcel, i);
                    break;
                case 25:
                    strM5429s9 = C2622l.m5429s(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C4480ca(strM5429s, strM5429s2, strM5429s3, strM5429s4, jM5272K, jM5272K2, strM5429s5, zM5247F, zM5247F2, jM5272K6, strM5429s6, jM5272K3, jM5272K4, iM5267J, zM5247F3, zM5247F4, zM5247F5, strM5429s7, boolValueOf, jM5272K5, arrayListM5439u, strM5429s8, strM5429s9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4480ca[] newArray(int i) {
        return new C4480ca[i];
    }
}
