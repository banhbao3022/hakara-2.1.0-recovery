package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaInfo;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.e1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2385e1 implements Parcelable.Creator<C2404l> {
    @Override // android.os.Parcelable.Creator
    public final C2404l createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        double dM5252G = 0.0d;
        double dM5252G2 = 0.0d;
        double dM5252G3 = 0.0d;
        MediaInfo mediaInfo = null;
        long[] jArrM5419q = null;
        String strM5429s = null;
        int iM5267J = 0;
        boolean zM5247F = false;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    mediaInfo = (MediaInfo) C2622l.m5424r(parcel, i, MediaInfo.CREATOR);
                    break;
                case 3:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case 4:
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case 5:
                    dM5252G = C2622l.m5252G(parcel, i);
                    break;
                case 6:
                    dM5252G2 = C2622l.m5252G(parcel, i);
                    break;
                case 7:
                    dM5252G3 = C2622l.m5252G(parcel, i);
                    break;
                case '\b':
                    jArrM5419q = C2622l.m5419q(parcel, i);
                    break;
                case '\t':
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2404l(mediaInfo, iM5267J, zM5247F, dM5252G, dM5252G2, dM5252G3, jArrM5419q, strM5429s);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2404l[] newArray(int i) {
        return new C2404l[i];
    }
}
