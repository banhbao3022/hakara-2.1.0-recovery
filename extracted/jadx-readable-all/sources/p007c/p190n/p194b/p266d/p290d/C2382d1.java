package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.d1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2382d1 implements Parcelable.Creator<C2401k> {
    @Override // android.os.Parcelable.Creator
    public final C2401k createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        String strM5429s2 = null;
        String strM5429s3 = null;
        C2398j c2398j = null;
        ArrayList arrayListM5449w = null;
        long jM5272K = 0;
        int iM5267J = 0;
        int iM5267J2 = 0;
        int iM5267J3 = 0;
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
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case 5:
                    strM5429s3 = C2622l.m5429s(parcel, i);
                    break;
                case 6:
                    c2398j = (C2398j) C2622l.m5424r(parcel, i, C2398j.CREATOR);
                    break;
                case 7:
                    iM5267J2 = C2622l.m5267J(parcel, i);
                    break;
                case '\b':
                    arrayListM5449w = C2622l.m5449w(parcel, i, C2404l.CREATOR);
                    break;
                case '\t':
                    iM5267J3 = C2622l.m5267J(parcel, i);
                    break;
                case '\n':
                    jM5272K = C2622l.m5272K(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2401k(strM5429s, strM5429s2, iM5267J, strM5429s3, c2398j, iM5267J2, arrayListM5449w, iM5267J3, jM5272K);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2401k[] newArray(int i) {
        return new C2401k[i];
    }
}
