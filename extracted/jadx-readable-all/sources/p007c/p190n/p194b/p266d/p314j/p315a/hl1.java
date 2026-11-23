package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class hl1 {

    /* JADX INFO: renamed from: a */
    public final Object f14902a;

    /* JADX INFO: renamed from: b */
    public final List<kv1<?>> f14903b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pl1 f14904c;

    public /* synthetic */ hl1(pl1 pl1Var, Object obj, List list) {
        this.f14904c = pl1Var;
        this.f14902a = obj;
        this.f14903b = list;
    }

    /* JADX INFO: renamed from: a */
    public final <O> ol1<O> m7143a(Callable<O> callable) {
        fv1 fv1VarM6252v = cw0.m6252v(this.f14903b);
        kv1 kv1VarM6889a = fv1VarM6252v.m6889a(gl1.f14610a, C2962do.f13335f);
        pl1 pl1Var = this.f14904c;
        return new ol1<>(pl1Var, this.f14902a, kv1VarM6889a, this.f14903b, fv1VarM6252v.m6889a(callable, pl1Var.f18025b));
    }
}
