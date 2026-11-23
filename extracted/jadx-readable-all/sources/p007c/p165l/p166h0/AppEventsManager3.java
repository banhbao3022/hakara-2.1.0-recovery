package p007c.p165l.p166h0;

import java.util.HashSet;
import java.util.concurrent.ConcurrentMap;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.p172f0.Model2;
import p007c.p165l.p166h0.p172f0.ModelManager;
import p007c.p165l.p166h0.p172f0.ModelManager4;
import p007c.p165l.p178k0.FeatureManager;
import p007c.p165l.p178k0.Utility;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.s, reason: use source file name */
/* JADX INFO: compiled from: AppEventsManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class AppEventsManager3 implements FeatureManager.b {
    @Override // p007c.p165l.p178k0.FeatureManager.b
    /* JADX INFO: renamed from: a */
    public void mo2314a(boolean z) {
        if (z) {
            ConcurrentMap<String, Model2> concurrentMap = ModelManager4.f4791a;
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            ModelManager4.f4792b = FacebookSdk.f5360i.getSharedPreferences("com.facebook.internal.MODEL_STORE", 0);
            Utility.m2438K(new ModelManager());
        }
    }
}
