package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class lm1 implements im1 {

    /* JADX INFO: renamed from: a */
    public final im1 f16401a;

    /* JADX INFO: renamed from: b */
    public final Queue<hm1> f16402b = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: c */
    public final int f16403c;

    /* JADX INFO: renamed from: d */
    public final AtomicBoolean f16404d;

    public lm1(im1 im1Var, ScheduledExecutorService scheduledExecutorService) {
        this.f16401a = im1Var;
        AbstractC3718y2<Integer> abstractC3718y2 = C3052g3.f14372i5;
        C2862b c2862b = C2862b.f12493a;
        this.f16403c = ((Integer) c2862b.f12496d.m6596a(abstractC3718y2)).intValue();
        this.f16404d = new AtomicBoolean(false);
        long jIntValue = ((Integer) c2862b.f12496d.m6596a(C3052g3.f14365h5)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable(this) { // from class: c.n.b.d.j.a.km1

            /* JADX INFO: renamed from: f */
            public final lm1 f15981f;

            {
                this.f15981f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                lm1 lm1Var = this.f15981f;
                while (!lm1Var.f16402b.isEmpty()) {
                    lm1Var.f16401a.mo7280b(lm1Var.f16402b.remove());
                }
            }
        }, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.im1
    /* JADX INFO: renamed from: a */
    public final String mo7279a(hm1 hm1Var) {
        return this.f16401a.mo7279a(hm1Var);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.im1
    /* JADX INFO: renamed from: b */
    public final void mo7280b(hm1 hm1Var) {
        if (this.f16402b.size() < this.f16403c) {
            this.f16402b.offer(hm1Var);
            return;
        }
        if (this.f16404d.getAndSet(true)) {
            return;
        }
        Queue<hm1> queue = this.f16402b;
        hm1 hm1VarM7144a = hm1.m7144a("dropped_event");
        HashMap map = (HashMap) hm1Var.m7149f();
        if (map.containsKey("action")) {
            hm1VarM7144a.f14911a.put("dropped_action", (String) map.get("action"));
        }
        queue.offer(hm1VarM7144a);
    }
}
