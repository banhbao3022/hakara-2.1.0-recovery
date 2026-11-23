package p007c.p165l.p182l0;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import p007c.p165l.AccessTokenSource;
import p007c.p165l.FacebookException;
import p007c.p165l.p178k0.ServerProtocol;
import p007c.p165l.p178k0.Utility;

/* JADX INFO: renamed from: c.l.l0.w, reason: use source file name */
/* JADX INFO: compiled from: NativeAppLoginMethodHandler.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class NativeAppLoginMethodHandler extends LoginMethodHandler {
    public NativeAppLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler
    /* JADX INFO: renamed from: g */
    public boolean mo2555g(int i, int i2, Intent intent) {
        LoginClient.e eVarM2584a;
        LoginClient.d dVar = this.f5163g.f5122l;
        if (intent == null) {
            eVarM2584a = LoginClient.e.m2584a(dVar, "Operation canceled");
        } else {
            if (i2 == 0) {
                Bundle extras = intent.getExtras();
                String string = extras.getString("error");
                if (string == null) {
                    string = extras.getString("error_type");
                }
                String string2 = extras.get("error_code") != null ? extras.get("error_code").toString() : null;
                if ("CONNECTION_FAILURE".equals(string2)) {
                    String string3 = extras.getString("error_message");
                    if (string3 == null) {
                        string3 = extras.getString("error_description");
                    }
                    eVarM2584a = LoginClient.e.m2586c(dVar, string, string3, string2);
                } else {
                    eVarM2584a = LoginClient.e.m2584a(dVar, string);
                }
            } else if (i2 != -1) {
                eVarM2584a = LoginClient.e.m2585b(dVar, "Unexpected resultCode from authorization.", null);
            } else {
                Bundle extras2 = intent.getExtras();
                String string4 = extras2.getString("error");
                if (string4 == null) {
                    string4 = extras2.getString("error_type");
                }
                String string5 = extras2.get("error_code") != null ? extras2.get("error_code").toString() : null;
                String string6 = extras2.getString("error_message");
                if (string6 == null) {
                    string6 = extras2.getString("error_description");
                }
                String string7 = extras2.getString("e2e");
                if (!Utility.m2466y(string7)) {
                    m2598f(string7);
                }
                if (string4 == null && string5 == null && string6 == null) {
                    try {
                        eVarM2584a = LoginClient.e.m2587d(dVar, LoginMethodHandler.m2595c(dVar.f5127g, extras2, AccessTokenSource.FACEBOOK_APPLICATION_WEB, dVar.f5129i));
                    } catch (FacebookException e) {
                        eVarM2584a = LoginClient.e.m2585b(dVar, null, e.getMessage());
                    }
                } else if (ServerProtocol.f4898a.contains(string4)) {
                    eVarM2584a = null;
                } else {
                    eVarM2584a = ServerProtocol.f4899b.contains(string4) ? LoginClient.e.m2584a(dVar, null) : LoginClient.e.m2586c(dVar, string4, string6, string5);
                }
            }
        }
        if (eVarM2584a != null) {
            this.f5163g.m2577d(eVarM2584a);
            return true;
        }
        this.f5163g.m2582l();
        return true;
    }

    public NativeAppLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
