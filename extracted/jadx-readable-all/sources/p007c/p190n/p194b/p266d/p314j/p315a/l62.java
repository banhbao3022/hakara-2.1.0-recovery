package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-base@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class l62 extends WeakReference<Throwable> {

    /* JADX INFO: renamed from: a */
    public final int f16292a;

    public l62(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        Objects.requireNonNull(th, "The referent cannot be null");
        this.f16292a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == l62.class) {
            if (this == obj) {
                return true;
            }
            l62 l62Var = (l62) obj;
            if (this.f16292a == l62Var.f16292a && get() == l62Var.get()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16292a;
    }
}
