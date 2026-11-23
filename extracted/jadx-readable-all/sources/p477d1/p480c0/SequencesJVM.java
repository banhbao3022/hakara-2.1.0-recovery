package p477d1.p480c0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: d1.c0.a, reason: use source file name */
/* JADX INFO: compiled from: SequencesJVM.kt */
/* JADX INFO: loaded from: classes.dex */
public final class SequencesJVM<T> implements Sequence<T> {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<Sequence<T>> f29441a;

    public SequencesJVM(Sequence<? extends T> sequence) {
        Intrinsics2.m13089e(sequence, "sequence");
        this.f29441a = new AtomicReference<>(sequence);
    }

    @Override // p477d1.p480c0.Sequence
    public Iterator<T> iterator() {
        Sequence<T> andSet = this.f29441a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
