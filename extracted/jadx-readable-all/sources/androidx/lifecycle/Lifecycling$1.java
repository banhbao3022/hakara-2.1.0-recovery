package androidx.lifecycle;

import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public class Lifecycling$1 implements GenericLifecycleObserver {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LifecycleEventObserver f766f;

    public Lifecycling$1(LifecycleEventObserver lifecycleEventObserver) {
        this.f766f = lifecycleEventObserver;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: c */
    public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
        this.f766f.mo130c(lifecycleOwner, aVar);
    }
}
