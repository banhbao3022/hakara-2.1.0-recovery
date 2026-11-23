package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.HandlerC2303v0;
import p007c.p190n.p194b.p266d.p298f.p307u.C2783c;

/* JADX INFO: renamed from: c.n.b.d.j.a.bo */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC2887bo implements Executor {

    /* JADX INFO: renamed from: f */
    public final Handler f12751f = new HandlerC2303v0(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            this.f12751f.post(runnable);
            return;
        }
        try {
            runnable.run();
        } catch (Throwable th) {
            C2267h1 c2267h1 = C2330u.f10884a.f10889d;
            Context context = C2330u.f10884a.f10893h.f13616e;
            if (context != null) {
                try {
                    if (C3646w4.f20986b.m6603d().booleanValue()) {
                        C2783c.m5625a(context, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }
}
