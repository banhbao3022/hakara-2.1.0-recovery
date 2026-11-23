package p007c.p165l.p166h0.p171e0;

import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.InternalAppEventsLogger;
import p007c.p165l.p178k0.FetchedAppSettings;
import p007c.p165l.p178k0.FetchedAppSettingsManager;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.e0.g, reason: use source file name */
/* JADX INFO: compiled from: AutomaticAnalyticsLogger.java */
/* JADX INFO: loaded from: classes.dex */
public class AutomaticAnalyticsLogger {

    /* JADX INFO: renamed from: a */
    public static final String f4729a = "c.l.h0.e0.g";

    /* JADX INFO: renamed from: b */
    public static final InternalAppEventsLogger f4730b;

    /* JADX INFO: renamed from: c.l.h0.e0.g$a */
    /* JADX INFO: compiled from: AutomaticAnalyticsLogger.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        public BigDecimal f4731a;

        /* JADX INFO: renamed from: b */
        public Currency f4732b;

        /* JADX INFO: renamed from: c */
        public Bundle f4733c;

        public a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
            this.f4731a = bigDecimal;
            this.f4732b = currency;
            this.f4733c = bundle;
        }
    }

    static {
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        f4730b = new InternalAppEventsLogger(FacebookSdk.f5360i);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2318a() {
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        FetchedAppSettings fetchedAppSettingsM2524b = FetchedAppSettingsManager.m2524b(FacebookSdk.f5354c);
        return fetchedAppSettingsM2524b != null && FacebookSdk.m2659a() && fetchedAppSettingsM2524b.f5007g;
    }
}
