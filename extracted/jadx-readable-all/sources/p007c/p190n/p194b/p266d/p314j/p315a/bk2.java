package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class bk2 implements yj2 {

    /* JADX INFO: renamed from: a */
    public final do2 f12718a;

    /* JADX INFO: renamed from: b */
    public final int f12719b;

    /* JADX INFO: renamed from: c */
    public final int f12720c;

    /* JADX INFO: renamed from: d */
    public int f12721d;

    /* JADX INFO: renamed from: e */
    public int f12722e;

    public bk2(vj2 vj2Var) {
        do2 do2Var = vj2Var.f20809P0;
        this.f12718a = do2Var;
        do2Var.m6389f(12);
        this.f12720c = do2Var.m6397n() & 255;
        this.f12719b = do2Var.m6397n();
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.yj2
    /* JADX INFO: renamed from: a */
    public final int mo5821a() {
        int i = this.f12720c;
        if (i == 8) {
            return this.f12718a.m6392i();
        }
        if (i == 16) {
            return this.f12718a.m6393j();
        }
        int i2 = this.f12721d;
        this.f12721d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f12722e & 15;
        }
        int iM6392i = this.f12718a.m6392i();
        this.f12722e = iM6392i;
        return (iM6392i & 240) >> 4;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.yj2
    /* JADX INFO: renamed from: b */
    public final boolean mo5822b() {
        return false;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.yj2
    public final int zza() {
        return this.f12719b;
    }
}
