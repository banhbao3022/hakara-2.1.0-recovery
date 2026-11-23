package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.concurrent.Executor;
import p007c.p190n.p194b.p266d.p298f.p307u.InterfaceC2782b;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mf0 implements zc2<C3232kz> {

    /* JADX INFO: renamed from: a */
    public final gd2<ep2> f16739a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f16740b;

    /* JADX INFO: renamed from: c */
    public final gd2<Context> f16741c;

    /* JADX INFO: renamed from: d */
    public final gd2<InterfaceC2782b> f16742d;

    public mf0(gd2<ep2> gd2Var, gd2<Executor> gd2Var2, gd2<Context> gd2Var3, gd2<InterfaceC2782b> gd2Var4) {
        this.f16739a = gd2Var;
        this.f16740b = gd2Var2;
        this.f16741c = gd2Var3;
        this.f16742d = gd2Var4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo4613a() {
        ep2 ep2VarMo4613a = this.f16739a.mo4613a();
        Executor executorMo4613a = this.f16740b.mo4613a();
        Context contextMo4613a = this.f16741c.mo4613a();
        return new C3232kz(executorMo4613a, new C3639vy(contextMo4613a, ep2VarMo4613a), this.f16742d.mo4613a());
    }
}
