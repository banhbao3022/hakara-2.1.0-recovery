package androidx.lifecycle;

import p636z0.p759s.ClassesInfoCache;
import p636z0.p759s.Lifecycle3;
import p636z0.p759s.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements LifecycleEventObserver {

    /* JADX INFO: renamed from: f */
    public final Object f785f;

    /* JADX INFO: renamed from: g */
    public final ClassesInfoCache.a f786g;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f785f = obj;
        this.f786g = ClassesInfoCache.f38681a.m16719b(obj.getClass());
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    /* JADX INFO: renamed from: c */
    public void mo130c(LifecycleOwner lifecycleOwner, Lifecycle3.a aVar) {
        ClassesInfoCache.a aVar2 = this.f786g;
        Object obj = this.f785f;
        ClassesInfoCache.a.m16721a(aVar2.f38684a.get(aVar), lifecycleOwner, aVar, obj);
        ClassesInfoCache.a.m16721a(aVar2.f38684a.get(Lifecycle3.a.ON_ANY), lifecycleOwner, aVar, obj);
    }
}
