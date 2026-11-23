package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class yn0 implements zl1 {

    /* JADX INFO: renamed from: f */
    public final Map<rl1, xn0> f21929f;

    /* JADX INFO: renamed from: g */
    public final as2 f21930g;

    public yn0(as2 as2Var, Map<rl1, xn0> map) {
        this.f21929f = map;
        this.f21930g = as2Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl1
    /* JADX INFO: renamed from: A */
    public final void mo7032A(rl1 rl1Var, String str, Throwable th) {
        if (this.f21929f.containsKey(rl1Var)) {
            this.f21930g.m5845a(this.f21929f.get(rl1Var).f21622c);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl1
    /* JADX INFO: renamed from: F */
    public final void mo7033F(rl1 rl1Var, String str) {
        if (this.f21929f.containsKey(rl1Var)) {
            this.f21930g.m5845a(this.f21929f.get(rl1Var).f21621b);
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl1
    /* JADX INFO: renamed from: n */
    public final void mo7034n(rl1 rl1Var, String str) {
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.zl1
    /* JADX INFO: renamed from: p */
    public final void mo7035p(rl1 rl1Var, String str) {
        if (this.f21929f.containsKey(rl1Var)) {
            this.f21930g.m5845a(this.f21929f.get(rl1Var).f21620a);
        }
    }
}
