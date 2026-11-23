package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class v91 implements zc2<t91> {

    /* JADX INFO: renamed from: a */
    public final gd2<C2885bm> f20716a;

    /* JADX INFO: renamed from: b */
    public final gd2<lv1> f20717b;

    /* JADX INFO: renamed from: c */
    public final gd2<Context> f20718c;

    public v91(gd2<C2885bm> gd2Var, gd2<lv1> gd2Var2, gd2<Context> gd2Var3) {
        this.f20716a = gd2Var;
        this.f20717b = gd2Var2;
        this.f20718c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        C2885bm c2885bmMo4613a = this.f20716a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new t91(c2885bmMo4613a, lv1Var, ((hj1) this.f20718c).m7137b());
    }
}
