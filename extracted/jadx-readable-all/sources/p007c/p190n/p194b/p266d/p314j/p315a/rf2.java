package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class rf2 extends xf2 {

    /* JADX INFO: renamed from: h */
    public final ve2 f18766h;

    /* JADX INFO: renamed from: i */
    public long f18767i;

    public rf2(pe2 pe2Var, String str, String str2, go0 go0Var, int i, int i2, ve2 ve2Var) {
        super(pe2Var, "dsBT0/C86X4nvrUnBzUMEal+ojVYRI4vej5Xuqa9imNJ0J9pVwFR29C2xyAk2Th3", "9lTHSJcuaKoP0vq0QstvDSkZiAsCy7DV03ujHiOCPWw=", go0Var, i, 53);
        this.f18766h = ve2Var;
        if (ve2Var != null) {
            this.f18767i = ve2Var.m8548c();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xf2
    /* JADX INFO: renamed from: a */
    public final void mo5770a() throws IllegalAccessException, InvocationTargetException {
        if (this.f18766h != null) {
            go0 go0Var = this.f21525d;
            long jLongValue = ((Long) this.f21526e.invoke(null, Long.valueOf(this.f18767i))).longValue();
            if (go0Var.f13191h) {
                go0Var.m6298m();
                go0Var.f13191h = false;
            }
            f31.m6731R((f31) go0Var.f13190g, jLongValue);
        }
    }
}
