package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class sp2 implements up2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Activity f19652a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f19653b;

    public sp2(Activity activity, Bundle bundle) {
        this.f19652a = activity;
        this.f19653b = bundle;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.up2
    /* JADX INFO: renamed from: a */
    public final void mo7918a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.f19652a, this.f19653b);
    }
}
