package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class vp2 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: f */
    public final Application f20906f;

    /* JADX INFO: renamed from: g */
    public final WeakReference<Application.ActivityLifecycleCallbacks> f20907g;

    /* JADX INFO: renamed from: h */
    public boolean f20908h = false;

    public vp2(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f20907g = new WeakReference<>(activityLifecycleCallbacks);
        this.f20906f = application;
    }

    /* JADX INFO: renamed from: a */
    public final void m8584a(up2 up2Var) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f20907g.get();
            if (activityLifecycleCallbacks != null) {
                up2Var.mo7918a(activityLifecycleCallbacks);
            } else {
                if (this.f20908h) {
                    return;
                }
                this.f20906f.unregisterActivityLifecycleCallbacks(this);
                this.f20908h = true;
            }
        } catch (Exception e) {
            C2622l.m5438t3("Error while dispatching lifecycle callback.", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        m8584a(new np2(activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        m8584a(new tp2(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m8584a(new qp2(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m8584a(new pp2(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m8584a(new sp2(activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m8584a(new op2(activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        m8584a(new rp2(activity));
    }
}
