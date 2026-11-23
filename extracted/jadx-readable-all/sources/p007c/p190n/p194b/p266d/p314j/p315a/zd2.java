package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zd2 implements de2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f22244a;

    public zd2(Activity activity) {
        this.f22244a = activity;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.de2
    /* JADX INFO: renamed from: a */
    public final void mo5740a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.f22244a);
    }
}
