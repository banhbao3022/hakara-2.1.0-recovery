package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class v60 implements zc2<t60> {

    /* JADX INFO: renamed from: a */
    public final gd2<s60> f20700a;

    /* JADX INFO: renamed from: b */
    public final gd2<Set<bc0<m60>>> f20701b;

    /* JADX INFO: renamed from: c */
    public final gd2<Executor> f20702c;

    public v60(gd2<s60> gd2Var, gd2<Set<bc0<m60>>> gd2Var2, gd2<Executor> gd2Var3) {
        this.f20700a = gd2Var;
        this.f20701b = gd2Var2;
        this.f20702c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        s60 s60Var = new s60(((ed2) ((u60) this.f20700a).f20223a).mo4613a());
        Set setMo4613a = ((ed2) this.f20701b).mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        return new t60(s60Var, setMo4613a, lv1Var);
    }
}
