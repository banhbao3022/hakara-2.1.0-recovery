package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.ei */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2993ei implements Parcelable.Creator<C2956di> {
    @Override // android.os.Parcelable.Creator
    public final C2956di createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        boolean zM5247F = false;
        ArrayList<String> arrayListM5439u = null;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 2) {
                zM5247F = C2622l.m5247F(parcel, i);
            } else if (c2 != 3) {
                C2622l.m5282M(parcel, i);
            } else {
                arrayListM5439u = C2622l.m5439u(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2956di(zM5247F, arrayListM5439u);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2956di[] newArray(int i) {
        return new C2956di[i];
    }
}
