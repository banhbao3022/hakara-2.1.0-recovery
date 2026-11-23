package p007c.p190n.p194b.p266d.p327k.p329b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4316qc;

/* JADX INFO: renamed from: c.n.b.d.k.b.c6 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4476c6 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC4316qc f23784f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AppMeasurementDynamiteService f23785g;

    public RunnableC4476c6(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC4316qc interfaceC4316qc) {
        this.f23785g = appMeasurementDynamiteService;
        this.f23784f = interfaceC4316qc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4677t7 c4677t7M10841x = this.f23785g.f28699f.m10841x();
        InterfaceC4316qc interfaceC4316qc = this.f23784f;
        c4677t7M10841x.mo10381b();
        c4677t7M10841x.m10479t();
        c4677t7M10841x.m10778z(new RunnableC4721x7(c4677t7M10841x, c4677t7M10841x.m10775I(false), interfaceC4316qc));
    }
}
