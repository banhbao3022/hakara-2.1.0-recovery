package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fd0 implements zc2<Set<bc0<r90>>> {

    /* JADX INFO: renamed from: a */
    public final gd2<i50> f14016a;

    public fd0(cd0 cd0Var, gd2<i50> gd2Var) {
        this.f14016a = gd2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        Set setSingleton = Collections.singleton(new bc0(this.f14016a.mo4613a(), C2962do.f13335f));
        Objects.requireNonNull(setSingleton, "Cannot return null from a non-@Nullable @Provides method");
        return setSingleton;
    }
}
