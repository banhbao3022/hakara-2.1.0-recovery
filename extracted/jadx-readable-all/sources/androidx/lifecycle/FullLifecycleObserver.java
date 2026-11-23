package androidx.lifecycle;

import p636z0.p759s.LifecycleObserver;
import p636z0.p759s.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public interface FullLifecycleObserver extends LifecycleObserver {
    /* JADX INFO: renamed from: a */
    void m414a(LifecycleOwner lifecycleOwner);

    /* JADX INFO: renamed from: b */
    void m415b(LifecycleOwner lifecycleOwner);

    /* JADX INFO: renamed from: d */
    void m416d(LifecycleOwner lifecycleOwner);

    void onDestroy(LifecycleOwner lifecycleOwner);

    void onStart(LifecycleOwner lifecycleOwner);

    void onStop(LifecycleOwner lifecycleOwner);
}
