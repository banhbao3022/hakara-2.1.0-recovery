package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ev1<V> implements Runnable {

    /* JADX INFO: renamed from: f */
    public final Future<V> f13705f;

    /* JADX INFO: renamed from: g */
    public final dv1<? super V> f13706g;

    public ev1(Future<V> future, dv1<? super V> dv1Var) {
        this.f13705f = future;
        this.f13706g = dv1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable thMo5869a;
        Future<V> future = this.f13705f;
        if ((future instanceof aw1) && (thMo5869a = ((aw1) future).mo5869a()) != null) {
            this.f13706g.mo4616a(thMo5869a);
            return;
        }
        try {
            this.f13706g.mo4617b(cw0.m6254x(this.f13705f));
        } catch (Error e) {
            e = e;
            this.f13706g.mo4616a(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.f13706g.mo4616a(e);
        } catch (ExecutionException e3) {
            this.f13706g.mo4616a(e3.getCause());
        }
    }

    public final String toString() {
        es1 es1Var = new es1(ev1.class.getSimpleName());
        dv1<? super V> dv1Var = this.f13706g;
        ds1 ds1Var = new ds1();
        es1Var.f13685d.f13375b = ds1Var;
        es1Var.f13685d = ds1Var;
        ds1Var.f13374a = dv1Var;
        return es1Var.toString();
    }
}
