package p007c.p165l.p166h0;

import p007c.p165l.FacebookRequestError;
import p007c.p165l.FacebookSdk;
import p007c.p165l.GraphRequest2;
import p007c.p165l.GraphResponse;

/* JADX INFO: renamed from: c.l.h0.j, reason: use source file name */
/* JADX INFO: compiled from: AppEventQueue.java */
/* JADX INFO: loaded from: classes.dex */
public final class AppEventQueue5 implements GraphRequest2.c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AccessTokenAppIdPair f4832a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ GraphRequest2 f4833b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SessionEventsState f4834c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ FlushStatistics f4835d;

    public AppEventQueue5(AccessTokenAppIdPair accessTokenAppIdPair, GraphRequest2 graphRequest2, SessionEventsState sessionEventsState, FlushStatistics flushStatistics) {
        this.f4832a = accessTokenAppIdPair;
        this.f4833b = graphRequest2;
        this.f4834c = sessionEventsState;
        this.f4835d = flushStatistics;
    }

    @Override // p007c.p165l.GraphRequest2.c
    /* JADX INFO: renamed from: b */
    public void mo2263b(GraphResponse graphResponse) {
        FlushResult flushResult;
        AccessTokenAppIdPair accessTokenAppIdPair = this.f4832a;
        SessionEventsState sessionEventsState = this.f4834c;
        FlushStatistics flushStatistics = this.f4835d;
        FlushResult flushResult2 = FlushResult.NO_CONNECTIVITY;
        FacebookRequestError facebookRequestError = graphResponse.f5409d;
        FlushResult flushResult3 = FlushResult.SUCCESS;
        if (facebookRequestError == null) {
            flushResult = flushResult3;
        } else if (facebookRequestError.f5177i == -1) {
            flushResult = flushResult2;
        } else {
            String.format("Failed:\n  Response: %s\n  Error %s", graphResponse.toString(), facebookRequestError.toString());
            flushResult = FlushResult.SERVER_ERROR;
        }
        synchronized (FacebookSdk.f5352a) {
        }
        boolean z = facebookRequestError != null;
        synchronized (sessionEventsState) {
            if (z) {
                sessionEventsState.f4858a.addAll(sessionEventsState.f4859b);
            }
            sessionEventsState.f4859b.clear();
            sessionEventsState.f4860c = 0;
        }
        if (flushResult == flushResult2) {
            FacebookSdk.m2660b().execute(new AppEventQueue6(accessTokenAppIdPair, sessionEventsState));
        }
        if (flushResult == flushResult3 || flushStatistics.f4854b == flushResult2) {
            return;
        }
        flushStatistics.f4854b = flushResult;
    }
}
