package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ku1<InputT, OutputT> extends ou1<OutputT> {

    /* JADX INFO: renamed from: q */
    public static final Logger f16039q = Logger.getLogger(ku1.class.getName());

    /* JADX INFO: renamed from: r */
    @NullableDecl
    public qs1<? extends kv1<? extends InputT>> f16040r;

    /* JADX INFO: renamed from: s */
    public final boolean f16041s;

    /* JADX INFO: renamed from: t */
    public final boolean f16042t;

    public ku1(qs1<? extends kv1<? extends InputT>> qs1Var, boolean z, boolean z2) {
        super(qs1Var.size());
        this.f16040r = qs1Var;
        this.f16041s = z;
        this.f16042t = z2;
    }

    /* JADX INFO: renamed from: s */
    public static void m7550s(ku1 ku1Var, qs1 qs1Var) {
        Objects.requireNonNull(ku1Var);
        int iMo7646b = ou1.f17737m.mo7646b(ku1Var);
        if (iMo7646b < 0) {
            throw new IllegalStateException("Less than 0 remaining futures");
        }
        if (iMo7646b == 0) {
            if (qs1Var != null) {
                kt1 it = qs1Var.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Future<? extends InputT> future = (Future) it.next();
                    if (!future.isCancelled()) {
                        ku1Var.m7557w(i, future);
                    }
                    i++;
                }
            }
            ku1Var.f17739o = null;
            ku1Var.mo7554B();
            ku1Var.mo7555t(2);
        }
    }

    /* JADX INFO: renamed from: v */
    public static void m7551v(Throwable th) {
        f16039q.logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* JADX INFO: renamed from: x */
    public static boolean m7552x(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo7553A(int i, @NullableDecl InputT inputt);

    /* JADX INFO: renamed from: B */
    public abstract void mo7554B();

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.du1
    /* JADX INFO: renamed from: g */
    public final String mo6527g() {
        qs1<? extends kv1<? extends InputT>> qs1Var = this.f16040r;
        if (qs1Var == null) {
            return super.mo6527g();
        }
        String strValueOf = String.valueOf(qs1Var);
        return outline.m1550A(new StringBuilder(strValueOf.length() + 8), "futures=", strValueOf);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.du1
    /* JADX INFO: renamed from: i */
    public final void mo6528i() {
        qs1<? extends kv1<? extends InputT>> qs1Var = this.f16040r;
        mo7555t(1);
        if ((qs1Var != null) && (this.f13393j instanceof tt1)) {
            boolean zM6530k = m6530k();
            kt1<? extends kv1<? extends InputT>> it = qs1Var.iterator();
            while (it.hasNext()) {
                it.next().cancel(zM6530k);
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public void mo7555t(int i) {
        this.f16040r = null;
    }

    /* JADX INFO: renamed from: u */
    public final void m7556u(Throwable th) {
        Objects.requireNonNull(th);
        if (this.f16041s && !mo6532m(th)) {
            Set<Throwable> set = this.f17739o;
            if (set == null) {
                Set<Throwable> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                m7559z(setNewSetFromMap);
                ou1.f17737m.mo7645a(this, null, setNewSetFromMap);
                set = this.f17739o;
            }
            if (m7552x(set, th)) {
                m7551v(th);
                return;
            }
        }
        if (th instanceof Error) {
            m7551v(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public final void m7557w(int i, Future<? extends InputT> future) {
        try {
            mo7553A(i, cw0.m6254x(future));
        } catch (ExecutionException e) {
            m7556u(e.getCause());
        } catch (Throwable th) {
            m7556u(th);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m7558y() {
        wu1 wu1Var = wu1.INSTANCE;
        if (this.f16040r.isEmpty()) {
            mo7554B();
            return;
        }
        if (!this.f16041s) {
            ju1 ju1Var = new ju1(this, this.f16042t ? this.f16040r : null);
            kt1<? extends kv1<? extends InputT>> it = this.f16040r.iterator();
            while (it.hasNext()) {
                it.next().mo6230f(ju1Var, wu1Var);
            }
            return;
        }
        kt1<? extends kv1<? extends InputT>> it2 = this.f16040r.iterator();
        int i = 0;
        while (it2.hasNext()) {
            kv1<? extends InputT> next = it2.next();
            next.mo6230f(new iu1(this, next, i), wu1Var);
            i++;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m7559z(Set<Throwable> set) {
        Objects.requireNonNull(set);
        if (this.f13393j instanceof tt1) {
            return;
        }
        m7552x(set, mo5869a());
    }
}
