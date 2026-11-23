package p007c.p190n.p194b.p266d.p290d.p295s;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.s.d */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2523d implements Parcelable.Creator<C2550u> {
    @Override // android.os.Parcelable.Creator
    public final C2550u createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                C2622l.m5282M(parcel, i);
            } else {
                strM5429s = C2622l.m5429s(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2550u(strM5429s);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2550u[] newArray(int i) {
        return new C2550u[i];
    }
}
