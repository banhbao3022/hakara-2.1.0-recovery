package p007c.p165l.p182l0;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.CustomTabMainActivity;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
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

/* JADX INFO: renamed from: c.l.l0.a, reason: use source file name */
/* JADX INFO: compiled from: CustomTabLoginMethodHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {

    /* JADX INFO: renamed from: j */
    public String f5067j;

    /* JADX INFO: renamed from: k */
    public String f5068k;

    /* JADX INFO: renamed from: l */
    public String f5069l;

    /* JADX INFO: renamed from: i */
    public static final String[] f5066i = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new a();

    /* JADX INFO: renamed from: c.l.l0.a$a */
    /* JADX INFO: compiled from: CustomTabLoginMethodHandler.java */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new CustomTabLoginMethodHandler(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new CustomTabLoginMethodHandler[i];
        }
    }

    public CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f5069l = "";
        this.f5068k = new BigInteger(100, new Random()).toString(32);
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        if (Validate.m2473b(FacebookSdk.f5360i, super.m2600l())) {
            this.f5069l = super.m2600l();
            return;
        }
        Validate.m2479h();
        if (Validate.m2473b(FacebookSdk.f5360i, m2560r())) {
            this.f5069l = m2560r();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler
    /* JADX INFO: renamed from: e */
    public String mo2554e() {
        return "custom_tab";
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler
    /* JADX INFO: renamed from: g */
    public boolean mo2555g(int i, int i2, Intent intent) {
        int i3;
        boolean zEquals = false;
        if (i != 1) {
            return false;
        }
        LoginClient.d dVar = this.f5163g.f5122l;
        if (i2 != -1) {
            m2601o(dVar, null, new FacebookOperationCanceledException());
            return false;
        }
        String stringExtra = intent.getStringExtra(CustomTabMainActivity.f28286h);
        if (stringExtra != null && (stringExtra.startsWith("fbconnect://cct.") || stringExtra.startsWith(super.m2600l()))) {
            Uri uri = Uri.parse(stringExtra);
            Bundle bundleM2432E = Utility.m2432E(uri.getQuery());
            bundleM2432E.putAll(Utility.m2432E(uri.getFragment()));
            try {
                String string = bundleM2432E.getString("state");
                if (string != null) {
                    zEquals = new JSONObject(string).getString("7_challenge").equals(this.f5068k);
                }
            } catch (JSONException unused) {
            }
            if (zEquals) {
                String string2 = bundleM2432E.getString("error");
                if (string2 == null) {
                    string2 = bundleM2432E.getString("error_type");
                }
                String string3 = bundleM2432E.getString("error_msg");
                if (string3 == null) {
                    string3 = bundleM2432E.getString("error_message");
                }
                if (string3 == null) {
                    string3 = bundleM2432E.getString("error_description");
                }
                String string4 = bundleM2432E.getString("error_code");
                if (Utility.m2466y(string4)) {
                    i3 = -1;
                } else {
                    try {
                        i3 = Integer.parseInt(string4);
                    } catch (NumberFormatException unused2) {
                        i3 = -1;
                    }
                }
                if (Utility.m2466y(string2) && Utility.m2466y(string3) && i3 == -1) {
                    m2601o(dVar, bundleM2432E, null);
                } else if ((string2 == null || !(string2.equals("access_denied") || string2.equals("OAuthAccessDeniedException"))) && i3 != 4201) {
                    m2601o(dVar, null, new FacebookServiceException(new FacebookRequestError(i3, string2, string3), string3));
                } else {
                    m2601o(dVar, null, new FacebookOperationCanceledException());
                }
            } else {
                m2601o(dVar, null, new FacebookException("Invalid state parameter"));
            }
        }
        return true;
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler
    /* JADX INFO: renamed from: h */
    public void mo2556h(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.f5068k);
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler
    /* JADX INFO: renamed from: i */
    public boolean mo2557i(LoginClient.d dVar) {
        if (!((m2559p() == null || this.f5069l.isEmpty()) ? false : true)) {
            return false;
        }
        Bundle bundleM2599k = m2599k(dVar);
        bundleM2599k.putString("redirect_uri", this.f5069l);
        bundleM2599k.putString("client_id", dVar.f5129i);
        bundleM2599k.putString("e2e", LoginClient.m2572g());
        bundleM2599k.putString("response_type", "token,signed_request,graph_domain");
        bundleM2599k.putString("return_scopes", "true");
        bundleM2599k.putString("auth_type", dVar.f5133m);
        Locale locale = Locale.ROOT;
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        bundleM2599k.putString("sdk", String.format(locale, "android-%s", "5.15.3"));
        bundleM2599k.putString("sso", "chrome_custom_tab");
        Intent intent = new Intent(this.f5163g.m2578e(), (Class<?>) CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f28284f, bundleM2599k);
        intent.putExtra(CustomTabMainActivity.f28285g, m2559p());
        this.f5163g.f5118h.startActivityForResult(intent, 1);
        return true;
    }

    @Override // p007c.p165l.p182l0.WebLoginMethodHandler
    /* JADX INFO: renamed from: n */
    public AccessTokenSource mo2558n() {
        return AccessTokenSource.CHROME_CUSTOM_TAB;
    }

    /* JADX INFO: renamed from: p */
    public final String m2559p() {
        String str = this.f5067j;
        if (str != null) {
            return str;
        }
        FragmentActivity fragmentActivityM2578e = this.f5163g.m2578e();
        List<ResolveInfo> listQueryIntentServices = fragmentActivityM2578e.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (listQueryIntentServices == null) {
            return null;
        }
        HashSet hashSet = new HashSet(Arrays.asList(f5066i));
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            ServiceInfo serviceInfo = it.next().serviceInfo;
            if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                String str2 = serviceInfo.packageName;
                this.f5067j = str2;
                return str2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: r */
    public final String m2560r() {
        StringBuilder sbM1556G = outline.m1556G("fbconnect://cct.");
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        sbM1556G.append(FacebookSdk.f5360i.getPackageName());
        return sbM1556G.toString();
    }

    @Override // p007c.p165l.p182l0.LoginMethodHandler, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Utility.m2441N(parcel, this.f5162f);
        parcel.writeString(this.f5068k);
    }

    public CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f5069l = "";
        this.f5068k = parcel.readString();
    }
}
