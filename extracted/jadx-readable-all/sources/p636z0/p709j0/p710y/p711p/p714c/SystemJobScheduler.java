package p636z0.p709j0.p710y.p711p.p714c;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p636z0.p709j0.Configuration;
import p636z0.p709j0.Logger9;
import p636z0.p709j0.WorkInfo;
import p636z0.p709j0.p710y.Scheduler2;
import p636z0.p709j0.p710y.WorkManagerImpl;
import p636z0.p709j0.p710y.p719s.SystemIdInfo;
import p636z0.p709j0.p710y.p719s.SystemIdInfoDao_Impl;
import p636z0.p709j0.p710y.p719s.WorkSpec;
import p636z0.p709j0.p710y.p719s.WorkSpecDao_Impl;
import p636z0.p709j0.p710y.p720t.IdGenerator;

/* JADX INFO: renamed from: z0.j0.y.p.c.b, reason: use source file name */
/* JADX INFO: compiled from: SystemJobScheduler.java */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobScheduler implements Scheduler2 {

    /* JADX INFO: renamed from: f */
    public static final String f37438f = Logger9.m15886e("SystemJobScheduler");

    /* JADX INFO: renamed from: g */
    public final Context f37439g;

    /* JADX INFO: renamed from: h */
    public final JobScheduler f37440h;

    /* JADX INFO: renamed from: i */
    public final WorkManagerImpl f37441i;

    /* JADX INFO: renamed from: j */
    public final SystemJobInfoConverter f37442j;

    public SystemJobScheduler(Context context, WorkManagerImpl workManagerImpl) {
        this(context, workManagerImpl, (JobScheduler) context.getSystemService("jobscheduler"), new SystemJobInfoConverter(context));
    }

    /* JADX INFO: renamed from: b */
    public static void m15944b(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            Logger9.m15885c().mo15888b(f37438f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static List<Integer> m15945d(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listM15946f = m15946f(context, jobScheduler);
        if (listM15946f == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listM15946f) {
            if (str.equals(m15947g(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static List<JobInfo> m15946f(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            Logger9.m15885c().mo15888b(f37438f, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static String m15947g(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // p636z0.p709j0.p710y.Scheduler2
    /* JADX INFO: renamed from: a */
    public void mo15908a(WorkSpec... workSpecArr) {
        int iM16007b;
        List<Integer> listM15945d;
        int iM16007b2;
        WorkDatabase workDatabase = this.f37441i.f37342g;
        IdGenerator idGenerator = new IdGenerator(workDatabase);
        for (WorkSpec workSpec : workSpecArr) {
            workDatabase.m14529c();
            try {
                WorkSpec workSpecM15992j = ((WorkSpecDao_Impl) workDatabase.mo946u()).m15992j(workSpec.f37524a);
                if (workSpecM15992j == null) {
                    Logger9.m15885c().mo15891g(f37438f, "Skipping scheduling " + workSpec.f37524a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.m14537n();
                } else if (workSpecM15992j.f37525b != WorkInfo.ENQUEUED) {
                    Logger9.m15885c().mo15891g(f37438f, "Skipping scheduling " + workSpec.f37524a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.m14537n();
                } else {
                    SystemIdInfo systemIdInfoM15975a = ((SystemIdInfoDao_Impl) workDatabase.mo943r()).m15975a(workSpec.f37524a);
                    if (systemIdInfoM15975a != null) {
                        iM16007b = systemIdInfoM15975a.f37510b;
                    } else {
                        Configuration configuration = this.f37441i.f37341f;
                        iM16007b = idGenerator.m16007b(configuration.f37228i, configuration.f37229j);
                    }
                    if (systemIdInfoM15975a == null) {
                        ((SystemIdInfoDao_Impl) this.f37441i.f37342g.mo943r()).m15976b(new SystemIdInfo(workSpec.f37524a, iM16007b));
                    }
                    m15948h(workSpec, iM16007b);
                    if (Build.VERSION.SDK_INT == 23 && (listM15945d = m15945d(this.f37439g, this.f37440h, workSpec.f37524a)) != null) {
                        int iIndexOf = listM15945d.indexOf(Integer.valueOf(iM16007b));
                        if (iIndexOf >= 0) {
                            listM15945d.remove(iIndexOf);
                        }
                        if (listM15945d.isEmpty()) {
                            Configuration configuration2 = this.f37441i.f37341f;
                            iM16007b2 = idGenerator.m16007b(configuration2.f37228i, configuration2.f37229j);
                        } else {
                            iM16007b2 = listM15945d.get(0).intValue();
                        }
                        m15948h(workSpec, iM16007b2);
                    }
                    workDatabase.m14537n();
                }
                workDatabase.m14530f();
            } catch (Throwable th) {
                workDatabase.m14530f();
                throw th;
            }
        }
    }

    @Override // p636z0.p709j0.p710y.Scheduler2
    /* JADX INFO: renamed from: c */
    public boolean mo15909c() {
        return true;
    }

    @Override // p636z0.p709j0.p710y.Scheduler2
    /* JADX INFO: renamed from: e */
    public void mo15910e(String str) {
        List<Integer> listM15945d = m15945d(this.f37439g, this.f37440h, str);
        if (listM15945d == null || listM15945d.isEmpty()) {
            return;
        }
        Iterator<Integer> it = listM15945d.iterator();
        while (it.hasNext()) {
            m15944b(this.f37440h, it.next().intValue());
        }
        ((SystemIdInfoDao_Impl) this.f37441i.f37342g.mo943r()).m15977c(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 26) goto L16;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m15948h(p636z0.p709j0.p710y.p719s.WorkSpec r17, int r18) {
        /*
            Method dump skipped, instruction units count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p636z0.p709j0.p710y.p711p.p714c.SystemJobScheduler.m15948h(z0.j0.y.s.p, int):void");
    }

    public SystemJobScheduler(Context context, WorkManagerImpl workManagerImpl, JobScheduler jobScheduler, SystemJobInfoConverter systemJobInfoConverter) {
        this.f37439g = context;
        this.f37441i = workManagerImpl;
        this.f37440h = jobScheduler;
        this.f37442j = systemJobInfoConverter;
    }
}
