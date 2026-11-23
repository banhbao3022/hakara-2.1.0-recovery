package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class wi1<T> {

    /* JADX INFO: renamed from: a */
    public final Deque<kv1<T>> f21133a = new LinkedBlockingDeque();

    /* JADX INFO: renamed from: b */
    public final Callable<T> f21134b;

    /* JADX INFO: renamed from: c */
    public final lv1 f21135c;

    public wi1(Callable<T> callable, lv1 lv1Var) {
        this.f21134b = callable;
        this.f21135c = lv1Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m8651a(int i) {
        int size = i - this.f21133a.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f21133a.add(this.f21135c.mo6691u0(this.f21134b));
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized kv1<T> m8652b() {
        m8651a(1);
        return this.f21133a.poll();
    }
}
