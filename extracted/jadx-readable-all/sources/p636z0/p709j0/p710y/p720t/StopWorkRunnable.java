package p636z0.p709j0.p710y.p720t;

import androidx.work.impl.WorkDatabase;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.WorkInfo;
import p636z0.p709j0.p710y.Processor;
import p636z0.p709j0.p710y.WorkManagerImpl;
import p636z0.p709j0.p710y.p719s.WorkSpecDao;
import p636z0.p709j0.p710y.p719s.WorkSpecDao_Impl;

/* JADX INFO: renamed from: z0.j0.y.t.l, reason: use source file name */
/* JADX INFO: compiled from: StopWorkRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public class StopWorkRunnable implements Runnable {

    /* JADX INFO: renamed from: f */
    public static final String f37580f = Logger9.m15886e("StopWorkRunnable");

    /* JADX INFO: renamed from: g */
    public final WorkManagerImpl f37581g;

    /* JADX INFO: renamed from: h */
    public final String f37582h;

    /* JADX INFO: renamed from: i */
    public final boolean f37583i;

    public StopWorkRunnable(WorkManagerImpl workManagerImpl, String str, boolean z) {
        this.f37581g = workManagerImpl;
        this.f37582h = str;
        this.f37583i = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zContainsKey;
        boolean zM15907j;
        WorkManagerImpl workManagerImpl = this.f37581g;
        WorkDatabase workDatabase = workManagerImpl.f37342g;
        Processor processor = workManagerImpl.f37345j;
        WorkSpecDao workSpecDaoMo946u = workDatabase.mo946u();
        workDatabase.m14529c();
        try {
            String str = this.f37582h;
            synchronized (processor.f37310q) {
                zContainsKey = processor.f37305l.containsKey(str);
            }
            if (this.f37583i) {
                zM15907j = this.f37581g.f37345j.m15906i(this.f37582h);
            } else {
                if (!zContainsKey) {
                    WorkSpecDao_Impl workSpecDao_Impl = (WorkSpecDao_Impl) workSpecDaoMo946u;
                    if (workSpecDao_Impl.m15989g(this.f37582h) == WorkInfo.RUNNING) {
                        workSpecDao_Impl.m15999q(WorkInfo.ENQUEUED, this.f37582h);
                    }
                }
                zM15907j = this.f37581g.f37345j.m15907j(this.f37582h);
            }
            Logger9.m15885c().mo15887a(f37580f, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f37582h, Boolean.valueOf(zM15907j)), new Throwable[0]);
            workDatabase.m14537n();
            workDatabase.m14530f();
        } catch (Throwable th) {
            workDatabase.m14530f();
            throw th;
        }
    }
}
