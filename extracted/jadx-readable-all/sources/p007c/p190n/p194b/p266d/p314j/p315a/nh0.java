package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nh0 implements zc2<mh0> {

    /* JADX INFO: renamed from: a */
    public final gd2<yl0> f17101a;

    /* JADX INFO: renamed from: b */
    public final gd2<vk0> f17102b;

    /* JADX INFO: renamed from: c */
    public final gd2<C3232kz> f17103c;

    /* JADX INFO: renamed from: d */
    public final gd2<kg0> f17104d;

    public nh0(gd2<yl0> gd2Var, gd2<vk0> gd2Var2, gd2<C3232kz> gd2Var3, gd2<kg0> gd2Var4) {
        this.f17101a = gd2Var;
        this.f17102b = gd2Var2;
        this.f17103c = gd2Var3;
        this.f17104d = gd2Var4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        yl0 yl0VarMo4613a = this.f17101a.mo4613a();
        vk0 vk0VarM7248b = ((if0) this.f17102b).m7248b();
        C3232kz c3232kzMo4613a = this.f17103c.mo4613a();
        af0 af0VarMo4613a = ((hf0) this.f17104d).f14831a.mo4613a();
        Objects.requireNonNull(af0VarMo4613a, "Cannot return null from a non-@Nullable @Provides method");
        return new mh0(yl0VarMo4613a, vk0VarM7248b, c3232kzMo4613a, af0VarMo4613a);
    }
}
