package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import java.util.Collections;
import java.util.List;
import p007c.p190n.p378c.p383e.p384a.ListenableFuture;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.WorkManagerImpl;
import p636z0.p709j0.p710y.p715q.WorkConstraintsCallback;
import p636z0.p709j0.p710y.p715q.WorkConstraintsTracker;
import p636z0.p709j0.p710y.p719s.WorkSpec;
import p636z0.p709j0.p710y.p719s.WorkSpecDao_Impl;
import p636z0.p709j0.p710y.p720t.p721s.SettableFuture;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;
import p636z0.p709j0.p710y.p723u.ConstraintTrackingWorker2;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements WorkConstraintsCallback {

    /* JADX INFO: renamed from: k */
    public static final String f1412k = Logger9.m15886e("ConstraintTrkngWrkr");

    /* JADX INFO: renamed from: l */
    public WorkerParameters f1413l;

    /* JADX INFO: renamed from: m */
    public final Object f1414m;

    /* JADX INFO: renamed from: n */
    public volatile boolean f1415n;

    /* JADX INFO: renamed from: o */
    public SettableFuture<ListenableWorker.AbstractC0224a> f1416o;

    /* JADX INFO: renamed from: p */
    public ListenableWorker f1417p;

    /* JADX INFO: renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$a */
    public class RunnableC0230a implements Runnable {
        public RunnableC0230a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            String strM15880b = constraintTrackingWorker.getInputData().m15880b("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            if (TextUtils.isEmpty(strM15880b)) {
                Logger9.m15885c().mo15888b(ConstraintTrackingWorker.f1412k, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.m966a();
                return;
            }
            ListenableWorker listenableWorkerM15897b = constraintTrackingWorker.getWorkerFactory().m15897b(constraintTrackingWorker.getApplicationContext(), strM15880b, constraintTrackingWorker.f1413l);
            constraintTrackingWorker.f1417p = listenableWorkerM15897b;
            if (listenableWorkerM15897b == null) {
                Logger9.m15885c().mo15887a(ConstraintTrackingWorker.f1412k, "No worker to delegate to.", new Throwable[0]);
                constraintTrackingWorker.m966a();
                return;
            }
            WorkSpec workSpecM15992j = ((WorkSpecDao_Impl) WorkManagerImpl.m15914b(constraintTrackingWorker.getApplicationContext()).f37342g.mo946u()).m15992j(constraintTrackingWorker.getId().toString());
            if (workSpecM15992j == null) {
                constraintTrackingWorker.m966a();
                return;
            }
            WorkConstraintsTracker workConstraintsTracker = new WorkConstraintsTracker(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
            workConstraintsTracker.m15951b(Collections.singletonList(workSpecM15992j));
            if (!workConstraintsTracker.m15950a(constraintTrackingWorker.getId().toString())) {
                Logger9.m15885c().mo15887a(ConstraintTrackingWorker.f1412k, String.format("Constraints not met for delegate %s. Requesting retry.", strM15880b), new Throwable[0]);
                constraintTrackingWorker.m968c();
                return;
            }
            Logger9.m15885c().mo15887a(ConstraintTrackingWorker.f1412k, String.format("Constraints met for delegate %s", strM15880b), new Throwable[0]);
            try {
                ListenableFuture<ListenableWorker.AbstractC0224a> listenableFutureStartWork = constraintTrackingWorker.f1417p.startWork();
                listenableFutureStartWork.mo11664h(new ConstraintTrackingWorker2(constraintTrackingWorker, listenableFutureStartWork), constraintTrackingWorker.getBackgroundExecutor());
            } catch (Throwable th) {
                Logger9 logger9M15885c = Logger9.m15885c();
                String str = ConstraintTrackingWorker.f1412k;
                logger9M15885c.mo15887a(str, String.format("Delegated worker %s threw exception in startWork.", strM15880b), th);
                synchronized (constraintTrackingWorker.f1414m) {
                    if (constraintTrackingWorker.f1415n) {
                        Logger9.m15885c().mo15887a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        constraintTrackingWorker.m968c();
                    } else {
                        constraintTrackingWorker.m966a();
                    }
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f1413l = workerParameters;
        this.f1414m = new Object();
        this.f1415n = false;
        this.f1416o = new SettableFuture<>();
    }

    /* JADX INFO: renamed from: a */
    public void m966a() {
        this.f1416o.m16027k(new ListenableWorker.AbstractC0224a.a());
    }

    @Override // p636z0.p709j0.p710y.p715q.WorkConstraintsCallback
    /* JADX INFO: renamed from: b */
    public void mo967b(List<String> list) {
        Logger9.m15885c().mo15887a(f1412k, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f1414m) {
            this.f1415n = true;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m968c() {
        this.f1416o.m16027k(new ListenableWorker.AbstractC0224a.b());
    }

    @Override // p636z0.p709j0.p710y.p715q.WorkConstraintsCallback
    /* JADX INFO: renamed from: f */
    public void mo969f(List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    public TaskExecutor2 getTaskExecutor() {
        return WorkManagerImpl.m15914b(getApplicationContext()).f37343h;
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f1417p;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f1417p;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f1417p.stop();
    }

    @Override // androidx.work.ListenableWorker
    public ListenableFuture<ListenableWorker.AbstractC0224a> startWork() {
        getBackgroundExecutor().execute(new RunnableC0230a());
        return this.f1416o;
    }
}
