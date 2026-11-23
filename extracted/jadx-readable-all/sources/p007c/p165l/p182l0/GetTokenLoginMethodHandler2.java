package p007c.p165l.p182l0;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.FacebookException;
import p007c.p165l.p178k0.Utility;

/* JADX INFO: renamed from: c.l.l0.l, reason: use source file name */
/* JADX INFO: compiled from: GetTokenLoginMethodHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class GetTokenLoginMethodHandler2 implements Utility.b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Bundle f5113a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LoginClient.d f5114b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ GetTokenLoginMethodHandler f5115c;

    public GetTokenLoginMethodHandler2(GetTokenLoginMethodHandler getTokenLoginMethodHandler, Bundle bundle, LoginClient.d dVar) {
        this.f5115c = getTokenLoginMethodHandler;
        this.f5113a = bundle;
        this.f5114b = dVar;
    }

    @Override // p007c.p165l.p178k0.Utility.b
    /* JADX INFO: renamed from: a */
    public void mo2468a(JSONObject jSONObject) {
        try {
            this.f5113a.putString("com.facebook.platform.extra.USER_ID", jSONObject.getString("id"));
            this.f5115c.m2571k(this.f5114b, this.f5113a);
        } catch (JSONException e) {
            LoginClient loginClient = this.f5115c.f5163g;
            loginClient.m2576c(LoginClient.e.m2585b(loginClient.f5122l, "Caught exception", e.getMessage()));
        }
    }

    @Override // p007c.p165l.p178k0.Utility.b
    /* JADX INFO: renamed from: b */
    public void mo2469b(FacebookException facebookException) {
        LoginClient loginClient = this.f5115c.f5163g;
        loginClient.m2576c(LoginClient.e.m2585b(loginClient.f5122l, "Caught exception", facebookException.getMessage()));
    }
}
