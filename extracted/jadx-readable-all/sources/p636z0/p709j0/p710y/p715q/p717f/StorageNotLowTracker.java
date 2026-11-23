package p636z0.p709j0.p710y.p715q.p717f;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;

/* JADX INFO: renamed from: z0.j0.y.q.f.f, reason: use source file name */
/* JADX INFO: compiled from: StorageNotLowTracker.java */
/* JADX INFO: loaded from: classes.dex */
public class StorageNotLowTracker extends BroadcastReceiverConstraintTracker<Boolean> {

    /* JADX INFO: renamed from: i */
    public static final String f37476i = Logger9.m15886e("StorageNotLowTracker");

    public StorageNotLowTracker(Context context, TaskExecutor2 taskExecutor2) {
        super(context, taskExecutor2);
    }

    @Override // p636z0.p709j0.p710y.p715q.p717f.ConstraintTracker
    /* JADX INFO: renamed from: a */
    public Object mo15957a() {
        Context context = this.f37464c;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        Intent intentRegisterReceiver = context.registerReceiver(null, intentFilter);
        if (intentRegisterReceiver == null || intentRegisterReceiver.getAction() == null) {
            return Boolean.TRUE;
        }
        String action = intentRegisterReceiver.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            return Boolean.FALSE;
        }
        if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // p636z0.p709j0.p710y.p715q.p717f.BroadcastReceiverConstraintTracker
    /* JADX INFO: renamed from: f */
    public IntentFilter mo15958f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // p636z0.p709j0.p710y.p715q.p717f.BroadcastReceiverConstraintTracker
    /* JADX INFO: renamed from: g */
    public void mo15959g(Context context, Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        Logger9.m15885c().mo15887a(f37476i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.hashCode();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            m15963c(Boolean.FALSE);
        } else if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            m15963c(Boolean.TRUE);
        }
    }
}
