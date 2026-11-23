package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class pb1 implements zc2<nb1> {

    /* JADX INFO: renamed from: a */
    public final gd2<C3701xm> f17899a;

    /* JADX INFO: renamed from: b */
    public final gd2<Integer> f17900b;

    /* JADX INFO: renamed from: c */
    public final gd2<Context> f17901c;

    /* JADX INFO: renamed from: d */
    public final gd2<C2998en> f17902d;

    /* JADX INFO: renamed from: e */
    public final gd2<ScheduledExecutorService> f17903e;

    /* JADX INFO: renamed from: f */
    public final gd2<Executor> f17904f;

    public pb1(gd2<C3701xm> gd2Var, gd2<Integer> gd2Var2, gd2<Context> gd2Var3, gd2<C2998en> gd2Var4, gd2<ScheduledExecutorService> gd2Var5, gd2<Executor> gd2Var6) {
        this.f17899a = gd2Var;
        this.f17900b = gd2Var2;
        this.f17901c = gd2Var3;
        this.f17902d = gd2Var4;
        this.f17903e = gd2Var5;
        this.f17904f = gd2Var6;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        C3701xm c3701xm = new C3701xm();
        int iIntValue = ((lc1) this.f17900b).mo4613a().intValue();
        Context contextM8156b = ((C3412pu) this.f17901c).m8156b();
        C2998en c2998enMo4613a = this.f17902d.mo4613a();
        ScheduledExecutorService scheduledExecutorServiceMo4613a = this.f17903e.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new nb1(c3701xm, iIntValue, contextM8156b, c2998enMo4613a, scheduledExecutorServiceMo4613a, lv1Var, null);
    }
}
