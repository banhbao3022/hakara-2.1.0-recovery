package p636z0.p709j0.p710y;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p709j0.Configuration;
import p636z0.p709j0.ForegroundInfo;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.p718r.ForegroundProcessor;
import p636z0.p709j0.p710y.p718r.SystemForegroundDispatcher2;
import p636z0.p709j0.p710y.p720t.WakeLocks;
import p636z0.p709j0.p710y.p720t.p721s.SettableFuture;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;
import p636z0.p709j0.p710y.p720t.p722t.WorkManagerTaskExecutor;
import p636z0.p725k.p727d.ContextCompat;

/* JADX INFO: renamed from: z0.j0.y.d, reason: use source file name */
/* JADX INFO: compiled from: Processor.java */
/* JADX INFO: loaded from: classes.dex */
public class Processor implements ExecutionListener, ForegroundProcessor {

    /* JADX INFO: renamed from: f */
    public static final String f37299f = Logger9.m15886e("Processor");

    /* JADX INFO: renamed from: h */
    public Context f37301h;

    /* JADX INFO: renamed from: i */
    public Configuration f37302i;

    /* JADX INFO: renamed from: j */
    public TaskExecutor2 f37303j;

    /* JADX INFO: renamed from: k */
    public WorkDatabase f37304k;

    /* JADX INFO: renamed from: n */
    public List<Scheduler2> f37307n;

    /* JADX INFO: renamed from: m */
    public Map<String, WorkerWrapper3> f37306m = new HashMap();

    /* JADX INFO: renamed from: l */
    public Map<String, WorkerWrapper3> f37305l = new HashMap();

    /* JADX INFO: renamed from: o */
    public Set<String> f37308o = new HashSet();

    /* JADX INFO: renamed from: p */
    public final List<ExecutionListener> f37309p = new ArrayList();

    /* JADX INFO: renamed from: g */
    public PowerManager.WakeLock f37300g = null;

    /* JADX INFO: renamed from: q */
    public final Object f37310q = new Object();

    /* JADX INFO: renamed from: z0.j0.y.d$a */
    /* JADX INFO: compiled from: Processor.java */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: f */
        public ExecutionListener f37311f;

        /* JADX INFO: renamed from: g */
        public String f37312g;

        /* JADX INFO: renamed from: h */
        public ListenableFuture<Boolean> f37313h;

