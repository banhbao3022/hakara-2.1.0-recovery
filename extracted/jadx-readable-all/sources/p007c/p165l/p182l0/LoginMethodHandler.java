package p007c.p165l.p182l0;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.facebook.stetho.common.Utf8Charset;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.AccessToken;
import p007c.p165l.AccessTokenSource;
import p007c.p165l.FacebookException;
import p007c.p165l.FacebookSdk;
import p007c.p165l.p166h0.InternalAppEventsLogger;
import p007c.p165l.p178k0.Utility;

/* JADX INFO: renamed from: c.l.l0.u, reason: use source file name */
/* JADX INFO: compiled from: LoginMethodHandler.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class LoginMethodHandler implements Parcelable {

    /* JADX INFO: renamed from: f */
    public Map<String, String> f5162f;

    /* JADX INFO: renamed from: g */
    public LoginClient f5163g;

    public LoginMethodHandler(LoginClient loginClient) {
        this.f5163g = loginClient;
    }

    /* JADX INFO: renamed from: c */
    public static AccessToken m2595c(Collection<String> collection, Bundle bundle, AccessTokenSource accessTokenSource, String str) throws FacebookException {
        Date dateM2451j = Utility.m2451j(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        Date dateM2451j2 = Utility.m2451j(bundle, "data_access_expiration_time", new Date(0L));
        String string2 = bundle.getString("granted_scopes");
        Collection<String> arrayList = !Utility.m2466y(string2) ? new ArrayList(Arrays.asList(string2.split(","))) : collection;
        String string3 = bundle.getString("denied_scopes");
        ArrayList arrayList2 = !Utility.m2466y(string3) ? new ArrayList(Arrays.asList(string3.split(","))) : null;
        String string4 = bundle.getString("expired_scopes");
        ArrayList arrayList3 = !Utility.m2466y(string4) ? new ArrayList(Arrays.asList(string4.split(","))) : null;
        if (Utility.m2466y(string)) {
            return null;
        }
        String string5 = bundle.getString("graph_domain");
        String string6 = bundle.getString("signed_request");
        if (string6 == null || string6.isEmpty()) {
            throw new FacebookException("Authorization response does not contain the signed_request");
        }
        try {
            String[] strArrSplit = string6.split("\\.");
            if (strArrSplit.length == 2) {
                return new AccessToken(string, str, new JSONObject(new String(Base64.decode(strArrSplit[1], 0), Utf8Charset.NAME)).getString("user_id"), arrayList, arrayList2, arrayList3, accessTokenSource, dateM2451j, new Date(), dateM2451j2, string5);
            }
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        throw new FacebookException("Failed to retrieve user_id from signed_request");
    }

    /* JADX INFO: renamed from: a */
    public void m2596a(String str, Object obj) {
        if (this.f5162f == null) {
            this.f5162f = new HashMap();
        }
        this.f5162f.put(str, obj == null ? null : obj.toString());
    }

    /* JADX INFO: renamed from: b */
    public void mo2570b() {
    }

    /* JADX INFO: renamed from: d */
    public String m2597d(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", mo2554e());
            mo2556h(jSONObject);
        } catch (JSONException e) {
            StringBuilder sbM1556G = outline.m1556G("Error creating client state json: ");
            sbM1556G.append(e.getMessage());
            Log.w("LoginMethodHandler", sbM1556G.toString());
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: e */
    public abstract String mo2554e();

    /* JADX INFO: renamed from: f */
    public void m2598f(String str) {
        LoginClient loginClient = this.f5163g;
        String str2 = loginClient.f5122l.f5129i;
        InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(loginClient.m2578e(), str2);
        Bundle bundleM1575Z = outline.m1575Z("fb_web_login_e2e", str);
        bundleM1575Z.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundleM1575Z.putString("app_id", str2);
        if (FacebookSdk.m2659a()) {
            internalAppEventsLogger.f4855a.m2367f("fb_dialogs_web_login_dialog_complete", null, bundleM1575Z);
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean mo2555g(int i, int i2, Intent intent) {
        return false;
    }

    /* JADX INFO: renamed from: h */
    public void mo2556h(JSONObject jSONObject) throws JSONException {
    }

    /* JADX INFO: renamed from: i */
    public abstract boolean mo2557i(LoginClient.d dVar);

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Utility.m2441N(parcel, this.f5162f);
    }

    public LoginMethodHandler(Parcel parcel) {
        this.f5162f = Utility.m2437J(parcel);
    }
}
