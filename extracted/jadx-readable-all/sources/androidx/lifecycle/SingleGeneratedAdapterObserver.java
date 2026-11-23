package androidx.lifecycle;

import p636z0.p759s.GeneratedAdapter;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public class SingleGeneratedAdapterObserver implements LifecycleEventObserver {

    /* JADX INFO: renamed from: f */
    public final GeneratedAdapter f792f;

    public SingleGeneratedAdapterObserver(GeneratedAdapter generatedAdapter) {
        this.f792f = generatedAdapter;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: c */
    public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
        this.f792f.m16726a(lifecycleOwner, aVar, false, null);
        this.f792f.m16726a(lifecycleOwner, aVar, true, null);
    }
}
