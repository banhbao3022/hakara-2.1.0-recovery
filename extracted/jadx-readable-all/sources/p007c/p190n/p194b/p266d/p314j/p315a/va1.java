package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class va1 implements zc2<ua1> {

    /* JADX INFO: renamed from: a */
    public final gd2<lv1> f20721a;

    /* JADX INFO: renamed from: b */
    public final gd2<Context> f20722b;

    public va1(gd2<lv1> gd2Var, gd2<Context> gd2Var2) {
        this.f20721a = gd2Var;
        this.f20722b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new ua1(lv1Var, ((hj1) this.f20722b).m7137b());
    }
}
