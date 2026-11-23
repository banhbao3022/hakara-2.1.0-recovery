package p636z0.p709j0.p710y.p720t;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.Operation;
import p636z0.p709j0.WorkInfo;
import p636z0.p709j0.p710y.OperationImpl;
import p636z0.p709j0.p710y.Processor;
import p636z0.p709j0.p710y.Scheduler2;
import p636z0.p709j0.p710y.Schedulers;
import p636z0.p709j0.p710y.WorkManagerImpl;
import p636z0.p709j0.p710y.WorkerWrapper3;
import p636z0.p709j0.p710y.p719s.DependencyDao;
import p636z0.p709j0.p710y.p719s.DependencyDao_Impl;
import p636z0.p709j0.p710y.p719s.WorkSpecDao;
import p636z0.p709j0.p710y.p719s.WorkSpecDao_Impl;

/* JADX INFO: renamed from: z0.j0.y.t.d, reason: use source file name */
/* JADX INFO: compiled from: CancelWorkRunnable.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class CancelWorkRunnable4 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final OperationImpl f37563f = new OperationImpl();

    /* JADX INFO: renamed from: a */
    public void m16002a(WorkManagerImpl workManagerImpl, String str) {
        boolean z;
        WorkDatabase workDatabase = workManagerImpl.f37342g;
        WorkSpecDao workSpecDaoMo946u = workDatabase.mo946u();
        DependencyDao dependencyDaoMo941p = workDatabase.mo941p();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            z = true;
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            WorkSpecDao_Impl workSpecDao_Impl = (WorkSpecDao_Impl) workSpecDaoMo946u;
            WorkInfo workInfoM15989g = workSpecDao_Impl.m15989g(str2);
            if (workInfoM15989g != WorkInfo.SUCCEEDED && workInfoM15989g != WorkInfo.FAILED) {
                workSpecDao_Impl.m15999q(WorkInfo.CANCELLED, str2);
            }
            linkedList.addAll(((DependencyDao_Impl) dependencyDaoMo941p).m15971a(str2));
        }
        Processor processor = workManagerImpl.f37345j;
        synchronized (processor.f37310q) {
            Logger9.m15885c().mo15887a(Processor.f37299f, String.format("Processor cancelling %s", str), new Throwable[0]);
            processor.f37308o.add(str);
            WorkerWrapper3 workerWrapper3Remove = processor.f37305l.remove(str);
            if (workerWrapper3Remove == null) {
                z = false;
            }
            if (workerWrapper3Remove == null) {
                workerWrapper3Remove = processor.f37306m.remove(str);
            }
            Processor.m15899b(str, workerWrapper3Remove);
            if (z) {
                processor.m15905h();
            }
        }
        Iterator<Scheduler2> it = workManagerImpl.f37344i.iterator();
        while (it.hasNext()) {
            it.next().mo15910e(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m16003b(WorkManagerImpl workManagerImpl) {
        Schedulers.m15911a(workManagerImpl.f37341f, workManagerImpl.f37342g, workManagerImpl.f37344i);
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo16001c();

    @Override // java.lang.Runnable
    public void run() {
        try {
            mo16001c();
            this.f37563f.m15898a(Operation.f37279a);
        } catch (Throwable th) {
            this.f37563f.m15898a(new Operation.b.a(th));
        }
    }
}
