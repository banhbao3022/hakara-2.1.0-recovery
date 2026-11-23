package p007c.p165l;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.CurrentAccessTokenExpirationBroadcastReceiver;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;
import p636z0.p763u.p764a.LocalBroadcastManager;

/* JADX INFO: renamed from: c.l.d, reason: use source file name */
/* JADX INFO: compiled from: AccessTokenManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class AccessTokenManager2 {

    /* JADX INFO: renamed from: a */
    public static volatile AccessTokenManager2 f4520a;

    /* JADX INFO: renamed from: b */
    public final LocalBroadcastManager f4521b;

    /* JADX INFO: renamed from: c */
    public final AccessTokenCache f4522c;

    /* JADX INFO: renamed from: d */
    public AccessToken f4523d;

    /* JADX INFO: renamed from: e */
    public AtomicBoolean f4524e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public Date f4525f = new Date(0);

    /* JADX INFO: renamed from: c.l.d$a */
    /* JADX INFO: compiled from: AccessTokenManager.java */
    public class a implements GraphRequest2.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AtomicBoolean f4526a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Set f4527b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Set f4528c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Set f4529d;

        public a(AccessTokenManager2 accessTokenManager2, AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
            this.f4526a = atomicBoolean;
            this.f4527b = set;
            this.f4528c = set2;
            this.f4529d = set3;
        }

        @Override // p007c.p165l.GraphRequest2.c
        /* JADX INFO: renamed from: b */
        public void mo2263b(GraphResponse graphResponse) {
            JSONArray jSONArrayOptJSONArray;
            JSONObject jSONObject = graphResponse.f5408c;
            if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("data")) == null) {
                return;
            }
            this.f4526a.set(true);
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("permission");
                    String strOptString2 = jSONObjectOptJSONObject.optString("status");
                    if (!Utility.m2466y(strOptString) && !Utility.m2466y(strOptString2)) {
                        String lowerCase = strOptString2.toLowerCase(Locale.US);
                        if (lowerCase.equals("granted")) {
                            this.f4527b.add(strOptString);
                        } else if (lowerCase.equals("declined")) {
                            this.f4528c.add(strOptString);
                        } else if (lowerCase.equals("expired")) {
                            this.f4529d.add(strOptString);
                        } else {
                            outline.m1567R("Unexpected status: ", lowerCase, "AccessTokenManager");
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: c.l.d$b */
    /* JADX INFO: compiled from: AccessTokenManager.java */
    public class b implements GraphRequest2.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d f4530a;

        public b(AccessTokenManager2 accessTokenManager2, d dVar) {
            this.f4530a = dVar;
        }

        @Override // p007c.p165l.GraphRequest2.c
        /* JADX INFO: renamed from: b */
        public void mo2263b(GraphResponse graphResponse) {
            JSONObject jSONObject = graphResponse.f5408c;
            if (jSONObject == null) {
                return;
            }
            this.f4530a.f4539a = jSONObject.optString("access_token");
            this.f4530a.f4540b = jSONObject.optInt("expires_at");
            this.f4530a.f4541c = Long.valueOf(jSONObject.optLong("data_access_expiration_time"));
            this.f4530a.f4542d = jSONObject.optString("graph_domain", null);
        }
    }

    /* JADX INFO: renamed from: c.l.d$c */
    /* JADX INFO: compiled from: AccessTokenManager.java */
    public class c implements GraphRequestBatch.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ AccessToken f4531a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AccessToken.b f4532b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AtomicBoolean f4533c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ d f4534d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Set f4535e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Set f4536f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Set f4537g;

        public c(AccessToken accessToken, AccessToken.b bVar, AtomicBoolean atomicBoolean, d dVar, Set set, Set set2, Set set3) {
            this.f4531a = accessToken;
            this.f4532b = bVar;
            this.f4533c = atomicBoolean;
            this.f4534d = dVar;
            this.f4535e = set;
            this.f4536f = set2;
            this.f4537g = set3;
        }

        @Override // p007c.p165l.GraphRequestBatch.a
        /* JADX INFO: renamed from: a */
        public void mo2264a(GraphRequestBatch graphRequestBatch) throws Throwable {
            AccessToken accessToken;
            try {
                if (AccessTokenManager2.m2259a().f4523d != null && AccessTokenManager2.m2259a().f4523d.f4503r == this.f4531a.f4503r) {
                    if (!this.f4533c.get()) {
                        d dVar = this.f4534d;
                        if (dVar.f4539a == null && dVar.f4540b == 0) {
                            AccessToken.b bVar = this.f4532b;
                            if (bVar != null) {
                                bVar.m2252a(new FacebookException("Failed to refresh access token"));
                            }
                        }
                    }
                    String str = this.f4534d.f4539a;
                    if (str == null) {
                        str = this.f4531a.f4499n;
                    }
                    String str2 = str;
                    AccessToken accessToken2 = this.f4531a;
                    String str3 = accessToken2.f4502q;
                    String str4 = accessToken2.f4503r;
                    Set<String> set = this.f4533c.get() ? this.f4535e : this.f4531a.f4496k;
                    Set<String> set2 = this.f4533c.get() ? this.f4536f : this.f4531a.f4497l;
                    Set<String> set3 = this.f4533c.get() ? this.f4537g : this.f4531a.f4498m;
                    AccessToken accessToken3 = this.f4531a;
                    accessToken = new AccessToken(str2, str3, str4, set, set2, set3, accessToken3.f4500o, this.f4534d.f4540b != 0 ? new Date(((long) this.f4534d.f4540b) * 1000) : accessToken3.f4495j, new Date(), this.f4534d.f4541c != null ? new Date(1000 * this.f4534d.f4541c.longValue()) : this.f4531a.f4504s, this.f4534d.f4542d);
                    try {
                        AccessTokenManager2.m2259a().m2262d(accessToken, true);
                        AccessTokenManager2.this.f4524e.set(false);
                        AccessToken.b bVar2 = this.f4532b;
                        if (bVar2 != null) {
                            bVar2.m2253b(accessToken);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        AccessTokenManager2.this.f4524e.set(false);
                        AccessToken.b bVar3 = this.f4532b;
                        if (bVar3 != null && accessToken != null) {
                            bVar3.m2253b(accessToken);
                        }
                        throw th;
                    }
                }
                AccessToken.b bVar4 = this.f4532b;
                if (bVar4 != null) {
                    bVar4.m2252a(new FacebookException("No current access token to refresh"));
                }
                AccessTokenManager2.this.f4524e.set(false);
            } catch (Throwable th2) {
                th = th2;
                accessToken = null;
            }
        }
    }

    /* JADX INFO: renamed from: c.l.d$d */
    /* JADX INFO: compiled from: AccessTokenManager.java */
    public static class d {

        /* JADX INFO: renamed from: a */
        public String f4539a;

        /* JADX INFO: renamed from: b */
        public int f4540b;

        /* JADX INFO: renamed from: c */
        public Long f4541c;

        /* JADX INFO: renamed from: d */
        public String f4542d;

        public d(AccessTokenManager accessTokenManager) {
        }
    }

    public AccessTokenManager2(LocalBroadcastManager localBroadcastManager, AccessTokenCache accessTokenCache) {
        Validate.m2477f(localBroadcastManager, "localBroadcastManager");
        Validate.m2477f(accessTokenCache, "accessTokenCache");
        this.f4521b = localBroadcastManager;
        this.f4522c = accessTokenCache;
    }

    /* JADX INFO: renamed from: a */
    public static AccessTokenManager2 m2259a() {
        if (f4520a == null) {
            synchronized (AccessTokenManager2.class) {
                if (f4520a == null) {
                    HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                    Validate.m2479h();
                    f4520a = new AccessTokenManager2(LocalBroadcastManager.m16762a(FacebookSdk.f5360i), new AccessTokenCache());
                }
            }
        }
        return f4520a;
    }

    /* JADX INFO: renamed from: b */
    public final void m2260b(AccessToken.b bVar) {
        AccessToken accessToken = this.f4523d;
        if (accessToken == null) {
            if (bVar != null) {
                bVar.m2252a(new FacebookException("No current access token to refresh"));
                return;
            }
            return;
        }
        if (!this.f4524e.compareAndSet(false, true)) {
            if (bVar != null) {
                bVar.m2252a(new FacebookException("Refresh already in progress"));
                return;
            }
            return;
        }
        this.f4525f = new Date();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        d dVar = new d(null);
        a aVar = new a(this, atomicBoolean, hashSet, hashSet2, hashSet3);
        Bundle bundle = new Bundle();
        HttpMethod httpMethod = HttpMethod.GET;
        b bVar2 = new b(this, dVar);
        Bundle bundleM1575Z = outline.m1575Z("grant_type", "fb_extend_sso_token");
        bundleM1575Z.putString("client_id", accessToken.f4502q);
        GraphRequestBatch graphRequestBatch = new GraphRequestBatch(new GraphRequest2(accessToken, "me/permissions", bundle, httpMethod, aVar), new GraphRequest2(accessToken, "oauth/access_token", bundleM1575Z, httpMethod, bVar2));
        c cVar = new c(accessToken, bVar, atomicBoolean, dVar, hashSet, hashSet2, hashSet3);
        if (!graphRequestBatch.f5405k.contains(cVar)) {
            graphRequestBatch.f5405k.add(cVar);
        }
        String str = GraphRequest2.f5372a;
        Validate.m2476e(graphRequestBatch, "requests");
        new GraphRequestAsyncTask(graphRequestBatch).executeOnExecutor(FacebookSdk.m2660b(), new Void[0]);
    }

    /* JADX INFO: renamed from: c */
    public final void m2261c(AccessToken accessToken, AccessToken accessToken2) {
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        Intent intent = new Intent(FacebookSdk.f5360i, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        intent.putExtra("com.facebook.sdk.EXTRA_OLD_ACCESS_TOKEN", accessToken);
        intent.putExtra("com.facebook.sdk.EXTRA_NEW_ACCESS_TOKEN", accessToken2);
        this.f4521b.m16764c(intent);
    }

    /* JADX INFO: renamed from: d */
    public final void m2262d(AccessToken accessToken, boolean z) {
        AccessToken accessToken2 = this.f4523d;
        this.f4523d = accessToken;
        this.f4524e.set(false);
        this.f4525f = new Date(0L);
        if (z) {
            if (accessToken != null) {
                this.f4522c.m2254a(accessToken);
            } else {
                this.f4522c.f4507a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
                HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                Validate.m2479h();
                Context context = FacebookSdk.f5360i;
                Utility.m2445d(context, "facebook.com");
                Utility.m2445d(context, ".facebook.com");
                Utility.m2445d(context, "https://facebook.com");
                Utility.m2445d(context, "https://.facebook.com");
            }
        }
        if (Utility.m2443b(accessToken2, accessToken)) {
            return;
        }
        m2261c(accessToken2, accessToken);
        HashSet<LoggingBehavior> hashSet2 = FacebookSdk.f5352a;
        Validate.m2479h();
        Context context2 = FacebookSdk.f5360i;
        AccessToken accessTokenM2247b = AccessToken.m2247b();
        AlarmManager alarmManager = (AlarmManager) context2.getSystemService("alarm");
        if (!AccessToken.m2248c() || accessTokenM2247b.f4495j == null || alarmManager == null) {
            return;
        }
        Intent intent = new Intent(context2, (Class<?>) CurrentAccessTokenExpirationBroadcastReceiver.class);
        intent.setAction("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED");
        try {
            alarmManager.set(1, accessTokenM2247b.f4495j.getTime(), PendingIntent.getBroadcast(context2, 0, intent, 0));
        } catch (Exception unused) {
        }
    }
}
