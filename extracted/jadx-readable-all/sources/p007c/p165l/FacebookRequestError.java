package p007c.p165l;

import android.os.Parcel;
import android.os.Parcelable;
import java.net.HttpURLConnection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.json.JSONObject;
import p007c.p165l.p178k0.FacebookRequestErrorClassification3;
import p007c.p165l.p178k0.FetchedAppSettings;
import p007c.p165l.p178k0.FetchedAppSettingsManager;
import p007c.p165l.p178k0.Validate;
import p636z0.p667e.p676b.C7804v0;

/* JADX INFO: renamed from: c.l.m, reason: use source file name */
/* JADX INFO: compiled from: FacebookRequestError.java */
/* JADX INFO: loaded from: classes.dex */
public final class FacebookRequestError implements Parcelable {

    /* JADX INFO: renamed from: g */
    public final int f5175g;

    /* JADX INFO: renamed from: h */
    public final int f5176h;

    /* JADX INFO: renamed from: i */
    public final int f5177i;

    /* JADX INFO: renamed from: j */
    public final int f5178j;

    /* JADX INFO: renamed from: k */
    public final String f5179k;

    /* JADX INFO: renamed from: l */
    public final String f5180l;

    /* JADX INFO: renamed from: m */
    public final String f5181m;

    /* JADX INFO: renamed from: n */
    public final String f5182n;

    /* JADX INFO: renamed from: o */
    public final Object f5183o;

    /* JADX INFO: renamed from: p */
    public final FacebookException f5184p;

    /* JADX INFO: renamed from: f */
    public static final b f5174f = new b(200, 299, null);
    public static final Parcelable.Creator<FacebookRequestError> CREATOR = new a();

    /* JADX INFO: renamed from: c.l.m$a */
    /* JADX INFO: compiled from: FacebookRequestError.java */
    public static class a implements Parcelable.Creator<FacebookRequestError> {
        @Override // android.os.Parcelable.Creator
        public FacebookRequestError createFromParcel(Parcel parcel) {
            return new FacebookRequestError(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), false, null, null, null, null, null);
        }

        @Override // android.os.Parcelable.Creator
        public FacebookRequestError[] newArray(int i) {
            return new FacebookRequestError[i];
        }
    }

    /* JADX INFO: renamed from: c.l.m$b */
    /* JADX INFO: compiled from: FacebookRequestError.java */
    public static class b {
        public b(int i, int i2, a aVar) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00bd  */
    public FacebookRequestError(int i, int i2, int i3, String str, String str2, String str3, String str4, boolean z, JSONObject jSONObject, JSONObject jSONObject2, Object obj, HttpURLConnection httpURLConnection, FacebookException facebookException) {
        boolean z2;
        FacebookRequestErrorClassification3 facebookRequestErrorClassification3M2510a;
        int i4;
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        this.f5176h = i;
        this.f5177i = i2;
        this.f5178j = i3;
        this.f5179k = str;
        this.f5180l = str2;
        this.f5183o = obj;
        this.f5181m = str3;
        this.f5182n = str4;
        if (facebookException != null) {
            this.f5184p = facebookException;
            z2 = true;
        } else {
            this.f5184p = new FacebookServiceException(this, str2);
            z2 = false;
        }
        synchronized (FacebookRequestError.class) {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            FetchedAppSettings fetchedAppSettingsM2524b = FetchedAppSettingsManager.m2524b(FacebookSdk.f5354c);
            facebookRequestErrorClassification3M2510a = fetchedAppSettingsM2524b == null ? FacebookRequestErrorClassification3.m2510a() : fetchedAppSettingsM2524b.f5006f;
        }
        if (z2) {
            i4 = 2;
        } else {
            Objects.requireNonNull(facebookRequestErrorClassification3M2510a);
            i4 = 3;
            if (!z) {
                Map<Integer, Set<Integer>> map = facebookRequestErrorClassification3M2510a.f4981b;
                if (map != null && map.containsKey(Integer.valueOf(i2)) && ((set3 = facebookRequestErrorClassification3M2510a.f4981b.get(Integer.valueOf(i2))) == null || set3.contains(Integer.valueOf(i3)))) {
                    i4 = 2;
                } else {
                    Map<Integer, Set<Integer>> map2 = facebookRequestErrorClassification3M2510a.f4983d;
                    if (map2 != null && map2.containsKey(Integer.valueOf(i2)) && ((set2 = facebookRequestErrorClassification3M2510a.f4983d.get(Integer.valueOf(i2))) == null || set2.contains(Integer.valueOf(i3)))) {
                        i4 = 1;
                    } else {
                        Map<Integer, Set<Integer>> map3 = facebookRequestErrorClassification3M2510a.f4982c;
                        if (map3 == null || !map3.containsKey(Integer.valueOf(i2)) || ((set = facebookRequestErrorClassification3M2510a.f4982c.get(Integer.valueOf(i2))) != null && !set.contains(Integer.valueOf(i3)))) {
                            i4 = 2;
                        }
                    }
                }
            }
        }
        this.f5175g = i4;
        Objects.requireNonNull(facebookRequestErrorClassification3M2510a);
        C7804v0.m15315d(i4);
    }

    /* JADX INFO: renamed from: a */
    public String m2602a() {
        String str = this.f5180l;
        return str != null ? str : this.f5184p.getLocalizedMessage();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "{HttpStatus: " + this.f5176h + ", errorCode: " + this.f5177i + ", subErrorCode: " + this.f5178j + ", errorType: " + this.f5179k + ", errorMessage: " + m2602a() + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5176h);
        parcel.writeInt(this.f5177i);
        parcel.writeInt(this.f5178j);
        parcel.writeString(this.f5179k);
        parcel.writeString(this.f5180l);
        parcel.writeString(this.f5181m);
        parcel.writeString(this.f5182n);
    }

    public FacebookRequestError(HttpURLConnection httpURLConnection, Exception exc) {
        this(-1, -1, -1, null, null, null, null, false, null, null, null, httpURLConnection, exc instanceof FacebookException ? (FacebookException) exc : new FacebookException(exc));
    }

    public FacebookRequestError(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, false, null, null, null, null, null);
    }
}
