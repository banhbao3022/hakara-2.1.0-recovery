package p636z0.p759s;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: z0.s.y, reason: use source file name */
/* JADX INFO: compiled from: ReportFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class ReportFragment extends Fragment {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f38728f = 0;

    /* JADX INFO: renamed from: g */
    public a f38729g;

    /* JADX INFO: renamed from: z0.s.y$a */
    /* JADX INFO: compiled from: ReportFragment.java */
    public interface a {
    }

    /* JADX INFO: renamed from: z0.s.y$b */
    /* JADX INFO: compiled from: ReportFragment.java */
    public static class b implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            ReportFragment.m16745a(activity, Lifecycle3.a.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            ReportFragment.m16745a(activity, Lifecycle3.a.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            ReportFragment.m16745a(activity, Lifecycle3.a.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            ReportFragment.m16745a(activity, Lifecycle3.a.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            ReportFragment.m16745a(activity, Lifecycle3.a.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            ReportFragment.m16745a(activity, Lifecycle3.a.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m16745a(Activity activity, Lifecycle3.a aVar) {
        if (activity instanceof LifecycleRegistryOwner) {
            LifecycleRegistry lifecycleRegistryMo124b = ((LifecycleRegistryOwner) activity).mo124b();
            lifecycleRegistryMo124b.m16732e("handleLifecycleEvent");
            lifecycleRegistryMo124b.m16734h(aVar.getTargetState());
        } else if (activity instanceof LifecycleOwner) {
            Lifecycle3 lifecycle3Mo124b = ((LifecycleOwner) activity).mo124b();
            if (lifecycle3Mo124b instanceof LifecycleRegistry) {
                LifecycleRegistry lifecycleRegistry = (LifecycleRegistry) lifecycle3Mo124b;
                lifecycleRegistry.m16732e("handleLifecycleEvent");
                lifecycleRegistry.m16734h(aVar.getTargetState());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m16746c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m16747b(Lifecycle3.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m16745a(getActivity(), aVar);
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m16747b(Lifecycle3.a.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m16747b(Lifecycle3.a.ON_DESTROY);
        this.f38729g = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        m16747b(Lifecycle3.a.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        a aVar = this.f38729g;
        if (aVar != null) {
            ProcessLifecycleOwner.this.m16743a();
        }
        m16747b(Lifecycle3.a.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        a aVar = this.f38729g;
        if (aVar != null) {
            ProcessLifecycleOwner.this.m16744c();
        }
        m16747b(Lifecycle3.a.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        m16747b(Lifecycle3.a.ON_STOP);
    }
}
