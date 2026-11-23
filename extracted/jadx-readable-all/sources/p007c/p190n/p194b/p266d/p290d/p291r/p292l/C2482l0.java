package p007c.p190n.p194b.p266d.p290d.p291r.p292l;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.r.l.l0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast-framework@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2482l0 implements Parcelable.Creator<C2456g> {
    @Override // android.os.Parcelable.Creator
    public final C2456g createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        ArrayList<String> arrayListM5439u = null;
        int[] iArrM5414p = null;
        String strM5429s = null;
        IBinder iBinderM5262I = null;
        long jM5272K = 0;
        int iM5267J = 0;
        int iM5267J2 = 0;
        int iM5267J3 = 0;
        int iM5267J4 = 0;
        int iM5267J5 = 0;
        int iM5267J6 = 0;
        int iM5267J7 = 0;
        int iM5267J8 = 0;
        int iM5267J9 = 0;
        int iM5267J10 = 0;
        int iM5267J11 = 0;
        int iM5267J12 = 0;
        int iM5267J13 = 0;
        int iM5267J14 = 0;
        int iM5267J15 = 0;
        int iM5267J16 = 0;
        int iM5267J17 = 0;
        int iM5267J18 = 0;
        int iM5267J19 = 0;
        int iM5267J20 = 0;
        int iM5267J21 = 0;
        int iM5267J22 = 0;
        int iM5267J23 = 0;
        int iM5267J24 = 0;
        int iM5267J25 = 0;
        int iM5267J26 = 0;
        int iM5267J27 = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    arrayListM5439u = C2622l.m5439u(parcel, i);
                    break;
                case 3:
                    iArrM5414p = C2622l.m5414p(parcel, i);
                    break;
                case 4:
                    jM5272K = C2622l.m5272K(parcel, i);
                    break;
                case 5:
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case 6:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case 7:
                    iM5267J2 = C2622l.m5267J(parcel, i);
                    break;
                case '\b':
                    iM5267J3 = C2622l.m5267J(parcel, i);
                    break;
                case '\t':
                    iM5267J4 = C2622l.m5267J(parcel, i);
                    break;
                case '\n':
                    iM5267J5 = C2622l.m5267J(parcel, i);
                    break;
                case 11:
                    iM5267J6 = C2622l.m5267J(parcel, i);
                    break;
                case '\f':
                    iM5267J7 = C2622l.m5267J(parcel, i);
                    break;
                case '\r':
                    iM5267J8 = C2622l.m5267J(parcel, i);
                    break;
                case 14:
                    iM5267J9 = C2622l.m5267J(parcel, i);
                    break;
                case 15:
                    iM5267J10 = C2622l.m5267J(parcel, i);
                    break;
                case 16:
                    iM5267J11 = C2622l.m5267J(parcel, i);
                    break;
                case 17:
                    iM5267J12 = C2622l.m5267J(parcel, i);
                    break;
                case 18:
                    iM5267J13 = C2622l.m5267J(parcel, i);
                    break;
                case 19:
                    iM5267J14 = C2622l.m5267J(parcel, i);
                    break;
                case 20:
                    iM5267J15 = C2622l.m5267J(parcel, i);
                    break;
                case 21:
                    iM5267J16 = C2622l.m5267J(parcel, i);
                    break;
                case 22:
                    iM5267J17 = C2622l.m5267J(parcel, i);
                    break;
                case 23:
                    iM5267J18 = C2622l.m5267J(parcel, i);
                    break;
                case 24:
                    iM5267J19 = C2622l.m5267J(parcel, i);
                    break;
                case 25:
                    iM5267J20 = C2622l.m5267J(parcel, i);
                    break;
                case 26:
                    iM5267J21 = C2622l.m5267J(parcel, i);
                    break;
                case 27:
                    iM5267J22 = C2622l.m5267J(parcel, i);
                    break;
                case 28:
                    iM5267J23 = C2622l.m5267J(parcel, i);
                    break;
                case 29:
                    iM5267J24 = C2622l.m5267J(parcel, i);
                    break;
                case 30:
                    iM5267J25 = C2622l.m5267J(parcel, i);
                    break;
                case 31:
                    iM5267J26 = C2622l.m5267J(parcel, i);
                    break;
                case ' ':
                    iM5267J27 = C2622l.m5267J(parcel, i);
                    break;
                case '!':
                    iBinderM5262I = C2622l.m5262I(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2456g(arrayListM5439u, iArrM5414p, jM5272K, strM5429s, iM5267J, iM5267J2, iM5267J3, iM5267J4, iM5267J5, iM5267J6, iM5267J7, iM5267J8, iM5267J9, iM5267J10, iM5267J11, iM5267J12, iM5267J13, iM5267J14, iM5267J15, iM5267J16, iM5267J17, iM5267J18, iM5267J19, iM5267J20, iM5267J21, iM5267J22, iM5267J23, iM5267J24, iM5267J25, iM5267J26, iM5267J27, iBinderM5262I);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2456g[] newArray(int i) {
        return new C2456g[i];
    }
}
