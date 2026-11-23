package p007c.p190n.p194b.p266d.p314j.p315a;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class jh1 implements w41<dl0> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ kh1 f15596a;

    public jh1(kh1 kh1Var) {
        this.f15596a = kh1Var;
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w41
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void mo5986b(dl0 dl0Var) {
        dl0 dl0Var2 = dl0Var;
        synchronized (this.f15596a) {
            this.f15596a.f15948l = dl0Var2;
            dl0Var2.mo7653a();
        }
    }

    @Override // p007c.p190n.p194b.p266d.p314j.p315a.w41
    public final void zza() {
        synchronized (this.f15596a) {
            this.f15596a.f15948l = null;
        }
    }
}
