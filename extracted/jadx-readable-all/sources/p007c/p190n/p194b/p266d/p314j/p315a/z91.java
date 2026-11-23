package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class z91 implements zc2<x91> {

    /* JADX INFO: renamed from: a */
    public final gd2<lv1> f22203a;

    /* JADX INFO: renamed from: b */
    public final gd2<Context> f22204b;

    /* JADX INFO: renamed from: c */
    public final gd2<C3702xn> f22205c;

    public z91(gd2<lv1> gd2Var, gd2<Context> gd2Var2, gd2<C3702xn> gd2Var3) {
        this.f22203a = gd2Var;
        this.f22204b = gd2Var2;
        this.f22205c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new x91(lv1Var, ((hj1) this.f22204b).m7137b(), ((C3746yu) this.f22205c).m8831b());
    }
}
