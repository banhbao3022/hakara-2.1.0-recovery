package p007c.p190n.p194b.p266d.p267a.p282z.p283a;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.a.z.a.e */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2222e implements Parcelable.Creator<C2223f> {
    @Override // android.os.Parcelable.Creator
    public final C2223f createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        String strM5429s2 = null;
        String strM5429s3 = null;
        String strM5429s4 = null;
        String strM5429s5 = null;
        String strM5429s6 = null;
        String strM5429s7 = null;
        Intent intent = null;
        IBinder iBinderM5262I = null;
        boolean zM5247F = false;
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
                    strM5429s6 = C2622l.m5429s(parcel, i);
                    break;
                case '\b':
                    strM5429s7 = C2622l.m5429s(parcel, i);
                    break;
                case '\t':
                    intent = (Intent) C2622l.m5424r(parcel, i, Intent.CREATOR);
                    break;
                case '\n':
                    iBinderM5262I = C2622l.m5262I(parcel, i);
                    break;
                case 11:
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2223f(strM5429s, strM5429s2, strM5429s3, strM5429s4, strM5429s5, strM5429s6, strM5429s7, intent, iBinderM5262I, zM5247F);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ C2223f[] newArray(int i) {
        return new C2223f[i];
    }
}
