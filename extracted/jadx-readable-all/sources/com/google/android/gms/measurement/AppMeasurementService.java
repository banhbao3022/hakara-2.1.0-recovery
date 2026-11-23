package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p327k.p329b.BinderC4463b5;
import p007c.p190n.p194b.p266d.p327k.p329b.C4611n9;
import p007c.p190n.p194b.p266d.p327k.p329b.C4662s3;
import p007c.p190n.p194b.p266d.p327k.p329b.C4667s8;
import p007c.p190n.p194b.p266d.p327k.p329b.C4707w4;
import p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4711w8;
import p007c.p190n.p194b.p266d.p327k.p329b.RunnableC4722x8;
import p636z0.p757r.p758a.WakefulBroadcastReceiver;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements InterfaceC4711w8 {

    /* JADX INFO: renamed from: f */
    public C4667s8<AppMeasurementService> f28698f;

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4711w8
    /* JADX INFO: renamed from: a */
    public final void mo10844a(Intent intent) {
        SparseArray<PowerManager.WakeLock> sparseArray = WakefulBroadcastReceiver.f38663a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray<PowerManager.WakeLock> sparseArray2 = WakefulBroadcastReceiver.f38663a;
        synchronized (sparseArray2) {
            PowerManager.WakeLock wakeLock = sparseArray2.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                sparseArray2.remove(intExtra);
            } else {
                Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4711w8
    /* JADX INFO: renamed from: b */
    public final boolean mo10845b(int i) {
        return stopSelfResult(i);
    }

    @Override // p007c.p190n.p194b.p266d.p327k.p329b.InterfaceC4711w8
    /* JADX INFO: renamed from: c */
    public final void mo10846c(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: d */
    public final C4667s8<AppMeasurementService> m12676d() {
        if (this.f28698f == null) {
            this.f28698f = new C4667s8<>(this);
        }
        return this.f28698f;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        C4667s8<AppMeasurementService> c4667s8M12676d = m12676d();
        Objects.requireNonNull(c4667s8M12676d);
        if (intent == null) {
            c4667s8M12676d.m10753b().f24418f.m10811a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new BinderC4463b5(C4611n9.m10651b(c4667s8M12676d.f24431a));
        }
        c4667s8M12676d.m10753b().f24421i.m10812b("onBind received unknown action", action);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        C4707w4.m10821b(m12676d().f24431a, null, null).mo10684l().f24426n.m10811a("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        C4707w4.m10821b(m12676d().f24431a, null, null).mo10684l().f24426n.m10811a("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        m12676d().m10754c(intent);
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        final C4667s8<AppMeasurementService> c4667s8M12676d = m12676d();
        final C4662s3 c4662s3Mo10684l = C4707w4.m10821b(c4667s8M12676d.f24431a, null, null).mo10684l();
        if (intent == null) {
            c4662s3Mo10684l.f24421i.m10811a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        c4662s3Mo10684l.f24426n.m10813c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable(c4667s8M12676d, i2, c4662s3Mo10684l, intent) { // from class: c.n.b.d.k.b.v8

            /* JADX INFO: renamed from: f */
            public final C4667s8 f24507f;

            /* JADX INFO: renamed from: g */
            public final int f24508g;

            /* JADX INFO: renamed from: h */
            public final C4662s3 f24509h;

            /* JADX INFO: renamed from: i */
            public final Intent f24510i;

            {
                this.f24507f = c4667s8M12676d;
                this.f24508g = i2;
                this.f24509h = c4662s3Mo10684l;
                this.f24510i = intent;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C4667s8 c4667s8 = this.f24507f;
                int i3 = this.f24508g;
                C4662s3 c4662s3 = this.f24509h;
                Intent intent2 = this.f24510i;
                if (c4667s8.f24431a.mo10845b(i3)) {
                    c4662s3.f24426n.m10812b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i3));
                    c4667s8.m10753b().f24426n.m10811a("Completed wakeful intent.");
                    c4667s8.f24431a.mo10844a(intent2);
                }
            }
        };
        C4611n9 c4611n9M10651b = C4611n9.m10651b(c4667s8M12676d.f24431a);
        c4611n9M10651b.mo10686n().m10758v(new RunnableC4722x8(c4611n9M10651b, runnable));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        m12676d().m10752a(intent);
        return true;
    }
}
