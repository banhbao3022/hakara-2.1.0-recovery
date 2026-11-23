package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.o2 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3347o2 implements Parcelable.Creator<C3310n2> {
    @Override // android.os.Parcelable.Creator
    public final C3310n2 createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        boolean zM5247F = false;
        boolean zM5247F2 = false;
        boolean zM5247F3 = false;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 2) {
                zM5247F = C2622l.m5247F(parcel, i);
            } else if (c2 == 3) {
                zM5247F2 = C2622l.m5247F(parcel, i);
            } else if (c2 != 4) {
                C2622l.m5282M(parcel, i);
            } else {
                zM5247F3 = C2622l.m5247F(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C3310n2(zM5247F, zM5247F2, zM5247F3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3310n2[] newArray(int i) {
        return new C3310n2[i];
    }
}
