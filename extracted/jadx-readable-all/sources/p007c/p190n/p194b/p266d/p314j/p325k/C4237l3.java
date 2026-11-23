package p007c.p190n.p194b.p266d.p314j.p325k;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: renamed from: c.n.b.d.j.k.l3 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4237l3 extends WeakReference<Throwable> {

    /* JADX INFO: renamed from: a */
    public final int f23284a;

    public C4237l3(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.f23284a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == C4237l3.class) {
            if (this == obj) {
                return true;
            }
            C4237l3 c4237l3 = (C4237l3) obj;
            if (this.f23284a == c4237l3.f23284a && get() == c4237l3.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f23284a;
    }
}
