package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fv1<V> {

    /* JADX INFO: renamed from: a */
    public final boolean f14119a;

    /* JADX INFO: renamed from: b */
    public final ts1<kv1<? extends V>> f14120b;

    public /* synthetic */ fv1(boolean z, ts1 ts1Var) {
        this.f14119a = z;
        this.f14120b = ts1Var;
    }

    /* JADX INFO: renamed from: a */
    public final <C> kv1<C> m6889a(Callable<C> callable, Executor executor) {
        return new vu1(this.f14120b, this.f14119a, executor, callable);
    }
}
