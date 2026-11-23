package p007c.p165l.p166h0.p168c0;

import android.os.Bundle;
import java.util.HashSet;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.AppEventsLogger;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.c0.h, reason: use source file name */
/* JADX INFO: compiled from: RCTCodelessLoggingEventListener.java */
/* JADX INFO: loaded from: classes.dex */
public class RCTCodelessLoggingEventListener implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f4647f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Bundle f4648g;

    public RCTCodelessLoggingEventListener(RCTCodelessLoggingEventListener2 rCTCodelessLoggingEventListener2, String str, Bundle bundle) {
        this.f4647f = str;
        this.f4648g = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
        Validate.m2479h();
        AppEventsLogger appEventsLoggerM2361b = AppEventsLogger.m2361b(FacebookSdk.f5360i);
        appEventsLoggerM2361b.f4839a.m2365d(this.f4647f, this.f4648g);
    }
}
