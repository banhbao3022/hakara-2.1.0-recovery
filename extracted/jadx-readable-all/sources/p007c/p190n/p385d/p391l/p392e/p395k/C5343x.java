package p007c.p190n.p385d.p391l.p392e.p395k;

import java.util.Date;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p406s.SettingsDataProvider;

/* JADX INFO: renamed from: c.n.d.l.e.k.x */
/* JADX INFO: compiled from: CrashlyticsController.java */
/* JADX INFO: loaded from: classes.dex */
public class C5343x implements CrashlyticsUncaughtExceptionHandler.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C5335t f26634a;

    public C5343x(C5335t c5335t) {
        this.f26634a = c5335t;
    }

    /* JADX INFO: renamed from: a */
    public void m11810a(SettingsDataProvider settingsDataProvider, Thread thread, Throwable th) {
        C5335t c5335t = this.f26634a;
        synchronized (c5335t) {
            Logger4.f26421a.m11713b("Crashlytics is handling uncaught exception \"" + th + "\" from thread " + thread.getName());
            try {
                Utils3.m11727a(c5335t.f26596m.m11764c(new CallableC5347z(c5335t, new Date(), th, thread, settingsDataProvider)));
            } catch (Exception unused) {
            }
        }
    }
}
