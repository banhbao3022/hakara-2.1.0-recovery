package p007c.p190n.p194b.p266d.p327k.p329b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4316qc;

/* JADX INFO: renamed from: c.n.b.d.k.b.c7 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4477c7 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC4316qc f23786f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f23787g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f23788h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f23789i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AppMeasurementDynamiteService f23790j;

    public RunnableC4477c7(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC4316qc interfaceC4316qc, String str, String str2, boolean z) {
        this.f23790j = appMeasurementDynamiteService;
        this.f23786f = interfaceC4316qc;
        this.f23787g = str;
        this.f23788h = str2;
        this.f23789i = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4677t7 c4677t7M10841x = this.f23790j.f28699f.m10841x();
        InterfaceC4316qc interfaceC4316qc = this.f23786f;
        String str = this.f23787g;
        String str2 = this.f23788h;
        boolean z = this.f23789i;
        c4677t7M10841x.mo10381b();
        c4677t7M10841x.m10479t();
        c4677t7M10841x.m10778z(new RunnableC4699v7(c4677t7M10841x, str, str2, z, c4677t7M10841x.m10775I(false), interfaceC4316qc));
    }
}
