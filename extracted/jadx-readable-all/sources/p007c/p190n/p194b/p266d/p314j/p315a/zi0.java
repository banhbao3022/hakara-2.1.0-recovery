package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p007c.p190n.p194b.p266d.p267a.p282z.C2312c;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zi0 implements zc2<yi0> {

    /* JADX INFO: renamed from: a */
    public final gd2<Context> f22291a;

    /* JADX INFO: renamed from: b */
    public final gd2<ki0> f22292b;

    /* JADX INFO: renamed from: c */
    public final gd2<rd2> f22293c;

    /* JADX INFO: renamed from: d */
    public final gd2<C3702xn> f22294d;

    /* JADX INFO: renamed from: e */
    public final gd2<C2312c> f22295e;

    /* JADX INFO: renamed from: f */
    public final gd2<as2> f22296f;

    /* JADX INFO: renamed from: g */
    public final gd2<Executor> f22297g;

    /* JADX INFO: renamed from: h */
    public final gd2<ii1> f22298h;

    /* JADX INFO: renamed from: i */
    public final gd2<rj0> f22299i;

    /* JADX INFO: renamed from: j */
    public final gd2<ScheduledExecutorService> f22300j;

    public zi0(gd2<Context> gd2Var, gd2<ki0> gd2Var2, gd2<rd2> gd2Var3, gd2<C3702xn> gd2Var4, gd2<C2312c> gd2Var5, gd2<as2> gd2Var6, gd2<Executor> gd2Var7, gd2<ii1> gd2Var8, gd2<rj0> gd2Var9, gd2<ScheduledExecutorService> gd2Var10) {
        this.f22291a = gd2Var;
        this.f22292b = gd2Var2;
        this.f22293c = gd2Var3;
        this.f22294d = gd2Var4;
        this.f22295e = gd2Var5;
        this.f22296f = gd2Var6;
        this.f22297g = gd2Var7;
        this.f22298h = gd2Var8;
        this.f22299i = gd2Var9;
        this.f22300j = gd2Var10;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final yi0 mo4613a() {
        Context contextMo4613a = this.f22291a.mo4613a();
        ki0 ki0VarMo4613a = this.f22292b.mo4613a();
        rd2 rd2VarMo4613a = this.f22293c.mo4613a();
        C3702xn c3702xnM8831b = ((C3746yu) this.f22294d).m8831b();
        C2312c c2312cM8699a = C3674ww.m8699a();
        as2 as2VarMo4613a = this.f22296f.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new yi0(contextMo4613a, ki0VarMo4613a, rd2VarMo4613a, c3702xnM8831b, c2312cM8699a, as2VarMo4613a, lv1Var, ((y50) this.f22298h).m8778b(), this.f22299i.mo4613a(), this.f22300j.mo4613a());
    }
}
