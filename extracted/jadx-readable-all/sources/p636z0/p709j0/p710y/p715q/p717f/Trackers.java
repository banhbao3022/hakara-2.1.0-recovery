package p636z0.p709j0.p710y.p715q.p717f;

import android.content.Context;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;

/* JADX INFO: renamed from: z0.j0.y.q.f.g, reason: use source file name */
/* JADX INFO: compiled from: Trackers.java */
/* JADX INFO: loaded from: classes.dex */
public class Trackers {

    /* JADX INFO: renamed from: a */
    public static Trackers f37477a;

    /* JADX INFO: renamed from: b */
    public BatteryChargingTracker f37478b;

    /* JADX INFO: renamed from: c */
    public BatteryNotLowTracker f37479c;

    /* JADX INFO: renamed from: d */
    public NetworkStateTracker f37480d;

    /* JADX INFO: renamed from: e */
    public StorageNotLowTracker f37481e;

    public Trackers(Context context, TaskExecutor2 taskExecutor2) {
        Context applicationContext = context.getApplicationContext();
        this.f37478b = new BatteryChargingTracker(applicationContext, taskExecutor2);
        this.f37479c = new BatteryNotLowTracker(applicationContext, taskExecutor2);
        this.f37480d = new NetworkStateTracker(applicationContext, taskExecutor2);
        this.f37481e = new StorageNotLowTracker(applicationContext, taskExecutor2);
    }

    /* JADX INFO: renamed from: a */
    public static synchronized Trackers m15966a(Context context, TaskExecutor2 taskExecutor2) {
        if (f37477a == null) {
            f37477a = new Trackers(context, taskExecutor2);
        }
        return f37477a;
    }
}
