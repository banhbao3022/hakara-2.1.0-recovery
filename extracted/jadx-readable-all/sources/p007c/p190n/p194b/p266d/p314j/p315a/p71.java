package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class p71 implements zc2<o71> {

    /* JADX INFO: renamed from: a */
    public final gd2<Context> f17873a;

    /* JADX INFO: renamed from: b */
    public final gd2<lv1> f17874b;

    public p71(gd2<Context> gd2Var, gd2<lv1> gd2Var2) {
        this.f17873a = gd2Var;
        this.f17874b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        Context contextM7137b = ((hj1) this.f17873a).m7137b();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new o71(contextM7137b, lv1Var);
    }
}
