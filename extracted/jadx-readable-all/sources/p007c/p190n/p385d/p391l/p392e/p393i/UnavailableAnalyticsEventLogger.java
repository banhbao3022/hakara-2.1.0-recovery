package p007c.p190n.p385d.p391l.p392e.p393i;

import android.os.Bundle;
import p007c.p190n.p385d.p391l.p392e.Logger4;

/* JADX INFO: renamed from: c.n.d.l.e.i.f, reason: use source file name */
/* JADX INFO: compiled from: UnavailableAnalyticsEventLogger.java */
/* JADX INFO: loaded from: classes.dex */
public class UnavailableAnalyticsEventLogger implements AnalyticsEventLogger {
    @Override // p007c.p190n.p385d.p391l.p392e.p393i.AnalyticsEventLogger
    /* JADX INFO: renamed from: a */
    public void mo11721a(String str, Bundle bundle) {
        Logger4.f26421a.m11713b("Skipping logging Crashlytics event to Firebase, no Firebase Analytics");
    }
}
