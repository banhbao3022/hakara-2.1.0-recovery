package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.app.Application;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class tp2 implements up2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f19952a;

    public tp2(Activity activity) {
        this.f19952a = activity;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.up2
    /* JADX INFO: renamed from: a */
    public final void mo7918a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.f19952a);
    }
}
