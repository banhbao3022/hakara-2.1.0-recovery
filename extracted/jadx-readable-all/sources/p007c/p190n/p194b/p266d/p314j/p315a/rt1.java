package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.Throwable;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p007c.p071d.p078c.p079a.outline;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rt1<V, X extends Throwable, F, T> extends yu1<V> implements Runnable {

    /* JADX INFO: renamed from: m */
    @NullableDecl
    public kv1<? extends V> f19063m;

    /* JADX INFO: renamed from: n */
    @NullableDecl
    public Class<X> f19064n;

    /* JADX INFO: renamed from: o */
    @NullableDecl
    public F f19065o;

    public rt1(kv1<? extends V> kv1Var, Class<X> cls, F f) {
        Objects.requireNonNull(kv1Var);
        this.f19063m = kv1Var;
        this.f19064n = cls;
        Objects.requireNonNull(f);
        this.f19065o = f;
    }

    /* JADX INFO: renamed from: g */
    public final String m8323g() {
        String strM1552C;
        kv1<? extends V> kv1Var = this.f19063m;
        Class<X> cls = this.f19064n;
        F f = this.f19065o;
        String strMo6527g = super.mo6527g();
        if (kv1Var != null) {
            String strValueOf = String.valueOf(kv1Var);
            strM1552C = outline.m1552C(new StringBuilder(strValueOf.length() + 16), "inputFuture=[", strValueOf, "], ");
        } else {
            strM1552C = "";
        }
        if (cls == null || f == null) {
            if (strMo6527g == null) {
                return null;
            }
            String strValueOf2 = String.valueOf(strM1552C);
            return strMo6527g.length() != 0 ? strValueOf2.concat(strMo6527g) : new String(strValueOf2);
        }
        String strValueOf3 = String.valueOf(cls);
        String strValueOf4 = String.valueOf(f);
        StringBuilder sb = new StringBuilder(outline.m1578b(String.valueOf(strM1552C).length(), 29, strValueOf3.length(), strValueOf4.length()));
        outline.m1572W(sb, strM1552C, "exceptionType=[", strValueOf3, "], fallback=[");
        return outline.m1550A(sb, strValueOf4, "]");
    }

    /* JADX INFO: renamed from: i */
    public final void m8324i() {
        m6534o(this.f19063m);
        this.f19063m = null;
        this.f19064n = null;
        this.f19065o = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    public final void run() {
        Object objM6254x;
        kv1<? extends V> kv1Var = this.f19063m;
        Class<X> cls = this.f19064n;
        F f = this.f19065o;
        if (((f == null) || ((kv1Var == null) | (cls == null))) || (this.f13393j instanceof tt1)) {
            return;
        }
        ?? r3 = (Class<X>) null;
        this.f19063m = null;
        try {
            th = kv1Var instanceof aw1 ? ((aw1) kv1Var).mo5869a() : null;
            objM6254x = th == null ? cw0.m6254x(kv1Var) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(kv1Var.getClass());
                String strValueOf2 = String.valueOf(e.getClass());
                StringBuilder sb = new StringBuilder(strValueOf.length() + 35 + strValueOf2.length());
                outline.m1572W(sb, "Future type ", strValueOf, " threw ", strValueOf2);
                sb.append(" without a cause");
                cause = new NullPointerException(sb.toString());
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            mo6531l(objM6254x);
            return;
        }
        if (!cls.isInstance(th)) {
            m6533n(kv1Var);
            return;
        }
        try {
            Object objMo8155u = mo8155u(f, th);
            this.f19064n = null;
            this.f19065o = null;
            mo8154t(objMo8155u);
        } catch (Throwable th2) {
            try {
                mo6532m(th2);
            } finally {
                this.f19064n = null;
                this.f19065o = null;
            }
        }
    }

    /* JADX INFO: renamed from: t */
    public abstract void mo8154t(@NullableDecl T t);

    @NullableDecl
    /* JADX INFO: renamed from: u */
    public abstract T mo8155u(F f, X x) throws Exception;
}
