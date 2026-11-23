package p007c.p190n.p194b.p266d.p314j.p325k;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.k.i */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4191i implements Parcelable.Creator<C4149f> {
    @Override // android.os.Parcelable.Creator
    public final C4149f createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        long jM5272K = 0;
        long jM5272K2 = 0;
        String strM5429s = null;
        String strM5429s2 = null;
        String strM5429s3 = null;
        Bundle bundleM5404n = null;
        boolean zM5247F = false;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    jM5272K = C2622l.m5272K(parcel, i);
                    break;
                case 2:
                    jM5272K2 = C2622l.m5272K(parcel, i);
                    break;
                case 3:
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case 4:
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case 5:
                    strM5429s2 = C2622l.m5429s(parcel, i);
                    break;
                case 6:
                    strM5429s3 = C2622l.m5429s(parcel, i);
                    break;
                case 7:
                    bundleM5404n = C2622l.m5404n(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C4149f(jM5272K, jM5272K2, zM5247F, strM5429s, strM5429s2, strM5429s3, bundleM5404n);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4149f[] newArray(int i) {
        return new C4149f[i];
    }
}
