package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.x0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2566x0 implements Parcelable.Creator<MediaInfo> {
    @Override // android.os.Parcelable.Creator
    public final MediaInfo createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        long jM5272K = 0;
        long jM5272K2 = 0;
        String strM5429s = null;
        String strM5429s2 = null;
        C2395i c2395i = null;
        ArrayList arrayListM5449w = null;
        C2413o c2413o = null;
        String strM5429s3 = null;
        ArrayList arrayListM5449w2 = null;
        ArrayList arrayListM5449w3 = null;
        String strM5429s4 = null;
        C2416p c2416p = null;
        String strM5429s5 = null;
        String strM5429s6 = null;
        int iM5267J = 0;
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
                    strM5429s2 = C2622l.m5429s(parcel, i);
                    break;
                case 5:
                    c2395i = (C2395i) C2622l.m5424r(parcel, i, C2395i.CREATOR);
                    break;
                case 6:
                    jM5272K = C2622l.m5272K(parcel, i);
                    break;
                case 7:
                    arrayListM5449w = C2622l.m5449w(parcel, i, MediaTrack.CREATOR);
                    break;
                case '\b':
                    c2413o = (C2413o) C2622l.m5424r(parcel, i, C2413o.CREATOR);
                    break;
                case '\t':
                    strM5429s3 = C2622l.m5429s(parcel, i);
                    break;
                case '\n':
                    arrayListM5449w2 = C2622l.m5449w(parcel, i, C2374b.CREATOR);
                    break;
                case 11:
                    arrayListM5449w3 = C2622l.m5449w(parcel, i, C2371a.CREATOR);
                    break;
                case '\f':
                    strM5429s4 = C2622l.m5429s(parcel, i);
                    break;
                case '\r':
                    c2416p = (C2416p) C2622l.m5424r(parcel, i, C2416p.CREATOR);
                    break;
                case 14:
                    jM5272K2 = C2622l.m5272K(parcel, i);
                    break;
                case 15:
                    strM5429s5 = C2622l.m5429s(parcel, i);
                    break;
                case 16:
                    strM5429s6 = C2622l.m5429s(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new MediaInfo(strM5429s, iM5267J, strM5429s2, c2395i, jM5272K, arrayListM5449w, c2413o, strM5429s3, arrayListM5449w2, arrayListM5449w3, strM5429s4, c2416p, jM5272K2, strM5429s5, strM5429s6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaInfo[] newArray(int i) {
        return new MediaInfo[i];
    }
}
