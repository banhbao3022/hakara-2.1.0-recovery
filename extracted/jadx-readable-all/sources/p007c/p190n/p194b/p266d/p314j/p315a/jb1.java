package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class jb1 implements zc2<hb1> {

    /* JADX INFO: renamed from: a */
    public final gd2<InterfaceC3511si> f15546a;

    /* JADX INFO: renamed from: b */
    public final gd2<Context> f15547b;

    /* JADX INFO: renamed from: c */
    public final gd2<String> f15548c;

    /* JADX INFO: renamed from: d */
    public final gd2<lv1> f15549d;

    public jb1(gd2<InterfaceC3511si> gd2Var, gd2<Context> gd2Var2, gd2<String> gd2Var3, gd2<lv1> gd2Var4) {
        this.f15546a = gd2Var;
        this.f15547b = gd2Var2;
        this.f15548c = gd2Var3;
        this.f15549d = gd2Var4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        Context contextM8156b = ((C3412pu) this.f15547b).m8156b();
        String str = ((jc1) this.f15548c).f15553a.f15140a.f18298i;
        Objects.requireNonNull(str, "Cannot return null from a non-@Nullable @Provides method");
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new hb1(null, contextM8156b, str, lv1Var);
    }
}
