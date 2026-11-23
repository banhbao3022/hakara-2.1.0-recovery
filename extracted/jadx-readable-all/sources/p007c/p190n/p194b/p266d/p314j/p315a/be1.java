package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class be1 implements w41<h00> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ce1 f12574a;

    public be1(ce1 ce1Var) {
        this.f12574a = ce1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w41
    /* JADX INFO: renamed from: b */
    public final void mo5986b(h00 h00Var) {
        h00 h00Var2 = h00Var;
        synchronized (this.f12574a) {
            h00 h00Var3 = this.f12574a.f12992n;
            if (h00Var3 != null) {
                h00Var3.mo7041b();
            }
            ce1 ce1Var = this.f12574a;
            ce1Var.f12992n = h00Var2;
            InterfaceC3410ps interfaceC3410ps = h00Var2.f14711i;
            if (interfaceC3410ps != null) {
                interfaceC3410ps.mo6517z0(ce1Var);
            }
            ud1 ud1Var = this.f12574a.f12989k;
            ce1 ce1Var2 = this.f12574a;
            ud1Var.m8483b(new i00(h00Var2, ce1Var2, ce1Var2.f12989k));
            h00Var2.mo7653a();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w41
    public final void zza() {
        synchronized (this.f12574a) {
            this.f12574a.f12992n = null;
        }
    }
}
