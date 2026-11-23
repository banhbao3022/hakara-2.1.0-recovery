package p636z0.p709j0.p710y.p715q.p717f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;

/* JADX INFO: renamed from: z0.j0.y.q.f.c, reason: use source file name */
/* JADX INFO: compiled from: BroadcastReceiverConstraintTracker.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class BroadcastReceiverConstraintTracker<T> extends ConstraintTracker<T> {

    /* JADX INFO: renamed from: g */
    public static final String f37459g = Logger9.m15886e("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: h */
    public final BroadcastReceiver f37460h;

    /* JADX INFO: renamed from: z0.j0.y.q.f.c$a */
    /* JADX INFO: compiled from: BroadcastReceiverConstraintTracker.java */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                BroadcastReceiverConstraintTracker.this.mo15959g(context, intent);
            }
        }
    }

    public BroadcastReceiverConstraintTracker(Context context, TaskExecutor2 taskExecutor2) {
        super(context, taskExecutor2);
        this.f37460h = new a();
    }

    @Override // p636z0.p709j0.p710y.p715q.p717f.ConstraintTracker
    /* JADX INFO: renamed from: d */
    public void mo15960d() {
        Logger9.m15885c().mo15887a(f37459g, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f37464c.registerReceiver(this.f37460h, mo15958f());
    }

    @Override // p636z0.p709j0.p710y.p715q.p717f.ConstraintTracker
    /* JADX INFO: renamed from: e */
    public void mo15961e() {
        Logger9.m15885c().mo15887a(f37459g, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f37464c.unregisterReceiver(this.f37460h);
    }

    /* JADX INFO: renamed from: f */
    public abstract IntentFilter mo15958f();

    /* JADX INFO: renamed from: g */
    public abstract void mo15959g(Context context, Intent intent);
}
