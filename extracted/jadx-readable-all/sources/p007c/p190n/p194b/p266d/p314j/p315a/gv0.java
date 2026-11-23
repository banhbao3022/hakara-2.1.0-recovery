package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class gv0 implements zl1 {

    /* JADX INFO: renamed from: f */
    public final Map<rl1, String> f14682f = new HashMap();

    /* JADX INFO: renamed from: g */
    public final Map<rl1, String> f14683g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final hm1 f14684h;

    public gv0(Set<fv0> set, hm1 hm1Var) {
        this.f14684h = hm1Var;
        for (fv0 fv0Var : set) {
            this.f14682f.put(fv0Var.f14117a, "ttc");
            this.f14683g.put(fv0Var.f14118b, "ttc");
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl1
    /* JADX INFO: renamed from: A */
    public final void mo7032A(rl1 rl1Var, String str, Throwable th) {
        hm1 hm1Var = this.f14684h;
        String strValueOf = String.valueOf(str);
        hm1Var.m7146c(strValueOf.length() != 0 ? "task.".concat(strValueOf) : new String("task."), "f.");
        if (this.f14683g.containsKey(rl1Var)) {
            hm1 hm1Var2 = this.f14684h;
            String strValueOf2 = String.valueOf(this.f14683g.get(rl1Var));
            hm1Var2.m7146c(strValueOf2.length() != 0 ? "label.".concat(strValueOf2) : new String("label."), "f.");
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl1
    /* JADX INFO: renamed from: F */
    public final void mo7033F(rl1 rl1Var, String str) {
        hm1 hm1Var = this.f14684h;
        String strValueOf = String.valueOf(str);
        hm1Var.m7146c(strValueOf.length() != 0 ? "task.".concat(strValueOf) : new String("task."), "s.");
        if (this.f14683g.containsKey(rl1Var)) {
            hm1 hm1Var2 = this.f14684h;
            String strValueOf2 = String.valueOf(this.f14683g.get(rl1Var));
            hm1Var2.m7146c(strValueOf2.length() != 0 ? "label.".concat(strValueOf2) : new String("label."), "s.");
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl1
    /* JADX INFO: renamed from: n */
    public final void mo7034n(rl1 rl1Var, String str) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl1
    /* JADX INFO: renamed from: p */
    public final void mo7035p(rl1 rl1Var, String str) {
        hm1 hm1Var = this.f14684h;
        String strValueOf = String.valueOf(str);
        hm1Var.m7145b(strValueOf.length() != 0 ? "task.".concat(strValueOf) : new String("task."));
        if (this.f14682f.containsKey(rl1Var)) {
            hm1 hm1Var2 = this.f14684h;
            String strValueOf2 = String.valueOf(this.f14682f.get(rl1Var));
            hm1Var2.m7145b(strValueOf2.length() != 0 ? "label.".concat(strValueOf2) : new String("label."));
        }
    }
}
