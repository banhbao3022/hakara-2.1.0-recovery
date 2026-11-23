package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.OneTimeWorkRequest;
import p636z0.p709j0.p710y.WorkManagerImpl;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f1396a = Logger9.m15886e("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Logger9.m15885c().mo15887a(f1396a, "Requesting diagnostics", new Throwable[0]);
        try {
            WorkManagerImpl.m15914b(context).m15893a(new OneTimeWorkRequest.a(DiagnosticsWorker.class).m15895a());
        } catch (IllegalStateException e) {
            Logger9.m15885c().mo15888b(f1396a, "WorkManager is not initialized", e);
        }
    }
}
