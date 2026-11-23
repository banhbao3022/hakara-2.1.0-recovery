package p007c.p165l.p182l0;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p007c.p165l.p178k0.NativeProtocol;
import p007c.p165l.p178k0.Utility;

/* JADX INFO: renamed from: c.l.l0.i, reason: use source file name */
/* JADX INFO: compiled from: FacebookLiteLoginMethodHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class FacebookLiteLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<FacebookLiteLoginMethodHandler> CREATOR = new a();

    /* JADX INFO: renamed from: c.l.l0.i$a */
    /* JADX INFO: compiled from: FacebookLiteLoginMethodHandler.java */
    public static class a implements Parcelable.Creator<FacebookLiteLoginMethodHandler> {
        @Override // android.os.Parcelable.Creator
        public FacebookLiteLoginMethodHandler createFromParcel(Parcel parcel) {
            return new FacebookLiteLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public FacebookLiteLoginMethodHandler[] newArray(int i) {
            return new FacebookLiteLoginMethodHandler[i];
        }
    }

    public FacebookLiteLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler
    /* JADX INFO: renamed from: e */
    public String mo2554e() {
        return "fb_lite_login";
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler
    /* JADX INFO: renamed from: i */
    public boolean mo2557i(LoginClient.d dVar) {
        String strM2572g = LoginClient.m2572g();
        Intent intentM2550n = NativeProtocol.m2550n(this.f5163g.m2578e(), NativeProtocol.m2539c(new NativeProtocol.c(null), dVar.f5129i, dVar.f5127g, strM2572g, dVar.m2583a(), dVar.f5128h, m2597d(dVar.f5130j), dVar.f5133m));
        m2596a("e2e", strM2572g);
        int iM2573i = LoginClient.m2573i();
        if (intentM2550n != null) {
            try {
                this.f5163g.f5118h.startActivityForResult(intentM2550n, iM2573i);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        return false;
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Utility.m2441N(parcel, this.f5162f);
    }

    public FacebookLiteLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
