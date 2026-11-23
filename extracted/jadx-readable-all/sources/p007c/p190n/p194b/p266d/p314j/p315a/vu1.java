package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class vu1<V> extends ku1<Object, V> {

    /* JADX INFO: renamed from: u */
    public tu1<?> f20947u;

    public vu1(qs1<? extends kv1<?>> qs1Var, boolean z, Executor executor, Callable<V> callable) {
        super(qs1Var, z, false);
        this.f20947u = new tu1(this, callable, executor);
        m7558y();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ku1
    /* JADX INFO: renamed from: A */
    public final void mo7553A(int i, @NullableDecl Object obj) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ku1
    /* JADX INFO: renamed from: B */
    public final void mo7554B() {
        tu1<?> tu1Var = this.f20947u;
        if (tu1Var != null) {
            try {
                tu1Var.f19988i.execute(tu1Var);
            } catch (RejectedExecutionException e) {
                tu1Var.f19989j.mo6532m(e);
            }
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.du1
    /* JADX INFO: renamed from: j */
    public final void mo6529j() {
        tu1<?> tu1Var = this.f20947u;
        if (tu1Var != null) {
            tu1Var.m7405e();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ku1
    /* JADX INFO: renamed from: t */
    public final void mo7555t(int i) {
        this.f16040r = null;
        if (i == 1) {
            this.f20947u = null;
        }
    }
}
