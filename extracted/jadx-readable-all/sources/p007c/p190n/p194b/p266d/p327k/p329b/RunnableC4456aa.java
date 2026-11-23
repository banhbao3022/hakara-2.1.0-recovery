package p007c.p190n.p194b.p266d.p327k.p329b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: c.n.b.d.k.b.aa */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4456aa implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AppMeasurementDynamiteService.C5901a f23720f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AppMeasurementDynamiteService f23721g;

    public RunnableC4456aa(AppMeasurementDynamiteService appMeasurementDynamiteService, AppMeasurementDynamiteService.C5901a c5901a) {
        this.f23721g = appMeasurementDynamiteService;
        this.f23720f = c5901a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23721g.f28699f.m10836s().m10512B(this.f23720f);
    }
}
