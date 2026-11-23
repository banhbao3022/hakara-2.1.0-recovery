package p007c.p165l.p182l0;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.AccessToken;
import p007c.p165l.FacebookAuthorizationException;
import p007c.p165l.FacebookCallback;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookSdk;
import p007c.p165l.Profile;
import p007c.p165l.p175i0.C1095a;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.l0.t, reason: use source file name */
/* JADX INFO: compiled from: LoginManager.java */
/* JADX INFO: loaded from: classes.dex */
public class LoginManager4 {

    /* JADX INFO: renamed from: a */
    public static final Set<String> f5158a = Collections.unmodifiableSet(new LoginManager2());

    /* JADX INFO: renamed from: b */
    public static volatile LoginManager4 f5159b;

    /* JADX INFO: renamed from: c */
    public int f5160c = 1;

    /* JADX INFO: renamed from: d */
    public final SharedPreferences f5161d;

    public LoginManager4() {
        Validate.m2479h();
        Validate.m2479h();
        this.f5161d = FacebookSdk.f5360i.getSharedPreferences("com.facebook.loginManager", 0);
    }

    /* JADX INFO: renamed from: a */
    public static LoginManager4 m2591a() {
        if (f5159b == null) {
            synchronized (LoginManager4.class) {
                if (f5159b == null) {
                    f5159b = new LoginManager4();
                }
            }
        }
        return f5159b;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2592b(String str) {
        return str != null && (str.startsWith("publish") || str.startsWith("manage") || f5158a.contains(str));
    }

    /* JADX INFO: renamed from: c */
    public final void m2593c(Context context, LoginClient.e.b bVar, Map<String, String> map, Exception exc, boolean z, LoginClient.d dVar) {
        LoginLogger loginLoggerM2385a = C1095a.m2385a(context);
        if (loginLoggerM2385a == null) {
            return;
        }
        if (dVar == null) {
            loginLoggerM2385a.m2590a("fb_mobile_login_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", "");
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("try_login_activity", z ? "1" : "0");
        Bundle bundleM2589b = LoginLogger.m2589b(dVar.f5130j);
        if (bVar != null) {
            bundleM2589b.putString("2_result", bVar.f5146j);
        }
        if (exc != null && exc.getMessage() != null) {
            bundleM2589b.putString("5_error_message", exc.getMessage());
        }
        JSONObject jSONObject = map2.isEmpty() ? null : new JSONObject(map2);
        if (map != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    jSONObject.put(entry.getKey(), entry.getValue());
                }
            } catch (JSONException unused) {
            }
        }
        if (jSONObject != null) {
            bundleM2589b.putString("6_extras", jSONObject.toString());
        }
        loginLoggerM2385a.f5152a.m2370c("fb_mobile_login_complete", bundleM2589b);
    }

    /* JADX INFO: renamed from: d */
    public boolean m2594d(int i, Intent intent, FacebookCallback<LoginResult> facebookCallback) {
        LoginClient.e.b bVar;
        FacebookException facebookException;
        LoginClient.d dVar;
        Map<String, String> map;
        AccessToken accessToken;
        boolean z;
        Map<String, String> map2;
        LoginClient.d dVar2;
        AccessToken accessToken2;
        boolean z2;
        AccessToken accessToken3;
        LoginClient.e.b bVar2 = LoginClient.e.b.ERROR;
        LoginResult loginResult = null;
        if (intent != null) {
            LoginClient.e eVar = (LoginClient.e) intent.getParcelableExtra("com.facebook.LoginFragment:Result");
            if (eVar != null) {
                LoginClient.d dVar3 = eVar.f5139j;
                LoginClient.e.b bVar3 = eVar.f5135f;
                if (i != -1) {
                    if (i == 0) {
                        facebookException = null;
                        accessToken3 = null;
                        z2 = true;
                    } else {
                        facebookException = null;
                        accessToken3 = null;
                    }
                    map2 = eVar.f5140k;
                    AccessToken accessToken4 = accessToken3;
                    dVar2 = dVar3;
                    bVar2 = bVar3;
                    accessToken2 = accessToken4;
                } else if (bVar3 == LoginClient.e.b.SUCCESS) {
                    accessToken3 = eVar.f5136g;
                    facebookException = null;
                } else {
                    facebookException = new FacebookAuthorizationException(eVar.f5137h);
                    accessToken3 = null;
                }
                z2 = false;
                map2 = eVar.f5140k;
                AccessToken accessToken5 = accessToken3;
                dVar2 = dVar3;
                bVar2 = bVar3;
                accessToken2 = accessToken5;
            } else {
                facebookException = null;
                map2 = null;
                dVar2 = null;
                accessToken2 = null;
                z2 = false;
            }
            map = map2;
            accessToken = accessToken2;
            z = z2;
            bVar = bVar2;
            dVar = dVar2;
        } else if (i == 0) {
            bVar = LoginClient.e.b.CANCEL;
            facebookException = null;
            dVar = null;
            map = null;
            accessToken = null;
            z = true;
        } else {
            bVar = bVar2;
            facebookException = null;
            dVar = null;
            map = null;
            accessToken = null;
            z = false;
        }
        if (facebookException == null && accessToken == null && !z) {
            facebookException = new FacebookException("Unexpected call to LoginManager.onActivityResult");
        }
        m2593c(null, bVar, map, facebookException, true, dVar);
        if (accessToken != null) {
            AccessToken.m2249e(accessToken);
            Profile.m2707a();
        }
        if (facebookCallback != null) {
            if (accessToken != null) {
                Set<String> set = dVar.f5127g;
                HashSet hashSet = new HashSet(accessToken.f4496k);
                if (dVar.f5131k) {
                    hashSet.retainAll(set);
                }
                HashSet hashSet2 = new HashSet(set);
                hashSet2.removeAll(hashSet);
                loginResult = new LoginResult(accessToken, hashSet, hashSet2);
            }
            if (z || (loginResult != null && loginResult.f5165b.size() == 0)) {
                facebookCallback.mo2277b();
            } else if (facebookException != null) {
                facebookCallback.mo2278c(facebookException);
            } else if (accessToken != null) {
                SharedPreferences.Editor editorEdit = this.f5161d.edit();
                editorEdit.putBoolean("express_login_allowed", true);
                editorEdit.apply();
                facebookCallback.mo2276a(loginResult);
            }
        }
        return true;
    }
}
