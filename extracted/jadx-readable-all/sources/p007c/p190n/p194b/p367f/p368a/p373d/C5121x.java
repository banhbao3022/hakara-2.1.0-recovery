package p007c.p190n.p194b.p367f.p368a.p373d;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: c.n.b.f.a.d.x */
/* JADX INFO: loaded from: classes.dex */
public final class C5121x extends WeakReference<Throwable> {

    /* JADX INFO: renamed from: a */
    public final int f26072a;

    public C5121x(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f26072a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C5121x.class) {
            if (this == obj) {
                return true;
            }
            C5121x c5121x = (C5121x) obj;
            if (this.f26072a == c5121x.f26072a && get() == c5121x.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f26072a;
    }
}
