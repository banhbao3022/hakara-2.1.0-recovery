package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xf2 implements Callable {

    /* JADX INFO: renamed from: a */
    public final pe2 f21522a;

    /* JADX INFO: renamed from: b */
    public final String f21523b;

    /* JADX INFO: renamed from: c */
    public final String f21524c;

    /* JADX INFO: renamed from: d */
    public final go0 f21525d;

    /* JADX INFO: renamed from: e */
    public Method f21526e;

    /* JADX INFO: renamed from: f */
    public final int f21527f;

    /* JADX INFO: renamed from: g */
    public final int f21528g;

    public xf2(pe2 pe2Var, String str, String str2, go0 go0Var, int i, int i2) {
        getClass().getSimpleName();
        this.f21522a = pe2Var;
        this.f21523b = str;
        this.f21524c = str2;
        this.f21525d = go0Var;
        this.f21527f = i;
        this.f21528g = i2;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo5770a() throws IllegalAccessException, InvocationTargetException;

    /* JADX INFO: renamed from: b */
    public Void mo6356b() throws Exception {
        int i;
        try {
            long jNanoTime = System.nanoTime();
            Method methodM8111c = this.f21522a.m8111c(this.f21523b, this.f21524c);
            this.f21526e = methodM8111c;
            if (methodM8111c == null) {
                return null;
            }
            mo5770a();
            va2 va2Var = this.f21522a.f17958m;
            if (va2Var != null && (i = this.f21527f) != Integer.MIN_VALUE) {
                va2Var.m8542a(this.f21528g, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        mo6356b();
        return null;
    }
}
