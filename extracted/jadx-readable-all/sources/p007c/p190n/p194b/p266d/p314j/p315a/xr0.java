package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class xr0 implements zc2<kv1<String>> {

    /* JADX INFO: renamed from: a */
    public final gd2<rd2> f21661a;

    /* JADX INFO: renamed from: b */
    public final gd2<Context> f21662b;

    /* JADX INFO: renamed from: c */
    public final gd2<lv1> f21663c;

    public xr0(gd2<rd2> gd2Var, gd2<Context> gd2Var2, gd2<lv1> gd2Var3) {
        this.f21661a = gd2Var;
        this.f21662b = gd2Var2;
        this.f21663c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        final rd2 rd2VarMo4613a = this.f21661a.mo4613a();
        final Context contextM7137b = ((hj1) this.f21662b).m7137b();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        kv1 kv1VarMo6691u0 = lv1Var.mo6691u0(new Callable(rd2VarMo4613a, contextM7137b) { // from class: c.n.b.d.j.a.wr0

            /* JADX INFO: renamed from: a */
            public final rd2 f21310a;

            /* JADX INFO: renamed from: b */
            public final Context f21311b;

            {
                this.f21310a = rd2VarMo4613a;
                this.f21311b = contextM7137b;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                rd2 rd2Var = this.f21310a;
                return rd2Var.f18750d.mo4857f(this.f21311b);
            }
        });
        Objects.requireNonNull(kv1VarMo6691u0, "Cannot return null from a non-@Nullable @Provides method");
        return kv1VarMo6691u0;
    }
}
