package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.WorkManagerImpl;
import p636z0.p709j0.p710y.p720t.PackageManagerHelper;
import p636z0.p709j0.p710y.p720t.p722t.WorkManagerTaskExecutor;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f1385a = Logger9.m15886e("ConstrntProxyUpdtRecvr");

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    public class RunnableC0228a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ Intent f1386f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Context f1387g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ BroadcastReceiver.PendingResult f1388h;

        public RunnableC0228a(ConstraintProxyUpdateReceiver constraintProxyUpdateReceiver, Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f1386f = intent;
            this.f1387g = context;
            this.f1388h = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f1386f.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f1386f.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f1386f.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f1386f.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                Logger9.m15885c().mo15887a(ConstraintProxyUpdateReceiver.f1385a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                PackageManagerHelper.m16008a(this.f1387g, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                PackageManagerHelper.m16008a(this.f1387g, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                PackageManagerHelper.m16008a(this.f1387g, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                PackageManagerHelper.m16008a(this.f1387g, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f1388h.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            Logger9.m15885c().mo15887a(f1385a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        } else {
            ((WorkManagerTaskExecutor) WorkManagerImpl.m15914b(context).f37343h).f37639a.execute(new RunnableC0228a(this, intent, context, goAsync()));
        }
    }
}
