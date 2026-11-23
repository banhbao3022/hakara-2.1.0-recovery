package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class jf2 extends xf2 {

    /* JADX INFO: renamed from: h */
    public static volatile String f15588h;

    /* JADX INFO: renamed from: i */
    public static final Object f15589i = new Object();

    public jf2(pe2 pe2Var, String str, String str2, go0 go0Var, int i, int i2) {
        super(pe2Var, "v7A3h9QqVCXIbrfyosHIukYh/yZv47yYSEhtQFNg8vHfmWE6VQ1je6L104nqsnjL", "8sE7Kp846pN8ghcm6jpvMxjTA1L8yxDG5/OLZ4fVnxc=", go0Var, i, 1);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xf2
    /* JADX INFO: renamed from: a */
    public final void mo5770a() throws IllegalAccessException, InvocationTargetException {
        go0 go0Var = this.f21525d;
        if (go0Var.f13191h) {
            go0Var.m6298m();
            go0Var.f13191h = false;
        }
        f31.m6753u0((f31) go0Var.f13190g, "E");
        if (f15588h == null) {
            synchronized (f15589i) {
                if (f15588h == null) {
                    f15588h = (String) this.f21526e.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f21525d) {
            go0 go0Var2 = this.f21525d;
            String str = f15588h;
            if (go0Var2.f13191h) {
                go0Var2.m6298m();
                go0Var2.f13191h = false;
            }
            f31.m6753u0((f31) go0Var2.f13190g, str);
        }
    }
}
