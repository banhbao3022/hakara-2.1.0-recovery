package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.th */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3547th implements Parcelable.Creator<C3510sh> {
    @Override // android.os.Parcelable.Creator
    public final C3510sh createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        IBinder iBinderM5262I = null;
        IBinder iBinderM5262I2 = null;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                iBinderM5262I = C2622l.m5262I(parcel, i);
            } else if (c2 != 2) {
                C2622l.m5282M(parcel, i);
            } else {
                iBinderM5262I2 = C2622l.m5262I(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C3510sh(iBinderM5262I, iBinderM5262I2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3510sh[] newArray(int i) {
        return new C3510sh[i];
    }
}
