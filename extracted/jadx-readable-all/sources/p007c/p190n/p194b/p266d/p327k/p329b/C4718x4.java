package p007c.p190n.p194b.p266d.p327k.p329b;

import android.os.Process;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: c.n.b.d.k.b.x4 */
/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4718x4 extends Thread {

    /* JADX INFO: renamed from: f */
    public final Object f24573f;

    /* JADX INFO: renamed from: g */
    public final BlockingQueue<C4685u4<?>> f24574g;

    /* JADX INFO: renamed from: h */
    public boolean f24575h = false;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C4674t4 f24576i;

    public C4718x4(C4674t4 c4674t4, String str, BlockingQueue<C4685u4<?>> blockingQueue) {
        this.f24576i = c4674t4;
        Objects.requireNonNull(str, "null reference");
        Objects.requireNonNull(blockingQueue, "null reference");
        this.f24573f = new Object();
        this.f24574g = blockingQueue;
        setName(str);
    }

    /* JADX INFO: renamed from: a */
    public final void m10848a(InterruptedException interruptedException) {
        this.f24576i.mo10684l().f24421i.m10812b(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }

    /* JADX INFO: renamed from: b */
    public final void m10849b() {
        synchronized (this.f24576i.f24446j) {
            if (!this.f24575h) {
                this.f24576i.f24447k.release();
                this.f24576i.f24446j.notifyAll();
                C4674t4 c4674t4 = this.f24576i;
                if (this == c4674t4.f24440d) {
                    c4674t4.f24440d = null;
                } else if (this == c4674t4.f24441e) {
                    c4674t4.f24441e = null;
                } else {
                    c4674t4.mo10684l().f24418f.m10811a("Current scheduler thread is neither worker nor network");
                }
                this.f24575h = true;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.f24576i.f24447k.acquire();
                z = true;
            } catch (InterruptedException e) {
                m10848a(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                C4685u4<?> c4685u4Poll = this.f24574g.poll();
                if (c4685u4Poll == null) {
                    synchronized (this.f24573f) {
                        if (this.f24574g.peek() == null) {
                            C4674t4 c4674t4 = this.f24576i;
                            AtomicLong atomicLong = C4674t4.f24439c;
                            Objects.requireNonNull(c4674t4);
                            try {
                                this.f24573f.wait(30000L);
                            } catch (InterruptedException e2) {
                                m10848a(e2);
                            }
                        }
                    }
                    synchronized (this.f24576i.f24446j) {
                        if (this.f24574g.peek() == null) {
                            break;
                        }
                    }
                } else {
                    Process.setThreadPriority(c4685u4Poll.f24473g ? threadPriority : 10);
                    c4685u4Poll.run();
                }
            }
            if (this.f24576i.f24476a.f24534h.m10417k(C4647r.f24372r0)) {
                m10849b();
            }
            m10849b();
        } catch (Throwable th) {
            m10849b();
            throw th;
        }
    }
}
