package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.Throwable;
import p007c.p190n.p194b.p266d.p298f.C2622l;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class pt1<V, X extends Throwable> extends rt1<V, X, qu1<? super X, ? extends V>, kv1<? extends V>> {
    public pt1(kv1<? extends V> kv1Var, Class<X> cls, qu1<? super X, ? extends V> qu1Var) {
        super(kv1Var, cls, qu1Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rt1
    /* JADX INFO: renamed from: t */
    public final /* bridge */ /* synthetic */ void mo8154t(Object obj) {
        m6533n((kv1) obj);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.rt1
    /* JADX INFO: renamed from: u */
    public final /* bridge */ /* synthetic */ Object mo8155u(Object obj, Throwable th) throws Exception {
        qu1 qu1Var = (qu1) obj;
        kv1 kv1VarMo4612a = qu1Var.mo4612a(th);
        C2622l.m5427r2(kv1VarMo4612a, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", qu1Var);
        return kv1VarMo4612a;
    }
}
