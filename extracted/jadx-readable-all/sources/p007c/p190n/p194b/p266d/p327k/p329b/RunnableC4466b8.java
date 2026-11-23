package p007c.p190n.p194b.p266d.p327k.p329b;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Objects;
import p007c.p190n.p194b.p266d.p298f.C2610f;
import p007c.p190n.p194b.p266d.p314j.p325k.InterfaceC4316qc;

/* JADX INFO: renamed from: c.n.b.d.k.b.b8 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-sdk@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4466b8 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC4316qc f23734f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4625p f23735g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f23736h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AppMeasurementDynamiteService f23737i;

    public RunnableC4466b8(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC4316qc interfaceC4316qc, C4625p c4625p, String str) {
        this.f23737i = appMeasurementDynamiteService;
        this.f23734f = interfaceC4316qc;
        this.f23735g = c4625p;
        this.f23736h = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4677t7 c4677t7M10841x = this.f23737i.f28699f.m10841x();
        InterfaceC4316qc interfaceC4316qc = this.f23734f;
        C4625p c4625p = this.f23735g;
        String str = this.f23736h;
        c4677t7M10841x.mo10381b();
        c4677t7M10841x.m10479t();
        C4723x9 c4723x9M10817f = c4677t7M10841x.m10817f();
        Objects.requireNonNull(c4723x9M10817f);
        if (C2610f.f11568b.mo5207d(c4723x9M10817f.f24476a.f24528b, 12451000) == 0) {
            c4677t7M10841x.m10778z(new RunnableC4514f8(c4677t7M10841x, c4625p, str, interfaceC4316qc));
        } else {
            c4677t7M10841x.mo10684l().f24421i.m10811a("Not bundling data. Service unavailable or out of date");
            c4677t7M10841x.m10817f().m10882P(interfaceC4316qc, new byte[0]);
        }
    }
}
