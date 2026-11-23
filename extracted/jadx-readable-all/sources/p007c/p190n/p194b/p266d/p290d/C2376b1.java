package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p301p.C2708a;

/* JADX INFO: renamed from: c.n.b.d.d.b1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2376b1 implements Parcelable.Creator<C2398j> {
    @Override // android.os.Parcelable.Creator
    public final C2398j createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        ArrayList arrayListM5449w = null;
        ArrayList arrayListM5449w2 = null;
        double dM5252G = 0.0d;
        int iM5267J = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 2) {
                iM5267J = C2622l.m5267J(parcel, i);
            } else if (c2 == 3) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 == 4) {
                arrayListM5449w = C2622l.m5449w(parcel, i, C2395i.CREATOR);
            } else if (c2 == 5) {
                arrayListM5449w2 = C2622l.m5449w(parcel, i, C2708a.CREATOR);
            } else if (c2 != 6) {
                C2622l.m5282M(parcel, i);
            } else {
                dM5252G = C2622l.m5252G(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2398j(iM5267J, strM5429s, arrayListM5449w, arrayListM5449w2, dM5252G);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2398j[] newArray(int i) {
        return new C2398j[i];
    }
}
