package p007c.p190n.p194b.p266d.p327k.p329b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4316qc;

/* JADX INFO: renamed from: c.n.b.d.k.b.c9 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4479c9 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC4316qc f23792f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f23793g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f23794h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AppMeasurementDynamiteService f23795i;

    public RunnableC4479c9(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC4316qc interfaceC4316qc, String str, String str2) {
        this.f23795i = appMeasurementDynamiteService;
        this.f23792f = interfaceC4316qc;
        this.f23793g = str;
        this.f23794h = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4677t7 c4677t7M10841x = this.f23795i.f28699f.m10841x();
        InterfaceC4316qc interfaceC4316qc = this.f23792f;
        String str = this.f23793g;
        String str2 = this.f23794h;
        c4677t7M10841x.mo10381b();
        c4677t7M10841x.m10479t();
        c4677t7M10841x.m10778z(new RunnableC4586l8(c4677t7M10841x, str, str2, c4677t7M10841x.m10775I(false), interfaceC4316qc));
    }
}
