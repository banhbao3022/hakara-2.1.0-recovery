package p007c.p165l;

import android.content.Intent;
import android.net.Uri;
import java.util.HashSet;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;
import p636z0.p763u.p764a.LocalBroadcastManager;

/* JADX INFO: renamed from: c.l.b0, reason: use source file name */
/* JADX INFO: compiled from: ProfileManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class ProfileManager {

    /* JADX INFO: renamed from: a */
    public static volatile ProfileManager f4509a;

    /* JADX INFO: renamed from: b */
    public final LocalBroadcastManager f4510b;

    /* JADX INFO: renamed from: c */
    public final ProfileCache f4511c;

    /* JADX INFO: renamed from: d */
    public Profile f4512d;

    public ProfileManager(LocalBroadcastManager localBroadcastManager, ProfileCache profileCache) {
        Validate.m2477f(localBroadcastManager, "localBroadcastManager");
        Validate.m2477f(profileCache, "profileCache");
        this.f4510b = localBroadcastManager;
        this.f4511c = profileCache;
    }

    /* JADX INFO: renamed from: a */
    public static ProfileManager m2255a() {
        if (f4509a == null) {
            synchronized (ProfileManager.class) {
                if (f4509a == null) {
                    HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                    Validate.m2479h();
                    f4509a = new ProfileManager(LocalBroadcastManager.m16762a(FacebookSdk.f5360i), new ProfileCache());
                }
            }
        }
        return f4509a;
    }

    /* JADX INFO: renamed from: b */
    public final void m2256b(Profile profile, boolean z) {
        Profile profile2 = this.f4512d;
        this.f4512d = profile;
        if (z) {
            if (profile != null) {
                ProfileCache profileCache = this.f4511c;
                Objects.requireNonNull(profileCache);
                Validate.m2477f(profile, "profile");
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", profile.f5424g);
                    jSONObject.put("first_name", profile.f5425h);
                    jSONObject.put("middle_name", profile.f5426i);
                    jSONObject.put("last_name", profile.f5427j);
                    jSONObject.put("name", profile.f5428k);
                    Uri uri = profile.f5429l;
                    if (uri != null) {
                        jSONObject.put("link_uri", uri.toString());
                    }
                } catch (JSONException unused) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    profileCache.f4506a.edit().putString("com.facebook.ProfileManager.CachedProfile", jSONObject.toString()).apply();
                }
            } else {
                this.f4511c.f4506a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (Utility.m2443b(profile2, profile)) {
            return;
        }
        Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", profile2);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile);
        this.f4510b.m16764c(intent);
    }
}
