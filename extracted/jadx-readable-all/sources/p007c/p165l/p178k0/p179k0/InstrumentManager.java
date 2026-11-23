package p007c.p165l.p178k0.p179k0;

import android.util.Log;
import p007c.p165l.FacebookSdk;
import p007c.p165l.p178k0.FeatureManager;
import p007c.p165l.p178k0.p179k0.p180f.CrashHandler;

/* JADX INFO: renamed from: c.l.k0.k0.b, reason: use source file name */
/* JADX INFO: compiled from: InstrumentManager.java */
/* JADX INFO: loaded from: classes.dex */
public final class InstrumentManager implements FeatureManager.b {
    @Override // p007c.p165l.p178k0.FeatureManager.b
    /* JADX INFO: renamed from: a */
    public void mo2314a(boolean z) {
        if (z) {
            String str = CrashHandler.f4972a;
            synchronized (CrashHandler.class) {
                if (FacebookSdk.m2659a()) {
                    CrashHandler.m2509a();
                }
                if (CrashHandler.f4973b != null) {
                    Log.w(CrashHandler.f4972a, "Already enabled!");
                    return;
                }
                CrashHandler crashHandler = new CrashHandler(Thread.getDefaultUncaughtExceptionHandler());
                CrashHandler.f4973b = crashHandler;
                Thread.setDefaultUncaughtExceptionHandler(crashHandler);
            }
        }
    }
}
