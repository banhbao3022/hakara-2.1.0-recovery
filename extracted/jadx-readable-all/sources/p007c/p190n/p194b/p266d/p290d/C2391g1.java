package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.g1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2391g1 implements Parcelable.Creator<C2410n> {
    @Override // android.os.Parcelable.Creator
    public final C2410n createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        double dM5252G = 0.0d;
        double dM5252G2 = 0.0d;
        long jM5272K = 0;
        long jM5272K2 = 0;
        long jM5272K3 = 0;
        MediaInfo mediaInfo = null;
        long[] jArrM5419q = null;
        String strM5429s = null;
        ArrayList arrayListM5449w = null;
        C2377c c2377c = null;
        C2419q c2419q = null;
        C2392h c2392h = null;
        C2401k c2401k = null;
        int iM5267J = 0;
        int iM5267J2 = 0;
        int iM5267J3 = 0;
        boolean zM5247F = false;
        int iM5267J4 = 0;
        int iM5267J5 = 0;
        int iM5267J6 = 0;
        boolean zM5247F2 = false;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    mediaInfo = (MediaInfo) C2622l.m5424r(parcel, i, MediaInfo.CREATOR);
                    break;
                case 3:
                    jM5272K = C2622l.m5272K(parcel, i);
                    break;
                case 4:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case 5:
                    dM5252G = C2622l.m5252G(parcel, i);
                    break;
                case 6:
                    iM5267J2 = C2622l.m5267J(parcel, i);
                    break;
                case 7:
                    iM5267J3 = C2622l.m5267J(parcel, i);
                    break;
                case '\b':
                    jM5272K2 = C2622l.m5272K(parcel, i);
                    break;
                case '\t':
                    jM5272K3 = C2622l.m5272K(parcel, i);
                    break;
                case '\n':
                    dM5252G2 = C2622l.m5252G(parcel, i);
                    break;
                case 11:
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case '\f':
                    jArrM5419q = C2622l.m5419q(parcel, i);
                    break;
                case '\r':
                    iM5267J4 = C2622l.m5267J(parcel, i);
                    break;
                case 14:
                    iM5267J5 = C2622l.m5267J(parcel, i);
                    break;
                case 15:
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case 16:
                    iM5267J6 = C2622l.m5267J(parcel, i);
                    break;
                case 17:
                    arrayListM5449w = C2622l.m5449w(parcel, i, C2404l.CREATOR);
                    break;
                case 18:
                    zM5247F2 = C2622l.m5247F(parcel, i);
                    break;
                case 19:
                    c2377c = (C2377c) C2622l.m5424r(parcel, i, C2377c.CREATOR);
                    break;
                case 20:
                    c2419q = (C2419q) C2622l.m5424r(parcel, i, C2419q.CREATOR);
                    break;
                case 21:
                    c2392h = (C2392h) C2622l.m5424r(parcel, i, C2392h.CREATOR);
                    break;
                case 22:
                    c2401k = (C2401k) C2622l.m5424r(parcel, i, C2401k.CREATOR);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2410n(mediaInfo, jM5272K, iM5267J, dM5252G, iM5267J2, iM5267J3, jM5272K2, jM5272K3, dM5252G2, zM5247F, jArrM5419q, iM5267J4, iM5267J5, strM5429s, iM5267J6, arrayListM5449w, zM5247F2, c2377c, c2419q, c2392h, c2401k);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2410n[] newArray(int i) {
        return new C2410n[i];
    }
}
