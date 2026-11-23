package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ld0 implements zc2<Set<bc0<i60>>> {

    /* JADX INFO: renamed from: a */
    public final cd0 f16318a;

    /* JADX INFO: renamed from: b */
    public final gd2<i50> f16319b;

    public ld0(cd0 cd0Var, gd2<i50> gd2Var) {
        this.f16318a = cd0Var;
        this.f16319b = gd2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        Set<bc0<i60>> setMo6169a = this.f16318a.mo6169a(this.f16319b.mo4613a());
        Objects.requireNonNull(setMo6169a, "Cannot return null from a non-@Nullable @Provides method");
        return setMo6169a;
    }
}
