package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class r91 implements zc2<p91> {

    /* JADX INFO: renamed from: a */
    public final gd2<lv1> f18720a;

    /* JADX INFO: renamed from: b */
    public final gd2<ScheduledExecutorService> f18721b;

    /* JADX INFO: renamed from: c */
    public final gd2<String> f18722c;

    /* JADX INFO: renamed from: d */
    public final gd2<e31> f18723d;

    /* JADX INFO: renamed from: e */
    public final gd2<Context> f18724e;

    /* JADX INFO: renamed from: f */
    public final gd2<ii1> f18725f;

    /* JADX INFO: renamed from: g */
    public final gd2<z21> f18726g;

    public r91(gd2<lv1> gd2Var, gd2<ScheduledExecutorService> gd2Var2, gd2<String> gd2Var3, gd2<e31> gd2Var4, gd2<Context> gd2Var5, gd2<ii1> gd2Var6, gd2<z21> gd2Var7) {
        this.f18720a = gd2Var;
        this.f18721b = gd2Var2;
        this.f18722c = gd2Var3;
        this.f18723d = gd2Var4;
        this.f18724e = gd2Var5;
        this.f18725f = gd2Var6;
        this.f18726g = gd2Var7;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new p91(lv1Var, this.f18721b.mo4613a(), this.f18722c.mo4613a(), this.f18723d.mo4613a(), this.f18724e.mo4613a(), ((y50) this.f18725f).m8778b(), this.f18726g.mo4613a());
    }
}
