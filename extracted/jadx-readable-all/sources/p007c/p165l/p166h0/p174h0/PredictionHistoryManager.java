package p007c.p165l.p166h0.p174h0;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.h0.b, reason: use source file name */
/* JADX INFO: compiled from: PredictionHistoryManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class PredictionHistoryManager {

    /* JADX INFO: renamed from: b */
    public static SharedPreferences f4808b;

    /* JADX INFO: renamed from: a */
    public static final Map<String, String> f4807a = new HashMap();

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f4809c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static void m2346a(String str, String str2) {
        AtomicBoolean atomicBoolean = f4809c;
        if (!atomicBoolean.get() && !atomicBoolean.get()) {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            SharedPreferences sharedPreferences = FacebookSdk.f5360i.getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            f4808b = sharedPreferences;
            f4807a.putAll(Utility.m2442a(sharedPreferences.getString("SUGGESTED_EVENTS_HISTORY", "")));
            atomicBoolean.set(true);
        }
        Map<String, String> map = f4807a;
        map.put(str, str2);
        f4808b.edit().putString("SUGGESTED_EVENTS_HISTORY", Utility.m2431D(map)).apply();
    }
}
