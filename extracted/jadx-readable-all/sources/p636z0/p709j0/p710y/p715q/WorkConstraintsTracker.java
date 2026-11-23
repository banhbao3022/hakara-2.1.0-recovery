package p636z0.p709j0.p710y.p715q;

import android.content.Context;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.p715q.p716e.BatteryChargingController;
import p636z0.p709j0.p710y.p715q.p716e.BatteryNotLowController;
import p636z0.p709j0.p710y.p715q.p716e.ConstraintController;
import p636z0.p709j0.p710y.p715q.p716e.NetworkConnectedController;
import p636z0.p709j0.p710y.p715q.p716e.NetworkMeteredController;
import p636z0.p709j0.p710y.p715q.p716e.NetworkNotRoamingController;
import p636z0.p709j0.p710y.p715q.p716e.NetworkUnmeteredController;
import p636z0.p709j0.p710y.p715q.p716e.StorageNotLowController;
import p636z0.p709j0.p710y.p719s.WorkSpec;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;

/* JADX INFO: renamed from: z0.j0.y.q.d, reason: use source file name */
/* JADX INFO: compiled from: WorkConstraintsTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class WorkConstraintsTracker implements ConstraintController.a {

    /* JADX INFO: renamed from: a */
    public static final String f37447a = Logger9.m15886e("WorkConstraintsTracker");

    /* JADX INFO: renamed from: b */
    public final WorkConstraintsCallback f37448b;

    /* JADX INFO: renamed from: c */
    public final ConstraintController<?>[] f37449c;

    /* JADX INFO: renamed from: d */
    public final Object f37450d;

    public WorkConstraintsTracker(Context context, TaskExecutor2 taskExecutor2, WorkConstraintsCallback workConstraintsCallback) {
        Context applicationContext = context.getApplicationContext();
        this.f37448b = workConstraintsCallback;
        this.f37449c = new ConstraintController[]{new BatteryChargingController(applicationContext, taskExecutor2), new BatteryNotLowController(applicationContext, taskExecutor2), new StorageNotLowController(applicationContext, taskExecutor2), new NetworkConnectedController(applicationContext, taskExecutor2), new NetworkUnmeteredController(applicationContext, taskExecutor2), new NetworkNotRoamingController(applicationContext, taskExecutor2), new NetworkMeteredController(applicationContext, taskExecutor2)};
        this.f37450d = new Object();
    }

    /* JADX INFO: renamed from: a */
    public boolean m15950a(String str) {
        synchronized (this.f37450d) {
            for (ConstraintController<?> constraintController : this.f37449c) {
                Object obj = constraintController.f37452b;
                if (obj != null && constraintController.mo15954c(obj) && constraintController.f37451a.contains(str)) {
                    Logger9.m15885c().mo15887a(f37447a, String.format("Work %s constrained by %s", str, constraintController.getClass().getSimpleName()), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: b */
    public void m15951b(Iterable<WorkSpec> iterable) {
        synchronized (this.f37450d) {
            for (ConstraintController<?> constraintController : this.f37449c) {
                if (constraintController.f37454d != null) {
                    constraintController.f37454d = null;
                    constraintController.m15956e(null, constraintController.f37452b);
                }
            }
            for (ConstraintController<?> constraintController2 : this.f37449c) {
                constraintController2.m15955d(iterable);
            }
            for (ConstraintController<?> constraintController3 : this.f37449c) {
                if (constraintController3.f37454d != this) {
                    constraintController3.f37454d = this;
                    constraintController3.m15956e(this, constraintController3.f37452b);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m15952c() {
        synchronized (this.f37450d) {
            for (ConstraintController<?> constraintController : this.f37449c) {
                if (!constraintController.f37451a.isEmpty()) {
                    constraintController.f37451a.clear();
                    constraintController.f37453c.m15962b(constraintController);
                }
            }
        }
    }
}
