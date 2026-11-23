package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class cf2 extends xf2 {

    /* JADX INFO: renamed from: h */
    public final long f12997h;

    public cf2(pe2 pe2Var, String str, String str2, go0 go0Var, long j2, int i, int i2) {
        super(pe2Var, "Fy+0MnOblzKutA61AaguuQzqgSFwAYgIkg1Nv1jjUsad/m9fCPRM59z2VYO0D4ud", "I4PnVaadHpMjKRcaJl2eH2r6C+XiARMRngguwqwgirg=", go0Var, i, 25);
        this.f12997h = j2;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xf2
    /* JADX INFO: renamed from: a */
    public final void mo5770a() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.f21526e.invoke(null, new Object[0])).longValue();
        synchronized (this.f21525d) {
            try {
                go0 go0Var = this.f21525d;
                if (go0Var.f13191h) {
                    go0Var.m6298m();
                    go0Var.f13191h = false;
                }
                f31.m6748j0((f31) go0Var.f13190g, jLongValue);
                long j2 = this.f12997h;
                if (j2 != 0) {
                    go0 go0Var2 = this.f21525d;
                    long j3 = jLongValue - j2;
                    if (go0Var2.f13191h) {
                        go0Var2.m6298m();
                        go0Var2.f13191h = false;
                    }
                    f31.m6715E0((f31) go0Var2.f13190g, j3);
                    go0 go0Var3 = this.f21525d;
                    long j4 = this.f12997h;
                    if (go0Var3.f13191h) {
                        go0Var3.m6298m();
                        go0Var3.f13191h = false;
                    }
                    f31.m6721H0((f31) go0Var3.f13190g, j4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
