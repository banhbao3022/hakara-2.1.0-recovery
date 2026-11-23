package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.aa */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2836aa implements Parcelable.Creator<C3762z9> {
    @Override // android.os.Parcelable.Creator
    public final C3762z9 createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        boolean zM5247F = false;
        String strM5429s = null;
        String strM5429s2 = null;
        int iM5267J = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 == 2) {
                zM5247F = C2622l.m5247F(parcel, i);
            } else if (c2 == 3) {
                iM5267J = C2622l.m5267J(parcel, i);
            } else if (c2 != 4) {
                C2622l.m5282M(parcel, i);
            } else {
                strM5429s2 = C2622l.m5429s(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C3762z9(strM5429s, zM5247F, iM5267J, strM5429s2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3762z9[] newArray(int i) {
        return new C3762z9[i];
    }
}
