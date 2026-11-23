package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class h71 implements zc2<f71> {

    /* JADX INFO: renamed from: a */
    public final gd2<lv1> f14773a;

    /* JADX INFO: renamed from: b */
    public final gd2<rm0> f14774b;

    /* JADX INFO: renamed from: c */
    public final gd2<ii1> f14775c;

    /* JADX INFO: renamed from: d */
    public final gd2<String> f14776d;

    public h71(gd2<lv1> gd2Var, gd2<rm0> gd2Var2, gd2<ii1> gd2Var3, gd2<String> gd2Var4) {
        this.f14773a = gd2Var;
        this.f14774b = gd2Var2;
        this.f14775c = gd2Var3;
        this.f14776d = gd2Var4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new f71(lv1Var, this.f14774b.mo4613a(), ((y50) this.f14775c).m8778b(), this.f14776d.mo4613a());
    }
}
