package p007c.p190n.p194b.p195a.p198j.p203v.p204h;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.facebook.stetho.common.Utf8Charset;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;
import p007c.p165l.p175i0.C1095a;
import p007c.p190n.p194b.p195a.Priority2;
import p007c.p190n.p194b.p195a.p198j.TransportContext;
import p007c.p190n.p194b.p195a.p198j.p203v.p205i.EventStore;
import p007c.p190n.p194b.p195a.p198j.p208y.PriorityMapping;

/* JADX INFO: renamed from: c.n.b.a.j.v.h.d, reason: use source file name */
/* JADX INFO: compiled from: JobInfoScheduler.java */
/* JADX INFO: loaded from: classes.dex */
public class JobInfoScheduler implements WorkScheduler {

    /* JADX INFO: renamed from: a */
    public final Context f5822a;

    /* JADX INFO: renamed from: b */
    public final EventStore f5823b;

    /* JADX INFO: renamed from: c */
    public final SchedulerConfig f5824c;

    public JobInfoScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig) {
        this.f5822a = context;
        this.f5823b = eventStore;
        this.f5824c = schedulerConfig;
    }

    @Override // p007c.p190n.p194b.p195a.p198j.p203v.p204h.WorkScheduler
    /* JADX INFO: renamed from: a */
    public void mo2847a(TransportContext transportContext, int i) {
        boolean z;
        boolean z2;
        char c2;
        ComponentName componentName = new ComponentName(this.f5822a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f5822a.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(this.f5822a.getPackageName().getBytes(Charset.forName(Utf8Charset.NAME)));
        adler32.update(transportContext.mo2808b().getBytes(Charset.forName(Utf8Charset.NAME)));
        adler32.update(ByteBuffer.allocate(4).putInt(PriorityMapping.m2879a(transportContext.mo2810d())).array());
        if (transportContext.mo2809c() != null) {
            adler32.update(transportContext.mo2809c());
        }
        int value = (int) adler32.getValue();
        Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
        while (true) {
            if (it.hasNext()) {
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            break;
        }
        if (z) {
            C1095a.m2397m("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", transportContext);
            return;
        }
        long jMo2863o0 = this.f5823b.mo2863o0(transportContext);
        SchedulerConfig schedulerConfig = this.f5824c;
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        Priority2 priority2Mo2810d = transportContext.mo2810d();
        builder.setMinimumLatency(schedulerConfig.m2848b(priority2Mo2810d, jMo2863o0, i));
        Set<SchedulerConfig.c> setMo2841c = schedulerConfig.mo2839c().get(priority2Mo2810d).mo2841c();
        if (setMo2841c.contains(SchedulerConfig.c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
            z2 = true;
        } else {
            z2 = true;
            builder.setRequiredNetworkType(1);
        }
        if (setMo2841c.contains(SchedulerConfig.c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(z2);
        }
        if (setMo2841c.contains(SchedulerConfig.c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(z2);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", transportContext.mo2808b());
        persistableBundle.putInt("priority", PriorityMapping.m2879a(transportContext.mo2810d()));
        if (transportContext.mo2809c() != null) {
            c2 = 0;
            persistableBundle.putString("extras", Base64.encodeToString(transportContext.mo2809c(), 0));
        } else {
            c2 = 0;
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = new Object[5];
        objArr[c2] = transportContext;
        objArr[1] = Integer.valueOf(value);
        objArr[2] = Long.valueOf(this.f5824c.m2848b(transportContext.mo2810d(), jMo2863o0, i));
        objArr[3] = Long.valueOf(jMo2863o0);
        objArr[4] = Integer.valueOf(i);
        C1095a.m2398n("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr);
        jobScheduler.schedule(builder.build());
    }
}
