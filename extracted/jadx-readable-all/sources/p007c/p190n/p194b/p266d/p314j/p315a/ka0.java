package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ka0 implements zc2<k60> {

    /* JADX INFO: renamed from: a */
    public final ja0 f15904a;

    /* JADX INFO: renamed from: b */
    public final gd2<Set<bc0<l60>>> f15905b;

    public ka0(ja0 ja0Var, gd2<Set<bc0<l60>>> gd2Var) {
        this.f15904a = ja0Var;
        this.f15905b = gd2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        ja0 ja0Var = this.f15904a;
        Set setMo4613a = ((ed2) this.f15905b).mo4613a();
        if (ja0Var.f15530o == null) {
            ja0Var.f15530o = new k60(setMo4613a);
        }
        k60 k60Var = ja0Var.f15530o;
        Objects.requireNonNull(k60Var, "Cannot return null from a non-@Nullable @Provides method");
        return k60Var;
    }
}
