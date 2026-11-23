package p526i1.p530b.p531a;

/* JADX INFO: renamed from: i1.b.a.k, reason: use source file name */
/* JADX INFO: compiled from: PendingPostQueue.java */
/* JADX INFO: loaded from: classes2.dex */
public final class PendingPostQueue {

    /* JADX INFO: renamed from: a */
    public PendingPost f30833a;

    /* JADX INFO: renamed from: b */
    public PendingPost f30834b;

    /* JADX INFO: renamed from: a */
    public synchronized void m13825a(PendingPost pendingPost) {
        PendingPost pendingPost2 = this.f30834b;
        if (pendingPost2 != null) {
            pendingPost2.f30832d = pendingPost;
            this.f30834b = pendingPost;
        } else {
            if (this.f30833a != null) {
                throw new IllegalStateException("Head present, but no tail");
            }
            this.f30834b = pendingPost;
            this.f30833a = pendingPost;
        }
        notifyAll();
    }

    /* JADX INFO: renamed from: b */
    public synchronized PendingPost m13826b() {
        PendingPost pendingPost;
        pendingPost = this.f30833a;
        if (pendingPost != null) {
            PendingPost pendingPost2 = pendingPost.f30832d;
            this.f30833a = pendingPost2;
            if (pendingPost2 == null) {
                this.f30834b = null;
            }
        }
        return pendingPost;
    }
}
