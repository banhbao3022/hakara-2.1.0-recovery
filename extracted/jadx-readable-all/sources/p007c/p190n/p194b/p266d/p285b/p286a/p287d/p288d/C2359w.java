package p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.d.w */
/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2359w implements Parcelable.Creator<SignInConfiguration> {
    @Override // android.os.Parcelable.Creator
    public final SignInConfiguration createFromParcel(Parcel parcel) {
        int iM5291O = C2622l.m5291O(parcel);
        String strM5429s = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < iM5291O) {
            int i = parcel.readInt();
            char c2 = (char) i;
            if (c2 == 2) {
                strM5429s = C2622l.m5429s(parcel, i);
            } else if (c2 != 5) {
                C2622l.m5282M(parcel, i);
            } else {
                googleSignInOptions = (GoogleSignInOptions) C2622l.m5424r(parcel, i, GoogleSignInOptions.CREATOR);
            }
        }
        C2622l.m5454x(parcel, iM5291O);
        return new SignInConfiguration(strM5429s, googleSignInOptions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInConfiguration[] newArray(int i) {
        return new SignInConfiguration[i];
    }
}
