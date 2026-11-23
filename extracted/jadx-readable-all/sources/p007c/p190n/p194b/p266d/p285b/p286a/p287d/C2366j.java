package p007c.p190n.p194b.p266d.p285b.p286a.p287d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.j */
/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2366j implements Parcelable.Creator<SignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final SignInAccount createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = "";
        GoogleSignInAccount googleSignInAccount = null;
        String strM5429s2 = "";
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 4) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 == 7) {
                googleSignInAccount = (GoogleSignInAccount) C2622l.m5424r(parcel, i, GoogleSignInAccount.CREATOR);
            } else if (c2 != '\b') {
                C2622l.m5282M(parcel, i);
            } else {
                strM5429s2 = C2622l.m5429s(parcel, i);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new SignInAccount(strM5429s, googleSignInAccount, strM5429s2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount[] newArray(int i) {
        return new SignInAccount[i];
    }
}
