package p007c.p165l.p166h0;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.a0, reason: use source file name */
/* JADX INFO: compiled from: UserDataStore.java */
/* JADX INFO: loaded from: classes.dex */
public class UserDataStore {

    /* JADX INFO: renamed from: a */
    public static final String f4589a = "a0";

    /* JADX INFO: renamed from: b */
    public static SharedPreferences f4590b;

    /* JADX INFO: renamed from: c */
    public static AtomicBoolean f4591c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final ConcurrentHashMap<String, String> f4592d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e */
    public static final ConcurrentHashMap<String, String> f4593e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public static synchronized void m2279a() {
        if (f4591c.get()) {
            return;
        }
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.f5360i);
        f4590b = defaultSharedPreferences;
        String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", "");
        String string2 = f4590b.getString("com.facebook.appevents.UserDataStore.internalUserData", "");
        f4592d.putAll(Utility.m2442a(string));
        f4593e.putAll(Utility.m2442a(string2));
        f4591c.set(true);
    }
}
