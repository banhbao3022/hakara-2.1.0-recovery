package p636z0.p709j0.p710y.p720t;

import android.content.Context;
import android.os.PowerManager;
import java.util.WeakHashMap;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p709j0.Logger9;

/* JADX INFO: renamed from: z0.j0.y.t.m, reason: use source file name */
/* JADX INFO: compiled from: WakeLocks.java */
/* JADX INFO: loaded from: classes.dex */
public class WakeLocks {

    /* JADX INFO: renamed from: a */
    public static final String f37584a = Logger9.m15886e("WakeLocks");

    /* JADX INFO: renamed from: b */
    public static final WeakHashMap<PowerManager.WakeLock, String> f37585b = new WeakHashMap<>();

    /* JADX INFO: renamed from: a */
    public static PowerManager.WakeLock m16011a(Context context, String str) {
        PowerManager powerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        String strM1599u = outline.m1599u("WorkManager: ", str);
        PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, strM1599u);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = f37585b;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, strM1599u);
        }
        return wakeLockNewWakeLock;
    }
}
