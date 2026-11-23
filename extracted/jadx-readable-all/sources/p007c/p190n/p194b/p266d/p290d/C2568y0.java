package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.y0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2568y0 implements Parcelable.Creator<C2392h> {
    @Override // android.os.Parcelable.Creator
    public final C2392h createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        long jM5272K = 0;
        long jM5272K2 = 0;
        boolean zM5247F = false;
        boolean zM5247F2 = false;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 2) {
                jM5272K = C2622l.m5272K(parcel, i);
            } else if (c2 == 3) {
                jM5272K2 = C2622l.m5272K(parcel, i);
            } else if (c2 == 4) {
                zM5247F = C2622l.m5247F(parcel, i);
            } else if (c2 != 5) {
                C2622l.m5282M(parcel, i);
            } else {
                zM5247F2 = C2622l.m5247F(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2392h(jM5272K, jM5272K2, zM5247F, zM5247F2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2392h[] newArray(int i) {
        return new C2392h[i];
    }
}
