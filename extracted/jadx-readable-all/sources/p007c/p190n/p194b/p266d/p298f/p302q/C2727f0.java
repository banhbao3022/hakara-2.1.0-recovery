package p007c.p190n.p194b.p266d.p298f.p302q;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.f.q.f0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2727f0 implements Parcelable.Creator<C2757s> {
    @Override // android.os.Parcelable.Creator
    public final C2757s createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        int iM5267J = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int iM5267J2 = 0;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 1) {
                iM5267J = C2622l.m5267J(parcel, i);
            } else if (c2 == 2) {
                account = (Account) C2622l.m5424r(parcel, i, Account.CREATOR);
            } else if (c2 == 3) {
                iM5267J2 = C2622l.m5267J(parcel, i);
            } else if (c2 != 4) {
                C2622l.m5282M(parcel, i);
            } else {
                googleSignInAccount = (GoogleSignInAccount) C2622l.m5424r(parcel, i, GoogleSignInAccount.CREATOR);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new C2757s(iM5267J, account, iM5267J2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ C2757s[] newArray(int i) {
        return new C2757s[i];
    }
}
