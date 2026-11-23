package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: c.n.b.d.j.a.rz */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3491rz implements zc2<Set<bc0<ip2>>> {

    /* JADX INFO: renamed from: a */
    public final gd2<e20> f19425a;

    public C3491rz(C3380oz c3380oz, gd2<e20> gd2Var) {
        this.f19425a = gd2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        Set setSingleton = Collections.singleton(new bc0(this.f19425a.mo4613a(), C2962do.f13335f));
        Objects.requireNonNull(setSingleton, "Cannot return null from a non-@Nullable @Provides method");
        return setSingleton;
    }
}
