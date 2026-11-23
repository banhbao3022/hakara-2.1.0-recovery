package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class cp1 {

    /* JADX INFO: renamed from: a */
    public final BlockingQueue<Runnable> f13073a;

    /* JADX INFO: renamed from: b */
    public final ThreadPoolExecutor f13074b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque<bp1> f13075c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d */
    public bp1 f13076d = null;

    public cp1() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f13073a = linkedBlockingQueue;
        this.f13074b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    /* JADX INFO: renamed from: a */
    public final void m6219a(bp1 bp1Var) {
        bp1Var.f12766a = this;
        this.f13075c.add(bp1Var);
        if (this.f13076d == null) {
            m6220b();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m6220b() {
        bp1 bp1VarPoll = this.f13075c.poll();
        this.f13076d = bp1VarPoll;
        if (bp1VarPoll != null) {
            bp1VarPoll.executeOnExecutor(this.f13074b, new Object[0]);
        }
    }
}
