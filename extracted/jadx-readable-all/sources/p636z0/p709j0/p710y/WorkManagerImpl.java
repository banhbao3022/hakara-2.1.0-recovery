package p636z0.p709j0.p710y;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import mtp.media.karaoke.R;
import p636z0.p641a0.Room;
import p636z0.p641a0.RoomDatabase;
import p636z0.p641a0.SharedSQLiteStatement;
import p636z0.p660c0.p661a.SupportSQLiteStatement;
import p636z0.p709j0.Configuration;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.WorkManager;
import p636z0.p709j0.p710y.p711p.p712a.GreedyScheduler;
import p636z0.p709j0.p710y.p711p.p713b.SystemAlarmScheduler;
import p636z0.p709j0.p710y.p711p.p714c.SystemJobScheduler;
import p636z0.p709j0.p710y.p719s.WorkSpecDao_Impl;
import p636z0.p709j0.p710y.p720t.PackageManagerHelper;
import p636z0.p709j0.p710y.p720t.PreferenceUtils;
import p636z0.p709j0.p710y.p720t.SerialExecutor;
import p636z0.p709j0.p710y.p720t.StopWorkRunnable;
import p636z0.p709j0.p710y.p720t.p722t.TaskExecutor2;
import p636z0.p709j0.p710y.p720t.p722t.WorkManagerTaskExecutor;
import p636z0.p709j0.p724z.RemoteWorkManager;

