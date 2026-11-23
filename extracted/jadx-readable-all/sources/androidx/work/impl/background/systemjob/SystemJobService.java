package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.p710y.ExecutionListener;
import p636z0.p709j0.p710y.Processor;
import p636z0.p709j0.p710y.WorkManagerImpl;
import p636z0.p709j0.p710y.p720t.StartWorkRunnable;
import p636z0.p709j0.p710y.p720t.p722t.WorkManagerTaskExecutor;

/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements ExecutionListener {

    /* JADX INFO: renamed from: f */
    public static final String f1393f = Logger9.m15886e("SystemJobService");

    /* JADX INFO: renamed from: g */
    public WorkManagerImpl f1394g;

    /* JADX INFO: renamed from: h */
    public final Map<String, JobParameters> f1395h = new HashMap();

    /* JADX INFO: renamed from: a */
    public static String m959a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p636z0.p709j0.p710y.ExecutionListener
    /* JADX INFO: renamed from: d */
    public void mo960d(String str, boolean z) {
        JobParameters jobParametersRemove;
        Logger9.m15885c().mo15887a(f1393f, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f1395h) {
            jobParametersRemove = this.f1395h.remove(str);
        }
        if (jobParametersRemove != null) {
            jobFinished(jobParametersRemove, z);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            WorkManagerImpl workManagerImplM15914b = WorkManagerImpl.m15914b(getApplicationContext());
            this.f1394g = workManagerImplM15914b;
            workManagerImplM15914b.f37345j.m15900a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            Logger9.m15885c().mo15891g(f1393f, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        WorkManagerImpl workManagerImpl = this.f1394g;
        if (workManagerImpl != null) {
            workManagerImpl.f37345j.m15902e(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.f1394g == null) {
            Logger9.m15885c().mo15887a(f1393f, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String strM959a = m959a(jobParameters);
        if (TextUtils.isEmpty(strM959a)) {
            Logger9.m15885c().mo15888b(f1393f, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f1395h) {
            if (this.f1395h.containsKey(strM959a)) {
                Logger9.m15885c().mo15887a(f1393f, String.format("Job is already being executed by SystemJobService: %s", strM959a), new Throwable[0]);
                return false;
            }
            Logger9.m15885c().mo15887a(f1393f, String.format("onStartJob for %s", strM959a), new Throwable[0]);
            this.f1395h.put(strM959a, jobParameters);
            WorkerParameters.C0226a c0226a = null;
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                c0226a = new WorkerParameters.C0226a();
                if (jobParameters.getTriggeredContentUris() != null) {
                    c0226a.f1371b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    c0226a.f1370a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i >= 28) {
                    c0226a.f1372c = jobParameters.getNetwork();
                }
            }
            WorkManagerImpl workManagerImpl = this.f1394g;
            ((WorkManagerTaskExecutor) workManagerImpl.f37343h).f37639a.execute(new StartWorkRunnable(workManagerImpl, strM959a, c0226a));
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        if (this.f1394g == null) {
            Logger9.m15885c().mo15887a(f1393f, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String strM959a = m959a(jobParameters);
        if (TextUtils.isEmpty(strM959a)) {
            Logger9.m15885c().mo15888b(f1393f, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        Logger9.m15885c().mo15887a(f1393f, String.format("onStopJob for %s", strM959a), new Throwable[0]);
        synchronized (this.f1395h) {
            this.f1395h.remove(strM959a);
        }
        this.f1394g.m15918f(strM959a);
        Processor processor = this.f1394g.f37345j;
        synchronized (processor.f37310q) {
            zContains = processor.f37308o.contains(strM959a);
        }
        return !zContains;
    }
}
