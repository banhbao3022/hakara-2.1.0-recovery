package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.pi */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3400pi implements Parcelable.Creator<C3363oi> {
    @Override // android.os.Parcelable.Creator
    public final C3363oi createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            if (((char) i) != 2) {
                C2622l.m5282M(parcel, i);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) C2622l.m5424r(parcel, i, ParcelFileDescriptor.CREATOR);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C3363oi(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3363oi[] newArray(int i) {
        return new C3363oi[i];
    }
}
