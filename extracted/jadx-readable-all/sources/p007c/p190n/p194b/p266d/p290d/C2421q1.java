package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.CastDevice;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p301p.C2708a;

/* JADX INFO: renamed from: c.n.b.d.d.q1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2421q1 implements Parcelable.Creator<CastDevice> {
    @Override // android.os.Parcelable.Creator
    public final CastDevice createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        String strM5429s2 = null;
        String strM5429s3 = null;
        String strM5429s4 = null;
        String strM5429s5 = null;
        ArrayList arrayListM5449w = null;
        String strM5429s6 = null;
        String strM5429s7 = null;
        String strM5429s8 = null;
        byte[] bArrM5409o = null;
        String strM5429s9 = null;
        int iM5267J = 0;
        int iM5267J2 = 0;
        int iM5267J3 = -1;
        int iM5267J4 = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case 3:
                    strM5429s2 = C2622l.m5429s(parcel, i);
                    break;
                case 4:
                    strM5429s3 = C2622l.m5429s(parcel, i);
                    break;
                case 5:
                    strM5429s4 = C2622l.m5429s(parcel, i);
                    break;
                case 6:
                    strM5429s5 = C2622l.m5429s(parcel, i);
                    break;
                case 7:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case '\b':
                    arrayListM5449w = C2622l.m5449w(parcel, i, C2708a.CREATOR);
                    break;
                case '\t':
                    iM5267J2 = C2622l.m5267J(parcel, i);
                    break;
                case '\n':
                    iM5267J3 = C2622l.m5267J(parcel, i);
                    break;
                case 11:
                    strM5429s6 = C2622l.m5429s(parcel, i);
                    break;
                case '\f':
                    strM5429s7 = C2622l.m5429s(parcel, i);
                    break;
                case '\r':
                    iM5267J4 = C2622l.m5267J(parcel, i);
                    break;
                case 14:
                    strM5429s8 = C2622l.m5429s(parcel, i);
                    break;
                case 15:
                    bArrM5409o = C2622l.m5409o(parcel, i);
                    break;
                case 16:
                    strM5429s9 = C2622l.m5429s(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new CastDevice(strM5429s, strM5429s2, strM5429s3, strM5429s4, strM5429s5, iM5267J, arrayListM5449w, iM5267J2, iM5267J3, strM5429s6, strM5429s7, iM5267J4, strM5429s8, bArrM5409o, strM5429s9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CastDevice[] newArray(int i) {
        return new CastDevice[i];
    }
}
