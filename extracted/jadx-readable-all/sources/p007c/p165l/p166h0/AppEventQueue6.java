package p007c.p165l.p166h0;

/* JADX INFO: renamed from: c.l.h0.k, reason: use source file name */
/* JADX INFO: compiled from: AppEventQueue.java */
/* JADX INFO: loaded from: classes.dex */
public final class AppEventQueue6 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AccessTokenAppIdPair f4836f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ SessionEventsState f4837g;

    public AppEventQueue6(AccessTokenAppIdPair accessTokenAppIdPair, SessionEventsState sessionEventsState) {
        this.f4836f = accessTokenAppIdPair;
        this.f4837g = sessionEventsState;
    }

    @Override // java.lang.Runnable
    public void run() {
        AccessTokenAppIdPair accessTokenAppIdPair = this.f4836f;
        SessionEventsState sessionEventsState = this.f4837g;
        String str = AppEventStore.f4838a;
        synchronized (AppEventStore.class) {
            PersistedEvents persistedEventsM2358a = AppEventStore.m2358a();
            if (persistedEventsM2358a.f4856f.containsKey(accessTokenAppIdPair)) {
                persistedEventsM2358a.f4856f.get(accessTokenAppIdPair).addAll(sessionEventsState.m2373b());
            } else {
                persistedEventsM2358a.m2371a(accessTokenAppIdPair, sessionEventsState.m2373b());
            }
            AppEventStore.m2359b(persistedEventsM2358a);
        }
    }
}
