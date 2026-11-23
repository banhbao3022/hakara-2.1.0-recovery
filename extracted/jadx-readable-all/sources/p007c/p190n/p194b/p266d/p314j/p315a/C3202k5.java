package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.k5 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3202k5 implements Parcelable.Creator<C3165j5> {
    @Override // android.os.Parcelable.Creator
    public final C3165j5 createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        C3310n2 c3310n2 = null;
        int iM5267J = 0;
        boolean zM5247F = false;
        int iM5267J2 = 0;
        boolean zM5247F2 = false;
        int iM5267J3 = 0;
        boolean zM5247F3 = false;
        int iM5267J4 = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case 2:
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case 3:
                    iM5267J2 = C2622l.m5267J(parcel, i);
                    break;
                case 4:
                    zM5247F2 = C2622l.m5247F(parcel, i);
                    break;
                case 5:
                    iM5267J3 = C2622l.m5267J(parcel, i);
                    break;
                case 6:
                    c3310n2 = (C3310n2) C2622l.m5424r(parcel, i, C3310n2.CREATOR);
                    break;
                case 7:
                    zM5247F3 = C2622l.m5247F(parcel, i);
                    break;
                case '\b':
                    iM5267J4 = C2622l.m5267J(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C3165j5(iM5267J, zM5247F, iM5267J2, zM5247F2, iM5267J3, c3310n2, zM5247F3, iM5267J4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C3165j5[] newArray(int i) {
        return new C3165j5[i];
    }
}
