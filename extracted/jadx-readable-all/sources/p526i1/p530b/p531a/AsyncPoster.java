package p526i1.p530b.p531a;

/* JADX INFO: renamed from: i1.b.a.a, reason: use source file name */
/* JADX INFO: compiled from: AsyncPoster.java */
/* JADX INFO: loaded from: classes2.dex */
public class AsyncPoster implements Runnable, Poster {

    /* JADX INFO: renamed from: f */
    public final PendingPostQueue f30793f = new PendingPostQueue();

    /* JADX INFO: renamed from: g */
    public final EventBus3 f30794g;

    public AsyncPoster(EventBus3 eventBus3) {
        this.f30794g = eventBus3;
    }

    @Override // p526i1.p530b.p531a.Poster
    /* JADX INFO: renamed from: a */
    public void mo13808a(Subscription subscription, Object obj) {
        this.f30793f.m13825a(PendingPost.m13824a(subscription, obj));
        this.f30794g.f30810m.execute(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost pendingPostM13826b = this.f30793f.m13826b();
        if (pendingPostM13826b == null) {
            throw new IllegalStateException("No pending post available");
        }
        this.f30794g.m13811c(pendingPostM13826b);
    }
}
