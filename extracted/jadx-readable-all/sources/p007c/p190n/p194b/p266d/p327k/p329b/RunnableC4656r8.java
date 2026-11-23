package p007c.p190n.p194b.p266d.p327k.p329b;

import android.content.ComponentName;

/* JADX INFO: renamed from: c.n.b.d.k.b.r8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4656r8 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ServiceConnectionC4610n8 f24409f;

    public RunnableC4656r8(ServiceConnectionC4610n8 serviceConnectionC4610n8) {
        this.f24409f = serviceConnectionC4610n8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4677t7.m10766x(this.f24409f.f24189c, new ComponentName(this.f24409f.f24189c.f24476a.f24528b, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
