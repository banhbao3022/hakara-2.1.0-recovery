package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaError;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.w0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2564w0 implements Parcelable.Creator<MediaError> {
    @Override // android.os.Parcelable.Creator
    public final MediaError createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        long jM5272K = 0;
        Integer numValueOf = null;
        String strM5429s = null;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 2) {
                jM5272K = C2622l.m5272K(parcel, i);
            } else if (c2 == 3) {
                int iM5277L = C2622l.m5277L(parcel, i);
                if (iM5277L == 0) {
                    numValueOf = null;
                } else {
                    C2622l.m5309S1(parcel, i, iM5277L, 4);
                    numValueOf = Integer.valueOf(parcel.readInt());
                }
            } else if (c2 != 4) {
                C2622l.m5282M(parcel, i);
            } else {
                strM5429s = C2622l.m5429s(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new MediaError(jM5272K, numValueOf, strM5429s);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaError[] newArray(int i) {
        return new MediaError[i];
    }
}
