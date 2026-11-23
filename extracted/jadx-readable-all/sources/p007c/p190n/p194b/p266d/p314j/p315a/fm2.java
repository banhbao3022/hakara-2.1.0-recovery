package p007c.p190n.p194b.p266d.p314j.p315a;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fm2 extends Thread {

    /* JADX INFO: renamed from: f */
    public static final boolean f14059f = C3282mb.f16709a;

    /* JADX INFO: renamed from: g */
    public final BlockingQueue<AbstractC3679x0<?>> f14060g;

    /* JADX INFO: renamed from: h */
    public final BlockingQueue<AbstractC3679x0<?>> f14061h;

    /* JADX INFO: renamed from: i */
    public final gk2 f14062i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f14063j = false;

    /* JADX INFO: renamed from: k */
    public final C3283mc f14064k;

    /* JADX INFO: renamed from: l */
    public final vq2 f14065l;

    /* JADX WARN: Multi-variable type inference failed */
    public fm2(BlockingQueue blockingQueue, BlockingQueue<AbstractC3679x0<?>> blockingQueue2, BlockingQueue<AbstractC3679x0<?>> blockingQueue3, gk2 gk2Var, vq2 vq2Var) {
        this.f14060g = blockingQueue;
        this.f14061h = blockingQueue2;
        this.f14062i = blockingQueue3;
        this.f14065l = gk2Var;
        this.f14064k = new C3283mc(this, blockingQueue2, gk2Var, null);
    }

    /* JADX INFO: renamed from: a */
    public final void m6841a() throws InterruptedException {
        AbstractC3679x0<?> abstractC3679x0Take = this.f14060g.take();
        abstractC3679x0Take.m8702f("cache-queue-take");
        abstractC3679x0Take.m8704j(1);
        try {
            abstractC3679x0Take.m8706m();
            hj2 hj2VarM7877a = ((C3328nk) this.f14062i).m7877a(abstractC3679x0Take.m8705l());
            if (hj2VarM7877a == null) {
                abstractC3679x0Take.m8702f("cache-miss");
                if (!this.f14064k.m7689b(abstractC3679x0Take)) {
                    this.f14061h.put(abstractC3679x0Take);
                }
                abstractC3679x0Take.m8704j(2);
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (hj2VarM7877a.f14881e < jCurrentTimeMillis) {
                abstractC3679x0Take.m8702f("cache-hit-expired");
                abstractC3679x0Take.f21412o = hj2VarM7877a;
                if (!this.f14064k.m7689b(abstractC3679x0Take)) {
                    this.f14061h.put(abstractC3679x0Take);
                }
                abstractC3679x0Take.m8704j(2);
                return;
            }
            abstractC3679x0Take.m8702f("cache-hit");
            C3092h6<?> c3092h6Mo4728w = abstractC3679x0Take.mo4728w(new lv2(hj2VarM7877a.f14877a, hj2VarM7877a.f14883g));
            abstractC3679x0Take.m8702f("cache-hit-parsed");
            if (c3092h6Mo4728w.f14769c == null) {
                if (hj2VarM7877a.f14882f < jCurrentTimeMillis) {
                    abstractC3679x0Take.m8702f("cache-hit-refresh-needed");
                    abstractC3679x0Take.f21412o = hj2VarM7877a;
                    c3092h6Mo4728w.f14770d = true;
                    if (this.f14064k.m7689b(abstractC3679x0Take)) {
                        this.f14065l.m8585a(abstractC3679x0Take, c3092h6Mo4728w, null);
                    } else {
                        this.f14065l.m8585a(abstractC3679x0Take, c3092h6Mo4728w, new fl2(this, abstractC3679x0Take));
                    }
                } else {
                    this.f14065l.m8585a(abstractC3679x0Take, c3092h6Mo4728w, null);
                }
                abstractC3679x0Take.m8704j(2);
                return;
            }
            abstractC3679x0Take.m8702f("cache-parsing-failed");
            gk2 gk2Var = this.f14062i;
            String strM8705l = abstractC3679x0Take.m8705l();
            C3328nk c3328nk = (C3328nk) gk2Var;
            synchronized (c3328nk) {
                hj2 hj2VarM7877a2 = c3328nk.m7877a(strM8705l);
                if (hj2VarM7877a2 != null) {
                    hj2VarM7877a2.f14882f = 0L;
                    hj2VarM7877a2.f14881e = 0L;
                    c3328nk.m7878b(strM8705l, hj2VarM7877a2);
                }
            }
            abstractC3679x0Take.f21412o = null;
            if (!this.f14064k.m7689b(abstractC3679x0Take)) {
                this.f14061h.put(abstractC3679x0Take);
            }
            abstractC3679x0Take.m8704j(2);
        } catch (Throwable th) {
            abstractC3679x0Take.m8704j(2);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f14059f) {
            C3282mb.m7680a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        ((C3328nk) this.f14062i).m7879c();
        while (true) {
            try {
                m6841a();
            } catch (InterruptedException unused) {
                if (this.f14063j) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C3282mb.m7682c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
