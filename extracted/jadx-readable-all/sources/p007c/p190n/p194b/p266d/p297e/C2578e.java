package p007c.p190n.p194b.p266d.p297e;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.e.e */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2578e implements Parcelable.Creator<C2571a> {
    @Override // android.os.Parcelable.Creator
    public final C2571a createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                C2622l.m5282M(parcel, i);
            } else {
                intent = (Intent) C2622l.m5424r(parcel, i, Intent.CREATOR);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2571a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2571a[] newArray(int i) {
        return new C2571a[i];
    }
}
