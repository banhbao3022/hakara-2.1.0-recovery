package p007c.p190n.p194b.p266d.p314j.p315a;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class vn0 implements zc2<Set<bc0<zl1>>> {

    /* JADX INFO: renamed from: a */
    public final gd2<String> f20863a;

    /* JADX INFO: renamed from: b */
    public final gd2<Context> f20864b;

    /* JADX INFO: renamed from: c */
    public final gd2<Executor> f20865c;

    /* JADX INFO: renamed from: d */
    public final gd2<Map<rl1, xn0>> f20866d;

    public vn0(gd2<String> gd2Var, gd2<Context> gd2Var2, gd2<Executor> gd2Var3, gd2<Map<rl1, xn0>> gd2Var4) {
        this.f20863a = gd2Var;
        this.f20864b = gd2Var2;
        this.f20865c = gd2Var3;
        this.f20866d = gd2Var4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        Set setEmptySet;
        final String str = ((mc1) this.f20863a).f16718a.f15140a.f18302m;
        Objects.requireNonNull(str, "Cannot return null from a non-@Nullable @Provides method");
        Context contextM8156b = ((C3412pu) this.f20864b).m8156b();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        Map mapMo4613a = ((bd2) this.f20866d).mo4613a();
        if (((Boolean) C2862b.f12493a.f12496d.m6596a(C3052g3.f14223L2)).booleanValue()) {
            as2 as2Var = new as2(new ds2(contextM8156b));
            as2Var.m5846b(new zr2(str) { // from class: c.n.b.d.j.a.wn0

                /* JADX INFO: renamed from: a */
                public final String f21266a;

                {
                    this.f21266a = str;
                }

                @Override // p007c.p190n.p194b.p266d.p314j.p315a.zr2
                /* JADX INFO: renamed from: a */
                public final void mo6684a(mt2 mt2Var) {
                    String str2 = this.f21266a;
                    if (mt2Var.f13191h) {
                        mt2Var.m6298m();
                        mt2Var.f13191h = false;
                    }
                    ot2.m8056B((ot2) mt2Var.f13190g, str2);
                }
            });
            setEmptySet = Collections.singleton(new bc0(new yn0(as2Var, mapMo4613a), lv1Var));
        } else {
            setEmptySet = Collections.emptySet();
        }
        Objects.requireNonNull(setEmptySet, "Cannot return null from a non-@Nullable @Provides method");
        return setEmptySet;
    }
}
