package p007c.p165l.p166h0;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: c.l.h0.i, reason: use source file name */
/* JADX INFO: compiled from: AppEventQueue.java */
/* JADX INFO: loaded from: classes.dex */
public final class AppEventQueue4 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AccessTokenAppIdPair f4830f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AppEvent f4831g;

    public AppEventQueue4(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        this.f4830f = accessTokenAppIdPair;
        this.f4831g = appEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        int size;
        AppEventCollection appEventCollection = AppEventQueue.f4757b;
        AccessTokenAppIdPair accessTokenAppIdPair = this.f4830f;
        AppEvent appEvent = this.f4831g;
        synchronized (appEventCollection) {
            appEventCollection.m2309a(accessTokenAppIdPair).m2372a(appEvent);
        }
        AppEventsLoggerImpl3.m2362a();
        AppEventCollection appEventCollection2 = AppEventQueue.f4757b;
        synchronized (appEventCollection2) {
            i = 0;
            try {
                for (SessionEventsState sessionEventsState : appEventCollection2.f4707a.values()) {
                    synchronized (sessionEventsState) {
                        try {
                            size = sessionEventsState.f4858a.size();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    i += size;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i > 100) {
            AppEventQueue.m2329a(5);
        } else if (AppEventQueue.f4759d == null) {
            AppEventQueue.f4759d = AppEventQueue.f4758c.schedule(AppEventQueue.f4760e, 15L, TimeUnit.SECONDS);
        }
    }
}
