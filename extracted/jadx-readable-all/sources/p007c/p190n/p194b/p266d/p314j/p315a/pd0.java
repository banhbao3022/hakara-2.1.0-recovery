package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class pd0 implements zc2<bc0<m90>> {

    /* JADX INFO: renamed from: a */
    public final cd0 f17927a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f17928b;

    public pd0(cd0 cd0Var, gd2<Executor> gd2Var) {
        this.f17927a = cd0Var;
        this.f17928b = gd2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        cd0 cd0Var = this.f17927a;
        Executor executorMo4613a = this.f17928b.mo4613a();
        final InterfaceC3410ps interfaceC3410ps = cd0Var.f12982b;
        return new bc0(new m90(interfaceC3410ps) { // from class: c.n.b.d.j.a.bd0

            /* JADX INFO: renamed from: f */
            public final InterfaceC3410ps f12571f;

            {
                this.f12571f = interfaceC3410ps;
            }

            @Override // p007c.p190n.p194b.p266d.p314j.p315a.m90
            public final void zza() {
                InterfaceC3410ps interfaceC3410ps2 = this.f12571f;
                if (interfaceC3410ps2.mo6436D() != null) {
                    interfaceC3410ps2.mo6436D().m4683a();
                }
            }
        }, executorMo4613a);
    }
}
