package p007c.p190n.p194b.p266d.p267a.p282z.p284b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import p007c.p190n.p194b.p209b.p263z1.C2096e;
import p007c.p190n.p194b.p266d.p298f.C2622l;
import p007c.p190n.p194b.p266d.p314j.p315a.xr1;

/* JADX INFO: renamed from: c.n.b.d.a.z.b.j0 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2272j0 {

    /* JADX INFO: renamed from: a */
    public HandlerThread f10727a = null;

    /* JADX INFO: renamed from: b */
    public Handler f10728b = null;

    /* JADX INFO: renamed from: c */
    public int f10729c = 0;

    /* JADX INFO: renamed from: d */
    public final Object f10730d = new Object();

    /* JADX INFO: renamed from: a */
    public final Looper m4786a() {
        Looper looper;
        synchronized (this.f10730d) {
            if (this.f10729c != 0) {
                C2622l.m5379i(this.f10727a, "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.f10727a == null) {
                C2096e.m4590z("Starting the looper thread.");
                HandlerThread handlerThread = new HandlerThread("LooperProvider");
                this.f10727a = handlerThread;
                handlerThread.start();
                this.f10728b = new xr1(this.f10727a.getLooper());
                C2096e.m4590z("Looper thread started.");
            } else {
                C2096e.m4590z("Resuming the looper thread");
                this.f10730d.notifyAll();
            }
            this.f10729c++;
            looper = this.f10727a.getLooper();
        }
        return looper;
    }
}
