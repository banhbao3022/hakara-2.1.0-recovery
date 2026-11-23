package p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.C2361e;

/* JADX INFO: renamed from: c.n.b.d.b.a.d.d.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class C2339c {

    /* JADX INFO: renamed from: a */
    public static final Lock f10936a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    public static C2339c f10937b;

    /* JADX INFO: renamed from: c */
    public final Lock f10938c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    public final SharedPreferences f10939d;

    public C2339c(Context context) {
        this.f10939d = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    /* JADX INFO: renamed from: a */
    public static C2339c m4912a(Context context) {
        Objects.requireNonNull(context, "null reference");
        f10936a.lock();
        try {
            if (f10937b == null) {
                f10937b = new C2339c(context.getApplicationContext());
            }
            return f10937b;
        } finally {
            f10936a.unlock();
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m4913f(String str, String str2) {
        return outline.m1587i(outline.m1558I(str2, str.length() + 1), str, ":", str2);
    }

    /* JADX INFO: renamed from: b */
    public GoogleSignInAccount m4914b() {
        String strM4918g;
        String strM4918g2 = m4918g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strM4918g2) || (strM4918g = m4918g(m4913f("googleSignInAccount", strM4918g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.m12638K(strM4918g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public GoogleSignInOptions m4915c() {
        String strM4918g;
        String strM4918g2 = m4918g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strM4918g2) || (strM4918g = m4918g(m4913f("googleSignInOptions", strM4918g2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.m12641L(strM4918g);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m4916d(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        Objects.requireNonNull(googleSignInAccount, "null reference");
        Objects.requireNonNull(googleSignInOptions, "null reference");
        m4917e("defaultGoogleSignInAccount", googleSignInAccount.f28501o);
        String str = googleSignInAccount.f28501o;
        String strM4913f = m4913f("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f28494h;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f28495i;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f28496j;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f28497k;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f28503q;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f28504r;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f28498l;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f28499m;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f28500n);
            jSONObject.put("obfuscatedIdentifier", googleSignInAccount.f28501o);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = googleSignInAccount.f28502p;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, C2361e.f10953f);
            int i = 0;
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f28647g);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            m4917e(strM4913f, jSONObject.toString());
            String strM4913f2 = m4913f("googleSignInOptions", str);
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(googleSignInOptions.f28514n, GoogleSignInOptions.f28512l);
                ArrayList<Scope> arrayList = googleSignInOptions.f28514n;
                int size = arrayList.size();
                while (i < size) {
                    Scope scope2 = arrayList.get(i);
                    i++;
                    jSONArray2.put(scope2.f28647g);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f28515o;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f28516p);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f28518r);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f28517q);
                if (!TextUtils.isEmpty(googleSignInOptions.f28519s)) {
                    jSONObject2.put("serverClientId", googleSignInOptions.f28519s);
                }
                if (!TextUtils.isEmpty(googleSignInOptions.f28520t)) {
                    jSONObject2.put("hostedDomain", googleSignInOptions.f28520t);
                }
                m4917e(strM4913f2, jSONObject2.toString());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m4917e(String str, String str2) {
        this.f10938c.lock();
        try {
            this.f10939d.edit().putString(str, str2).apply();
        } finally {
            this.f10938c.unlock();
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m4918g(String str) {
        this.f10938c.lock();
        try {
            return this.f10939d.getString(str, null);
        } finally {
            this.f10938c.unlock();
        }
    }
}
