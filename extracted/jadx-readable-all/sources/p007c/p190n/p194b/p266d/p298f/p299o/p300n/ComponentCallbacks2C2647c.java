package p007c.p190n.p194b.p266d.p298f.p299o.p300n;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: c.n.b.d.f.o.n.c */
/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C2647c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: f */
    public static final ComponentCallbacks2C2647c f11638f = new ComponentCallbacks2C2647c();

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f11639g = new AtomicBoolean();

    /* JADX INFO: renamed from: h */
    public final AtomicBoolean f11640h = new AtomicBoolean();

    /* JADX INFO: renamed from: i */
    public final ArrayList<a> f11641i = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    public boolean f11642j = false;

    /* JADX INFO: renamed from: c.n.b.d.f.o.n.c$a */
    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo5503a(boolean z);
    }

    /* JADX INFO: renamed from: a */
    public static void m5501a(@RecentlyNonNull Application application) {
        ComponentCallbacks2C2647c componentCallbacks2C2647c = f11638f;
        synchronized (componentCallbacks2C2647c) {
            if (!componentCallbacks2C2647c.f11642j) {
                application.registerActivityLifecycleCallbacks(componentCallbacks2C2647c);
                application.registerComponentCallbacks(componentCallbacks2C2647c);
                componentCallbacks2C2647c.f11642j = true;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5502b(boolean z) {
        synchronized (f11638f) {
            Iterator<a> it = this.f11641i.iterator();
            while (it.hasNext()) {
                it.next().mo5503a(z);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@RecentlyNonNull Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f11639g.compareAndSet(true, false);
        this.f11640h.set(true);
        if (zCompareAndSet) {
            m5502b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@RecentlyNonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@RecentlyNonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@RecentlyNonNull Activity activity) {
        boolean zCompareAndSet = this.f11639g.compareAndSet(true, false);
        this.f11640h.set(true);
        if (zCompareAndSet) {
            m5502b(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@RecentlyNonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@RecentlyNonNull Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@RecentlyNonNull Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f11639g.compareAndSet(false, true)) {
            this.f11640h.set(true);
            m5502b(true);
        }
    }
}
