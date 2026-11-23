package p007c.p190n.p194b.p266d.p267a.p282z.p283a;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import p007c.p190n.p194b.p266d.p267a.p282z.C2321l;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.C3702xn;

/* JADX INFO: renamed from: c.n.b.d.a.z.a.q */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2234q implements Parcelable.Creator<AdOverlayInfoParcel> {
    @Override // android.os.Parcelable.Creator
    public final AdOverlayInfoParcel createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        C2223f c2223f = null;
        IBinder iBinderM5262I = null;
        IBinder iBinderM5262I2 = null;
        IBinder iBinderM5262I3 = null;
        IBinder iBinderM5262I4 = null;
        String strM5429s = null;
        String strM5429s2 = null;
        IBinder iBinderM5262I5 = null;
        String strM5429s3 = null;
        C3702xn c3702xn = null;
        String strM5429s4 = null;
        C2321l c2321l = null;
        IBinder iBinderM5262I6 = null;
        String strM5429s5 = null;
        IBinder iBinderM5262I7 = null;
        IBinder iBinderM5262I8 = null;
        IBinder iBinderM5262I9 = null;
        IBinder iBinderM5262I10 = null;
        String strM5429s6 = null;
        String strM5429s7 = null;
        boolean zM5247F = false;
        int iM5267J = 0;
        int iM5267J2 = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    c2223f = (C2223f) C2622l.m5424r(parcel, i, C2223f.CREATOR);
                    break;
                case 3:
                    iBinderM5262I = C2622l.m5262I(parcel, i);
                    break;
                case 4:
                    iBinderM5262I2 = C2622l.m5262I(parcel, i);
                    break;
                case 5:
                    iBinderM5262I3 = C2622l.m5262I(parcel, i);
                    break;
                case 6:
                    iBinderM5262I4 = C2622l.m5262I(parcel, i);
                    break;
                case 7:
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case '\b':
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case '\t':
                    strM5429s2 = C2622l.m5429s(parcel, i);
                    break;
                case '\n':
                    iBinderM5262I5 = C2622l.m5262I(parcel, i);
                    break;
                case 11:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case '\f':
                    iM5267J2 = C2622l.m5267J(parcel, i);
                    break;
                case '\r':
                    strM5429s3 = C2622l.m5429s(parcel, i);
                    break;
                case 14:
                    c3702xn = (C3702xn) C2622l.m5424r(parcel, i, C3702xn.CREATOR);
                    break;
                case 15:
                default:
                    C2622l.m5282M(parcel, i);
                    break;
                case 16:
                    strM5429s4 = C2622l.m5429s(parcel, i);
                    break;
                case 17:
                    c2321l = (C2321l) C2622l.m5424r(parcel, i, C2321l.CREATOR);
                    break;
                case 18:
                    iBinderM5262I6 = C2622l.m5262I(parcel, i);
                    break;
                case 19:
                    strM5429s5 = C2622l.m5429s(parcel, i);
                    break;
                case 20:
                    iBinderM5262I7 = C2622l.m5262I(parcel, i);
                    break;
                case 21:
                    iBinderM5262I8 = C2622l.m5262I(parcel, i);
                    break;
                case 22:
                    iBinderM5262I9 = C2622l.m5262I(parcel, i);
                    break;
                case 23:
                    iBinderM5262I10 = C2622l.m5262I(parcel, i);
                    break;
                case 24:
                    strM5429s6 = C2622l.m5429s(parcel, i);
                    break;
                case 25:
                    strM5429s7 = C2622l.m5429s(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new AdOverlayInfoParcel(c2223f, iBinderM5262I, iBinderM5262I2, iBinderM5262I3, iBinderM5262I4, strM5429s, zM5247F, strM5429s2, iBinderM5262I5, iM5267J, iM5267J2, strM5429s3, c3702xn, strM5429s4, c2321l, iBinderM5262I6, strM5429s5, iBinderM5262I7, iBinderM5262I8, iBinderM5262I9, iBinderM5262I10, strM5429s6, strM5429s7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ AdOverlayInfoParcel[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
