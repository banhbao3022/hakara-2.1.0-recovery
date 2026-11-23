package p007c.p165l.p182l0;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import mtp.media.karaoke.R;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.AccessToken;
import p007c.p165l.FacebookException;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;
import p636z0.p667e.p676b.C7804v0;
import p636z0.p752p.p753c.Fragment;
import p636z0.p752p.p753c.FragmentActivity;

/* JADX INFO: renamed from: c.l.l0.n, reason: use source file name */
/* JADX INFO: compiled from: LoginClient.java */
/* JADX INFO: loaded from: classes.dex */
public class LoginClient implements Parcelable {
    public static final Parcelable.Creator<LoginClient> CREATOR = new a();

    /* JADX INFO: renamed from: f */
    public LoginMethodHandler[] f5116f;

    /* JADX INFO: renamed from: g */
    public int f5117g;

    /* JADX INFO: renamed from: h */
    public Fragment f5118h;

    /* JADX INFO: renamed from: i */
    public c f5119i;

    /* JADX INFO: renamed from: j */
    public b f5120j;

    /* JADX INFO: renamed from: k */
    public boolean f5121k;

    /* JADX INFO: renamed from: l */
    public d f5122l;

    /* JADX INFO: renamed from: m */
    public Map<String, String> f5123m;

    /* JADX INFO: renamed from: n */
    public Map<String, String> f5124n;

    /* JADX INFO: renamed from: o */
    public LoginLogger f5125o;

