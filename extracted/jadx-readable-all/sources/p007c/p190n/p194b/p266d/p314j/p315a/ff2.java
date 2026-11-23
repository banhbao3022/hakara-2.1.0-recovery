package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ff2 extends xf2 {

    /* JADX INFO: renamed from: h */
    public static volatile Long f14031h;

    /* JADX INFO: renamed from: i */
    public static final Object f14032i = new Object();

    public ff2(pe2 pe2Var, String str, String str2, go0 go0Var, int i, int i2) {
        super(pe2Var, "fkf51aLEFXfiNurGHbx1BSH7msQozHZOJXYpsm8ziDxIsSol9uz7PMVXAs+R19N8", "cKfFcdJiOvmUtUL2Y5P/s8OlQJiCVurBpl7VcHQsb0I=", go0Var, i, 22);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xf2
    /* JADX INFO: renamed from: a */
    public final void mo5770a() throws IllegalAccessException, InvocationTargetException {
        if (f14031h == null) {
            synchronized (f14032i) {
                if (f14031h == null) {
                    f14031h = (Long) this.f21526e.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f21525d) {
            try {
                go0 go0Var = this.f21525d;
                long jLongValue = f14031h.longValue();
                if (go0Var.f13191h) {
                    go0Var.m6298m();
                    go0Var.f13191h = false;
                }
                f31.m6719G0((f31) go0Var.f13190g, jLongValue);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
