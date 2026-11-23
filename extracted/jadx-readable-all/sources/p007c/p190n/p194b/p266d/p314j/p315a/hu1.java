package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hu1<I, O, F, T> extends yu1<O> implements Runnable {

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ int f15018m = 0;

    /* JADX INFO: renamed from: n */
    @NullableDecl
    public kv1<? extends I> f15019n;

    /* JADX INFO: renamed from: o */
    @NullableDecl
    public F f15020o;

    public hu1(kv1<? extends I> kv1Var, F f) {
        Objects.requireNonNull(kv1Var);
        this.f15019n = kv1Var;
        Objects.requireNonNull(f);
        this.f15020o = f;
    }

    /* JADX INFO: renamed from: g */
    public final String m7175g() {
        String strM1552C;
        kv1<? extends I> kv1Var = this.f15019n;
        F f = this.f15020o;
        String strMo6527g = super.mo6527g();
        if (kv1Var != null) {
            String strValueOf = String.valueOf(kv1Var);
            strM1552C = outline.m1552C(new StringBuilder(strValueOf.length() + 16), "inputFuture=[", strValueOf, "], ");
        } else {
            strM1552C = "";
        }
        if (f != null) {
            String strValueOf2 = String.valueOf(f);
            return outline.m1553D(new StringBuilder(String.valueOf(strM1552C).length() + 11 + strValueOf2.length()), strM1552C, "function=[", strValueOf2, "]");
        }
        if (strMo6527g == null) {
            return null;
        }
        String strValueOf3 = String.valueOf(strM1552C);
        return strMo6527g.length() != 0 ? strValueOf3.concat(strMo6527g) : new String(strValueOf3);
    }

    /* JADX INFO: renamed from: i */
    public final void m7176i() {
        m6534o(this.f15019n);
        this.f15019n = null;
        this.f15020o = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        kv1<? extends I> kv1Var = this.f15019n;
        F f = this.f15020o;
        if (((this.f13393j instanceof tt1) | (kv1Var == null)) || (f == null)) {
            return;
        }
        this.f15019n = null;
        if (kv1Var.isCancelled()) {
            m6533n(kv1Var);
            return;
        }
        try {
            try {
                Object objMo6861u = mo6861u(f, cw0.m6254x(kv1Var));
                this.f15020o = null;
                mo6860t(objMo6861u);
            } catch (Throwable th) {
                try {
                    mo6532m(th);
                } finally {
                    this.f15020o = null;
                }
            }
        } catch (Error e) {
            mo6532m(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e2) {
            mo6532m(e2);
        } catch (ExecutionException e3) {
            mo6532m(e3.getCause());
        }
    }

    /* JADX INFO: renamed from: t */
    public abstract void mo6860t(@NullableDecl T t);

    @NullableDecl
    /* JADX INFO: renamed from: u */
    public abstract T mo6861u(F f, @NullableDecl I i) throws Exception;
}
