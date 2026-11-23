package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.b.d.j.a.su */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3523su implements zc2<Set<bc0<pb0>>> {

    /* JADX INFO: renamed from: a */
    public final gd2<bv0> f19699a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f19700b;

    public C3523su(gd2<bv0> gd2Var, gd2<Executor> gd2Var2) {
        this.f19699a = gd2Var;
        this.f19700b = gd2Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x003b  */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        Set setEmptySet;
        bv0 bv0VarMo4613a = this.f19699a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        AbstractC3718y2<Boolean> abstractC3718y2 = C3052g3.f14354g1;
        C2862b c2862b = C2862b.f12493a;
        if (((Boolean) c2862b.f12496d.m6596a(abstractC3718y2)).booleanValue()) {
            if (((Boolean) c2862b.f12496d.m6596a(C3052g3.f14351f5)).booleanValue()) {
                setEmptySet = Collections.singleton(new bc0(bv0VarMo4613a, lv1Var));
            } else {
                setEmptySet = Collections.emptySet();
            }
        } else {
            setEmptySet = Collections.emptySet();
        }
        Objects.requireNonNull(setEmptySet, "Cannot return null from a non-@Nullable @Provides method");
        return setEmptySet;
    }
}
