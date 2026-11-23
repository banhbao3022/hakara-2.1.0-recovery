package p007c.p008a.p009a.p029b.p042g;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.util.Log;
import p477d1.TypeCastException;
import p477d1.p493x.p495c.Intrinsics2;

/* JADX INFO: renamed from: c.a.a.b.g.c, reason: use source file name */
/* JADX INFO: compiled from: SafeWifiLock.kt */
/* JADX INFO: loaded from: classes.dex */
public class SafeWifiLock {

    /* JADX INFO: renamed from: a */
    public final WifiManager.WifiLock f1808a;

    public SafeWifiLock(Context context) {
        Intrinsics2.m13090f(context, "context");
        if (context.getPackageManager().checkPermission("android.permission.WAKE_LOCK", context.getPackageName()) != 0) {
            Log.e("SafeWifiLock", "Unable to acquire WAKE_LOCK due to missing manifest permission");
            this.f1808a = null;
            return;
        }
        Object systemService = context.getApplicationContext().getSystemService("wifi");
        if (systemService == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.net.wifi.WifiManager");
        }
        WifiManager.WifiLock wifiLockCreateWifiLock = ((WifiManager) systemService).createWifiLock(1, "mcLock");
        this.f1808a = wifiLockCreateWifiLock;
        if (wifiLockCreateWifiLock != null) {
            wifiLockCreateWifiLock.setReferenceCounted(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m1290a() {
        WifiManager.WifiLock wifiLock = this.f1808a;
        if (wifiLock == null || !wifiLock.isHeld()) {
            return;
        }
        wifiLock.release();
    }
}
