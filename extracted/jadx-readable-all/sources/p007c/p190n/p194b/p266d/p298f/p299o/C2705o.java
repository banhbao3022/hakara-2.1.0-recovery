package p007c.p190n.p194b.p266d.p298f.p299o;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.f.o.o */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2705o implements Parcelable.Creator<Scope> {
    @Override // android.os.Parcelable.Creator
    public final Scope createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        int iM5267J = 0;
        String strM5429s = null;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                iM5267J = C2622l.m5267J(parcel, i);
            } else if (c2 != 2) {
                C2622l.m5282M(parcel, i);
            } else {
                strM5429s = C2622l.m5429s(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new Scope(iM5267J, strM5429s);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Scope[] newArray(int i) {
        return new Scope[i];
    }
}
