package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class lz0 implements zc2<kz0> {

    /* JADX INFO: renamed from: a */
    public final gd2<Context> f16642a;

    /* JADX INFO: renamed from: b */
    public final gd2<C3702xn> f16643b;

    /* JADX INFO: renamed from: c */
    public final gd2<ud0> f16644c;

    /* JADX INFO: renamed from: d */
    public final gd2<Executor> f16645d;

    public lz0(gd2<Context> gd2Var, gd2<C3702xn> gd2Var2, gd2<ud0> gd2Var3, gd2<Executor> gd2Var4) {
        this.f16642a = gd2Var;
        this.f16643b = gd2Var2;
        this.f16644c = gd2Var3;
        this.f16645d = gd2Var4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        Context contextMo4613a = this.f16642a.mo4613a();
        C3702xn c3702xnM8831b = ((C3746yu) this.f16643b).m8831b();
        ud0 ud0VarMo4613a = this.f16644c.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new kz0(contextMo4613a, c3702xnM8831b, ud0VarMo4613a, lv1Var);
    }
}
