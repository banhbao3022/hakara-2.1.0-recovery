package p007c.p190n.p194b.p266d.p327k.p329b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: renamed from: c.n.b.d.k.b.a7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(14)
public final class C4453a7 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4500e6 f23715f;

    public C4453a7(C4500e6 c4500e6, RunnableC4512f6 runnableC4512f6) {
        this.f23715f = c4500e6;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            try {
                this.f23715f.mo10684l().f24426n.m10811a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent == null) {
                    return;
                }
                Uri data = intent.getData();
                if (data != null && data.isHierarchical()) {
                    this.f23715f.m10817f();
                    this.f23715f.mo10686n().m10758v(new RunnableC4501e7(this, bundle == null, data, C4723x9.m10855V(intent) ? "gs" : "auto", data.getQueryParameter("referrer")));
                    return;
                }
                return;
            } catch (Exception e) {
                this.f23715f.mo10684l().f24418f.m10812b("Throwable caught in onActivityCreated", e);
                return;
            }
        } finally {
            this.f23715f.m10386q().m10629y(activity, bundle);
        }
        this.f23715f.m10386q().m10629y(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        C4573k7 c4573k7M10386q = this.f23715f.m10386q();
        synchronized (c4573k7M10386q.f24074l) {
            if (activity == c4573k7M10386q.f24069g) {
                c4573k7M10386q.f24069g = null;
            }
        }
        if (c4573k7M10386q.f24476a.f24534h.m10428z().booleanValue()) {
            c4573k7M10386q.f24068f.remove(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        C4573k7 c4573k7M10386q = this.f23715f.m10386q();
        if (c4573k7M10386q.f24476a.f24534h.m10417k(C4647r.f24380v0)) {
            synchronized (c4573k7M10386q.f24074l) {
                c4573k7M10386q.f24073k = false;
                c4573k7M10386q.f24070h = true;
            }
        }
        long jMo5621a = c4573k7M10386q.f24476a.f24541o.mo5621a();
        if (!c4573k7M10386q.f24476a.f24534h.m10417k(C4647r.f24378u0) || c4573k7M10386q.f24476a.f24534h.m10428z().booleanValue()) {
            C4585l7 c4585l7M10627E = c4573k7M10386q.m10627E(activity);
            c4573k7M10386q.f24066d = c4573k7M10386q.f24065c;
            c4573k7M10386q.f24065c = null;
            c4573k7M10386q.mo10686n().m10758v(new RunnableC4655r7(c4573k7M10386q, c4585l7M10627E, jMo5621a));
        } else {
            c4573k7M10386q.f24065c = null;
            c4573k7M10386q.mo10686n().m10758v(new RunnableC4621o7(c4573k7M10386q, jMo5621a));
        }
        C4744z8 c4744z8M10388s = this.f23715f.m10388s();
        c4744z8M10388s.mo10686n().m10758v(new RunnableC4467b9(c4744z8M10388s, c4744z8M10388s.f24476a.f24541o.mo5621a()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C4744z8 c4744z8M10388s = this.f23715f.m10388s();
        c4744z8M10388s.mo10686n().m10758v(new RunnableC4733y8(c4744z8M10388s, c4744z8M10388s.f24476a.f24541o.mo5621a()));
        C4573k7 c4573k7M10386q = this.f23715f.m10386q();
        if (c4573k7M10386q.f24476a.f24534h.m10417k(C4647r.f24380v0)) {
            synchronized (c4573k7M10386q.f24074l) {
                c4573k7M10386q.f24073k = true;
                if (activity != c4573k7M10386q.f24069g) {
                    synchronized (c4573k7M10386q.f24074l) {
                        c4573k7M10386q.f24069g = activity;
                        c4573k7M10386q.f24070h = false;
                    }
                    if (c4573k7M10386q.f24476a.f24534h.m10417k(C4647r.f24378u0) && c4573k7M10386q.f24476a.f24534h.m10428z().booleanValue()) {
                        c4573k7M10386q.f24071i = null;
                        c4573k7M10386q.mo10686n().m10758v(new RunnableC4644q7(c4573k7M10386q));
                    }
                }
            }
        }
        if (c4573k7M10386q.f24476a.f24534h.m10417k(C4647r.f24378u0) && !c4573k7M10386q.f24476a.f24534h.m10428z().booleanValue()) {
            c4573k7M10386q.f24065c = c4573k7M10386q.f24071i;
            c4573k7M10386q.mo10686n().m10758v(new RunnableC4633p7(c4573k7M10386q));
        } else {
            c4573k7M10386q.m10630z(activity, c4573k7M10386q.m10627E(activity), false);
            C4445a c4445aM10382h = c4573k7M10386q.m10382h();
            c4445aM10382h.mo10686n().m10758v(new RunnableC4473c3(c4445aM10382h, c4445aM10382h.f24476a.f24541o.mo5621a()));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C4585l7 c4585l7;
        C4573k7 c4573k7M10386q = this.f23715f.m10386q();
        if (!c4573k7M10386q.f24476a.f24534h.m10428z().booleanValue() || bundle == null || (c4585l7 = c4573k7M10386q.f24068f.get(activity)) == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putLong("id", c4585l7.f24123c);
        bundle2.putString("name", c4585l7.f24121a);
        bundle2.putString("referrer_name", c4585l7.f24122b);
        bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
