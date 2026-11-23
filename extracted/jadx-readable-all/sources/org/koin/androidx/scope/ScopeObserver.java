package org.koin.androidx.scope;

import p477d1.p493x.p495c.Intrinsics2;
import p526i1.p536d.p543c.Koin;
import p526i1.p536d.p543c.KoinComponent;
import p526i1.p536d.p543c.p544g.KoinContext;
import p526i1.p536d.p543c.p544g.KoinContextHandler;
import p526i1.p536d.p543c.p553p.Scope2;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleObserver;
import p636z0.p759s.OnLifecycleEvent;

/* JADX INFO: compiled from: ScopeObserver.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ScopeObserver implements LifecycleObserver, KoinComponent {

    /* JADX INFO: renamed from: f */
    public final Lifecycle3.a f34075f;

    /* JADX INFO: renamed from: g */
    public final Object f34076g;

    /* JADX INFO: renamed from: h */
    public final Scope2 f34077h;

    public ScopeObserver(Lifecycle3.a aVar, Object obj, Scope2 scope2) {
        Intrinsics2.m13090f(aVar, "event");
        Intrinsics2.m13090f(obj, "target");
        Intrinsics2.m13090f(scope2, "scope");
        this.f34075f = aVar;
        this.f34076g = obj;
        this.f34077h = scope2;
    }

    @Override // p526i1.p536d.p543c.KoinComponent
    /* JADX INFO: renamed from: e */
    public Koin mo13844e() {
        KoinContext koinContext = KoinContextHandler.f30896a;
        if (koinContext != null) {
            return koinContext.get();
        }
        throw new IllegalStateException("No Koin Context configured. Please use startKoin or koinApplication DSL. ".toString());
    }

    @OnLifecycleEvent(Lifecycle3.a.ON_DESTROY)
    public final void onDestroy() {
        if (this.f34075f == Lifecycle3.a.ON_DESTROY) {
            this.f34077h.f30947g.f30887b.m13850a(this.f34076g + " received ON_DESTROY");
            this.f34077h.m13862b();
        }
    }

    @OnLifecycleEvent(Lifecycle3.a.ON_STOP)
    public final void onStop() {
        if (this.f34075f == Lifecycle3.a.ON_STOP) {
            this.f34077h.f30947g.f30887b.m13850a(this.f34076g + " received ON_STOP");
            this.f34077h.m13862b();
        }
    }
}
