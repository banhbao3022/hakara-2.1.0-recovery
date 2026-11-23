package p007c.p190n.p194b.p266d.p267a.p279w;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.a.w.l */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2209l implements Parcelable.Creator<C2204g> {
    @Override // android.os.Parcelable.Creator
    public final C2204g createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        IBinder iBinderM5262I = null;
        IBinder iBinderM5262I2 = null;
        boolean zM5247F = false;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                zM5247F = C2622l.m5247F(parcel, i);
            } else if (c2 == 2) {
                iBinderM5262I = C2622l.m5262I(parcel, i);
            } else if (c2 != 3) {
                C2622l.m5282M(parcel, i);
            } else {
                iBinderM5262I2 = C2622l.m5262I(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2204g(zM5247F, iBinderM5262I, iBinderM5262I2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2204g[] newArray(int i) {
        return new C2204g[i];
    }
}
