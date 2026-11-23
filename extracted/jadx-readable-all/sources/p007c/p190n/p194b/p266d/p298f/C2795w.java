package p007c.p190n.p194b.p266d.p298f;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: c.n.b.d.f.w */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2795w implements Parcelable.Creator<C2602b> {
    @Override // android.os.Parcelable.Creator
    public final C2602b createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        int iM5267J = 0;
        PendingIntent pendingIntent = null;
        String strM5429s = null;
        int iM5267J2 = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                iM5267J = C2622l.m5267J(parcel, i);
            } else if (c2 == 2) {
                iM5267J2 = C2622l.m5267J(parcel, i);
            } else if (c2 == 3) {
                pendingIntent = (PendingIntent) C2622l.m5424r(parcel, i, PendingIntent.CREATOR);
            } else if (c2 != 4) {
                C2622l.m5282M(parcel, i);
            } else {
                strM5429s = C2622l.m5429s(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2602b(iM5267J, iM5267J2, pendingIntent, strM5429s);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2602b[] newArray(int i) {
        return new C2602b[i];
    }
}
