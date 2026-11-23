package p007c.p190n.p385d.p428w;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.d.w.v */
/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public class C5557v implements Parcelable.Creator<C5556u> {
    @Override // android.os.Parcelable.Creator
    public C5556u createFromParcel(Parcel parcel) {
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
        return new C5556u(bundleM5404n);
    }

    @Override // android.os.Parcelable.Creator
    public C5556u[] newArray(int i) {
        return new C5556u[i];
    }
}
