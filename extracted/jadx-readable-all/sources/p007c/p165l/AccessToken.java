package p007c.p165l;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.a, reason: use source file name */
/* JADX INFO: compiled from: AccessToken.java */
/* JADX INFO: loaded from: classes.dex */
public final class AccessToken implements Parcelable {
    public static final Parcelable.Creator<AccessToken> CREATOR;

    /* JADX INFO: renamed from: f */
    public static final Date f4491f;

    /* JADX INFO: renamed from: g */
    public static final Date f4492g;

    /* JADX INFO: renamed from: h */
    public static final Date f4493h;

    /* JADX INFO: renamed from: i */
    public static final AccessTokenSource f4494i;

    /* JADX INFO: renamed from: j */
    public final Date f4495j;

    /* JADX INFO: renamed from: k */
    public final Set<String> f4496k;

    /* JADX INFO: renamed from: l */
    public final Set<String> f4497l;

    /* JADX INFO: renamed from: m */
    public final Set<String> f4498m;

    /* JADX INFO: renamed from: n */
    public final String f4499n;

    /* JADX INFO: renamed from: o */
    public final AccessTokenSource f4500o;

    /* JADX INFO: renamed from: p */
    public final Date f4501p;

    /* JADX INFO: renamed from: q */
    public final String f4502q;

    /* JADX INFO: renamed from: r */
    public final String f4503r;

    /* JADX INFO: renamed from: s */
    public final Date f4504s;

    /* JADX INFO: renamed from: t */
    public final String f4505t;

    /* JADX INFO: renamed from: c.l.a$a */
    /* JADX INFO: compiled from: AccessToken.java */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            return new AccessToken(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Object[] newArray(int i) {
            return new AccessToken[i];
        }
    }

