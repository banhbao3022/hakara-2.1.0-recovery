package p526i1.p530b.p531a;

import com.facebook.stetho.websocket.CloseCodes;
import java.util.logging.Level;

/* JADX INFO: renamed from: i1.b.a.b, reason: use source file name */
/* JADX INFO: compiled from: BackgroundPoster.java */
/* JADX INFO: loaded from: classes2.dex */
public final class BackgroundPoster implements Runnable, Poster {

    /* JADX INFO: renamed from: f */
    public final PendingPostQueue f30795f = new PendingPostQueue();

    /* JADX INFO: renamed from: g */
    public final EventBus3 f30796g;

    /* JADX INFO: renamed from: h */
    public volatile boolean f30797h;

    public BackgroundPoster(EventBus3 eventBus3) {
        this.f30796g = eventBus3;
    }

    @Override // p526i1.p530b.p531a.Poster
    /* JADX INFO: renamed from: a */
    public void mo13808a(Subscription subscription, Object obj) {
        PendingPost pendingPostM13824a = PendingPost.m13824a(subscription, obj);
        synchronized (this) {
            this.f30795f.m13825a(pendingPostM13824a);
            if (!this.f30797h) {
                this.f30797h = true;
                this.f30796g.f30810m.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        PendingPost pendingPostM13826b;
        while (true) {
            try {
                try {
                    PendingPostQueue pendingPostQueue = this.f30795f;
                    synchronized (pendingPostQueue) {
                        if (pendingPostQueue.f30833a == null) {
                            pendingPostQueue.wait(CloseCodes.NORMAL_CLOSURE);
                        }
                        pendingPostM13826b = pendingPostQueue.m13826b();
                    }
                    if (pendingPostM13826b == null) {
                        synchronized (this) {
                            pendingPostM13826b = this.f30795f.m13826b();
                            if (pendingPostM13826b == null) {
                                this.f30797h = false;
                                this.f30797h = false;
                                return;
                            }
                        }
                    }
                    this.f30796g.m13811c(pendingPostM13826b);
                } catch (InterruptedException e) {
                    this.f30796g.f30816s.mo13823b(Level.WARNING, Thread.currentThread().getName() + " was interruppted", e);
                    this.f30797h = false;
                    return;
                }
            } catch (Throwable th) {
                this.f30797h = false;
                throw th;
            }
        }
    }
}
