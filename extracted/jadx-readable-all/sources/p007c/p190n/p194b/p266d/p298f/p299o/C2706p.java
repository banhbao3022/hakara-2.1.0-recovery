package p007c.p190n.p194b.p266d.p298f.p299o;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p007c.p190n.p194b.p266d.p298f.C2602b;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.f.o.p */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2706p implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final Status createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        PendingIntent pendingIntent = null;
        C2602b c2602b = null;
        int iM5267J = 0;
        int iM5267J2 = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                iM5267J2 = C2622l.m5267J(parcel, i);
            } else if (c2 == 2) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 == 3) {
                pendingIntent = (PendingIntent) C2622l.m5424r(parcel, i, PendingIntent.CREATOR);
            } else if (c2 == 4) {
                c2602b = (C2602b) C2622l.m5424r(parcel, i, C2602b.CREATOR);
            } else if (c2 != 1000) {
                C2622l.m5282M(parcel, i);
            } else {
                iM5267J = C2622l.m5267J(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new Status(iM5267J, iM5267J2, strM5429s, pendingIntent, c2602b);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }
}
