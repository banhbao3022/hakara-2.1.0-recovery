package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ef2 implements Callable {

    /* JADX INFO: renamed from: a */
    public final pe2 f13577a;

    /* JADX INFO: renamed from: b */
    public final go0 f13578b;

    public ef2(pe2 pe2Var, go0 go0Var) {
        this.f13577a = pe2Var;
        this.f13578b = go0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Exception {
        Future future = this.f13577a.f17957l;
        if (future != null) {
            future.get();
        }
        f31 f31Var = this.f13577a.f17956k;
        if (f31Var == null) {
            return null;
        }
        try {
            synchronized (this.f13578b) {
                try {
                    go0 go0Var = this.f13578b;
                    byte[] bArrMo7574w = f31Var.mo7574w();
                    go0Var.m6302q(bArrMo7574w, 0, bArrMo7574w.length, s72.m8347a());
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        } catch (r82 | NullPointerException unused) {
            return null;
        }
    }
}
