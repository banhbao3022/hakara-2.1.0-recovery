package p007c.p165l.p166h0.p172f0;

import java.util.concurrent.atomic.AtomicBoolean;
import p007c.p165l.p166h0.p174h0.SuggestedEventsManager;
import p007c.p165l.p178k0.FeatureManager;

/* JADX INFO: renamed from: c.l.h0.f0.c, reason: use source file name */
/* JADX INFO: compiled from: ModelManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class ModelManager2 implements FeatureManager.b {

    /* JADX INFO: renamed from: c.l.h0.f0.c$a */
    /* JADX INFO: compiled from: ModelManager.java */
    public class a implements Runnable {
        public a(ModelManager2 modelManager2) {
        }

        @Override // java.lang.Runnable
        public void run() {
            AtomicBoolean atomicBoolean = SuggestedEventsManager.f4811a;
            synchronized (SuggestedEventsManager.class) {
                AtomicBoolean atomicBoolean2 = SuggestedEventsManager.f4811a;
                if (atomicBoolean2.get()) {
                    return;
                }
                atomicBoolean2.set(true);
                SuggestedEventsManager.m2350a();
            }
        }
    }

    @Override // p007c.p165l.p178k0.FeatureManager.b
    /* JADX INFO: renamed from: a */
    public void mo2314a(boolean z) {
        if (z) {
            ModelManager4.f4791a.get("SUGGEST_EVENT").m2331a(new a(this));
        }
    }
}
