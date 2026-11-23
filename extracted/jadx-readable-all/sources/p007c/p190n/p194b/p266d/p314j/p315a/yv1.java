package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yv1<V> extends yu1<V> implements RunnableFuture<V> {

    /* JADX INFO: renamed from: m */
    public volatile jv1<?> f22115m;

    public yv1(pu1<V> pu1Var) {
        this.f22115m = new wv1(this, pu1Var);
    }

    /* JADX INFO: renamed from: g */
    public final String m8834g() {
        jv1<?> jv1Var = this.f22115m;
        if (jv1Var == null) {
            return super.mo6527g();
        }
        String strValueOf = String.valueOf(jv1Var);
        return outline.m1552C(new StringBuilder(strValueOf.length() + 7), "task=[", strValueOf, "]");
    }

    /* JADX INFO: renamed from: i */
    public final void m8835i() {
        jv1<?> jv1Var;
        if (m6530k() && (jv1Var = this.f22115m) != null) {
            jv1Var.m7405e();
        }
        this.f22115m = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        jv1<?> jv1Var = this.f22115m;
        if (jv1Var != null) {
            jv1Var.run();
        }
        this.f22115m = null;
    }

    public yv1(Callable<V> callable) {
        this.f22115m = new xv1(this, callable);
    }
}
