package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d.C2338b;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d.C2359w;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class SignInConfiguration extends AbstractC2767a implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new C2359w();

    /* JADX INFO: renamed from: f */
    public final String f28536f;

    /* JADX INFO: renamed from: g */
    public GoogleSignInOptions f28537g;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        C2622l.m5359e(str);
        this.f28536f = str;
        this.f28537g = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.f28536f.equals(signInConfiguration.f28536f)) {
            GoogleSignInOptions googleSignInOptions = this.f28537g;
            if (googleSignInOptions == null) {
                if (signInConfiguration.f28537g == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.f28537g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        C2338b c2338b = new C2338b();
        c2338b.m4910a(this.f28536f);
        c2338b.m4910a(this.f28537g);
        return c2338b.f10935a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        C2622l.m5315U(parcel, 2, this.f28536f, false);
        C2622l.m5311T(parcel, 5, this.f28537g, i, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
