package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: c.n.b.d.j.a.qz */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3454qz implements zc2<Set<bc0<u70>>> {

    /* JADX INFO: renamed from: a */
    public final gd2<e20> f18667a;

    public C3454qz(C3380oz c3380oz, gd2<e20> gd2Var) {
        this.f18667a = gd2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        Set setSingleton = Collections.singleton(new bc0(this.f18667a.mo4613a(), C2962do.f13335f));
        Objects.requireNonNull(setSingleton, "Cannot return null from a non-@Nullable @Provides method");
        return setSingleton;
    }
}
