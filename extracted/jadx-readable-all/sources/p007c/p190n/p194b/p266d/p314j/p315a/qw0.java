package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class qw0 implements zc2<pw0> {

    /* JADX INFO: renamed from: a */
    public final gd2<Context> f18653a;

    /* JADX INFO: renamed from: b */
    public final gd2<lv1> f18654b;

    public qw0(gd2<Context> gd2Var, gd2<lv1> gd2Var2) {
        this.f18653a = gd2Var;
        this.f18654b = gd2Var2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        Context contextM8156b = ((C3412pu) this.f18653a).m8156b();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new pw0(contextM8156b, lv1Var);
    }
}
