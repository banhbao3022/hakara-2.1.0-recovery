package p636z0.p709j0.p710y.p715q.p717f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;

/* JADX INFO: renamed from: z0.j0.y.q.f.b, reason: use source file name */
/* JADX INFO: compiled from: BatteryNotLowTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class BatteryNotLowTracker extends BroadcastReceiverConstraintTracker<Boolean> {

    /* JADX INFO: renamed from: i */
    public static final String f37458i = Logger9.m15886e("BatteryNotLowTracker");

    public BatteryNotLowTracker(Context context, TaskExecutor2 taskExecutor2) {
        super(context, taskExecutor2);
    }

    @Override // p636z0.p709j0.p710y.p715q.p717f.ConstraintTracker
    /* JADX INFO: renamed from: a */
    public Object mo15957a() {
        Intent intentRegisterReceiver = this.f37464c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return Boolean.valueOf(intentRegisterReceiver.getIntExtra("status", -1) == 1 || ((float) intentRegisterReceiver.getIntExtra("level", -1)) / ((float) intentRegisterReceiver.getIntExtra("scale", -1)) > 0.15f);
        }
        Logger9.m15885c().mo15888b(f37458i, "getInitialState - null intent received", new Throwable[0]);
        return null;
    }

    @Override // p636z0.p709j0.p710y.p715q.p717f.BroadcastReceiverConstraintTracker
    /* JADX INFO: renamed from: f */
    public IntentFilter mo15958f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // p636z0.p709j0.p710y.p715q.p717f.BroadcastReceiverConstraintTracker
    /* JADX INFO: renamed from: g */
    public void mo15959g(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        Logger9.m15885c().mo15887a(f37458i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            m15963c(Boolean.TRUE);
        } else if (action.equals("android.intent.action.BATTERY_LOW")) {
            m15963c(Boolean.FALSE);
        }
    }
}
