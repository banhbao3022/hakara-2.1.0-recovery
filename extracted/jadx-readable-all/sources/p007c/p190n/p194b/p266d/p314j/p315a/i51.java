package p007c.p190n.p194b.p266d.p314j.p315a;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;
import p007c.p190n.p194b.p266d.p267a.p282z.C2330u;
import p007c.p190n.p194b.p266d.p267a.p282z.p284b.C2267h1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class i51 implements ha1<Bundle> {

    /* JADX INFO: renamed from: a */
    public final Context f15095a;

    /* JADX INFO: renamed from: b */
    public final jw2 f15096b;

    /* JADX INFO: renamed from: c */
    public final List<Parcelable> f15097c;

    public i51(Context context, jw2 jw2Var, List<Parcelable> list) {
        this.f15095a = context;
        this.f15096b = jw2Var;
        this.f15097c = list;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ha1
    /* JADX INFO: renamed from: d */
    public final void mo5696d(Bundle bundle) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        Bundle bundle2 = bundle;
        if (C3497s4.f19461a.m6603d().booleanValue()) {
            Bundle bundle3 = new Bundle();
            C2267h1 c2267h1 = C2330u.f10884a.f10889d;
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.f15095a.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && (componentName = runningTaskInfo.topActivity) != null) {
                    className = componentName.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle3.putString("activity", className);
            Bundle bundle4 = new Bundle();
            bundle4.putInt("width", this.f15096b.f15839j);
            bundle4.putInt("height", this.f15096b.f15836g);
            bundle3.putBundle("size", bundle4);
            if (this.f15097c.size() > 0) {
                List<Parcelable> list = this.f15097c;
                bundle3.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            bundle2.putBundle("view_hierarchy", bundle3);
        }
    }
}
