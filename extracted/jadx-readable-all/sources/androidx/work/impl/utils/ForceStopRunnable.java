package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import p636z0.p641a0.RoomSQLiteQuery;
import p636z0.p641a0.p643b0.DBUtil;
import p636z0.p709j0.InitializationExceptionHandler;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.WorkInfo;
import p636z0.p709j0.p710y.Schedulers;
import p636z0.p709j0.p710y.WorkDatabasePathHelper;
import p636z0.p709j0.p710y.WorkManagerImpl;
import p636z0.p709j0.p710y.p711p.p714c.SystemJobScheduler;
import p636z0.p709j0.p710y.p719s.Preference;
import p636z0.p709j0.p710y.p719s.PreferenceDao_Impl;
import p636z0.p709j0.p710y.p719s.SystemIdInfoDao_Impl;
import p636z0.p709j0.p710y.p719s.WorkProgressDao;
import p636z0.p709j0.p710y.p719s.WorkProgressDao_Impl;
import p636z0.p709j0.p710y.p719s.WorkSpec;
import p636z0.p709j0.p710y.p719s.WorkSpecDao;
import p636z0.p709j0.p710y.p719s.WorkSpecDao_Impl;
import p636z0.p709j0.p710y.p720t.PreferenceUtils;
import p636z0.p709j0.p710y.p720t.ProcessUtils;

