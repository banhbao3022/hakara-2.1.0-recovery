package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wt1 extends st1 {

    /* JADX INFO: renamed from: a */
    public final AtomicReferenceFieldUpdater<cu1, Thread> f21357a;

    /* JADX INFO: renamed from: b */
    public final AtomicReferenceFieldUpdater<cu1, cu1> f21358b;

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceFieldUpdater<du1, cu1> f21359c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater<du1, vt1> f21360d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater<du1, Object> f21361e;

    public wt1(AtomicReferenceFieldUpdater<cu1, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<cu1, cu1> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<du1, cu1> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<du1, vt1> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<du1, Object> atomicReferenceFieldUpdater5) {
        this.f21357a = atomicReferenceFieldUpdater;
        this.f21358b = atomicReferenceFieldUpdater2;
        this.f21359c = atomicReferenceFieldUpdater3;
        this.f21360d = atomicReferenceFieldUpdater4;
        this.f21361e = atomicReferenceFieldUpdater5;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.st1
    /* JADX INFO: renamed from: a */
    public final void mo6100a(cu1 cu1Var, Thread thread) {
        this.f21357a.lazySet(cu1Var, thread);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.st1
    /* JADX INFO: renamed from: b */
    public final void mo6101b(cu1 cu1Var, cu1 cu1Var2) {
        this.f21358b.lazySet(cu1Var, cu1Var2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.st1
    /* JADX INFO: renamed from: c */
    public final boolean mo6102c(du1<?> du1Var, cu1 cu1Var, cu1 cu1Var2) {
        return this.f21359c.compareAndSet(du1Var, cu1Var, cu1Var2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.st1
    /* JADX INFO: renamed from: d */
    public final boolean mo6103d(du1<?> du1Var, vt1 vt1Var, vt1 vt1Var2) {
        return this.f21360d.compareAndSet(du1Var, vt1Var, vt1Var2);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.st1
    /* JADX INFO: renamed from: e */
    public final boolean mo6104e(du1<?> du1Var, Object obj, Object obj2) {
        return this.f21361e.compareAndSet(du1Var, obj, obj2);
    }
}
