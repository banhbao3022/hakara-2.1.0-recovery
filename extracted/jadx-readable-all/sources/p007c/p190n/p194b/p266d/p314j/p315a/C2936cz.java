package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: renamed from: c.n.b.d.j.a.cz */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2936cz implements zc2<Set<bc0<a70>>> {

    /* JADX INFO: renamed from: a */
    public final gd2<C3787zy> f13152a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f13153b;

    /* JADX INFO: renamed from: c */
    public final gd2<JSONObject> f13154c;

    public C2936cz(gd2<C3787zy> gd2Var, gd2<Executor> gd2Var2, gd2<JSONObject> gd2Var3) {
        this.f13152a = gd2Var;
        this.f13153b = gd2Var2;
        this.f13154c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        C3787zy c3787zyMo4613a = this.f13152a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        Set setEmptySet = this.f13154c.mo4613a() == null ? Collections.emptySet() : Collections.singleton(new bc0(c3787zyMo4613a, lv1Var));
        Objects.requireNonNull(setEmptySet, "Cannot return null from a non-@Nullable @Provides method");
        return setEmptySet;
    }
}