    /* JADX INFO: renamed from: c.l.l0.n$a */
    /* JADX INFO: compiled from: LoginClient.java */
    public static class a implements Parcelable.Creator<LoginClient> {
        @Override // android.os.Parcelable.Creator
        public LoginClient createFromParcel(Parcel parcel) {
            return new LoginClient(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public LoginClient[] newArray(int i) {
            return new LoginClient[i];
        }
    }

    /* JADX INFO: renamed from: c.l.l0.n$b */
    /* JADX INFO: compiled from: LoginClient.java */
    public interface b {
    }

    /* JADX INFO: renamed from: c.l.l0.n$c */
    /* JADX INFO: compiled from: LoginClient.java */
    public interface c {
    }

    public LoginClient(Fragment fragment) {
        this.f5117g = -1;
        this.f5118h = fragment;
    }

    /* JADX INFO: renamed from: g */
    public static String m2572g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* JADX INFO: renamed from: i */
    public static int m2573i() {
        return C7804v0.m15318g(1);
    }

    /* JADX INFO: renamed from: a */
    public final void m2574a(String str, String str2, boolean z) {
        if (this.f5123m == null) {
            this.f5123m = new HashMap();
        }
        if (this.f5123m.containsKey(str) && z) {
            str2 = outline.m1552C(new StringBuilder(), this.f5123m.get(str), ",", str2);
        }
        this.f5123m.put(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public boolean m2575b() {
        if (this.f5121k) {
            return true;
        }
        if (m2578e().checkCallingOrSelfPermission("android.permission.INTERNET") == 0) {
            this.f5121k = true;
            return true;
        }
        FragmentActivity fragmentActivityM2578e = m2578e();
        m2576c(e.m2585b(this.f5122l, fragmentActivityM2578e.getString(R.string.com_facebook_internet_permission_error_title), fragmentActivityM2578e.getString(R.string.com_facebook_internet_permission_error_message)));
        return false;
    }

    /* JADX INFO: renamed from: c */
    public void m2576c(e eVar) {
        LoginMethodHandler loginMethodHandlerM2579f = m2579f();
        if (loginMethodHandlerM2579f != null) {
            m2581k(loginMethodHandlerM2579f.mo2554e(), eVar.f5135f.f5146j, eVar.f5137h, eVar.f5138i, loginMethodHandlerM2579f.f5162f);
        }
        Map<String, String> map = this.f5123m;
        if (map != null) {
            eVar.f5140k = map;
        }
        Map<String, String> map2 = this.f5124n;
        if (map2 != null) {
            eVar.f5141l = map2;
        }
        this.f5116f = null;
        this.f5117g = -1;
        this.f5122l = null;
        this.f5123m = null;
        c cVar = this.f5119i;
        if (cVar != null) {
            LoginFragment loginFragment = LoginFragment.this;
            loginFragment.f5149e0 = null;
            int i = eVar.f5135f == e.b.CANCEL ? 0 : -1;
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.facebook.LoginFragment:Result", eVar);
            Intent intent = new Intent();
            intent.putExtras(bundle);
            if (loginFragment.m16550S()) {
                loginFragment.m16562f().setResult(i, intent);
                loginFragment.m16562f().finish();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002b A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:11:0x0018, B:13:0x0022, B:15:0x0034, B:14:0x002b), top: B:23:0x0018 }] */
    /* JADX INFO: renamed from: d */
    public void m2577d(e eVar) {
        e eVarM2585b;
        if (eVar.f5136g == null || !AccessToken.m2248c()) {
            m2576c(eVar);
            return;
        }
        if (eVar.f5136g == null) {
            throw new FacebookException("Can't validate without a token");
        }
        AccessToken accessTokenM2247b = AccessToken.m2247b();
        AccessToken accessToken = eVar.f5136g;
        if (accessTokenM2247b == null || accessToken == null) {
            eVarM2585b = e.m2585b(this.f5122l, "User logged in as different Facebook user.", null);
        } else {
            try {
                if (accessTokenM2247b.f4503r.equals(accessToken.f4503r)) {
                    eVarM2585b = e.m2587d(this.f5122l, eVar.f5136g);
                } else {
                    eVarM2585b = e.m2585b(this.f5122l, "User logged in as different Facebook user.", null);
                }
            } catch (Exception e2) {
                m2576c(e.m2585b(this.f5122l, "Caught exception", e2.getMessage()));
                return;
            }
        }
        m2576c(eVarM2585b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public FragmentActivity m2578e() {
        return this.f5118h.m16562f();
    }

    /* JADX INFO: renamed from: f */
    public LoginMethodHandler m2579f() {
        int i = this.f5117g;
        if (i >= 0) {
            return this.f5116f[i];
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final LoginLogger m2580h() {
        LoginLogger loginLogger = this.f5125o;
        if (loginLogger == null || !loginLogger.f5153b.equals(this.f5122l.f5129i)) {
            this.f5125o = new LoginLogger(m2578e(), this.f5122l.f5129i);
        }
        return this.f5125o;
    }

    /* JADX INFO: renamed from: k */
    public final void m2581k(String str, String str2, String str3, String str4, Map<String, String> map) {
        if (this.f5122l == null) {
            m2580h().m2590a("fb_mobile_login_method_complete", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.", str);
            return;
        }
        LoginLogger loginLoggerM2580h = m2580h();
        String str5 = this.f5122l.f5130j;
        Objects.requireNonNull(loginLoggerM2580h);
        Bundle bundleM2589b = LoginLogger.m2589b(str5);
        if (str2 != null) {
            bundleM2589b.putString("2_result", str2);
        }
        if (str3 != null) {
            bundleM2589b.putString("5_error_message", str3);
        }
        if (str4 != null) {
            bundleM2589b.putString("4_error_code", str4);
        }
        if (map != null && !map.isEmpty()) {
            bundleM2589b.putString("6_extras", new JSONObject(map).toString());
        }
        bundleM2589b.putString("3_method", str);
        loginLoggerM2580h.f5152a.m2370c("fb_mobile_login_method_complete", bundleM2589b);
    }

    /* JADX INFO: renamed from: l */
    public void m2582l() {
        int i;
        boolean z;
        if (this.f5117g >= 0) {
            m2581k(m2579f().mo2554e(), "skipped", null, null, m2579f().f5162f);
        }
        do {
            LoginMethodHandler[] loginMethodHandlerArr = this.f5116f;
            if (loginMethodHandlerArr == null || (i = this.f5117g) >= loginMethodHandlerArr.length - 1) {
                d dVar = this.f5122l;
                if (dVar != null) {
                    m2576c(e.m2585b(dVar, "Login attempt failed.", null));
                    return;
                }
                return;
            }
            this.f5117g = i + 1;
            LoginMethodHandler loginMethodHandlerM2579f = m2579f();
            Objects.requireNonNull(loginMethodHandlerM2579f);
            if (!(loginMethodHandlerM2579f instanceof WebViewLoginMethodHandler) || m2575b()) {
                boolean zMo2557i = loginMethodHandlerM2579f.mo2557i(this.f5122l);
                if (zMo2557i) {
                    LoginLogger loginLoggerM2580h = m2580h();
                    String str = this.f5122l.f5130j;
                    String strMo2554e = loginMethodHandlerM2579f.mo2554e();
                    Objects.requireNonNull(loginLoggerM2580h);
                    Bundle bundleM2589b = LoginLogger.m2589b(str);
                    bundleM2589b.putString("3_method", strMo2554e);
                    loginLoggerM2580h.f5152a.m2370c("fb_mobile_login_method_start", bundleM2589b);
                } else {
                    LoginLogger loginLoggerM2580h2 = m2580h();
                    String str2 = this.f5122l.f5130j;
                    String strMo2554e2 = loginMethodHandlerM2579f.mo2554e();
                    Objects.requireNonNull(loginLoggerM2580h2);
                    Bundle bundleM2589b2 = LoginLogger.m2589b(str2);
                    bundleM2589b2.putString("3_method", strMo2554e2);
                    loginLoggerM2580h2.f5152a.m2370c("fb_mobile_login_method_not_tried", bundleM2589b2);
                    m2574a("not_tried", loginMethodHandlerM2579f.mo2554e(), true);
                }
                z = zMo2557i;
            } else {
                z = false;
                m2574a("no_internet_permission", "1", false);
            }
        } while (!z);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray(this.f5116f, i);
        parcel.writeInt(this.f5117g);
        parcel.writeParcelable(this.f5122l, i);
        Utility.m2441N(parcel, this.f5123m);
        Utility.m2441N(parcel, this.f5124n);
    }

    public LoginClient(Parcel parcel) {
        this.f5117g = -1;
        Parcelable[] parcelableArray = parcel.readParcelableArray(LoginMethodHandler.class.getClassLoader());
        this.f5116f = new LoginMethodHandler[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            LoginMethodHandler[] loginMethodHandlerArr = this.f5116f;
            loginMethodHandlerArr[i] = (LoginMethodHandler) parcelableArray[i];
            LoginMethodHandler loginMethodHandler = loginMethodHandlerArr[i];
            if (loginMethodHandler.f5163g == null) {
                loginMethodHandler.f5163g = this;
            } else {
                throw new FacebookException("Can't set LoginClient if it is already set.");
            }
        }
        this.f5117g = parcel.readInt();
        this.f5122l = (d) parcel.readParcelable(d.class.getClassLoader());
        this.f5123m = Utility.m2437J(parcel);
        this.f5124n = Utility.m2437J(parcel);
    }

    /* JADX INFO: renamed from: c.l.l0.n$e */
    /* JADX INFO: compiled from: LoginClient.java */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public final b f5135f;

        /* JADX INFO: renamed from: g */
        public final AccessToken f5136g;

        /* JADX INFO: renamed from: h */
        public final String f5137h;

        /* JADX INFO: renamed from: i */
        public final String f5138i;

        /* JADX INFO: renamed from: j */
        public final d f5139j;

        /* JADX INFO: renamed from: k */
        public Map<String, String> f5140k;

        /* JADX INFO: renamed from: l */
        public Map<String, String> f5141l;

        /* JADX INFO: renamed from: c.l.l0.n$e$a */
        /* JADX INFO: compiled from: LoginClient.java */
        public static class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        /* JADX INFO: renamed from: c.l.l0.n$e$b */
        /* JADX INFO: compiled from: LoginClient.java */
        public enum b {
            SUCCESS("success"),
            CANCEL("cancel"),
            ERROR("error");


            /* JADX INFO: renamed from: j */
            public final String f5146j;

            b(String str) {
                this.f5146j = str;
            }
        }

        public e(d dVar, b bVar, AccessToken accessToken, String str, String str2) {
            Validate.m2477f(bVar, "code");
            this.f5139j = dVar;
            this.f5136g = accessToken;
            this.f5137h = str;
            this.f5135f = bVar;
            this.f5138i = str2;
        }

        /* JADX INFO: renamed from: a */
        public static e m2584a(d dVar, String str) {
            return new e(dVar, b.CANCEL, null, str, null);
        }

        /* JADX INFO: renamed from: b */
        public static e m2585b(d dVar, String str, String str2) {
            return m2586c(dVar, str, str2, null);
        }

        /* JADX INFO: renamed from: c */
        public static e m2586c(d dVar, String str, String str2, String str3) {
            String[] strArr = {str, str2};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str4 = strArr[i];
                if (str4 != null) {
                    arrayList.add(str4);
                }
            }
            return new e(dVar, b.ERROR, null, TextUtils.join(": ", arrayList), str3);
        }

        /* JADX INFO: renamed from: d */
        public static e m2587d(d dVar, AccessToken accessToken) {
            return new e(dVar, b.SUCCESS, accessToken, null, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f5135f.name());
            parcel.writeParcelable(this.f5136g, i);
            parcel.writeString(this.f5137h);
            parcel.writeString(this.f5138i);
            parcel.writeParcelable(this.f5139j, i);
            Utility.m2441N(parcel, this.f5140k);
            Utility.m2441N(parcel, this.f5141l);
        }

        public e(Parcel parcel, a aVar) {
            this.f5135f = b.valueOf(parcel.readString());
            this.f5136g = (AccessToken) parcel.readParcelable(AccessToken.class.getClassLoader());
            this.f5137h = parcel.readString();
            this.f5138i = parcel.readString();
            this.f5139j = (d) parcel.readParcelable(d.class.getClassLoader());
            this.f5140k = Utility.m2437J(parcel);
            this.f5141l = Utility.m2437J(parcel);
        }
    }

    /* JADX INFO: renamed from: c.l.l0.n$d */
    /* JADX INFO: compiled from: LoginClient.java */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: f */
        public final int f5126f;

        /* JADX INFO: renamed from: g */
        public Set<String> f5127g;

        /* JADX INFO: renamed from: h */
        public final DefaultAudience f5128h;

        /* JADX INFO: renamed from: i */
        public final String f5129i;

        /* JADX INFO: renamed from: j */
        public final String f5130j;

        /* JADX INFO: renamed from: k */
        public boolean f5131k;

        /* JADX INFO: renamed from: l */
        public String f5132l;

        /* JADX INFO: renamed from: m */
        public String f5133m;

        /* JADX INFO: renamed from: n */
        public String f5134n;

        /* JADX INFO: renamed from: c.l.l0.n$d$a */
        /* JADX INFO: compiled from: LoginClient.java */
        public static class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;Ljava/util/Set<Ljava/lang/String;>;Lc/l/l0/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
        public d(int i, Set set, DefaultAudience defaultAudience, String str, String str2, String str3) {
            this.f5131k = false;
            this.f5126f = i;
            this.f5127g = set == null ? new HashSet() : set;
            this.f5128h = defaultAudience;
            this.f5133m = str;
            this.f5129i = str2;
            this.f5130j = str3;
        }

        /* JADX INFO: renamed from: a */
        public boolean m2583a() {
            Iterator<String> it = this.f5127g.iterator();
            while (it.hasNext()) {
                if (LoginManager4.m2592b(it.next())) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int i2 = this.f5126f;
            parcel.writeString(i2 != 0 ? C7804v0.m15323l(i2) : null);
            parcel.writeStringList(new ArrayList(this.f5127g));
            DefaultAudience defaultAudience = this.f5128h;
            parcel.writeString(defaultAudience != null ? defaultAudience.name() : null);
            parcel.writeString(this.f5129i);
            parcel.writeString(this.f5130j);
            parcel.writeByte(this.f5131k ? (byte) 1 : (byte) 0);
            parcel.writeString(this.f5132l);
            parcel.writeString(this.f5133m);
            parcel.writeString(this.f5134n);
        }

        public d(Parcel parcel, a aVar) {
            this.f5131k = false;
            String string = parcel.readString();
            this.f5126f = string != null ? C7804v0.m15336y(string) : 0;
            ArrayList arrayList = new ArrayList();
            parcel.readStringList(arrayList);
            this.f5127g = new HashSet(arrayList);
            String string2 = parcel.readString();
            this.f5128h = string2 != null ? DefaultAudience.valueOf(string2) : null;
            this.f5129i = parcel.readString();
            this.f5130j = parcel.readString();
            this.f5131k = parcel.readByte() != 0;
            this.f5132l = parcel.readString();
            this.f5133m = parcel.readString();
            this.f5134n = parcel.readString();
        }
    }
}
