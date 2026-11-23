package p007c.p190n.p194b.p266d.p333n;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.b.d.n.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4768b0 implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC4781i f24670f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4766a0 f24671g;

    public RunnableC4768b0(C4766a0 c4766a0, AbstractC4781i abstractC4781i) {
        this.f24671g = c4766a0;
        this.f24670f = abstractC4781i;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC4781i abstractC4781iMo5192a = this.f24671g.f24668b.mo5192a((TResult) this.f24670f.mo10937j());
            if (abstractC4781iMo5192a == null) {
                C4766a0 c4766a0 = this.f24671g;
                c4766a0.f24669c.m10943p(new NullPointerException("Continuation returned null"));
            } else {
                Executor executor = C4783k.f24685b;
                abstractC4781iMo5192a.mo10932e(executor, this.f24671g);
                abstractC4781iMo5192a.mo10931d(executor, this.f24671g);
                abstractC4781iMo5192a.mo10928a(executor, this.f24671g);
            }
        } catch (C4777g e) {
            if (!(e.getCause() instanceof Exception)) {
                this.f24671g.f24669c.m10943p(e);
                return;
            }
            C4766a0 c4766a1 = this.f24671g;
            c4766a1.f24669c.m10943p((Exception) e.getCause());
        } catch (CancellationException unused) {
            this.f24671g.f24669c.m10945r();
        } catch (Exception e2) {
            this.f24671g.f24669c.m10943p(e2);
        }
    }
}
