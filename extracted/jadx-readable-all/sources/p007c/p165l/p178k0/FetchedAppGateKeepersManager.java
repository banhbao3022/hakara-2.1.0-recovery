package p007c.p165l.p178k0;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.FacebookSdk;
import p007c.p165l.GraphRequest2;
import p007c.p165l.LoggingBehavior;

/* JADX INFO: renamed from: c.l.k0.q, reason: use source file name */
/* JADX INFO: compiled from: FetchedAppGateKeepersManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class FetchedAppGateKeepersManager {

    /* JADX INFO: renamed from: a */
    public static final AtomicBoolean f4993a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public static final ConcurrentLinkedQueue<c> f4994b = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: c */
    public static final Map<String, JSONObject> f4995c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static Long f4996d;

    /* JADX INFO: renamed from: c.l.k0.q$a */
    /* JADX INFO: compiled from: FetchedAppGateKeepersManager.java */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ String f4997f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Context f4998g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f4999h;

        public a(String str, Context context, String str2) {
            this.f4997f = str;
            this.f4998g = context;
            this.f4999h = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObjectM2518a = FetchedAppGateKeepersManager.m2518a(this.f4997f);
            if (jSONObjectM2518a != null) {
                FetchedAppGateKeepersManager.m2521d(this.f4997f, jSONObjectM2518a);
                this.f4998g.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(this.f4999h, jSONObjectM2518a.toString()).apply();
                FetchedAppGateKeepersManager.f4996d = Long.valueOf(System.currentTimeMillis());
            }
            FetchedAppGateKeepersManager.m2522e();
            FetchedAppGateKeepersManager.f4993a.set(false);
        }
    }

    /* JADX INFO: renamed from: c.l.k0.q$b */
    /* JADX INFO: compiled from: FetchedAppGateKeepersManager.java */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ c f5000f;

        public b(c cVar) {
            this.f5000f = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5000f.mo2517a();
        }
    }

    /* JADX INFO: renamed from: c.l.k0.q$c */
    /* JADX INFO: compiled from: FetchedAppGateKeepersManager.java */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo2517a();
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m2518a(String str) {
        Bundle bundleM1575Z = outline.m1575Z("platform", "android");
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        bundleM1575Z.putString("sdk_version", "5.15.3");
        bundleM1575Z.putString("fields", "gatekeepers");
        GraphRequest2 graphRequest2M2675l = GraphRequest2.m2675l(null, String.format("%s/%s", str, "mobile_sdk_gk"), null);
        graphRequest2M2675l.f5384m = true;
        graphRequest2M2675l.f5380i = bundleM1575Z;
        return graphRequest2M2675l.m2687d().f5408c;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2519b(String str, String str2, boolean z) {
        m2520c(null);
        if (str2 != null) {
            Map<String, JSONObject> map = f4995c;
            if (map.containsKey(str2)) {
                return map.get(str2).optBoolean(str, z);
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:14:0x0026, B:17:0x002b, B:21:0x0045, B:23:0x0056, B:27:0x0061, B:28:0x0064, B:32:0x006c, B:36:0x0076, B:25:0x005d, B:9:0x0011), top: B:42:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x002b A[Catch: all -> 0x0080, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:14:0x0026, B:17:0x002b, B:21:0x0045, B:23:0x0056, B:27:0x0061, B:28:0x0064, B:32:0x006c, B:36:0x0076, B:25:0x005d, B:9:0x0011), top: B:42:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:21:0x0045 A[Catch: all -> 0x0080, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:14:0x0026, B:17:0x002b, B:21:0x0045, B:23:0x0056, B:27:0x0061, B:28:0x0064, B:32:0x006c, B:36:0x0076, B:25:0x005d, B:9:0x0011), top: B:42:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[Catch: all -> 0x0080, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:14:0x0026, B:17:0x002b, B:21:0x0045, B:23:0x0056, B:27:0x0061, B:28:0x0064, B:32:0x006c, B:36:0x0076, B:25:0x005d, B:9:0x0011), top: B:42:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006a A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:32:0x006c A[Catch: all -> 0x0080, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:14:0x0026, B:17:0x002b, B:21:0x0045, B:23:0x0056, B:27:0x0061, B:28:0x0064, B:32:0x006c, B:36:0x0076, B:25:0x005d, B:9:0x0011), top: B:42:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0074 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:36:0x0076 A[Catch: all -> 0x0080, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x000a, B:14:0x0026, B:17:0x002b, B:21:0x0045, B:23:0x0056, B:27:0x0061, B:28:0x0064, B:32:0x006c, B:36:0x0076, B:25:0x005d, B:9:0x0011), top: B:42:0x0005, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:19:0x0043, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x006a, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x0074, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public static synchronized void m2520c(c cVar) {
        Long l;
        Context context;
        String str;
        String str2;
        JSONObject jSONObject;
        String string;
        Executor executorM2660b;
        if (cVar != null) {
            f4994b.add(cVar);
            l = f4996d;
            if (l != null && System.currentTimeMillis() - l.longValue() < 3600000) {
                m2522e();
                return;
            }
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            context = FacebookSdk.f5360i;
            Validate.m2479h();
            str = FacebookSdk.f5354c;
            str2 = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", str);
            if (context == null) {
                return;
            }
            jSONObject = null;
            string = context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str2, null);
            if (!Utility.m2466y(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (JSONException unused) {
                    HashSet<LoggingBehavior> hashSet2 = FacebookSdk.f5352a;
                }
                if (jSONObject != null) {
                    m2521d(str, jSONObject);
                }
            }
            executorM2660b = FacebookSdk.m2660b();
            if (executorM2660b == null) {
                return;
            }
            if (f4993a.compareAndSet(false, true)) {
                executorM2660b.execute(new a(str, context, str2));
                return;
            }
            return;
        }
        l = f4996d;
        if (l != null) {
            if (l != null && System.currentTimeMillis() - l.longValue() < 3600000) {
                m2522e();
                return;
            }
            HashSet<LoggingBehavior> hashSet3 = FacebookSdk.f5352a;
            Validate.m2479h();
            context = FacebookSdk.f5360i;
            Validate.m2479h();
            str = FacebookSdk.f5354c;
            str2 = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", str);
            if (context == null) {
                return;
            }
            jSONObject = null;
            string = context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str2, null);
            if (!Utility.m2466y(string)) {
                jSONObject = new JSONObject(string);
                if (jSONObject != null) {
                    m2521d(str, jSONObject);
                }
            }
            executorM2660b = FacebookSdk.m2660b();
            if (executorM2660b == null) {
                return;
            }
            if (f4993a.compareAndSet(false, true)) {
                return;
            }
            executorM2660b.execute(new a(str, context, str2));
            return;
        }
        if (l != null && System.currentTimeMillis() - l.longValue() < 3600000) {
            m2522e();
            return;
        }
        HashSet<LoggingBehavior> hashSet4 = FacebookSdk.f5352a;
        Validate.m2479h();
        context = FacebookSdk.f5360i;
        Validate.m2479h();
        str = FacebookSdk.f5354c;
        str2 = String.format("com.facebook.internal.APP_GATEKEEPERS.%s", str);
        if (context == null) {
            return;
        }
        jSONObject = null;
        string = context.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).getString(str2, null);
        if (!Utility.m2466y(string)) {
            jSONObject = new JSONObject(string);
            if (jSONObject != null) {
                m2521d(str, jSONObject);
            }
        }
        executorM2660b = FacebookSdk.m2660b();
        if (executorM2660b == null) {
            return;
        }
        if (f4993a.compareAndSet(false, true)) {
            return;
        }
        executorM2660b.execute(new a(str, context, str2));
        return;
        throw th;
    }

    /* JADX INFO: renamed from: d */
    public static synchronized JSONObject m2521d(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        Map<String, JSONObject> map = f4995c;
        jSONObject2 = map.containsKey(str) ? map.get(str) : new JSONObject();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.optJSONObject(0) : null;
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optJSONArray("gatekeepers") != null) {
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("gatekeepers");
            for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                try {
                    JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i);
                    jSONObject2.put(jSONObject3.getString("key"), jSONObject3.getBoolean("value"));
                } catch (JSONException unused) {
                    HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
                }
            }
        }
        f4995c.put(str, jSONObject2);
        return jSONObject2;
    }

    /* JADX INFO: renamed from: e */
    public static void m2522e() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<c> concurrentLinkedQueue = f4994b;
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            c cVarPoll = concurrentLinkedQueue.poll();
            if (cVarPoll != null) {
                handler.post(new b(cVarPoll));
            }
        }
    }
}
