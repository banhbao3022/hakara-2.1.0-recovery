package p007c.p165l.p178k0;

import java.util.HashMap;
import p007c.p071d.p078c.p079a.outline;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;

/* JADX INFO: renamed from: c.l.k0.x, reason: use source file name */
/* JADX INFO: compiled from: Logger.java */
/* JADX INFO: loaded from: classes.dex */
public class Logger3 {

    /* JADX INFO: renamed from: a */
    public static final HashMap<String, String> f5043a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public final LoggingBehavior f5044b;

    /* JADX INFO: renamed from: c */
    public final String f5045c;

    /* JADX INFO: renamed from: d */
    public StringBuilder f5046d;

    /* JADX INFO: renamed from: e */
    public int f5047e = 3;

    public Logger3(LoggingBehavior loggingBehavior, String str) {
        Validate.m2478g(str, "tag");
        this.f5044b = loggingBehavior;
        this.f5045c = outline.m1599u("FacebookSDK.", str);
        this.f5046d = new StringBuilder();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m2532a(String str) {
        synchronized (FacebookSdk.f5352a) {
        }
        synchronized (Logger3.class) {
            f5043a.put(str, "ACCESS_TOKEN_REMOVED");
        }
    }
}
