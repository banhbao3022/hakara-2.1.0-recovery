package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class bf2 extends xf2 {

    /* JADX INFO: renamed from: h */
    public static volatile Long f12595h;

    /* JADX INFO: renamed from: i */
    public static final Object f12596i = new Object();

    public bf2(pe2 pe2Var, String str, String str2, go0 go0Var, int i, int i2) {
        super(pe2Var, "a8WVEEgQUuRlHEL8p7VCnMYz1L5wp12p5V6BuvGYOX9cH77Etpv1p/6pnJhm6Sng", "KN0/uDtqy2OEMEK3fD3bi0yvaWvEIDu4SPEHxOLonhI=", go0Var, i, 44);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xf2
    /* JADX INFO: renamed from: a */
    public final void mo5770a() throws IllegalAccessException, InvocationTargetException {
        if (f12595h == null) {
            synchronized (f12596i) {
                if (f12595h == null) {
                    f12595h = (Long) this.f21526e.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f21525d) {
            try {
                go0 go0Var = this.f21525d;
                long jLongValue = f12595h.longValue();
                if (go0Var.f13191h) {
                    go0Var.m6298m();
                    go0Var.f13191h = false;
                }
                f31.m6723J((f31) go0Var.f13190g, jLongValue);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
