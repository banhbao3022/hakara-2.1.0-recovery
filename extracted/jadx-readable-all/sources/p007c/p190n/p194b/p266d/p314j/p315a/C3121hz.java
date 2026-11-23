package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.n.b.d.j.a.hz */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3121hz implements zc2<Set<bc0<ip2>>> {

    /* JADX INFO: renamed from: a */
    public final gd2<C3787zy> f15053a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f15054b;

    /* JADX INFO: renamed from: c */
    public final gd2<JSONObject> f15055c;

    public C3121hz(gd2<C3787zy> gd2Var, gd2<Executor> gd2Var2, gd2<JSONObject> gd2Var3) {
        this.f15053a = gd2Var;
        this.f15054b = gd2Var2;
        this.f15055c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        C3787zy c3787zyMo4613a = this.f15053a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        Set setEmptySet = this.f15055c.mo4613a() == null ? Collections.emptySet() : Collections.singleton(new bc0(c3787zyMo4613a, lv1Var));
        Objects.requireNonNull(setEmptySet, "Cannot return null from a non-@Nullable @Provides method");
        return setEmptySet;
    }
}
