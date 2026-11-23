package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class np2 implements up2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f17216a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f17217b;

    public np2(Activity activity, Bundle bundle) {
        this.f17216a = activity;
        this.f17217b = bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.up2
    /* JADX INFO: renamed from: a */
    public final void mo7918a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.f17216a, this.f17217b);
    }
}
