package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class am1 implements zc2<yl1> {

    /* JADX INFO: renamed from: a */
    public final gd2<lv1> f12210a;

    /* JADX INFO: renamed from: b */
    public final gd2<ScheduledExecutorService> f12211b;

    /* JADX INFO: renamed from: c */
    public final gd2<xl1> f12212c;

    public am1(gd2<lv1> gd2Var, gd2<ScheduledExecutorService> gd2Var2, gd2<xl1> gd2Var3) {
        this.f12210a = gd2Var;
        this.f12211b = gd2Var2;
        this.f12212c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new yl1(lv1Var, this.f12211b.mo4613a(), new xl1(((ed2) ((bm1) this.f12212c).f12745a).mo4613a()));
    }
}
