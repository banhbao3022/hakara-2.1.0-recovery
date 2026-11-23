package p636z0.p709j0.p710y.p711p.p712a;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p636z0.p709j0.Configuration;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.WorkInfo;
import p636z0.p709j0.p710y.DefaultRunnableScheduler;
import p636z0.p709j0.p710y.ExecutionListener;
import p636z0.p709j0.p710y.Scheduler2;
import p636z0.p709j0.p710y.WorkManagerImpl;
import p636z0.p709j0.p710y.p715q.WorkConstraintsCallback;
import p636z0.p709j0.p710y.p715q.WorkConstraintsTracker;
import p636z0.p709j0.p710y.p719s.WorkSpec;
import p636z0.p709j0.p710y.p720t.ProcessUtils;
import p636z0.p709j0.p710y.p720t.StartWorkRunnable;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;
import p636z0.p709j0.p710y.p720t.p722t.WorkManagerTaskExecutor;

/* JADX INFO: renamed from: z0.j0.y.p.a.c, reason: use source file name */
/* JADX INFO: compiled from: GreedyScheduler.java */
/* JADX INFO: loaded from: classes.dex */
public class GreedyScheduler implements Scheduler2, WorkConstraintsCallback, ExecutionListener {

    /* JADX INFO: renamed from: f */
    public static final String f37389f = Logger9.m15886e("GreedyScheduler");

    /* JADX INFO: renamed from: g */
    public final Context f37390g;

    /* JADX INFO: renamed from: h */
    public final WorkManagerImpl f37391h;

    /* JADX INFO: renamed from: i */
    public final WorkConstraintsTracker f37392i;

    /* JADX INFO: renamed from: k */
    public DelayedWorkTracker2 f37394k;

    /* JADX INFO: renamed from: l */
    public boolean f37395l;

    /* JADX INFO: renamed from: n */
    public Boolean f37397n;

    /* JADX INFO: renamed from: j */
    public final Set<WorkSpec> f37393j = new HashSet();

    /* JADX INFO: renamed from: m */
    public final Object f37396m = new Object();

