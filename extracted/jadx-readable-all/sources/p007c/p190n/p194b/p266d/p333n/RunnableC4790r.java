package p007c.p190n.p194b.p266d.p333n;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: c.n.b.d.n.r */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4790r implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC4781i f24704f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4789q f24705g;

    public RunnableC4790r(C4789q c4789q, AbstractC4781i abstractC4781i) {
        this.f24705g = c4789q;
        this.f24704f = abstractC4781i;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            AbstractC4781i abstractC4781i = (AbstractC4781i) this.f24705g.f24702b.mo5191a((AbstractC4781i<TResult>) this.f24704f);
            if (abstractC4781i == null) {
                C4789q c4789q = this.f24705g;
                c4789q.f24703c.m10943p(new NullPointerException("Continuation returned null"));
            } else {
                Executor executor = C4783k.f24685b;
                abstractC4781i.mo10932e(executor, this.f24705g);
                abstractC4781i.mo10931d(executor, this.f24705g);
                abstractC4781i.mo10928a(executor, this.f24705g);
            }
        } catch (C4777g e) {
            if (e.getCause() instanceof Exception) {
                this.f24705g.f24703c.m10943p((Exception) e.getCause());
            } else {
                this.f24705g.f24703c.m10943p(e);
            }
        } catch (Exception e2) {
            this.f24705g.f24703c.m10943p(e2);
        }
    }
}
