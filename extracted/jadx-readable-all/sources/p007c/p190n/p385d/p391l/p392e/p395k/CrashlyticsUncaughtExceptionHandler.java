package p007c.p190n.p385d.p391l.p392e.p395k;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p190n.p385d.p391l.p392e.Logger4;
import p007c.p190n.p385d.p391l.p392e.p406s.SettingsDataProvider;

/* JADX INFO: renamed from: c.n.d.l.e.k.l0, reason: use source file name */
/* JADX INFO: compiled from: CrashlyticsUncaughtExceptionHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final a f26533a;

    /* JADX INFO: renamed from: b */
    public final SettingsDataProvider f26534b;

    /* JADX INFO: renamed from: c */
    public final Thread.UncaughtExceptionHandler f26535c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f26536d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c.n.d.l.e.k.l0$a */
    /* JADX INFO: compiled from: CrashlyticsUncaughtExceptionHandler.java */
    public interface a {
    }

    public CrashlyticsUncaughtExceptionHandler(a aVar, SettingsDataProvider settingsDataProvider, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f26533a = aVar;
        this.f26534b = settingsDataProvider;
        this.f26535c = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.f26536d.set(true);
        try {
            if (thread == null) {
                Logger4.f26421a.m11715d("Could not handle uncaught exception; null thread");
            } else if (th == null) {
                Logger4.f26421a.m11715d("Could not handle uncaught exception; null throwable");
            } else {
                ((C5343x) this.f26533a).m11810a(this.f26534b, thread, th);
            }
            Logger4.f26421a.m11713b("Crashlytics completed exception processing. Invoking default exception handler.");
        } catch (Exception e) {
            Logger4 logger4 = Logger4.f26421a;
            if (logger4.m11712a(6)) {
                Log.e(logger4.f26422b, "An error occurred in the uncaught exception handler", e);
            }
            logger4.m11713b("Crashlytics completed exception processing. Invoking default exception handler.");
        } finally {
            Logger4.f26421a.m11713b("Crashlytics completed exception processing. Invoking default exception handler.");
            this.f26535c.uncaughtException(thread, th);
            this.f26536d.set(false);
        }
    }
}
