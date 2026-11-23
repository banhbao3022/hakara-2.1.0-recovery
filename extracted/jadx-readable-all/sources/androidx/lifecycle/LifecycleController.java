package androidx.lifecycle;

import p007c.p451o.p452a.C5729a;
import p477d1.p493x.p495c.Intrinsics2;
import p500e1.p501a.Job;
import p636z0.p759s.DispatchQueue;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;

/* JADX INFO: compiled from: LifecycleController.kt */
/* JADX INFO: loaded from: classes.dex */
public final class LifecycleController {

    /* JADX INFO: renamed from: a */
    public final LifecycleEventObserver f758a;

    /* JADX INFO: renamed from: b */
    public final Lifecycle3 f759b;

    /* JADX INFO: renamed from: c */
    public final Lifecycle3.b f760c;

    /* JADX INFO: renamed from: d */
    public final DispatchQueue f761d;

    public LifecycleController(Lifecycle3 lifecycle3, Lifecycle3.b bVar, DispatchQueue dispatchQueue, final Job job) {
        Intrinsics2.m13089e(lifecycle3, "lifecycle");
        Intrinsics2.m13089e(bVar, "minState");
        Intrinsics2.m13089e(dispatchQueue, "dispatchQueue");
        Intrinsics2.m13089e(job, "parentJob");
        this.f759b = lifecycle3;
        this.f760c = bVar;
        this.f761d = dispatchQueue;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.LifecycleController$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            /* JADX INFO: renamed from: c */
            public final void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
                Intrinsics2.m13089e(lifecycleOwner, "source");
                Intrinsics2.m13089e(aVar, "<anonymous parameter 1>");
                Lifecycle3 lifecycle3Mo124b = lifecycleOwner.mo124b();
                Intrinsics2.m13088d(lifecycle3Mo124b, "source.lifecycle");
                if (lifecycle3Mo124b.mo16728b() == Lifecycle3.b.DESTROYED) {
                    LifecycleController lifecycleController = this.f762f;
                    C5729a.m12453h(job, null, 1, null);
                    lifecycleController.f759b.mo16729c(lifecycleController.f758a);
                    DispatchQueue dispatchQueue2 = lifecycleController.f761d;
                    dispatchQueue2.f38699b = true;
                    dispatchQueue2.m16724a();
                    return;
                }
                Lifecycle3 lifecycle3Mo124b2 = lifecycleOwner.mo124b();
                Intrinsics2.m13088d(lifecycle3Mo124b2, "source.lifecycle");
                if (lifecycle3Mo124b2.mo16728b().compareTo(this.f762f.f760c) < 0) {
                    this.f762f.f761d.f38698a = true;
                    return;
                }
                DispatchQueue dispatchQueue3 = this.f762f.f761d;
                if (dispatchQueue3.f38698a) {
                    if (!(!dispatchQueue3.f38699b)) {
                        throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
                    }
                    dispatchQueue3.f38698a = false;
                    dispatchQueue3.m16724a();
                }
            }
        };
        this.f758a = lifecycleEventObserver;
        if (lifecycle3.mo16728b() != Lifecycle3.b.DESTROYED) {
            lifecycle3.mo16727a(lifecycleEventObserver);
            return;
        }
        C5729a.m12453h(job, null, 1, null);
        lifecycle3.mo16729c(lifecycleEventObserver);
        dispatchQueue.f38699b = true;
        dispatchQueue.m16724a();
    }
}
