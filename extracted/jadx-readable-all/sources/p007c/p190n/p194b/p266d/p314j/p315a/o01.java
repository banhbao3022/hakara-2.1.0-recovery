package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class o01 implements dv1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f17479a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f17480b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ rh1 f17481c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ uh1 f17482d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ p01 f17483e;

    public o01(p01 p01Var, long j2, String str, rh1 rh1Var, uh1 uh1Var) {
        this.f17483e = p01Var;
        this.f17479a = j2;
        this.f17480b = str;
        this.f17481c = rh1Var;
        this.f17482d = uh1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: a */
    public final void mo4616a(Throwable th) {
        int i;
        yv2 yv2Var;
        long jMo5621a = this.f17483e.f17805a.mo5621a() - this.f17479a;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof d01) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else if (th instanceof mi1) {
            i = 5;
        } else {
            i = ((th instanceof or0) && C2622l.m5465z0(th).f22116f == 3) ? 1 : 6;
        }
        p01.m8076a(this.f17483e, this.f17480b, i, jMo5621a, this.f17481c.f18804a0);
        p01 p01Var = this.f17483e;
        if (p01Var.f17808d) {
            p01Var.f17806b.m8173a(this.f17482d, this.f17481c, i, th instanceof gx0 ? (gx0) th : null, jMo5621a);
        }
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14279U4)).booleanValue()) {
            yv2 yv2VarM5465z0 = C2622l.m5465z0(th);
            int i2 = yv2VarM5465z0.f22116f;
            if ((i2 == 3 || i2 == 0) && (yv2Var = yv2VarM5465z0.f22119i) != null && !yv2Var.f22118h.equals("com.google.android.gms.ads")) {
                yv2VarM5465z0 = C2622l.m5465z0(new gx0(13, yv2VarM5465z0.f22119i));
            }
            this.f17483e.f17809e.m7179a(this.f17481c, jMo5621a, yv2VarM5465z0);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: b */
    public final void mo4617b(Object obj) {
        long jMo5621a = this.f17483e.f17805a.mo5621a() - this.f17479a;
        p01.m8076a(this.f17483e, this.f17480b, 0, jMo5621a, this.f17481c.f18804a0);
        p01 p01Var = this.f17483e;
        if (p01Var.f17808d) {
            p01Var.f17806b.m8173a(this.f17482d, this.f17481c, 0, null, jMo5621a);
        }
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14279U4)).booleanValue()) {
            this.f17483e.f17809e.m7179a(this.f17481c, jMo5621a, null);
        }
    }
}