/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: f */
    public static final String f1406f = Logger9.m15886e("ForceStopRunnable");

    /* JADX INFO: renamed from: g */
    public static final long f1407g = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: h */
    public final Context f1408h;

    /* JADX INFO: renamed from: i */
    public final WorkManagerImpl f1409i;

    /* JADX INFO: renamed from: j */
    public int f1410j = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public static final String f1411a = Logger9.m15886e("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            Logger9.m15885c().mo15890f(f1411a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.m964c(context);
        }
    }

    public ForceStopRunnable(Context context, WorkManagerImpl workManagerImpl) {
        this.f1408h = context.getApplicationContext();
        this.f1409i = workManagerImpl;
    }

    /* JADX INFO: renamed from: b */
    public static PendingIntent m963b(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    /* JADX INFO: renamed from: c */
    public static void m964c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentM963b = m963b(context, 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f1407g;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentM963b);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m965a() {
        boolean z;
        boolean z2;
        if (Build.VERSION.SDK_INT >= 23) {
            Context context = this.f1408h;
            WorkManagerImpl workManagerImpl = this.f1409i;
            String str = SystemJobScheduler.f37438f;
            JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
            List<JobInfo> listM15946f = SystemJobScheduler.m15946f(context, jobScheduler);
            SystemIdInfoDao_Impl systemIdInfoDao_Impl = (SystemIdInfoDao_Impl) workManagerImpl.f37342g.mo943r();
            Objects.requireNonNull(systemIdInfoDao_Impl);
            RoomSQLiteQuery roomSQLiteQueryM14548f = RoomSQLiteQuery.m14548f("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
            systemIdInfoDao_Impl.f37511a.m14528b();
            Cursor cursorM14503b = DBUtil.m14503b(systemIdInfoDao_Impl.f37511a, roomSQLiteQueryM14548f, false, null);
            try {
                ArrayList arrayList = new ArrayList(cursorM14503b.getCount());
                while (cursorM14503b.moveToNext()) {
                    arrayList.add(cursorM14503b.getString(0));
                }
                cursorM14503b.close();
                roomSQLiteQueryM14548f.m14554h();
                HashSet hashSet = new HashSet(listM15946f != null ? listM15946f.size() : 0);
                if (listM15946f != null && !listM15946f.isEmpty()) {
                    for (JobInfo jobInfo : listM15946f) {
                        String strM15947g = SystemJobScheduler.m15947g(jobInfo);
                        if (TextUtils.isEmpty(strM15947g)) {
                            SystemJobScheduler.m15944b(jobScheduler, jobInfo.getId());
                        } else {
                            hashSet.add(strM15947g);
                        }
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!hashSet.contains((String) it.next())) {
                            Logger9.m15885c().mo15887a(SystemJobScheduler.f37438f, "Reconciling jobs", new Throwable[0]);
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    WorkDatabase workDatabase = workManagerImpl.f37342g;
                    workDatabase.m14529c();
                    try {
                        WorkSpecDao workSpecDaoMo946u = workDatabase.mo946u();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ((WorkSpecDao_Impl) workSpecDaoMo946u).m15995m((String) it2.next(), -1L);
                        }
                        workDatabase.m14537n();
                        workDatabase.m14530f();
                    } catch (Throwable th) {
                        workDatabase.m14530f();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                cursorM14503b.close();
                roomSQLiteQueryM14548f.m14554h();
                throw th2;
            }
        } else {
            z = false;
        }
        WorkDatabase workDatabase2 = this.f1409i.f37342g;
        WorkSpecDao workSpecDaoMo946u2 = workDatabase2.mo946u();
        WorkProgressDao workProgressDaoMo945t = workDatabase2.mo945t();
        workDatabase2.m14529c();
        try {
            WorkSpecDao_Impl workSpecDao_Impl = (WorkSpecDao_Impl) workSpecDaoMo946u2;
            List<WorkSpec> listM15987e = workSpecDao_Impl.m15987e();
            boolean z3 = !((ArrayList) listM15987e).isEmpty();
            if (z3) {
                for (WorkSpec workSpec : (ArrayList) listM15987e) {
                    workSpecDao_Impl.m15999q(WorkInfo.ENQUEUED, workSpec.f37524a);
                    workSpecDao_Impl.m15995m(workSpec.f37524a, -1L);
                }
            }
            ((WorkProgressDao_Impl) workProgressDaoMo945t).m15979b();
            workDatabase2.m14537n();
            workDatabase2.m14530f();
            boolean z4 = z3 || z;
            Long lM15973a = ((PreferenceDao_Impl) this.f1409i.f37346k.f37569a.mo942q()).m15973a("reschedule_needed");
            if (lM15973a != null && lM15973a.longValue() == 1) {
                Logger9.m15885c().mo15887a(f1406f, "Rescheduling Workers.", new Throwable[0]);
                this.f1409i.m15917e();
                PreferenceUtils preferenceUtils = this.f1409i.f37346k;
                Objects.requireNonNull(preferenceUtils);
                ((PreferenceDao_Impl) preferenceUtils.f37569a.mo942q()).m15974b(new Preference("reschedule_needed", false));
            } else {
                if (m963b(this.f1408h, 536870912) == null) {
                    m964c(this.f1408h);
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    Logger9.m15885c().mo15887a(f1406f, "Application was force-stopped, rescheduling.", new Throwable[0]);
                    this.f1409i.m15917e();
                } else if (z4) {
                    Logger9.m15885c().mo15887a(f1406f, "Found unfinished work, scheduling it.", new Throwable[0]);
                    WorkManagerImpl workManagerImpl2 = this.f1409i;
                    Schedulers.m15911a(workManagerImpl2.f37341f, workManagerImpl2.f37342g, workManagerImpl2.f37344i);
                }
            }
            WorkManagerImpl workManagerImpl3 = this.f1409i;
            Objects.requireNonNull(workManagerImpl3);
            synchronized (WorkManagerImpl.f37339d) {
                workManagerImpl3.f37347l = true;
                android.content.BroadcastReceiver.PendingResult pendingResult = workManagerImpl3.f37348m;
                if (pendingResult != null) {
                    pendingResult.finish();
                    workManagerImpl3.f37348m = null;
                }
            }
        } catch (Throwable th3) {
            workDatabase2.m14530f();
            throw th3;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean zM16009a;
        WorkManagerImpl workManagerImpl = this.f1409i;
        if (workManagerImpl.f37349n == null) {
            synchronized (WorkManagerImpl.f37339d) {
                if (workManagerImpl.f37349n == null) {
                    workManagerImpl.m15919g();
                    if (workManagerImpl.f37349n == null && !TextUtils.isEmpty(workManagerImpl.f37341f.f37226g)) {
                        throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                    }
                }
            }
        }
        if (workManagerImpl.f37349n == null) {
            zM16009a = true;
        } else {
            Logger9 logger9M15885c = Logger9.m15885c();
            String str = f1406f;
            logger9M15885c.mo15887a(str, "Found a remote implementation for WorkManager", new Throwable[0]);
            zM16009a = ProcessUtils.m16009a(this.f1408h, this.f1409i.f37341f);
            Logger9.m15885c().mo15887a(str, String.format("Is default app process = %s", Boolean.valueOf(zM16009a)), new Throwable[0]);
        }
        if (!zM16009a) {
            return;
        }
        while (true) {
            Context context = this.f1408h;
            String str2 = WorkDatabasePathHelper.f37334a;
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            int i = Build.VERSION.SDK_INT;
            if (i >= 23 && databasePath.exists()) {
                Logger9.m15885c().mo15887a(WorkDatabasePathHelper.f37334a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
                HashMap map = new HashMap();
                if (i >= 23) {
                    File databasePath2 = context.getDatabasePath("androidx.work.workdb");
                    File databasePath3 = i < 23 ? context.getDatabasePath("androidx.work.workdb") : new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
                    map.put(databasePath2, databasePath3);
                    for (String str3 : WorkDatabasePathHelper.f37335b) {
                        map.put(new File(databasePath2.getPath() + str3), new File(databasePath3.getPath() + str3));
                    }
                }
                for (File file : map.keySet()) {
                    File file2 = (File) map.get(file);
                    if (file.exists() && file2 != null) {
                        if (file2.exists()) {
                            Logger9.m15885c().mo15891g(WorkDatabasePathHelper.f37334a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                        }
                        Logger9.m15885c().mo15887a(WorkDatabasePathHelper.f37334a, file.renameTo(file2) ? String.format("Migrated %s to %s", file, file2) : String.format("Renaming %s to %s failed", file, file2), new Throwable[0]);
                    }
                }
            }
            Logger9.m15885c().mo15887a(f1406f, "Performing cleanup operations.", new Throwable[0]);
            try {
                m965a();
                return;
            } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                int i2 = this.f1410j + 1;
                this.f1410j = i2;
                if (i2 >= 3) {
                    Logger9 logger9M15885c2 = Logger9.m15885c();
                    String str4 = f1406f;
                    logger9M15885c2.mo15888b(str4, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                    IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                    InitializationExceptionHandler initializationExceptionHandler = this.f1409i.f37341f.f37225f;
                    if (initializationExceptionHandler == null) {
                        throw illegalStateException;
                    }
                    Logger9.m15885c().mo15887a(str4, "Routing exception to the specified exception handler", illegalStateException);
                    initializationExceptionHandler.m15883a(illegalStateException);
                    return;
                }
                Logger9.m15885c().mo15887a(f1406f, String.format("Retrying after %s", Long.valueOf(((long) i2) * 300)), e);
                try {
                    Thread.sleep(((long) this.f1410j) * 300);
                } catch (InterruptedException unused) {
                }
            }
        }
    }
}
