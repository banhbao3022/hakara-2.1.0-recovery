package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p327k.p329b.C4611n9;
import p007c.p190n.p194b.p266d.p327k.p329b.C4662s3;
import p007c.p190n.p194b.p266d.p327k.p329b.C4667s8;
import p007c.p190n.p194b.p266d.p327k.p329b.C4707w4;
import p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4711w8;
import p007c.p190n.p194b.p266d.p327k.p329b.RunnableC4722x8;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements InterfaceC4711w8 {

    /* JADX INFO: renamed from: f */
    public C4667s8<AppMeasurementJobService> f28696f;

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4711w8
    /* JADX INFO: renamed from: a */
    public final void mo10844a(Intent intent) {
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4711w8
    /* JADX INFO: renamed from: b */
    public final boolean mo10845b(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4711w8
    @TargetApi(24)
    /* JADX INFO: renamed from: c */
    public final void mo10846c(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    /* JADX INFO: renamed from: d */
    public final C4667s8<AppMeasurementJobService> m12675d() {
        if (this.f28696f == null) {
            this.f28696f = new C4667s8<>(this);
        }
        return this.f28696f;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        C4707w4.m10821b(m12675d().f24431a, null, null).mo10684l().f24426n.m10811a("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C4707w4.m10821b(m12675d().f24431a, null, null).mo10684l().f24426n.m10811a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m12675d().m10754c(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(final JobParameters jobParameters) {
        final C4667s8<AppMeasurementJobService> c4667s8M12675d = m12675d();
        final C4662s3 c4662s3Mo10684l = C4707w4.m10821b(c4667s8M12675d.f24431a, null, null).mo10684l();
        String string = jobParameters.getExtras().getString("action");
        c4662s3Mo10684l.f24426n.m10812b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        Runnable runnable = new Runnable(c4667s8M12675d, c4662s3Mo10684l, jobParameters) { // from class: c.n.b.d.k.b.u8

            /* JADX INFO: renamed from: f */
            public final C4667s8 f24483f;

            /* JADX INFO: renamed from: g */
            public final C4662s3 f24484g;

            /* JADX INFO: renamed from: h */
            public final JobParameters f24485h;

            {
                this.f24483f = c4667s8M12675d;
                this.f24484g = c4662s3Mo10684l;
                this.f24485h = jobParameters;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C4667s8 c4667s8 = this.f24483f;
                C4662s3 c4662s3 = this.f24484g;
                JobParameters jobParameters2 = this.f24485h;
                Objects.requireNonNull(c4667s8);
                c4662s3.f24426n.m10811a("AppMeasurementJobService processed last upload request.");
                c4667s8.f24431a.mo10846c(jobParameters2, false);
            }
        };
        C4611n9 c4611n9M10651b = C4611n9.m10651b(c4667s8M12675d.f24431a);
        c4611n9M10651b.mo10686n().m10758v(new RunnableC4722x8(c4611n9M10651b, runnable));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        m12675d().m10752a(intent);
        return true;
    }
}
