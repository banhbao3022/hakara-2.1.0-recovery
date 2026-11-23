package p007c.p190n.p194b.p266d.p333n;

/* JADX INFO: renamed from: c.n.b.d.n.p */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC4788p implements Runnable {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC4781i f24699f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4787o f24700g;

    public RunnableC4788p(C4787o c4787o, AbstractC4781i abstractC4781i) {
        this.f24700g = c4787o;
        this.f24699f = abstractC4781i;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        if (this.f24699f.mo10939l()) {
            this.f24700g.f24698c.m10945r();
            return;
        }
        try {
            this.f24700g.f24698c.m10944q((TContinuationResult) this.f24700g.f24697b.mo5191a((AbstractC4781i<TResult>) this.f24699f));
        } catch (C4777g e) {
            if (e.getCause() instanceof Exception) {
                this.f24700g.f24698c.m10943p((Exception) e.getCause());
            } else {
                this.f24700g.f24698c.m10943p(e);
            }
        } catch (Exception e2) {
            this.f24700g.f24698c.m10943p(e2);
        }
    }
}
