package p007c.p165l.p182l0;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import java.util.HashSet;
import java.util.Locale;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.AccessToken;
import p007c.p165l.AccessTokenSource;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookOperationCanceledException;
import p007c.p165l.FacebookRequestError;
import p007c.p165l.FacebookSdk;
import p007c.p165l.FacebookServiceException;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: c.l.l0.x, reason: use source file name */
/* JADX INFO: compiled from: WebLoginMethodHandler.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* JADX INFO: renamed from: h */
    public String f5166h;

    public WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* JADX INFO: renamed from: k */
    public Bundle m2599k(LoginClient.d dVar) {
        Bundle bundle = new Bundle();
        if (!Utility.m2467z(dVar.f5127g)) {
            String strJoin = TextUtils.join(",", dVar.f5127g);
            bundle.putString("scope", strJoin);
            m2596a("scope", strJoin);
        }
        bundle.putString("default_audience", dVar.f5128h.f5075k);
        bundle.putString("state", m2597d(dVar.f5130j));
        AccessToken accessTokenM2247b = AccessToken.m2247b();
        String str = accessTokenM2247b != null ? accessTokenM2247b.f4499n : null;
        if (str == null || !str.equals(this.f5163g.m2578e().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", ""))) {
            FragmentActivity fragmentActivityM2578e = this.f5163g.m2578e();
            Utility.m2445d(fragmentActivityM2578e, "facebook.com");
            Utility.m2445d(fragmentActivityM2578e, ".facebook.com");
            Utility.m2445d(fragmentActivityM2578e, "https://facebook.com");
            Utility.m2445d(fragmentActivityM2578e, "https://.facebook.com");
            m2596a("access_token", "0");
        } else {
            bundle.putString("access_token", str);
            m2596a("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        bundle.putString("ies", FacebookSdk.m2659a() ? "1" : "0");
        return bundle;
    }

    /* JADX INFO: renamed from: l */
    public String m2600l() {
        StringBuilder sbM1556G = outline.m1556G("fb");
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        return outline.m1550A(sbM1556G, FacebookSdk.f5354c, "://authorize");
    }

    /* JADX INFO: renamed from: n */
    public abstract AccessTokenSource mo2558n();

    /* JADX INFO: renamed from: o */
    public void m2601o(LoginClient.d dVar, Bundle bundle, FacebookException facebookException) {
        String str;
        LoginClient.e eVarM2586c;
        this.f5166h = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f5166h = bundle.getString("e2e");
            }
            try {
                AccessToken accessTokenM2595c = LoginMethodHandler.m2595c(dVar.f5127g, bundle, mo2558n(), dVar.f5129i);
                eVarM2586c = LoginClient.e.m2587d(this.f5163g.f5122l, accessTokenM2595c);
                CookieSyncManager.createInstance(this.f5163g.m2578e()).sync();
                this.f5163g.m2578e().getSharedPreferences("com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", accessTokenM2595c.f4499n).apply();
            } catch (FacebookException e) {
                eVarM2586c = LoginClient.e.m2585b(this.f5163g.f5122l, null, e.getMessage());
            }
        } else if (facebookException instanceof FacebookOperationCanceledException) {
            eVarM2586c = LoginClient.e.m2584a(this.f5163g.f5122l, "User canceled log in.");
        } else {
            this.f5166h = null;
            String message = facebookException.getMessage();
            if (facebookException instanceof FacebookServiceException) {
                FacebookRequestError facebookRequestError = ((FacebookServiceException) facebookException).f5370f;
                str = String.format(Locale.ROOT, "%d", Integer.valueOf(facebookRequestError.f5177i));
                message = facebookRequestError.toString();
            } else {
                str = null;
            }
            eVarM2586c = LoginClient.e.m2586c(this.f5163g.f5122l, null, message, str);
        }
        if (!Utility.m2466y(this.f5166h)) {
            m2598f(this.f5166h);
        }
        this.f5163g.m2577d(eVarM2586c);
    }

    public WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
