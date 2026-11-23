package p636z0.p709j0.p710y.p711p.p713b;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.ExecutionListener;
import p636z0.p709j0.p710y.Processor;
import p636z0.p709j0.p710y.WorkManagerImpl;
import p636z0.p709j0.p710y.p720t.SerialExecutor;
import p636z0.p709j0.p710y.p720t.WakeLocks;
import p636z0.p709j0.p710y.p720t.WorkTimer;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;
import p636z0.p709j0.p710y.p720t.p722t.WorkManagerTaskExecutor;

/* JADX INFO: renamed from: z0.j0.y.p.b.e, reason: use source file name */
/* JADX INFO: compiled from: SystemAlarmDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmDispatcher implements ExecutionListener {

    /* JADX INFO: renamed from: f */
    public static final String f37418f = Logger9.m15886e("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: g */
    public final Context f37419g;

    /* JADX INFO: renamed from: h */
    public final TaskExecutor2 f37420h;

    /* JADX INFO: renamed from: i */
    public final WorkTimer f37421i;

    /* JADX INFO: renamed from: j */
    public final Processor f37422j;

    /* JADX INFO: renamed from: k */
    public final WorkManagerImpl f37423k;

    /* JADX INFO: renamed from: l */
    public final CommandHandler f37424l;

    /* JADX INFO: renamed from: m */
    public final Handler f37425m;

    /* JADX INFO: renamed from: n */
    public final List<Intent> f37426n;

    /* JADX INFO: renamed from: o */
    public Intent f37427o;

    /* JADX INFO: renamed from: p */
    public c f37428p;

    /* JADX INFO: renamed from: z0.j0.y.p.b.e$a */
    /* JADX INFO: compiled from: SystemAlarmDispatcher.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemAlarmDispatcher systemAlarmDispatcher;
            d dVar;
            synchronized (SystemAlarmDispatcher.this.f37426n) {
                SystemAlarmDispatcher systemAlarmDispatcher2 = SystemAlarmDispatcher.this;
                systemAlarmDispatcher2.f37427o = systemAlarmDispatcher2.f37426n.get(0);
            }
            Intent intent = SystemAlarmDispatcher.this.f37427o;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = SystemAlarmDispatcher.this.f37427o.getIntExtra("KEY_START_ID", 0);
                Logger9 logger9M15885c = Logger9.m15885c();
                String str = SystemAlarmDispatcher.f37418f;
                logger9M15885c.mo15887a(str, String.format("Processing command %s, %s", SystemAlarmDispatcher.this.f37427o, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock wakeLockM16011a = WakeLocks.m16011a(SystemAlarmDispatcher.this.f37419g, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    Logger9.m15885c().mo15887a(str, String.format("Acquiring operation wake lock (%s) %s", action, wakeLockM16011a), new Throwable[0]);
                    wakeLockM16011a.acquire();
                    SystemAlarmDispatcher systemAlarmDispatcher3 = SystemAlarmDispatcher.this;
                    systemAlarmDispatcher3.f37424l.m15935e(systemAlarmDispatcher3.f37427o, intExtra, systemAlarmDispatcher3);
                    Logger9.m15885c().mo15887a(str, String.format("Releasing operation wake lock (%s) %s", action, wakeLockM16011a), new Throwable[0]);
                    wakeLockM16011a.release();
                    systemAlarmDispatcher = SystemAlarmDispatcher.this;
                    dVar = new d(systemAlarmDispatcher);
                } catch (Throwable th) {
                    try {
                        Logger9 logger9M15885c2 = Logger9.m15885c();
                        String str2 = SystemAlarmDispatcher.f37418f;
                        logger9M15885c2.mo15888b(str2, "Unexpected error in onHandleIntent", th);
                        Logger9.m15885c().mo15887a(str2, String.format("Releasing operation wake lock (%s) %s", action, wakeLockM16011a), new Throwable[0]);
                        wakeLockM16011a.release();
                        systemAlarmDispatcher = SystemAlarmDispatcher.this;
                        dVar = new d(systemAlarmDispatcher);
                    } catch (Throwable th2) {
                        Logger9.m15885c().mo15887a(SystemAlarmDispatcher.f37418f, String.format("Releasing operation wake lock (%s) %s", action, wakeLockM16011a), new Throwable[0]);
                        wakeLockM16011a.release();
                        SystemAlarmDispatcher systemAlarmDispatcher4 = SystemAlarmDispatcher.this;
                        systemAlarmDispatcher4.f37425m.post(new d(systemAlarmDispatcher4));
                        throw th2;
                    }
                }
                systemAlarmDispatcher.f37425m.post(dVar);
            }
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.p.b.e$b */
    /* JADX INFO: compiled from: SystemAlarmDispatcher.java */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: f */
        public final SystemAlarmDispatcher f37430f;

        /* JADX INFO: renamed from: g */
        public final Intent f37431g;

        /* JADX INFO: renamed from: h */
        public final int f37432h;

        public b(SystemAlarmDispatcher systemAlarmDispatcher, Intent intent, int i) {
            this.f37430f = systemAlarmDispatcher;
            this.f37431g = intent;
            this.f37432h = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f37430f.m15940a(this.f37431g, this.f37432h);
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.p.b.e$c */
    /* JADX INFO: compiled from: SystemAlarmDispatcher.java */
    public interface c {
    }

    /* JADX INFO: renamed from: z0.j0.y.p.b.e$d */
    /* JADX INFO: compiled from: SystemAlarmDispatcher.java */
    public static class d implements Runnable {

        /* JADX INFO: renamed from: f */
        public final SystemAlarmDispatcher f37433f;

        public d(SystemAlarmDispatcher systemAlarmDispatcher) {
            this.f37433f = systemAlarmDispatcher;
        }

        /* JADX WARN: Code duplicated, block: B:36:0x0098 A[Catch: all -> 0x00a8, TryCatch #2 {, blocks: (B:4:0x0019, B:6:0x001e, B:8:0x0043, B:9:0x0047, B:10:0x004e, B:11:0x004f, B:12:0x0059, B:19:0x0068, B:21:0x0070, B:22:0x0072, B:29:0x0080, B:31:0x008f, B:39:0x00a3, B:35:0x0097, B:36:0x0098, B:38:0x00a0, B:43:0x00a7, B:23:0x0073, B:27:0x007d, B:13:0x005a, B:17:0x0065), top: B:51:0x0019, inners: #0, #1 }] */
        /* JADX WARN: Code duplicated, block: B:38:0x00a0 A[Catch: all -> 0x00a8, TryCatch #2 {, blocks: (B:4:0x0019, B:6:0x001e, B:8:0x0043, B:9:0x0047, B:10:0x004e, B:11:0x004f, B:12:0x0059, B:19:0x0068, B:21:0x0070, B:22:0x0072, B:29:0x0080, B:31:0x008f, B:39:0x00a3, B:35:0x0097, B:36:0x0098, B:38:0x00a0, B:43:0x00a7, B:23:0x0073, B:27:0x007d, B:13:0x005a, B:17:0x0065), top: B:51:0x0019, inners: #0, #1 }] */
        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            SystemAlarmDispatcher systemAlarmDispatcher = this.f37433f;
            Objects.requireNonNull(systemAlarmDispatcher);
            Logger9 logger9M15885c = Logger9.m15885c();
            String str = SystemAlarmDispatcher.f37418f;
            logger9M15885c.mo15887a(str, "Checking if commands are complete.", new Throwable[0]);
            systemAlarmDispatcher.m15941b();
            synchronized (systemAlarmDispatcher.f37426n) {
                boolean z2 = true;
                if (systemAlarmDispatcher.f37427o != null) {
                    Logger9.m15885c().mo15887a(str, String.format("Removing command %s", systemAlarmDispatcher.f37427o), new Throwable[0]);
                    if (!systemAlarmDispatcher.f37426n.remove(0).equals(systemAlarmDispatcher.f37427o)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    systemAlarmDispatcher.f37427o = null;
                }
                SerialExecutor serialExecutor = ((WorkManagerTaskExecutor) systemAlarmDispatcher.f37420h).f37639a;
                CommandHandler commandHandler = systemAlarmDispatcher.f37424l;
                synchronized (commandHandler.f37402i) {
                    z = !commandHandler.f37401h.isEmpty();
                }
                if (!z && systemAlarmDispatcher.f37426n.isEmpty()) {
                    synchronized (serialExecutor.f37573h) {
                        if (serialExecutor.f37571f.isEmpty()) {
                            z2 = false;
                        }
                    }
                    if (!z2) {
                        Logger9.m15885c().mo15887a(str, "No more commands & intents.", new Throwable[0]);
                        c cVar = systemAlarmDispatcher.f37428p;
                        if (cVar != null) {
                            ((SystemAlarmService) cVar).m958c();
                        }
                    } else if (!systemAlarmDispatcher.f37426n.isEmpty()) {
                        systemAlarmDispatcher.m15943e();
                    }
                } else if (!systemAlarmDispatcher.f37426n.isEmpty()) {
                    systemAlarmDispatcher.m15943e();
                }
            }
        }
    }

    public SystemAlarmDispatcher(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f37419g = applicationContext;
        this.f37424l = new CommandHandler(applicationContext);
        this.f37421i = new WorkTimer();
        WorkManagerImpl workManagerImplM15914b = WorkManagerImpl.m15914b(context);
        this.f37423k = workManagerImplM15914b;
        Processor processor = workManagerImplM15914b.f37345j;
        this.f37422j = processor;
        this.f37420h = workManagerImplM15914b.f37343h;
        processor.m15900a(this);
        this.f37426n = new ArrayList();
        this.f37427o = null;
        this.f37425m = new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: a */
    public boolean m15940a(Intent intent, int i) {
        boolean z;
        Logger9 logger9M15885c = Logger9.m15885c();
        String str = f37418f;
        logger9M15885c.mo15887a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        m15941b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            Logger9.m15885c().mo15891g(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m15941b();
            synchronized (this.f37426n) {
                Iterator<Intent> it = this.f37426n.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if ("ACTION_CONSTRAINTS_CHANGED".equals(it.next().getAction())) {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                return false;
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f37426n) {
            boolean z2 = this.f37426n.isEmpty() ? false : true;
            this.f37426n.add(intent);
            if (!z2) {
                m15943e();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m15941b() {
        if (this.f37425m.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* JADX INFO: renamed from: c */
    public void m15942c() {
        Logger9.m15885c().mo15887a(f37418f, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f37422j.m15902e(this);
        WorkTimer workTimer = this.f37421i;
        if (!workTimer.f37603c.isShutdown()) {
            workTimer.f37603c.shutdownNow();
        }
        this.f37428p = null;
    }

    @Override // p636z0.p709j0.p710y.ExecutionListener
    /* JADX INFO: renamed from: d */
    public void mo960d(String str, boolean z) {
        Context context = this.f37419g;
        String str2 = CommandHandler.f37399f;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        this.f37425m.post(new b(this, intent, 0));
    }

    /* JADX INFO: renamed from: e */
    public final void m15943e() {
        m15941b();
        PowerManager.WakeLock wakeLockM16011a = WakeLocks.m16011a(this.f37419g, "ProcessCommand");
        try {
            wakeLockM16011a.acquire();
            TaskExecutor2 taskExecutor2 = this.f37423k.f37343h;
            ((WorkManagerTaskExecutor) taskExecutor2).f37639a.execute(new a());
        } finally {
            wakeLockM16011a.release();
        }
    }
}
