package p007c.p190n.p194b.p266d.p327k.p329b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4316qc;

/* JADX INFO: renamed from: c.n.b.d.k.b.ba */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4468ba implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC4316qc f23740f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AppMeasurementDynamiteService f23741g;

    public RunnableC4468ba(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC4316qc interfaceC4316qc) {
        this.f23741g = appMeasurementDynamiteService;
        this.f23740f = interfaceC4316qc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f23741g.f28699f.m10837t().m10881O(this.f23740f, this.f23741g.f28699f.m10826B());
    }
}
