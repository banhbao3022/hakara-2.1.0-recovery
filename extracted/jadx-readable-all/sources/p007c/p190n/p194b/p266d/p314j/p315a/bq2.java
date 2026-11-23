package p007c.p190n.p194b.p266d.p314j.p315a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(14)
public final class bq2 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: f */
    public Activity f12776f;

    /* JADX INFO: renamed from: g */
    public Context f12777g;

    /* JADX INFO: renamed from: m */
    public Runnable f12783m;

    /* JADX INFO: renamed from: o */
    public long f12785o;

    /* JADX INFO: renamed from: h */
    public final Object f12778h = new Object();

    /* JADX INFO: renamed from: i */
    public boolean f12779i = true;

    /* JADX INFO: renamed from: j */
    public boolean f12780j = false;

    /* JADX INFO: renamed from: k */
    public final List<cq2> f12781k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public final List<pq2> f12782l = new ArrayList();

    /* JADX INFO: renamed from: n */
    public boolean f12784n = false;

    /* JADX INFO: renamed from: a */
    public final void m6071a(Activity activity) {
        synchronized (this.f12778h) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.f12776f = activity;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f12778h) {
            try {
                Activity activity2 = this.f12776f;
                if (activity2 != null) {
                    if (activity2.equals(activity)) {
                        this.f12776f = null;
                    }
                    Iterator<pq2> it = this.f12782l.iterator();
                    while (it.hasNext()) {
                        try {
                            if (it.next().zza()) {
                                it.remove();
                            }
                        } catch (Exception e) {
                            C2998en c2998en = C2330u.f10884a.f10893h;
                            C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                            C2622l.m5438t3("", e);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        m6071a(activity);
        synchronized (this.f12778h) {
            try {
                Iterator<pq2> it = this.f12782l.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().m8149a();
                    } catch (Exception e) {
                        C2998en c2998en = C2330u.f10884a.f10893h;
                        C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                        C2622l.m5438t3("", e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f12780j = true;
        Runnable runnable = this.f12783m;
        if (runnable != null) {
            C2267h1.f10713a.removeCallbacks(runnable);
        }
        xr1 xr1Var = C2267h1.f10713a;
        zp2 zp2Var = new zp2(this);
        this.f12783m = zp2Var;
        xr1Var.postDelayed(zp2Var, this.f12785o);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        m6071a(activity);
        this.f12780j = false;
        boolean z = !this.f12779i;
        this.f12779i = true;
        Runnable runnable = this.f12783m;
        if (runnable != null) {
            C2267h1.f10713a.removeCallbacks(runnable);
        }
        synchronized (this.f12778h) {
            try {
                Iterator<pq2> it = this.f12782l.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().m8150b();
                    } catch (Exception e) {
                        C2998en c2998en = C2330u.f10884a.f10893h;
                        C3696xh.m8734c(c2998en.f13616e, c2998en.f13617f).mo8736b(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                        C2622l.m5438t3("", e);
                    }
                }
                if (z) {
                    Iterator<cq2> it2 = this.f12781k.iterator();
                    while (it2.hasNext()) {
                        try {
                            it2.next().mo6222B(true);
                        } catch (Exception e2) {
                            C2622l.m5438t3("", e2);
                        }
                    }
                } else {
                    C2622l.m5318U2("App is still foreground.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        m6071a(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
