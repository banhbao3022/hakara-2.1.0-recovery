package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.l2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3236l2 implements Parcelable.Creator<C3199k2> {
    @Override // android.os.Parcelable.Creator
    public final C3199k2 createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            if (((char) i) != 15) {
                C2622l.m5282M(parcel, i);
            } else {
                strM5429s = C2622l.m5429s(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C3199k2(strM5429s);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3199k2[] newArray(int i) {
        return new C3199k2[i];
    }
}
