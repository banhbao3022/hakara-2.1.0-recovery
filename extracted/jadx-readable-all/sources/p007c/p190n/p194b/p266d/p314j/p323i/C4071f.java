package p007c.p190n.p194b.p266d.p314j.p323i;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: c.n.b.d.j.i.f */
/* JADX INFO: compiled from: com.google.firebase:firebase-messaging@@21.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4071f extends WeakReference<Throwable> {

    /* JADX INFO: renamed from: a */
    public final int f23014a;

    public C4071f(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        this.f23014a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C4071f.class) {
            if (this == obj) {
                return true;
            }
            C4071f c4071f = (C4071f) obj;
            if (this.f23014a == c4071f.f23014a && get() == c4071f.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f23014a;
    }
}
