package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class kw2 implements Parcelable.Creator<jw2> {
    @Override // android.os.Parcelable.Creator
    public final jw2 createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        jw2[] jw2VarArr = null;
        int iM5267J = 0;
        int iM5267J2 = 0;
        boolean zM5247F = false;
        int iM5267J3 = 0;
        int iM5267J4 = 0;
        boolean zM5247F2 = false;
        boolean zM5247F3 = false;
        boolean zM5247F4 = false;
        boolean zM5247F5 = false;
        boolean zM5247F6 = false;
        boolean zM5247F7 = false;
        boolean zM5247F8 = false;
        boolean zM5247F9 = false;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case 3:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case 4:
                    iM5267J2 = C2622l.m5267J(parcel, i);
                    break;
                case 5:
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case 6:
                    iM5267J3 = C2622l.m5267J(parcel, i);
                    break;
                case 7:
                    iM5267J4 = C2622l.m5267J(parcel, i);
                    break;
                case '\b':
                    jw2VarArr = (jw2[]) C2622l.m5444v(parcel, i, jw2.CREATOR);
                    break;
                case '\t':
                    zM5247F2 = C2622l.m5247F(parcel, i);
                    break;
                case '\n':
                    zM5247F3 = C2622l.m5247F(parcel, i);
                    break;
                case 11:
                    zM5247F4 = C2622l.m5247F(parcel, i);
                    break;
                case '\f':
                    zM5247F5 = C2622l.m5247F(parcel, i);
                    break;
                case '\r':
                    zM5247F6 = C2622l.m5247F(parcel, i);
                    break;
                case 14:
                    zM5247F7 = C2622l.m5247F(parcel, i);
                    break;
                case 15:
                    zM5247F8 = C2622l.m5247F(parcel, i);
                    break;
                case 16:
                    zM5247F9 = C2622l.m5247F(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new jw2(strM5429s, iM5267J, iM5267J2, zM5247F, iM5267J3, iM5267J4, jw2VarArr, zM5247F2, zM5247F3, zM5247F4, zM5247F5, zM5247F6, zM5247F7, zM5247F8, zM5247F9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ jw2[] newArray(int i) {
        return new jw2[i];
    }
}
