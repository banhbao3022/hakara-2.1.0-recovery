package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: c.n.b.d.k.b.u6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4687u6 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReference f24477f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4500e6 f24478g;

    public RunnableC4687u6(C4500e6 c4500e6, AtomicReference atomicReference) {
        this.f24478g = c4500e6;
        this.f24477f = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f24477f) {
            try {
                AtomicReference atomicReference = this.f24477f;
                C4500e6 c4500e6 = this.f24478g;
                C4469c c4469c = c4500e6.f24476a.f24534h;
                C4629p3 c4629p3M10384k = c4500e6.m10384k();
                c4629p3M10384k.m10479t();
                atomicReference.set(Integer.valueOf(c4469c.m10419q(c4629p3M10384k.f24256c, C4647r.f24322N)));
                this.f24477f.notify();
            } catch (Throwable th) {
                this.f24477f.notify();
                throw th;
            }
        }
    }
}
