package p007c.p190n.p194b.p266d.p285b.p286a.p287d;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.f */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2362f implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final GoogleSignInAccount createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        String strM5429s2 = null;
        String strM5429s3 = null;
        String strM5429s4 = null;
        Uri uri = null;
        String strM5429s5 = null;
        String strM5429s6 = null;
        ArrayList arrayListM5449w = null;
        String strM5429s7 = null;
        String strM5429s8 = null;
        long jM5272K = 0;
        int iM5267J = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
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
                    uri = (Uri) C2622l.m5424r(parcel, i, Uri.CREATOR);
                    break;
                case 7:
                    strM5429s5 = C2622l.m5429s(parcel, i);
                    break;
                case '\b':
                    jM5272K = C2622l.m5272K(parcel, i);
                    break;
                case '\t':
                    strM5429s6 = C2622l.m5429s(parcel, i);
                    break;
                case '\n':
                    arrayListM5449w = C2622l.m5449w(parcel, i, Scope.CREATOR);
                    break;
                case 11:
                    strM5429s7 = C2622l.m5429s(parcel, i);
                    break;
                case '\f':
                    strM5429s8 = C2622l.m5429s(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new GoogleSignInAccount(iM5267J, strM5429s, strM5429s2, strM5429s3, strM5429s4, uri, strM5429s5, jM5272K, strM5429s6, arrayListM5449w, strM5429s7, strM5429s8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
