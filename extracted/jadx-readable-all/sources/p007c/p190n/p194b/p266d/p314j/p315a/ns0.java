package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ns0 implements zc2<ms0> {

    /* JADX INFO: renamed from: a */
    public final gd2<ScheduledExecutorService> f17257a;

    /* JADX INFO: renamed from: b */
    public final gd2<lv1> f17258b;

    /* JADX INFO: renamed from: c */
    public final gd2<ct0> f17259c;

    /* JADX INFO: renamed from: d */
    public final gd2<pu0> f17260d;

    public ns0(gd2<ScheduledExecutorService> gd2Var, gd2<lv1> gd2Var2, gd2<ct0> gd2Var3, gd2<pu0> gd2Var4) {
        this.f17257a = gd2Var;
        this.f17258b = gd2Var2;
        this.f17259c = gd2Var3;
        this.f17260d = gd2Var4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ms0 mo4613a() {
        ScheduledExecutorService scheduledExecutorServiceMo4613a = this.f17257a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new ms0(scheduledExecutorServiceMo4613a, lv1Var, new ct0(((C3412pu) ((et0) this.f17259c).f13688a).m8156b()), yc2.m8792c(this.f17260d));
    }
}
