package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class of2 extends xf2 {

    /* JADX INFO: renamed from: h */
    public final boolean f17612h;

    public of2(pe2 pe2Var, String str, String str2, go0 go0Var, int i, int i2) {
        super(pe2Var, "XjijUwmXm7DyFf8ohwUhl/9yUgRUqxHQnI45c1t0y/YKbCSD+OaDQ73UKMg990Kz", "6/jwpsIwP7bZ+3d0h4XGdi00o4+iCHVraAq2DY8Q/Kk=", go0Var, i, 61);
        this.f17612h = pe2Var.f17963r.f14830a;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xf2
    /* JADX INFO: renamed from: a */
    public final void mo5770a() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.f21526e.invoke(null, this.f21522a.f17947b, Boolean.valueOf(this.f17612h))).longValue();
        synchronized (this.f21525d) {
            try {
                go0 go0Var = this.f21525d;
                if (go0Var.f13191h) {
                    go0Var.m6298m();
                    go0Var.f13191h = false;
                }
                f31.m6739a0((f31) go0Var.f13190g, jLongValue);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
