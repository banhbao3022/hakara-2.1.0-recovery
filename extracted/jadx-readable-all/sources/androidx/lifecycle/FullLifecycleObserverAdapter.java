package androidx.lifecycle;

import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements LifecycleEventObserver {

    /* JADX INFO: renamed from: f */
    public final FullLifecycleObserver f756f;

    /* JADX INFO: renamed from: g */
    public final LifecycleEventObserver f757g;

    public FullLifecycleObserverAdapter(FullLifecycleObserver fullLifecycleObserver, LifecycleEventObserver lifecycleEventObserver) {
        this.f756f = fullLifecycleObserver;
        this.f757g = lifecycleEventObserver;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: c */
    public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
        switch (aVar) {
            case ON_CREATE:
                this.f756f.m415b(lifecycleOwner);
                break;
            case ON_START:
                this.f756f.onStart(lifecycleOwner);
                break;
            case ON_RESUME:
                this.f756f.m414a(lifecycleOwner);
                break;
            case ON_PAUSE:
                this.f756f.m416d(lifecycleOwner);
                break;
            case ON_STOP:
                this.f756f.onStop(lifecycleOwner);
                break;
            case ON_DESTROY:
                this.f756f.onDestroy(lifecycleOwner);
                break;
            case ON_ANY:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        LifecycleEventObserver lifecycleEventObserver = this.f757g;
        if (lifecycleEventObserver != null) {
            lifecycleEventObserver.mo130c(lifecycleOwner, aVar);
        }
    }
}
