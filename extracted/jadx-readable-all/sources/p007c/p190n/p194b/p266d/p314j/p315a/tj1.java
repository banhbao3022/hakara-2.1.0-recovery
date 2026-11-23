package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class tj1 implements Parcelable.Creator<sj1> {
    @Override // android.os.Parcelable.Creator
    public final sj1 createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        int iM5267J = 0;
        int iM5267J2 = 0;
        int iM5267J3 = 0;
        int iM5267J4 = 0;
        int iM5267J5 = 0;
        int iM5267J6 = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case 2:
                    iM5267J2 = C2622l.m5267J(parcel, i);
                    break;
                case 3:
                    iM5267J3 = C2622l.m5267J(parcel, i);
                    break;
                case 4:
                    iM5267J4 = C2622l.m5267J(parcel, i);
                    break;
                case 5:
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case 6:
                    iM5267J5 = C2622l.m5267J(parcel, i);
                    break;
                case 7:
                    iM5267J6 = C2622l.m5267J(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new sj1(iM5267J, iM5267J2, iM5267J3, iM5267J4, strM5429s, iM5267J5, iM5267J6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ sj1[] newArray(int i) {
        return new sj1[i];
    }
}
