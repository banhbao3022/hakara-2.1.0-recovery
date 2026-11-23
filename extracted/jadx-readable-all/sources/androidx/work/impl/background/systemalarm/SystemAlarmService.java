package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.WeakHashMap;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.p711p.p713b.SystemAlarmDispatcher;
import p636z0.p709j0.p710y.p720t.WakeLocks;
import p636z0.p759s.LifecycleService;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends LifecycleService implements SystemAlarmDispatcher.c {

    /* JADX INFO: renamed from: g */
    public static final String f1390g = Logger9.m15886e("SystemAlarmService");

    /* JADX INFO: renamed from: h */
    public SystemAlarmDispatcher f1391h;

    /* JADX INFO: renamed from: i */
    public boolean f1392i;

    /* JADX INFO: renamed from: a */
    public final void m957a() {
        SystemAlarmDispatcher systemAlarmDispatcher = new SystemAlarmDispatcher(this);
        this.f1391h = systemAlarmDispatcher;
        if (systemAlarmDispatcher.f37428p != null) {
            Logger9.m15885c().mo15888b(SystemAlarmDispatcher.f37418f, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            systemAlarmDispatcher.f37428p = this;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m958c() {
        this.f1392i = true;
        Logger9.m15885c().mo15887a(f1390g, "All commands completed in dispatcher", new Throwable[0]);
        String str = WakeLocks.f37584a;
        HashMap map = new HashMap();
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = WakeLocks.f37585b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                Logger9.m15885c().mo15891g(WakeLocks.f37584a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
        stopSelf();
    }

    @Override // p636z0.p759s.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        m957a();
        this.f1392i = false;
    }

    @Override // p636z0.p759s.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f1392i = true;
        this.f1391h.m15942c();
    }

    @Override // p636z0.p759s.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f1392i) {
            Logger9.m15885c().mo15889d(f1390g, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f1391h.m15942c();
            m957a();
            this.f1392i = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f1391h.m15940a(intent, i2);
        return 3;
    }
}
