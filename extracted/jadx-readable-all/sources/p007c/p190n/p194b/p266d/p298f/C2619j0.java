package p007c.p190n.p194b.p266d.p298f;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.n.b.d.f.j0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2619j0 implements Parcelable.Creator<C2617i0> {
    @Override // android.os.Parcelable.Creator
    public final C2617i0 createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        IBinder iBinderM5262I = null;
        boolean zM5247F = false;
        boolean zM5247F2 = false;
        boolean zM5247F3 = false;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 == 2) {
                zM5247F = C2622l.m5247F(parcel, i);
            } else if (c2 == 3) {
                zM5247F2 = C2622l.m5247F(parcel, i);
            } else if (c2 == 4) {
                iBinderM5262I = C2622l.m5262I(parcel, i);
            } else if (c2 != 5) {
                C2622l.m5282M(parcel, i);
            } else {
                zM5247F3 = C2622l.m5247F(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2617i0(strM5429s, zM5247F, zM5247F2, iBinderM5262I, zM5247F3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2617i0[] newArray(int i) {
        return new C2617i0[i];
    }
}
