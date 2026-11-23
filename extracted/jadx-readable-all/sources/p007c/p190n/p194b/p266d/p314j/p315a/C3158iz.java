package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p007c.p190n.p194b.p266d.p267a.p282z.p283a.InterfaceC2235r;

/* JADX INFO: renamed from: c.n.b.d.j.a.iz */
/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3158iz implements zc2<Set<bc0<InterfaceC2235r>>> {

    /* JADX INFO: renamed from: a */
    public final gd2<C3787zy> f15420a;

    /* JADX INFO: renamed from: b */
    public final gd2<Executor> f15421b;

    /* JADX INFO: renamed from: c */
    public final gd2<JSONObject> f15422c;

    public C3158iz(gd2<C3787zy> gd2Var, gd2<Executor> gd2Var2, gd2<JSONObject> gd2Var3) {
        this.f15420a = gd2Var;
        this.f15421b = gd2Var2;
        this.f15422c = gd2Var3;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.gd2
    /* JADX INFO: renamed from: a */
    public final Object mo4613a() {
        C3787zy c3787zyMo4613a = this.f15420a.mo4613a();
        lv1 lv1Var = C2962do.f13330a;
        Objects.requireNonNull(lv1Var, "Cannot return null from a non-@Nullable @Provides method");
        Set setEmptySet = this.f15422c.mo4613a() == null ? Collections.emptySet() : Collections.singleton(new bc0(c3787zyMo4613a, lv1Var));
        Objects.requireNonNull(setEmptySet, "Cannot return null from a non-@Nullable @Provides method");
        return setEmptySet;
    }
}
