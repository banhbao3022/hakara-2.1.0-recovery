package p007c.p165l.p166h0.p172f0;

import java.util.HashSet;
import p007c.p165l.FacebookSdk;
import p007c.p165l.LoggingBehavior;
import p007c.p165l.p166h0.p173g0.AddressFilterManager;
import p007c.p165l.p178k0.FeatureManager;
import p007c.p165l.p178k0.FetchedAppGateKeepersManager;
import p007c.p165l.p178k0.Validate;

/* JADX INFO: renamed from: c.l.h0.f0.d, reason: use source file name */
/* JADX INFO: compiled from: ModelManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class ModelManager3 implements FeatureManager.b {

    /* JADX INFO: renamed from: c.l.h0.f0.d$a */
    /* JADX INFO: compiled from: ModelManager.java */
    public class a implements Runnable {
        public a(ModelManager3 modelManager3) {
        }

        @Override // java.lang.Runnable
        public void run() {
            AddressFilterManager.f4794a = true;
            HashSet<LoggingBehavior> hashSet = FacebookSdk.f5352a;
            Validate.m2479h();
            AddressFilterManager.f4795b = FetchedAppGateKeepersManager.m2519b("FBSDKFeatureAddressDetectionSample", FacebookSdk.f5354c, false);
        }
    }

    @Override // p007c.p165l.p178k0.FeatureManager.b
    /* JADX INFO: renamed from: a */
    public void mo2314a(boolean z) {
        if (z) {
            ModelManager4.f4791a.get("DATA_DETECTION_ADDRESS").m2331a(new a(this));
        }
    }
}
