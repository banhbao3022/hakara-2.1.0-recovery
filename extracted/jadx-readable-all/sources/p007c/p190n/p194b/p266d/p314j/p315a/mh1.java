package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class mh1 implements w41<dl0> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oh1 f16760a;

    public mh1(oh1 oh1Var) {
        this.f16760a = oh1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w41
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo5986b(dl0 dl0Var) {
        dl0 dl0Var2 = dl0Var;
        synchronized (this.f16760a) {
            this.f16760a.f17621i = dl0Var2;
            dl0Var2.mo7653a();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w41
    public final void zza() {
        synchronized (this.f16760a) {
            this.f16760a.f17621i = null;
        }
    }
}
