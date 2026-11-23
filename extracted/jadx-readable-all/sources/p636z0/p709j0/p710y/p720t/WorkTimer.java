package p636z0.p709j0.p710y.p720t;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p007c.p071d.p078c.p079a.outline;
import p636z0.p709j0.Logger9;

/* JADX INFO: renamed from: z0.j0.y.t.r, reason: use source file name */
/* JADX INFO: compiled from: WorkTimer.java */
/* JADX INFO: loaded from: classes.dex */
public class WorkTimer {

    /* JADX INFO: renamed from: a */
    public static final String f37601a = Logger9.m15886e("WorkTimer");

    /* JADX INFO: renamed from: b */
    public final ThreadFactory f37602b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f37603c;

    /* JADX INFO: renamed from: d */
    public final Map<String, c> f37604d;

    /* JADX INFO: renamed from: e */
    public final Map<String, b> f37605e;

    /* JADX INFO: renamed from: f */
    public final Object f37606f;

    /* JADX INFO: renamed from: z0.j0.y.t.r$a */
    /* JADX INFO: compiled from: WorkTimer.java */
    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: a */
        public int f37607a = 0;

        public a(WorkTimer workTimer) {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder sbM1556G = outline.m1556G("WorkManager-WorkTimer-thread-");
            sbM1556G.append(this.f37607a);
            threadNewThread.setName(sbM1556G.toString());
            this.f37607a++;
            return threadNewThread;
        }
    }

    /* JADX INFO: renamed from: z0.j0.y.t.r$b */
    /* JADX INFO: compiled from: WorkTimer.java */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo15936a(String str);
    }

    /* JADX INFO: renamed from: z0.j0.y.t.r$c */
    /* JADX INFO: compiled from: WorkTimer.java */
    public static class c implements Runnable {

        /* JADX INFO: renamed from: f */
        public final WorkTimer f37608f;

        /* JADX INFO: renamed from: g */
        public final String f37609g;

        public c(WorkTimer workTimer, String str) {
            this.f37608f = workTimer;
            this.f37609g = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f37608f.f37606f) {
                if (this.f37608f.f37604d.remove(this.f37609g) != null) {
                    b bVarRemove = this.f37608f.f37605e.remove(this.f37609g);
                    if (bVarRemove != null) {
                        bVarRemove.mo15936a(this.f37609g);
                    }
                } else {
                    Logger9.m15885c().mo15887a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f37609g), new Throwable[0]);
                }
            }
        }
    }

    public WorkTimer() {
        a aVar = new a(this);
        this.f37602b = aVar;
        this.f37604d = new HashMap();
        this.f37605e = new HashMap();
        this.f37606f = new Object();
        this.f37603c = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    /* JADX INFO: renamed from: a */
    public void m16012a(String str, long j2, b bVar) {
        synchronized (this.f37606f) {
            Logger9.m15885c().mo15887a(f37601a, String.format("Starting timer for %s", str), new Throwable[0]);
            m16013b(str);
            c cVar = new c(this, str);
            this.f37604d.put(str, cVar);
            this.f37605e.put(str, bVar);
            this.f37603c.schedule(cVar, j2, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m16013b(String str) {
        synchronized (this.f37606f) {
            if (this.f37604d.remove(str) != null) {
                Logger9.m15885c().mo15887a(f37601a, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f37605e.remove(str);
            }
        }
    }
}
