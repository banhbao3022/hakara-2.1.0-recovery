package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import p007c.p190n.p194b.p195a.p198j.AutoValue_TransportContext;
import p007c.p190n.p194b.p195a.p198j.TransportContext;
import p007c.p190n.p194b.p195a.p198j.TransportRuntime;
import p007c.p190n.p194b.p195a.p198j.p203v.p204h.Uploader;
import p007c.p190n.p194b.p195a.p198j.p203v.p204h.Uploader6;
import p007c.p190n.p194b.p195a.p198j.p208y.PriorityMapping;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f28311f = 0;

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        TransportRuntime.m2821b(getApplicationContext());
        TransportContext.a aVarM2819a = TransportContext.m2819a();
        aVarM2819a.mo2812b(string);
        aVarM2819a.mo2814d(PriorityMapping.m2880b(i));
        if (string2 != null) {
            ((AutoValue_TransportContext.b) aVarM2819a).f5721b = Base64.decode(string2, 0);
        }
        Uploader6 uploader6 = TransportRuntime.m2820a().f5753e;
        uploader6.f5852e.execute(new Uploader(uploader6, aVarM2819a.mo2811a(), i2, new Runnable(this, jobParameters) { // from class: c.n.b.a.j.v.h.e

            /* JADX INFO: renamed from: f */
            public final JobInfoSchedulerService f5825f;

            /* JADX INFO: renamed from: g */
            public final JobParameters f5826g;

            {
                this.f5825f = this;
                this.f5826g = jobParameters;
            }

            @Override // java.lang.Runnable
            public void run() {
                JobInfoSchedulerService jobInfoSchedulerService = this.f5825f;
                JobParameters jobParameters2 = this.f5826g;
                int i3 = JobInfoSchedulerService.f28311f;
                jobInfoSchedulerService.jobFinished(jobParameters2, false);
            }
        }));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
