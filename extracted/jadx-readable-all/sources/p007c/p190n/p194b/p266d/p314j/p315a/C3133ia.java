package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.ia */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3133ia implements Parcelable.Creator<C3096ha> {
    @Override // android.os.Parcelable.Creator
    public final C3096ha createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        Bundle bundleM5404n = null;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 != 2) {
                C2622l.m5282M(parcel, i);
            } else {
                bundleM5404n = C2622l.m5404n(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C3096ha(strM5429s, bundleM5404n);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3096ha[] newArray(int i) {
        return new C3096ha[i];
    }
}
