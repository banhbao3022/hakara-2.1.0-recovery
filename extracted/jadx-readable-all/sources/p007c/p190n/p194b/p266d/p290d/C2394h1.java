package p007c.p190n.p194b.p266d.p290d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.MediaTrack;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.d.h1 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-cast@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2394h1 implements Parcelable.Creator<MediaTrack> {
    @Override // android.os.Parcelable.Creator
    public final MediaTrack createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        String strM5429s2 = null;
        String strM5429s3 = null;
        String strM5429s4 = null;
        String strM5429s5 = null;
        long jM5272K = 0;
        int iM5267J = 0;
        int iM5267J2 = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    jM5272K = C2622l.m5272K(parcel, i);
                    break;
                case 3:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case 4:
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case 5:
                    strM5429s2 = C2622l.m5429s(parcel, i);
                    break;
                case 6:
                    strM5429s3 = C2622l.m5429s(parcel, i);
                    break;
                case 7:
                    strM5429s4 = C2622l.m5429s(parcel, i);
                    break;
                case '\b':
                    iM5267J2 = C2622l.m5267J(parcel, i);
                    break;
                case '\t':
                    strM5429s5 = C2622l.m5429s(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new MediaTrack(jM5272K, iM5267J, strM5429s, strM5429s2, strM5429s3, strM5429s4, iM5267J2, strM5429s5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ MediaTrack[] newArray(int i) {
        return new MediaTrack[i];
    }
}
