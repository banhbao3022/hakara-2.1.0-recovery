package androidx.lifecycle;

import p007c.p451o.p452a.C5729a;
import p477d1.p485u.CoroutineContext;
import p477d1.p493x.p495c.Intrinsics2;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.Lifecycle4;
import p636z0.p759s.LifecycleOwner;

/* JADX INFO: renamed from: androidx.lifecycle.LifecycleCoroutineScopeImpl, reason: use source file name */
/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
public final class Lifecycle extends Lifecycle4 implements LifecycleEventObserver {

    /* JADX INFO: renamed from: f */
    public final Lifecycle3 f764f;

    /* JADX INFO: renamed from: g */
    public final CoroutineContext f765g;

    public Lifecycle(Lifecycle3 lifecycle3, CoroutineContext coroutineContext) {
        Intrinsics2.m13089e(lifecycle3, "lifecycle");
        Intrinsics2.m13089e(coroutineContext, "coroutineContext");
        this.f764f = lifecycle3;
        this.f765g = coroutineContext;
        if (lifecycle3.mo16728b() == Lifecycle3.b.DESTROYED) {
            C5729a.m12452g(coroutineContext, null, 1, null);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: c */
    public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
        Intrinsics2.m13089e(lifecycleOwner, "source");
        Intrinsics2.m13089e(aVar, "event");
        if (this.f764f.mo16728b().compareTo(Lifecycle3.b.DESTROYED) <= 0) {
            this.f764f.mo16729c(this);
            C5729a.m12452g(this.f765g, null, 1, null);
        }
    }

    @Override // p500e1.p501a.CoroutineScope
    /* JADX INFO: renamed from: h */
    public CoroutineContext mo417h() {
        return this.f765g;
    }
}
