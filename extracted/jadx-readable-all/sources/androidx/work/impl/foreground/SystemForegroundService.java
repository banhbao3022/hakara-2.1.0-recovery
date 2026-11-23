package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.Objects;
import java.util.UUID;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.WorkManagerImpl;
import p636z0.p709j0.p710y.p718r.SystemForegroundDispatcher;
import p636z0.p709j0.p710y.p718r.SystemForegroundDispatcher2;
import p636z0.p709j0.p710y.p720t.CancelWorkRunnable;
import p636z0.p709j0.p710y.p720t.p722t.WorkManagerTaskExecutor;
import p636z0.p759s.LifecycleService;

/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends LifecycleService implements SystemForegroundDispatcher2.a {

    /* JADX INFO: renamed from: g */
    public static final String f1397g = Logger9.m15886e("SystemFgService");

    /* JADX INFO: renamed from: h */
    public Handler f1398h;

    /* JADX INFO: renamed from: i */
    public boolean f1399i;

    /* JADX INFO: renamed from: j */
    public SystemForegroundDispatcher2 f1400j;

    /* JADX INFO: renamed from: k */
    public NotificationManager f1401k;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.SystemForegroundService$a */
    public class RunnableC0229a implements Runnable {

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ int f1402f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Notification f1403g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ int f1404h;

        public RunnableC0229a(int i, Notification notification, int i2) {
            this.f1402f = i;
            this.f1403g = notification;
            this.f1404h = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f1402f, this.f1403g, this.f1404h);
            } else {
                SystemForegroundService.this.startForeground(this.f1402f, this.f1403g);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m961a() {
        this.f1398h = new Handler(Looper.getMainLooper());
        this.f1401k = (NotificationManager) getApplicationContext().getSystemService("notification");
        SystemForegroundDispatcher2 systemForegroundDispatcher2 = new SystemForegroundDispatcher2(getApplicationContext());
        this.f1400j = systemForegroundDispatcher2;
        if (systemForegroundDispatcher2.f37495p != null) {
            Logger9.m15885c().mo15888b(SystemForegroundDispatcher2.f37485f, "A callback already exists.", new Throwable[0]);
        } else {
            systemForegroundDispatcher2.f37495p = this;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m962c(int i, int i2, Notification notification) {
        this.f1398h.post(new RunnableC0229a(i, notification, i2));
    }

    @Override // p636z0.p759s.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        m961a();
    }

    @Override // p636z0.p759s.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f1400j.m15970g();
    }

    @Override // p636z0.p759s.LifecycleService, android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f1399i) {
            Logger9.m15885c().mo15889d(f1397g, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f1400j.m15970g();
            m961a();
            this.f1399i = false;
        }
        if (intent == null) {
            return 3;
        }
        SystemForegroundDispatcher2 systemForegroundDispatcher2 = this.f1400j;
        Objects.requireNonNull(systemForegroundDispatcher2);
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            Logger9.m15885c().mo15889d(SystemForegroundDispatcher2.f37485f, String.format("Started foreground service %s", intent), new Throwable[0]);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            WorkDatabase workDatabase = systemForegroundDispatcher2.f37487h.f37342g;
            ((WorkManagerTaskExecutor) systemForegroundDispatcher2.f37488i).f37639a.execute(new SystemForegroundDispatcher(systemForegroundDispatcher2, workDatabase, stringExtra));
            systemForegroundDispatcher2.m15969e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            systemForegroundDispatcher2.m15969e(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            Logger9.m15885c().mo15889d(SystemForegroundDispatcher2.f37485f, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            WorkManagerImpl workManagerImpl = systemForegroundDispatcher2.f37487h;
            UUID uuidFromString = UUID.fromString(stringExtra2);
            Objects.requireNonNull(workManagerImpl);
            ((WorkManagerTaskExecutor) workManagerImpl.f37343h).f37639a.execute(new CancelWorkRunnable(workManagerImpl, uuidFromString));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        Logger9.m15885c().mo15889d(SystemForegroundDispatcher2.f37485f, "Stopping foreground service", new Throwable[0]);
        SystemForegroundDispatcher2.a aVar = systemForegroundDispatcher2.f37495p;
        if (aVar == null) {
            return 3;
        }
        SystemForegroundService systemForegroundService = (SystemForegroundService) aVar;
        systemForegroundService.f1399i = true;
        Logger9.m15885c().mo15887a(f1397g, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            systemForegroundService.stopForeground(true);
        }
        systemForegroundService.stopSelf();
        return 3;
    }
}
