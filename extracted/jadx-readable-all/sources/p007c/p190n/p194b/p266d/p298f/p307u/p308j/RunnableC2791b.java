package p007c.p190n.p194b.p266d.p298f.p307u.p308j;

import android.os.Process;

/* JADX INFO: renamed from: c.n.b.d.f.u.j.b */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2791b implements Runnable {

    /* JADX INFO: renamed from: f */
    public final Runnable f11955f;

    public RunnableC2791b(Runnable runnable, int i) {
        this.f11955f = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f11955f.run();
    }
}
