package p007c.p165l;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import org.json.JSONObject;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.z, reason: use source file name */
/* JADX INFO: compiled from: Profile.java */
/* JADX INFO: loaded from: classes.dex */
public final class Profile implements Parcelable {

    /* JADX INFO: renamed from: g */
    public final String f5424g;

    /* JADX INFO: renamed from: h */
    public final String f5425h;

    /* JADX INFO: renamed from: i */
    public final String f5426i;

    /* JADX INFO: renamed from: j */
    public final String f5427j;

    /* JADX INFO: renamed from: k */
    public final String f5428k;

    /* JADX INFO: renamed from: l */
    public final Uri f5429l;

    /* JADX INFO: renamed from: f */
    public static final String f5423f = Profile.class.getSimpleName();
    public static final Parcelable.Creator<Profile> CREATOR = new b();

    /* JADX INFO: renamed from: c.l.z$a */
    /* JADX INFO: compiled from: Profile.java */
    public static class a implements Utility.b {
        @Override // p007c.p165l.p178k0.Utility.b
        /* JADX INFO: renamed from: a */
        public void mo2468a(JSONObject jSONObject) {
            String strOptString = jSONObject.optString("id");
            if (strOptString == null) {
                return;
            }
            String strOptString2 = jSONObject.optString("link");
            ProfileManager.m2255a().m2256b(new Profile(strOptString, jSONObject.optString("first_name"), jSONObject.optString("middle_name"), jSONObject.optString("last_name"), jSONObject.optString("name"), strOptString2 != null ? Uri.parse(strOptString2) : null), true);
        }

        @Override // p007c.p165l.p178k0.Utility.b
        /* JADX INFO: renamed from: b */
        public void mo2469b(FacebookException facebookException) {
            String str = Profile.f5423f;
            Log.e(Profile.f5423f, "Got unexpected exception: " + facebookException);
        }
    }

    /* JADX INFO: renamed from: c.l.z$b */
    /* JADX INFO: compiled from: Profile.java */
    public static class b implements Parcelable.Creator<Profile> {
        @Override // android.os.Parcelable.Creator
        public Profile createFromParcel(Parcel parcel) {
            return new Profile(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public Profile[] newArray(int i) {
            return new Profile[i];
        }
    }

    public Profile(String str, String str2, String str3, String str4, String str5, Uri uri) {
        Validate.m2478g(str, "id");
        this.f5424g = str;
        this.f5425h = str2;
        this.f5426i = str3;
        this.f5427j = str4;
        this.f5428k = str5;
        this.f5429l = uri;
    }

    /* JADX INFO: renamed from: a */
    public static void m2707a() {
        AccessToken accessTokenM2247b = AccessToken.m2247b();
        if (AccessToken.m2248c()) {
            Utility.m2453l(accessTokenM2247b.f4499n, new a());
        } else {
            ProfileManager.m2255a().m2256b(null, true);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        if (this.f5424g.equals(profile.f5424g) && this.f5425h == null) {
            if (profile.f5425h == null) {
                return true;
            }
        } else if (this.f5425h.equals(profile.f5425h) && this.f5426i == null) {
            if (profile.f5426i == null) {
                return true;
            }
        } else if (this.f5426i.equals(profile.f5426i) && this.f5427j == null) {
            if (profile.f5427j == null) {
                return true;
            }
        } else if (this.f5427j.equals(profile.f5427j) && this.f5428k == null) {
            if (profile.f5428k == null) {
                return true;
            }
        } else {
            if (!this.f5428k.equals(profile.f5428k) || this.f5429l != null) {
                return this.f5429l.equals(profile.f5429l);
            }
            if (profile.f5429l == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f5424g.hashCode() + 527;
        String str = this.f5425h;
        if (str != null) {
            iHashCode = (iHashCode * 31) + str.hashCode();
        }
        String str2 = this.f5426i;
        if (str2 != null) {
            iHashCode = (iHashCode * 31) + str2.hashCode();
        }
        String str3 = this.f5427j;
        if (str3 != null) {
            iHashCode = (iHashCode * 31) + str3.hashCode();
        }
        String str4 = this.f5428k;
        if (str4 != null) {
            iHashCode = (iHashCode * 31) + str4.hashCode();
        }
        Uri uri = this.f5429l;
        return uri != null ? (iHashCode * 31) + uri.hashCode() : iHashCode;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5424g);
        parcel.writeString(this.f5425h);
        parcel.writeString(this.f5426i);
        parcel.writeString(this.f5427j);
        parcel.writeString(this.f5428k);
        Uri uri = this.f5429l;
        parcel.writeString(uri == null ? null : uri.toString());
    }

    public Profile(JSONObject jSONObject) {
        this.f5424g = jSONObject.optString("id", null);
        this.f5425h = jSONObject.optString("first_name", null);
        this.f5426i = jSONObject.optString("middle_name", null);
        this.f5427j = jSONObject.optString("last_name", null);
        this.f5428k = jSONObject.optString("name", null);
        String strOptString = jSONObject.optString("link_uri", null);
        this.f5429l = strOptString != null ? Uri.parse(strOptString) : null;
    }

    public Profile(Parcel parcel, a aVar) {
        this.f5424g = parcel.readString();
        this.f5425h = parcel.readString();
        this.f5426i = parcel.readString();
        this.f5427j = parcel.readString();
        this.f5428k = parcel.readString();
        String string = parcel.readString();
        this.f5429l = string == null ? null : Uri.parse(string);
    }
}
