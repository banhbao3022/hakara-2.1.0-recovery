package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.C2366j;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public class SignInAccount extends AbstractC2767a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new C2366j();

    /* JADX INFO: renamed from: f */
    @Deprecated
    public String f28533f;

    /* JADX INFO: renamed from: g */
    public GoogleSignInAccount f28534g;

    /* JADX INFO: renamed from: h */
    @Deprecated
    public String f28535h;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.f28534g = googleSignInAccount;
        C2622l.m5364f(str, "8.3 and 8.4 SDKs require non-null email");
        this.f28533f = str;
        C2622l.m5364f(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.f28535h = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 4, this.f28533f, false);
        C2622l.m5311T(parcel, 7, this.f28534g, i, false);
        C2622l.m5315U(parcel, 8, this.f28535h, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
