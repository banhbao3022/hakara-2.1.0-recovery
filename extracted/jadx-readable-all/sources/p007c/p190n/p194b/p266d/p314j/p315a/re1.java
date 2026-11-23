package p007c.p190n.p194b.p266d.p314j.p315a;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class re1<R> implements ik1 {

    /* JADX INFO: renamed from: a */
    public final kf1<R> f18754a;

    /* JADX INFO: renamed from: b */
    public final mf1 f18755b;

    /* JADX INFO: renamed from: c */
    public final ew2 f18756c;

    /* JADX INFO: renamed from: d */
    public final String f18757d;

    /* JADX INFO: renamed from: e */
    public final Executor f18758e;

    /* JADX INFO: renamed from: f */
    public final qw2 f18759f;

    /* JADX INFO: renamed from: g */
    public final wj1 f18760g;

    public re1(kf1<R> kf1Var, mf1 mf1Var, ew2 ew2Var, String str, Executor executor, qw2 qw2Var, wj1 wj1Var) {
        this.f18754a = kf1Var;
        this.f18755b = mf1Var;
        this.f18756c = ew2Var;
        this.f18757d = str;
        this.f18758e = executor;
        this.f18759f = qw2Var;
        this.f18760g = wj1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ik1
    /* JADX INFO: renamed from: a */
    public final wj1 mo7273a() {
        return this.f18760g;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ik1
    /* JADX INFO: renamed from: b */
    public final ik1 mo7274b() {
        return new re1(this.f18754a, this.f18755b, this.f18756c, this.f18757d, this.f18758e, this.f18759f, this.f18760g);
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.ik1
    public final Executor zza() {
        return this.f18758e;
    }
}
