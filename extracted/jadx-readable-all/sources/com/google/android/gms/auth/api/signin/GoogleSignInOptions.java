package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.C2363g;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.C2364h;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d.C2337a;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.p288d.C2338b;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p299o.C2628a;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInOptions extends AbstractC2767a implements C2628a.d, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: f */
    public static final Scope f28506f;

    /* JADX INFO: renamed from: g */
    public static final Scope f28507g;

    /* JADX INFO: renamed from: h */
    public static final Scope f28508h;

    /* JADX INFO: renamed from: i */
    public static final Scope f28509i;

    /* JADX INFO: renamed from: j */
    public static final Scope f28510j;

    /* JADX INFO: renamed from: k */
    public static final GoogleSignInOptions f28511k;

    /* JADX INFO: renamed from: l */
    public static Comparator<Scope> f28512l;

    /* JADX INFO: renamed from: m */
    public final int f28513m;

    /* JADX INFO: renamed from: n */
    public final ArrayList<Scope> f28514n;

    /* JADX INFO: renamed from: o */
    public Account f28515o;

    /* JADX INFO: renamed from: p */
    public boolean f28516p;

    /* JADX INFO: renamed from: q */
    public final boolean f28517q;

    /* JADX INFO: renamed from: r */
    public final boolean f28518r;

    /* JADX INFO: renamed from: s */
    public String f28519s;

    /* JADX INFO: renamed from: t */
    public String f28520t;

    /* JADX INFO: renamed from: u */
    public ArrayList<C2337a> f28521u;

    /* JADX INFO: renamed from: v */
    public String f28522v;

    /* JADX INFO: renamed from: w */
    public Map<Integer, C2337a> f28523w;

    static {
        Scope scope = new Scope("profile");
        f28506f = scope;
        f28507g = new Scope("email");
        Scope scope2 = new Scope("openid");
        f28508h = scope2;
        Scope scope3 = new Scope("https://www.googleapis.com/auth/games_lite");
        f28509i = scope3;
        f28510j = new Scope("https://www.googleapis.com/auth/games");
        C5890a c5890a = new C5890a();
        c5890a.f28524a.add(scope2);
        c5890a.f28524a.add(scope);
        f28511k = c5890a.m12643a();
        C5890a c5890a2 = new C5890a();
        c5890a2.f28524a.add(scope3);
        c5890a2.f28524a.addAll(Arrays.asList(new Scope[0]));
        c5890a2.m12643a();
        CREATOR = new C2364h();
        f28512l = new C2363g();
    }

    public GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, C2337a> map, String str3) {
        this.f28513m = i;
        this.f28514n = arrayList;
        this.f28515o = account;
        this.f28516p = z;
        this.f28517q = z2;
        this.f28518r = z3;
        this.f28519s = str;
        this.f28520t = str2;
        this.f28521u = new ArrayList<>(map.values());
        this.f28523w = map;
        this.f28522v = str3;
    }

    /* JADX INFO: renamed from: K */
    public static Map<Integer, C2337a> m12640K(List<C2337a> list) {
        HashMap map = new HashMap();
        if (list == null) {
            return map;
        }
        for (C2337a c2337a : list) {
            map.put(Integer.valueOf(c2337a.f10933g), c2337a);
        }
        return map;
    }

    /* JADX INFO: renamed from: L */
    public static GoogleSignInOptions m12641L(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String strOptString = jSONObject.optString("accountName", null);
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), new HashMap(), null);
    }

    /* JADX INFO: renamed from: H */
    public ArrayList<Scope> m12642H() {
        return new ArrayList<>(this.f28514n);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004d A[Catch: ClassCastException -> 0x007e, TryCatch #0 {ClassCastException -> 0x007e, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0017, B:12:0x0027, B:15:0x0034, B:17:0x0038, B:22:0x0045, B:24:0x004d, B:29:0x0060, B:31:0x0066, B:33:0x006c, B:35:0x0072, B:27:0x0056, B:20:0x003d), top: B:41:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0055  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056 A[Catch: ClassCastException -> 0x007e, TryCatch #0 {ClassCastException -> 0x007e, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0017, B:12:0x0027, B:15:0x0034, B:17:0x0038, B:22:0x0045, B:24:0x004d, B:29:0x0060, B:31:0x0066, B:33:0x006c, B:35:0x0072, B:27:0x0056, B:20:0x003d), top: B:41:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0060 A[Catch: ClassCastException -> 0x007e, TryCatch #0 {ClassCastException -> 0x007e, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0017, B:12:0x0027, B:15:0x0034, B:17:0x0038, B:22:0x0045, B:24:0x004d, B:29:0x0060, B:31:0x0066, B:33:0x006c, B:35:0x0072, B:27:0x0056, B:20:0x003d), top: B:41:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0066 A[Catch: ClassCastException -> 0x007e, TryCatch #0 {ClassCastException -> 0x007e, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0017, B:12:0x0027, B:15:0x0034, B:17:0x0038, B:22:0x0045, B:24:0x004d, B:29:0x0060, B:31:0x0066, B:33:0x006c, B:35:0x0072, B:27:0x0056, B:20:0x003d), top: B:41:0x0004 }] */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f28521u.size() <= 0 && googleSignInOptions.f28521u.size() <= 0 && this.f28514n.size() == googleSignInOptions.m12642H().size() && this.f28514n.containsAll(googleSignInOptions.m12642H())) {
                Account account = this.f28515o;
                if (account == null) {
                    if (googleSignInOptions.f28515o == null) {
                        if (TextUtils.isEmpty(this.f28519s)) {
                            if (TextUtils.isEmpty(googleSignInOptions.f28519s)) {
                                if (this.f28518r != googleSignInOptions.f28518r && this.f28516p == googleSignInOptions.f28516p && this.f28517q == googleSignInOptions.f28517q && TextUtils.equals(this.f28522v, googleSignInOptions.f28522v)) {
                                    return true;
                                }
                            }
                        } else if (this.f28519s.equals(googleSignInOptions.f28519s)) {
                            if (this.f28518r != googleSignInOptions.f28518r) {
                            }
                        }
                    }
                } else if (account.equals(googleSignInOptions.f28515o)) {
                    if (TextUtils.isEmpty(this.f28519s)) {
                        if (TextUtils.isEmpty(googleSignInOptions.f28519s)) {
                            if (this.f28518r != googleSignInOptions.f28518r) {
                            }
                        }
                    } else if (this.f28519s.equals(googleSignInOptions.f28519s)) {
                        if (this.f28518r != googleSignInOptions.f28518r) {
                        }
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.f28514n;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Scope scope = arrayList2.get(i);
            i++;
            arrayList.add(scope.f28647g);
        }
        Collections.sort(arrayList);
        C2338b c2338b = new C2338b();
        c2338b.m4910a(arrayList);
        c2338b.m4910a(this.f28515o);
        c2338b.m4910a(this.f28519s);
        c2338b.m4911b(this.f28518r);
        c2338b.m4911b(this.f28516p);
        c2338b.m4911b(this.f28517q);
        c2338b.m4910a(this.f28522v);
        return c2338b.f10935a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f28513m;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        C2622l.m5331Y(parcel, 2, m12642H(), false);
        C2622l.m5311T(parcel, 3, this.f28515o, i, false);
        boolean z = this.f28516p;
        parcel.writeInt(262148);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = this.f28517q;
        parcel.writeInt(262149);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.f28518r;
        parcel.writeInt(262150);
        parcel.writeInt(z3 ? 1 : 0);
        C2622l.m5315U(parcel, 7, this.f28519s, false);
        C2622l.m5315U(parcel, 8, this.f28520t, false);
        C2622l.m5331Y(parcel, 9, this.f28521u, false);
        C2622l.m5315U(parcel, 10, this.f28522v, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }

    /* JADX INFO: renamed from: com.google.android.gms.auth.api.signin.GoogleSignInOptions$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class C5890a {

        /* JADX INFO: renamed from: a */
        public Set<Scope> f28524a;

        /* JADX INFO: renamed from: b */
        public boolean f28525b;

        /* JADX INFO: renamed from: c */
        public boolean f28526c;

        /* JADX INFO: renamed from: d */
        public boolean f28527d;

        /* JADX INFO: renamed from: e */
        public String f28528e;

        /* JADX INFO: renamed from: f */
        public Account f28529f;

        /* JADX INFO: renamed from: g */
        public String f28530g;

        /* JADX INFO: renamed from: h */
        public Map<Integer, C2337a> f28531h;

        /* JADX INFO: renamed from: i */
        public String f28532i;

        public C5890a() {
            this.f28524a = new HashSet();
            this.f28531h = new HashMap();
        }

        /* JADX INFO: renamed from: a */
        public final GoogleSignInOptions m12643a() {
            if (this.f28524a.contains(GoogleSignInOptions.f28510j)) {
                Set<Scope> set = this.f28524a;
                Scope scope = GoogleSignInOptions.f28509i;
                if (set.contains(scope)) {
                    this.f28524a.remove(scope);
                }
            }
            if (this.f28527d && (this.f28529f == null || !this.f28524a.isEmpty())) {
                this.f28524a.add(GoogleSignInOptions.f28508h);
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f28524a), this.f28529f, this.f28527d, this.f28525b, this.f28526c, this.f28528e, this.f28530g, this.f28531h, this.f28532i);
        }

        public C5890a(GoogleSignInOptions googleSignInOptions) {
            this.f28524a = new HashSet();
            this.f28531h = new HashMap();
            Objects.requireNonNull(googleSignInOptions, "null reference");
            this.f28524a = new HashSet(googleSignInOptions.f28514n);
            this.f28525b = googleSignInOptions.f28517q;
            this.f28526c = googleSignInOptions.f28518r;
            this.f28527d = googleSignInOptions.f28516p;
            this.f28528e = googleSignInOptions.f28519s;
            this.f28529f = googleSignInOptions.f28515o;
            this.f28530g = googleSignInOptions.f28520t;
            this.f28531h = GoogleSignInOptions.m12640K(googleSignInOptions.f28521u);
            this.f28532i = googleSignInOptions.f28522v;
        }
    }
}
