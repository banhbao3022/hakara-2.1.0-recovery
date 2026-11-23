package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mu1 extends lu1 {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceFieldUpdater<ou1, Set<Throwable>> f16853a;

    /* JADX INFO: renamed from: b */
    public final AtomicIntegerFieldUpdater<ou1> f16854b;

    public mu1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f16853a = atomicReferenceFieldUpdater;
        this.f16854b = atomicIntegerFieldUpdater;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lu1
    /* JADX INFO: renamed from: a */
    public final void mo7645a(ou1 ou1Var, Set<Throwable> set, Set<Throwable> set2) {
        this.f16853a.compareAndSet(ou1Var, null, set2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.lu1
    /* JADX INFO: renamed from: b */
    public final int mo7646b(ou1 ou1Var) {
        return this.f16854b.decrementAndGet(ou1Var);
    }
}