    /* JADX INFO: renamed from: c.l.a$b */
    /* JADX INFO: compiled from: AccessToken.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        void m2252a(FacebookException facebookException);

        /* JADX INFO: renamed from: b */
        void m2253b(AccessToken accessToken);
    }

    static {
        Date date = new Date(Long.MAX_VALUE);
        f4491f = date;
        f4492g = date;
        f4493h = new Date();
        f4494i = AccessTokenSource.FACEBOOK_APPLICATION_WEB;
        CREATOR = new a();
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, accessTokenSource, date, date2, date3, null);
    }

    /* JADX INFO: renamed from: a */
    public static AccessToken m2246a(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getInt("version") > 1) {
            throw new FacebookException("Unknown AccessToken serialization format.");
        }
        String string = jSONObject.getString("token");
        Date date = new Date(jSONObject.getLong("expires_at"));
        JSONArray jSONArray = jSONObject.getJSONArray("permissions");
        JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("expired_permissions");
        Date date2 = new Date(jSONObject.getLong("last_refresh"));
        AccessTokenSource accessTokenSourceValueOf = AccessTokenSource.valueOf(jSONObject.getString("source"));
        return new AccessToken(string, jSONObject.getString("application_id"), jSONObject.getString("user_id"), Utility.m2429B(jSONArray), Utility.m2429B(jSONArray2), jSONArrayOptJSONArray == null ? new ArrayList() : Utility.m2429B(jSONArrayOptJSONArray), accessTokenSourceValueOf, date, date2, new Date(jSONObject.optLong("data_access_expiration_time", 0L)), jSONObject.optString("graph_domain", null));
    }

    /* JADX INFO: renamed from: b */
    public static AccessToken m2247b() {
        return AccessTokenManager2.m2259a().f4523d;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2248c() {
        AccessToken accessToken = AccessTokenManager2.m2259a().f4523d;
        return (accessToken == null || accessToken.m2250d()) ? false : true;
    }

    /* JADX INFO: renamed from: e */
    public static void m2249e(AccessToken accessToken) {
        AccessTokenManager2.m2259a().m2262d(accessToken, true);
    }

    /* JADX INFO: renamed from: d */
    public boolean m2250d() {
        return new Date().after(this.f4495j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccessToken)) {
            return false;
        }
        AccessToken accessToken = (AccessToken) obj;
        if (this.f4495j.equals(accessToken.f4495j) && this.f4496k.equals(accessToken.f4496k) && this.f4497l.equals(accessToken.f4497l) && this.f4498m.equals(accessToken.f4498m) && this.f4499n.equals(accessToken.f4499n) && this.f4500o == accessToken.f4500o && this.f4501p.equals(accessToken.f4501p) && ((str = this.f4502q) != null ? str.equals(accessToken.f4502q) : accessToken.f4502q == null) && this.f4503r.equals(accessToken.f4503r) && this.f4504s.equals(accessToken.f4504s)) {
            String str2 = this.f4505t;
            String str3 = accessToken.f4505t;
            if (str2 == null) {
                if (str3 == null) {
                    return true;
                }
            } else if (str2.equals(str3)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public JSONObject m2251f() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.f4499n);
        jSONObject.put("expires_at", this.f4495j.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.f4496k));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.f4497l));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.f4498m));
        jSONObject.put("last_refresh", this.f4501p.getTime());
        jSONObject.put("source", this.f4500o.name());
        jSONObject.put("application_id", this.f4502q);
        jSONObject.put("user_id", this.f4503r);
        jSONObject.put("data_access_expiration_time", this.f4504s.getTime());
        String str = this.f4505t;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public int hashCode() {
        int iHashCode = (this.f4501p.hashCode() + ((this.f4500o.hashCode() + outline.m1569T(this.f4499n, (this.f4498m.hashCode() + ((this.f4497l.hashCode() + ((this.f4496k.hashCode() + ((this.f4495j.hashCode() + 527) * 31)) * 31)) * 31)) * 31, 31)) * 31)) * 31;
        String str = this.f4502q;
        int iHashCode2 = (this.f4504s.hashCode() + outline.m1569T(this.f4503r, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        String str2 = this.f4505t;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str;
        StringBuilder sbM1561L = outline.m1561L("{AccessToken", " token:");
        if (this.f4499n == null) {
            str = "null";
        } else {
            synchronized (FacebookSdk.f5352a) {
            }
            str = "ACCESS_TOKEN_REMOVED";
        }
        sbM1561L.append(str);
        sbM1561L.append(" permissions:");
        if (this.f4496k == null) {
            sbM1561L.append("null");
        } else {
            sbM1561L.append("[");
            sbM1561L.append(TextUtils.join(", ", this.f4496k));
            sbM1561L.append("]");
        }
        sbM1561L.append("}");
        return sbM1561L.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f4495j.getTime());
        parcel.writeStringList(new ArrayList(this.f4496k));
        parcel.writeStringList(new ArrayList(this.f4497l));
        parcel.writeStringList(new ArrayList(this.f4498m));
        parcel.writeString(this.f4499n);
        parcel.writeString(this.f4500o.name());
        parcel.writeLong(this.f4501p.getTime());
        parcel.writeString(this.f4502q);
        parcel.writeString(this.f4503r);
        parcel.writeLong(this.f4504s.getTime());
        parcel.writeString(this.f4505t);
    }

    public AccessToken(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, AccessTokenSource accessTokenSource, Date date, Date date2, Date date3, String str4) {
        Validate.m2478g(str, "accessToken");
        Validate.m2478g(str2, "applicationId");
        Validate.m2478g(str3, "userId");
        this.f4495j = date == null ? f4492g : date;
        this.f4496k = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        this.f4497l = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        this.f4498m = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        this.f4499n = str;
        this.f4500o = accessTokenSource == null ? f4494i : accessTokenSource;
        this.f4501p = date2 == null ? f4493h : date2;
        this.f4502q = str2;
        this.f4503r = str3;
        this.f4504s = (date3 == null || date3.getTime() == 0) ? f4492g : date3;
        this.f4505t = str4;
    }

    public AccessToken(Parcel parcel) {
        this.f4495j = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.f4496k = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f4497l = Collections.unmodifiableSet(new HashSet(arrayList));
        arrayList.clear();
        parcel.readStringList(arrayList);
        this.f4498m = Collections.unmodifiableSet(new HashSet(arrayList));
        this.f4499n = parcel.readString();
        this.f4500o = AccessTokenSource.valueOf(parcel.readString());
        this.f4501p = new Date(parcel.readLong());
        this.f4502q = parcel.readString();
        this.f4503r = parcel.readString();
        this.f4504s = new Date(parcel.readLong());
        this.f4505t = parcel.readString();
    }
}
