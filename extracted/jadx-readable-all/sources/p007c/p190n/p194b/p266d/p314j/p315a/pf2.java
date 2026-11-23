package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class pf2 extends xf2 {

    /* JADX INFO: renamed from: h */
    public final StackTraceElement[] f17968h;

    public pf2(pe2 pe2Var, String str, String str2, go0 go0Var, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(pe2Var, "sGTEC3E7f6YjHctdRy2hflBi3Pvsr/R7GPdiuAlLlHS4kSSM9HZZPJI60ut1Fh4f", "QQzVaaiH4oNrSQ4TH/x6dUQomR0+m9ZNGD4A6aa+nps=", go0Var, i, 45);
        this.f17968h = stackTraceElementArr;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xf2
    /* JADX INFO: renamed from: a */
    public final void mo5770a() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.f17968h;
        if (stackTraceElementArr != null) {
            ge2 ge2Var = new ge2((String) this.f21526e.invoke(null, stackTraceElementArr));
            synchronized (this.f21525d) {
                go0 go0Var = this.f21525d;
                long jLongValue = ge2Var.f14547b.longValue();
                if (go0Var.f13191h) {
                    go0Var.m6298m();
                    go0Var.f13191h = false;
                }
                f31.m6724K((f31) go0Var.f13190g, jLongValue);
                if (ge2Var.f14548c.booleanValue()) {
                    go0 go0Var2 = this.f21525d;
                    hd1 hd1Var = ge2Var.f14549d.booleanValue() ? hd1.ENUM_FALSE : hd1.ENUM_TRUE;
                    if (go0Var2.f13191h) {
                        go0Var2.m6298m();
                        go0Var2.f13191h = false;
                    }
                    f31.m6732S((f31) go0Var2.f13190g, hd1Var);
                } else {
                    go0 go0Var3 = this.f21525d;
                    hd1 hd1Var2 = hd1.ENUM_FAILURE;
                    if (go0Var3.f13191h) {
                        go0Var3.m6298m();
                        go0Var3.f13191h = false;
                    }
                    f31.m6732S((f31) go0Var3.f13190g, hd1Var2);
                }
            }
        }
    }
}
