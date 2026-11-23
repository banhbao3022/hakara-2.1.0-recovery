package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.p711p.p713b.CommandHandler;

/* JADX INFO: loaded from: classes.dex */
public abstract class ConstraintProxy extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f1384a = Logger9.m15886e("ConstraintProxy");

    public static class BatteryChargingProxy extends ConstraintProxy {
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
    }

    public static class NetworkStateProxy extends ConstraintProxy {
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Logger9.m15885c().mo15887a(f1384a, String.format("onReceive : %s", intent), new Throwable[0]);
        context.startService(CommandHandler.m15932a(context));
    }
}
