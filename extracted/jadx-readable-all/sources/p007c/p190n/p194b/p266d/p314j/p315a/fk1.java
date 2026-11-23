package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class fk1 implements dv1<vj1> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jk1 f14048a;

    public fk1(jk1 jk1Var) {
        this.f14048a = jk1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: a */
    public final void mo4616a(Throwable th) {
        synchronized (this.f14048a) {
            this.f14048a.f15608c.mo6532m(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p007c.p190n.p194b.p266d.p314j.p315a.dv1
    /* JADX INFO: renamed from: b */
    public final void mo4617b(vj1 vj1Var) {
        vj1 vj1Var2 = vj1Var;
        synchronized (this.f14048a) {
            vj1Var2.f20805a = ((me1) ((qe1) this.f14048a.f15611f).f18262a).f16736a.mo7141b();
            jk1 jk1Var = this.f14048a;
            if (jk1Var.f15614i != 2) {
                ((oj1) jk1Var.f15610e).m8035a(jk1Var.f15607b.mo7273a(), vj1Var2);
            }
            jk1 jk1Var2 = this.f14048a;
            if (jk1Var2.f15614i == 1) {
                jk1Var2.m7356a(jk1Var2.f15607b);
            }
            jk1 jk1Var3 = this.f14048a;
            jk1Var3.f15614i = 1;
            jk1Var3.f15608c.mo6531l((vj1<AdT>) vj1Var2);
        }
    }
}
