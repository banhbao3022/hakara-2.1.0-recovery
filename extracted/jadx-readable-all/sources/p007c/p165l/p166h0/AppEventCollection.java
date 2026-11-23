package p007c.p165l.p166h0;

import android.content.Context;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p178k0.AttributionIdentifiers;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.e, reason: use source file name */
/* JADX INFO: compiled from: AppEventCollection.java */
/* JADX INFO: loaded from: classes.dex */
public class AppEventCollection {

    /* JADX INFO: renamed from: a */
    public final HashMap<AccessTokenAppIdPair, SessionEventsState> f4707a = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public final synchronized SessionEventsState m2309a(AccessTokenAppIdPair accessTokenAppIdPair) {
        SessionEventsState sessionEventsState;
        sessionEventsState = this.f4707a.get(accessTokenAppIdPair);
        if (sessionEventsState == null) {
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            Context context = FacebookSdk.f5360i;
            sessionEventsState = new SessionEventsState(AttributionIdentifiers.m2418c(context), AppEventsLogger.m2360a(context));
        }
        this.f4707a.put(accessTokenAppIdPair, sessionEventsState);
        return sessionEventsState;
    }

    /* JADX INFO: renamed from: b */
    public synchronized Set<AccessTokenAppIdPair> m2310b() {
        return this.f4707a.keySet();
    }
}
