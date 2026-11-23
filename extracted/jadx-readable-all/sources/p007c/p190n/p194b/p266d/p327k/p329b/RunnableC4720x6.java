package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: c.n.b.d.k.b.x6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4720x6 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReference f24581f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4500e6 f24582g;

    public RunnableC4720x6(C4500e6 c4500e6, AtomicReference atomicReference) {
        this.f24582g = c4500e6;
        this.f24581f = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f24581f) {
            try {
                AtomicReference atomicReference = this.f24581f;
                C4500e6 c4500e6 = this.f24582g;
                C4469c c4469c = c4500e6.f24476a.f24534h;
                C4629p3 c4629p3M10384k = c4500e6.m10384k();
                c4629p3M10384k.m10479t();
                atomicReference.set(Double.valueOf(c4469c.m10420r(c4629p3M10384k.f24256c, C4647r.f24324O)));
                this.f24581f.notify();
            } catch (Throwable th) {
                this.f24581f.notify();
                throw th;
            }
        }
    }
}
