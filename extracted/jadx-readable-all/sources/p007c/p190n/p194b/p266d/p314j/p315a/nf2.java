package p007c.p190n.p194b.p266d.p314j.p315a;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class nf2 extends xf2 {

    /* JADX INFO: renamed from: h */
    public List<Long> f17090h;

    public nf2(pe2 pe2Var, String str, String str2, go0 go0Var, int i, int i2) {
        super(pe2Var, "01WVlVdbgqf6HoqKu0lbNygNbv+PeABTWOhn2U9poUmT5M2s6ThNH6tyerCKZPnK", "Ez0nM00ERfZLMPX0zqZ/JlTWlq6o9myQL/+TGyXV+Nc=", go0Var, i, 31);
        this.f17090h = null;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.xf2
    /* JADX INFO: renamed from: a */
    public final void mo5770a() throws IllegalAccessException, InvocationTargetException {
        go0 go0Var = this.f21525d;
        if (go0Var.f13191h) {
            go0Var.m6298m();
            go0Var.f13191h = false;
        }
        f31.m6759y((f31) go0Var.f13190g, -1L);
        go0 go0Var2 = this.f21525d;
        if (go0Var2.f13191h) {
            go0Var2.m6298m();
            go0Var2.f13191h = false;
        }
        f31.m6761z((f31) go0Var2.f13190g, -1L);
        if (this.f17090h == null) {
            this.f17090h = (List) this.f21526e.invoke(null, this.f21522a.f17947b);
        }
        List<Long> list = this.f17090h;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.f21525d) {
            go0 go0Var3 = this.f21525d;
            long jLongValue = this.f17090h.get(0).longValue();
            if (go0Var3.f13191h) {
                go0Var3.m6298m();
                go0Var3.f13191h = false;
            }
            f31.m6759y((f31) go0Var3.f13190g, jLongValue);
            go0 go0Var4 = this.f21525d;
            long jLongValue2 = this.f17090h.get(1).longValue();
            if (go0Var4.f13191h) {
                go0Var4.m6298m();
                go0Var4.f13191h = false;
            }
            f31.m6761z((f31) go0Var4.f13190g, jLongValue2);
        }
    }
}
