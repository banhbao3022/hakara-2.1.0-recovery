package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.Objects;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.WorkManagerImpl;
import p636z0.p709j0.p710y.p711p.p713b.CommandHandler;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f1389a = Logger9.m15886e("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Logger9.m15885c().mo15887a(f1389a, String.format("Received intent %s", intent), new Throwable[0]);
        if (Build.VERSION.SDK_INT < 23) {
            String str = CommandHandler.f37399f;
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_RESCHEDULE");
            context.startService(intent2);
            return;
        }
        try {
            WorkManagerImpl workManagerImplM15914b = WorkManagerImpl.m15914b(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            Objects.requireNonNull(workManagerImplM15914b);
            synchronized (WorkManagerImpl.f37339d) {
                try {
                    workManagerImplM15914b.f37348m = pendingResultGoAsync;
                    if (workManagerImplM15914b.f37347l) {
                        pendingResultGoAsync.finish();
                        workManagerImplM15914b.f37348m = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            Logger9.m15885c().mo15888b(f1389a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
