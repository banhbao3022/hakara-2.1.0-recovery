package p007c.p165l.p166h0;

import android.preference.PreferenceManager;
import java.util.HashSet;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.c, reason: use source file name */
/* JADX INFO: compiled from: AnalyticsUserIDStore.java */
/* JADX INFO: loaded from: classes.dex */
public class AnalyticsUserIDStore2 {

    /* JADX INFO: renamed from: a */
    public static final String f4606a = "c";

    /* JADX INFO: renamed from: c */
    public static String f4608c;

    /* JADX INFO: renamed from: b */
    public static ReentrantReadWriteLock f4607b = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: d */
    public static volatile boolean f4609d = false;

    /* JADX INFO: renamed from: a */
    public static void m2286a() {
        if (f4609d) {
            return;
        }
        f4607b.writeLock().lock();
        try {
            if (f4609d) {
                return;
            }
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            f4608c = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.f5360i).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
            f4609d = true;
        } finally {
            f4607b.writeLock().unlock();
        }
    }
}
