package p636z0.p709j0;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import p636z0.p709j0.p710y.WorkContinuationImpl;
import p636z0.p709j0.p710y.WorkManagerImpl;
import p636z0.p709j0.p710y.p720t.EnqueueRunnable;
import p636z0.p709j0.p710y.p720t.p722t.WorkManagerTaskExecutor;

/* JADX INFO: renamed from: z0.j0.u, reason: use source file name */
/* JADX INFO: compiled from: WorkManager.java */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AddedAbstractMethod"})
public abstract class WorkManager {
    /* JADX INFO: renamed from: a */
    public final Operation m15893a(WorkRequest workRequest) {
        List listSingletonList = Collections.singletonList(workRequest);
        WorkManagerImpl workManagerImpl = (WorkManagerImpl) this;
        if (listSingletonList.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        WorkContinuationImpl workContinuationImpl = new WorkContinuationImpl(workManagerImpl, listSingletonList);
        if (workContinuationImpl.f37323i) {
            Logger9.m15885c().mo15891g(WorkContinuationImpl.f37315a, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", workContinuationImpl.f37320f)), new Throwable[0]);
        } else {
            EnqueueRunnable enqueueRunnable = new EnqueueRunnable(workContinuationImpl);
            ((WorkManagerTaskExecutor) workContinuationImpl.f37316b.f37343h).f37639a.execute(enqueueRunnable);
            workContinuationImpl.f37324j = enqueueRunnable.f37566h;
        }
        return workContinuationImpl.f37324j;
    }
}
