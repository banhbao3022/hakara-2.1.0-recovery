package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.k.b.q */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4636q implements Parcelable.Creator<C4613o> {
    @Override // android.os.Parcelable.Creator
    public final C4613o createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        Bundle bundleM5404n = null;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                C2622l.m5282M(parcel, i);
            } else {
                bundleM5404n = C2622l.m5404n(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C4613o(bundleM5404n);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C4613o[] newArray(int i) {
        return new C4613o[i];
    }
}
