package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ak2 implements yj2 {

    /* JADX INFO: renamed from: a */
    public final int f12192a;

    /* JADX INFO: renamed from: b */
    public final int f12193b;

    /* JADX INFO: renamed from: c */
    public final do2 f12194c;

    public ak2(vj2 vj2Var) {
        do2 do2Var = vj2Var.f20809P0;
        this.f12194c = do2Var;
        do2Var.m6389f(12);
        this.f12192a = do2Var.m6397n();
        this.f12193b = do2Var.m6397n();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.yj2
    /* JADX INFO: renamed from: a */
    public final int mo5821a() {
        int i = this.f12192a;
        return i == 0 ? this.f12194c.m6397n() : i;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.yj2
    /* JADX INFO: renamed from: b */
    public final boolean mo5822b() {
        return this.f12192a != 0;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.yj2
    public final int zza() {
        return this.f12193b;
    }
}
