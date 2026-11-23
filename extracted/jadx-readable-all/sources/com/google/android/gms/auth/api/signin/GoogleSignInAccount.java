package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p190n.p194b.p266d.p285b.p286a.p287d.C2362f;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p298f.p302q.p303x.AbstractC2767a;
import p007c.p190n.p194b.p266d.p298f.p307u.C2784d;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@17.1.0 */
/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInAccount extends AbstractC2767a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C2362f();

    /* JADX INFO: renamed from: f */
    public static InterfaceC2782b f28492f = C2784d.f11944a;

    /* JADX INFO: renamed from: g */
    public final int f28493g;

    /* JADX INFO: renamed from: h */
    public String f28494h;

    /* JADX INFO: renamed from: i */
    public String f28495i;

    /* JADX INFO: renamed from: j */
    public String f28496j;

    /* JADX INFO: renamed from: k */
    public String f28497k;

    /* JADX INFO: renamed from: l */
    public Uri f28498l;

    /* JADX INFO: renamed from: m */
    public String f28499m;

    /* JADX INFO: renamed from: n */
    public long f28500n;

    /* JADX INFO: renamed from: o */
    public String f28501o;

    /* JADX INFO: renamed from: p */
    public List<Scope> f28502p;

    /* JADX INFO: renamed from: q */
    public String f28503q;

    /* JADX INFO: renamed from: r */
    public String f28504r;

    /* JADX INFO: renamed from: s */
    public Set<Scope> f28505s = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j2, String str6, List<Scope> list, String str7, String str8) {
        this.f28493g = i;
        this.f28494h = str;
        this.f28495i = str2;
        this.f28496j = str3;
        this.f28497k = str4;
        this.f28498l = uri;
        this.f28499m = str5;
        this.f28500n = j2;
        this.f28501o = str6;
        this.f28502p = list;
        this.f28503q = str7;
        this.f28504r = str8;
    }

    /* JADX INFO: renamed from: K */
    public static GoogleSignInAccount m12638K(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl", null);
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j2 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.optString("tokenId", null);
        String strOptString4 = jSONObject.optString("email", null);
        String strOptString5 = jSONObject.optString("displayName", null);
        String strOptString6 = jSONObject.optString("givenName", null);
        String strOptString7 = jSONObject.optString("familyName", null);
        Long lValueOf = Long.valueOf(j2);
        String string = jSONObject.getString("obfuscatedIdentifier");
        if (lValueOf == null) {
            lValueOf = Long.valueOf(f28492f.mo5623c() / 1000);
        }
        long jLongValue = lValueOf.longValue();
        C2622l.m5359e(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, jLongValue, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f28499m = jSONObject.optString("serverAuthCode", null);
        return googleSignInAccount;
    }

    /* JADX INFO: renamed from: H */
    public Set<Scope> m12639H() {
        HashSet hashSet = new HashSet(this.f28502p);
        hashSet.addAll(this.f28505s);
        return hashSet;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f28501o.equals(this.f28501o) && googleSignInAccount.m12639H().equals(m12639H());
    }

    public int hashCode() {
        return m12639H().hashCode() + outline.m1569T(this.f28501o, 527, 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iM5239D1 = C2622l.m5239D1(parcel, 20293);
        int i2 = this.f28493g;
        parcel.writeInt(262145);
        parcel.writeInt(i2);
        C2622l.m5315U(parcel, 2, this.f28494h, false);
        C2622l.m5315U(parcel, 3, this.f28495i, false);
        C2622l.m5315U(parcel, 4, this.f28496j, false);
        C2622l.m5315U(parcel, 5, this.f28497k, false);
        C2622l.m5311T(parcel, 6, this.f28498l, i, false);
        C2622l.m5315U(parcel, 7, this.f28499m, false);
        long j2 = this.f28500n;
        parcel.writeInt(524296);
        parcel.writeLong(j2);
        C2622l.m5315U(parcel, 9, this.f28501o, false);
        C2622l.m5331Y(parcel, 10, this.f28502p, false);
        C2622l.m5315U(parcel, 11, this.f28503q, false);
        C2622l.m5315U(parcel, 12, this.f28504r, false);
        C2622l.m5447v2(parcel, iM5239D1);
    }
}
