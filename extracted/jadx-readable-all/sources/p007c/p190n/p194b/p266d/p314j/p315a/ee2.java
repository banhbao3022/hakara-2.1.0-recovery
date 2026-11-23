package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ee2 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: f */
    public final Application f13572f;

    /* JADX INFO: renamed from: g */
    public final WeakReference<Application.ActivityLifecycleCallbacks> f13573g;

    /* JADX INFO: renamed from: h */
    public boolean f13574h = false;

    public ee2(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f13573g = new WeakReference<>(activityLifecycleCallbacks);
        this.f13572f = application;
    }

    /* JADX INFO: renamed from: a */
    public final void m6631a(de2 de2Var) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f13573g.get();
            if (activityLifecycleCallbacks != null) {
                de2Var.mo5740a(activityLifecycleCallbacks);
            } else {
                if (this.f13574h) {
                    return;
                }
                this.f13572f.unregisterActivityLifecycleCallbacks(this);
                this.f13574h = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m6631a(new wd2(activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m6631a(new ce2(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m6631a(new zd2(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m6631a(new yd2(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m6631a(new be2(activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m6631a(new xd2(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m6631a(new ae2(activity));
    }
}
