package p007c.p190n.p194b.p266d.p333n;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: c.n.b.d.n.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4780h0 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4778g0 f24681f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Callable f24682g;

    public RunnableC4780h0(C4778g0 c4778g0, Callable callable) {
        this.f24681f = c4778g0;
        this.f24682g = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f24681f.m10944q(this.f24682g.call());
        } catch (Exception e) {
            this.f24681f.m10943p(e);
        }
    }
}