    public GreedyScheduler(Context context, Configuration configuration, TaskExecutor2 taskExecutor2, WorkManagerImpl workManagerImpl) {
        this.f37390g = context;
        this.f37391h = workManagerImpl;
        this.f37392i = new WorkConstraintsTracker(context, taskExecutor2, this);
        this.f37394k = new DelayedWorkTracker2(this, configuration.f37224e);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e5  */
    @Override // p636z0.p709j0.p710y.Scheduler2
    /* JADX INFO: renamed from: a */
    public void mo15908a(WorkSpec... workSpecArr) {
        if (this.f37397n == null) {
            this.f37397n = Boolean.valueOf(ProcessUtils.m16009a(this.f37390g, this.f37391h.f37341f));
        }
        if (!this.f37397n.booleanValue()) {
            Logger9.m15885c().mo15889d(f37389f, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f37395l) {
            this.f37391h.f37345j.m15900a(this);
            this.f37395l = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (WorkSpec workSpec : workSpecArr) {
            long jM15980a = workSpec.m15980a();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (workSpec.f37525b == WorkInfo.ENQUEUED) {
                if (jCurrentTimeMillis < jM15980a) {
                    DelayedWorkTracker2 delayedWorkTracker2 = this.f37394k;
                    if (delayedWorkTracker2 != null) {
                        Runnable runnableRemove = delayedWorkTracker2.f37388d.remove(workSpec.f37524a);
                        if (runnableRemove != null) {
                            ((DefaultRunnableScheduler) delayedWorkTracker2.f37387c).f37296a.removeCallbacks(runnableRemove);
                        }
                        DelayedWorkTracker delayedWorkTracker = new DelayedWorkTracker(delayedWorkTracker2, workSpec);
                        delayedWorkTracker2.f37388d.put(workSpec.f37524a, delayedWorkTracker);
                        ((DefaultRunnableScheduler) delayedWorkTracker2.f37387c).f37296a.postDelayed(delayedWorkTracker, workSpec.m15980a() - System.currentTimeMillis());
                    }
                } else if (workSpec.m15981b()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23 && workSpec.f37533j.f37245d) {
                        Logger9.m15885c().mo15887a(f37389f, String.format("Ignoring WorkSpec %s, Requires device idle.", workSpec), new Throwable[0]);
                    } else if (i < 24) {
                        hashSet.add(workSpec);
                        hashSet2.add(workSpec.f37524a);
                    } else if (workSpec.f37533j.f37250i.m15877a() > 0) {
                        Logger9.m15885c().mo15887a(f37389f, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", workSpec), new Throwable[0]);
                    } else {
                        hashSet.add(workSpec);
                        hashSet2.add(workSpec.f37524a);
                    }
                } else {
                    Logger9.m15885c().mo15887a(f37389f, String.format("Starting work for %s", workSpec.f37524a), new Throwable[0]);
                    WorkManagerImpl workManagerImpl = this.f37391h;
                    ((WorkManagerTaskExecutor) workManagerImpl.f37343h).f37639a.execute(new StartWorkRunnable(workManagerImpl, workSpec.f37524a, null));
                }
            }
        }
        synchronized (this.f37396m) {
            if (!hashSet.isEmpty()) {
                Logger9.m15885c().mo15887a(f37389f, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                this.f37393j.addAll(hashSet);
                this.f37392i.m15951b(this.f37393j);
            }
        }
    }

    @Override // p636z0.p709j0.p710y.p715q.WorkConstraintsCallback
    /* JADX INFO: renamed from: b */
    public void mo967b(List<String> list) {
        for (String str : list) {
            Logger9.m15885c().mo15887a(f37389f, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f37391h.m15918f(str);
        }
    }

    @Override // p636z0.p709j0.p710y.Scheduler2
    /* JADX INFO: renamed from: c */
    public boolean mo15909c() {
        return false;
    }

    @Override // p636z0.p709j0.p710y.ExecutionListener
    /* JADX INFO: renamed from: d */
    public void mo960d(String str, boolean z) {
        synchronized (this.f37396m) {
            for (WorkSpec workSpec : this.f37393j) {
                if (workSpec.f37524a.equals(str)) {
                    Logger9.m15885c().mo15887a(f37389f, String.format("Stopping tracking for %s", str), new Throwable[0]);
                    this.f37393j.remove(workSpec);
                    this.f37392i.m15951b(this.f37393j);
                    break;
                }
            }
        }
    }

    @Override // p636z0.p709j0.p710y.Scheduler2
    /* JADX INFO: renamed from: e */
    public void mo15910e(String str) {
        Runnable runnableRemove;
        if (this.f37397n == null) {
            this.f37397n = Boolean.valueOf(ProcessUtils.m16009a(this.f37390g, this.f37391h.f37341f));
        }
        if (!this.f37397n.booleanValue()) {
            Logger9.m15885c().mo15889d(f37389f, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f37395l) {
            this.f37391h.f37345j.m15900a(this);
            this.f37395l = true;
        }
        Logger9.m15885c().mo15887a(f37389f, String.format("Cancelling work ID %s", str), new Throwable[0]);
        DelayedWorkTracker2 delayedWorkTracker2 = this.f37394k;
        if (delayedWorkTracker2 != null && (runnableRemove = delayedWorkTracker2.f37388d.remove(str)) != null) {
            ((DefaultRunnableScheduler) delayedWorkTracker2.f37387c).f37296a.removeCallbacks(runnableRemove);
        }
        this.f37391h.m15918f(str);
    }

    @Override // p636z0.p709j0.p710y.p715q.WorkConstraintsCallback
    /* JADX INFO: renamed from: f */
    public void mo969f(List<String> list) {
        for (String str : list) {
            Logger9.m15885c().mo15887a(f37389f, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            WorkManagerImpl workManagerImpl = this.f37391h;
            ((WorkManagerTaskExecutor) workManagerImpl.f37343h).f37639a.execute(new StartWorkRunnable(workManagerImpl, str, null));
        }
    }

    public GreedyScheduler(Context context, WorkManagerImpl workManagerImpl, WorkConstraintsTracker workConstraintsTracker) {
        this.f37390g = context;
        this.f37391h = workManagerImpl;
        this.f37392i = workConstraintsTracker;
    }
}
