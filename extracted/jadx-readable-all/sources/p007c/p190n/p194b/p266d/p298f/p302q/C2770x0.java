package p007c.p190n.p194b.p266d.p298f.p302q;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2606d;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.f.q.x0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2770x0 implements Parcelable.Creator<C2766w0> {
    @Override // android.os.Parcelable.Creator
    public final C2766w0 createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        Bundle bundleM5404n = null;
        C2606d[] c2606dArr = null;
        C2726f c2726f = null;
        int iM5267J = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                bundleM5404n = C2622l.m5404n(parcel, i);
            } else if (c2 == 2) {
                c2606dArr = (C2606d[]) C2622l.m5444v(parcel, i, C2606d.CREATOR);
            } else if (c2 == 3) {
                iM5267J = C2622l.m5267J(parcel, i);
            } else if (c2 != 4) {
                C2622l.m5282M(parcel, i);
            } else {
                c2726f = (C2726f) C2622l.m5424r(parcel, i, C2726f.CREATOR);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2766w0(bundleM5404n, c2606dArr, iM5267J, c2726f);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2766w0[] newArray(int i) {
        return new C2766w0[i];
    }
}
