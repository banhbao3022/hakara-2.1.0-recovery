package p007c.p165l.p166h0;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.p167b0.MetadataIndexer;
import p007c.p165l.p166h0.p167b0.MetadataIndexer2;
import p007c.p165l.p178k0.FeatureManager;

/* JADX INFO: renamed from: c.l.h0.q, reason: use source file name */
/* JADX INFO: compiled from: AppEventsManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class AppEventsManager implements FeatureManager.b {
    @Override // p007c.p165l.p178k0.FeatureManager.b
    /* JADX INFO: renamed from: a */
    public void mo2314a(boolean z) {
        if (z) {
            AtomicBoolean atomicBoolean = MetadataIndexer2.f4594a;
            try {
                FacebookSdk.m2660b().execute(new MetadataIndexer());
            } catch (Exception unused) {
                HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            }
        }
    }
}
