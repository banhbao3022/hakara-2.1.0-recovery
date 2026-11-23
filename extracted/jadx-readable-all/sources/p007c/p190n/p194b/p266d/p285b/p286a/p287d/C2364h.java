package p007c.p190n.p194b.p266d.p285b.p286a.p287d;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d.C2337a;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.h */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2364h implements Parcelable.Creator<GoogleSignInOptions> {
    @Override // android.os.Parcelable.Creator
    public final GoogleSignInOptions createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        ArrayList arrayListM5449w = null;
        ArrayList arrayListM5449w2 = null;
        Account account = null;
        String strM5429s = null;
        String strM5429s2 = null;
        String strM5429s3 = null;
        int iM5267J = 0;
        boolean zM5247F = false;
        boolean zM5247F2 = false;
        boolean zM5247F3 = false;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iM5267J = C2622l.m5267J(parcel, i);
                    break;
                case 2:
                    arrayListM5449w2 = C2622l.m5449w(parcel, i, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) C2622l.m5424r(parcel, i, Account.CREATOR);
                    break;
                case 4:
                    zM5247F = C2622l.m5247F(parcel, i);
                    break;
                case 5:
                    zM5247F2 = C2622l.m5247F(parcel, i);
                    break;
                case 6:
                    zM5247F3 = C2622l.m5247F(parcel, i);
                    break;
                case 7:
                    strM5429s = C2622l.m5429s(parcel, i);
                    break;
                case '\b':
                    strM5429s2 = C2622l.m5429s(parcel, i);
                    break;
                case '\t':
                    arrayListM5449w = C2622l.m5449w(parcel, i, C2337a.CREATOR);
                    break;
                case '\n':
                    strM5429s3 = C2622l.m5429s(parcel, i);
                    break;
                default:
                    C2622l.m5282M(parcel, i);
                    break;
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new GoogleSignInOptions(iM5267J, arrayListM5449w2, account, zM5247F, zM5247F2, zM5247F3, strM5429s, strM5429s2, GoogleSignInOptions.m12640K(arrayListM5449w), strM5429s3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
