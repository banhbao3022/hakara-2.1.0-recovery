package p636z0.p759s;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: z0.s.l, reason: use source file name */
/* JADX INFO: compiled from: LifecycleDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
public class LifecycleDispatcher {

    /* JADX INFO: renamed from: a */
    public static AtomicBoolean f38703a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: z0.s.l$a */
    /* JADX INFO: compiled from: LifecycleDispatcher.java */
    public static class a extends EmptyActivityLifecycleCallbacks {
        @Override // p636z0.p759s.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            ReportFragment.m16746c(activity);
        }

        @Override // p636z0.p759s.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // p636z0.p759s.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }
}
