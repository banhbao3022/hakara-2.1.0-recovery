package p007c.p190n.p194b.p266d.p314j.p315a;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nt2 extends Thread {

    /* JADX INFO: renamed from: f */
    public final BlockingQueue<AbstractC3679x0<?>> f17269f;

    /* JADX INFO: renamed from: g */
    public final ps2 f17270g;

    /* JADX INFO: renamed from: h */
    public final gk2 f17271h;

    /* JADX INFO: renamed from: i */
    public volatile boolean f17272i = false;

    /* JADX INFO: renamed from: j */
    public final vq2 f17273j;

    /* JADX WARN: Multi-variable type inference failed */
    public nt2(BlockingQueue blockingQueue, BlockingQueue<AbstractC3679x0<?>> blockingQueue2, ps2 ps2Var, gk2 gk2Var, vq2 vq2Var) {
        this.f17269f = blockingQueue;
        this.f17270g = blockingQueue2;
        this.f17271h = ps2Var;
        this.f17273j = gk2Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m7936a() throws InterruptedException {
        AbstractC3679x0<?> abstractC3679x0Take = this.f17269f.take();
        SystemClock.elapsedRealtime();
        abstractC3679x0Take.m8704j(3);
        try {
            abstractC3679x0Take.m8702f("network-queue-take");
            abstractC3679x0Take.m8706m();
            TrafficStats.setThreadStatsTag(abstractC3679x0Take.f21406i);
            lv2 lv2VarMo4798a = this.f17270g.mo4798a(abstractC3679x0Take);
            abstractC3679x0Take.m8702f("network-http-complete");
            if (lv2VarMo4798a.f16620e && abstractC3679x0Take.m8708v()) {
                abstractC3679x0Take.m8703h("not-modified");
                abstractC3679x0Take.m8710z();
                return;
            }
            C3092h6<?> c3092h6Mo4728w = abstractC3679x0Take.mo4728w(lv2VarMo4798a);
            abstractC3679x0Take.m8702f("network-parse-complete");
            if (c3092h6Mo4728w.f14768b != null) {
                ((C3328nk) this.f17271h).m7878b(abstractC3679x0Take.m8705l(), c3092h6Mo4728w.f14768b);
                abstractC3679x0Take.m8702f("network-cache-written");
            }
            abstractC3679x0Take.m8707u();
            this.f17273j.m8585a(abstractC3679x0Take, c3092h6Mo4728w, null);
            abstractC3679x0Take.m8709y(c3092h6Mo4728w);
        } catch (C2872b9 e) {
            SystemClock.elapsedRealtime();
            this.f17273j.m8586b(abstractC3679x0Take, e);
            abstractC3679x0Take.m8710z();
        } catch (Exception e2) {
            Log.e("Volley", C3282mb.m7683d("Unhandled exception %s", e2.toString()), e2);
            C2872b9 c2872b9 = new C2872b9(e2);
            SystemClock.elapsedRealtime();
            this.f17273j.m8586b(abstractC3679x0Take, c2872b9);
            abstractC3679x0Take.m8710z();
        } finally {
            abstractC3679x0Take.m8704j(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m7936a();
            } catch (InterruptedException unused) {
                if (this.f17272i) {
                    Thread.currentThread().interrupt();
                    return;
                }
                C3282mb.m7682c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
