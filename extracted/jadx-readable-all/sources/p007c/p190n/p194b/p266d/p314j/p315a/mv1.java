package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mv1 implements Executor {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Executor f16942f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ du1 f16943g;

    public mv1(Executor executor, du1 du1Var) {
        this.f16942f = executor;
        this.f16943g = du1Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f16942f.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.f16943g.mo6532m(e);
        }
    }
}
