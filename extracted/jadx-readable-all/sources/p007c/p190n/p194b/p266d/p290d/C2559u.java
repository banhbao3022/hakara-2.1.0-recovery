package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.u */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2559u implements Parcelable.Creator<C2561v> {
    @Override // android.os.Parcelable.Creator
    public final C2561v createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        float fM5257H = 0.0f;
        float fM5257H2 = 0.0f;
        float fM5257H3 = 0.0f;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 2) {
                fM5257H = C2622l.m5257H(parcel, i);
            } else if (c2 == 3) {
                fM5257H2 = C2622l.m5257H(parcel, i);
            } else if (c2 != 4) {
                C2622l.m5282M(parcel, i);
            } else {
                fM5257H3 = C2622l.m5257H(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2561v(fM5257H, fM5257H2, fM5257H3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2561v[] newArray(int i) {
        return new C2561v[i];
    }
}
