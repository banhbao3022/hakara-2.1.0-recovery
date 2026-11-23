package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mq0 implements zc2<lq0> {

    /* JADX INFO: renamed from: a */
    public final gd2<Executor> f16826a;

    /* JADX INFO: renamed from: b */
    public final gd2<Context> f16827b;

    /* JADX INFO: renamed from: c */
    public final gd2<WeakReference<Context>> f16828c;

    /* JADX INFO: renamed from: d */
    public final gd2<Executor> f16829d;

    /* JADX INFO: renamed from: e */
    public final gd2<mm0> f16830e;

    /* JADX INFO: renamed from: f */
    public final gd2<ScheduledExecutorService> f16831f;

    /* JADX INFO: renamed from: g */
    public final gd2<yo0> f16832g;

    /* JADX INFO: renamed from: h */
    public final gd2<C3702xn> f16833h;

    /* JADX INFO: renamed from: i */
    public final gd2<nb0> f16834i;

    public mq0(gd2<Executor> gd2Var, gd2<Context> gd2Var2, gd2<WeakReference<Context>> gd2Var3, gd2<Executor> gd2Var4, gd2<mm0> gd2Var5, gd2<ScheduledExecutorService> gd2Var6, gd2<yo0> gd2Var7, gd2<C3702xn> gd2Var8, gd2<nb0> gd2Var9) {
        this.f16826a = gd2Var;
        this.f16827b = gd2Var2;
        this.f16828c = gd2Var3;
        this.f16829d = gd2Var4;
        this.f16830e = gd2Var5;
        this.f16831f = gd2Var6;
        this.f16832g = gd2Var7;
        this.f16833h = gd2Var8;
        this.f16834i = gd2Var9;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        Executor executorMo4613a = this.f16826a.mo4613a();
        Context contextM8156b = ((C3412pu) this.f16827b).m8156b();
        WeakReference<Context> weakReference = ((C3449qu) this.f16828c).f18438a.f17276c;
        Objects.requireNonNull(weakReference, "Cannot return null from a non-@Nullable @Provides method");
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new lq0(executorMo4613a, contextM8156b, weakReference, lv1Var, this.f16830e.mo4613a(), this.f16831f.mo4613a(), this.f16832g.mo4613a(), ((C3746yu) this.f16833h).m8831b(), new nb0(((ed2) ((ob0) this.f16834i).f17590a).mo4613a()));
    }
}
