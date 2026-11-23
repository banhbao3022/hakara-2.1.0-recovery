package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class od0 implements zc2<Set<bc0<ge0>>> {

    /* JADX INFO: renamed from: a */
    public final gd2<ge0> f17597a;

    public od0(gd2<ge0> gd2Var) {
        this.f17597a = gd2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        Set setSingleton = Collections.singleton(new bc0(this.f17597a.mo4613a(), C2962do.f13335f));
        Objects.requireNonNull(setSingleton, "Cannot return null from a non-@Nullable @Provides method");
        return setSingleton;
    }
}
