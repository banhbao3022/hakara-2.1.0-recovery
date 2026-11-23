package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ab1 implements zc2<ya1> {

    /* JADX INFO: renamed from: a */
    public final gd2<C3701xm> f12058a;

    /* JADX INFO: renamed from: b */
    public final gd2<Context> f12059b;

    /* JADX INFO: renamed from: c */
    public final gd2<ScheduledExecutorService> f12060c;

    /* JADX INFO: renamed from: d */
    public final gd2<Executor> f12061d;

    /* JADX INFO: renamed from: e */
    public final gd2<Integer> f12062e;

    public ab1(gd2<C3701xm> gd2Var, gd2<Context> gd2Var2, gd2<ScheduledExecutorService> gd2Var3, gd2<Executor> gd2Var4, gd2<Integer> gd2Var5) {
        this.f12058a = gd2Var;
        this.f12059b = gd2Var2;
        this.f12060c = gd2Var3;
        this.f12061d = gd2Var4;
        this.f12062e = gd2Var5;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        C3701xm c3701xm = new C3701xm();
        Context contextM8156b = ((C3412pu) this.f12059b).m8156b();
        ScheduledExecutorService scheduledExecutorServiceMo4613a = this.f12060c.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new ya1(c3701xm, contextM8156b, scheduledExecutorServiceMo4613a, lv1Var, ((lc1) this.f12062e).mo4613a().intValue(), null);
    }
}
