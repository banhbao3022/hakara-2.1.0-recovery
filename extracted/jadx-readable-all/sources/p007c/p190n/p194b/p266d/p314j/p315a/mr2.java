package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mr2 implements Parcelable.Creator<lr2> {
    @Override // android.os.Parcelable.Creator
    public final lr2 createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        long jM5272K = 0;
        long jM5272K2 = 0;
        String strM5429s = null;
        String strM5429s2 = null;
        String strM5429s3 = null;
        String strM5429s4 = null;
        Bundle bundleM5404n = null;
        String strM5429s5 = null;
        boolean zM5247F = false;
        int iM5267J = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case 3:
                    jM5272K = C2622l.m5272K(parcel, i);
                    break;
                case 4:
                    strM5429s2 = C2622l.m5429s(parcel, i);
                    break;
                case 5:
                    strM5429s3 = C2622l.m5429s(parcel, i);
                    break;
                case 6:
                    strM5429s4 = C2622l.m5429s(parcel, i);
                    break;
                case 7:
                    bundleM5404n = C2622l.m5404n(parcel, i);
                    break;
                case '\b':
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case '\t':
                    jM5272K2 = C2622l.m5272K(parcel, i);
                    break;
                case '\n':
                    strM5429s5 = C2622l.m5429s(parcel, i);
                    break;
                case 11:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new lr2(strM5429s, jM5272K, strM5429s2, strM5429s3, strM5429s4, bundleM5404n, zM5247F, jM5272K2, strM5429s5, iM5267J);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ lr2[] newArray(int i) {
        return new lr2[i];
    }
}
