package androidx.lifecycle;

import p636z0.p759s.GeneratedAdapter;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;
import p636z0.p759s.MethodCallsLogger;

/* JADX INFO: loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver {

    /* JADX INFO: renamed from: f */
    public final GeneratedAdapter[] f755f;

    public CompositeGeneratedAdaptersObserver(GeneratedAdapter[] generatedAdapterArr) {
        this.f755f = generatedAdapterArr;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: c */
    public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
        MethodCallsLogger methodCallsLogger = new MethodCallsLogger();
        for (GeneratedAdapter generatedAdapter : this.f755f) {
            generatedAdapter.m16726a(lifecycleOwner, aVar, false, methodCallsLogger);
        }
        for (GeneratedAdapter generatedAdapter2 : this.f755f) {
            generatedAdapter2.m16726a(lifecycleOwner, aVar, true, methodCallsLogger);
        }
    }
}
