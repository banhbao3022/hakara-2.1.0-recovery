package p636z0.p709j0.p710y.p715q.p717f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;

/* JADX INFO: renamed from: z0.j0.y.q.f.a, reason: use source file name */
/* JADX INFO: compiled from: BatteryChargingTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class BatteryChargingTracker extends BroadcastReceiverConstraintTracker<Boolean> {

    /* JADX INFO: renamed from: i */
    public static final String f37457i = Logger9.m15886e("BatteryChrgTracker");

    public BatteryChargingTracker(Context context, TaskExecutor2 taskExecutor2) {
        super(context, taskExecutor2);
    }

    @Override // p636z0.p709j0.p710y.p715q.p717f.ConstraintTracker
    /* JADX INFO: renamed from: a */
    public Object mo15957a() {
        int intExtra;
        Intent intentRegisterReceiver = this.f37464c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (intentRegisterReceiver == null) {
            Logger9.m15885c().mo15888b(f37457i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        if (Build.VERSION.SDK_INT < 23 ? intentRegisterReceiver.getIntExtra("plugged", 0) != 0 : !((intExtra = intentRegisterReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // p636z0.p709j0.p710y.p715q.p717f.BroadcastReceiverConstraintTracker
    /* JADX INFO: renamed from: f */
    public IntentFilter mo15958f() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0051  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p636z0.p709j0.p710y.p715q.p717f.BroadcastReceiverConstraintTracker
    /* JADX INFO: renamed from: g */
    public void mo15959g(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        byte b = 0;
        Logger9.m15885c().mo15887a(f37457i, String.format("Received %s", action), new Throwable[0]);
        switch (action.hashCode()) {
            case -1886648615:
                if (!action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                    b = -1;
                }
                break;
            case -54942926:
                if (!action.equals("android.os.action.DISCHARGING")) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case 948344062:
                if (!action.equals("android.os.action.CHARGING")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 1019184907:
                if (!action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            m15963c(Boolean.FALSE);
            return;
        }
        if (b == 1) {
            m15963c(Boolean.FALSE);
        } else if (b == 2) {
            m15963c(Boolean.TRUE);
        } else {
            if (b != 3) {
                return;
            }
            m15963c(Boolean.TRUE);
        }
    }
}
