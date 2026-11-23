package p007c.p190n.p194b.p266d.p298f.p302q;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.f.q.g0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2730g0 implements Parcelable.Creator<C2759t> {
    @Override // android.os.Parcelable.Creator
    public final C2759t createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        IBinder iBinderM5262I = null;
        C2602b c2602b = null;
        int iM5267J = 0;
        boolean zM5247F = false;
        boolean zM5247F2 = false;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                iM5267J = C2622l.m5267J(parcel, i);
            } else if (c2 == 2) {
                iBinderM5262I = C2622l.m5262I(parcel, i);
            } else if (c2 == 3) {
                c2602b = (C2602b) C2622l.m5424r(parcel, i, C2602b.CREATOR);
            } else if (c2 == 4) {
                zM5247F = C2622l.m5247F(parcel, i);
            } else if (c2 != 5) {
                C2622l.m5282M(parcel, i);
            } else {
                zM5247F2 = C2622l.m5247F(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2759t(iM5267J, iBinderM5262I, c2602b, zM5247F, zM5247F2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2759t[] newArray(int i) {
        return new C2759t[i];
    }
}
