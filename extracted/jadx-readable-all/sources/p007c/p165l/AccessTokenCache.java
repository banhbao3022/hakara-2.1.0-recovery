package p007c.p165l;

import android.content.SharedPreferences;
import java.util.HashSet;
import org.json.JSONException;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.b, reason: use source file name */
/* JADX INFO: compiled from: AccessTokenCache.java */
/* JADX INFO: loaded from: classes.dex */
public class AccessTokenCache {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f4507a;

    /* JADX INFO: renamed from: b */
    public final a f4508b;

    /* JADX INFO: renamed from: c.l.b$a */
    /* JADX INFO: compiled from: AccessTokenCache.java */
    public static class a {
    }

    public AccessTokenCache() {
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        SharedPreferences sharedPreferences = FacebookSdk.f5360i.getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        a aVar = new a();
        this.f4507a = sharedPreferences;
        this.f4508b = aVar;
    }

    /* JADX INFO: renamed from: a */
    public void m2254a(AccessToken accessToken) {
        Validate.m2477f(accessToken, "accessToken");
        try {
            this.f4507a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.m2251f().toString()).apply();
        } catch (JSONException unused) {
        }
    }
}
