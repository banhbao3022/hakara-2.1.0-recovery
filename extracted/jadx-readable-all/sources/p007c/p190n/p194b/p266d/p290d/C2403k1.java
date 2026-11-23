package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.k1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2403k1 implements Parcelable.Creator<C2413o> {
    @Override // android.os.Parcelable.Creator
    public final C2413o createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        String strM5429s2 = null;
        float fM5257H = 0.0f;
        int iM5267J = 0;
        int iM5267J2 = 0;
        int iM5267J3 = 0;
        int iM5267J4 = 0;
        int iM5267J5 = 0;
        int iM5267J6 = 0;
        int iM5267J7 = 0;
        int iM5267J8 = 0;
        int iM5267J9 = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    fM5257H = C2622l.m5257H(parcel, i);
                    break;
                case 3:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case 4:
                    iM5267J2 = C2622l.m5267J(parcel, i);
                    break;
                case 5:
                    iM5267J3 = C2622l.m5267J(parcel, i);
                    break;
                case 6:
                    iM5267J4 = C2622l.m5267J(parcel, i);
                    break;
                case 7:
                    iM5267J5 = C2622l.m5267J(parcel, i);
                    break;
                case '\b':
                    iM5267J6 = C2622l.m5267J(parcel, i);
                    break;
                case '\t':
                    iM5267J7 = C2622l.m5267J(parcel, i);
                    break;
                case '\n':
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case 11:
                    iM5267J8 = C2622l.m5267J(parcel, i);
                    break;
                case '\f':
                    iM5267J9 = C2622l.m5267J(parcel, i);
                    break;
                case '\r':
                    strM5429s2 = C2622l.m5429s(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2413o(fM5257H, iM5267J, iM5267J2, iM5267J3, iM5267J4, iM5267J5, iM5267J6, iM5267J7, strM5429s, iM5267J8, iM5267J9, strM5429s2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2413o[] newArray(int i) {
        return new C2413o[i];
    }
}
