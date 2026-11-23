package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.t0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2558t0 implements Parcelable.Creator<C2560u0> {
    @Override // android.os.Parcelable.Creator
    public final C2560u0 createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        int iM5267J = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                C2622l.m5282M(parcel, i);
            } else {
                iM5267J = C2622l.m5267J(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2560u0(iM5267J);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2560u0[] newArray(int i) {
        return new C2560u0[i];
    }
}
