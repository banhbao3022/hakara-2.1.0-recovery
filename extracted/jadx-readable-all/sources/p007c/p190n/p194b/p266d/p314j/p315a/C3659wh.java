package p007c.p190n.p194b.p266d.p314j.p315a;

import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: renamed from: c.n.b.d.j.a.wh */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3659wh implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Thread.UncaughtExceptionHandler f21123a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3696xh f21124b;

    public C3659wh(C3696xh c3696xh, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f21124b = c3696xh;
        this.f21123a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            try {
                this.f21124b.m8737d(thread, th);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f21123a;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            } finally {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f21123a;
                if (uncaughtExceptionHandler2 != null) {
                    uncaughtExceptionHandler2.uncaughtException(thread, th);
                }
            }
        } catch (Throwable unused) {
            C2622l.m5408n3("AdMob exception reporter failed reporting the exception.");
            if (this.f21123a != null) {
            }
        }
    }
}
