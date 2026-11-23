package p007c.p190n.p194b.p266d.p327k.p329b;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: c.n.b.d.k.b.o6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4620o6 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AtomicReference f24231f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4500e6 f24232g;

    public RunnableC4620o6(C4500e6 c4500e6, AtomicReference atomicReference) {
        this.f24232g = c4500e6;
        this.f24231f = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f24231f) {
            try {
                AtomicReference atomicReference = this.f24231f;
                C4500e6 c4500e6 = this.f24232g;
                C4469c c4469c = c4500e6.f24476a.f24534h;
                C4629p3 c4629p3M10384k = c4500e6.m10384k();
                c4629p3M10384k.m10479t();
                String str = c4629p3M10384k.f24256c;
                Objects.requireNonNull(c4469c);
                C4581l3<String> c4581l3 = C4647r.f24318L;
                atomicReference.set(str == null ? c4581l3.m10638a(null) : c4581l3.m10638a(c4469c.f23743c.mo10379d(str, c4581l3.f24103b)));
                this.f24231f.notify();
            } catch (Throwable th) {
                this.f24231f.notify();
                throw th;
            }
        }
    }
}
