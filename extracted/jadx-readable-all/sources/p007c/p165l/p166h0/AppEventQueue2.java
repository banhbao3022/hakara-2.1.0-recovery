package p007c.p165l.p166h0;

/* JADX INFO: renamed from: c.l.h0.g, reason: use source file name */
/* JADX INFO: compiled from: AppEventQueue.java */
/* JADX INFO: loaded from: classes.dex */
public final class AppEventQueue2 implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        SessionEventsState sessionEventsState;
        AppEventCollection appEventCollection = AppEventQueue.f4757b;
        String str = AppEventStore.f4838a;
        synchronized (AppEventStore.class) {
            PersistedEvents persistedEventsM2358a = AppEventStore.m2358a();
            for (AccessTokenAppIdPair accessTokenAppIdPair : appEventCollection.m2310b()) {
                synchronized (appEventCollection) {
                    sessionEventsState = appEventCollection.f4707a.get(accessTokenAppIdPair);
                }
                persistedEventsM2358a.m2371a(accessTokenAppIdPair, sessionEventsState.m2373b());
            }
            AppEventStore.m2359b(persistedEventsM2358a);
        }
        AppEventQueue.f4757b = new AppEventCollection();
    }
}
