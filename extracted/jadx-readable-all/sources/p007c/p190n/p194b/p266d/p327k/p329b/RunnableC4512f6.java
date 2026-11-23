package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: c.n.b.d.k.b.f6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4512f6 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReference f23916f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4500e6 f23917g;

    public RunnableC4512f6(C4500e6 c4500e6, AtomicReference atomicReference) {
        this.f23917g = c4500e6;
        this.f23916f = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f23916f) {
            try {
                AtomicReference atomicReference = this.f23916f;
                C4500e6 c4500e6 = this.f23917g;
                C4469c c4469c = c4500e6.f24476a.f24534h;
                C4629p3 c4629p3M10384k = c4500e6.m10384k();
                c4629p3M10384k.m10479t();
                String str = c4629p3M10384k.f24256c;
                Objects.requireNonNull(c4469c);
                atomicReference.set(Boolean.valueOf(c4469c.m10423u(str, C4647r.f24316K)));
                this.f23916f.notify();
            } catch (Throwable th) {
                this.f23916f.notify();
                throw th;
            }
        }
    }
}
