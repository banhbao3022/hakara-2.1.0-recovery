package p636z0.p759s;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: z0.s.x, reason: use source file name */
/* JADX INFO: compiled from: ProcessLifecycleOwner.java */
/* JADX INFO: loaded from: classes.dex */
public class ProcessLifecycleOwner2 extends EmptyActivityLifecycleCallbacks {
    public final /* synthetic */ ProcessLifecycleOwner this$0;

    /* JADX INFO: renamed from: z0.s.x$a */
    /* JADX INFO: compiled from: ProcessLifecycleOwner.java */
    public class a extends EmptyActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            ProcessLifecycleOwner2.this.this$0.m16743a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            ProcessLifecycleOwner2.this.this$0.m16744c();
        }
    }

    public ProcessLifecycleOwner2(ProcessLifecycleOwner processLifecycleOwner) {
        this.this$0 = processLifecycleOwner;
    }

    @Override // p636z0.p759s.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = ReportFragment.f38728f;
            ((ReportFragment) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f38729g = this.this$0.f38725n;
        }
    }

    @Override // p636z0.p759s.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.f38719h - 1;
        processLifecycleOwner.f38719h = i;
        if (i == 0) {
            processLifecycleOwner.f38722k.postDelayed(processLifecycleOwner.f38724m, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new a());
    }

    @Override // p636z0.p759s.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ProcessLifecycleOwner processLifecycleOwner = this.this$0;
        int i = processLifecycleOwner.f38718g - 1;
        processLifecycleOwner.f38718g = i;
        if (i == 0 && processLifecycleOwner.f38720i) {
            processLifecycleOwner.f38723l.m16733f(Lifecycle3.a.ON_STOP);
            processLifecycleOwner.f38721j = true;
        }
    }
}
