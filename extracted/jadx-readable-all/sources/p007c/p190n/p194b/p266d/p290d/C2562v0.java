package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.v0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2562v0 implements Parcelable.Creator<C2389g> {
    @Override // android.os.Parcelable.Creator
    public final C2389g createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        boolean zM5247F = false;
        String strM5429s = null;
        boolean zM5247F2 = false;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 2) {
                zM5247F = C2622l.m5247F(parcel, i);
            } else if (c2 == 3) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 != 4) {
                C2622l.m5282M(parcel, i);
            } else {
                zM5247F2 = C2622l.m5247F(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2389g(zM5247F, strM5429s, zM5247F2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2389g[] newArray(int i) {
        return new C2389g[i];
    }
}
