package p007c.p190n.p194b.p266d.p290d;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p301p.C2708a;

/* JADX INFO: renamed from: c.n.b.d.d.z0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2570z0 implements Parcelable.Creator<C2395i> {
    @Override // android.os.Parcelable.Creator
    public final C2395i createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        ArrayList arrayListM5449w = null;
        Bundle bundleM5404n = null;
        int iM5267J = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 2) {
                arrayListM5449w = C2622l.m5449w(parcel, i, C2708a.CREATOR);
            } else if (c2 == 3) {
                bundleM5404n = C2622l.m5404n(parcel, i);
            } else if (c2 != 4) {
                C2622l.m5282M(parcel, i);
            } else {
                iM5267J = C2622l.m5267J(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2395i(arrayListM5449w, bundleM5404n, iM5267J);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2395i[] newArray(int i) {
        return new C2395i[i];
    }
}
