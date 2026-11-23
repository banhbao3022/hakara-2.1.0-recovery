package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class re0 implements zc2<Set<String>> {

    /* JADX INFO: renamed from: a */
    public final gd2<mg0> f18753a;

    public re0(gd2<mg0> gd2Var) {
        this.f18753a = gd2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        Set setSingleton = ((pe0) this.f18753a).m8106b().f16751e != null ? Collections.singleton("banner") : Collections.emptySet();
        Objects.requireNonNull(setSingleton, "Cannot return null from a non-@Nullable @Provides method");
        return setSingleton;
    }
}
