package p007c.p190n.p194b.p266d.p267a.p282z;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.a.z.m */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2322m implements Parcelable.Creator<C2321l> {
    @Override // android.os.Parcelable.Creator
    public final C2321l createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        boolean zM5247F = false;
        boolean zM5247F2 = false;
        boolean zM5247F3 = false;
        float fM5257H = 0.0f;
        int iM5267J = 0;
        boolean zM5247F4 = false;
        boolean zM5247F5 = false;
        boolean zM5247F6 = false;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case 3:
                    zM5247F2 = C2622l.m5247F(parcel, i);
                    break;
                case 4:
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case 5:
                    zM5247F3 = C2622l.m5247F(parcel, i);
                    break;
                case 6:
                    fM5257H = C2622l.m5257H(parcel, i);
                    break;
                case 7:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case '\b':
                    zM5247F4 = C2622l.m5247F(parcel, i);
                    break;
                case '\t':
                    zM5247F5 = C2622l.m5247F(parcel, i);
                    break;
                case '\n':
                    zM5247F6 = C2622l.m5247F(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2321l(zM5247F, zM5247F2, strM5429s, zM5247F3, fM5257H, iM5267J, zM5247F4, zM5247F5, zM5247F6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2321l[] newArray(int i) {
        return new C2321l[i];
    }
}
