package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class n31 implements w41<n00> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ o31 f17019a;

    public n31(o31 o31Var) {
        this.f17019a = o31Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w41
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo5986b(n00 n00Var) {
        n00 n00Var2 = n00Var;
        synchronized (this.f17019a) {
            n00 n00Var3 = this.f17019a.f17516l;
            if (n00Var3 != null) {
                n00Var3.mo7041b();
            }
            this.f17019a.f17516l = n00Var2;
            n00Var2.mo7653a();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w41
    public final void zza() {
        synchronized (this.f17019a) {
            this.f17019a.f17516l = null;
        }
    }
}
