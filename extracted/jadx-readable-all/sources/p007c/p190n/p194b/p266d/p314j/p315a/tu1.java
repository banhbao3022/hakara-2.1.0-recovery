package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class tu1 extends jv1 {

    /* JADX INFO: renamed from: i */
    public final Executor f19988i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ vu1 f19989j;

    /* JADX INFO: renamed from: k */
    public final Callable f19990k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ vu1 f19991l;

    public tu1(vu1 vu1Var, Callable callable, Executor executor) {
        this.f19991l = vu1Var;
        this.f19989j = vu1Var;
        Objects.requireNonNull(executor);
        this.f19988i = executor;
        Objects.requireNonNull(callable);
        this.f19990k = callable;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jv1
    /* JADX INFO: renamed from: a */
    public final Object mo7401a() throws Exception {
        return this.f19990k.call();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jv1
    /* JADX INFO: renamed from: b */
    public final String mo7402b() {
        return this.f19990k.toString();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jv1
    /* JADX INFO: renamed from: c */
    public final boolean mo7403c() {
        return this.f19989j.isDone();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.jv1
    /* JADX INFO: renamed from: d */
    public final void mo7404d(Object obj, Throwable th) {
        vu1 vu1Var = this.f19989j;
        vu1Var.f20947u = null;
        if (th == null) {
            this.f19991l.mo6531l(obj);
            return;
        }
        if (th instanceof ExecutionException) {
            vu1Var.mo6532m(th.getCause());
        } else if (th instanceof CancellationException) {
            vu1Var.cancel(false);
        } else {
            vu1Var.mo6532m(th);
        }
    }
}