/* JADX INFO: renamed from: z0.j0.y.l, reason: use source file name */
/* JADX INFO: compiled from: WorkManagerImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class WorkManagerImpl extends WorkManager {

    /* JADX INFO: renamed from: a */
    public static final String f37336a = Logger9.m15886e("WorkManagerImpl");

    /* JADX INFO: renamed from: b */
    public static WorkManagerImpl f37337b = null;

    /* JADX INFO: renamed from: c */
    public static WorkManagerImpl f37338c = null;

    /* JADX INFO: renamed from: d */
    public static final Object f37339d = new Object();

    /* JADX INFO: renamed from: e */
    public Context f37340e;

    /* JADX INFO: renamed from: f */
    public Configuration f37341f;

    /* JADX INFO: renamed from: g */
    public WorkDatabase f37342g;

    /* JADX INFO: renamed from: h */
    public TaskExecutor2 f37343h;

    /* JADX INFO: renamed from: i */
    public List<Scheduler2> f37344i;

    /* JADX INFO: renamed from: j */
    public Processor f37345j;

    /* JADX INFO: renamed from: k */
    public PreferenceUtils f37346k;

    /* JADX INFO: renamed from: l */
    public boolean f37347l;

    /* JADX INFO: renamed from: m */
    public BroadcastReceiver.PendingResult f37348m;

    /* JADX INFO: renamed from: n */
    public volatile RemoteWorkManager f37349n;

    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor2 taskExecutor2) {
        this(context, configuration, taskExecutor2, context.getResources().getBoolean(R.bool.workmanager_test_configuration));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static WorkManagerImpl m15914b(Context context) {
        WorkManagerImpl workManagerImplM15914b;
        Object obj = f37339d;
        synchronized (obj) {
            synchronized (obj) {
                workManagerImplM15914b = f37337b;
                if (workManagerImplM15914b == null) {
                    workManagerImplM15914b = f37338c;
                }
            }
            return workManagerImplM15914b;
        }
        if (workManagerImplM15914b == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof Configuration.b)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            m15915c(applicationContext, ((Configuration.b) applicationContext).m15875a());
            workManagerImplM15914b = m15914b(applicationContext);
        }
        return workManagerImplM15914b;
    }

    /* JADX INFO: renamed from: c */
    public static void m15915c(Context context, Configuration configuration) {
        synchronized (f37339d) {
            WorkManagerImpl workManagerImpl = f37337b;
            if (workManagerImpl != null && f37338c != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
            if (workManagerImpl == null) {
                Context applicationContext = context.getApplicationContext();
                if (f37338c == null) {
                    f37338c = new WorkManagerImpl(applicationContext, configuration, new WorkManagerTaskExecutor(configuration.f37221b));
                }
                f37337b = f37338c;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m15916d(Context context, Configuration configuration, TaskExecutor2 taskExecutor2, WorkDatabase workDatabase, List<Scheduler2> list, Processor processor) {
        Context applicationContext = context.getApplicationContext();
        this.f37340e = applicationContext;
        this.f37341f = configuration;
        this.f37343h = taskExecutor2;
        this.f37342g = workDatabase;
        this.f37344i = list;
        this.f37345j = processor;
        this.f37346k = new PreferenceUtils(workDatabase);
        this.f37347l = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        TaskExecutor2 taskExecutor3 = this.f37343h;
        ((WorkManagerTaskExecutor) taskExecutor3).f37639a.execute(new ForceStopRunnable(applicationContext, this));
    }

    /* JADX INFO: renamed from: e */
    public void m15917e() {
        List<JobInfo> listM15946f;
        if (Build.VERSION.SDK_INT >= 23) {
            Context context = this.f37340e;
            String str = SystemJobScheduler.f37438f;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            if (jobScheduler != null && (listM15946f = SystemJobScheduler.m15946f(context, jobScheduler)) != null && !listM15946f.isEmpty()) {
                Iterator<JobInfo> it = listM15946f.iterator();
                while (it.hasNext()) {
                    SystemJobScheduler.m15944b(jobScheduler, it.next().getId());
                }
            }
        }
        WorkSpecDao_Impl workSpecDao_Impl = (WorkSpecDao_Impl) this.f37342g.mo946u();
        workSpecDao_Impl.f37543a.m14528b();
        SupportSQLiteStatement supportSQLiteStatementM14559a = workSpecDao_Impl.f37551i.m14559a();
        workSpecDao_Impl.f37543a.m14529c();
        try {
            supportSQLiteStatementM14559a.mo15051q();
            workSpecDao_Impl.f37543a.m14537n();
            workSpecDao_Impl.f37543a.m14530f();
            SharedSQLiteStatement sharedSQLiteStatement = workSpecDao_Impl.f37551i;
            if (supportSQLiteStatementM14559a == sharedSQLiteStatement.f34367c) {
                sharedSQLiteStatement.f34365a.set(false);
            }
            Schedulers.m15911a(this.f37341f, this.f37342g, this.f37344i);
        } catch (Throwable th) {
            workSpecDao_Impl.f37543a.m14530f();
            workSpecDao_Impl.f37551i.m14561d(supportSQLiteStatementM14559a);
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m15918f(String str) {
        TaskExecutor2 taskExecutor2 = this.f37343h;
        ((WorkManagerTaskExecutor) taskExecutor2).f37639a.execute(new StopWorkRunnable(this, str, false));
    }

    /* JADX INFO: renamed from: g */
    public final void m15919g() {
        try {
            this.f37349n = (RemoteWorkManager) Class.forName("androidx.work.multiprocess.RemoteWorkManagerClient").getConstructor(Context.class, WorkManagerImpl.class).newInstance(this.f37340e, this);
        } catch (Throwable th) {
            Logger9.m15885c().mo15887a(f37336a, "Unable to initialize multi-process support", th);
        }
    }

    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor2 taskExecutor2, boolean z) {
        RoomDatabase.a aVarM14526a;
        Context applicationContext = context.getApplicationContext();
        SerialExecutor serialExecutor = ((WorkManagerTaskExecutor) taskExecutor2).f37639a;
        int i = WorkDatabase.f1374o;
        if (z) {
            aVarM14526a = new RoomDatabase.a(applicationContext, WorkDatabase.class, null);
            aVarM14526a.f34323h = true;
        } else {
            String str = WorkDatabasePathHelper.f37334a;
            aVarM14526a = Room.m14526a(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            aVarM14526a.f34322g = new WorkDatabase2(applicationContext);
        }
        aVarM14526a.f34320e = serialExecutor;
        WorkDatabase3 workDatabase3 = new WorkDatabase3();
        if (aVarM14526a.f34319d == null) {
            aVarM14526a.f34319d = new ArrayList<>();
        }
        aVarM14526a.f34319d.add(workDatabase3);
        aVarM14526a.m14539a(WorkDatabaseMigrations.f37326a);
        aVarM14526a.m14539a(new WorkDatabaseMigrations.g(applicationContext, 2, 3));
        aVarM14526a.m14539a(WorkDatabaseMigrations.f37327b);
        aVarM14526a.m14539a(WorkDatabaseMigrations.f37328c);
        aVarM14526a.m14539a(new WorkDatabaseMigrations.g(applicationContext, 5, 6));
        aVarM14526a.m14539a(WorkDatabaseMigrations.f37329d);
        aVarM14526a.m14539a(WorkDatabaseMigrations.f37330e);
        aVarM14526a.m14539a(WorkDatabaseMigrations.f37331f);
        aVarM14526a.m14539a(new WorkDatabaseMigrations.h(applicationContext));
        aVarM14526a.m14539a(new WorkDatabaseMigrations.g(applicationContext, 10, 11));
        aVarM14526a.f34324i = false;
        aVarM14526a.f34325j = true;
        this(context, configuration, taskExecutor2, (WorkDatabase) aVarM14526a.m14540b());
    }

    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor2 taskExecutor2, WorkDatabase workDatabase) {
        Scheduler2 systemAlarmScheduler;
        Context applicationContext = context.getApplicationContext();
        Logger9.a aVar = new Logger9.a(configuration.f37227h);
        synchronized (Logger9.class) {
            Logger9.f37271a = aVar;
        }
        Scheduler2[] scheduler2Arr = new Scheduler2[2];
        String str = Schedulers.f37314a;
        if (Build.VERSION.SDK_INT >= 23) {
            systemAlarmScheduler = new SystemJobScheduler(applicationContext, this);
            PackageManagerHelper.m16008a(applicationContext, SystemJobService.class, true);
            Logger9.m15885c().mo15887a(Schedulers.f37314a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        } else {
            try {
                systemAlarmScheduler = (Scheduler2) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(applicationContext);
                Logger9.m15885c().mo15887a(Schedulers.f37314a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            } catch (Throwable th) {
                Logger9.m15885c().mo15887a(Schedulers.f37314a, "Unable to create GCM Scheduler", th);
                systemAlarmScheduler = null;
            }
            if (systemAlarmScheduler == null) {
                systemAlarmScheduler = new SystemAlarmScheduler(applicationContext);
                PackageManagerHelper.m16008a(applicationContext, SystemAlarmService.class, true);
                Logger9.m15885c().mo15887a(Schedulers.f37314a, "Created SystemAlarmScheduler", new Throwable[0]);
            }
        }
        scheduler2Arr[0] = systemAlarmScheduler;
        scheduler2Arr[1] = new GreedyScheduler(applicationContext, configuration, taskExecutor2, this);
        List<Scheduler2> listAsList = Arrays.asList(scheduler2Arr);
        m15916d(context, configuration, taskExecutor2, workDatabase, listAsList, new Processor(context, configuration, taskExecutor2, workDatabase, listAsList));
    }

    public WorkManagerImpl(Context context, Configuration configuration, TaskExecutor2 taskExecutor2, WorkDatabase workDatabase, List<Scheduler2> list, Processor processor) {
        m15916d(context, configuration, taskExecutor2, workDatabase, list, processor);
    }
}