        public a(ExecutionListener executionListener, String str, ListenableFuture<Boolean> listenableFuture) {
            this.f37311f = executionListener;
            this.f37312g = str;
            this.f37313h = listenableFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zBooleanValue;
            try {
                zBooleanValue = this.f37313h.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                zBooleanValue = true;
            }
            this.f37311f.mo960d(this.f37312g, zBooleanValue);
        }
    }

    public Processor(Context context, Configuration configuration, TaskExecutor2 taskExecutor2, WorkDatabase workDatabase, List<Scheduler2> list) {
        this.f37301h = context;
        this.f37302i = configuration;
        this.f37303j = taskExecutor2;
        this.f37304k = workDatabase;
        this.f37307n = list;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m15899b(String str, WorkerWrapper3 workerWrapper3) {
        boolean zIsDone;
        if (workerWrapper3 == null) {
            Logger9.m15885c().mo15887a(f37299f, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
            return false;
        }
        workerWrapper3.f37374y = true;
        workerWrapper3.m15928i();
        ListenableFuture<ListenableWorker.AbstractC0224a> listenableFuture = workerWrapper3.f37373x;
        if (listenableFuture != null) {
            zIsDone = listenableFuture.isDone();
            workerWrapper3.f37373x.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = workerWrapper3.f37361l;
        if (listenableWorker == null || zIsDone) {
            Logger9.m15885c().mo15887a(WorkerWrapper3.f37355f, String.format("WorkSpec %s is already done. Not interrupting.", workerWrapper3.f37360k), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
        Logger9.m15885c().mo15887a(f37299f, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m15900a(ExecutionListener executionListener) {
        synchronized (this.f37310q) {
            this.f37309p.add(executionListener);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m15901c(String str) {
        boolean z;
        synchronized (this.f37310q) {
            z = this.f37306m.containsKey(str) || this.f37305l.containsKey(str);
        }
        return z;
    }

    @Override // p636z0.p709j0.p710y.ExecutionListener
    /* JADX INFO: renamed from: d */
    public void mo960d(String str, boolean z) {
        synchronized (this.f37310q) {
            this.f37306m.remove(str);
            Logger9.m15885c().mo15887a(f37299f, String.format("%s %s executed; reschedule = %s", getClass().getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
            Iterator<ExecutionListener> it = this.f37309p.iterator();
            while (it.hasNext()) {
                it.next().mo960d(str, z);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m15902e(ExecutionListener executionListener) {
        synchronized (this.f37310q) {
            this.f37309p.remove(executionListener);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m15903f(String str, ForegroundInfo foregroundInfo) {
        synchronized (this.f37310q) {
            Logger9.m15885c().mo15889d(f37299f, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            WorkerWrapper3 workerWrapper3Remove = this.f37306m.remove(str);
            if (workerWrapper3Remove != null) {
                if (this.f37300g == null) {
                    PowerManager.WakeLock wakeLockM16011a = WakeLocks.m16011a(this.f37301h, "ProcessorForegroundLck");
                    this.f37300g = wakeLockM16011a;
                    wakeLockM16011a.acquire();
                }
                this.f37305l.put(str, workerWrapper3Remove);
                Intent intentM15968c = SystemForegroundDispatcher2.m15968c(this.f37301h, str, foregroundInfo);
                Context context = this.f37301h;
                Object obj = ContextCompat.f37815a;
                if (Build.VERSION.SDK_INT >= 26) {
                    ContextCompat.f.m16150a(context, intentM15968c);
                } else {
                    context.startService(intentM15968c);
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m15904g(String str, WorkerParameters.C0226a c0226a) {
        synchronized (this.f37310q) {
            if (m15901c(str)) {
                Logger9.m15885c().mo15887a(f37299f, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            WorkerWrapper3.a aVar = new WorkerWrapper3.a(this.f37301h, this.f37302i, this.f37303j, this, this.f37304k, str);
            aVar.f37381g = this.f37307n;
            if (c0226a != null) {
                aVar.f37382h = c0226a;
            }
            WorkerWrapper3 workerWrapper3 = new WorkerWrapper3(aVar);
            SettableFuture<Boolean> settableFuture = workerWrapper3.f37372w;
            settableFuture.mo11664h(new a(this, str, settableFuture), ((WorkManagerTaskExecutor) this.f37303j).f37641c);
            this.f37306m.put(str, workerWrapper3);
            ((WorkManagerTaskExecutor) this.f37303j).f37639a.execute(workerWrapper3);
            Logger9.m15885c().mo15887a(f37299f, String.format("%s: processing %s", Processor.class.getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m15905h() {
        synchronized (this.f37310q) {
            if (!(!this.f37305l.isEmpty())) {
                Context context = this.f37301h;
                String str = SystemForegroundDispatcher2.f37485f;
                Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.f37301h.startService(intent);
                } catch (Throwable th) {
                    Logger9.m15885c().mo15888b(f37299f, "Unable to stop foreground service", th);
                }
                PowerManager.WakeLock wakeLock = this.f37300g;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f37300g = null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m15906i(String str) {
        boolean zM15899b;
        synchronized (this.f37310q) {
            Logger9.m15885c().mo15887a(f37299f, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            zM15899b = m15899b(str, this.f37305l.remove(str));
        }
        return zM15899b;
    }

    /* JADX INFO: renamed from: j */
    public boolean m15907j(String str) {
        boolean zM15899b;
        synchronized (this.f37310q) {
            Logger9.m15885c().mo15887a(f37299f, String.format("Processor stopping background work %s", str), new Throwable[0]);
            zM15899b = m15899b(str, this.f37306m.remove(str));
        }
        return zM15899b;
    }
}
