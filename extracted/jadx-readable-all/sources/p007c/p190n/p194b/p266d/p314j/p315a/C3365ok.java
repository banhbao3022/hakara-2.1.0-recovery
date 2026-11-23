package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.ok */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3365ok implements Parcelable.Creator<C3291mk> {
    @Override // android.os.Parcelable.Creator
    public final C3291mk createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        String strM5429s2 = null;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 != 2) {
                C2622l.m5282M(parcel, i);
            } else {
                strM5429s2 = C2622l.m5429s(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C3291mk(strM5429s, strM5429s2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3291mk[] newArray(int i) {
        return new C3291mk[i];
    }
}
