package p526i1.p530b.p531a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* JADX INFO: renamed from: i1.b.a.f, reason: use source file name */
/* JADX INFO: compiled from: HandlerPoster.java */
/* JADX INFO: loaded from: classes2.dex */
public class HandlerPoster extends Handler implements Poster {

    /* JADX INFO: renamed from: f */
    public final PendingPostQueue f30823f;

    /* JADX INFO: renamed from: g */
    public final int f30824g;

    /* JADX INFO: renamed from: h */
    public final EventBus3 f30825h;

    /* JADX INFO: renamed from: i */
    public boolean f30826i;

    public HandlerPoster(EventBus3 eventBus3, Looper looper, int i) {
        super(looper);
        this.f30825h = eventBus3;
        this.f30824g = i;
        this.f30823f = new PendingPostQueue();
    }

    @Override // p526i1.p530b.p531a.Poster
    /* JADX INFO: renamed from: a */
    public void mo13808a(Subscription subscription, Object obj) {
        PendingPost pendingPostM13824a = PendingPost.m13824a(subscription, obj);
        synchronized (this) {
            this.f30823f.m13825a(pendingPostM13824a);
            if (!this.f30826i) {
                this.f30826i = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            do {
                PendingPost pendingPostM13826b = this.f30823f.m13826b();
                if (pendingPostM13826b == null) {
                    synchronized (this) {
                        pendingPostM13826b = this.f30823f.m13826b();
                        if (pendingPostM13826b == null) {
                            this.f30826i = false;
                            this.f30826i = false;
                            return;
                        }
                    }
                }
                this.f30825h.m13811c(pendingPostM13826b);
            } while (SystemClock.uptimeMillis() - jUptimeMillis < this.f30824g);
            if (!sendMessage(obtainMessage())) {
                throw new EventBusException("Could not send handler message");
            }
            this.f30826i = true;
        } catch (Throwable th) {
            this.f30826i = false;
            throw th;
        }
    }
}
