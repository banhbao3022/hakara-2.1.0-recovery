package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p327k.p329b.C4630p4;
import p007c.p190n.p194b.p266d.p327k.p329b.C4662s3;
import p007c.p190n.p194b.p266d.p327k.p329b.C4707w4;
import p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4663s4;
import p636z0.p757r.p758a.WakefulBroadcastReceiver;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends WakefulBroadcastReceiver implements InterfaceC4663s4 {

    /* JADX INFO: renamed from: c */
    public C4630p4 f28697c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f28697c == null) {
            this.f28697c = new C4630p4(this);
        }
        C4630p4 c4630p4 = this.f28697c;
        Objects.requireNonNull(c4630p4);
        C4662s3 c4662s3Mo10684l = C4707w4.m10821b(context, null, null).mo10684l();
        if (intent == null) {
            c4662s3Mo10684l.f24421i.m10811a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        c4662s3Mo10684l.f24426n.m10812b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                c4662s3Mo10684l.f24421i.m10811a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        c4662s3Mo10684l.f24426n.m10811a("Starting wakeful intent.");
        Objects.requireNonNull((AppMeasurementReceiver) c4630p4.f24267a);
        SparseArray<PowerManager.WakeLock> sparseArray = WakefulBroadcastReceiver.f38663a;
        synchronized (sparseArray) {
            int i = WakefulBroadcastReceiver.f38664b;
            int i2 = i + 1;
            WakefulBroadcastReceiver.f38664b = i2;
            if (i2 <= 0) {
                WakefulBroadcastReceiver.f38664b = 1;
            }
            className.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName componentNameStartService = context.startService(className);
            if (componentNameStartService == null) {
                return;
            }
            PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
            wakeLockNewWakeLock.setReferenceCounted(false);
            wakeLockNewWakeLock.acquire(60000L);
            sparseArray.put(i, wakeLockNewWakeLock);
        }
    }
}
